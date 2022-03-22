import java.util.Scanner

fun main(){
    val reader3 = Scanner(System.`in`)
    print("Input bilangan = ")
    val power: Int = reader3.nextInt()
    var b = 0
    var i = 2
    do{
        val temp1 = power*i
        i++
        if((temp1 % 2 == 0) || (temp1 % 3 == 0)){
            print("$temp1 ")
            b++
        }
    }while (b < 5)
}
