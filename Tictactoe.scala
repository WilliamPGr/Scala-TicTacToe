@main def mainfunction(): Unit = {
        val colors = scala.collection.mutable.Map("turn" -> "x", "a1" -> " ", "a2" -> " ","a3" -> " ", "b1" -> " ", "b2" -> " ","b3" -> " ", "c1" -> " ", "c2" -> " ","c3" -> " ")
        def tick(): Unit = {
            if (colors("turn") == "x") {
                colors("turn") = "o" 
            } else {
                colors("turn") = "x" 
            }
        }
        def printboard(): Unit = {
            print("a1 [" + colors("a1") + "] " + "a2 [" + colors("a2") + "] " + "a3 [" + colors("a3") + "]\n" + "b1 [" + colors("b1") + "] " + "b2 [" + colors("b2") + "] " + "b3 [" + colors("b3") + "]\n" + "c1 [" + colors("c1") + "] " + "c2 [" + colors("c2") + "] " + "c3 [" + colors("c3") + "]\n")
        }
        def main(): Unit = {
            print("Choose placement: ")
            val inputmain = scala.io.StdIn.readLine()
            colors(inputmain) = colors("turn")
            tick()
            printboard()
            main()
        }
        printboard()
        main()
}