import { Component, OnInit } from '@angular/core';
import { AuthService, UserInfo } from 'src/app/auth.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-home-container',
  templateUrl: './home-container.component.html',
  styleUrls: ['./home-container.component.css']
})
export class HomeContainerComponent implements OnInit {

  currentUser$: Observable<UserInfo> = this.authService.getCurrentUser();

  constructor(
    private authService: AuthService
  ) { }

  ngOnInit() {
  }

}
