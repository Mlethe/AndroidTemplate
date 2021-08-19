package com.github.mlethe.androidtemplate.services

import com.github.mlethe.androidtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
