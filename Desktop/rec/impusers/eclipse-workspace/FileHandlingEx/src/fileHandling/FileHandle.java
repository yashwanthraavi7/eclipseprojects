package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File  myObj = new File("C:\\Users\\sriha\\Desktop\\FileHandling\\newfile.txt");
			if(myObj.createNewFile()) {
				System.out.println("file created: "+ myObj.getName());
			}
			else {
				System.out.println("already");
			}
			
		} 
		catch (Exception e) {
			System.out.println("error occured");
			
			e.printStackTrace();
		}

	}

}
