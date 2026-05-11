package ex0205.이예진;

public class ArrayExercise08 {
	public static void main(String[] args) {
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		int len1 = array.length;
		for(int row=0; row<len1; row++) {
			int len2 = array[row].length;
			for(int col=0; col<len2; col++) {
				int num = array[row][col];
				sum += num;
				count++;
			}
		}
		
		avg = (double)sum/count;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}