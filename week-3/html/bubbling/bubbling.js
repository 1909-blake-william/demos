
const divs = document.getElementsByTagName('div');

for (const div of divs) {
    div.addEventListener('click', (event) => {

        // event.stopPropagation();
        console.log(`div with id: ${div.id} clicked`);
        if (div.style.backgroundColor === 'red') {
            div.style.backgroundColor = 'white';
        } else {
            div.style.backgroundColor = 'red';
        }
    }); // can add a thrid parameter for capturing
}
