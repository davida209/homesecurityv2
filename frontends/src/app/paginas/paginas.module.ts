import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { AddserviceModule } from './addservice/addservice.module';
import { ContraolvidadaModule } from './contraolvidada/contraolvidada.module';
import { RegisterModule } from './register/register.module';
import { InicioModule } from './inicio/inicio.module';
import { VisitaComponent } from './visita/visita.component';
import { HomepageModule } from './homepage/homepage.module';
import { PerfilModule } from './perfil/perfil.module';


@NgModule({
  declarations: [

  
    VisitaComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    AddserviceModule,
    ContraolvidadaModule,
    PerfilModule,
    RegisterModule,
    InicioModule,
    HomepageModule
    
  ]
})
export class PaginasModule { }
