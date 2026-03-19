import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-user',
  imports: [],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent implements OnInit{
  user: string | null = '';

  //injeção de dependências para acessar parâmetros da rota
  constructor(private route: ActivatedRoute) {}
  
  ngOnInit(): void {
    // buscar informção do usuário na rota
    this.route.paramMap.subscribe((params) => {
      this.user = params.get('user');
    })
  }
}
