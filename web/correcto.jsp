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
            <html:form action="action" method="post">
                <h5 class="tituloGris"><bean:message key="welcome.header2"/></h5>
                <div class="separadorPeque"></div>
                <div class="row">
                    <span class="info"><bean:message key="login.registered"/></span>
                </div>
                <div class="row">
                    <div class="col">
                        <label><bean:message key="login.name"/></label><br/>
                        <span class="info"><bean:write name="Usuario" property="nombre"/></span>
                    </div>
                    <div class="col">
                        <label><bean:message key="login.province"/></label><br/>
                        <span class="info"><bean:write name="Usuario" property="provincia"/></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label><bean:message key="login.surname"/></label><br/>
                        <span class="info"><bean:write name="Usuario" property="apellidos"/></span>
                    </div>
                    <div class="col">
                        <label><bean:message key="login.village"/></label><br/>
                        <span class="info"><bean:write name="Usuario" property="municipio"/></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label><bean:message key="login.id"/></label><br/>
                        <span class="info"><bean:write name="Usuario" property="nif"/></span>
                    </div>
                    <div class="col">
                        <label><bean:message key="login.phoneNumber"/></label><br/>
                        <span class="info"><bean:write name="Usuario" property="telefono"/></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label><bean:message key="login.email"/></label><br/>
                        <span class="info"><bean:write name="Usuario" property="email"/></span>
                    </div>
                    <div class="col">
                        <label><bean:message key="login.publicity"/></label><br/>
                        <span class="info"><bean:write name="Usuario" property="publicidad"/></span>
                    </div>
                </div>                    
                <div class="separadorPeque"></div>
                <div class="row submit">
                    <html:submit>
                        <bean:message key="login.submit"/>
                    </html:submit>
                </div>
            </html:form>
        </main>
    </body>
</html:html>