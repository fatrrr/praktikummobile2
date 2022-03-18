import kotlin.math.pow

fun main(){
    println("Input bilangan = ")
    val power: Int = readln().toInt()
    var b = 0
    for(i in 1..50){
        val temp1 = power*i
        if((temp1 % 2 == 0) || (temp1 % 3 == 0)){
            print("$temp1 ")
            b++
        }
        if(b == 5){break}
    }
}
//5 = 10 15 20 30 40