import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Cliente } from 'src/cliente';
import { CriterioRicercaDto } from './criterio-ricerca-dto';
import { ListePersonaDto } from './liste-persona-dto';
import { PersonaDto } from './persona-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  persona = new Cliente();
  search = "";
  clienti: Cliente[] = [];

  constructor(private http: HttpClient) { }

  aggiungi() {
    //prepariamo i dati da inviare al server
    let dto = new PersonaDto();
    dto.cliente = this.persona;

    //chiamiamo il servizio REST
    let ox = this.http.post<ListePersonaDto>("http://localhost:8080/inserisci-persona", dto
    );
    ox.subscribe(r => this.clienti = r.listaPersone);
    this.persona = new Cliente();
  }

  ricerca() {
    let criterio = new CriterioRicercaDto();
    criterio.stringa = this.search;
    let oss = this.http.post<ListePersonaDto>("http://localhost:8080/ricerca-persona", criterio);
    oss.subscribe(c => this.clienti = c.listaPersone);
  }
  aggiorna() { }
  modifica() { }

  cancella(a: Cliente) {
    let dto = new PersonaDto();
    dto.cliente = a;
    let os = this.http.post<ListePersonaDto>("http://localhost:8080/cancella-persona", dto);
    os.subscribe(x => this.clienti = x.listaPersone);
  }
}
