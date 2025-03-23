package org.isdb.firstSpring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "T_BOOK")
public class Book {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
private int id;
 
@Column(nullable = false,length = 100)
private String name;

@Column(nullable = false,length = 100)
private String author;

@Column(nullable = false,length = 100)
private String publisher;

private SClass clazz;

 @ManyToOne
@JoinColumn(name = "student", nullable = false)
private Student student;
}
