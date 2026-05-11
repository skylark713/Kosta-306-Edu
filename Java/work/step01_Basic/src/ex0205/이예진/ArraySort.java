package ex0205.이예진;

class SelectionSort{
	public void sort1(int arr[]) {
		System.out.println("-------- 선택정렬 시작 ---------");
		int arr1 [] = arr.clone();
		int len1 = arr1.length;
		
		for(int i = 0; i<len1-1; i++) {
			int minIndex = i;
			
			for(int j=i+1; j<len1; j++) {
				if(arr1[j] < arr1[minIndex]) minIndex = j;
			}
			
			int temp = arr1[i];
			arr1[i] = arr1[minIndex];
			arr1[minIndex] = temp;
			
			System.out.print((i+1) + "회전 결과:" );
			for(int v : arr1) System.out.print(v + " ");
			System.out.println();
		}
		
		System.out.println("---------- 최종 결과 ----------");
		for (int v : arr1) System.out.print(v + " ");
		System.out.println();
	}
}

class BubbleSort{
	public void sort2(int arr[]) {
		System.out.println("-------- 버블정렬 시작 ---------");
		int arr2 [] = arr.clone();
		int len2 = arr2.length;
		
		int round = 1;
		boolean swapped = true;
		
		while(swapped) {
			swapped = false;
			
			for(int i=0; i<len2-1; i++) {
				if(arr2[i]>arr2[i+1]) {
					int temp = arr2[i];
					arr2[i] = arr2[i+1];
					arr2[i+1] = temp;
					swapped = true;
				}
			}
			
			System.out.print(round + "회전 결과:" );
			for(int v : arr2) System.out.print(v + " ");
			System.out.println();
			
			round++;
		}
		
		System.out.println("---------- 최종 결과 ----------");
		for (int v : arr2) System.out.print(v + " ");
		System.out.println();
		
	}
}

class InsertionSort{
	public void sort3(int arr[]) {
		System.out.println("-------- 삽입정렬 시작 ---------");
		int arr3 [] = arr.clone();
		int len3 = arr3.length;
		
		for(int i=1; i<len3; i++) {
			int key = arr3[i];
			int j = i - 1;
			
			while(j>=0 && arr3[j]>key) {
				arr3[j+1] = arr3[j];
				j--;
			}
			arr3[j + 1] = key;
			
			System.out.print(i + "회전 결과:" );
			for(int v : arr3) System.out.print(v + " ");
			System.out.println();
			
			
		}
		
		System.out.println("---------- 최종 결과 ----------");
		for (int v : arr3) System.out.print(v + " ");
		System.out.println();
	}
}


public class ArraySort {
	public static void main(String[] args) {
		int arr [] = {5, 7, 1, 2, 4, 3, 8, 9, 6, 10};
		
		SelectionSort selection = new SelectionSort();
		BubbleSort bubble = new BubbleSort();
		InsertionSort insertion = new InsertionSort();
		
		selection.sort1(arr);
		bubble.sort2(arr);
		insertion.sort3(arr);
		
	}
}
