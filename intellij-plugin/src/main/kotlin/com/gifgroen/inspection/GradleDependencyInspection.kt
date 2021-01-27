package com.gifgroen.inspection

import com.intellij.codeInspection.InspectionManager
import com.intellij.codeInspection.LocalInspectionTool
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementVisitor
import com.intellij.psi.PsiFile

//import org.jetbrains.plugins.gradle.util.GradleConstants.DEFAULT_SCRIPT_NAME
//import org.jetbrains.plugins.gradle.util.GradleConstants.KOTLIN_DSL_SCRIPT_NAME
//import org.jetbrains.plugins.gradle.util.GradleUtil

class GradleDependencyInspection: LocalInspectionTool() {

    override fun checkFile(file: PsiFile, manager: InspectionManager, isOnTheFly: Boolean): Array<ProblemDescriptor> {
//        if(!isBuildFile(file.name)){
//            return emptyArray()
//        }

        checkDeps(file.project)

        println("Processing file: ${file.name}")
        file.accept(object: PsiElementVisitor() {
            override fun visitElement(element: PsiElement) {
                println("visiting element -> $element")
                super.visitElement(element)
            }
        })
        return emptyArray()

    }

    private fun checkDeps(project: Project) {

//        println("Gradle home = ${GradleUtil.getLastUsedGradleHome()}")

        try {
//            val service = DependencyModifierService.getInstance(project)
        }
        catch (e: Exception) {
            println("Exception during dependency listing: ${e.message}")
        }

    }

//    private fun isBuildFile(filename: String) = filename == DEFAULT_SCRIPT_NAME || filename == KOTLIN_DSL_SCRIPT_NAME
}