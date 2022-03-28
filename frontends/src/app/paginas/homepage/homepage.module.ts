import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { PaginasModule } from '../paginas.module';
import { routes } from 'src/routes/routes';
import { HomepageComponent } from './homepage.component';



@NgModule({
  declarations: [HomepageComponent],
  imports: [
    CommonModule,
    RouterModule
  ]
})
export class HomepageModule { }
