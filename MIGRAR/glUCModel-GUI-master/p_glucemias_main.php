<!--<style>
        .carousel-inner > .item > img,
        .carousel-inner > .item > a > img {
        width: 80%;
        margin: auto;
    }
    </style>-->
<?php
    include_once('header.php');
?>

<!-- $$ Título de la sección -->
<div class="jumbotron" id="titulo_seccion">
    <p>Glucemias</p>
</div>
<!-- ## Título de la sección -->

<!-- $$ Panel principal -->
<div class="container">
    <div class="row">
        <!-- $$ Columna para añadir datos -->
        <div class="col-md-4">
            <div class="panel panel-default">
                <!-- $$ Cabecera de añadir datos -->
                <div class="panel-heading">
                    <h3 class="panel-title">Añadir datos</h3>
                </div>
                <!-- ## Cabecera de añadir datos -->

                <!-- $$ Cuerpo de añadir datos -->
                <div class="panel-body">
                    <form role="form" class="form-horizontal">
                        <div class="form-group">
                            <label class="control-label col-md-5" for="valor_glucemias">Valor:</label>
                            <div class="col-md-5">
                                <input class="form-control" id="valor_glucemias" placeholder="123">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-5" for="hora_glucemias">Hora:</label>
                            <div class="col-md-5"> 
                                <input class="form-control" id="hora_glucemias" placeholder="HH:mm">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-10">
                                <label for="ta_observaciones">Observaciones:</label>
                                <textarea class="form-control" rows="4" id="ta_observaciones"></textarea>
                            </div>
                        </div>

                        <div class="form-group"> 
                            <div class="col-sm-offset-2 col-md-12">
                                <button type="submit" class="btn btn-default">Grabar datos</button>
                            </div>
                        </div>
                    </form>
                </div>
                <!-- ## Cuerpo de añadir datos -->
            </div>
        </div>
        <!-- ## Columna de añadir datos -->

        <!-- $$ Columna Histórico -->
        <div class="col-md-8">
            <div class="panel panel-default">
                <!-- panel heading -->
                <div class="panel-heading">
                    <h3 class="panel-title">Histórico</h3>
                </div>
                <!-- /.panel-heading -->
                <!-- panel body -->
                <div class="panel-body">
                    <!-- Image Carousel -->
                    <div id="myCarousel" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                          <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                          <li data-target="#myCarousel" data-slide-to="1"></li>
                          <li data-target="#myCarousel" data-slide-to="2"></li>
                          <li data-target="#myCarousel" data-slide-to="3"></li>
                        </ol>

                        <!-- Wrapper for slides -->
                        <div class="carousel-inner" role="listbox">
                          <div class="item active">
                            <img src="img/placeholders/graph_blue.png" alt="Chania" width="869" height="471">
                          </div>

                          <div class="item">
                            <img src="img/placeholders/graph_green.png" alt="Chania" width="869" height="471">
                          </div>
                        
                          <div class="item">
                            <img src="img/placeholders/graph_red.png" alt="Flower" width="869" height="471">
                          </div>

                          <div class="item">
                            <img src="img/placeholders/graph_orange.png" alt="Flower" width="869" height="471">
                          </div>
                        </div>

                        <!-- Left and right controls -->
                        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                          <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                          <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                          <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                          <span class="sr-only">Next</span>
                        </a>
                    </div>
                    <!-- ./Image Carousel -->
                </div>
                <!-- /.panel-body -->
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