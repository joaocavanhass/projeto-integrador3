
import { Component, OnDestroy } from '@angular/core';
import { NavbarComponent } from "./components/navbar/navbar.component";
import { FooterComponent } from "./components/footer/footer.component";
import { HomeComponent } from "./pages/home/home.component";
import { CommonModule } from "@angular/common";
import { BaseUiComponent } from "./pages/base-ui/base-ui.component";
import { RouterOutlet } from "@angular/router";
 
@Component({
  selector: 'app-root',
  imports: [NavbarComponent, FooterComponent, HomeComponent, CommonModule, BaseUiComponent, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnDestroy {
 
  exibirHome: boolean = true;
 
  ngOnDestroy(): void {
    this.exibirHome = false;
    console.log("Home se foi.... :(")
  }
 
  alternarHome() {
    this.exibirHome = !this.exibirHome;
  }
 
 
}
 
 
