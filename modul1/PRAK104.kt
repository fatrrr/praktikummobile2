class Smartphone(
    private val nama: String = "Samsung Note 10+",
    private val tahun: Int = 2019){
    fun show(){
        println("Nama HP = $nama")
        println("Tahun Release = $tahun")
    }
}
fun main(){
    val a : Smartphone = Smartphone()
    a.show()
}