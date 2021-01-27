package com.gifgroen.ui.toolwindow

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory

class DependencyToolWindowFactory : ToolWindowFactory {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val window = DependencyToolWindow()
        val contentFactory = ContentFactory.SERVICE.getInstance()
        val content = contentFactory.createContent(window.getContent(), "Manage", false)
        toolWindow.contentManager.addContent(content)
    }
}