package co.bases.datos.proyectofinaldb.dto;

import co.bases.datos.proyectofinaldb.model.Role;

public record UserDTO(
        String cedula,
        String userName,
        String fullName,
        Role role
) {}
