import java.util.Scanner

fun main(){
    val reader1 = Scanner(System.`in`)
    println("Waktu Sekarang : ")
    val waktu: String = reader1.nextLine()
    println("Nama Anda : ")
    val nama: String = reader1.nextLine()
    println("Umur Anda : ")
    val umur: Int = reader1.nextInt()
    println("Suhu Tubuh Anda : ")
    val suhu: Double = reader1.nextDouble()
    reader1.close()

    println("Selamat $waktu, $nama.")
    println("Umur anda $umur Tahun.")
    println("Suhu Tubuh anda $suhu derajat Celcius.")
}