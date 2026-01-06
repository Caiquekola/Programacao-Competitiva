let qntValores = 30;
let limite = 10;
let vetorGaussiano = new Array(limite).fill(0);
let valores = []

let divisoes = qntValores / limite;

for (let i = 0; i < qntValores; i++) {
    let valor = Math.floor(Math.random() * 30) + 1;
    valores.push(valor)
    let posicao = valor / divisoes;
    if (posicao == limite) { posicao = limite - 1 }
    vetorGaussiano[Math.floor(posicao)]++;
}
let valoresSorteados = [...valores].sort((a, b) => a - b);
console.log(valoresSorteados)
console.log(vetorGaussiano)

for (let i = 0; i < vetorGaussiano.length; i++) {
    let quantidade = vetorGaussiano[i];
    let estrelas = "";

    for (let j = 0; j < quantidade; j++) {
        estrelas += "*"; 
    }

    console.log(`${estrelas}`);
}



