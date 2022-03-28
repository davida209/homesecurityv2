import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { AddserviceModule } from './addservice/addservice.module';
import { ContraolvidadaModule } from './contraolvidada/contraolvidada.module';
import { RegisterModule } from './register/register.module';
import { RoutesModule } from 'src/routes/routes.module';
import { InicioComponent } from './inicio/inicio.component';
import { InicioModule } from './inicio/inicio.module';
import { VisitaComponent } from './visita/visita.component';


@NgModule({
  declarations: [

  
    VisitaComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    AddserviceModule,
    ContraolvidadaModule,
    RegisterModule,
    InicioModule,
    
  ]
})
export class PaginasModule { }
