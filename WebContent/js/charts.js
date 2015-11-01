/*function grafica_peso2() {

    var opciones = {
        chart: {
            renderTo: 'container',
            type: 'spline'
        },
        series: [{}]
    };

    $.getJSON('pesos_paciente.json', function(data) {
        opciones.series[0].data = data;
        var chart = new Highcharts.Chart(opciones);
    });
}*/
function grafica_peso2() {

    var opciones = {
    	title: {
    		text: 'Peso',
    		x: -20 //center
    	},
    	tooltip: {
            valueSuffix: 'Kg'
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 0
        },
        chart: {
            renderTo: 'grafica-peso',
            type: 'spline'
        },
        series: [{}]
    };

    $.getJSON('json_examples/pesos_paciente.json', function(data) {
        opciones.series[0].data = data;
        var chart = new Highcharts.Chart(opciones);
    });
}


function grafica_peso() {

    $('#grafica-peso').highcharts({
        title: {
            text: 'Peso',
            x: -20 //center
        },
        xAxis: {
            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
                'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
        },
        yAxis: {
            title: {
                text: 'Peso (Kg)'
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },
        tooltip: {
            valueSuffix: 'Kg'
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 0
        },
        series: [{
            name: 'Peso',
            data: [71.0, 70.9, 79.5, 74.5, 78.2, 71.5, 75.2, 76.5, 73.3, 75.3, 73.9, 79.6]
        }]
    });
}

/* Muestra las glucemias en un mismo día, a lo largo del día */
function glucemias_dia() {
    $('#grafica-glucemias').highcharts({
        title: {
            text: 'Glucemias a lo largo del día',
            x: -20 //center
        },
        xAxis: {
            categories: ['0:00', '2:00', '4:00', '6:00', '8:00', '10:00',
                '12:00', '14:00', '16:00', '18:00', '20:00', '22:00']
        },
        yAxis: {
            title: {
                text: 'Glucemias'
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 0
        },
        series: [{
            name: 'Glucemias',
            data: [200, 203, 223, 212, 230, 195, 198, 205, 183, 198, 200, 202]
        }]
    });
}

/* Muestra las glucemias a lo largo de varios días, en el mismo momento del día */
function glucemias_periodo() {
    $('#grafica-glucemias').html("");
    $('#grafica-glucemias').highcharts({
        title: {
            text: 'Glucemias a lo largo de varios días',
            x: -20 //center
        },
        xAxis: {
            categories: ['L', 'M', 'X', 'J', 'V', 'S', 'D']
        },
        yAxis: {
            title: {
                text: 'Glucemias'
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 0
        },
        series: [{
            name: 'Glucemias',
            data: [200, 203, 223, 212, 230, 195, 198]
        }]
    });
}

function grafica_ejercicio() {
    $('#grafica-ejercicio').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: 'Stacked column chart'
        },
        xAxis: {
            categories: ['L', 'M', 'X', 'J', 'V', 'S', 'D']
        },
        yAxis: {
            min: 0,
            title: {
                text: 'Ponderación'
            },
            stackLabels: {
                enabled: true,
                style: {
                    fontWeight: 'bold',
                    color: (Highcharts.theme && Highcharts.theme.textColor) || 'gray'
                }
            }
        },
        legend: {
            align: 'right',
            x: -30,
            verticalAlign: 'top',
            y: 25,
            floating: true,
            backgroundColor: (Highcharts.theme && Highcharts.theme.background2) || 'white',
            borderColor: '#CCC',
            borderWidth: 1,
            shadow: false
        },
        tooltip: {
            formatter: function () {
                return '<b>' + this.x + '</b><br/>' +
                    this.series.name + ': ' + this.y + '<br/>' +
                    'Total: ' + this.point.stackTotal;
            }
        },
        plotOptions: {
            column: {
                stacking: 'normal',
                dataLabels: {
                    enabled: true,
                    color: (Highcharts.theme && Highcharts.theme.dataLabelsColor) || 'white',
                    style: {
                        textShadow: '0 0 3px black'
                    }
                }
            }
        },
        series: [{
            name: 'Intensidad',
            data: [5, 3, 4, 7, 2, 4, 5]
        }, {
            name: 'Duración',
            data: [20, 20, 30, 20, 10, 40, 50]
        }]
    });
}