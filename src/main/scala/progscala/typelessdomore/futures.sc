//src/main/scala/progscala/typelessdomore/futures.sc

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object futures{
	
	def sleep(milis: Long) = {
		Thread.sleep(milis)
	}                                         //> sleep: (milis: Long)Unit
	
	def doWork(index: Int) = {
		sleep((math.random*5000).toLong)
		index
	}                                         //> doWork: (index: Int)Int

	/*
	genera 5 nnumeros y los pasa al foreach, que tiene una f.Lambda
	declara un futuro que llama a doWork
	Future.apply devuelve un nuevo objeto futuro, que ejecuta el doWork
	inmediatamente regresa al bucle
	*/
	(1 to 5) foreach { index =>
		val future =Future {
			doWork(index)
		}
		
		/* callback */
		future onSuccess {	/* en caso satisfactorio*/
			case answer: Int => println(s"Success! returned: $answer")
		}
		
		future onFailure { /* en caso de fallo */
			case th: Throwable => println("FAILURE! returned: $th " )
		}
	}
	sleep(5000)                               //> Success! returned: 1
                                                  //| Success! returned: 4
                                                  //| Success! returned: 5
                                                  //| Success! returned: 2
                                                  //| Success! returned: 3
	println("FIN")                            //> FIN
}