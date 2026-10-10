package com.example.shopora.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
import com.example.shopora.ui.theme.ShoporaTheme

@Composable
fun ShoporaHomeScreen() {
    var selectedTab by remember { mutableStateOf(NavTab.HOME) }
    val scrollState = rememberScrollState()

    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                selectedTab = selectedTab,
                onTabSelected = { selectedTab = it }
            )
        },
        containerColor = Color.White
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color.White)
                .verticalScroll(scrollState)
        ) {
            // 1. Top Bar Header (Logo, Search, Badges, Profile)
            TopHeader()

            // 2. Free Delivery Banner (AUTO-APPLIED)
            FreeDeliveryBanner()

            // 3. Search Bar with Camera & Filter
            SearchBarSection()

            // 4. Category Circles Row
            CategorySection()

            // 5. Hero Banner (Find What You Love)
            HeroBannerSection()

            // 6. Flash Sale Countdown + Products
            FlashSaleSection()

            // 7. Curated Style Gradient Banner
            CuratedStyleBanner()

            // 8. Popular Highlights Grid
            PopularHighlightsSection()

            // 9. Why Millions Love Shopora Section
            WhyChooseUsSection()

            // 10. Get 10% Off Newsletter Section
            NewsletterSection()

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShoporaHomeScreenPreview() {
    ShoporaTheme {
        ShoporaHomeScreen()
    }
}
