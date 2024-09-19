def call(Map config = [:]){
    loadlinux(name: "bash_test.sh")
    sh "/bash_test.sh ${config.name} ${config.yourname}"
}