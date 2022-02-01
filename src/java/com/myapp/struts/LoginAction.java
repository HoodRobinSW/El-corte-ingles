package com.myapp.struts;

import DAO.Bd;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginAction extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Login login = (Login) form;
        if (Bd.buscarUsuarioPorTelefono(login.getTelefono())) {
            if (Bd.logearUsuario(login))
                return mapping.findForward("correcto");
            else return mapping.findForward("error");
        } else {
            return mapping.findForward("registro");
        }
    }
}


