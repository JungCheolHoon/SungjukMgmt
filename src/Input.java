//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
import java.util.Scanner;

public class Input {
	private Student [] array;			//Input 클래스 내에 많은 메소드가 생기면 Student 배열을 계속해서 받아야 하므로 지역변수로 선언함
	private Scanner sc;
//	private File file;
//	private BufferedReader br;
	
	public Input(Student[] array) {					
		this.array = array;
		sc = new Scanner(System.in);
//		this.file = new File("C:/Temp/sungjuk_utf8.dat");				//파일 만들기
//		try {
//			this.br = new BufferedReader(new FileReader(this.file));
//		} catch (FileNotFoundException e) {
//			System.out.println("File Not Found");
//		}
		
//		try {
//			this.sc = new Scanner(file,"utf-8");
//		} catch (FileNotFoundException e) {
//			System.out.println("File Not Found");
//		}
	}
	
//	public int fileInput() {				//파일 읽기
//		int count = 0;
//		while(true) {
//			String line = null;
//			try {
//				line = this.br.readLine();
//				if(line == null) break;
////				System.out.println(line);
////				1101		한송이	78		87		83		78
//				String [] lines = line.split("\\s+");			//스페이스를 기준으로 자른다
//				System.out.println(lines[2]);	
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			count++;
//
//		}
//		return count;
//	}
	
	public int input() {
		String io = null;
		int count = 0;
		do {
			count++;
			System.out.print("Hakbun : ");		String Hakbun = this.sc.nextLine();
			System.out.print("Name : ");		String name = this.sc.nextLine();
			System.out.print("Korean : ");		int kor = this.sc.nextInt();
			System.out.print("English : ");		int eng = this.sc.nextInt();
			System.out.print("Math : ");		int math = this.sc.nextInt();
			System.out.print("EDPS : ");		int edp = this.sc.nextInt();
			this.sc.nextLine();
			
			
			this.array[count-1] = new Student(Hakbun, name, kor, eng, math, edp);
			System.out.print("계속(I/O) ? : ");
			io = this.sc.nextLine();
			
		}while( io.equals("I") || io.equals("i") );
		
		return count;
	}
}
