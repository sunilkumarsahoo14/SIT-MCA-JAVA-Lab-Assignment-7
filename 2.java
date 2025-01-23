import java.io.*;
import java.util.Scanner;

class Ass{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Enter the file name: ");
			String filename=sc.nextLine();
			FileWriter fw = new FileWriter(filename);
			System.out.print("Enter the content to write in "+filename+" file: ");
			String data=sc.nextLine();
			fw.write(data);
			fw.close();
			
			FileReader fr = new FileReader(filename);
			int ch;
			while((ch=fr.read())!=-1){
				System.out.print((char)ch);
			}
		}catch(IOException ie){
			System.out.println(ie);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}