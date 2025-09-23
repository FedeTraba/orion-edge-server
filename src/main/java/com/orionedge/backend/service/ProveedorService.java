package com.orionedge.backend.service;

import com.orionedge.backend.model.proveedor.Proveedor;
import com.orionedge.backend.repository.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {

    private final ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public List<Proveedor> listarTodos() {
        return proveedorRepository.findAll();
    }

    public Proveedor obtenerPorId(Long id) {
        return proveedorRepository.findById(id).orElseThrow(() -> new RuntimeException("Proveedor no encontrado"));
    }

    public Proveedor crear(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public Proveedor actualizar(Long id, Proveedor proveedorActualizado) {
        Proveedor proveedor = obtenerPorId(id);
        proveedor.setDenominacion(proveedorActualizado.getDenominacion());
        proveedor.setDomicilio(proveedorActualizado.getDomicilio());
        proveedor.setCodigoPostal(proveedorActualizado.getCodigoPostal());
        proveedor.setLocalidad(proveedorActualizado.getLocalidad());
        proveedor.setContacto(proveedorActualizado.getContacto());
        proveedor.setProvincia(proveedorActualizado.getProvincia());
        proveedor.setCentroCostoPredeterminado(proveedorActualizado.getCentroCostoPredeterminado());
        proveedor.setObservaciones(proveedorActualizado.getObservaciones());
        proveedor.setCodigo(proveedorActualizado.getCodigo());
        proveedor.setCategoriaIVA(proveedorActualizado.getCategoriaIVA());
        proveedor.setCuit(proveedorActualizado.getCuit());
        proveedor.setPlazoDias(proveedorActualizado.getPlazoDias());
        proveedor.setTelefono(proveedorActualizado.getTelefono());
        proveedor.setFax(proveedorActualizado.getFax());
        proveedor.setEmail(proveedorActualizado.getEmail());
        proveedor.setCelular(proveedorActualizado.getCelular());
        proveedor.setWhatsapp(proveedorActualizado.getWhatsapp());
        return proveedorRepository.save(proveedor);
    }

    public void eliminar(Long id) {
        proveedorRepository.deleteById(id);
    }
}