package org.isdb.firstSpring.model;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "T_STUDENT")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false,length = 50)
	private String name;

	@Column(unique = true,length = 50)
	private String email;
	
	@OneToOne
	@JoinColumn(name = "clazz",referencedColumnName = "id",nullable = false)
	private Class clazz;

	@Column(nullable = false, unique = true,length = 30)
	private Integer roll;

	
	@OneToMany(mappedBy = "student")
	private List<Book> books;

	@Column(nullable = false, length = 17)
	private String phone;

	@Column(length = 100)
	private String address;

	@Column(nullable = false,length = 10)
	private String gender;

	@Column(nullable = false,length = 30)
	private Instant dob;

	
	
}
