package com.orionedge.backend.service;

import com.orionedge.backend.model.caja.Caja;
import com.orionedge.backend.repository.CajaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CajaService {

    private final CajaRepository cajaRepository;

    public CajaService(CajaRepository cajaRepository) {
        this.cajaRepository = cajaRepository;
    }

    public List<Caja> listarTodas() {
        return cajaRepository.findAll();
    }

    public Caja obtenerPorId(Long id) {
        return cajaRepository.findById(id).orElseThrow(() -> new RuntimeException("Caja no encontrada"));
    }

    public Caja crear(Caja caja) {
        return cajaRepository.save(caja);
    }

    public Caja actualizar(Long id, Caja cajaActualizada) {
        Caja caja = obtenerPorId(id);
        caja.setDescripcion(cajaActualizada.getDescripcion());
        caja.setApertura(cajaActualizada.getApertura());
        caja.setCierre(cajaActualizada.getCierre());
        caja.setCajaDiaria(cajaActualizada.getCajaDiaria());
        caja.setUsuarios(cajaActualizada.getUsuarios());
        return cajaRepository.save(caja);
    }

    public void eliminar(Long id) {
        cajaRepository.deleteById(id);
    }
}