package com.sagnikmukherjee.testapp.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
object ScreenA

@Serializable
data class ScreenB(
    val name: String?,
    val age: Int
)
