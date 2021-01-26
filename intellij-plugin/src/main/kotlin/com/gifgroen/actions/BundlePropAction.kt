package com.gifgroen.actions

import com.gifgroen.utils.MyBundle
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class BundlePropAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        println("App name is '${MyBundle.get("com.gifgroen.appname")}'")
    }
}
