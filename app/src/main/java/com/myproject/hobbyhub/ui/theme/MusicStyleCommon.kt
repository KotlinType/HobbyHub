package com.myproject.hobbyhub.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.myproject.hobbyhub.R

data class HubColors(
    val primary: Color,
    val black: Color,
    val white: Color,
    val label: Color,
    val borderForm: Color,
    val gray88: Color,
    val gray55: Color,
    val gray33: Color,
)

data class HubTypography(
    val appNameAuth: TextStyle,
    val infoAuth: TextStyle,
    val textButtonAuth: TextStyle,
    val codeNumberFormAuth: TextStyle,
    val changeMethodAuth: TextStyle,
    val disabledLabelTextField: TextStyle,
    val enabledLabelTextField: TextStyle,
    val valueTextField: TextStyle,
    val labelCheckbox: TextStyle,
)

data class HubShape(
    val codeNumberAuth: Shape,
    val infoFormAuth: Shape,
    val textField: Shape,
    val checkbox: Shape,
)

object HubTheme {
    val colors: HubColors
        @Composable
        get() = LocalHubColors.current

    val typography: HubTypography
        @Composable
        get() = LocalHubTypography.current

    val shape: HubShape
        @Composable
        get() = LocalHubShape.current
}

val Roboto = FontFamily(
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_medium, FontWeight.Medium),
)

val OpenSans = FontFamily(
    Font(R.font.opensans_light, FontWeight.Light),
)

val LocalHubColors = staticCompositionLocalOf<HubColors> {
    error("No colors provided")
}

val LocalHubTypography = staticCompositionLocalOf<HubTypography> {
    error("No font provided")
}

val LocalHubShape = staticCompositionLocalOf<HubShape> {
    error("No shapes provided")
}
