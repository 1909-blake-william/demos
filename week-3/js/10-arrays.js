
let arr = [0, 5, 'hello', {name: 'Josh'}, [5, 2], null, undefined, true];
console.log(arr);

let pokemon = [
    {
        id: 1,
        name: 'Zord',
        hp: 500,
        level: 5, 
        type: {
            id: 5,
            name: 'Steel'
        }
    },
    {
        id: 2,
        name: 'Zarg',
        hp: 250,
        level: 5, 
        type: {
            id: 4,
            name: 'Fire'
        }
    },
    {
        id: 3,
        name: 'Zap',
        hp: 500,
        level: 5, 
        type: {
            id: 3,
            name: 'Electric'
        }
    },
    {
        id: 4,
        name: 'Zorp',
        hp: 200,
        level: 5, 
        type: {
            id: 5,
            name: 'Ghost'
        }
    },   
]

console.log(pokemon);

for(let p of pokemon) {
    console.log(p);
}

pokemon.forEach((ele) => {
    console.log(ele);
})

// let filtered = pokemon.filter(ele => {
//     return ele.hp < 300;
// });
// console.log(filtered);

pokemon.filterReplica = function(cb) {
    let result = [];
    for(let p of this) {
        if(cb(p)) {
            result.push(p);
        }
    }
    return result;
}
console.log('\nout replicated filter method');
console.log(pokemon.filterReplica(ele => {
    return ele.hp < 300;
}));