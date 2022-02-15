package com.github.itokajo.phpstorminternalinspection.services

import com.intellij.openapi.project.Project
import com.github.itokajo.phpstorminternalinspection.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
