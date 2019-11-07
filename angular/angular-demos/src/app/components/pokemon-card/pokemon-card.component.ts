import { Component, OnInit } from '@angular/core';
import { Pokemon } from 'src/app/model/pokemon.model';

@Component({
  selector: 'app-pokemon-card',
  templateUrl: './pokemon-card.component.html',
  styleUrls: ['./pokemon-card.component.scss']
})
export class PokemonCardComponent implements OnInit {

  pokemon: Pokemon = {
    id: 5,
    healthPoints: 50,
    level: 10,
    name: 'Gyarados',
    trainer: {
      id: 1,
      username: 'Clifford',
      password: null,
      role: 'trainer'
    },
    type: {
      id: 2,
      name: 'water'
    }
  };

  infoToggled = false;

  constructor() { }

  ngOnInit() {
  }

  toggleInfo() {
    this.infoToggled = !this.infoToggled;
  }

}
