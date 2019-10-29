class Pokemon {
    constructor(id, name, hp, level, type) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.type = type;
    }

}

let a = new Pokemon(5, 'Pikachu', 50, 10, {id: 3, name: 'Electric'});
console.log(a);