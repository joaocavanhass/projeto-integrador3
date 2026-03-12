import { Component } from '@angular/core';
// imports para utilizar no html
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common'
// import para criação do objeto
import { ItemLista } from './itemLista';

@Component({
  selector: 'app-lista',
  // colocar os imports aqui
  imports: [FormsModule, CommonModule],
  templateUrl: './lista.component.html',
  styleUrl: './lista.component.css'
})
export class ListaComponent {
// aqui vamos instaciar o objeto ItemLista

  // vetor para guardar os items 
  // esse vetor tem comprimento 0
  protected items : ItemLista[] = [];

  // variável responsável por fazer ligação entre o objeto e o input 
  protected item : String = '';

  adicionarItem() : void {
    let novoItem : ItemLista = {
      id : this.items.length + 1, 
      nome : this.item.trim(),  
      comprado : false
    };
    
    if(this.item !== '') {
      this.items.push(novoItem);
      this.item = '';
    }
    console.table(this.items);
    
    
  }
}
