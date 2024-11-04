// CALCULATOR PROGRAM

Const display = document.getElementById("display");
function appendToDisplay(input){
display.value += input;
}
function clearDisplay() {
display.value += "";
}
function calculator(){
display.value = eval(display.value);
}
