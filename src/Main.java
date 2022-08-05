//private는 같은 클래스내에서 사용이 자유로운가, 주소는 왜 안넘어가지
public class Main {
	public static void main(String[] args) {
			Student [] array = new Student[100];
			Input input = new Input(array);
			int count = input.input();
			
			Calc calc = new Calc(array);
			calc.calc(count);
			
			Sort sort = new Sort(array,count);
			sort.bubbleSort();
			
			Output output = new Output();
			output.print(array, count);
			
	}
}
