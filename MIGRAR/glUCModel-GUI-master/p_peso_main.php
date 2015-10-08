<?php
    include_once('header.php');
?>

<!-- $$ Título de la sección -->
<div class="jumbotron" id="titulo_seccion">
    <p>Peso</p>
</div>
<!-- ## Título de la sección -->

<!-- $$ Panel principal -->
<div class="container">
    <div class="row">
        <!-- $$ Columna Evolución -->
        <div class="col-md-8">
            <div class="panel panel-default">
                <!-- $$ Cabecera Evolución -->
                <div class="panel-heading">
                    <h3 class="panel-title">Evolución</h3>
                </div>
                <!-- ## Cabecera Evolución -->

                <!-- $$ Cuerpo Evolución -->
                <div class="panel-body">
                    <img class="img-responsive" src="img/placeholders/graph_blue.png" alt="Imagen no disponible">
                </div>
                <!-- ## Cuerpo Evolución -->
            </div>
        </div>
        <!-- ## Columna Evolución -->

        <!-- $$ Columna Histórico -->
        <div class="col-md-4">
            <div class="panel panel-default">
                <!-- panel-heading -->
                <div class="panel-heading">
                    <h3 class="panel-title">Histórico</h3>
                </div>
                <!-- /.panel-heading -->
                <!-- panel-body -->
                <div class="panel-body">
                    <div class="list-group">
                        <a href="#" class="list-group-item">71 Kg dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">72 Kg dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">74 Kg dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">75 Kg dd/mm/yyyy
                            <button type="submit" class="btn btn-default btn-xs pull-right">
                                <span class="glyphicon glyphicon-trash"></span>
                            </button>
                        </a>
                        <a href="#" class="list-group-item">76 Kg dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">77 Kg dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">76 Kg dd/mm/yyyy</a>
                        <a href="#" class="list-group-item">72 Kg dd/mm/yyyy</a>
                    </div>
                </div>
                <!-- /.panel-body -->
                <div class="panel-footer">
                    <form class="form-inline" role="form">
                        <button type="submit" class="btn btn-default btn-xs">
                            <span class="glyphicon glyphicon-minus"></span>
                        </button>
                        <div class="form-group">
                            <label class="sr-only" for="tf_peso">Peso</label>
                            <input class="form-control" id="tf_peso" placeholder="69 Kg">
                        </div>
                        <button type="submit" class="btn btn-default btn-xs">
                            <span class="glyphicon glyphicon-plus"></span>
                        </button>
                        <button type="submit" class="btn btn-default">Guardar</button>
                        
                    </form>
                </div>
            </div>
        </div>
        <!-- ## Columna Histórico -->     
    </div>
    <!-- ## row -->
</div>
<!-- ## Panel principal -->

<?php
    include_once('footer.php');
?>