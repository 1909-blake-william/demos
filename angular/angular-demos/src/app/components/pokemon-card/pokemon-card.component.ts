import { Component, OnInit, Input } from '@angular/core';
import { Pokemon } from 'src/app/model/pokemon.model';

@Component({
  selector: 'app-pokemon-card',
  templateUrl: './pokemon-card.component.html',
  styleUrls: ['./pokemon-card.component.scss']
})
export class PokemonCardComponent implements OnInit {

  @Input()
  pokemon: Pokemon;

  infoToggled = false;

  constructor() { }

  ngOnInit() {

  }

  toggleInfo() {
    this.infoToggled = !this.infoToggled;
  }

}
