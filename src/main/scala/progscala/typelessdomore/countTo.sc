//src/main/scala/progscala/typelessdomore/countTo.sc




object countTo {
	def countTo(n: Int) :Unit = {
		def contar(i: Int) :Unit = {
			if(i<=n) {println(println(i));contar(i+1)}
		}
		contar(1)
	}                                         //> countTo: (n: Int)Unit

	countTo(3)                                //> 1
                                                  //| ()
                                                  //| 2
                                                  //| ()
                                                  //| 3
                                                  //| ()
}