import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CodeToLength {

	public static void main(String[] args) throws FileNotFoundException {
		
		long length = 0;
		final double FONT_TO_INCHES = 0.13283519999988974;
		double inches;
		double feet;
		double miles;
		
		
		File file = new File("fat12.c");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()){
			String s = sc.nextLine();
			length+=s.length();
		}
		
		sc.close();
		inches = length*FONT_TO_INCHES;
		feet = inches/12;
		miles = feet/5280;
		
		System.out.printf("Your codes is: %4.2f inches %4.2f feet %4.3f miles", inches,feet,miles);

	}

}
