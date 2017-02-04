// src/main/scala/progscala/fp/basics/hofs_closure2_example.sc

object hofs_closure2_example {
	
	def m1 (multiplicador: Int => Int) ={
		(1 to 10).filter(_ %2==0).map(multiplicador).reduce(_*_)
	}                                         //> m1: (multiplicador: Int => Int)Int

	def m2: Int=> Int ={
		val factor = 2
		val mult= ( i:Int)=>i*factor
		mult
	}                                         //> m2: => Int => Int

	m1(m2)                                    //> res0: Int = 122880


}