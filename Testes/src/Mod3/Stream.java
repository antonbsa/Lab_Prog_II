package Mod3;
import java.io.File;
public class Stream {
	public static void main(String[] args) {
		
		File f = new File("C:\teste\"");
		
		if (f.isDirectory()) {
			}
		System.out.println("Nome: " + f.getName());
	}
}