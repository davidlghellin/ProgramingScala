// src/main/scala/progscala/implicits/implicit_args.sc

object implicit_args {

  /*
		Definimos una funcion que un parametro es un implicito
	*/
  def calcTax(amount: Float)(implicit ratio: Float): Float = amount * ratio
                                                  //> calcTax: (amount: Float)(implicit ratio: Float)Float
  object SimpleStateSalesTax
  {
    implicit val ratio: Float = 0.05F
  }

  case class ComplicatedSalesTaxData(baseratio: Float, isTaxHoliday: Boolean, storeId: Int)

  object ComplicatedSalesTax
  {
    private def extraTaxratioForStore(id: Int): Float = {
      // From id, determine location, then extra taxes...
      0.0F
    }
    /*
     Nuevo implicito interno
    */
    implicit def ratio(implicit cstd: ComplicatedSalesTaxData): Float =
    {
      if (cstd.isTaxHoliday) 0.0F
      else cstd.baseratio + extraTaxratioForStore(cstd.storeId)
    }
  }

  {
    import SimpleStateSalesTax.ratio //importamos el implicito interno
    val amount = 100F
    println(s"Tax on $amount = ${calcTax(amount)}")
  }                                               //> Tax on 100.0 = 5.0

  {
    import ComplicatedSalesTax.ratio
    implicit val myStore = ComplicatedSalesTaxData(0.06F, false, 1010)
    val amount = 100F
    println(s"Tax on $amount = ${calcTax(amount)}")
  }                                               //> Tax on 100.0 = 6.0

  {
    import ComplicatedSalesTax.ratio
    implicit val myStore = ComplicatedSalesTaxData(0.06F, true, 1010)
    val amount = 100F
    println(s"Tax on $amount = ${calcTax(amount)}")
  }                                               //> Tax on 100.0 = 0.0
}

/*
Aqui podemos ver que estamos declarando una funcion, y estamos asignado valores por defecto
en caso de que no pasemos parametros

*/