package co.bases.datos.proyectofinaldb.model;

import lombok.*;
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class payMent {

    private  String payMentId;
    private  float totalPrice;
    private  boolean isCredit;

}
