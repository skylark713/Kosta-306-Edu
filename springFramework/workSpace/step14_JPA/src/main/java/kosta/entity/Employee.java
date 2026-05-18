package kosta.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "emp")
public class Employee extends BaseEntity{
	@Id //pk
	private String empno;

	private String job;
	
	
}
