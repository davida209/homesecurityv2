import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { RouterModule } from "@angular/router";
import { routes } from "./routes";
import { HomepageModule } from "src/app/paginas/homepage/homepage.module";


@NgModule({
    declarations: [],
    imports: [
        RouterModule.forRoot(routes,{
            useHash: true
        }),
        HomepageModule
    ],
    exports: [RouterModule],
    entryComponents: []
})

export class RoutesModule{}