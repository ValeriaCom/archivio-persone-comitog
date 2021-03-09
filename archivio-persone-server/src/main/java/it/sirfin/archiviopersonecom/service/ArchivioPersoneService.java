/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archiviopersonecom.service;

import it.sirfin.archiviopersonecom.dto.CriterioRicercaDto;
import it.sirfin.archiviopersonecom.dto.ListaPersoneDto;
import it.sirfin.archiviopersonecom.dto.PersonaDto;
import it.sirfin.archiviopersonecom.model.Persona;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author 39392
 */
public interface ArchivioPersoneService {

    ListaPersoneDto inserisciPersona(Persona cliente);

    ListaPersoneDto aggiorna();

    public ListaPersoneDto ricercaPersona(String criterio);
    
    public ListaPersoneDto cancellaPersona(Persona cliente);

}
