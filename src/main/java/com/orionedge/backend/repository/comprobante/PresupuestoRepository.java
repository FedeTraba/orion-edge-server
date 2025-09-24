package com.orionedge.backend.repository.comprobante;

import com.orionedge.backend.model.comprobante.Presupuesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresupuestoRepository extends JpaRepository<Presupuesto, Long> {
}