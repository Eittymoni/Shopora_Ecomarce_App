package com.example.shopora.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shopora.data.model.Product
import com.example.shopora.ui.components.BottomNavigationBar
import com.example.shopora.ui.components.CategorySection
import com.example.shopora.ui.components.CuratedStyleBanner
import com.example.shopora.ui.components.FlashSaleSection
import com.example.shopora.ui.components.FreeDeliveryBanner
import com.example.shopora.ui.components.HeroBannerSection
import com.example.shopora.ui.components.NavTab
import com.example.shopora.ui.components.NewsletterSection
import com.example.shopora.ui.components.PopularHighlightsSection
import com.example.shopora.ui.components.SearchBarSection
import com.example.shopora.ui.components.TopHeader
import com.example.shopora.ui.components.WhyChooseUsSection
import com.example.shopora.ui.screens.CartScreen
import com.example.shopora.ui.screens.CategoriesScreen
import com.example.shopora.ui.screens.ProductDetailsScreen
import com.example.shopora.ui.screens.ProfileScreen
import com.example.shopora.ui.screens.WishlistScreen
import com.example.shopora.ui.theme.ShoporaTheme

@Composable
fun ShoporaHomeScreen(
    viewModel: ShoporaViewModel = remember { ShoporaViewModel() }
) {
    val selectedTab by viewModel.selectedTab.collectAsState()
    val wishlistIds by viewModel.wishlistIds.collectAsState()
    val wishlistProducts by viewModel.wishlistProducts.collectAsState()
    val cartItems by viewModel.cartItems.collectAsState()
    val totalCartCount by viewModel.totalCartItemCount.collectAsState()
    val cartSubtotal by viewModel.cartSubtotal.collectAsState()
    val deliveryFee by viewModel.deliveryFee.collectAsState()
    val cartTotal by viewModel.cartTotal.collectAsState()
    val selectedProduct by viewModel.selectedProduct.collectAsState()
    val selectedCategoryId by viewModel.selectedCategoryId.collectAsState()
    val userMessage by viewModel.userMessage.collectAsState()

    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(userMessage) {
        userMessage?.let { msg ->
            snackbarHostState.showSnackbar(msg)
            viewModel.clearUserMessage()
        }
    }

    if (selectedProduct != null) {
        ProductDetailsScreen(
            product = selectedProduct!!,
            isWishlisted = wishlistIds.contains(selectedProduct!!.id),
            onBackClicked = { viewModel.closeProductDetails() },
            onAddToCartClicked = { viewModel.addToCart(it) },
            onToggleWishlistClicked = { viewModel.toggleWishlist(it) }
        )
    } else {
        Scaffold(
            bottomBar = {
                BottomNavigationBar(
                    selectedTab = selectedTab,
                    onTabSelected = { viewModel.selectTab(it) }
                )
            },
            snackbarHost = { SnackbarHost(snackbarHostState) },
            containerColor = Color.White
        ) { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                when (selectedTab) {
                    NavTab.HOME -> HomeContent(
                        wishlistIds = wishlistIds,
                        cartCount = totalCartCount,
                        selectedCategoryId = selectedCategoryId,
                        onProductClicked = { viewModel.openProductDetails(it) },
                        onAddToCartClicked = { viewModel.addToCart(it) },
                        onToggleWishlistClicked = { viewModel.toggleWishlist(it) },
                        onCategorySelected = {
                            viewModel.selectCategory(it)
                            viewModel.selectTab(NavTab.CATEGORIES)
                        },
                        onViewAllClicked = {
                            viewModel.selectCategory("deals")
                            viewModel.selectTab(NavTab.CATEGORIES)
                        },
                        onSearchClicked = { viewModel.selectTab(NavTab.CATEGORIES) },
                        onCartClicked = { viewModel.selectTab(NavTab.CART) },
                        onProfileClicked = { viewModel.selectTab(NavTab.PROFILE) }
                    )

                    NavTab.CATEGORIES -> CategoriesScreen(
                        categories = viewModel.categories,
                        selectedCategoryId = selectedCategoryId,
                        products = viewModel.allProducts,
                        wishlistIds = wishlistIds,
                        onCategorySelected = { viewModel.selectCategory(it) },
                        onProductClicked = { viewModel.openProductDetails(it) },
                        onAddToCartClicked = { viewModel.addToCart(it) },
                        onToggleWishlistClicked = { viewModel.toggleWishlist(it) }
                    )

                    NavTab.WISHLIST -> WishlistScreen(
                        wishlistProducts = wishlistProducts,
                        onProductClicked = { viewModel.openProductDetails(it) },
                        onMoveToCartClicked = {
                            viewModel.addToCart(it)
                            viewModel.toggleWishlist(it)
                        },
                        onRemoveFromWishlistClicked = { viewModel.toggleWishlist(it) },
                        onExploreClicked = { viewModel.selectTab(NavTab.HOME) }
                    )

                    NavTab.CART -> CartScreen(
                        cartItems = cartItems,
                        subtotal = cartSubtotal,
                        deliveryFee = deliveryFee,
                        total = cartTotal,
                        onUpdateQuantity = { productId, delta -> viewModel.updateCartQuantity(productId, delta) },
                        onRemoveItem = { viewModel.removeFromCart(it) },
                        onShopNowClicked = { viewModel.selectTab(NavTab.HOME) }
                    )

                    NavTab.PROFILE -> ProfileScreen(
                        userProfile = viewModel.userProfile,
                        wishlistCount = wishlistIds.size,
                        cartCount = totalCartCount
                    )
                }
            }
        }
    }
}

@Composable
fun HomeContent(
    wishlistIds: Set<String>,
    cartCount: Int,
    selectedCategoryId: String,
    onProductClicked: (Product) -> Unit,
    onAddToCartClicked: (Product) -> Unit,
    onToggleWishlistClicked: (Product) -> Unit,
    onCategorySelected: (String) -> Unit,
    onViewAllClicked: () -> Unit,
    onSearchClicked: () -> Unit,
    onCartClicked: () -> Unit,
    onProfileClicked: () -> Unit
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(scrollState)
    ) {
        // 1. Top Bar Header
        TopHeader(
            cartCount = cartCount,
            onSearchClicked = onSearchClicked,
            onCartClicked = onCartClicked,
            onProfileClicked = onProfileClicked
        )

        // 2. Free Delivery Banner
        FreeDeliveryBanner()

        // 3. Search Bar
        SearchBarSection()

        // 4. Category Circles
        CategorySection(
            selectedCategoryId = selectedCategoryId,
            onCategorySelected = onCategorySelected
        )

        // 5. Hero Banner
        HeroBannerSection()

        // 6. Flash Sale
        FlashSaleSection(
            onProductClicked = onProductClicked,
            onAddToCartClicked = onAddToCartClicked
        )

        // 7. Curated Style Banner
        CuratedStyleBanner()

        // 8. Popular Highlights Grid
        PopularHighlightsSection(
            wishlistIds = wishlistIds,
            onProductClicked = onProductClicked,
            onAddToCartClicked = onAddToCartClicked,
            onToggleWishlistClicked = onToggleWishlistClicked,
            onViewAllClicked = onViewAllClicked
        )

        // 9. Why Choose Us Section
        WhyChooseUsSection()

        // 10. Newsletter Voucher Section
        NewsletterSection()

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShoporaHomeScreenPreview() {
    ShoporaTheme {
        ShoporaHomeScreen()
    }
}
