package com.example.shopora.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

object ShoporaIcons {
    val ShoppingBag: ImageVector = createIcon("ShoppingBag") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.0f, 6.0f)
            horizontalLineToRelative(-2.0f)
            curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
            reflectiveCurveTo(8.0f, 3.79f, 8.0f, 6.0f)
            horizontalLineTo(6.0f)
            curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
            verticalLineToRelative(12.0f)
            curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
            horizontalLineToRelative(12.0f)
            curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
            verticalLineTo(8.0f)
            curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
            close()
            moveTo(12.0f, 4.0f)
            curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
            horizontalLineToRelative(-4.0f)
            curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
            close()
            moveTo(18.0f, 20.0f)
            horizontalLineTo(6.0f)
            verticalLineTo(8.0f)
            horizontalLineToRelative(2.0f)
            verticalLineToRelative(2.0f)
            curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
            reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
            verticalLineTo(8.0f)
            horizontalLineToRelative(4.0f)
            verticalLineToRelative(2.0f)
            curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
            reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
            verticalLineTo(8.0f)
            horizontalLineToRelative(2.0f)
            verticalLineToRelative(12.0f)
            close()
        }
    }

    val Search: ImageVector = createIcon("Search") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 14.0f)
            horizontalLineToRelative(-0.79f)
            lineToRelative(-0.28f, -0.27f)
            curveTo(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f)
            curveTo(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f)
            curveTo(5.91f, 3.0f, 3.0f, 5.91f, 3.0f, 9.5f)
            curveTo(3.0f, 13.09f, 5.91f, 16.0f, 9.5f, 16.0f)
            curveToRelative(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f)
            lineToRelative(0.27f, 0.28f)
            verticalLineToRelative(0.79f)
            lineToRelative(5.0f, 4.99f)
            lineTo(20.49f, 19.0f)
            lineToRelative(-4.99f, -5.0f)
            close()
            moveTo(9.5f, 14.0f)
            curveTo(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f)
            reflectiveCurveTo(7.01f, 5.0f, 9.5f, 5.0f)
            reflectiveCurveTo(14.0f, 7.01f, 14.0f, 9.5f)
            reflectiveCurveTo(11.99f, 14.0f, 9.5f, 14.0f)
            close()
        }
    }

    val Notifications: ImageVector = createIcon("Notifications") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.0f, 22.0f)
            curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
            horizontalLineToRelative(-4.0f)
            curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
            close()
            moveTo(18.0f, 16.0f)
            verticalLineToRelative(-5.0f)
            curveToRelative(0.0f, -3.07f, -1.63f, -5.64f, -4.5f, -6.32f)
            verticalLineTo(4.0f)
            curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveTo(10.5f, 3.17f, 10.5f, 4.0f)
            verticalLineToRelative(0.68f)
            curveTo(7.64f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f)
            verticalLineToRelative(5.0f)
            lineToRelative(-2.0f, 2.0f)
            verticalLineToRelative(1.0f)
            horizontalLineToRelative(16.0f)
            verticalLineToRelative(-1.0f)
            lineToRelative(-2.0f, -2.0f)
            close()
        }
    }

    val Person: ImageVector = createIcon("Person") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.0f, 12.0f)
            curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
            reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
            reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
            reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
            close()
            moveTo(12.0f, 14.0f)
            curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f)
            verticalLineToRelative(2.0f)
            horizontalLineToRelative(16.0f)
            verticalLineToRelative(-2.0f)
            curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f)
            close()
        }
    }

    val LocalShipping: ImageVector = createIcon("LocalShipping") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.0f, 8.0f)
            horizontalLineToRelative(-3.0f)
            verticalLineTo(4.0f)
            horizontalLineTo(4.0f)
            curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
            verticalLineToRelative(11.0f)
            horizontalLineToRelative(2.0f)
            curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
            reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
            horizontalLineToRelative(6.0f)
            curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
            reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
            horizontalLineToRelative(2.0f)
            verticalLineToRelative(-5.0f)
            lineToRelative(-3.0f, -4.0f)
            close()
            moveTo(6.0f, 18.5f)
            curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveTo(5.17f, 15.5f, 6.0f, 15.5f)
            reflectiveCurveTo(7.5f, 16.17f, 7.5f, 17.0f)
            reflectiveCurveTo(6.83f, 18.5f, 6.0f, 18.5f)
            close()
            moveTo(18.0f, 18.5f)
            curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveTo(17.17f, 15.5f, 18.0f, 15.5f)
            reflectiveCurveTo(19.5f, 16.17f, 19.5f, 17.0f)
            reflectiveCurveTo(18.83f, 18.5f, 18.0f, 18.5f)
            close()
            moveTo(17.0f, 12.0f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(2.5f)
            lineToRelative(1.96f, 2.5f)
            horizontalLineTo(17.0f)
            close()
        }
    }

    val CameraAlt: ImageVector = createIcon("CameraAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.4f, 4.0f)
            lineTo(7.8f, 5.8f)
            horizontalLineTo(4.0f)
            curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
            verticalLineToRelative(12.0f)
            curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
            horizontalLineToRelative(16.0f)
            curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
            verticalLineTo(7.8f)
            curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
            horizontalLineToRelative(-3.8f)
            lineTo(14.6f, 4.0f)
            horizontalLineTo(9.4f)
            close()
            moveTo(12.0f, 17.0f)
            curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
            reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
            reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
            reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
            close()
        }
    }

    val Tune: ImageVector = createIcon("Tune") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.0f, 17.0f)
            verticalLineToRelative(2.0f)
            horizontalLineToRelative(6.0f)
            verticalLineToRelative(-2.0f)
            horizontalLineTo(3.0f)
            close()
            moveTo(3.0f, 5.0f)
            verticalLineToRelative(2.0f)
            horizontalLineToRelative(10.0f)
            verticalLineTo(5.0f)
            horizontalLineTo(3.0f)
            close()
            moveTo(13.0f, 21.0f)
            verticalLineToRelative(-2.0f)
            horizontalLineToRelative(8.0f)
            verticalLineToRelative(-2.0f)
            horizontalLineToRelative(-8.0f)
            verticalLineToRelative(-2.0f)
            horizontalLineToRelative(-2.0f)
            verticalLineToRelative(6.0f)
            horizontalLineToRelative(2.0f)
            close()
            moveTo(7.0f, 9.0f)
            verticalLineToRelative(2.0f)
            horizontalLineTo(3.0f)
            verticalLineToRelative(2.0f)
            horizontalLineToRelative(4.0f)
            verticalLineToRelative(2.0f)
            horizontalLineToRelative(2.0f)
            verticalLineTo(9.0f)
            horizontalLineTo(7.0f)
            close()
            moveTo(21.0f, 13.0f)
            verticalLineToRelative(-2.0f)
            horizontalLineTo(11.0f)
            verticalLineToRelative(2.0f)
            horizontalLineToRelative(10.0f)
            close()
            moveTo(17.0f, 9.0f)
            horizontalLineToRelative(2.0f)
            verticalLineTo(7.0f)
            horizontalLineToRelative(2.0f)
            verticalLineTo(5.0f)
            horizontalLineToRelative(-2.0f)
            verticalLineTo(3.0f)
            horizontalLineToRelative(-2.0f)
            verticalLineToRelative(6.0f)
            close()
        }
    }

    val Whatshot: ImageVector = createIcon("Whatshot") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 0.67f)
            curveToRelative(-0.72f, 0.52f, -1.33f, 1.25f, -1.81f, 2.08f)
            curveTo(11.21f, 3.58f, 10.87f, 4.88f, 10.74f, 6.0f)
            curveTo(9.65f, 4.89f, 8.84f, 3.52f, 8.41f, 2.0f)
            curveTo(6.0f, 4.19f, 4.0f, 7.39f, 4.0f, 11.0f)
            curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
            reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f)
            curveToRelative(0.0f, -4.0f, -2.5f, -7.5f, -6.5f, -10.33f)
            close()
            moveTo(12.0f, 17.0f)
            curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
            curveToRelative(0.0f, -1.53f, 0.58f, -2.93f, 1.54f, -4.01f)
            curveToRelative(0.9f, 1.83f, 2.45f, 3.23f, 4.36f, 3.86f)
            curveToRelative(-0.1f, 0.35f, -0.16f, 0.72f, -0.16f, 1.1f)
            curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
            curveToRelative(0.48f, 0.0f, 0.94f, -0.09f, 1.36f, -0.25f)
            curveTo(16.32f, 16.33f, 14.3f, 17.0f, 12.0f, 17.0f)
            close()
        }
    }

    val Bolt: ImageVector = createIcon("Bolt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.0f, 21.0f)
            lineToRelative(1.0f, -7.0f)
            horizontalLineTo(7.0f)
            lineToRelative(6.0f, -11.0f)
            horizontalLineToRelative(2.0f)
            lineToRelative(-1.0f, 7.0f)
            horizontalLineToRelative(5.0f)
            lineToRelative(-6.0f, 11.0f)
            horizontalLineToRelative(-2.0f)
            close()
        }
    }

    val ShoppingCart: ImageVector = createIcon("ShoppingCart") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.0f, 18.0f)
            curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
            reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f)
            reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
            reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
            close()
            moveTo(17.0f, 18.0f)
            curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
            reflectiveCurveTo(15.9f, 22.0f, 17.0f, 22.0f)
            reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
            reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
            close()
            moveTo(7.0f, 15.0f)
            lineToRelative(1.1f, -2.0f)
            horizontalLineToRelative(7.45f)
            curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f)
            lineToRelative(3.58f, -6.49f)
            curveToRelative(0.37f, -0.66f, -0.11f, -1.48f, -0.87f, -1.48f)
            horizontalLineTo(5.21f)
            lineToRelative(-0.94f, -2.0f)
            horizontalLineTo(1.0f)
            verticalLineToRelative(2.0f)
            horizontalLineToRelative(2.0f)
            lineToRelative(3.6f, 7.59f)
            lineTo(5.25f, 14.04f)
            curveTo(5.09f, 14.32f, 5.0f, 14.65f, 5.0f, 15.0f)
            curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
            horizontalLineToRelative(12.0f)
            verticalLineToRelative(-2.0f)
            horizontalLineTo(7.42f)
            curveToRelative(-0.14f, 0.0f, -0.25f, -0.11f, -0.25f, -0.25f)
            close()
        }
    }

    val FavoriteBorder: ImageVector = createIcon("FavoriteBorder") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 3.0f)
            curveTo(14.76f, 3.0f, 13.09f, 3.81f, 12.0f, 5.09f)
            curveTo(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f)
            curveTo(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f)
            curveToRelative(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f)
            lineTo(12.0f, 21.35f)
            lineToRelative(1.45f, -1.32f)
            curveTo(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f)
            curveTo(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f)
            close()
            moveTo(12.1f, 18.55f)
            lineToRelative(-0.1f, 0.1f)
            lineToRelative(-0.1f, -0.1f)
            curveTo(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f)
            curveTo(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f)
            curveToRelative(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f)
            horizontalLineToRelative(1.87f)
            curveTo(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f)
            curveTo(18.5f, 5.0f, 20.0f, 6.5f, 20.0f, 8.5f)
            curveToRelative(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f)
            close()
        }
    }

    val Star: ImageVector = createIcon("Star") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.0f, 17.27f)
            lineTo(18.18f, 21.0f)
            lineToRelative(-1.64f, -7.03f)
            lineTo(22.0f, 9.24f)
            lineToRelative(-7.19f, -0.61f)
            lineTo(12.0f, 2.0f)
            lineTo(9.19f, 8.63f)
            lineTo(2.0f, 9.24f)
            lineToRelative(5.46f, 4.73f)
            lineTo(5.82f, 21.0f)
            close()
        }
    }

    val RocketLaunch: ImageVector = createIcon("RocketLaunch") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.19f, 6.35f)
            curveTo(9.74f, 4.07f, 10.85f, 2.4f, 12.0f, 1.0f)
            curveToRelative(1.15f, 1.4f, 2.26f, 3.07f, 2.81f, 5.35f)
            curveToRelative(2.36f, 0.72f, 4.19f, 2.55f, 4.91f, 4.91f)
            curveTo(21.93f, 11.81f, 23.6f, 12.92f, 25.0f, 14.0f)
            curveToRelative(-1.4f, 1.15f, -3.07f, 2.26f, -5.28f, 2.74f)
            lineTo(9.19f, 6.35f)
            close()
            moveTo(12.0f, 14.0f)
            curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
            reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f)
            reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
            reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, -4.0f)
            close()
        }
    }

    val Shield: ImageVector = createIcon("Shield") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.0f, 1.0f)
            lineTo(3.0f, 5.0f)
            verticalLineToRelative(6.0f)
            curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f)
            curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f)
            verticalLineTo(5.0f)
            lineToRelative(-9.0f, -4.0f)
            close()
            moveTo(12.0f, 11.99f)
            horizontalLineTo(5.0f)
            verticalLineTo(6.3f)
            lineToRelative(7.0f, -3.11f)
            verticalLineToRelative(8.8f)
            close()
        }
    }

    val Autorenew: ImageVector = createIcon("Autorenew") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.0f, 6.0f)
            verticalLineTo(1.0f)
            lineTo(7.0f, 6.0f)
            lineToRelative(5.0f, 5.0f)
            verticalLineTo(7.0f)
            curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f)
            curveToRelative(0.0f, 1.01f, -0.25f, 1.97f, -0.7f, 2.8f)
            lineToRelative(1.46f, 1.46f)
            curveTo(19.54f, 15.84f, 20.0f, 14.0f, 20.0f, 12.0f)
            curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f)
            close()
            moveTo(12.0f, 17.0f)
            curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
            curveToRelative(0.0f, -1.01f, 0.25f, -1.97f, 0.7f, -2.8f)
            lineTo(5.24f, 6.74f)
            curveTo(4.46f, 8.16f, 4.0f, 10.0f, 4.0f, 12.0f)
            curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
            verticalLineToRelative(5.0f)
            lineToRelative(5.0f, -5.0f)
            lineToRelative(-5.0f, -5.0f)
            verticalLineToRelative(4.0f)
            close()
        }
    }

    val HeadsetMic: ImageVector = createIcon("HeadsetMic") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.0f, 1.0f)
            curveTo(6.48f, 1.0f, 2.0f, 5.48f, 2.0f, 11.0f)
            verticalLineToRelative(7.0f)
            curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
            horizontalLineToRelative(3.0f)
            verticalLineToRelative(-8.0f)
            horizontalLineTo(4.0f)
            verticalLineToRelative(-2.0f)
            curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f)
            reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f)
            verticalLineToRelative(2.0f)
            horizontalLineToRelative(-4.0f)
            verticalLineToRelative(8.0f)
            horizontalLineToRelative(4.0f)
            curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
            verticalLineToRelative(-4.0f)
            curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
            horizontalLineToRelative(-1.0f)
            verticalLineToRelative(-2.0f)
            curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
            close()
        }
    }

    val Mail: ImageVector = createIcon("Mail") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.0f, 4.0f)
            horizontalLineTo(4.0f)
            curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
            lineTo(2.0f, 18.0f)
            curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
            horizontalLineToRelative(16.0f)
            curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
            verticalLineTo(6.0f)
            curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
            close()
            moveTo(20.0f, 8.0f)
            lineToRelative(-8.0f, 5.0f)
            lineToRelative(-8.0f, -5.0f)
            verticalLineTo(6.0f)
            lineToRelative(8.0f, 5.0f)
            lineToRelative(8.0f, -5.0f)
            verticalLineToRelative(2.0f)
            close()
        }
    }

    val AutoAwesome: ImageVector = createIcon("AutoAwesome") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.0f, 9.0f)
            lineToRelative(1.25f, -2.75f)
            lineTo(23.0f, 5.0f)
            lineToRelative(-2.75f, -1.25f)
            lineTo(19.0f, 1.0f)
            lineToRelative(-1.25f, 2.75f)
            lineTo(15.0f, 5.0f)
            lineToRelative(2.75f, 1.25f)
            close()
            moveTo(9.0f, 4.0f)
            lineTo(6.5f, 9.5f)
            lineTo(1.0f, 12.0f)
            lineToRelative(5.5f, 2.5f)
            lineTo(9.0f, 20.0f)
            lineToRelative(2.5f, -5.5f)
            lineTo(17.0f, 12.0f)
            lineToRelative(-5.5f, -2.5f)
            close()
        }
    }

    val Home: ImageVector = createIcon("Home") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.0f, 20.0f)
            verticalLineToRelative(-6.0f)
            horizontalLineToRelative(4.0f)
            verticalLineToRelative(6.0f)
            horizontalLineToRelative(5.0f)
            verticalLineToRelative(-8.0f)
            horizontalLineToRelative(3.0f)
            lineTo(12.0f, 3.0f)
            lineTo(2.0f, 12.0f)
            horizontalLineToRelative(3.0f)
            verticalLineToRelative(8.0f)
            close()
        }
    }

    val GridView: ImageVector = createIcon("GridView") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.0f, 3.0f)
            verticalLineToRelative(8.0f)
            horizontalLineToRelative(8.0f)
            verticalLineTo(3.0f)
            horizontalLineTo(3.0f)
            close()
            moveTo(13.0f, 3.0f)
            verticalLineToRelative(8.0f)
            horizontalLineToRelative(8.0f)
            verticalLineTo(3.0f)
            horizontalLineToRelative(-8.0f)
            close()
            moveTo(3.0f, 13.0f)
            verticalLineToRelative(8.0f)
            horizontalLineToRelative(8.0f)
            verticalLineToRelative(-8.0f)
            horizontalLineTo(3.0f)
            close()
            moveTo(13.0f, 13.0f)
            verticalLineToRelative(8.0f)
            horizontalLineToRelative(8.0f)
            verticalLineToRelative(-8.0f)
            horizontalLineToRelative(-8.0f)
            close()
        }
    }

    val ArrowForward: ImageVector = createIcon("ArrowForward") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.0f, 4.0f)
            lineToRelative(-1.41f, 1.41f)
            lineTo(16.17f, 11.0f)
            horizontalLineTo(4.0f)
            verticalLineToRelative(2.0f)
            horizontalLineToRelative(12.17f)
            lineToRelative(-5.58f, 5.59f)
            lineTo(12.0f, 20.0f)
            lineToRelative(8.0f, -8.0f)
            close()
        }
    }

    val ChevronRight: ImageVector = createIcon("ChevronRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.0f, 6.0f)
            lineToRelative(-1.41f, 1.41f)
            lineTo(13.17f, 12.0f)
            lineToRelative(-4.58f, 4.59f)
            lineTo(10.0f, 18.0f)
            lineToRelative(6.0f, -6.0f)
            close()
        }
    }
}

private inline fun createIcon(
    name: String,
    block: ImageVector.Builder.() -> ImageVector.Builder
): ImageVector {
    return ImageVector.Builder(
        name = name,
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).block().build()
}
