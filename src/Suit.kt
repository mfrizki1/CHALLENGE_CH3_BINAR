open class Suit: InterfaceSuit  {
    private val gunting = "gunting"
    private val batu = "batu"
    private val kertas = "kertas"
    override fun doSuit(pemain_1: String, pemain_2:String): String {
        return when (pemain_1) {
            gunting -> {
                return when (pemain_2) {
                    gunting -> "DRAW!!!"
                    batu -> "Pemain 2 WIN"
                    kertas -> "Pemain 1 WIN"
                    else -> "NULL"
                }
            }
            "batu"->{
                return when(pemain_2){
                    gunting -> "Pemain 1 WIN"
                    batu -> "DRAW!!!"
                    kertas -> "Pemain 2 WIN"
                    else->"NULL"
                }
            }
            "kertas"->{
                return when(pemain_2){
                    batu -> "Pemain 1 WIN"
                    kertas -> "DRAW!!!"
                    gunting -> "Pemain 2 WIN"
                    else->"NULL"
                }
            }
            else -> "HARUS PILIH GUNTING / KERTAS / BATU"
        }

    }
}