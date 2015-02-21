public class modifier{
  public int wert;
  public String descriptor;
  
  public modifier(int wert, String descriptor){
    this.wert = wert;
    this.descriptor = descriptor;
  }
  
  public modifier(modifier that){
    this(that.wert, that.descriptor);
  }
  
  public String toString(){
    return descriptor+": "+wert;
  }
}
