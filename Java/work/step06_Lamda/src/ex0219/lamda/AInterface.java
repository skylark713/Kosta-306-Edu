package ex0219.lamda;

@FunctionalInterface //메소드가 단 한 개
public interface AInterface {
	void aa();
	//void bb(); //Invalid '@FunctionalInterface' annotation; AInterface is not a functional interface
	default void bb() {}
}
