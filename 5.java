import java.io.*;
import java.util.Scanner;

class Ass{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Enter the file name: ");
			String filename=sc.nextLine();
			FileReader fr = new FileReader(filename);
			int ch,count=0;
			while((ch=fr.read())!=-1)
				if(ch==32 || ch==10)
					count++;
				
			System.out.print("Total number of words is/are: "+(count+1));
			fr.close();
		}catch(IOException ie){
			System.out.println(ie);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}