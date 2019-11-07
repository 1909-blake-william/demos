import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './components/first/first.component';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { NavComponent } from './components/nav/nav.component';
import { BlakeComponent } from './components/blake/blake.component';
import { ClickerComponent } from './components/clicker/clicker.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { HeroesComponent } from './components/heroes/heroes.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { SecondComponent } from './components/second/second.component';
import { PipeComponent } from './components/pipe/pipe.component';
import { NestedComponent } from './components/nested/nested.component';
import { PokemonComponent } from './components/pokemon/pokemon.component';
import { UsersComponent } from './components/users/users.component';
import { TicTacToeComponent } from './components/tic-tac-toe/tic-tac-toe.component';
import { SpringComponent } from './components/spring/spring.component';
import { PokemonCardComponent } from './components/pokemon-card/pokemon-card.component';

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    NavComponent,
    BlakeComponent,
    ClickerComponent,
    NotFoundComponent,
    HeroesComponent,
    HomeComponent,
    LoginComponent,
    SecondComponent,
    PipeComponent,
    NestedComponent,
    PokemonComponent,
    UsersComponent,
    TicTacToeComponent,
    SpringComponent,
    PokemonCardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
