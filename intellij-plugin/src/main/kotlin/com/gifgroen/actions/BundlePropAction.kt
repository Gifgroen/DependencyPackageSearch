package com.gifgroen.actions

import com.gifgroen.utils.DependencyPackageSearchBundle
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class BundlePropAction : AnAction() {

    val appName by lazy {
        DependencyPackageSearchBundle.get("com.gifgroen.appname")
    }

    override fun actionPerformed(e: AnActionEvent) {
        println("App name is '$appName'")
    }
}
