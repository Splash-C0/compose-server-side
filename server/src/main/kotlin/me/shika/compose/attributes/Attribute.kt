package me.shika.compose.attributes

import me.shika.compose.core.Modifier

data class Attribute(
    val key: String,
    val value: String?
) : Modifier

fun Modifier.attribute(key: String, value: String?): Modifier =
    this + Attribute(key, value)

fun Modifier.className(value: String): Modifier =
    attribute("className", value)

fun Modifier.id(value: String): Modifier =
    attribute("id", value)

fun Modifier.labelFor(value: String): Modifier =
    attribute("htmlFor", value)