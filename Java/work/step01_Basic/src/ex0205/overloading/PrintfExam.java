package ex0205.overloading;

import java.util.Calendar;
import java.util.GregorianCalendar;

class  PrintfExam{
	public static void main(String[] args) {
		System.out.printf("%d%d%n",20,30);
		System.out.printf("%d , %d%n",20,30);
		System.out.println();
		System.out.printf("가격 : %,d원%n",25320000);
		System.out.printf("%5.2f%n",35.33333);
		System.out.println();
		System.out.printf("%d년  %d월 %d일%n",2009,5,3);
		System.out.printf("%2$d년 %3$d월 %1$d일%n",1, 2005, 3);

		// 현재 system의 날짜와 시간 가져오기
		Calendar now= Calendar.getInstance();
		System.out.println("\nYear=>"+now.get(Calendar.YEAR));
		System.out.println("month=>"+ (now.get(Calendar.MONTH)+1) ); // 1월은 0으로 시작. 그래서 1 더하기
		System.out.println("date=>"+now.get(Calendar.DATE) +"\n");
		
		//System.out.println(now); // java.util.GregorianCalendar[time=1770262407930,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2026,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=36,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=33,SECOND=27,MILLISECOND=930,ZONE_OFFSET=32400000,DST_OFFSET=0]
		System.out.printf("%1$tY년 %1$tm월 %1$td일 %1$tH시 : %1$tM분 : %1$tS초%n" , now);
		//1$를 안쓰면 아래와 같이 now를 6번 써야함.
		//System.out.printf("%tY년 %tm월 %td일 %tH시 : %tM분 : %tS초%n" , now, now, now, now, now, now);
		System.out.println();
		System.out.printf("%3d %-10s %-8s %-5d%n",1,"jang","장희정",20); // -는 왼쪽 정렬
		System.out.printf("%3d %-10s %-8s %-5d%n",22,"hee","정효욱",03);
		System.out.printf("%3d %-10s %-8s %-5d%n",3,"rew97","장정희",20);
		System.out.printf("%3d %-10s %-8s %-5d%n",4,"jang","장희정",20);
	}
}
