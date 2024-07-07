alert('Boas vindas ao jogo do número secreto!');
let numeroSecreto = 5;
console.log(numeroSecreto);
let chute;
let tentativas = 1; 

while(chute != numeroSecreto) {
    chute = prompt('Escolha um número entre 1 e 30');

    if(numeroSecreto == chute) {
        alert('Isso aí, você descobriu o numero secreto ' + numeroSecreto + ' na tentativa ' + tentativas );
    } else {
        if (chute > numeroSecreto) {
            alert('O número secreto é menor que ' + chute);
        } else {
            alert('O número secreto é maior que ' + chute);
        }
        tentativas ++;
    }
}

