function newJoke() {
    console.log('requesting new chuck norris joke');
    fetch('http://api.icndb.com/jokes/random?limitTo=[nerdy]')
        .then(resp => resp.json())
        .then(data => {
            document.getElementById('chuck-norris-joke').innerText = data.value.joke;
            console.log(data);
        })
        .catch(console.log);
}