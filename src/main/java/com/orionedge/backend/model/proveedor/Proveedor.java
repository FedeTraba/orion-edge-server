package com.orionedge.backend.model;

import com.orionedge.backend.model.base.Auditable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "proveedores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Proveedor extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String denominacion;

    private String domicilio;

    private String codigoPostal;

    private String localidad;

    private String contacto;

    private String provincia;

    private String centroCostoPredeterminado;

    private String observaciones;

    private String codigo;

    private String categoriaIVA;

    private String cuit;

    private Integer plazoDias;

    private String telefono;

    private String fax;

    @Email
    private String email;

    private String celular;

    private String whatsapp;
}