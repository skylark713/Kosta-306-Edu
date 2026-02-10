package ex0205.array;

class MultiArray{
//정수형 2차원 배열 8*9
	// int [][] arr;
	int arr [][] = new int [8][9]; // 모두 0
	// int [][] arr = new int [8][]; // 행마다 다른 열...
//메소드이름 :array99
	//for loop 를 사용하여 
	//배열에 곱한 (구구단)결과저장
	//배열에 결과를 꺼내출력
	/*int [][] arr = new int [][] { // new int [][] 생략가능.
		{1, 3, 4},
		{2,4,6,7,10},
		{2}
	};*/
	
	public void array99(){
		// 각 행의 열을 생성
		//arr[0] = new int [3];// int [][] arr = new int [8][]; 일 때, 생성 필요
		//arr[1] = new int [1];
		
		/*System.out.println(arr); // 주소값 [[@숫자]] - 2차원
		System.out.println(arr[0]); // 주소값 [@숫자] - 1차원
		System.out.println(arr[0][0]); // 초기화 0 */
		
		int len1 = arr.length;
		for(int row=0; row<len1; row++) {
			int len2 = arr[row].length;
			for(int col=0; col<len2; col++) {
				arr[row][col]=(row+2) * (col+1);
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---개선된 for ---");
		for(int [] row : arr) {
			for(int v: row) {
				System.out.print(v+" ");
			}
			System.out.println();
		}
	}		
}
public class MemoryApart{
	//main메소드에서 
	//MultiArray객체의 array99메소드호출
	public static void main(String[] args) {
		new MultiArray().array99();
	}
}
