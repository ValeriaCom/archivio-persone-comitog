/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archiviopersonecom.dto;

/**
 *
 * @author 39392
 */
public class CriterioRicercaDto {

    private String stringa;

    public CriterioRicercaDto() {
    }

    public CriterioRicercaDto(String stringa) {
        this.stringa = stringa;
    }

    public String getStringa() {
        return stringa;
    }

    public void setStringa(String stringa) {
        this.stringa = stringa;
    }

    @Override
    public String toString() {
        return "CriterioRicercaDto{" + "stringa=" + stringa + '}';
    }

}
