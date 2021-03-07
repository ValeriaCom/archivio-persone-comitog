/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archiviopersonecom.dto;

import it.sirfin.archiviopersonecom.model.Cliente;

/**
 *
 * @author 39392
 */
public class PersonaDto {

    private Cliente cliente;

    public PersonaDto() {
    }

    public PersonaDto(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "PersonaDto{" + "cliente=" + cliente + '}';
    }

}
