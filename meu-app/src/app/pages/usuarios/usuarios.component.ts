import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink } from "@angular/router";
// import { FormsModule } from "@angular/forms";

@Component({
  selector: 'app-usuarios',
  imports: [CommonModule, RouterLink],
  templateUrl: './usuarios.component.html',
  styleUrl: './usuarios.component.css'
})
export class UsuariosComponent {
  usuarios = ["João", "Felipe", "Ana", "Maria"];
}
