<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include	file="header.jsp" %>

<!-- Section title -->
<div class="jumbotron" id="titulo_seccion">
    <p>Login</p>
</div>
<!-- ./ Section title -->

<!-- App description -->
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 text-center">
        	<p> Prueba </p>
            <h3>¡Bienvenido a glUCModel!</h3>
            <p>glUCModel ha sido desarrollado por el grupo de Arquitecturas Paralelas y Algoritmos Bioinspirados del departamento de Arquitectura de Computadores y Automática de la UCM.</p>
            <p>glUCModel es un sistema de ayuda para el control de la diabetes.</p>
            <p>Para utilizar el sistema debe disponer de nombre de usuario y contraseña.</p>
            <p>Si usted es un profesional de la salud, por favor, rellene sus datos y solicite acceso mediante la pestaña de Nuevo usuario profesional.</p>
            <p>Si es usted paciente, y aún no ha usado el sistema, por favor, hable con su médico para que le de de alta en el sistema.</p>
        </div>
    </div>
</div>
<!-- ./ App description -->

<!-- login container -->
<div class="container">
    <div class="row">
        <!-- login column -->
        <div class="col-md-4 col-md-offset-4">
        	
			<form role="form" id="form_login">
			
			    <div class="form-group">
			    	<label for="email">Email:</label>
			    	<input type="email" class="form-control" id="i_email" name="email" placeholder="Enter email">
			    </div>
			    
			    <div class="form-group">
			    	<label for="pwd">Password:</label>
			    	<input type="password" class="form-control" id="i_pwd" name="pwd" placeholder="Enter password">
			    </div>
			    
			    <div class="row">
                	<button type="submit" class="btn btn-default">Entrar</button>
	            </div>
            </form>
            
            <!-- Un script que recoja los datos del formulario, invoque al servicio con los parámetros de 
            	 usr y pwd, y en función de la respuesta que devuelva, haga una cosa u otra. -->
           	<script>
	           	$('#form_login').on('submit', processLogin());
            	 function processLogin() {
				    console.log('processLogin()');
				    console.log("AAh:" + $("#i_email").val());
				    var email = $("#i_email").val();
				    var password = $("#i_pwd").val();

				    console.log("Info del form: " + email + " " + password  + "fin");
				    return false;
				    /*$.ajax({
				        type: 'POST',
				        url: "http://localhost:8080/glucmodel/api/login",
						data: {
							'email' : email,
				    		'pwd' : password
						},
				        success: function(data, textStatus, jqXHR){
				            alert('Llamada AJAX correcta');
				            $('#id').val();
				            $('#email').val();
				        },
				        error: function(jqXHR, textStatus, errorThrown){
				            alert('addWine error: ' + textStatus);
				        }
				    });*/
				}
			</script>
                    
        </div>
        <!-- ./ login column -->
    </div>
</div>
<!-- ./ login container -->
	
<%@include	file="footer.jsp" %>