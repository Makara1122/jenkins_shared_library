package com.example

class MyUtils {
  def sayHello() {
  echo 'Hello, World!'
}
  def sayHi() {
    echo 'Hi Makara*'
  }

  def greeting(Map config = [:]){
    echo 'hello makara, ${config.name}'
  }
}

return this
