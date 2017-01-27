package awale.ia.test

import awale.ia.Awale
import awale.ia.Player

/**
 * @author blegr
 */
object TestAwale extends App {
  
  override def main (args: Array[String]): Unit =
  {
    val a : Awale = new Awale  
    
   for (e <- a.monkabe) yield print(e)
   println
   
   a.distribute(5,_+1)
   for (e <- a.monkabe) yield print(e)
   println
   
   a.distribute(9,_+1)
   for (e <- a.monkabe) yield print(e)
   println
    
   a.distribute(11,_+1)
   for (e <- a.monkabe) yield print(e)
   println
   
   /*a.platoGain(new Player("toto",0,5,0))
   println
   
   a.monkabe(4) = 2
   
   a.platoGain(new Player("toto",0,5,0))
   println
   
   a.monkabe(3) = 3
   a.monkabe(4) = 2
   
   a.platoGain(new Player("toto",0,5,0))
   println
   
   a.monkabe(1) = 2
   a.monkabe(3) = 3
   a.monkabe(4) = 2
   
   a.platoGain(new Player("toto",0,5,0))
   println
   
   a.monkabe(1) = 2
   a.monkabe(2) = 2
   a.monkabe(3) = 3
   a.monkabe(4) = 2
   
   a.platoGain(new Player("toto",0,5,0))
   println*/
   
   a.monkabe(1) = 2
   a.monkabe(2) = 2
   a.monkabe(3) = 3
   a.monkabe(4) = 2
   a.monkabe(5) = 2
   
   //a.platoGain(new Player("toto",0,5,0))
   println
   
  }
  
}