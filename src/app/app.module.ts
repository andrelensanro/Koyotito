import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MenuComponent } from './components/menu/menu.component';
import { MatToolbarModule } from "@angular/material/toolbar";
import { HomeComponent } from './components/home';
import { MatButtonModule } from "@angular/material/button";
import { RegistroComponent } from './components/registro/registro.component';
import { MatInputModule } from "@angular/material/input";
import { FormsModule } from "@angular/forms";
import {MatDialogModule} from '@angular/material/dialog';
import {  MatCardModule } from "@angular/material/card";
import { inicioSesionDialog } from './components/menu/inicioSesion.component';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonToggleModule} from '@angular/material/button-toggle';
import { RecuperarContraComponent } from './components/sesion/RecuperarContra.component';
import {ToastrModule} from 'ngx-toastr';
import { ReestContraComponent } from './components/sesion/ReestContra.component';
import { InicioProfComponent } from './components/Profesor/InicioProf.component';
import { navBar1Component } from './components/Profesor/navBar1.component';
import {MatSidenavModule} from '@angular/material/sidenav';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    RegistroComponent,
    HomeComponent,
    inicioSesionDialog,
    RecuperarContraComponent,
    ReestContraComponent,
    InicioProfComponent,
    navBar1Component,
      ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatInputModule,
    MatButtonModule,
    FormsModule,
    MatDialogModule,
    MatCardModule,
    MatIconModule,
    MatButtonToggleModule,
    ToastrModule.forRoot({
      timeOut: 1000,
      positionClass: 'toast-bottom-right'
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
