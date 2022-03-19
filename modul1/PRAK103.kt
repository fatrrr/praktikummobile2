import kotlin.math.pow

fun main(){
    print("Input bilangan = ")
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