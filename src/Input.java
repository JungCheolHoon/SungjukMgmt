import java.util.Scanner;

public class Input {
	private Student [] array;			//Input 클래스 내에 많은 메소드가 생기면 Student 배열을 계속해서 받아야 하므로 지역변수로 선언함
	private Scanner sc;
	
	public Input(Student[] array) {
		this.array = array;
		this.sc = new Scanner(System.in);
	}
	public int input() {
		String io = null;
		int count = 0;
		do {
			count++;
			Student student = new Student();
			System.out.print("Hakbun : ");		String Hakbun = this.sc.nextLine();
			System.out.print("Name : ");		String name = this.sc.nextLine();
			System.out.print("Korean : ");		int kor = this.sc.nextInt();
			System.out.print("English : ");		int eng = this.sc.nextInt();
			System.out.print("Math : ");		int math = this.sc.nextInt();
			System.out.print("EDPS : ");		int edp = this.sc.nextInt();
			this.sc.nextLine();
			
			this.array[count-1] = new Student(Hakbun, name, kor, eng, math, edp);
			
			System.out.print("계속(I/O) ? : ");
			io = this.sc.next();
			
		}while( io.equals("I") || io.equals("i") );
		
		return count;
	}
}
