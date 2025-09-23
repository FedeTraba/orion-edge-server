package com.orionedge.backend.model.vitrina;

import com.orionedge.backend.model.base.Auditable;
import com.orionedge.backend.model.cliente.Cliente;
import com.orionedge.backend.model.sucursal.Sucursal;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "vitrinas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vitrina extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @NotBlank
    private String descripcion;

    private String zona;

    @ManyToOne
    private Sucursal sucursal;

    private String domicilio;

    private String codigoPostal;

    private String localidad;

    private String provincia;

    private String ubicacion;

    private String contacto;

    private String celular;

    private Integer frecuenciaDias;

    @Column(precision = 19, scale = 2)
    private BigDecimal porcentajeComisionCierre;

    @Column(precision = 19, scale = 2)
    private BigDecimal viaticos;
}