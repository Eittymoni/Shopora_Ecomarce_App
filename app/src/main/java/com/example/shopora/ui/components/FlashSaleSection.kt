package com.example.shopora.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
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
import com.example.shopora.data.model.Product
import com.example.shopora.ui.icons.ShoporaIcons
import com.example.shopora.ui.theme.DiscountBadgeText
import com.example.shopora.ui.theme.DiscountBadgeYellow
import com.example.shopora.ui.theme.ShoporaCoral
import com.example.shopora.ui.theme.ShoporaPrimary

val sampleFlashSaleItems = listOf(
    Product(
        id = "flash-1",
        title = "Wireless ANC Studio Pro",
        brand = "Audio Tech",
        price = 3450.0,
        originalPrice = 4990.0,
        discountPercent = "-30%",
        soldPercentage = 0.82f,
        stockLeftText = "Only 6 left",
        imageUrl = "https://images.unsplash.com/photo-1546435770-a3e426bf472b?w=500&q=80",
        isFlashSale = true
    ),
    Product(
        id = "flash-2",
        title = "Aura Glow Desk Lamp",
        brand = "Home Living",
        price = 1890.0,
        originalPrice = 3400.0,
        discountPercent = "-45%",
        soldPercentage = 0.91f,
        stockLeftText = "Only 3 left",
        imageUrl = "https://images.unsplash.com/photo-1507473885765-e6ed057f782c?w=500&q=80",
        isFlashSale = true
    )
)

@Composable
fun FlashSaleSection(
    items: List<Product> = sampleFlashSaleItems,
    onProductClicked: (Product) -> Unit = {},
    onAddToCartClicked: (Product) -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        // Flash Sale Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(36.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(DiscountBadgeYellow),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = ShoporaIcons.Bolt,
                        contentDescription = "Flash Sale",
                        tint = DiscountBadgeText,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = "Flash Sale",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = "Ending very soon",
                        fontSize = 11.sp,
                        color = Color.Gray
                    )
                }
            }

            // Countdown Timer: 08 : 42 : 02
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                CountdownBox(number = "08")
                Text(text = ":", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                CountdownBox(number = "42")
                Text(text = ":", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                CountdownBox(number = "02")
            }
        }

        // Horizontal Card Carousel
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            items(items) { item ->
                FlashSaleCard(
                    item = item,
                    onProductClicked = { onProductClicked(item) },
                    onAddToCartClicked = { onAddToCartClicked(item) }
                )
            }
        }
    }
}

@Composable
fun CountdownBox(number: String) {
    Box(
        modifier = Modifier
            .size(28.dp)
            .clip(RoundedCornerShape(6.dp))
            .background(Color.White)
            .border(1.dp, Color(0xFFE5E7EB), RoundedCornerShape(6.dp)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = number,
            fontSize = 13.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black
        )
    }
}

@Composable
fun FlashSaleCard(
    item: Product,
    onProductClicked: () -> Unit = {},
    onAddToCartClicked: () -> Unit = {}
) {
    Card(
        modifier = Modifier
            .width(220.dp)
            .clip(RoundedCornerShape(18.dp))
            .clickable { onProductClicked() },
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
    ) {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            // Image with Discount Badge
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(Color(0xFFF3F4F6))
            ) {
                ShoporaImage(
                    model = item.imageUrl,
                    contentDescription = item.title,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )

                // Discount Tag
                if (item.discountPercent.isNotEmpty()) {
                    Box(
                        modifier = Modifier
                            .padding(8.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(DiscountBadgeYellow)
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = item.discountPercent,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = DiscountBadgeText
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Brand
            Text(
                text = item.brand,
                fontSize = 11.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(2.dp))

            // Title
            Text(
                text = item.title,
                fontSize = 14.sp,
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
                    text = item.formattedPrice,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = ShoporaPrimary
                )
                Text(
                    text = item.formattedOriginalPrice,
                    fontSize = 12.sp,
                    color = Color.Gray,
                    textDecoration = TextDecoration.LineThrough
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Stock Progress Bar + Label
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Sold ${(item.soldPercentage * 100).toInt()}%",
                        fontSize = 10.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = item.stockLeftText,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFDC2626)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                LinearProgressIndicator(
                    progress = { item.soldPercentage },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(CircleShape),
                    color = ShoporaPrimary,
                    trackColor = Color(0xFFEDE9FE)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Button: Grab Deal
            Button(
                onClick = onAddToCartClicked,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(38.dp),
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
                        contentDescription = "Grab Deal",
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Grab Deal",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}
