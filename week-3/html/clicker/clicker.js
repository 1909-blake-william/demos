let count = 20;
let autoClicks = 0;
function incrementClick(amount) {
    console.log('clicked');
    count += amount;
    const display = document.getElementById('clicker-display');
    display.innerText = `clicks: ${count}`
    if(count % 10 === 0) {
        // stack overflow code for random hex value
        const colorHex = '#'+((1<<24)*Math.random()|0).toString(16);

        // assign color style the new hex value
        display.style.color = colorHex;
    }
}

function buyAutoClick() {
    if(count >= 25) {
        autoClicks++;
        incrementClick(-25);
    }
}

setInterval(() => {
    incrementClick(autoClicks);
}, 500);