// var has 2 scopes, global and function
// global var gets hoisted to the global window object
// let and const have global, function, and block

// global variables let or var works
var g = 22;
let h = 15;

function fun() {
    // var gets hoisted to the top of its scope
    console.log(`before declared a = ${a}`); // a is undefined here
    // console.log(`before declared b = ${b}`); // will break code

    if(true) {
        var a = 5;
        let b = 10;
    }
    console.log(`g = ${g}`);
    console.log(`h = ${h}`);
    console.log(`a = ${a}`); // this is fine
    console.log(`b = ${b}`); // not fine // throws error here
}

fun();
