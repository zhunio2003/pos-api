package com.ista.posapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "factura")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Long idFactura;

    @NotBlank(message = "La serie es obligatoria")
    @Size(max = 10, message = "La serie no puede exceder 10 caracteres")
    private String serie;

    @Column(name = "id_persona")
    private Integer idPersona;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "id_tipo_pago")
    private Integer idTipoPago;

    private Double descuento = 0.0;
    private Double total = 0.0;

    // Relaciones
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona", insertable = false, updatable = false)
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_pago", insertable = false, updatable = false)
    private TipoPago tipoPago;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ItemFactura> items;
}
