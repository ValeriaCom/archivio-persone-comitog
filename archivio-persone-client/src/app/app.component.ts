import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Cliente } from 'src/cliente';

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
  aggiungi() { }
  ricerca() { }
  aggiorna() { }
  modifica() { }
  cancella() { }
}
