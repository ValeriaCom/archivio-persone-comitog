/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archiviopersonecom.dto;

import it.sirfin.archiviopersonecom.model.Persona;
import java.util.List;

/**
 *
 * @author 39392
 */
public class ListaPersoneDto {

    private List<Persona> listaPersone;

    public ListaPersoneDto() {
    }

    public ListaPersoneDto(List<Persona> listaPersone) {
        this.listaPersone = listaPersone;
    }

    public List<Persona> getListaPersone() {
        return listaPersone;
    }

    public void setListaPersone(List<Persona> listaPersone) {
        this.listaPersone = listaPersone;
    }

    @Override
    public String toString() {
        return "ListaPersoneDto{" + "listaPersone=" + listaPersone + '}';
    }

    

}
