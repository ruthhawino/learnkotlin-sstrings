import kotlin.math.PI

fun main(){
statement("Ruth", 23)
greeting("caren")
greeting("sara",73)
statemennt("Ruth")
    volumeOfCube(3)
    volumeOfCylinder(4.24,4.32)
}
fun greeting(name:String){
    println("Hello $name")
}
fun statement(name: String,age:Int){
 println("My name is $name and am $age years old")


}
fun greeting(name: String,age: Int):String{
 return ("My name is $name and am $age years old")
}
fun statemennt(name:String):String{
    return ("Hello $name how are doing today?")
}
fun volumeOfCube(side:Int){
    println(side*side*side)

}

fun volumeOfCylinder(radius:Double,height:Double){


println(PI* radius*radius*height)
}