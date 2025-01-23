import java.io.*;
import java.util.Scanner;

class FileOperation{	
	public static void write(String filename){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the person name: ");
		String name=sc.nextLine();
		System.out.print("Enter the person contact number: ");
		String number=sc.nextLine();
		
		try{
			FileWriter fw = new FileWriter(filename,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(name+"\t"+number+"\n");
			bw.close();
			fw.close();
		}catch(IOException ie){
			System.out.println(ie);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void read(String filename){		
		try{
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);;
			System.out.println("Name\t\tNumber");
			String data;
			while((data=br.readLine())!=null)
				System.out.println(data);
			
			br.close();
			fr.close();
		}catch(IOException ie){
			System.out.println(ie);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

class Ass{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the file name: ");
		String filename=sc.nextLine();
		
		while(true){
			System.out.print("Enter 'w' for write and 'r' for read and 'e' for exit: ");
			char ch=sc.nextLine().charAt(0);
			switch(ch){
				case 'w':
					FileOperation.write(filename);
					break;
				case 'r':
					FileOperation.read(filename);
					break;
				case 'e':
					System.exit(0);
				default:
					System.out.println("Enter valid input.");
			}
		}
	}
}