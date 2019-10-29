function truthyFalsy(input) {
    console.log(`
input = ${input} is type: ${typeof(input)}
    evalutes to ${!!input}`)
}

truthyFalsy(0);
truthyFalsy('0');
truthyFalsy('false');
truthyFalsy('');
truthyFalsy('NaN');
truthyFalsy(NaN);
truthyFalsy(Infinity);
truthyFalsy(null);
truthyFalsy(undefined);
truthyFalsy({});
truthyFalsy([]);
truthyFalsy(truthyFalsy);
truthyFalsy(false);
let a;
truthyFalsy(a);