package com.orionedge.backend.repository;

import com.orionedge.backend.model.proveedor.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
}