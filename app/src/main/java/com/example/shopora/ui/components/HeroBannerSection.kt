package com.example.shopora.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import com.example.shopora.ui.icons.ShoporaIcons
import com.example.shopora.ui.theme.ShoporaCoral
import com.example.shopora.ui.theme.ShoporaPrimary

@Composable
fun HeroBannerSection(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .height(210.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xFFFFF0EC))
    ) {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            // Left Content Section
            Column(
                modifier = Modifier
                    .weight(1.1f)
                    .fillMaxHeight()
                    .padding(start = 16.dp, top = 16.dp, bottom = 14.dp, end = 8.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    // Tag: NEW SEASON
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .background(ShoporaCoral)
                            .padding(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = "NEW SEASON",
                            color = Color.White,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 0.5.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Find What\nYou Love",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color(0xFF1E1B2E),
                        lineHeight = 26.sp
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "Curated pieces designed\nto elevate your everyday...",
                        fontSize = 11.sp,
                        color = Color(0xFF6B7280),
                        lineHeight = 15.sp,
                        maxLines = 2
                    )
                }

                Column {
                    // CTA Button: Shop Now ->
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = ShoporaCoral,
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(20.dp),
                        contentPadding = PaddingValues(
                            horizontal = 16.dp,
                            vertical = 6.dp
                        ),
                        modifier = Modifier.height(36.dp)
                    ) {
                        Text(
                            text = "Shop Now",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(
                            imageVector = ShoporaIcons.ArrowForward,
                            contentDescription = "Go",
                            modifier = Modifier.size(14.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    // Page Indicator Dots
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .width(18.dp)
                                .height(6.dp)
                                .clip(CircleShape)
                                .background(ShoporaCoral)
                        )
                        Box(
                            modifier = Modifier
                                .size(6.dp)
                                .clip(CircleShape)
                                .background(Color.LightGray)
                        )
                        Box(
                            modifier = Modifier
                                .size(6.dp)
                                .clip(CircleShape)
                                .background(Color.LightGray)
                        )
                    }
                }
            }

            // Right Image Section
            Box(
                modifier = Modifier
                    .weight(0.9f)
                    .fillMaxHeight()
            ) {
                ShoporaImage(
                    model = "https://images.unsplash.com/photo-1581044777550-4cfa60707c03?w=600&q=80",
                    contentDescription = "Fashion Collection",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )

                // UP TO 40% OFF Pill Badge on top right
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(top = 12.dp, end = 12.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color.White.copy(alpha = 0.95f))
                        .padding(horizontal = 10.dp, vertical = 6.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "UP TO",
                            fontSize = 8.sp,
                            fontWeight = FontWeight.Bold,
                            color = ShoporaPrimary
                        )
                        Text(
                            text = "40%",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = ShoporaPrimary,
                            lineHeight = 16.sp
                        )
                        Text(
                            text = "OFF",
                            fontSize = 8.sp,
                            fontWeight = FontWeight.Bold,
                            color = ShoporaPrimary
                        )
                    }
                }
            }
        }
    }
}
