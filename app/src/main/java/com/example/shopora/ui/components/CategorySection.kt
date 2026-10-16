package com.example.shopora.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopora.data.model.Category
import com.example.shopora.ui.icons.ShoporaIcons
import com.example.shopora.ui.theme.ShoporaCoral

val sampleCategories = listOf(
    Category(
        id = "deals",
        name = "Deals",
        isDeals = true
    ),
    Category(
        id = "fashion",
        name = "Fashion",
        imageUrl = "https://images.unsplash.com/photo-1534528741775-53994a69daeb?w=300&q=80"
    ),
    Category(
        id = "beauty",
        name = "Beauty",
        imageUrl = "https://images.unsplash.com/photo-1556228720-195a672e8a03?w=300&q=80"
    ),
    Category(
        id = "electronics",
        name = "Electronics",
        imageUrl = "https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=300&q=80"
    ),
    Category(
        id = "home",
        name = "Home",
        imageUrl = "https://images.unsplash.com/photo-1581783342308-f792dbdd27c5?w=300&q=80"
    )
)

@Composable
fun CategorySection(
    categories: List<Category> = sampleCategories,
    selectedCategoryId: String = "deals",
    onCategorySelected: (String) -> Unit = {},
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier.padding(vertical = 8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(categories) { category ->
            CategoryCircleItem(
                category = category,
                isSelected = category.id == selectedCategoryId,
                onCategorySelected = { onCategorySelected(category.id) }
            )
        }
    }
}

@Composable
fun CategoryCircleItem(
    category: Category,
    isSelected: Boolean = false,
    onCategorySelected: () -> Unit = {}
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.clickable { onCategorySelected() }
    ) {
        Box(
            modifier = Modifier.size(68.dp),
            contentAlignment = Alignment.Center
        ) {
            if (category.isDeals) {
                // Special Deals Circle with border + flame icon + % badge
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                        .border(2.dp, ShoporaCoral, CircleShape)
                        .background(Color.White),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = ShoporaIcons.Whatshot,
                        contentDescription = "Deals",
                        tint = ShoporaCoral,
                        modifier = Modifier.size(32.dp)
                    )
                }
                // % Badge at bottom right of circle
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .offset(x = (-2).dp, y = (-2).dp)
                        .size(20.dp)
                        .clip(CircleShape)
                        .background(ShoporaCoral),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "%",
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                }
            } else {
                // Category Image Circle
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFF3F4F6)),
                    contentAlignment = Alignment.Center
                ) {
                    if (category.imageUrl != null) {
                        ShoporaImage(
                            model = category.imageUrl,
                            contentDescription = category.name,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = category.name,
            fontSize = 12.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
            color = if (isSelected) ShoporaCoral else Color.Black
        )
    }
}
