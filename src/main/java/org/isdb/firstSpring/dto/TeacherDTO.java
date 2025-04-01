package org.isdb.firstSpring.dto;



import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.math.BigDecimal;
import java.time.Instant;

import org.isdb.firstSpring.config.InstantDeserializer;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeacherDTO {
    private String name;
    @Email
    private String email;
    private String gender;
    private String address;
    private String phone;
    @JsonDeserialize(using = InstantDeserializer.class)
    private Instant joiningDate;
    private BigDecimal salary;
    private Boolean isMarried;
}
