import { PokemonType } from './pokemon-type.model';
import { AppUser } from './user.model';

export class Pokemon {
    constructor(
        public id = 0,
        public name = '',
        public level = 0,
        public healthPoints = 0,
        public type = new PokemonType(),
        public trainer = new AppUser()
    ) {}
}
