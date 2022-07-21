
public class Main {

	public static void main(String[] args) {
//		interface = a template that ca be applied to a class
//					similar to ingertance, but specifies what clas has/must do.
//					classes can apply more than one interface, inheritance is limited to 1 super
		
		Rabbit rabbit = new Rabbit();
		Hawk hawk = new Hawk();
		Fish fish = new Fish();
		
		rabbit.flee();
		hawk.hunt();
		fish.flee();
		fish.hunt();
						

	}

}
