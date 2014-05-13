package com.weimed

import org.gradle.api.Project
import org.gradle.api.Plugin

import static com.weimed.RequestsExtension.REQUESTSPLUGIN_EXTENTSION_NAME

import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.Method.GET
import static groovyx.net.http.ContentType.TEXT

class RequestsPlugin implements Plugin<Project> {
    void apply(Project project) {
        applyExtension(project)
        applyTasks(project)
    }

    void applyTasks(Project project) {
        /*
         * Create and install the task
         */
        project.task('triggerJenkinsJob', type: RequestsTask) << {
            def req = project.extensions.findByName(REQUESTSPLUGIN_EXTENTSION_NAME)
//            println(req.url)
//            println(req.path)
//            println(req.method)
//            println(req.params.job)
//            println(req.params.token)
//            println(req.params.BRANCH)
            def http = new HTTPBuilder(req.url)

            // only support method 'GET'
            http.get( path: req.path,
                      contentType: TEXT,
                      query: [job: req.params.job,
                              token: req.params.token,
                              BRANCH: req.params.BRANCH]) { resp, reader ->
                println "response status: ${resp.statusLine}"
                println 'Headers: -----------'
                resp.headers.each { h ->
                    println " ${h.name} : ${h.value}"
                }
                println 'Response data: -----'
                System.out << reader
                println '\n--------------------'
            }
        }
    }

    void applyExtension(Project project) {
        project.extensions.create(REQUESTSPLUGIN_EXTENTSION_NAME, RequestsExtension, project)
    }
}
