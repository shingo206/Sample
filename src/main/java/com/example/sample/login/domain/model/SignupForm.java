package com.example.sample.login.domain.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Data
public class SignupForm {
    private String userId;
    private String password;
    private String userName;
    @Past
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthDate;
    @Min(16) @Max(65)
    private int age;
    private Boolean marriage;
}
