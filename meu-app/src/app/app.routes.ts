import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { UsuariosComponent } from './pages/usuarios/usuarios.component';
import { UserComponent } from './pages/user/user.component';

// objetos com as rotas
export const routes: Routes = [
    {path:'', component: HomeComponent},
    {path:'usuarios', component: UsuariosComponent},
    {path:'usuarios/:user', component:UserComponent},
];

