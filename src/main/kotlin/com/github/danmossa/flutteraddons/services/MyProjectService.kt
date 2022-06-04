package com.github.danmossa.flutteraddons.services

import com.intellij.openapi.project.Project
import com.github.danmossa.flutteraddons.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
