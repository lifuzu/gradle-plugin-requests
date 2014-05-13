package com.weimed

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

import static com.weimed.RequestsExtension.REQUESTSPLUGIN_EXTENTSION_NAME

class RequestsTask extends DefaultTask {

    @TaskAction
    def requestsAction() {
//        def req = project.extensions.findByName(REQUESTSPLUGIN_EXTENTSION_NAME)
//        println(req.url)
//        println(req.path)
//        println(req.method)
//        println(req.params.job)
//        println(req.params.token)
//        println(req.params.BRANCH)
    }
}
