package com.orionedge.backend.model.inventario;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.math.BigDecimal;

import com.orionedge.backend.model.base.Auditable;
import com.orionedge.backend.model.proveedor.Proveedor;

@Entity
@Table(name = "articulos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Articulo extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String codigo;

    private String descripcion;

    private String descripcionAdicional;

    private String codigoBarrasInterno;

    private String codigoProveedor;

    @Column(precision = 19, scale = 2)
    private BigDecimal precioCompra;

    @Column(precision = 19, scale = 2)
    private BigDecimal precioVenta;

    @Column(precision = 19, scale = 2)
    private BigDecimal porcentajeGanancia;

    private String divisa;

    private Boolean compuesto;

    private Boolean controlaStock;

    @Column(precision = 19, scale = 2)
    private BigDecimal puntoDePedido;

    @Column(precision = 19, scale = 2)
    private BigDecimal disponibles;

    private Integer largo;

    private Integer ancho;

    @Column(precision = 19, scale = 2)
    private BigDecimal peso;

    private String presentacionVenta;

    private String presentacionCompra;

    @Column(precision = 19, scale = 2)
    private BigDecimal compraMinima;

    @Column(precision = 19, scale = 2)
    private BigDecimal comision;

    @Column(precision = 19, scale = 2)
    private BigDecimal porcentajeBonificacion;

    private String vencimiento;

    @Column(precision = 19, scale = 2)
    private BigDecimal costoReal;

    @Column(precision = 19, scale = 2)
    private BigDecimal porcentajeIVA;

    @Column(precision = 19, scale = 2)
    private BigDecimal porcentajeGravado;

    @Column(precision = 19, scale = 2)
    private BigDecimal impuestosInternos;

    private String subrubro;

    @ManyToOne
    private Marca marca;

    @ManyToOne
    private Proveedor proveedor;

    @ElementCollection
    private List<String> proveedoresAlternativos;
}