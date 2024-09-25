package com.example



class MyUtils {
    def steps

    MyUtils(steps) {
        this.steps = steps
    }

    static void sayHello() {
        echo 'Hello, World!'
    }

    def greeting(Map config = [:]) {
        steps.echo "here it is ${config.name}"
    }
}


