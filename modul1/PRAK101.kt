import java.util.Scanner

fun main(){
    val reader1 = Scanner(System.`in`)
    print("Waktu Sekarang : ")
    val waktu: String = reader1.nextLine()
    print("Nama Anda : ")
    val nama: String = reader1.nextLine()
    print("Umur Anda : ")
    val umur: Int = reader1.nextInt()
    print("Suhu Tubuh Anda : ")
    val suhu: Double = reader1.nextDouble()
    reader1.close()

    println("Selamat $waktu, $nama.")
    println("Umur anda $umur Tahun.")
    println("Suhu Tubuh anda $suhu derajat Celcius.")
}