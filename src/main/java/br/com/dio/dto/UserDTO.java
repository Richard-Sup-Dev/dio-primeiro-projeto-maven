package br.com.dio.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class UserDTO {
    private int id;
    private String name;
    private LocalDate birthdate;
}