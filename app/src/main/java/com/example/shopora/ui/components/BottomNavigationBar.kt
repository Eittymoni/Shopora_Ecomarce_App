package com.example.shopora.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopora.ui.icons.ShoporaIcons
import com.example.shopora.ui.theme.ShoporaCoral
import com.example.shopora.ui.theme.ShoporaPrimary

enum class NavTab {
    HOME, CATEGORIES, WISHLIST, CART, PROFILE
}

@Composable
fun BottomNavigationBar(
    selectedTab: NavTab = NavTab.HOME,
    onTabSelected: (NavTab) -> Unit = {},
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White)
            .navigationBarsPadding()
    ) {
        HorizontalDivider(thickness = 1.dp, color = Color(0xFFF3F4F6))

        NavigationBar(
            containerColor = Color.White,
            tonalElevation = 0.dp,
            modifier = Modifier.fillMaxWidth()
        ) {
            // Tab 1: Home
            NavigationBarItem(
                selected = selectedTab == NavTab.HOME,
                onClick = { onTabSelected(NavTab.HOME) },
                icon = {
                    Icon(
                        imageVector = ShoporaIcons.Home,
                        contentDescription = "Home"
                    )
                },
                label = {
                    Text(
                        text = "Home",
                        fontSize = 11.sp,
                        fontWeight = if (selectedTab == NavTab.HOME) FontWeight.Bold else FontWeight.Normal
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = ShoporaPrimary,
                    selectedTextColor = ShoporaPrimary,
                    indicatorColor = ShoporaPrimary.copy(alpha = 0.1f),
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray
                )
            )

            // Tab 2: Categories
            NavigationBarItem(
                selected = selectedTab == NavTab.CATEGORIES,
                onClick = { onTabSelected(NavTab.CATEGORIES) },
                icon = {
                    Icon(
                        imageVector = ShoporaIcons.GridView,
                        contentDescription = "Categories"
                    )
                },
                label = {
                    Text(
                        text = "Categories",
                        fontSize = 11.sp,
                        fontWeight = if (selectedTab == NavTab.CATEGORIES) FontWeight.Bold else FontWeight.Normal
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = ShoporaPrimary,
                    selectedTextColor = ShoporaPrimary,
                    indicatorColor = ShoporaPrimary.copy(alpha = 0.1f),
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray
                )
            )

            // Tab 3: Wishlist (with badge '2')
            NavigationBarItem(
                selected = selectedTab == NavTab.WISHLIST,
                onClick = { onTabSelected(NavTab.WISHLIST) },
                icon = {
                    BadgedBox(
                        badge = {
                            Badge(
                                containerColor = ShoporaCoral,
                                contentColor = Color.White
                            ) {
                                Text("2", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                    ) {
                        Icon(
                            imageVector = ShoporaIcons.FavoriteBorder,
                            contentDescription = "Wishlist"
                        )
                    }
                },
                label = {
                    Text(
                        text = "Wishlist",
                        fontSize = 11.sp,
                        fontWeight = if (selectedTab == NavTab.WISHLIST) FontWeight.Bold else FontWeight.Normal
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = ShoporaPrimary,
                    selectedTextColor = ShoporaPrimary,
                    indicatorColor = ShoporaPrimary.copy(alpha = 0.1f),
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray
                )
            )

            // Tab 4: Cart (with badge '3')
            NavigationBarItem(
                selected = selectedTab == NavTab.CART,
                onClick = { onTabSelected(NavTab.CART) },
                icon = {
                    BadgedBox(
                        badge = {
                            Badge(
                                containerColor = ShoporaPrimary,
                                contentColor = Color.White
                            ) {
                                Text("3", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                    ) {
                        Icon(
                            imageVector = ShoporaIcons.ShoppingBag,
                            contentDescription = "Cart"
                        )
                    }
                },
                label = {
                    Text(
                        text = "Cart",
                        fontSize = 11.sp,
                        fontWeight = if (selectedTab == NavTab.CART) FontWeight.Bold else FontWeight.Normal
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = ShoporaPrimary,
                    selectedTextColor = ShoporaPrimary,
                    indicatorColor = ShoporaPrimary.copy(alpha = 0.1f),
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray
                )
            )

            // Tab 5: Profile
            NavigationBarItem(
                selected = selectedTab == NavTab.PROFILE,
                onClick = { onTabSelected(NavTab.PROFILE) },
                icon = {
                    Icon(
                        imageVector = ShoporaIcons.Person,
                        contentDescription = "Profile"
                    )
                },
                label = {
                    Text(
                        text = "Profile",
                        fontSize = 11.sp,
                        fontWeight = if (selectedTab == NavTab.PROFILE) FontWeight.Bold else FontWeight.Normal
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = ShoporaPrimary,
                    selectedTextColor = ShoporaPrimary,
                    indicatorColor = ShoporaPrimary.copy(alpha = 0.1f),
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray
                )
            )
        }
    }
}
