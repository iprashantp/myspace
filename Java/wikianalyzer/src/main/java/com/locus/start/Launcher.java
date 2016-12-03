package com.locus.start;

import com.locus.utility.LinkAnalyzer;
import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkAnalyzer object = new LinkAnalyzer();
		while (true) {
			System.out.println("please enter URL");

			String sourcepage = input.next();

			String popularLink = object.getMostPopularLink(sourcepage);
			if (popularLink == "")
				System.out.println("no link is present in the source page.");
			else if (popularLink == null)
				System.out.println("connection error!!");
			else
				System.out.println("Most popular link(s) in page:\n"
						+ sourcepage + "\nis\n" + popularLink);
			
			System.out.println("to continue press 1 any other key otherwise");
			int uinput;
			try{
				uinput=input.nextInt();
			}catch(Exception e){
				break;
			}
			if(uinput==1)
				continue;
			else 
				break;
		}
	}
}
