let a = {
    id: 1,
    name: 'Zord',
    hp: 500,
    level: 5,
    type: {
        id: 5,
        name: 'Steel'
    },
    trainer: {
        id: 1,
        name: 'tommy'
    }
}
console.log(a.experience);
// can use dot notation to access fields
console.log(a.hp);
console.log(a.trainer.name);
// can also use bracket notation
console.log(a['trainer']);
console.log(a['level']);

// we can also dynamically add fields to objects
// maybe not a good idea
a.experience = 35;
console.log(a);
