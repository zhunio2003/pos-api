package com.ista.posapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tipo_pago")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_pago")
    private Long idTipoPago;

    @NotBlank(message = "El tipo de pago es obligatorio")
    @Size(max = 50, message = "El tipo no puede exceder 50 caracteres")
    private String tipo;

    @Size(max = 255, message = "La descripción no puede exceder 255 caracteres")
    private String descrip;

    // Relación
    @OneToMany(mappedBy = "tipoPago", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Factura> facturas;
}
