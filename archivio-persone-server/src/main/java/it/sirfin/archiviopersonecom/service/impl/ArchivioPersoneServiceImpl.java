/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archiviopersonecom.service.impl;

import it.sirfin.archiviopersonecom.dto.ListaPersoneDto;
import it.sirfin.archiviopersonecom.model.Persona;
import it.sirfin.archiviopersonecom.repository.ClienteRepository;
import it.sirfin.archiviopersonecom.service.ArchivioPersoneService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 39392
 */
@Service
public class ArchivioPersoneServiceImpl implements ArchivioPersoneService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public ListaPersoneDto inserisciPersona(Persona cliente) {
        //inserire la persone
        clienteRepository.save(cliente);
        //rileggere ildb aggiornato e ritornarlo
        return aggiorna();
    }

    @Override
    public ListaPersoneDto ricercaPersona(String criterio) {
        List<Persona> lista = clienteRepository
                .findByCodiceContainsOrRagioneSocialeContainsOrIndirizzoContains(criterio, criterio, criterio);
        return new ListaPersoneDto(lista);
    }

    @Override
    public ListaPersoneDto cancellaPersona(Persona cliente) {
        clienteRepository.delete(cliente);
        return aggiorna();
    }

    @Override
    public ListaPersoneDto aggiorna() {
        List<Persona> lista = clienteRepository.findAll();
        return new ListaPersoneDto(lista);
    }
}
