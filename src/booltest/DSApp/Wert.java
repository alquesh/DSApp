package DSApp;

import java.util.HashSet;


public class Wert {
  public String name;
  public int value;
  public HashSet<modifier> modifiers;
  
  public Wert(int value,String name){
    this.name = name;
    this.value = value;
    modifiers = new HashSet<modifier>();
  }

  public Wert(Wert that){
    this(that.value, that.name);
  }
  
  public int netValue(){            //calculates the actual value based on
    int result = value;             //positive and negative modifiers
    for(modifier m : modifiers){    //negative actual values are considered as 0
      result = result + m.wert;
    }
    if (result < 0){
      result = 0;
    }
    return result;
  }
  
  public String toString(){
    return name+": "+netValue();
  }
  
  public String descriptor(){
    return name;
  }
  
  public void addModifier(modifier m){
    modifiers.add(m);
  }
}
