package com.weimed

import org.gradle.api.Project
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.Optional
import org.gradle.util.ConfigureUtil

/**
 * Created by Richard Lee on 4/15/14.
 */
class RequestsExtension {

    public static final String REQUESTSPLUGIN_EXTENTSION_NAME = "requests"

    Project project

    @Input
    String url;
    @Input
    String path;
    @Input
    @Optional
    String method = "GET";
    @Nested
    Params params = new Params();

    RequestsExtension(Project project) {
        this.project = project;
    }

    def params(Closure closure) {
        ConfigureUtil.configure(closure, params)
    }

}


