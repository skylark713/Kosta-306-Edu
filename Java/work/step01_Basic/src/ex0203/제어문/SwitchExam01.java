//package ex0203.제어문;
//
//public class SwitchExam01 {
//
//	public static void main(String[] args) {
//		// 1~12사이의 난수를 발생한다.
//		double nansu = (int)(Math.random()*12 + 1);
//		System.out.println("난수= " + nansu);
//		
//		int convertNo = (int)nansu;
//		System.out.println("변환 = " + convertNo);
//		// 그 난수는 월이라고 생각하고 월에 해당하는 마지막 일수를 출력한다.
//		
//		// if문 1,3,5,7,8,10,12 / 2 / 4,6,9,11
//		int endDay;
//		if(convertNo==2) {
//			endDay = 28;
//		}else if(convertNo==4 || convertNo==6 || convertNo==9 || convertNo==11) {
//			endDay = 30;
//		}else {
//			endDay = 31;
//		}
//		
//		// switch
//		int month = convertNo;
//		int endDay;
//		switch(convertNo) {
//		case 2: endDay=28; break;
//		case 4, 6, 9, 11: endDay=30; break;
//		default: endDay=31;
//		}

//		int month = convertNo;
//		int endDay = switch(month) {
//		case 2 -> 28;
//		case 4, 6, 9, 11 -> 30;
//		default -> 31;
//		};
		
//		endDay = switch(month) {
//			case 2 -> 28;
//			case 4, 6, 9,11 ->{
//				System.out.println("안녕");
//				yield 30;
//			}
//			default -> 31;
//		};
//		}
//		
//		System.out.println(month+"월은 " + endDay + "일까지 있습니다.");
//
//	}
//
//}
