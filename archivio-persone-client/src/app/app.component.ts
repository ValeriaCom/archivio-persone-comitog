import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Cliente } from 'src/cliente';
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


  ricerca() { }
  aggiorna() { }
  modifica() { }
  cancella() { }
}
