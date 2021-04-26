package com.github.derdan.embeddedtoolsplugin.services

import com.github.derdan.embeddedtoolsplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
