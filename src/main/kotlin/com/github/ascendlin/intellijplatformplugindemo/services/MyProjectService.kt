package com.github.ascendlin.intellijplatformplugindemo.services

import com.intellij.openapi.project.Project
import com.github.ascendlin.intellijplatformplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
