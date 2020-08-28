package bootmain;

import org.springframework.stereotype.Component;

@Component
public class Food {
	public void recipes() {
		System.out.println("Food.recipes() is called");
		System.out.println("food recipe is simple!");
	}
}
