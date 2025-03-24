package org.isdb.firstSpring.model;

import java.math.BigDecimal;
import java.time.Instant;

import org.isdb.firstSpring.config.InstantDeserializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "T_TEACHER")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(nullable = false, length = 30)
	private String name;
	@Column(unique = true, nullable = false, length = 50)
	private String email;
	@Column(nullable = false, length = 10)
	private String gender;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private String phone;
	@JsonDeserialize(using = InstantDeserializer.class)
	@Column(name = "joining  _date", nullable = false, updatable = false)
	private Instant joiningDate;
	@Column(nullable = false)
	private BigDecimal salary;
	@Column(name = "is_marrired")
	private Boolean isMarried;
}
