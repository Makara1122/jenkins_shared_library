def call(Map config = [:]){
<<<<<<< HEAD
 sh "echo Hello how are you to day ${config.name}. \ 
=======
 sh "echo Hello how are you to day ${config.name}. \
>>>>>>> 80b1fcecadbecf632ce97614062882dcced8f43a
 I am very happy to meet ${config.yourname}."
}

def call(Closure<Void> body) {
    node('macos') {
        body()
    }
}
