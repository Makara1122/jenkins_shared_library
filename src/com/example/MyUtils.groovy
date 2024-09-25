package com.example

import jenkins.model.Jenkins
import org.jenkinsci.plugins.workflow.cps.CpsScript

class Utils {
    static void someStaticMethod(CpsScript script) {
        script.echo 'Executing someStaticMethod'
    }
}

class Helper {
    private CpsScript script
    private String text

    Helper(CpsScript script, String text) {
        this.script = script
        this.text = text
    }

    void prepare() {
        script.echo "Preparing with text: ${text}"
    }

    int count() {
        return text.length()
    }
}

class Constants {
    static final String SOME_TEXT = "Hello from Constants"
}
