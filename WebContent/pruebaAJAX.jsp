<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include	file="header.jsp" %>

<!-- $$ Título de la sección -->
<div class="jumbotron" id="titulo_seccion">
    <p>Ventana Principal</p>
</div>
<!-- ## Título de la sección -->

<!-- $$ Panel principal -->
<div class="container">
    <!-- row S.Rec. -->
    <div class="row">
        <!-- col-lg-12 -->
        <div class="col-lg-12">
            <!-- panel -->
            <div class="panel panel-default">
                <!-- panel-heading -->
                <div class="panel-heading">
                    <h3 class="panel-title">Recomendaciones sugeridas</h3>
                </div>
                <!-- ./ panel-heading -->
                <!-- panel-body -->
                <div class="panel-body">
                    <!-- table -->
                    <table class="tabla-pacientes" id="tabla-pacientes">
                        <tr class="tr-headers">
                            <th id="th_paciente">Paciente</th>
                            <th id="th_fecha">Fecha</th>
                            <th id="th_acciones">Acciones</th>
                        </tr>

                        <tr class="tr-paciente" id="paciente0">
                            <!-- Nombre paciente y descripci�n de la recomendacion-->
                            <td class="td-recomendacion">
                                <div class="text-danger" data-toggle="collapse" data-target=".div_ocultar">
                                    Martin Jermaine
                                </div>
                            
                                <div class="text-warning collapse in div_ocultar rec-detalle">
                                    Título Recomendacion: No hay datos de ninguna medida de tensión registrados en el último mes. Por favor, introduzca datos de sus medidas de tensión con mayor frecuencia.
                                </div>
                            </td>
                            <!-- ./Nombre paciente y descripcion -->

                            <td class="td-fecha">
                                <div>
                                    12/23/2323
                                </div>
                            </td>

                            <!-- Acciones posibles -->
                            <td class="td-acciones">
                                <div class="acc-principal col-xs-3">
                                    <button type="button" class="btn btn-success btn-xs disabled">
                                        <span class="glyphicon glyphicon-ok align-both"></span>
                                    </button>
                                </div>
                                <div class="acc-principal col-xs-3">
                                    <button type="button" class="btn btn-danger btn-xs">
                                        <span class="glyphicon glyphicon-remove align-both"></span>
                                    </button>
                                </div>
                                <div class="col-xs-3 collapse in div_ocultar">
                                    <button type="button" class="btn btn-warning btn-xs">
                                        <span class="glyphicon glyphicon-pencil align-both"></span>
                                    </button>
                                </div>
                                <div class="col-xs-3 collapse in div_ocultar">
                                    <button type="button" class="btn btn-default btn-xs" onclick="window.location='m_ejemplo_manual.jsp'">
                                        <abbr title="Ver paciente en detalle"><span class="glyphicon glyphicon-eye-open align-both"></span></abbr>
                                    </button>
                                </div>    
                            </td>
                        </tr>
                        
                        <tr class="tr-paciente" id="paciente1">
                            <td class="td-recomendacion">
                                <div class="text-danger" data-toggle="collapse" data-target=".div_ocultar2">
                                    Nasim Mihkel
                                </div>
                                <div class="text-success collapse in div_ocultar2 rec-detalle">
                                    No hay datos de ninguna medida de tensión registrados en el último mes. Por favor, introduzca datos de sus medidas de tensión con mayor frecuencia.
                                </div>
                            </td>
                            <td class="td-fecha">
                                <div>
                                    12/23/2323
                                </div>
                            </td>
                            <td class="td-acciones">
                                <div class="col-xs-3">
                                    <button type="button" class="btn btn-success btn-xs disabled">
                                        <span class="glyphicon glyphicon-ok align-both"></span>
                                    </button>
                                </div>
                                <div class="col-xs-3">
                                    <button type="button" class="btn btn-danger btn-xs">
                                        <span class="glyphicon glyphicon-remove align-both"></span>
                                    </button>
                                </div>
                                <div class="col-xs-3 collapse in div_ocultar2">
                                    <button type="button" class="btn btn-warning btn-xs">
                                        <span class="glyphicon glyphicon-pencil align-both"></span>
                                    </button>
                                </div>
                                <div class="col-xs-3 collapse in div_ocultar">
                                    <button type="button" class="btn btn-default btn-xs" onclick="window.location='m_ejemplo_manual.jsp'">
                                        <abbr title="Ver paciente en detalle"><span class="glyphicon glyphicon-eye-open align-both"></span></abbr>
                                    </button>
                                </div> 
                            </td>
                        </tr>
                    </table>
                    <!-- ./ table -->
                </div>
                <!-- ./ panel-body -->
                <!-- panel-footer -->
                <div class="panel-footer clearfix">
                    <div class="col-sm-6">
                        <label>Ordenar por: </label>
                        <select class="selectpicker">
                            <option>Fecha</option>
                            <option>Nivel de seguimiento</option>
                            <option>Recomendaciones pendientes</option>
                        </select>
                    </div>
                    <div class="col-sm-3 pull-right">
                        <!--<div class="input-group input-group-sm">
                          <input type="text" class="form-control" placeholder="Search" aria-describedby="sizing-addon1">
                          <span class="input-group-addon btn btn-sm glyphicon glyphicon-search"></span></input>
                          <!--<span class="input-group-addon glyphicon glyphicon-search" id="sizing-addon1"></span>-->
                        <!--</div>-->
                        <div class="input-group input-group-sm">
                            <input type="text" class="form-control" placeholder="Search">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search"></span></button>
                            </span>
                        </div>
                    </div> 
                </div>
                <!-- ./ panel-footer -->
            </div>
            <!-- ./panel -->
        </div>
        <!-- ./ col-lg-12 -->
    </div>
    <!-- ./ row S.Rec. -->
    <!-- row G.Pacientes y S.Rec. -->
    <div class="row">
        <!-- col G.Pacientes -->
        <div class="col-md-6">
            <div class="panel panel-default">
                <!-- Cabecera G.Pacientes -->
                <div class="panel-heading">
                    <h3 class="panel-title">Gestión de pacientes</h3>          
                </div>
                <!-- ./ Cabecera G.Pacientes -->
                <!-- Cuerpo G.Pacientes -->
                <div class="panel-body">
                    <div class="list-group" id="aqui">
                    
                    <script>
                    	var url = "http://localhost:8080/glucmodel/api/v1/medico/lista/39";
                    	var datos = { id_medico: 39};
                    	$.getJSON(url, datos, procesaLista).error(funcionError);
                    	
                    	function procesaLista(data) {

                    		var newHTML = "";
                    		$.each(data, function(nada, elem) {
                    			newHTML += "<a href='#' class='list-group-item'>" 
                    					+ elem.id + " - " + elem.name + " " + elem.surname1 + " " + elem.surname2
                    					+ "<button type='submit' class='btn btn-default btn-xs pull-right'>"
                                        + "<span class='glyphicon glyphicon-trash'></span>"
                                        + "</button>";
                    		});
                    		
                    		$("#aqui").append(newHTML);
                    	}
                    	
                    	function funcionError() {
                    		var errorMsg = "<p>Error obteniendo la lista de pacientes del servidor.</p>"
                    		$("#aqui").append(errorMsg);
                    	}
                    </script>
                    	

                        <!--<a href="#" class="list-group-item">Paciente 4
                            <button type="submit" class="btn btn-default btn-xs pull-right">
                                <span class="glyphicon glyphicon-trash"></span>
                            </button>
                        </a>-->
                    </div>
                </div>
                <!-- ./ Cuerpo G.Pacientes -->
                <!-- panel footer -->
                <div class="panel-footer">
                    <div class="row">
                        <div class="col col-sm-12">
                            <!--<button type="button" class="btn-ver-md float-right">Alta</button>-->
                            <a href="m-alta-paciente.jsp" class="btn-ver-md float-right">Alta</a>
                        </div>
                    </div>
                </div>
                <!-- ./ panel footer -->
            </div>
        </div>
        <!-- ./ col G.Pacientes -->

        <!-- col S.Rec. -->
        <div class="col-md-6">
            <div class="panel panel-default">
                <!-- $$ Cabecera del S.Rec. -->
                <div class="panel-heading">
                    <h3 class="panel-title">Sistema Recomendador</h3>
                </div>
                <!-- ## Cabecera del S.Rec. -->
                        
                <!-- $$ Cuerpo del S.Rec. -->
                <div class="panel-body">
                    <div class="list-group">
                        <a href="m_recomendaciones_manuales.jsp" class="list-group-item">Crear recomendaciones de forma manual</a>
                        <a href="m_revisar_automaticas.jsp" class="list-group-item">Revisar recomendaciones autom�ticas</a>
                        <a href="m_revisar_casos.jsp" class="list-group-item">Revisar los casos de seguimiento</a>
                    </div>
                </div>
                <!-- ## Cuerpo del S.Rec. -->
            </div>
        </div>
        <!-- ./ col S.Rec. -->
    </div>
    <!-- ./ row G.Pacientes y S.Rec. -->


    <!-- row Moodle y Doc. Apoyo --> 
    <div class="row">
        <!-- col Moodle -->
        <div class="col-sm-6">
            <div class="panel panel-default">
                <!-- $$ Cabecera del Sistema de Educación -->
                <div class="panel-heading">
                    <div class="pull-right">
                        <button type="button" class="btn btn-default btn-xs">Entrar</button>
                    </div>
                    <h3 class="panel-title">Educación (Moodle)</h3>          
                </div>
                <!-- ## Cabecera del Sistema de Educación -->
                <!-- $$ Cuerpo del Sistema de Educación -->
                <div class="panel-body">
                    <p> Últimas entradas del campus: </p>
                    <div class="list-group">
                        <a href="#" class="list-group-item">Entrada 1</a>
                        <a href="#" class="list-group-item">Entrada 2</a>
                        <a href="#" class="list-group-item">Entrada 3</a>
                    </div>
                    <p> Tests recomendados: </p>
                    <div class="list-group">
                        <a href="#" class="list-group-item">
                            <button type="submit" class="btn btn-default btn-sm pull-right">Realizar</button>
                            <p> Test diabetes Mellitus tipo 1 </p>
                        </a>
                        <a href="#" class="list-group-item">
                            <button type="submit" class="btn btn-default btn-xs pull-right">Realizar</button>
                            <p> Test diabetes Mellitus tipo 2 </p>
                        </a>
                    </div>
                </div>
                <!-- ## Cuerpo del Sistema de Educación -->
            </div>
        </div>
        <!-- ./ col Moodle --> 
        <!-- col Doc.Apoyo -->
        <div class="col-sm-6">
            <div class="panel panel-default">
                <!-- $$ Cabecera Doc.Apoyo -->
                <div class="panel-heading">
                    <h3 class="panel-title">Dcoumentación de apoyo</h3>
                </div>
                <!-- ## Cabecera Doc.Apoyo -->
                        
                <!-- $$ Cuerpo Doc.Apoyo -->
                <div class="panel-body">
                    <div class="list-group">
                        <a href="#" class="list-group-item">Documento1.txt</a>
                        <a href="#" class="list-group-item">Documento2.txt</a>
                        <a href="#" class="list-group-item">Documento3.txt</a>
                    </div>
                </div>
                <!-- ## Cuerpo Doc.Apoyo -->
            </div>
        </div>
        <!-- ./ col Doc.Apoyo. -->   
    </div>
    <!-- ./ row Moodle y Doc.Apoyo. -->
</div>
<!-- ## Panel principal -->

<%@include	file="footer.jsp" %>