

def call(Closure<Void> body) {
    node('macos') {
        body()
    }
}
