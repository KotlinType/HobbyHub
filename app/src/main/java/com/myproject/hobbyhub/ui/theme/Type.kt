package com.myproject.hobbyhub.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

// FontWeight
private val light = FontWeight(300)
private val regular = FontWeight(400)
private val medium = FontWeight(500)

val Typography = HubTypography(
    appNameAuth = TextStyle(
        fontSize = 28.sp,
        fontWeight = regular,
        fontFamily = Roboto,
        color = BaseLightPalette.primary
    ),
    infoAuth = TextStyle(
        fontSize = 12.sp,
        fontWeight = light,
        fontFamily = OpenSans,
        color = BaseLightPalette.gray33
    ),
    textButtonAuth = TextStyle(
        fontSize = 14.sp,
        fontWeight = medium,
        fontFamily = Roboto,
        color = BaseLightPalette.primary
    ),
    codeNumberFormAuth = TextStyle(
        fontSize = 20.sp,
        fontWeight = regular,
        fontFamily = Roboto,
        color = BaseLightPalette.gray33
    ),
    changeMethodAuth = TextStyle(
        fontSize = 12.sp,
        fontWeight = light,
        fontFamily = Roboto,
        color = BaseLightPalette.primary
    ),
    disabledLabelTextField = TextStyle(
        fontSize = 14.sp,
        fontWeight = regular,
        fontFamily = Roboto,
        color = BaseLightPalette.label
    ),
    enabledLabelTextField = TextStyle(
        fontSize = 8.sp,
        fontWeight = regular,
        fontFamily = Roboto,
        color = BaseLightPalette.label
    ),
    valueTextField = TextStyle(
        fontSize = 14.sp,
        fontWeight = regular,
        fontFamily = Roboto,
        color = BaseLightPalette.gray33
    ),
    labelCheckbox = TextStyle(
        fontSize = 12.sp,
        fontWeight = regular,
        fontFamily = Roboto,
        color = BaseLightPalette.gray55
    ),
)
