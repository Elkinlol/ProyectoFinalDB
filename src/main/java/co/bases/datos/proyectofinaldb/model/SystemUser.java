package co.bases.datos.proyectofinaldb.model;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SystemUser {

    private String cedula;
    private  String userName;
    private String password;
    private String fullName;
    private Role role;



}
