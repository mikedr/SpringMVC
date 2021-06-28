# Spring MVC
Is a framework for building web applications in Java based on the MVC pattern and levaraging features of Spring Core (CI, DI)

A big picture of how the proces flows:

1. We have a request coming from the browser which it'll encounter the Spring MVC front controller.
2. The Spring MVC front controller will create a Model and it will delegate the request to a controller.
3. The controller contains the business logic.
4. The controller will send the model back to the front controller which will pass that model to the view template.
5. The view template is basically a HTML page or a JSP page that will take the data and render a response to the browser.

<img style="float: center;" src="https://github.com/mikedr/SpringMVC/blob/main/Images/001-MVCdiagram.png">

