public class Rodent {
    private String name;
    private Boolean rodentKennel = false;
    private int energy;
    private int happy;
    public void setName(String name)
  {
    this.name = name;
  }
  
  public String getName()
  {
    return name;
  }
  
  public void eat()
  {
    energy += 10;
    happy += 5;
    System.out.println("mealtime!");
  }

  public void sleep()
  {
    energy += 5;
    System.out.println("zzzzzzzzzzzzzzzzzzz");
  }
public boolean hasKennel(){
 return rodentKennel;
}
public void setrodentKennel(boolean b){
rodentKennel = b;
}
}
