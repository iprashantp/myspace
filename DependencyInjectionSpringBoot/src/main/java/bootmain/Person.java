package bootmain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	Food food;
	
	public void speak() {
		System.out.println("lets have a chit chat");
	}
	public void eat() {
		System.out.println("Person.eat() is called");
		food.recipes();
	}
}
