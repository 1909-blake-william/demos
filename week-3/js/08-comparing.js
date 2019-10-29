function comparison(one, two) {
    console.log(`
one = ${one} with type: ${typeof(one)}
two = ${two} with type: ${typeof(two)}
    one == two is: ${one == two}
    one === two is: ${one === two}`);
}

comparison(5, 5);
comparison(0, '0');
comparison(null, undefined);
comparison(Infinity, NaN);
comparison(null, {});
comparison(NaN, NaN);
comparison(null, null);
comparison('true', true);
comparison(5, 5.0);
comparison('a', "a");
