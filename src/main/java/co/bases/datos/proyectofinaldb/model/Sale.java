package co.bases.datos.proyectofinaldb.model;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sale {
    private String id;
    private LocalDate saleDate;
    private SystemUser user;
    private List<Product> products;
    private List<PayMent> pago;
}
