package com.example

class MyUtils {

    // Example method that prints a message
    def printMessage(String message) {
        echo "Message: ${message}"
    }

    // Example method to calculate the sum of two numbers
    def calculateSum(int a, int b) {
        return a + b
    }

    // Example method that returns the current date and time
    def getCurrentDateTime() {
        return new Date().format("yyyy-MM-dd HH:mm:ss")
    }

    // Example method to check if a number is even
    def isEven(int number) {
        return number % 2 == 0
    }
}
