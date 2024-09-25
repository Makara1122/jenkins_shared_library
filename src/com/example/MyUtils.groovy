package com.example



class MyUtils {
    def steps

    MyUtils(steps) {
        this.steps = steps
    }

    def sayHello() {
        steps.echo 'Hello, World!'
    }
}

