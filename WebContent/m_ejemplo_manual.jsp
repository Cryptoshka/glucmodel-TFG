<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include	file="header.jsp" %>

<!-- Section title -->
<div class="jumbotron" id="titulo_seccion">
    <p>Revisar casos</p>
</div>
<!-- ./ Section title -->

<!-- Container Información Básica -->
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">Información básica</h3> 
        </div>
        <div class="panel-body">
            <!-- $$ Columna foto -->
            <div class="col-sm-4">
                <img src="img/placeholders/portrait.png" class="img-responsive" alt="Imagen del paciente" width="200" height="300">
            </div>
            <!-- ## Columna foto -->
            <!-- $$ Columna datos 1 -->
            <div class="col-sm-4">
            	<jsp:useBean id="fichaPaciente" scope="request" class="business.pojos.beans_viejos.InfoBasicaPaciente" />
                <ul>
                    <li>Nombre: <%= fichaPaciente.getNomApell() %></li>
                    <li>Peso: <%= fichaPaciente.getPeso() %></li>
                    <li>Altura: <%= fichaPaciente.getAltura() %></li>
                    <li>IMC: <%= fichaPaciente.getImc() %></li>
					<li>Tipo de diabetes: <%= fichaPaciente.getTipoDiabetes() %></li>
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
<!-- ./ Container Información Básica -->

<!-- Container Gráficas -->
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">Variables bajo seguimiento</h3>
        </div>
        <div class="panel-body">
            <!-- $$ Fila 1/3 de gráficas -->
            <div class="row">
                <!-- ================== 1. PESO =============== -->
                <div class="col-md-6">
                    <div class="panel panel-default panel-formal">
                        <div class="panel-body" id="grafica-peso">
                            <script>grafica_peso();</script>
                        </div>
                    </div>
                </div>
                <!-- ================== 2. Glucemias =============== -->
                <div class="col-md-6">
                    <div class="panel panel-default panel-formal">
                        <div class="panel-body">
                            <!--<img src="img/placeholders/graph_green.png" class="img-responsive" alt="Grafica var. 2" width="869" height="471">-->
                            <!-- Image Carousel -->
                            <div id="carousel-glucemias" class="carousel slide" data-ride="carousel">
                                <!-- Indicators -->
                                <ol class="carousel-indicators">
                                  <li data-target="#carousel-glucemias" data-slide-to="0" class="active"></li>
                                  <li data-target="#carousel-glucemias" data-slide-to="1"></li>
                                </ol>

                                <!-- Wrapper for slides -->
                                <div class="carousel-inner" role="listbox" id="grafica-glucemias">
                                  <div class="item active">
                                    <!--<p>Valor en un mismo momento del día a lo largo de varias fechas</p>
                                    <img src="img/placeholders/graph_blue.png" class="img-responsive">-->
                                    <script>glucemias_periodo();</script>
                                  </div>
                                  <div class="item">
                                    <!--<p>Valor en distintos momentos del día, en un mismo día</p>
                                    <img src="img/placeholders/graph_green.png" class="img-responsive">-->
                                    <script>glucemias_dia();</script>
                                  </div>
                                </div>

                                <!-- Left and right controls -->
                                <a class="left carousel-control" href="#carousel-glucemias" role="button" data-slide="prev">
                                  <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                                  <span class="sr-only">Previous</span>
                                </a>
                                <a class="right carousel-control" href="#carousel-glucemias" role="button" data-slide="next">
                                  <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                                  <span class="sr-only">Next</span>
                                </a>
                            </div>
                            <!-- ./ Image Carousel -->
                        </div>
                        <!-- ./ panel body -->
                    </div>
                </div>
            </div>
            <!-- Fila 2/3 gráficas -->
            <div class="row">
                <!-- ================== 3. Insulina =============== -->
                <div class="col-md-6">
                    <div class="panel panel-default panel-formal">
                        <div class="panel-heading">
                            <p>Insulina</p>
                        </div>
                        <div class="panel-body">
                            <!-- Image Carousel -->
                            <div id="carousel-insulina" class="carousel slide" data-ride="carousel">
                                <!-- Indicators -->
                                <ol class="carousel-indicators">
                                  <li data-target="#carousel-insulina" data-slide-to="0" class="active"></li>
                                  <li data-target="#carousel-insulina" data-slide-to="1"></li>
                                </ol>

                                <!-- Wrapper for slides -->
                                <div class="carousel-inner" role="listbox">
                                  <div class="item active">
                                    <p>Valor en un mismo momento del día a lo largo de varias fechas</p>
                                    <img src="img/placeholders/graph_blue.png" class="img-responsive">
                                  </div>
                                  <div class="item">
                                    <p>Valor en distintos momentos del día, en un mismo día</p>
                                    <img src="img/placeholders/graph_green.png" class="img-responsive">
                                  </div>
                                </div>

                                <!-- Left and right controls -->
                                <a class="left carousel-control" href="#carousel-insulina" role="button" data-slide="prev">
                                  <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                                  <span class="sr-only">Previous</span>
                                </a>
                                <a class="right carousel-control" href="#carousel-insulina" role="button" data-slide="next">
                                  <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                                  <span class="sr-only">Next</span>
                                </a>
                            </div>
                            <!-- ./ Image Carousel -->
                        </div>
                    </div>
                </div>

                <!-- ================== 4. Dieta =============== -->
                <div class="col-md-6">
                    <div class="panel panel-default panel-formal">
                        <div class="panel-heading">
                            <p>Dieta</p>
                        </div>
                        <div class="panel-body">
                            <!-- Image Carousel -->
                            <div id="carousel-dieta" class="carousel slide" data-ride="carousel">
                                <!-- Indicators -->
                                <ol class="carousel-indicators">
                                  <li data-target="#carousel-dieta" data-slide-to="0" class="active"></li>
                                  <li data-target="#carousel-dieta" data-slide-to="1"></li>
                                  <li data-target="#carousel-dieta" data-slide-to="2"></li>
                                  <li data-target="#carousel-dieta" data-slide-to="3"></li>
                                </ol>

                                <!-- Wrapper for slides -->
                                <div class="carousel-inner" role="listbox">
                                  <div class="item active">
                                    <p>Desviación en Kcal respecto a desayuno tipo 1</p>
                                    <img src="img/placeholders/graph_blue.png" class="img-responsive">
                                  </div>
                                  <div class="item">
                                    <p>Desviación en Kcal respecto a desayuno tipo 2</p>
                                    <img src="img/placeholders/graph_green.png" class="img-responsive">
                                  </div>
                                
                                  <div class="item">
                                    <p>Desviación en Kcal respecto a comida tipo 1</p>
                                    <img src="img/placeholders/graph_red.png" class="img-responsive">
                                  </div>

                                  <div class="item">
                                    <p>Desviación en Kcal respecto a comida tipo 2</p>
                                    <img src="img/placeholders/graph_orange.png" class="img-responsive">
                                  </div>
                                </div>

                                <!-- Left and right controls -->
                                <a class="left carousel-control" href="#carousel-dieta" role="button" data-slide="prev">
                                  <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                                  <span class="sr-only">Previous</span>
                                </a>
                                <a class="right carousel-control" href="#carousel-dieta" role="button" data-slide="next">
                                  <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                                  <span class="sr-only">Next</span>
                                </a>
                            </div>
                            <!-- ./ Image Carousel -->
                        </div>
                    </div>
                </div>
                <!-- ================== 5. Ejercicio =============== -->
                <div class="col-md-6">
                    <div class="panel panel-default panel-formal">
                        <div class="panel-body" id="grafica-ejercicio">
                            <script>grafica_ejercicio();</script>
                        </div>
                    </div>
                </div>
                <!-- ================== 6. Pruebas Médicas =============== -->
                <div class="col-md-6">
                    <div class="panel panel-default panel-formal">
                        <div class="panel-heading">
                            <button type="button" class="btn-ver-md float-right">Ver registro</button>
                            <p>Pruebas médicas</p>
                        </div>
                        <div class="panel-body">
                            <div class="col-md-12">
                            <table class="table table-striped">
                                <tr>
                                    <th>Tipo</th>
                                    <th>Fecha</th> 
                                    <th>Resultado</th>
                                </tr>
                                <tr>
                                    <td>Prueba 1</td>
                                    <td>dd/mm/yyyy</td>
                                    <td>Valor medido</td>   
                                </tr>
                                <tr>
                                    <td>Prueba 2</td>
                                    <td>dd/mm/yyyy</td>
                                    <td>Valor medido</td>
                                </tr>
                                <tr>
                                    <td>Prueba 3</td>
                                    <td>dd/mm/yyyy</td>
                                    <td>Valor medido</td>
                                </tr>
                            </table>
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
<!-- ./ Container Gráficas -->

<!-- Container Enviar Recomendaciones -->
<div class="container">
    <div class="panel panel-default">
        <!-- Panel heading -->
        <div class="panel-heading">
            <h3 class="panel-title">Enviar recomendaciones</h3>
        </div>
        <!-- ./ Panel heading -->
        <!-- Panel body -->
        <div class="panel-body">
            <!-- Tabla con todas las recomendaciones a enviar -->
            <table class="tabla-rec-enviar">
                <tr>
                    <th>Tipo</th>
                    <th>Recomendación</th>
                    <th>Prioridad</th>
                    <th>Automatizar</th>
                    <th>Acciones</th>
                </tr>
                <tr class="tr-recomendacion" id="recomendacion0">
                    <!-- Cada una de las recomendaciones tiene dentro un formulario -->
                    <form>
                        <td class="td-tipo">
                            Sugerida
                        </td>
                        <td class="td-recomendacion">
                            <div data-toggle="collapse" class="titulo-rec">
                                Título recomendación 1
                            </div>
                            <div class="collapse in detalle-rec hidden">
                                Descripción detallada de la recomendación 1 asfdasdfaljskdfñ aslkdfjañls jklsdf lñkajsñlkjsadf l lskdajf laksjf laksjdf lakjfasdkl
                            </div>
                        </td>
                        <td class="td-prioridad">
                            <div class="form-group">
                              <select class="form-control" id="sel_priodidad">
                                <option>Urgente</option>
                                <option>Importante</option>
                                <option>Normal</option>
                              </select>
                            </div>
                        </td>
                        <td class="td-auto">
                            <div class="col-xs-12">
                                <input type="radio" name="automatizar" value="male" class="checkbox-auto">
                            </div>
                            <div class="col-xs-9 tf-auto hidden">
                                Periodo: <input type="text" name="firstname" size="3" placeholder="nº días">
                            </div>
                        </td>

                        <td class="td-acciones">
                            <div class="col-md-6 col-xs-12">
                                <button type="button" class="btn btn-danger btn-sm btn-del-rec">
                                    <span class="glyphicon glyphicon-trash align-both"></span>
                                </button>
                            </div>
                            <div class="col-md-6 col-xs-12">
                                <button type="submit" class="btn btn-success btn-sm btn-send-rec">
                                    Enviar
                                </button>
                            </div>
                        </td>
                    </form>
                </tr>
                <tr class="tr-recomendacion" id="recomendacion1">
                    <!-- Cada una de las recomendaciones tiene dentro un formulario -->
                    <form>
                        <td class="td-tipo">
                            Manual
                        </td>
                        <td class="td-recomendacion">
                            <div data-toggle="collapse" class="titulo-rec">
                                Título recomendación 2
                            </div>
                            <div class="collapse in detalle-rec hidden">
                                Descripción detallada de la recomendación 2 asfdasdfaljskdfñ aslkdfjañls jklsdf lñkajsñlkjsadf l lskdajf laksjf laksjdf lakjfasdkl
                            </div>
                        </td>
                        <td class="td-prioridad">
                            <div class="form-group">
                              <select class="form-control" id="sel_priodidad">
                                <option>Urgente</option>
                                <option>Importante</option>
                                <option>Normal</option>
                              </select>
                            </div>
                        </td>
                        <td class="td-auto">
                            <div class="col-xs-12">
                                <input type="radio" name="automatizar" value="male" class="checkbox-auto">
                            </div>
                            <div class="col-xs-9 tf-auto hidden">
                                Periodo: <input type="text" name="firstname" size="3" placeholder="nº días">
                            </div>
                        </td>

                        <td class="td-acciones">
                            <div class="col-md-6 col-xs-12">
                                <button type="button" class="btn btn-danger btn-sm btn-del-rec">
                                    <span class="glyphicon glyphicon-trash align-both"></span>
                                </button>
                            </div>
                            <div class="col-md-6 col-xs-12">
                                <button type="submit" class="btn btn-success btn-sm btn-send-rec">
                                    Enviar
                                </button>
                            </div>
                        </td>
                    </form>
                </tr>
            </table>
        </div>
        <!-- ./ Panel body -->
        <div class="panel-footer">
            <button type="button" class="btn btn-success btn-md">
                Enviar todas <span class="glyphicon glyphicon-ok align-both"></span>
                <!-- Habrá que ir recorriendo todos los formularios y enviarlos uno a uno -->
            </button>
        </div>
    </div>
</div>
<!-- ./ Container Enviar recomendaciones -->

<!-- Container Histórico Recomendaciones y Automatizadas -->
<div class="container">
    <div class="row">
        <!-- col Histórico -->
        <div class="col-md-6">
            <div class="panel panel-default">
                <!-- Panel heading -->
                <div class="panel-heading">
                    <h3 class="panel-title">Recomendaciones automatizadas</h3>
                </div>
                <!-- ./ Panel heading -->
                <!-- Panel body -->
                <div class="panel-body">
                    <!-- table -->
                    <table class="tabla-pacientes">
                        <tr>
                            <th>Recomendación</th>
                            <th>Nº veces enviada</th>
                            <th>Acciones</th>
                        </tr>
                        <tr>
                            <td class="text-success">Recomendación 1: blablblablablbalbla</td>
                            <td>7</td>
                            <td>
                                <div class="col-xs-6">
                                    <button type="button" class="btn btn-success btn-xs">
                                        <abbr title="Enviar ahora"><span class="glyphicon glyphicon-send align-both"></span></abbr>
                                    </button>
                                </div>
                                <div class="col-xs-6">
                                    <button type="button" class="btn btn-danger btn-xs">
                                        <abbr title="Desautomatizar"><span class="glyphicon glyphicon-remove align-both"></span></abbr>
                                    </button>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td class="text-warning">Recomendación 2: blablblablablbalbla</td>
                            <td>3</td>
                            <td>
                                <div class="col-xs-6">
                                    <button type="button" class="btn btn-success btn-xs">
                                        <abbr title="Enviar ahora"><span class="glyphicon glyphicon-send align-both"></span></abbr>
                                    </button>
                                </div>
                                <div class="col-xs-6">
                                    <button type="button" class="btn btn-danger btn-xs">
                                        <abbr title="Desautomatizar"><span class="glyphicon glyphicon-remove align-both"></span></abbr>
                                    </button>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td class="text-success">Recomendación 3: blablblablablbalbla</td>
                            <td>12</td>
                            <td>
                                <div class="col-xs-6">
                                    <button type="button" class="btn btn-success btn-xs">
                                        <abbr title="Enviar ahora"><span class="glyphicon glyphicon-send align-both"></span></abbr>
                                    </button>
                                </div>
                                <div class="col-xs-6">
                                    <button type="button" class="btn btn-danger btn-xs">
                                        <abbr title="Desautomatizar"><span class="glyphicon glyphicon-remove align-both"></span></abbr>
                                    </button>
                                </div>
                            </td>
                        </tr>
                    </table>
                    <!-- ./ table -->
                </div>
                <!-- ./ Panel body -->
            </div>
            <!-- ./ panel panel-default -->
        </div>
        <!-- ./ col Histórico -->

        <!-- col Automatizadas -->
        <div class="col-md-6">
            <div class="panel panel-default">
                <!-- Panel heading -->
                <div class="panel-heading">
                    <h3 class="panel-title">Histórico de recomendaciones</h3>
                </div>
                <!-- ./ Panel heading -->
                <!-- Panel body -->
                <div class="panel-body">
                    <!-- table -->
                    <table class="tabla-pacientes">
                        <tr>
                            <th>Recomendación</th>
                            <th>Fecha</th>
                            <th>Acciones</th>
                        </tr>
                        <tr>
                            <td class="text-success">Recomendación 1: blablblablablbalbla</td>
                            <td>30 Diciembre 1994</td>
                            <td>
                                <button type="button" class="btn btn-success btn-xs">
                                    <abbr title="Volver a enviar"><span class="glyphicon glyphicon-send align-both"></span></abbr>
                                </button>
                            </td>
                        </tr>
                        <tr>
                            <td class="text-success">Recomendación 2: blablblablablbalbla</td>
                            <td>18 Junio 1994</td>
                            <td>
                                <button type="button" class="btn btn-success btn-xs">
                                    <abbr title="Volver a enviar"><span class="glyphicon glyphicon-send align-both"></span></abbr>
                                </button>
                            </td>
                        </tr>
                        <tr>
                            <td class="text-warning">Recomendación 3: blablblablablbalbla</td>
                            <td>4 Abril 1992</td>
                            <td>
                                <button type="button" class="btn btn-success btn-xs">
                                    <abbr title="Volver a enviar"><span class="glyphicon glyphicon-send align-both"></span></abbr>
                                </button>
                            </td>
                        </tr>
                        <tr>
                            <td class="text-danger">Recomendación 4: blablblablablbalbla</td>
                            <td>8 Junio 1959</td>
                            <td>
                                <button type="button" class="btn btn-success btn-xs">
                                    <abbr title="Volver a enviar"><span class="glyphicon glyphicon-send align-both"></span></abbr>
                                </button>
                            </td>
                        </tr>
                        <tr>
                            <td class="text-danger">Recomendación 5: blablblablablbalbla</td>
                            <td>24 Febrero 1958</td>
                            <td>
                                <button type="button" class="btn btn-success btn-xs">
                                    <abbr title="Volver a enviar"><span class="glyphicon glyphicon-send align-both"></span></abbr>
                                </button>
                            </td>
                        </tr>
                    </table>
                    <!-- ./ table -->
                </div>
                <!-- ./ Panel body -->
            </div>
            <!-- ./ panel panel-default -->
        </div>
        <!-- ./ col Automatizadas -->
    </div>
    <!-- ./ row -->
</div>
<!-- ./ Container Histórico Recomendaciones y Automatizadas -->


<!-- Container Crear Recomendación -->
<div class="container">
    <div class="panel panel-default">
        <!-- $$ Panel heading -->
        <div class="panel-heading">
            <h3 class="panel-title">Crear recomendación</h3>
        </div>
        <!-- ## Panel heading -->

        <!--<from class="form" role="form" onsubmit="createNewRec('titulo1', 'desc1', 'opciones')">-->
        <form class="form" role="form" id="form-new-rec">
            <!-- $$ Panel body -->
            <div class="panel-body">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="comment">Título de la recomendación:</label>
                            <input type="text" class="form-control" name="titulo_rec" id="tf_titulo_rec">
                        </div>
                        <div class="form-group">
                            <label for="comment">Descripción de la recomendación:</label>
                            <textarea class="form-control" rows="5" name="descripcion_rec" id="ta_descripcion_rec"></textarea>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <div class="col-xs-12">
                                <label for="">Causas:</label>
                            </div>
                            <div class="col-xs-6">
                                <div class="checkbox">
                                    <label><input type="checkbox" value="" name="peso" id="cb_peso">Peso</label>
                                </div>
                                <div class="checkbox">
                                    <label><input type="checkbox" value="" name="glucemias" id="cb_gluc">Glucemias</label>
                                </div>
                                <div class="checkbox">
                                    <label><input type="checkbox" value="" name="insulina" id="cb_ins">Insulina</label>
                                </div>
                            </div>
                            <div class="col-xs-6">
                                <div class="checkbox">
                                    <label><input type="checkbox" value="" name="dieta" id="cb_dieta">Dieta</label>
                                </div>
                                <div class="checkbox">
                                    <label><input type="checkbox" value="" name="deporte" id="cb_dep">Deporte</label>
                                </div>
                                <div class="checkbox">
                                    <label><input type="checkbox" value="" name="prueba" id="cb_prueba">Prueba médica</label>
                                </div>
                            </div>
                        </div>
                    </div>
            </div>
            <!-- ./ Panel body -->
            <!-- panel-footer -->
            <div class="panel-footer">
                <div class="form-group">
                    <div class="row">
                        <div class="col-xs-12">
                            <button type="submit" name="enviar" class="btn btn-success pull-right"/>
                                Crear y añadir
                            </button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- ./panel-footer -->
        </form>
    </div>
    <!-- ./ panel panel-default -->
</div>
<!-- ## Container Crear Recomendación -->

<%@include	file="footer.jsp" %>