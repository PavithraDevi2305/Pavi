package abstraction_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sample=s.nextLine();
		MyMovie mm=new MyMovie();
		mm.display(sample);
		
	}

}
