import arrow.core.curried

fun main(args: Array<String>) {
    println("Hello World!")

    val curriedAdd: (Int) -> (Int) -> Int = { x-> {y-> x+y} }

    val fn = curriedAdd(2);
    println("Funcion "+fn)

    //val fn2 = curriedAdd.invoke(2);
    //print(fn2);


    val ret1 = curriedAdd(2)(3);
    println("CurriedAdd = $ret1");

    //-----*-------------------------------------------
    //val add = {Integer x, Iteger y} -> x+y
    //val s1 = add.aplly(2,3)
    val add = {x: Int, y:Int -> x+y}
    val s1 = add(2,3) //add.invoke(2,3)
    println("add(2,3)= $s1")

    val addCurried = add.curried();//da una extension para el NiFunction agregando curring
    val s2 = addCurried(2)(3)
    println("addCurried(2,3)= $s2")

    //Mas practico
    val add2 = {x: Int, y:Int -> x+y}.curried()
    val s21 = add2(2)(3)
    println("add2(2,3)= $s21")

    //Funcion de tres argumentos
    val add3 = {x: Int, y:Int, z:Int -> x+y+z}.curried()
    println("add3= "+add3(2))
    println("add3= "+add3(2)(3)(4))
    //Este lenguaje tiene construcciones funcionales pero la sintaxis no es tan natural,
}