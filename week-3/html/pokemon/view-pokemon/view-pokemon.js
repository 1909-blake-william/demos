function newPokemonSubmit(event) {
    event.preventDefault(); // stop page from refreshing
    console.log('submitted');
    
    const pokemon = getPokemonFromInputs();
    addPokemonToTableSafe(pokemon);
    console.log(pokemon);
}

function addPokemonToTableSafe(pokemon) {

    // create the row element
    const row = document.createElement('tr');

    // create all the td elements and append them to the row
    const nameData = document.createElement('td');
    nameData.innerText = pokemon.name;
    row.appendChild(nameData);

    const typeData = document.createElement('td');
    typeData.innerText = pokemon.type.name;
    row.appendChild(typeData);

    const hpData = document.createElement('td');
    hpData.innerText = pokemon.hp;
    row.appendChild(hpData);

    const levelData = document.createElement('td');
    levelData.innerText = pokemon.level;
    row.appendChild(levelData);

    const trainerData = document.createElement('td');
    trainerData.innerText = pokemon.trainer.name;
    row.appendChild(trainerData);

    // append the row into the table
    document.getElementById('pokemon-table-body').appendChild(row);
}

function addPokemonToTable(pokemon) {
    document.getElementById('pokemon-table-body').innerHTML += `
    <tr>
        <td>${pokemon.name}</td>
        <td>${pokemon.type.name}</td>
        <td>${pokemon.hp}</td>
        <td>${pokemon.level}</td>
        <td>${pokemon.trainer.name}</td>
    </tr>
    `;
}


function getPokemonFromInputs() {
    const pokemonName = document.getElementById('pokemon-name-input').value;
    const pokemonHp = document.getElementById('pokemon-hp-input').value;
    const pokemonLevel = document.getElementById('pokemon-level-input').value;
    const pokemonType = document.getElementById('pokemon-type-select').value;

    const pokemon = {
        name: pokemonName,
        hp: pokemonHp,
        level: pokemonLevel,
        type: {
            id: 5, // should probably find a way to get the correct id
            name: pokemonType
        },
        trainer: {
            name: 'blake' // should probably get the rest of the trainer info
        }
    }
    return pokemon;
}