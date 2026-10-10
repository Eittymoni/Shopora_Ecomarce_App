package com.example.shopora.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopora.ui.icons.ShoporaIcons
import com.example.shopora.ui.theme.ShoporaPrimary

data class FeatureItem(
    val title: String,
    val subtitle: String,
    val icon: ImageVector,
    val iconBgColor: Color,
    val iconTint: Color
)

val sampleFeatures = listOf(
    FeatureItem(
        title = "Fast Delivery",
        subtitle = "24–48 hrs in Dhaka",
        icon = ShoporaIcons.RocketLaunch,
        iconBgColor = Color(0xFFEDE9FE),
        iconTint = ShoporaPrimary
    ),
    FeatureItem(
        title = "Secure Pay",
        subtitle = "bKash, Nagad, Cards",
        icon = ShoporaIcons.Shield,
        iconBgColor = Color(0xFFFEE2E2),
        iconTint = Color(0xFFDC2626)
    ),
    FeatureItem(
        title = "7–Day Return",
        subtitle = "Hassle-free guarantee",
        icon = ShoporaIcons.Autorenew,
        iconBgColor = Color(0xFFFEF3C7),
        iconTint = Color(0xFFD97706)
    ),
    FeatureItem(
        title = "24/7 Support",
        subtitle = "Live expert assistance",
        icon = ShoporaIcons.HeadsetMic,
        iconBgColor = Color(0xFFF3F4F6),
        iconTint = Color(0xFF374151)
    )
)

@Composable
fun WhyChooseUsSection(
    features: List<FeatureItem> = sampleFeatures,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Why Millions Love Shopora",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            features.chunked(2).forEach { rowFeatures ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    rowFeatures.forEach { feature ->
                        Box(
                            modifier = Modifier.weight(1f)
                        ) {
                            FeatureCard(feature = feature)
                        }
                    }
                    if (rowFeatures.size == 1) {
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
        }
    }
}

@Composable
fun FeatureCard(feature: FeatureItem) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp)),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF9FAFB)),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(feature.iconBgColor),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = feature.icon,
                    contentDescription = feature.title,
                    tint = feature.iconTint,
                    modifier = Modifier.size(20.dp)
                )
            }

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = feature.title,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = feature.subtitle,
                    fontSize = 10.sp,
                    color = Color.Gray,
                    lineHeight = 13.sp
                )
            }
        }
    }
}
