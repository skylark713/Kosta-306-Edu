package ex0211.inheritance;

class Car{
	public String carname;
	public int cost;
	
	protected void printAttributes(){
		System.out.println("carname="+carname+"\tcost="+cost);
	}
}
/////////////////////////////////////////////////////////////////
//Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성	
	//각 클래스에 인수를 받지않는 생성자 작성
	//각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당
class EfSonata extends Car{
	// int i=100 코드 추가. Polymorphism 관련.
	int i=100;
	EfSonata(){ // 생성자
		carname = "EfSonata";
		this.cost = 5500; // this. super. 다 가능
	}
}

class Excel extends Car{
	Excel(){
		this.carname = "Excel";
		super.cost = 2800;
	}
}

class Carnival extends Car{
	Carnival(){
		carname = "Carnival";
		cost = 4100;
	}
}


public class InheritanceExam{
//메인메소드에서 
	public static void main(String[] args) {
		
		//Car, EfSonata, Excel, Carnival 네개의 객체를 생성
		// 각 클래스에서 Car class에있는 printAttributes()메소드를 호출할수있다.
		Car car = new Car();
		EfSonata efSonata = new EfSonata();
		Excel excel = new Excel();
		Carnival carnival = new Carnival();
		
		System.out.println("----------------------------");
		System.out.println("car = " + car);
		System.out.println("efSonata = " + efSonata);
		System.out.println("excel = " + excel);
		System.out.println("carnival = " + carnival);
		
		System.out.println("----------------------------");
		car.printAttributes();
		efSonata.printAttributes();
		excel.printAttributes();
		carnival.printAttributes();
		
	}
	
	
	
	
	

}

