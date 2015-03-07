
package DSApp;

public class timedModifier extends modifier{
  public int turnsremaining;
  
  
  public timedModifier(int wert, String descriptor, int turns){
    super(wert, descriptor);
    turnsremaining = turns;
  }
  
  public timedModifier(timedModifier that){
    this(that.wert, that.descriptor, that.turnsremaining);
  }
  
  public String toString(){
    return descriptor+": "+wert+" Turns remaining: "+turnsremaining;
  }
  
  public void tickDown(){
    turnsremaining--;
  }
}
