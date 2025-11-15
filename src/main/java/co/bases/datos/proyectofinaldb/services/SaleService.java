package co.bases.datos.proyectofinaldb.services;

import lombok.Builder;

@Builder
public class SaleService {

    private final  SaleDAO saleDAO = SaleDAO();
}
