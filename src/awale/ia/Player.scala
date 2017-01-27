package awale.ia

/**
 * @author blegr
 */

class Player (val id: String, val debutPot: Int, val finPot: Int, var posCur: Int)
{
  
  def isPosOk (): Boolean = if (posCur>=debutPot && posCur<=finPot) true else false
  
  

}
