import java.util.Scanner
import kotlin.math.pow

fun main(){
    val reader2 = Scanner(System.`in`)
    println("Nilai x = ")
    val eksu: Int = reader2.nextInt()
    reader2.close()

    val hasil = 2 * (eksu.toDouble().pow(2)) + (5 * eksu) - 8
    println(hasil.toInt())
}