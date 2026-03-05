import { Component } from '@angular/core';

// biblioteca para formulário gerenciado pelo angular
import { FormsModule } from '@angular/forms';

// biblioteca para realizar o vinculo entre atributos/inputs
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-olamundo',
  imports: [FormsModule, CommonModule],
  templateUrl: './olamundo.component.html',
  styleUrl: './olamundo.component.css'
})
export class OlamundoComponent {
  // classe == atributos || caracteristicas
  // aqui a gente programa os elementos da nossa pagina
  // declarção das variaveis com atribuição
  num1 : number = 0;
  num2 : number = 0;
  res : number = 0;

  // metodo de soma
  // metodo == comportamento
  calcularSoma() {
    this.res = this.num1 + this.num2;
  }
  Limpar() {
    this.num1 = 0;
    this.num2 = 0;
    this.res = 0;
  }
}
