/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {

    // TODO 1
    val vehicle = mapOf(
        "type" to "Motorcycle",
        "maxSpeed" to "230Km/s",
        "maxTank" to "10Ltr")

    // TODO 2
    val type = "Type: "
    val maxSpeed = "Maximal Speed: "
    val maxTank = "Maximal Tank: "


    // TODO 3
    println("Vehicle")
    print(type)
    println(vehicle.getValue("type"))
    print(maxSpeed)
    println(vehicle.getValue("maxSpeed"))
    print(maxTank)
    println(vehicle.getValue("maxTank"))

}