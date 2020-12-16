import kotlin.random.Random

fun main() {
    val suit = Suit()
    println("===============================")
    println("GAME SUIT TERMINAL VERSION")
    println("===============================")
    print("Masukkan pemain 1 : ")
    val pemain_1 = readLine().toString()
    val pemain_2 = arrayOf("gunting", "batu", "kertas")
    val random = Random.nextInt(pemain_2.size)
    val musuh = pemain_2[random]
    println("Masukkan pemain 2 : $musuh")

    println("Hasil : ")
    val pemenang = suit.doSuit(pemain_1, musuh)
    print(pemenang)


}