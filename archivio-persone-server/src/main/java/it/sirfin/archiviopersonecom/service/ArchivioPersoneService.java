/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archiviopersonecom.service;

import it.sirfin.archiviopersonecom.dto.CriterioRicercaDto;
import it.sirfin.archiviopersonecom.dto.ListePersonaDto;
import it.sirfin.archiviopersonecom.dto.PersonaDto;
import it.sirfin.archiviopersonecom.model.Cliente;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author 39392
 */
public interface ArchivioPersoneService {

    ListePersonaDto inserisciPersona(Cliente cliente);

    ListePersonaDto aggiorna();

    public ListePersonaDto ricercaPersona(String criterio);
    
    public ListePersonaDto cancellaPersona(Cliente cliente);

}
