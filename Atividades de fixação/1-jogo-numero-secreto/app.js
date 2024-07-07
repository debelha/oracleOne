alert('Boas vindas ao jogo do número secreto!');
let numeroSecreto = 4;
console.log(numeroSecreto);
let chute = prompt('Escolha um número entre 1 e 30');

console.log('Resultado da comparação:', chute == numeroSecreto);

if(numeroSecreto == chute) {
    alert('Isso aí, você descobriu o numero secreto ' + numeroSecreto);
} else {
    alert('Você errou :(');
}