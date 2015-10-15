<%@include	file="header.jsp" %>

<!-- $$ Título de la sección -->
<div class="jumbotron" id="titulo_seccion">
    <p>Ventana Principal</p>
</div>
<!-- ## Título de la sección -->

<!-- $$ Panel principal -->
<div class="container">
    <div class="row">
        <!-- $$ Columna para el moodle, pred. insulina y S.Rec. -->
        <div class="col-md-8">
            <!-- $$ Fila para el moodle y pred. insulina -->
            <div class="row">
                <!-- $$ Columna para moodle -->
                <div class="col-md-6">
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
                <!-- ## Columna para moodle -->
                <!-- $$ Columna para pred. insulina -->
                <div class="col-md-6">
                    <div class="panel panel-default">
                        <!-- $$ Cabecera de Pred. Insulina -->
                        <div class="panel-heading">
                            <h3 class="panel-title">Predicción de insulina</h3>
                        </div>
                        <!-- ## Cabecera de Pred. Insulina -->
                        <!-- $$ Cuerpo de Pred. Insulina -->
                        <div class="panel-body">
                            <h5>Predicción de insulina en dos horas: </h5>
                            
                            <form role="form">
                                <div class="form-group">
                                    <label class="control-label col-sm-12" for="carbohidratos">Nº de raciones de carbohidratos:</label>
                                    <div class="col-sm-12">
                                        <input class="form-control" id="carbohidratos" placeholder="raciones">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-12" for="ins_rapida">Dosis de insulina rápida que se va a inyectar:</label>
                                    <div class="col-sm-12"> 
                                        <input class="form-control" id="ins_rapida" placeholder="insulina rápida">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-12" for="ins_lenta">Dosis de insulina lenta que se va a inyectar:</label>
                                    <div class="col-sm-12"> 
                                        <input class="form-control" id="ins_lenta" placeholder="insulina lenta">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-sm-12" for="glucosa">Nivel de glucosa actual:</label>
                                    <div class="col-sm-12"> 
                                        <input class="form-control" id="glucosa" placeholder="nivel de glucosa">
                                    </div>
                                </div>
                                <div class="form-group"> 
                                    <div class="col-sm-offset-2 col-md-12">
                                        <button type="submit" class="btn btn-default">Realizar predicción</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <!-- ## Cuerpo de Pred. Insulina -->
                    </div>
                </div>
                <!-- ## Columna para pred. insulina -->
            </div>
            <!-- ## Fila para moodle y pred. insulina -->

            <!-- $$ Fila para el S.Rec.-->
            <div class="row">
                <div class="col-sm-12">
                    <div class="panel panel-default">
                        <!-- $$ Cabecera del S.Rec. -->
                        <div class="panel-heading">
                            <h3 class="panel-title">Sistema Recomendador</h3>
                        </div>
                        <!-- ## Cabecera del S.Rec. -->
                        
                        <!-- $$ Cuerpo del S.Rec. -->
                        <div class="panel-body">
                            <div class="list-group">
                                <a href="#" class="list-group-item">No hay medidas de colesterol registradas</a>
                                <a href="#" class="list-group-item">No hay mediciones de peso en el último mes</a>
                                <a href="#" class="list-group-item">No hay fondo de ojos registrado</a>
                            </div>
                        </div>
                        <!-- ## Cuerpo del S.Rec. -->
                    </div>
                </div>   
            </div>
            <!-- ## Fila para el S.Rec. -->
        </div>
        <!-- ## Columna para el moodle, pred. insulina y S.Rec. -->

        <!-- $$ Columna para el panel de "Añadir datos" -->
        <div class="col-md-4">
            <div class="panel panel-default">
                <!-- $$ Cabecera de "Añadir datos" -->
                <div class="panel-heading">
                    <h3 class="panel-title">Añadir Datos</h3>
                </div>
                <!-- ## Cabecera de "Añadir datos" -->
                    
                <!-- $$ Cuerpo de "Añadir datos" -->
                <div class="panel-body">
                    <div class="list-group">
                        <a href="#" class="list-group-item">Ejercicio</a>
                        <a href="p_peso_main.jsp" class="list-group-item">Peso
                            <form class="form-inline" role="form">
                                <div class="form-group">
                                    <label class="sr-only" for="tf_peso">Peso</label>
                                    <input class="form-control" id="tf_peso">
                                </div>
                                <button type="submit" class="btn btn-default">Actualizar</button>
                            </form>  
                        </a>
                        <a href="p_glucemias_main.jsp" class="list-group-item">Glucemias</a>
                        <a href="p_pruebas_medicas_main.jsp" class="list-group-item">Prueba médica</a>
                        <a href="#" class="list-group-item">Dieta</a>
                        <a href="#" class="list-group-item">Insulina</a>
                        <a href="#" class="list-group-item">Favorito 1?</a>
                        <a href="#" class="list-group-item">Favorito 2?</a>
                        <a href="#" class="list-group-item">Favorito 3?</a>
                        <a href="#" class="list-group-item">Favorito 4?</a>
                        <a href="#" class="list-group-item">Favorito 5?</a>
                        <a href="#" class="list-group-item">Favorito 6?</a>
                    </div>
                </div>
                <!-- ## Cuerpo de "Añadir datos" -->
            </div>
        </div>
        <!-- ## Fin de la columna para "Añadir datos" -->
    </div>
</div>
<!-- ## Panel principal -->

<%@include	file="footer.jsp" %>