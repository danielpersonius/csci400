object Identity {
    def identity(x:Any) : Any = {
        x
    }

    def main(args: Array[String]) {
        args.foreach { case a =>
            println("Command line argument: '"+identity(a)+"'")
        }
    }
}
