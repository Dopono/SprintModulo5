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

<title>Capacitación</title>

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
							<ul class="navbar-nav">
								<li class="nav-item"><a class="nav-link" href="ListarCapacitacion.jsp">Listar Capacitación</a></li>
								<li class="nav-item"><a class="nav-link" href="SVLogout">Cerrar sesión</a></li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
		</header>
	</div>

	
</body>
	 <div class="container mt-5 - d-flex justify-content-center">
                <div class="card - col-md-5">
                    <div class="card-body">
                      
                      
                       <caption>
                            <h2>Agregar Capacitación</h2>
                        </caption>
						<form action="SVCapacitacion" method="post">
                        <fieldset class="form-group">
                            <label>Nombre</label> <input type="text" value="" class="form-control" name="nombre">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Detalle</label> <input type="text"  class="form-control" name="detalle">
                        </fieldset>
                        <button type="submit" class="btn btn-danger">Guardar</button>
                        </form>
                    </div>
                </div>
            </div>
        </body>


	<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
</body>

</html>