package sample08;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(exclude = {"writer", "date"})
//@Data
@Component
@Scope("prototype")
public class BookDTO {
	@Value("SpringDI")
	private String subject;
	
	@Value("예진")
	//@Getter //선택적(부분적)으로 가능하다.
	private String writer;
	
	@Value("25000")
	private int price;
	
	@Value("2026-05-08")
	private String date;
	
}
