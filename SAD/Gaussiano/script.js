let qntValores = 30;
let limite = 10;
let vetorGaussiano = new Array(limite).fill(0);
let valores = []

let divisoes = qntValores / limite;

for (let i = 0; i < qntValores; i++) {
    let valor = Math.floor(Math.random() * qntValores) + 1;
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

google.charts.load('current', { 'packages': ['corechart'] });
google.charts.setOnLoadCallback(desenharGrafico);

function desenharGrafico() {
    let dadosFormatados = [['Intervalo', 'Frequência']];
    for (let i = 0; i < vetorGaussiano.length; i++) {
        dadosFormatados.push([`${(i)*divisoes}-${(i+1)*divisoes}`, vetorGaussiano[i]]);
    }

    let data = google.visualization.arrayToDataTable(dadosFormatados);

    let options = {
        title: 'Frequência de números aleatórios',
        legend: { position: 'none' },
        vAxis: { title: 'Quantidade de Ocorrências' },
        hAxis: { title: 'Faixas de frequência' }
    };

    let chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));
    chart.draw(data, options);

}

