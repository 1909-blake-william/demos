import { Component, OnInit } from '@angular/core';
import { Pokemon } from 'src/app/model/pokemon.model';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-pokemon',
  templateUrl: './pokemon.component.html',
  styleUrls: ['./pokemon.component.scss']
})
export class PokemonComponent implements OnInit {

  pokemon: Pokemon[] = [];

  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
    this.httpClient.get<Pokemon[]>('http://localhost:8080/PokemonApi/pokemon', {
      withCredentials: true
    })
      .subscribe(data => {
        console.log(data);
        this.pokemon = data;
      }, err => {
        console.log(err);
      });
  }

  release(id: number) {
    this.httpClient.delete(`http://localhost:8080/PokemonApi/pokemon?id=${id}`)
      .subscribe(data => {
        this.pokemon = this.pokemon.filter(poke => poke.id !== id);
      }, err => {
        console.log(err);
      });
  }

}
