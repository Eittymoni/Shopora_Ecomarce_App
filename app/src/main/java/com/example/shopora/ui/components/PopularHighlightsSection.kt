package com.example.shopora.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopora.ui.icons.ShoporaIcons
import com.example.shopora.ui.theme.ShoporaCoral
import com.example.shopora.ui.theme.ShoporaPrimary

data class ProductItem(
    val id: String,
    val title: String,
    val tag: String,
    val tagBgColor: Color,
    val tagTextColor: Color,
    val rating: String,
    val reviewCount: String,
    val price: String,
    val originalPrice: String,
    val imageUrl: String
)

val sampleProducts = listOf(
    ProductItem(
        id = "p1",
        title = "Everyday Leather...",
        tag = "Trending",
        tagBgColor = Color(0xFFFEE2E2),
        tagTextColor = Color(0xFF991B1B),
        rating = "4.9",
        reviewCount = "184",
        price = "৳2,850",
        originalPrice = "৳3,600",
        imageUrl = "https://images.unsplash.com/photo-1584917865442-de89df76afd3?w=500&q=80"
    ),
    ProductItem(
        id = "p2",
        title = "Radiance Skincare...",
        tag = "Bestseller",
        tagBgColor = Color(0xFFEDE9FE),
        tagTextColor = Color(0xFF5B21B6),
        rating = "4.8",
        reviewCount = "312",
        price = "৳3,100",
        originalPrice = "৳4,250",
        imageUrl = "https://images.unsplash.com/photo-1608248597379-e263dcf8c078?w=500&q=80"
    ),
    ProductItem(
        id = "p3",
        title = "Classic Timepiece...",
        tag = "Premium",
        tagBgColor = Color(0xFFFEF3C7),
        tagTextColor = Color(0xFF92400E),
        rating = "5.0",
        reviewCount = "96",
        price = "৳3,950",
        originalPrice = "৳5,200",
        imageUrl = "https://images.unsplash.com/photo-1522335789203-aabd1fc54bc9?w=500&q=80"
    ),
    ProductItem(
        id = "p4",
        title = "Wabi Ceramic Mug...",
        tag = "Handmade",
        tagBgColor = Color(0xFFFFE4E6),
        tagTextColor = Color(0xFF9F1239),
        rating = "4.7",
        reviewCount = "74",
        price = "৳1,200",
        originalPrice = "৳1,750",
        imageUrl = "https://images.unsplash.com/photo-1514432324607-a09d9b4aefdd?w=500&q=80"
    )
)

@Composable
fun PopularHighlightsSection(
    products: List<ProductItem> = sampleProducts,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        // Section Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Popular Highlights",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = "Handpicked top recommendations",
                    fontSize = 11.sp,
                    color = Color.Gray
                )
            }

            TextButton(
                onClick = { },
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(
                    text = "View All",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = ShoporaPrimary
                )
                Icon(
                    imageVector = ShoporaIcons.ChevronRight,
                    contentDescription = "View All",
                    tint = ShoporaPrimary,
                    modifier = Modifier.size(16.dp)
                )
            }
        }

        // 2-Column Grid using Chunked Rows
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            products.chunked(2).forEach { rowProducts ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    rowProducts.forEach { product ->
                        Box(
                            modifier = Modifier.weight(1f)
                        ) {
                            ProductCard(product = product)
                        }
                    }
                    if (rowProducts.size == 1) {
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
        }
    }
}

@Composable
fun ProductCard(product: ProductItem) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(18.dp)),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
    ) {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            // Image Box
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(Color(0xFFF3F4F6))
            ) {
                ShoporaImage(
                    model = product.imageUrl,
                    contentDescription = product.title,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )

                // Tag Badge (Top Left)
                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(product.tagBgColor)
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = product.tag,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = product.tagTextColor
                    )
                }

                // Heart Favorite Button (Top Right)
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.9f)),
                    contentAlignment = Alignment.Center
                ) {
                    IconButton(
                        onClick = { },
                        modifier = Modifier.size(20.dp)
                    ) {
                        Icon(
                            imageVector = ShoporaIcons.FavoriteBorder,
                            contentDescription = "Favorite",
                            tint = Color.Black,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Rating ⭐ 4.9 (184)
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = ShoporaIcons.Star,
                    contentDescription = "Rating",
                    tint = Color(0xFFF59E0B),
                    modifier = Modifier.size(14.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = product.rating,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "(${product.reviewCount})",
                    fontSize = 11.sp,
                    color = Color.Gray
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            // Title
            Text(
                text = product.title,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(6.dp))

            // Price Row
            Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Text(
                    text = product.price,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = ShoporaPrimary
                )
                Text(
                    text = product.originalPrice,
                    fontSize = 11.sp,
                    color = Color.Gray,
                    textDecoration = TextDecoration.LineThrough
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Add to Cart Button
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(36.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ShoporaCoral,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(0.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = ShoporaIcons.ShoppingCart,
                        contentDescription = "Add to Cart",
                        modifier = Modifier.size(15.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Add to Cart",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}
