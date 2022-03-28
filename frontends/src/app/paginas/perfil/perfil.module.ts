import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { PerfilComponent } from './perfil.component';



@NgModule({
  declarations: [PerfilComponent],
  imports: [
    CommonModule,
    RouterModule
  ]
})
export class PerfilModule { }
