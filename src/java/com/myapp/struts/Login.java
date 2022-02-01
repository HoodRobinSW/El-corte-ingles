package com.myapp.struts;

import DAO.Bd;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Login extends org.apache.struts.action.ActionForm {

    private String telefono;
    private String password;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getTelefono() == null || getTelefono().length() < 1) {
            errors.add("telefono", new ActionMessage("error.phoneNumber.required"));
        }
        if (getPassword()== null || getPassword().length() < 1) {
            errors.add("password", new ActionMessage("error.pass.required"));
        }
        return errors;
    }
}
