<%@include	file="header.jsp" %>

<!-- $$ Título de la sección -->
<div class="jumbotron" id="titulo_seccion">
    <p>Pruebas Médicas</p>
</div>
<!-- ## Título de la sección -->

<!-- $$ Panel principal -->
<div class="container">
    <div class="row">
        <!-- $$ Columna Añadir prueba -->
        <div class="col-md-6">
            <div class="panel panel-default">
                <!-- $$ Cabecera Añadir prueba -->
                <div class="panel-heading">
                    <h3 class="panel-title">Añadir prueba</h3>
                </div>
                <!-- ## Cabecera Añadir prueba -->

                <!-- $$ Cuerpo Añadir prueba -->
                <div class="panel-body">
                    <form role="form" class="form-horizontal">
                        <!-- Fecha de la prueba médica -->
                        <div class="form-group">
                            <div class="col-md-12">
                                <label class="control-label col-md-5" for="valor_fecha">Fecha:</label>
                                <div class="col-md-4">
                                    <input class="form-control" id="valor_fecha" placeholder="dd/mm/yyyy">
                                </div>
                                <button type="submit" class="btn btn-default btn-sm">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </button>
                            </div>
                        </div>
                        <!-- Observaciones -->
                        <div class="form-group">
                            <div class="col-md-12">
                                
                                <div class="col-sm-6">
                                    <label for="ta_observaciones">Observaciones:</label>
                                <input class="form-control" id="valor_fecha" placeholder="dd/mm/yyyy">
                                </div>
                            </div>
                        </div>
                        <!-- Tipo de prueba médica -->
                        <p>Tipo:</p>
                        <div class="form-group">
                            <div class="col-md-10">
                                <div class="radio">
                                    <label><input type="radio" name="optradio">Fondo de ojos</label>
                                </div>
                                <div class="radio">
                                    <label><input type="radio" name="optradio">Análisis de sangre</label>
                                </div>
                                <div class="radio">
                                    <label><input type="radio" name="optradio">HBA1C</label>
                                </div>
                                <div class="radio">
                                    <label><input type="radio" name="optradio">Pie diabético</label>
                                </div>
                                <div class="radio">
                                    <label><input type="radio" name="optradio">Análisis MAU</label>
                                </div>
                                <div class="radio">
                                    <label><input type="radio" name="optradio">Medida de colesterol</label>
                                </div>
                                <div class="radio">
                                    <label><input type="radio" name="optradio">Medida de tensión</label>
                                </div>
                                <div class="radio">
                                    <label><input type="radio" name="optradio">Otras pruebas</label>
                                </div>
                            </div>
                        </div>
                        <!-- Observaciones -->
                        <div class="form-group">
                            <div class="col-md-12">
                                <label for="ta_observaciones">Observaciones:</label>
                                <textarea class="form-control" rows="4" id="ta_observaciones" placeholder="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed feugiat arcu sapien, vitae molestie lacus rutrum et. Integer vel accumsan purus. Mauris varius ipsum id ex commodo, suscipit consequat urna porttitor. Maecenas sollicitudin, lectus eget faucibus iaculis, urna eros fermentum."></textarea>
                            </div>
                        </div>
                        <!-- Guardar prueba -->
                        <div class="form-group"> 
                            <div class="col-sm-12">
                                <button type="submit" class="btn btn-default pull-right">Guardar</button>
                            </div>
                        </div>
                    </form>
                </div>
                <!-- ## Cuerpo Añadir prueba -->
            </div>
        </div>
        <!-- ## Columna Añadir prueba -->

        <!-- $$ Columna Histórico -->
        <div class="col-md-6">
            <div class="panel panel-default">
                <!-- panel-heading -->
                <div class="panel-heading">
                    <h3 class="panel-title">Histórico</h3>
                </div>
                <!-- /.panel-heading -->
                <!-- panel-body -->
                <div class="panel-body">
                    <div class="list-group">
                        <a href="#" class="list-group-item">Fondo de ojos dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">Análisis de sangre dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">Medida de tensión dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">Pie diabético dd/mm/yyyy
                            <button type="submit" class="btn btn-default btn-xs pull-right">
                                <span class="glyphicon glyphicon-trash"></span>
                            </button>
                        </a>
                        <a href="#" class="list-group-item">Análisis MAU dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">Otras pruebas dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">HBA1C dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">Análisis MAU dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">Medida de colesterol dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">Fondo de ojos dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">Análisis de sangre dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">Medida de tensión dd/mm/yyyy</a>
                    </div>
                </div>
                <!-- /.panel-body -->
            </div>
        </div>
        <!-- ## Columna Histórico -->     
    </div>
    <!-- ## row -->
</div>
<!-- ## Panel principal -->

<%@include	file="footer.jsp" %>