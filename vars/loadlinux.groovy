def call(Map config = [:]){
    def loadresult = libraryResource "${config.name}"
    writeFile file: "${config.name}", text: loadresult
    sh "chmod +x ${config.name}"
    
}