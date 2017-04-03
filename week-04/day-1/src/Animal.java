/**
 * Created by Connor on 2017.04.03..
 */
public class Animal {

 /* Create Animal class
  Every animal has a hunger value, which is a whole number
  Every animal has a thirst value, which is a whole number
    when creating a new animal object these values are created with the default 50 value
  Every animal can eat() which decreases their hunger by one
  Every animal can drink() which decreases their thirst by one
  Every animal can play() which increases both by one*/

  int hunger;
  int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    this.hunger -= 1;
  }

  public void drink() {
    this.thirst -= 1;
  }

  public void play() {
    this.hunger += 1;
    this.thirst += 1;
  }

  public static void main(String[] args) {
    Animal hippo = new Animal();
    System.out.println(hippo.hunger);
    System.out.println(hippo.thirst);
    hippo.play();
    System.out.println(hippo.hunger);
    System.out.println(hippo.thirst);
    hippo.drink();
    System.out.println(hippo.thirst);
    hippo.eat();
    hippo.eat();
    System.out.println(hippo.hunger);

    Animal giraffe = new Animal();
    giraffe.hunger = 30;
    giraffe.eat();
    System.out.println(giraffe.hunger);
  }


}
