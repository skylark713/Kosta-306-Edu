//package ex0205.이예진;
//
//class CheckDuplicate{
//	public boolean checkDuplicate(int arr[]) {
//		
//		int len = arr.length;
//		for(int i=0; i<len-1; i++) {
//			for(int j= i+1; j<len; j++) {
//				if(arr[i] == arr[j]) { //return true;
//				
//			}
//		}
//	}
//}
//
//class MakeArray{
//	public void makeArray(int arr []) {
//		// 중복 확인 필요
//		CheckDuplicate check = new CheckDuplicate();
//		
//		// 1~45 숫자 // 6개 필요
//		// int num = (int)(Math.random() * 45) + 1;
//	}
//}
//
//class SortArray{
//	public void sortArray(int arr[]) {
//		int len = arr.length;
//		
//		for(int i=0; i <len-1; i++) {
//			int minIndex = i;
//			
//			for(int j=i+1; j<len; j++) {
//				if(arr[j] < arr[minIndex]) minIndex = j;
//				int temp = arr[i];
//				arr[i] = arr[minIndex];
//				arr[minIndex] = temp;
//			}
//		}
//	}
//}
//
//class PrintArray{
//	public void printArray(int arr[]) {
//		System.out.print("로또 번호: ");
//		for(int v : arr) {
//			System.out.print(v + " ");
//		}
//		System.out.println();
//	}
//	
//}
//
//
//public class LottoNumber {
//
//	public static void main(String[] args) {
//		
//		int arr [] = new int [6];
//		
//		MakeArray ma = new MakeArray();
//        SortArray ss = new SortArray();
//        PrintArray pr = new PrintArray();
//        
//        ma.makeArray(arr);
//        ss.sortArray(arr);
//        pr.printArray(arr);
//		
//	}
//
//}
