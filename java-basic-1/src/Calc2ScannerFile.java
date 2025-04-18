import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Calc2ScannerFile {

	public static void main(String args[]){
		try{
			File file = new File("targetfile.txt");
			Scanner scan = new Scanner(file);
			//scan.useDelimiter("¥n");

			int line = 1;

			while(scan.hasNext()){
				String str = scan.next();
				System.out.println(line + ":" + str);
				line += 1;
			}
            scan.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
	}
}