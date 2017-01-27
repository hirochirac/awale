package awale.ia

/**
 * @author blegr
 */

class Awale
{

  // initialiser le monkabe
  var monkabe: Array[Int] = Array.fill(12)(4)
 
  /**
   * distribuer les graines du pot choisi par le joueur. 
   */
  def distribute (choix: Int, f: Int => Int) =
  {
    def distrib (i: Int): Array[Int] =
    {
      if ( monkabe(choix) > 0  )
      {
        //println(i)
        if (i == choix)
        {
          distrib(f(i))
        }
        else
        {
          if (i<0) distrib(monkabe.length-1)
          else if (i>monkabe.length-1) distrib(0)
          else
          {
            monkabe(i) += 1
            monkabe(choix) -= 1
            distrib(f(i))
          }
        }
      }
      else
      {
        this.monkabe
      }
    }
    distrib(choix)
  }
  
  /**
   * Determiner les pots consécutifs à récolter.
   * @param p: Player
   * @return List[Int]
   */
  def recolter (p: Player): List[Int] =
  {
    def isPlato (i: Int, tmp: List[Int], plato: List[Int]): List[Int] =
    {
      if (i<=p.finPot)
      {
        if (monkabe(i) != 2 || monkabe(i) != 3)
        {
          // println("--- index --->"+i+"--- monkabe(i) --- "+monkabe(i))
          if (tmp.length-1>plato.length-1)
          {
            isPlato(i+1,Nil,tmp)
          }
          else
           isPlato(i+1, tmp, plato)
        }
        else 
        {
          isPlato(i+1, monkabe(i)::tmp, plato)
        }
      }
      else
      {
        plato.foreach { println }
        plato
      }
    }
    isPlato(p.debutPot,Nil,Nil)
  }
  
}