<%
	if(session.getAttribute("username")== null){
		response.sendRedirect("Login.jsp");
	}
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<title>Seguridad Integral</title>

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
					<a class="navbar-brand" href="svInicio"> <span>
							Seguridad Integral </span>
					</a>
					<button class="navbar-toggler ml-auto" type="button"
						data-toggle="collapse" data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>

					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<div
							class="d-flex mx-auto flex-column flex-lg-row align-items-center">
							<ul class="navbar-nav  ">
								<li class="nav-item active"><a class="nav-link"
									href="Inicio.jsp" >Inicio<span class="sr-only">(current)</span></a>
								</li>
								<li class="nav-item"><a class="nav-link"
									href="Capacitacion.jsp">Capacitación</a></li>
								<li class="nav-item"><a class="nav-link"
									href="Contacto.jsp">Contáctanos</a></li>
								<li class="nav-item"><a class="nav-link"
									href="Usuario.jsp">Usuarios</a></li>
								<li class="nav-item"><a class="nav-link"
									href="SVLogout">Cerrar sesión</a></li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
		</header>
		<!-- end header section -->
		<!-- slider section -->
		<section class=" slider_section position-relative">
			<div id="carouselExampleControls" class="carousel slide"
				data-ride="carousel">
				<div class="carousel-inner">
					<div class="carousel-item active">
						<div class="slider_item-box layout_padding2">
							<div class="container">
								<div class="row">
									<div class="col-md-6">
										<div class="img-box">
											<div>
												<img src="images/slider-img.jpg" alt="" class="" />
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="detail-box">
											<div>
												<h1>
													Nuestra Empresa <br>
												</h1>
												<p>En Seguridad Integral, nos dedicamos a promover la
													seguridad y la prevención de riesgos en el entorno laboral.
													Nuestra misión es proteger la salud y el bienestar de los
													trabajadores, así como preservar la integridad de las
													empresas y garantizar el cumplimiento de las normativas
													vigentes en materia de seguridad laboral.</p>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="container">
					<div class="slider_nav-box">
						<div></div>
					</div>
				</div>
			</div>
		</section>
	</div>
	

	<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
</body>

</html>