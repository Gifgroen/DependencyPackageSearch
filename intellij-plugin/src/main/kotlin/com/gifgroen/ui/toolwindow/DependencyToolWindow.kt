package com.gifgroen.ui.toolwindow

import javax.swing.*

/**
 * TODO: tidy all this into proper architecture like MVC/MVP/MVVM/VIPER/other.
 */
class DependencyToolWindow(
    title: String = "DependencyToolWindow"
): JFrame(title) {

    private lateinit var contentPanel: JPanel

    private lateinit var splitPane: JSplitPane

    private lateinit var dependencyList: JList<DependencyItem> // TODO: change to JBList

    private lateinit var label: JLabel

    init {
        dependencyList.model = DefaultListModel<DependencyItem>().apply {
            addAll(models)
        }
        dependencyList.addListSelectionListener {
            if (!it.valueIsAdjusting) {
                label.text = dependencyList.selectedValue.name
            }
        }
    }

    fun getContent() = contentPanel
}

data class DependencyItem(val name: String) {
    override fun toString(): String = name
}

val models = listOf(
    DependencyItem("Ktor"),
    DependencyItem("Retrofit"),
    DependencyItem("OkHttp"),
    DependencyItem("Arrow")
)