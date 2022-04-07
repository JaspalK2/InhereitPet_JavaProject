public class InheritePet{
    public static void main(String[] args) {
        System.out.println(" Here are all our birds");
        
        Parakeet myParakeet = new Parakeet();
        myParakeet.setName(" Pete the parakeet");
        myParakeet.setCage(true);
        myParakeet.trick();
        myParakeet.eat();
        myParakeet.sleep();
        if(myParakeet.hasCage() == true){
            System.out.println(myParakeet.getName() + " Has a bird cage");
        }
        else{
            System.out.println(myParakeet.getName() + " Does not have a bird cage");
        }
        

        Canary myCanary = new Canary();
        myCanary.setName("Carl the Canary");
        myCanary.talk();
        myCanary.eat();
        myCanary.sleep();
        if(myCanary.hasCage() == true){
            System.out.println(myCanary.getName() + " Has a bird cage");
        }
        else{
            System.out.println(myCanary.getName() + " Does not have a bird cage");
        }

        System.out.println("Here are all my Rodents");

        Gerbil myGerbil = new Gerbil();
        myGerbil.setName("Gary the Gerbil");
        myGerbil.setrodentKennel(true);
        myGerbil.purr();
        myGerbil.eat();
        myGerbil.sleep(); 
        if(myGerbil.hasKennel() == true){
            System.out.println(myGerbil.getName() + " Has a kennel");
        }
        else{
            System.out.println(myGerbil.getName() + " Does not have a kennel");
        }
        GuneaPig myGuneaPig = new GuneaPig();
        myGuneaPig.setName("Pete the parakeet");
        myGuneaPig.whistle();
        myGuneaPig.eat();
        myGuneaPig.sleep();
        if(myGuneaPig.hasKennel() == true){
            System.out.println(myGuneaPig.getName() + " Has a kennel");
        }
        else{
            System.out.println(myGuneaPig.getName() + " Does not have a kennel");
        }
    }

}