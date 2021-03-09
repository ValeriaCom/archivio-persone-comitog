/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archiviopersonecom.repository;

import it.sirfin.archiviopersonecom.model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 39392
 */
@Repository
public interface ClienteRepository extends JpaRepository<Persona, Long> {

    List<Persona> findByCodiceContainsOrRagioneSocialeContainsOrIndirizzoContains(String c, String r, String i);
}
