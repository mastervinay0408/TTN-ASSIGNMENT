class overloading{
    fun over(s1:Int,s2:Int){
        println(s1+s2)
    }
    fun over(s1:Double,s2:Double){
        println(s1+s2)
    }
    fun over(s1:Float,s2:Float){
        println(s1+s2)
    }
    fun over(s1:String,s2:String){
        println(s1+s2)
    }
    fun over(s1:String,s2:String,s3:String){
        println(s1+s2+s3)
    }
}



fun main(){

    var obj=overloading()
    obj.over(5,6)
    obj.over(5.6,7.6)
    obj.over(5.5f,6.6f)
    obj.over(5,6)
    obj.over("hello","world")
    obj.over("hello","world","rahul")



}