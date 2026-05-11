package ex0309.db.util;

/**
 * DB 설정 정보를 상수로 관리
 * */

public interface DbProperties {
	public static final String DRIVER_NAME="";
	// public static final은 자동이라 굳이 붙이지 않아도 된다.
	String URL="jdbc:mysql://localhost:3306/mytest";
	String USER_ID="lee";
	String USER_PASS="1234";
}
