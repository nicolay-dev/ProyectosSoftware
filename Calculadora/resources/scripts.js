var result = 0;
var number1 = "";
var number2 = "";
var flag = true;
var operacion = 0;

function op(valueOP, operacionS) {
    operacion = parseInt(valueOP);
    if (flag == false) {
        number1 = result;
    }
    setText(operacionS);
}

function igual() {
    console.log("n1: " + number1);
    console.log("n2: " + number2);
    switch (operacion) {
        case 1:
            result = parseInt(number1) + parseInt(number2);
            setText(result);
            break;
        case 2:
            result = parseInt(number1) - parseInt(number2);
            setText(result);
            break;
        case 3:
            result = parseInt(number1) * parseInt(number2);
            setText(result);
            break;
        case 4:
            result = parseInt(number1) / parseInt(number2);
            setText(result);
            break;
        case 5:
            result = parseInt(number1) * (-1);
            setText(result);
            break;

        case 6:
            result = 1 / parseInt(number1);
            setText(result);
            break;
        case 7:
            result = (number1) * parseInt(number2) / 100;
            setText(result);
            break;

        default:
            break;
    }
    console.log("Result: " + result);
    operacion = 0;
    flag = false;
    number1 = "";
    number2 = "";
}

function escribir(es) {
    if (operacion == 0) {
        flag = true;
    } else {
        flag = false;
    }
    if (flag == true) {
        number1 = number1 + es;
        setText(number1);
    } else {
        number2 = number2 + es;
        setText(number2);
    }
}

function borrar() {
    number1 = "";
    number2 = "";
    result = 0;
    flag = true;
    operacion = 0;
    setText("0");
}

function setText(text) {
    $('h2').html(text);
}