import br.com.dio.dto.UserDTO;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        var dto= new UserDTO();
        dto.setId(2);
        dto.setName("Richard");
        dto.setBirthdate(LocalDate.now().minusYears(25));

        System.out.println("ID: " + dto.getId());
        System.out.println("Nome: " + dto.getName());
        System.out.println("Data de Nascimento: " + dto.getBirthdate());
    }

}