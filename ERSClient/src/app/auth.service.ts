import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable()
export class AuthService {

  private currentUser$: BehaviorSubject<UserInfo> = new BehaviorSubject<UserInfo>(undefined);

  setCurrentUser(userInfo: UserInfo): void {
    this.currentUser$.next(userInfo);
  }

  getCurrentUser(): Observable<UserInfo> {
    return this.currentUser$.asObservable();
  }

  signOut() {
    this.currentUser$.next(undefined);
  }

}

export interface UserInfo {
  username: string;
  authority: string;
  firstName: string;
  lastName: string;
}