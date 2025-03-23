 package org.isdb.firstSpring.model;

 import jakarta.persistence.Column;
 import jakarta.persistence.Entity;
 import jakarta.persistence.GeneratedValue;
 import jakarta.persistence.GenerationType;
 import jakarta.persistence.Id;
 import jakarta.persistence.JoinColumn;


 import jakarta.persistence.OneToOne;
 import lombok.AllArgsConstructor;
 import lombok.Getter;
 import lombok.NoArgsConstructor;
 import lombok.Setter;

 @Getter
 @Setter
 @AllArgsConstructor
 @NoArgsConstructor
 @Entity(name = "T_SCLASS")
 public class SClass {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
     @Column(nullable=false,length=50)
     private String name;
     @OneToOne
     @JoinColumn(name = "class_teacher",referencedColumnName = "id" ,nullable=false)
    
     private Teacher classTeacher;
    @Column(name= "room_number",nullable=false,length=10,unique = true)
     private Integer roomNumber;

    
 }
