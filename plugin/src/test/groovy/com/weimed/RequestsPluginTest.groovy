package com.weimed

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project

class RequestsPluginTest {
    @Test
    public void greeterPluginAddsGreetingTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        //project.apply plugin: 'requests'

        //assertTrue(project.tasks.addSubmodule instanceof SubmoduleTask)
    }
}
