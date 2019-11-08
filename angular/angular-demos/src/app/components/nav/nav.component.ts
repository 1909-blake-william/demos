import { Component, OnInit, OnDestroy } from '@angular/core';
import { AuthService } from 'src/app/services/auth.service';
import { AppUser } from 'src/app/model/user.model';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.scss']
})
export class NavComponent implements OnInit, OnDestroy {

  currentUser: AppUser;
  userSubscription: Subscription;

  constructor(private authService: AuthService) { }

  ngOnInit() {
    // every time the subject publishes new content 
    // it will invoke the subscriber method
    this.userSubscription = this.authService.$currentUser.subscribe(user => {
      this.currentUser = user;
    });
  }

  ngOnDestroy() {
    this.userSubscription.unsubscribe();
  }

}
