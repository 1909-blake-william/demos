function findPokemon() {
    const id = document.getElementById('pokemon-id-input').value;
    fetch(`https://pokeapi.co/api/v2/pokemon/${id}`)
        .then(resp => resp.json())
        .then(addPokemonToList)
        .catch(err => {
            $('#error-toast').toast('show');
        });

}


function addPokemonToList(pokemon) {
    const list = document.getElementById('pokemon-list');

    const pokemonItem = document.createElement('li');
    pokemonItem.innerText = pokemon.name;
    list.appendChild(pokemonItem);
}