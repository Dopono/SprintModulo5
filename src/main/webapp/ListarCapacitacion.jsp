<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.Capacitacion" %> 
<%@page import="dao.CapacitacionDAO" %> 
<%@page import="java.util.ArrayList" %> 

<!DOCTYPE html>
<html>

<head>
<!-- Basic -->
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<!-- Mobile Metas -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<!-- Site Metas -->
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="author" content="" />

<title> Listar Capacitación</title>

<!-- slider stylesheet -->
<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.1.3/assets/owl.carousel.min.css" />

<!-- bootstrap core css -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

<!-- fonts style -->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:400,700|Roboto:400,700&display=swap"
	rel="stylesheet">
<!-- Custom styles for this template -->
<link href="css/style.css" rel="stylesheet" />
<!-- responsive style -->
<link href="css/responsive.css" rel="stylesheet" />
</head>

<body>
	<div class="hero_area">
		<!-- header section strats -->
		<header class="header_section">
			<div class="container-fluid">
				<nav class="navbar navbar-expand-lg custom_nav-container ">
					<a class="navbar-brand" href="Inicio.jsp"> <span>
							Seguridad Integral </span>
					</a>
					<button class="navbar-toggler ml-auto" type="button"
						data-toggle="collapse" data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>

					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<div class="justify-content-between middle-items-center">
							<ul class="navbar-nav ">
								<li class="nav-item"><a class="nav-link" href="SVLogout">Cerrar
										sesión</a></li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
		</header>
	</div>


	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container mt-4">
			<h3 class="text-center">Lista de Capacitaciones</h3>
			<hr>
			<div class="container text-left">

				<a href="Capacitacion.jsp" class="btn btn-danger">Agregar Capacitación</a>
			</div>
			<br>
			
			<div>
				<input type="hidden" name="id"
				value=<%=request.getParameter("id")%>>
			</div>
			
			<table class="table align-middle">
				<thead>
					<tr>
						<th scope="row">ID</th>
						<th>Nombre</th>
						<th >Detalle</th>
						<th class="col-sm-1">Acciones</th>
						<th></th>
					</tr>
				</thead>
  <%
 	 ArrayList<Capacitacion> lista = new ArrayList<Capacitacion>();
	lista = CapacitacionDAO.selecionarCapacitacion();
	for(Capacitacion cap: lista) { 
  %>
				<tbody>
					<tr >
						<td ><%=cap.getId() %></td>
						<td ><%=cap.getNombre()%></td>
						<td ><%=cap.getDetalle()%></td>
						<td >
						<form class="col-auto" action="SVEliminarCap">
						<input class="form-control" type="hidden" name="id" value="<%=cap.getId()%>"/>
						<button class="btn btn-primary" type="submit">Eliminar</button>
						</form>
						</td>
						<td>
						<div class="col-auto"> 
						<input class="col-auto btn btn-warning" type="submit" value="Editar Datos" onclick="update()">
						</div>
						</td>
					</tr>
					 <% } %>
				</tbody>
			</table>
		</div>
	</div>



	<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript">
		
		  function update() {
		  var id = document.forms[0].elements['id'].value;
		  window.location.href = "EditarCap.jsp?id=" + id;
		}

	</script>
</body>

</html>