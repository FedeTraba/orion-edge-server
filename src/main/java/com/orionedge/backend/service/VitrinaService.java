package com.orionedge.backend.service;

import com.orionedge.backend.model.vitrina.Vitrina;
import com.orionedge.backend.repository.VitrinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VitrinaService {

    private final VitrinaRepository vitrinaRepository;

    public VitrinaService(VitrinaRepository vitrinaRepository) {
        this.vitrinaRepository = vitrinaRepository;
    }

    public List<Vitrina> listarTodos() {
        return vitrinaRepository.findAll();
    }

    public Vitrina obtenerPorId(Long id) {
        return vitrinaRepository.findById(id).orElseThrow(() -> new RuntimeException("Vitrina no encontrada"));
    }

    public Vitrina crear(Vitrina vitrina) {
        return vitrinaRepository.save(vitrina);
    }

    public Vitrina actualizar(Long id, Vitrina vitrinaActualizada) {
        Vitrina vitrina = obtenerPorId(id);
        vitrina.setCliente(vitrinaActualizada.getCliente());
        vitrina.setDescripcion(vitrinaActualizada.getDescripcion());
        vitrina.setZona(vitrinaActualizada.getZona());
        //vitrina.setSucursal(vitrinaActualizada.getSucursal());
        vitrina.setDomicilio(vitrinaActualizada.getDomicilio());
        vitrina.setCodigoPostal(vitrinaActualizada.getCodigoPostal());
        vitrina.setLocalidad(vitrinaActualizada.getLocalidad());
        vitrina.setProvincia(vitrinaActualizada.getProvincia());
        //vitrina.setUbicacion(vitrinaActualizada.getUbicacion());
        vitrina.setContacto(vitrinaActualizada.getContacto());
        vitrina.setCelular(vitrinaActualizada.getCelular());
        //vitrina.setFrecuenciaDias(vitrinaActualizada.getFrecuenciaDias());
        //vitrina.setPorcentajeComisionCierre(vitrinaActualizada.getPorcentajeComisionCierre());
       // vitrina.setViaticos(vitrinaActualizada.getViaticos());
        return vitrinaRepository.save(vitrina);
    }

    public void eliminar(Long id) {
        vitrinaRepository.deleteById(id);
    }
}