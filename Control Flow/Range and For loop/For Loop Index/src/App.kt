// main function
fun main() {
    val rangers = 1.rangeTo(10) step 3

    for ((index, asli) in rangers.withIndex()) {
        println("value $asli with index $index")
    }
}