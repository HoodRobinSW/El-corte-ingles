<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html:html>
    <head>
        <meta charset="UTF-8"/>
        <title><bean:message key="welcome.title"/></title>
        <link rel="stylesheet" type="text/css" href="css/style.css"/>
    </head>
    <body>
        <header>
            <div>
                <html:img srcKey="welcome.img" alt="El Corte Inglés"/>    
            </div>
            <div class="greenSeparator"></div>
        </header>
        <main>
            <div class="row">
                <div class="row"><span class="error"><i><bean:message key="error.login"/></i></span></div>
            </div>
            <a href="index.jsp">Volver</a>
        </main>
    </body>
</html:html>