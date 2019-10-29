// JS is loosely typed but it does still have types

function checkType(input) {
    console.log(`input = ${input} and has type: ${typeof(input)}`);
}

checkType(0);
checkType(false);
checkType(-11);
checkType(1.5);
checkType('f');
checkType("wello horld");
checkType(Math.pow(10,100));
checkType(undefined);
checkType(null);
checkType(checkType);
checkType();
checkType(5, 25, 18, 'hello');
checkType(``);
checkType(5e30);
checkType([1,2,3]);
checkType(NaN);
checkType(Infinity);