<%@ page language="java" contentType="text/html; charset-UTF-8"
      pageEncoding="UTF-8"%>


<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
      crossorigin="anonymous"
    />
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
      crossorigin="anonymous"
    ></script>

  </head>
<body>
<form action="login" method="POST">
<section class="vh-100" style="background-color:#eee;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col col-xl-10">
        <div class="card" style="border-radius: 1rem;">
          <div class="row g-0">
            <div class="col-md-6 col-lg-5 d-none d-md-block">
              <img src="https://img.etimg.com/thumb/width-640,height-480,imgsize-825656,resizemode-75,msid-101652916/tech/funding/ecommerce-logs-24-q2-growth-as-premium-products-click/ecommerce-major-amazon-is-set-to-open-its-logistics-infrastructure-in-india_thumb-image_ettech-1.jpg"
                alt="login form" class="w-100 vh-100" style="border-radius: 1rem 0 0 1rem;" />
            </div>
            <div class="col-md-6 col-lg-7 d-flex align-items-center">
              <div class="card-body p-4 p-lg-5 text-black">

                <form>

                  <div class="d-flex align-items-center mb-3 pb-1">
                                      <i class="fas fa-cubes fa-2x me-3" style="color: #ff6219;"></i>
                                      <span class="h1 fw-bold mb-0">E-Commerece</span>
                                    </div>

                  <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Sign into your account</h5>
                  <form action="login" method="POST">

                  <div class="form-outline mb-4">

                    <label class="form-label" for="form2Example17">User Name:</label>
                    <input type="text" name="username"/>
                  </div>


                  <div class="form-outline mb-4">

                    <label class="form-label" for="form2Example27">Password:</label>
                    <input type="text" name="password"/>
                  </div>

                  <div >
                    <input class="btn btn-dark btn-lg btn-block" type="submit" value="login"/>
                  </div>
                  <%
                                             if(request.getAttribute("error") !=null){
                                              out.print("<p>Invalid credentials!!!</p>");
                                             }
                                          %>
                  </form>

                  <a class="small text-muted" href="#!">Forgot password?</a>
                  <p class="mb-5 pb-lg-2" style="color: #393f81;">New User ??<a href="register.jsp"
                      style="color: #393f81;">Register here</a></p>
                  <a href="#!" class="small text-muted">Terms of use.</a>
                  <a href="#!" class="small text-muted">Privacy policy</a>
                </form>

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</form>
</body>
</html>