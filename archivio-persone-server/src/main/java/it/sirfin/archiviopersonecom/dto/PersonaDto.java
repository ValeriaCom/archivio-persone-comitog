/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archiviopersonecom.dto;

import it.sirfin.archiviopersonecom.model.Persona;

/**
 *
 * @author 39392
 */
public class PersonaDto {

    private Persona persona;

    public PersonaDto() {
    }

    public PersonaDto(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "PersonaDto{" + "persona=" + persona + '}';
    }

}
