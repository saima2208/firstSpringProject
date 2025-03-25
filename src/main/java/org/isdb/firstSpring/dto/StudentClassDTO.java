package org.isdb.firstSpring.dto;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentClassDTO {
	@Nonnull
	@Size(min = 3, max = 30, message = "Nmae must be bettween 3 to 30 characters")
	private String name;
	@Nonnull
	private Integer classTeacherId;
	@Nonnull
	private Integer roomNumber;

}
