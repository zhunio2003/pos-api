package com.ista.posapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@Table(name = "producto")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    private Integer stock = 0;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

    @Size(max = 20, message = "La unidad no puede exceder 20 caracteres")
    private String unidad;

    @Column(name = "id_clasificacion")
    private Integer idClasificacion;

    @Column(name = "id_proveedor")
    private Integer idProveedor;

    private Boolean iva = false;

    // Relaciones
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_clasificacion", insertable = false, updatable = false)
    private Clasificacion clasificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_proveedor", insertable = false, updatable = false)
    private Proveedores proveedor;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ItemFactura> items;
}
