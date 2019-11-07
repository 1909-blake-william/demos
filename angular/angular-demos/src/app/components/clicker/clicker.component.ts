import { Component, OnInit, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-clicker',
  templateUrl: './clicker.component.html',
  styleUrls: ['./clicker.component.scss']
})
export class ClickerComponent implements OnInit, OnDestroy {

  clickAmount = 0;
  autoAmount = 0;

  autoInterval;

  plusTwoUnlocked = false;

  constructor() { }

  ngOnInit() {
    this.autoInterval = setInterval(() => {
      this.increment(this.autoAmount);
    }, 1000);
  }

  increment(amount: number): void {
    this.clickAmount += amount;
  }

  incrementAuto(amount: number): void {
    this.autoAmount += amount;
    this.clickAmount -= 25 * amount;
  }

  unlockPlusTwo() {
    this.plusTwoUnlocked = true;
    this.clickAmount -= 100;
  }

  ngOnDestroy() {
    console.log('removing interval');
    clearInterval(this.autoInterval);
  }
}
