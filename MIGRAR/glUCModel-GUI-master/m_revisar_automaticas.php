<?php
    include_once('header.php');
?>

<!-- $$ Título de la sección -->
<div class="jumbotron" id="titulo_seccion">
    <p>Recomendaciones automáticas</p>
</div>
<!-- ## Título de la sección -->

<!-- $$ Panel principal -->
<!-- $$ Container 1 -->
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">Para el siguiente caso se han deducido las siguientes recomendaciones:</h3> 
        </div>
        <div class="panel-body">
            <!-- $$ Columna foto -->
            <div class="col-sm-4">
                <img src="img/placeholders/portrait.png" class="img-responsive" alt="Imagen del paciente" width="200" height="300">
            </div>
            <!-- ## Columna foto -->
            <!-- $$ Columna datos 1 -->
            <div class="col-sm-4">
                <ul>
                    <li>Nombre: Paco Pérez</li>
                    <li>Peso: 76 Kg</li>
                    <li>Altura: 176 cm</li>
                    <li>IMC: 23.4</li>
                    <li>Tipo de diabetes: TIPO 1</li>
                </ul>
            </div>
            <!-- ## Columna datos 1 -->
            <!-- $$ Columna datos 2 -->
            <div class="col-sm-4">
                <ul>
                    <li>Otras enfermedades:
                        <ol>
                            <li>Enfermedad 1</li>
                            <li>Enfermedad 2</li>
                        </ol>
                    </li>
                    <li>Medicación actual:
                        <ol>
                            <li>Medicamento X</li>
                            <li>Medicamento Y</li>
                        </ol>
                    </li>
                </ul>
            </div>
            <!-- ## Columna datos 2 -->
        </div>
    </div>
</div>
<!-- ## Container 1 -->

<!-- $$ Container 2 -->
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">Variables bajo seguimiento</h3>
        </div>
        <div class="panel-body">
            <!-- $$ Fila 1 de gráficas -->
            <div class="row">
                <!-- $$ grid 3x2 var. 1 -->
                <div class="col-sm-4">
                    <div class="panel panel-default panel-formal">
                        <div class="panel-heading">
                            <p>Peso</p>
                        </div>
                        <div class="panel-body">
                            <img src="img/placeholders/graph_blue.png" class="img-responsive" alt="Grafica var. 1" width="869" height="471">
                        </div>
                        <div class="panel-footer">
                            <div class="row">
                                <div class="col col-sm-8">
                                    <label>Causante:</label>
                                    <input name="causante" type="checkbox" value="on"/>
                                    <label>Prioridad:</label>
                                    <input type="text" name="q" value="" class="tf-sm"/>
                                </div>
                                <div class="col col-sm-4">
                                    <button type="button" class="btn-ver-md float-right">Detalles</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ## grid 3x2 var. 1 -->
                <!-- $$ grid 3x2 var. 2 -->
                <div class="col-sm-4">
                    <div class="panel panel-default panel-formal">
                        <div class="panel-heading">
                            <p>Glucemias</p>
                        </div>
                        <div class="panel-body">
                            <img src="img/placeholders/graph_green.png" class="img-responsive" alt="Grafica var. 2" width="869" height="471">
                        </div>
                        <div class="panel-footer">
                            <div class="row">
                                <div class="col col-sm-8">
                                    <label>Causante:</label>
                                    <input name="causante" type="checkbox" value="on"/>
                                    <label>Prioridad:</label>
                                    <input type="text" name="q" value="" class="tf-sm"/>
                                </div>
                                <div class="col col-sm-4">
                                    <button type="button" class="btn-ver-md float-right">Detalles</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ## grid 3x2 var. 2 -->
                <!-- $$ grid 3x2 var. 3 -->
                <div class="col-sm-4">
                    <div class="panel panel-default panel-formal">
                        <div class="panel-heading">
                            <p>Insulina</p>
                        </div>
                        <div class="panel-body">
                            <img src="img/placeholders/graph_orange.png" class="img-responsive" alt="Grafica var. 3" width="869" height="471">
                        </div>
                        <div class="panel-footer">
                            <div class="row">
                                <div class="col col-sm-8">
                                    <label>Causante:</label>
                                    <input name="causante" type="checkbox" value="on"/>
                                    <label>Prioridad:</label>
                                    <input type="text" name="q" value="" class="tf-sm"/>
                                </div>
                                <div class="col col-sm-4">
                                    <button type="button" class="btn-ver-md float-right">Detalles</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ## grid 3x2 var. 3 -->
            </div>
            <!-- ## Fila 1 de gráficas -->
            <!-- $$ Fila 2 de gráficas -->
            <div class="row">
                <!-- $$ grid 3x2 var. 4 -->
                <div class="col-sm-4">
                    <div class="panel panel-default panel-formal">
                        <div class="panel-heading">
                            <p>Dieta</p>
                        </div>
                        <div class="panel-body">
                            <img src="img/placeholders/graph_red.png" class="img-responsive" alt="Grafica var. 4" width="869" height="471">
                        </div>
                        <div class="panel-footer">
                            <div class="row">
                                <div class="col col-sm-8">
                                    <label>Causante:</label>
                                    <input name="causante" type="checkbox" value="on"/>
                                    <label>Prioridad:</label>
                                    <input type="text" name="q" value="" class="tf-sm"/>
                                </div>
                                <div class="col col-sm-4">
                                    <button type="button" class="btn-ver-md float-right">Detalles</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ## grid 3x2 var. 4 -->
                <!-- $$ grid 3x2 var. 5 -->
                <div class="col-sm-4">
                    <div class="panel panel-default panel-formal">
                        <div class="panel-heading">
                            <p>Ejercicio</p>
                        </div>
                        <div class="panel-body">
                            <img src="img/placeholders/graph_green.png" class="img-responsive" alt="Grafica var. 5" width="869" height="471">
                        </div>
                        <div class="panel-footer">
                            <div class="row">
                                <div class="col col-sm-8">
                                    <label>Causante:</label>
                                    <input name="causante" type="checkbox" value="on"/>
                                    <label>Prioridad:</label>
                                    <input type="text" name="q" value="" class="tf-sm"/>
                                </div>
                                <div class="col col-sm-4">
                                    <button type="button" class="btn-ver-md float-right">Detalles</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ## grid 3x2 var. 5 -->
                <!-- $$ grid 3x2 var. 6 -->
                <div class="col-sm-4">
                    <div class="panel panel-default panel-formal">
                        <div class="panel-heading">
                            <p>Nombre variable 6</p>
                        </div>
                        <div class="panel-body">
                            <img src="img/placeholders/graph_green.png" class="img-responsive" alt="Grafica var. 6" width="869" height="471">
                        </div>
                        <div class="panel-footer">
                            <div class="row">
                                <div class="col col-sm-8">
                                    <label>Causante:</label>
                                    <input name="causante" type="checkbox" value="on"/>
                                    <label>Prioridad:</label>
                                    <input type="text" name="q" value="" class="tf-sm"/>
                                </div>
                                <div class="col col-sm-4">
                                    <button type="button" class="btn-ver-md float-right">Detalles</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ## grid 3x2 var. 6 -->
            </div>
            <!-- ## Fila 2 de gráficas -->
        </div>
    </div>
</div>
<!-- ## Container 2 -->

<!-- $$ Container 3 -->
<div class="container">
    <div class="panel panel-default">
        <!-- $$ Panel heading -->
        <div class="panel-heading">
            <h3 class="panel-title">Casos similares</h3>
        </div>
        <!-- ## Panel heading -->
        <!-- $$ Panel body -->
        <div class="panel-body">
            <div class="row">
                <div class="col-md-12">
                    <table class="table table-striped">
                        <tr>
                            <th>Nº caso</th>
                            <th>Nombre paciente</th> 
                            <th>Fecha</th>
                            <th>Otros</th>
                        </tr>
                        <tr>
                            <td>Caso 1</td>
                            <td>Paciente 1</td>
                            <th>dd/mm/yyyy</th> 
                            <td><button type="button" class="btn-light-sm pull-right">Ver</button></td>
                        </tr>
                        <tr>
                            <td>Caso 2</td>
                            <td>Paciente 2</td>
                            <th>dd/mm/yyyy</th> 
                            <td><button type="button" class="btn-light-sm pull-right">Ver</button></td>
                        </tr>
                        <tr>
                            <td>Caso 3</td>
                            <td>Paciente 3</td>
                            <th>dd/mm/yyyy</th> 
                            <td><button type="button" class="btn-light-sm pull-right">Ver</button></td>
                        </tr>
                        <tr>
                            <td>Caso 4</td>
                            <td>Paciente 4</td>
                            <th>dd/mm/yyyy</th> 
                            <td><button type="button" class="btn-light-sm pull-right">Ver</button></td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <!-- ## Panel body -->
    </div>
</div>
<!-- ## Container 3 -->

<!-- $$ Container 4 -->
<div class="container">
    <div class="panel panel-default">
        <!-- $$ Panel heading -->
        <div class="panel-heading">
            <h3 class="panel-title">Añadir recomendación</h3>
        </div>
        <!-- ## Panel heading -->
        <!-- $$ Panel body -->
        <div class="panel-body">
            <div class="row">
                <div class="col-md-6">
                    <h4>Recomendaciones para este caso:</h4>
                    <ul class="list-group scroll-list ul-coloured"><!-- Explicar -->
                        <li class="list-group-item">Recomendación 1: blablablalba
                            <button type="button" class="btn-light-sm">Confirmar</button>
                            <button type="button" class="btn-light-sm">Eliminar</button>
                            <button type="button" class="btn-light-sm">Ver motivos</button>
                        </li>
                        <li class="list-group-item">Recomendación 2: blablablalba
                            <button type="button" class="btn-light-sm">Confirmar</button>
                            <button type="button" class="btn-light-sm">Eliminar</button>
                            <button type="button" class="btn-light-sm">Ver motivos</button>
                        </li>
                        <li class="list-group-item">Recomendación 3: blablablalba
                            <button type="button" class="btn-light-sm">Confirmar</button>
                            <button type="button" class="btn-light-sm">Eliminar</button>
                            <button type="button" class="btn-light-sm">Ver motivos</button>
                        </li>
                        <li class="list-group-item">Recomendación 4: blablablalba
                            <button type="button" class="btn-light-sm">Confirmar</button>
                            <button type="button" class="btn-light-sm">Eliminar</button>
                            <button type="button" class="btn-light-sm">Ver motivos</button>
                        </li>
                        <li class="list-group-item">Recomendación 5: blablablalba
                            <button type="button" class="btn-light-sm">Confirmar</button>
                            <button type="button" class="btn-light-sm">Eliminar</button>
                            <button type="button" class="btn-light-sm">Ver motivos</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- ## Panel body -->
        <!-- panel-footer -->
        <div class="panel-footer">
            <div class="row">
                <div class="col col-sm-4">
                    <button type="button" class="btn-ver-md">VALIDAR</button>
                </div>
                <div class="col col-sm-4">
                    <button type="button" class="btn-ver-md">CORREGIR</button>
                </div>
                <div class="col col-sm-4">
                    <button type="button" class="btn-ver-md">RECHAZAR</button>
                </div>
            </div>
        </div>
        <!-- ./ panel-footer -->
    </div>
</div>
<!-- ## Container 4 -->
<!-- ## Panel principal -->

<?php
    include_once('footer.php');
?>