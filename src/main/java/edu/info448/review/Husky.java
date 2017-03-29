package edu.info448.review; //package declaration (needed)

public class Husky extends Dog implements Huggable {
  /* class body goes here */
  public Husky(String name){
  	super(name, "Husky");

  }

  public Husky(){
  	super("Doggo", "Husky");
  }
  public void pullSled(){
  	System.out.println(this.toString() + " is pullin' the sled!");
  }

  public void bark(){
  	System.out.println(this.toString() + " barks like a husky!");
  }

  public void hug(){
  	System.out.println("u guys hugged");
  }
}

