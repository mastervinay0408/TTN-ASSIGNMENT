fun main(ars:Array<String>) {
    var operation = SubClassA("Subclass1")
    //var operation=SubClassB("Subclass2")
    //var operation=SubClassC("Subclass3")

    var result = myFunc(operation)
    print("$result")

}

sealed class Base
class SubClassA(var str: String) : Base()
class SubClassB(var str: String) : Base()
class SubClassC(var str: String) : Base()


fun myFunc(base: Base) = when (base) {
    is SubClassA -> base.str
    is SubClassB -> base.str
    is SubClassC -> base.str

}