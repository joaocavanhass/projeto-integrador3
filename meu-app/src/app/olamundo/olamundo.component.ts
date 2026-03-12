import { Component } from '@angular/core';
// Biblioteca para formulário gerenciado pelo Angular
import { FormsModule } from '@angular/forms';
// Biblioteca para realizar o vínculo entre atributos/imputs
import {CommonModule } from '@angular/common';

@Component({
  selector: 'app-olamundo',
  imports: [FormsModule, CommonModule],
  templateUrl: './olamundo.component.html',
  styleUrl: './olamundo.component.css'
})

export class OlamundoComponent {
  // Aqui a gente programa os elementos da nossa página
  // Declaração das variáveis com atribuição
  num1: number = 0;
  num2: number = 0;
  res: number = 0;

  // Método de soma
  calcularSoma() {
    this.res = this.num1 + this.num2;
  }
  limpar() {
      this.res = 0;
      this.num1 = 0;
      this.num2 = 0;
  }

}
