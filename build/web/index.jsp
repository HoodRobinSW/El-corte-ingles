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
            <html:form action="action" method="post">
                <div class="row">
                    <div class="col">
                        <span class="error"><i><html:errors property="email"/></i></span><br/>
                        <label><bean:message key="login.email"/></label><br/>
                        <html:text property="email"/>
                    </div>
                    <div class="col">
                        <span class="error"><i><html:errors property="pass"/></i></span><br/>
                        <label><bean:message key="login.pass"/></label><br/>
                        <html:password property="pass"/>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <span class="error"><i><html:errors property="confirmacionEmail"/></i></span><br/>
                        <label><bean:message key="login.confirm.email"/></label><br/>
                        <html:text property="confirmacionEmail"/>
                    </div>
                    <div class="col">
                        <span class="error"><i><html:errors property="confirmacionPass"/></i></span><br/>
                        <label><bean:message key="login.confirm.pass"/></label><br/>
                        <html:password property="confirmacionPass"/>
                    </div>
                </div>
                <h5 class="tituloGris"><bean:message key="welcome.header2"/></h5>
                <div class="separadorPeque"></div>
                <div class="row">
                    <div class="col">
                        <span class="error"><i><html:errors property="nombre"/></i></span><br/>
                        <label><bean:message key="login.name"/></label><br/>
                        <html:text property="nombre"/>
                    </div>
                    <div class="col">
                        <br/>
                        <label><bean:message key="login.province"/></label><br/>
                        <html:select property="provincia">
                            <html:option value="Almeria">Almeria</html:option>
                            <html:option value="Cadiz">Cadiz</html:option>
                            <html:option value="Jaen">Jaen</html:option>
                            <html:option value="Sevilla">Sevilla</html:option>
                            <html:option value="Malaga">Malaga</html:option>
                            <html:option value="Huelva">Huelva</html:option>
                            <html:option value="Cordoba">Cordoba</html:option>
                            <html:option value="Granada">Granada</html:option>
                        </html:select>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <span class="error"><i><html:errors property="apellidos"/></i></span><br/>
                        <label><bean:message key="login.surname"/></label><br/>
                        <html:text property="apellidos"/>
                    </div>
                    <div class="col">
                        <span class="error"><i><html:errors property="municipio"/></i></span><br/>
                        <label><bean:message key="login.village"/></label><br/>
                        <html:text property="municipio"/>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <span class="error"><i><html:errors property="nif"/></i></span><br/>
                        <label><bean:message key="login.id"/></label><br/>
                        <html:text property="nif"/>
                    </div>
                    <div class="col">
                        <span class="error"><i><html:errors property="telefono"/></i></span><br/>
                        <label><bean:message key="login.phoneNumber"/></label><br/>
                        <html:text property="telefono"/>
                    </div>
                </div>
                <div class="row">
                    <html:checkbox property="publicidad" value="true"/>
                    <label><bean:message key="login.checkbox"/></label>
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