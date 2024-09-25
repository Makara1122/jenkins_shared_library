package com.example

import jenkins.model.Jenkins
import org.jenkinsci.plugins.workflow.cps.CpsScript

class MyUtils {
    static void sayHello(CpsScript script) {
        script.echo 'Hello, World!'
    }
}
