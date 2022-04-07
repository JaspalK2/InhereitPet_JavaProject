import javax.management.loading.PrivateMLet;

public class Bird {
    private String name;
    private Boolean birdCage = false;
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
  public boolean hasCage(){
   return birdCage;
  }
  public void setCage(boolean b){
  birdCage = b;
  }
    
}
