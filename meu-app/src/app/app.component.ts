import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { OlamundoComponent } from './olamundo/olamundo.component';

@Component({
  selector: 'app-root',
  // preciso colocar minha biblioteca aqui
  imports: [OlamundoComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'meu-app';
}
