
function Pokemon(id, name, hp, level, type) {
    this.id = id;
    this.name = name;
    this.hp = hp;
    this.level = level;
    this.type = type;
}

let a  = new Pokemon(5, 'Zord', 500, 5, {id: 5, name: 'steel'});
console.log(a);