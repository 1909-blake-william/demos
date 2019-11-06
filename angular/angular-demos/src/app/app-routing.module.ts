import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BlakeComponent } from './components/blake/blake.component';
import { ClickerComponent } from './components/clicker/clicker.component';
import { FirstComponent } from './components/first/first.component';
import { HeroesComponent } from './components/heroes/heroes.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NestedComponent } from './components/nested/nested.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { PipeComponent } from './components/pipe/pipe.component';
import { PokemonComponent } from './components/pokemon/pokemon.component';
import { SecondComponent } from './components/second/second.component';
import { SpringComponent } from './components/spring/spring.component';
import { TicTacToeComponent } from './components/tic-tac-toe/tic-tac-toe.component';
import { UsersComponent } from './components/users/users.component';


const routes: Routes = [
  {
    path: 'first',
    component: FirstComponent
  },
  {
    path: 'me',
    component: BlakeComponent
  },
  {
    path: 'clicker',
    component: ClickerComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'heroes',
    component: HeroesComponent
  },
  {
    path: 'second',
    component: SecondComponent
  },
  {
    path: 'parent',
    component: NestedComponent
  },
  {
    path: 'pipe',
    component: PipeComponent
  },
  {
    path: 'pokemon',
    component: PokemonComponent
  },
  {
    path: 'users',
    component: UsersComponent
  },
  {
    path: 'tic-tac',
    component: TicTacToeComponent
  },
  {
    path: 'spring',
    component: SpringComponent
  },
  {
    path: '**',
    pathMatch: 'full',
    component: NotFoundComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
