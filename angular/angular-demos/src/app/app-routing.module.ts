import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FirstComponent } from './components/first/first.component';
import { BlakeComponent } from './components/blake/blake.component';
import { ClickerComponent } from './components/clicker/clicker.component';
import { NotFoundComponent } from './components/not-found/not-found.component';


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
