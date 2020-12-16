open class Suit  {
    open fun doSuit(pem_1: String, pem_2:String): String{
        return when (pem_1) {
            "gunting" -> {
                return when (pem_2) {
                    "gunting" -> "DRAW!!!"
                    "batu" -> "Pemain 2 WIN"
                    "kertas" -> "Pemain 1 WIN"
                    else -> "NULL"
                }
            }
            "batu"->{
                return when(pem_2){
                    "gunting" -> "Pemain 1 WIN"
                    "batu" -> "DRAW!!!"
                    "kertas" -> "Pemain 2 WIN"
                    else->"NULL"
                }
            }
            "kertas"->{
                return when(pem_2){
                    "batu" -> "Pemain 1 WIN"
                    "kertas" -> "DRAW!!!"
                    "gunting" -> "Pemain 2 WIN"
                    else->"NULL"
                }
            }
            else -> "NULL"
        }

    }
}