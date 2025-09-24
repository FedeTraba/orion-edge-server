package com.orionedge.backend.model.comprobante;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "presupuestos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Presupuesto extends MovimientoComprobante {
    private Integer plazoEntrega; // Campo adicional para Presupuesto
}