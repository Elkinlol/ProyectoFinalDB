package co.bases.datos.proyectofinaldb.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class PayMentCredit {
    private List<Installment> installments;
}
