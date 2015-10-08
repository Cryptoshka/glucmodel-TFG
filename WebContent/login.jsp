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
            <h3>¡Bienvenido a glUCModel!</h3>
            <p>glUCModel ha sido desarrollado por el grupo de Arquitecturas Paralelas y Algoritmos Bioinspirados del departamento de Arquitectura de Computadores y Automática de la UCM.</p>
            <p>glUCModel es un sistema de ayuda para el control de la diabetes.</p>
            <p>Para utilizar el sistema debe disponer de nombre de usuario y contraseña.</p>
            <p>Si usted es un profesional de la salud, por favor, rellene sus datos y solicite acceso mediante la pestaña de Nuevo usuario profesional.</p>
            <p>Si es usted paciente, y aún no ha usado el sistema, por favor, hable con su médico para que le dé de alta en el sistema.</p>
        </div>
    </div>
</div>
<!-- ./ App description -->

<!-- login container -->
<div class="container">
    <div class="row">
        <!-- login column -->
        <div class="col-md-4 col-md-offset-4">
			<form role="form" action="/Glucmodel-Web-v1/ProcesaLogin">
			    <div class="form-group">
			    	<label for="email">Email:</label>
			    	<input type="email" class="form-control" id="email" name="email" placeholder="Enter email">
			    </div>
			    <div class="form-group">
			    	<label for="pwd">Password:</label>
			    	<input type="password" class="form-control" id="pwd" name="pwd" placeholder="Enter password">
			    </div>
			    <div class="checkbox">
			    	<label><input type="checkbox"> Remember me</label>
			    </div>
			    
			    <div class="row">
                	<div class="col-sm-4">
                		<a href="p_index_paciente.php" class="list-group-item">Entrar (paciente)</a>
                	</div>
                	<div class="col-sm-4">
                		<a href="m_index_medico.php" class="list-group-item">Entrar (médico)</a>
                	</div>
                	<div class="col-sm-4">
                		<button type="submit" class="btn btn-default">Entrar</button>
                		<!--<a href="ProcesaLogin" class="list-group-item">Entrar</a>-->
                	</div>
	            </div>
            </form>
        </div>
        <!-- ./ login column -->
    </div>
</div>
<!-- ./ login container -->
	
<%@include	file="footer.jsp" %>