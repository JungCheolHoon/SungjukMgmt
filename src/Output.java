//private는 같은 클래스내에서 사용이 자유로운가, 주소는 왜 안넘어가지
public class Output {
	public void print(Student [] array, int count){
		for(int i = 0 ; i <count ; i++) {
			System.out.println(array[i]);		//array[i].toString()
		}
	}
	
	private void printLabel() {
		System.out.println("<<<<<<<<<센텀대학교 성적관리프로그램>>>>>>>>>");
		System.out.println("학번\t이름\t국어\t영어\t수학\t전산\t총점\t평균\t평점");
		System.out.println("-------------------------------------------------------------------");
	}
}
