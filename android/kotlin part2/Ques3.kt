 open class Bank {

     open var name: String = "bank"
     open var starting_year: Int = 100
     open var ROI: Double = 2.25

     fun getdetails() {
         println(name)
         println(starting_year)
         println(ROI)
     }
 }

    class SBI : Bank(){
       override var name:String="SBI "
        override var starting_year: Int=2001
        override var ROI:Double=7.75

    }
     class BOI : Bank(){
         override var name:String="BOI "
         override var starting_year: Int=2005
         override var ROI:Double=7.65

     }
     class ICICI : Bank(){
         override var name:String="ICIC "
         override var starting_year: Int=2003
         override var ROI:Double=7.7

     }



 fun main(){

     var obj=SBI()
     obj.getdetails()
     var obj2=BOI()
     obj2.getdetails()
     var obj3=ICICI()
     obj3.getdetails()




 }