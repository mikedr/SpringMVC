# Spring MVC

## Introduction

Is a framework for building web applications in Java based on the MVC pattern and levaraging features of Spring Core (CI, DI)

A big picture of how the proces flows:

1. We have a request coming from the browser which it'll encounter the Spring MVC front controller, which is known as **DispatcherServlet**.
2. The Spring MVC front controller will create a Model and it will delegate the request to a controller.
3. The controller contains the business logic.
4. The controller will send the model back to the front controller which will pass that model to the view template.
5. The view template is basically a HTML page or a JSP page that will take the data and render a response to the browser.

<img style="float: center;" src="https://github.com/mikedr/SpringMVC/blob/main/Images/001-MVCdiagram.png">

As a developers we have to create:

* Model objects (Green)
* View templates (Red)
* Controller classes (White)

### Controller

When the front controller has a request it delegates the request to the controller. The controller handles the request (maybe reading a form data), stores o retrieves data from the database or web service and places data in the Model to pass it to the view template. 

### Model

Contains the data. Data can be any object / collection.

### View template

Spring MVC is flaxible, it supports many view templates. The most commons are JSP (Java Server Pages) + JSTL (JSP standard tag library). So the model data comes over the template so the JSP page can read the model data and display it. 

## Spring MVC Configuration Process

Add configurations to file: WEB-INF/web.xml

1. Configure Spring MVC Disptcher Servlet
2. Set up URL mappings to Spring MVC Dispatcher Servlet.

Add configurations to file: WEB-INF/my-app-servlet.xml

3. Add support for Spring component scanning
4. Add support for conversion, format and validation
5. Configure Spring MVC View Resolver

## Creating a Spring Home Controller and View

1. Create a controller
Annotate a class with @Controller

2. Define a controller method

3. Add request mapping to controller method
Annotate a class with @RequestMapping("/")

4. Return view name
5. Develop view page