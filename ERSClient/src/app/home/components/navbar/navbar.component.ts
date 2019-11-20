import { Component, OnInit, Input } from '@angular/core';
import { AuthService, UserInfo } from 'src/app/auth.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  @Input("user") currentUser: UserInfo;

  constructor(
    private authService: AuthService
  ) { }

  ngOnInit() {
  }

  signOut() {
    this.authService.signOut();
  }

}
