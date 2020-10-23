package com.github.czy779509408.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.czy779509408.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
