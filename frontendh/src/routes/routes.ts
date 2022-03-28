import { LayoutComponent } from 'src/app/layout/layout.component';
import { AddserviceComponent } from 'src/app/paginas/addservice/addservice.component';
import { ContraolvidadaComponent } from 'src/app/paginas/contraolvidada/contraolvidada.component';
import { HomepageComponent } from 'src/app/paginas/homepage/homepage.component';
import { InicioComponent } from 'src/app/paginas/inicio/inicio.component';
import { PerfilComponent } from 'src/app/paginas/perfil/perfil.component';
import { VisitaComponent } from 'src/app/paginas/visita/visita.component';


export const routes = [
  { path: '', component: HomepageComponent},
  {
    path: 'home',
    component: LayoutComponent,
    children: [
      { path: '', component: HomepageComponent },
      {path: 'home', component: HomepageComponent},
      {path: 'panel', component: PerfilComponent},
      {path: 'addservice', component: AddserviceComponent},
      {path: 'contraolvidada', component: ContraolvidadaComponent},
      {path: 'inicio', component: InicioComponent},
      {path: 'visita', component: VisitaComponent},
      {path: 'perfil', component: PerfilComponent},
    ],
  },
  {
    path: 'contraolvidada', component: ContraolvidadaComponent
  }
  //not lazy load components
  //{ path: '**', redirectTo: 'home-page' },
];
