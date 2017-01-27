package awale.ia.test

import awale.ia.Awale

class ModeText (var awale : Awale)
{
  
  def awale_ (aw: Awale) = awale = aw 

  
  def modeText (): Unit = {
    println
    for (i <- 0 until awale.monkabe.length)
    {
      if (i%awale.monkabe.length-1 == 0) println
      print("|"+awale.monkabe(i)+"|")
    }
  }
  
  
}