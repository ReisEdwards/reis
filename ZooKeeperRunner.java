/*********************************************
 * Sample solution Activity 4.9.2
 *********************************************/
 public class ZooKeeperRunner
 {

  public static void hearTheAnimal(Animal currentAnimal)
  {
    
    currentAnimal.speak();
  }
   public static void main(String[] args)
   {
    /* 
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.trumpet();
    elephant.forage();
    elephant.eat();
    elephant.isNocturnal();
    elephant.getLifeSpan();
    
    System.out.println();
   
    Tiger tiger = new Tiger("meat", true, 17.0);
    tiger.swim();
    tiger.huntAlone();
    tiger.growl();
    tiger.eat();
    tiger.isNocturnal();
    
    System.out.println();
    
    Tiger tiger2 = new Tiger();
    Elephant elephant2 = new Elephant();

    Gorilla gorilla = new Gorilla();
    
    System.out.println();
    
    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    giraffe.eat();
    
    System.out.println();
    
    Hippo hippo = new Hippo();
    hippo.eat();
    
    System.out.println();
  
    Penguin penguin = new Penguin();
    penguin.fish();
    
    System.out.println();
    
    Owl owl = new Owl();
    owl.hunt();
    Owl owl2 = new Owl("mice,insects", true, 4.0);
    owl2.eat();
    
    System.out.println();
    
    Animal a1 = new Animal();
    a1.sleep();
    Object a2 = new Animal();
    */

    /*4.9.5 your turn
    Deer deer = new Deer();
    hearTheAnimal(deer);
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    hearTheAnimal(elephant);
    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    hearTheAnimal(giraffe);
    Gorilla gorilla = new Gorilla();
    hearTheAnimal(gorilla);
    Hippo hippo = new Hippo();
    hearTheAnimal(hippo);
    Monkey monkey = new Monkey();
    hearTheAnimal(monkey);
    Owl owl = new Owl("mice,insects", true, 4.0);
    hearTheAnimal(owl);
    Penguin penguin = new Penguin();
    hearTheAnimal(penguin);
    Lion lion = new Lion();
    hearTheAnimal(lion);
    Tiger tiger = new Tiger("meat", true, 17.0);
    hearTheAnimal(tiger);
    */
/* 
    deer.speak();
    elephant.speak();
    giraffe.speak();
    gorilla.speak();
    hippo.speak();
    lion.speak();
    monkey.speak();
    owl.speak();
    penguin.speak();
    tiger.speak();
*/
    Animal a = new Elephant("leaves, grasses, roots", false, 60.0);
    a.isNocturnal();
    //Program can not call a method from elephant as it is defined by an animal
    //a.trumpet();
    Animal a1 = new Animal();
    a1.sleep();
    //Object a2 = new Animal();
    //a2.sleep();
    
    Object o = new Object();
    System.out.println(o.toString());
    Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(e.toString());

    Animal a3 = new Animal();
    System.out.println(a3.toString());
    Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(a4.toString());

    Object o2 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(o2.toString());



   }
 }