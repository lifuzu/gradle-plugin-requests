package com.weimed

import org.gradle.api.tasks.Input;

/**
 * Created by Richard Lee (rlee) on 5/12/14.
 */
public class Params {
    @Input
    String job
    @Input
    String token
    @Input
    String BRANCH
}
