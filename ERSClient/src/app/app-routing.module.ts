import { NgModule } from "@angular/core";
import { RouterModule, Routes } from '@angular/router';

// Step 1: We need to define our Routes
const routes: Routes = [
  // Construct our route instances
  {
    path: 'login',
    // component: LoginContainerComponent

    // When we go to the /login, load up the Login Module lazily
    loadChildren: () => import('./login/login.module').then(mod => mod.LoginModule)
  },
  {
    path: 'home',
    loadChildren: () => import('./home/home.module').then(mod => mod.HomeModule)
  },
  {
    path: '**',
    redirectTo: '/login',
    pathMatch: 'full'
  }
];

@NgModule({
  // Import the RoutingModule
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule {}