import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { LayoutComponent } from './layout/layout.component';
import { HomepageModule } from './paginas/homepage/homepage.module';
import { RegisterComponent } from './paginas/register/register.component';
import { PerfilComponent } from './paginas/perfil/perfil.component';
import { ContraolvidadaComponent } from './paginas/contraolvidada/contraolvidada.component';
import { PaginasModule } from './paginas/paginas.module';
import { RoutesModule } from 'src/routes/routes.module';
import { RouterModule } from '@angular/router';
import { LayoutModule } from './layout/layout.module';
import { AppRoutingModule } from './app-routing.module';


@NgModule({
  declarations: [AppComponent],
  imports: [BrowserModule, PaginasModule, RoutesModule, RouterModule, LayoutModule, AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
