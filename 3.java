import java.io.*;
import java.util.Scanner;

class Ass{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Enter the source file name: ");
			String source=sc.nextLine();
			System.out.print("Enter the destination file name: ");
			String destination=sc.nextLine();
			FileReader fr = new FileReader(source);
			FileWriter fw = new FileWriter(destination);
			BufferedWriter bw = new BufferedWriter(fw);
			BufferedReader br = new BufferedReader(fr);
			String data;
			while((data=br.readLine())!=null){
				bw.write(data);
			}
			bw.close();
			fw.close();
			br.close();
			fr.close();
		}catch(IOException ie){
			System.out.println(ie);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}