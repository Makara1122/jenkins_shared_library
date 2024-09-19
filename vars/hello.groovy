def call(Map config = [:]){
 sh "echo Hello how are you to day ${config.name}. 
 I am very happy to meet ${config.yourname}."
}
