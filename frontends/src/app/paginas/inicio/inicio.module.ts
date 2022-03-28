import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InicioComponent } from './inicio.component';
import { RouterModule } from '@angular/router';



@NgModule({
  declarations: [InicioComponent],
  imports: [
    CommonModule,
    RouterModule,
  ]
})
export class InicioModule { }
