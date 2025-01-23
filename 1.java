import java.io.*;
import java.util.Scanner;

class Ass{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Enter the file name: ");
			String filename=sc.nextLine();
			FileOutputStream fo = new FileOutputStream(filename);
			System.out.print("Enter the content to write in "+filename+" file: ");
			String data=sc.nextLine();
			byte byteData[]=data.getBytes();
			fo.write(byteData);
			fo.close();
			
			FileInputStream fi = new FileInputStream(filename);
			int ch;
			while((ch=fi.read())!=-1){
				System.out.print((char)ch);
			}
		}catch(IOException ie){
			System.out.println(ie);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}