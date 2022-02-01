package com.myapp.struts;

import DAO.Bd;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Action extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Usuario usuario = (Usuario) form;
        if (!Bd.esteUsuarioExiste(usuario)) {
            Bd.insertarUsuario(usuario);
            return mapping.findForward("correcto");
        } else {
            return mapping.findForward("existe");
        }
        
    }
}
