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

<title>Login</title>

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


	<section class="contact_section layout_padding">
		<div class="custom_heading-container">
			<h3 class=" ">Iniciar sesión</h3>
		</div>
		<div class="container layout_padding2-top">
			<div class="row">
				<div class="col-md-6 mx-auto">
					<form action="SVLogin" method="post">
						<div>
							<label for="username"><i
								class="zmdi zmdi-account material-icons-name"></i></label> <input
								type="text" name="username" placeholder="Usuario" />
						</div>
						<div class="form-group">
							<label for="password"><i class="zmdi zmdi-lock"></i></label> <input
								type="password" name="password" placeholder="Contraseña">
						</div>

						<div class="d-flex justify-content-center ">
							<div class="form-group form-button">
								<button type="submit">Iniciar sesión</button>
							</div>
						</div>
					</form>
				
					</div>
				</div>
			</div>
	</section>




	<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
</body>

</html>