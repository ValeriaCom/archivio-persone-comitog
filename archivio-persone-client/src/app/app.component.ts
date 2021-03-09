import { HttpClient } from '@angular/common/http';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';
import { Component } from '@angular/core';
import { Persona } from 'src/cliente';
import { CriterioRicercaDto } from './criterio-ricerca-dto';
import { ListaPersoneDto } from './lista-persone-dto';
import { PersonaDto } from './persona-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  persona = new Persona();
  search = "";
  persone: Persona[] = [];
  rigaCorrente: number;

  //stato della UI
  stato = "AGG";
  showConferma = false;
  showAnnulla = false;
  showAggiungi = true;

  constructor(private http: HttpClient) { this.aggiorna() }

  aggiungi() {
    //prepariamo i dati da inviare al server
    let dto = new PersonaDto();
    dto.persona = this.persona;

    //chiamiamo il servizio REST
    let ox = this.http.post<ListaPersoneDto>("http://localhost:8080/inserisci-persona", dto
    );
    ox.subscribe(r => this.persone = r.listaPersone);
    this.persona = new Persona();
  }

  ricerca() {
    let criterio = new CriterioRicercaDto();
    criterio.stringa = this.search;
    let oss = this.http.post<ListaPersoneDto>("http://localhost:8080/ricerca-persona", criterio);
    oss.subscribe(c => this.persone = c.listaPersone);
    this.search = null;
  }
  aggiorna() {
    this.http.get<ListaPersoneDto>
      ("http://localhost:8080/aggiorna")
      .subscribe(v => this.persone = v.listaPersone);

  }

  modifica(i: number) {
    switch (this.stato) {
      case "AGG":
        this.persona = Object.assign({}, this.persone[i]);
        this.rigaCorrente = i;
        this.showAggiungi = false;
        this.showConferma = true;
        this.showAnnulla = true;
    }
  }

  cancella(p: Persona) {
    let dto = new PersonaDto();
    dto.persona = p;
    let os = this.http.post<ListaPersoneDto>("http://localhost:8080/cancella-persona", dto);
    os.subscribe(x => this.persone = x.listaPersone);
  }

  conferma() {
    switch (this.stato) {
      case "AGG":
        this.persona.id = this.persone.length;
        this.persone.push(this.persona);
        this.persone[this.persona.id] = this.persona;
    }
  }

  annulla() {
    switch (this.stato) {
      case "AGG":
        this.showAggiungi = true;
        this.showConferma = false;
        this.showAnnulla = false;
        this.aggiungi();
      
    }
  }
}
