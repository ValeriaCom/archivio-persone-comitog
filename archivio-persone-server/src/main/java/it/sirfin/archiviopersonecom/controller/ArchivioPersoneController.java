/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archiviopersonecom.controller;

import it.sirfin.archiviopersonecom.dto.CriterioRicercaDto;
import it.sirfin.archiviopersonecom.dto.ListePersonaDto;
import it.sirfin.archiviopersonecom.dto.PersonaDto;
import it.sirfin.archiviopersonecom.service.ArchivioPersoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 39392
 */
@CrossOrigin("*")
@RestController
public class ArchivioPersoneController {
    
    @Autowired
    ArchivioPersoneService archivioPersoneService;
    
    @RequestMapping("/inserisci-persona")
    @ResponseBody
    public ListePersonaDto inserisciPersona(@RequestBody PersonaDto dto) {
        return archivioPersoneService.inserisciPersona(dto.getCliente());
    }
    
    @RequestMapping("/ricerca-persona")
    @ResponseBody
    public ListePersonaDto ricercaPersona(@RequestBody CriterioRicercaDto dto) {
        throw new UnsupportedOperationException();
    }
    
    @RequestMapping("/cancella-persona")
    @ResponseBody
    public ListePersonaDto cancellaPersona(@RequestBody PersonaDto dto) {
        throw new UnsupportedOperationException();
    }
    
    @RequestMapping("/aggiorna-liste")
    @ResponseBody
    public ListePersonaDto aggiornaListe() {
        throw new UnsupportedOperationException();
    }
}
