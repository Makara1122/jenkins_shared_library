package com.example



class MyUtils {
    def steps

    MyUtils(steps) {
        this.steps = steps
    }

    def sayHello() {
        steps.echo 'Hello, World!'
    }

    def greeting(Map config = [:]) {
        steps.echo "here it is ${config.name}"
    }
}

