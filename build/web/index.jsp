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
            <h5 class="tituloGris"><bean:message key="welcome.header1"/></h5>
            <div class="separadorPeque"></div>
            <html:form action="loginAction" method="post">
                <div class="row">
                    <div class="col">
                        <span class="error"><i><html:errors property="telefono"/></i></span><br/>
                        <label><bean:message key="login.phoneNumber"/></label><br/>
                        <html:text property="telefono"/>
                    </div>
                    <div class="col">
                        <span class="error"><i><html:errors property="password"/></i></span><br/>
                        <label><bean:message key="login.pass.title"/></label><br/>
                        <html:password property="password"/>
                    </div>
                </div>
                <div class="row">
                    <html:submit>
                        <bean:message key="login.submit"/>
                    </html:submit>
                </div>
            </html:form>
        </main>
    </body>
</html:html>