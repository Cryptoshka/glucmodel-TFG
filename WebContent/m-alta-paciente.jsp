<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include	file="header.jsp" %>

<!-- $$ Título de la sección -->
<div class="jumbotron" id="titulo_seccion">
    <p>Dar de alta un paciente</p>
</div>
<!-- ## Título de la sección -->

<!-- panel principal -->
<div class="container">
    <!-- row Alta pacientes -->
    <div class="row">
        <!-- col Alta pacientes -->
        <div class="col-sm-6 col-sm-offset-3">
            <div class="panel panel-default">
                <!-- panel-heading -->
                <div class="panel-heading">
                    <h3 class="panel-title">Rellene los datos del paciente:</h3>
                </div>
                <!-- ./ panel-heading -->   
                <!-- panel-body -->
                <div class="panel-body">
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label class="control-label col-sm-6" for="nombre">Nombre:</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="nombre" placeholder="Introduzca su nombre">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-6" for="apellidos">Apellidos:</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="apellidos" placeholder="Introduzca sus apellidos">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-6" for="fecha-nacimiento">Fecha de nacimiento:</label>
                            <div class="col-sm-6">
                                <input type="date" class="form-control" id="fecha-nacimiento" placeholder="dd/mm/yyyy">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-6" for="dni">DNI:</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="dni" placeholder="12345678-L">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-6" for="email">Email:</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" id="email" placeholder="algo@example.com">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-6" for="">Altura:</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="altura" placeholder="Ej: 1.76">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-6" for="sexo">Sexo:</label>
                            <div class="col-sm-6">
                                <select class="form-control" id="sexo">
                                    <option>Hombre</option>
                                    <option>Mujer</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-6" for="fecha-consentimiento">Fecha de firma de consentimiento:</label>
                            <div class="col-sm-6">
                                <input type="date" class="form-control" id="fecha-consentimiento" placeholder="dd/mm/yyyy">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-6" for="pwd">Contraseña:</label>
                            <div class="col-sm-6">
                                <input type="password" class="form-control" id="pwd" placeholder="Enter password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-6" for="confirm-pwd">Confirmar contraseña:</label>
                            <div class="col-sm-6">
                                <input type="password" class="form-control" id="confirm-pwd" placeholder="Enter password">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-8 col-sm-offset-2">
                                El paciente me ha entregado su consentimiento: <input type="checkbox">
                            </div>
                        </div>
                        <!--<button type="submit" class="btn btn-default">Submit</button>-->
                        <div class="row">
                            <div class="col-sm-6">
                                <a href="m_index_medico.jsp" class="btn-ver-md">CANCELAR</a>
                            </div>
                            <div class="col-sm-6">
                                <a href="#" class="btn-ver-md">ALTA</a>
                            </div>
                        </div>
                    </form>
                </div>
                <!-- ./ panel-body -->
                <!-- panel-footer -->
                <div class="panel-footer">
                </div>
                <!-- ./ panel-footer -->
            </div>
        </div>
        <!-- ./ col Alta pacientes -->
    </div>
    <!-- ./ row Alta pacientes -->
</div>
<!-- ./ panel principal -->

<%@include	file="footer.jsp" %>