/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archiviopersonecom.dto;

import it.sirfin.archiviopersonecom.model.Cliente;
import java.util.List;

/**
 *
 * @author 39392
 */
public class ListePersonaDto {

    private List<Cliente> listaPersone;

    public ListePersonaDto() {
    }

    public ListePersonaDto(List<Cliente> listaPersone) {
        this.listaPersone = listaPersone;
    }

    public List<Cliente> getListaPersone() {
        return listaPersone;
    }

    public void setListaPersone(List<Cliente> listaPersone) {
        this.listaPersone = listaPersone;
    }

    @Override
    public String toString() {
        return "ListePersonaDto{" + "listaPersone=" + listaPersone + '}';
    }

}
