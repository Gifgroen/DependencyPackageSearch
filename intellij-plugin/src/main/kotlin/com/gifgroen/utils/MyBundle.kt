package com.gifgroen.utils

import com.intellij.AbstractBundle
import org.jetbrains.annotations.Nls
import org.jetbrains.annotations.PropertyKey

object MyBundle: AbstractBundle("messages.dependencyPackageSearch") {

    @Nls
    fun get(@PropertyKey(resourceBundle = "messages.dependencyPackageSearch") key: String): String =  getMessage(key)
}