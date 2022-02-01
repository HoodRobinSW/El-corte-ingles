package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Usuario extends org.apache.struts.action.ActionForm {

    private String email;
    private String confirmacionEmail;
    private String pass;
    private String confirmacionPass;
    private String nombre;
    private String apellidos;
    private String nif;
    private String provincia;
    private String municipio;
    private String telefono;
    private boolean publicidad;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmacionEmail() {
        return confirmacionEmail;
    }

    public void setConfirmacionEmail(String confirmacionEmail) {
        this.confirmacionEmail = confirmacionEmail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getConfirmacionPass() {
        return confirmacionPass;
    }

    public void setConfirmacionPass(String confirmacionPass) {
        this.confirmacionPass = confirmacionPass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono.replace(" ", "");
    }

    public boolean isPublicidad() {
        return publicidad;
    }

    public void setPublicidad(boolean publicidad) {
        this.publicidad = publicidad;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (!getEmail().matches("^\\w+@\\w+\\.[A-Za-z]{2,}$")) {
            errors.add("email", new ActionMessage("error.email"));
        }
        if (!getEmail().equals(getConfirmacionEmail())) {
            errors.add("confirmacionEmail", new ActionMessage("error.confirm.email"));
        }
        if (!getPass().matches("^(?=.*[A-Z]+)(?=.*[!@#$&*])(?=.*[0-9]+)(?=.*[a-z]+).{8,}$")) {
            errors.add("pass", new ActionMessage("error.pass"));
        }
        if (!getPass().equals(getConfirmacionPass())) {
            errors.add("confirmacionPass", new ActionMessage("error.confirm.pass"));
        }
        if (getNombre() == null | getNombre().isEmpty()) {
            errors.add("nombre", new ActionMessage("error.name.required"));
        }
        if (getApellidos() == null | getApellidos().isEmpty()) {
            errors.add("apellidos", new ActionMessage("error.surname.required"));
        }
        if (getMunicipio() == null | getMunicipio().isEmpty()) {
            errors.add("municipio", new ActionMessage("error.village.required"));
        }
        if (!validId(getNif())) {
            errors.add("nif", new ActionMessage("error.id"));
        }
        if (!getTelefono().matches("\\d{9}")) {
            errors.add("telefono", new ActionMessage("error.phoneNumber"));
        }
        return errors;
    }

    public boolean validId(String id) {
        try {
            char letters[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'
            };
            char letra = id.charAt(8);
            int idNum = Integer.parseInt(id.substring(0, 8));

            return letters[idNum % 23] == letra ? true : false;
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            return false;
        }
    }
}
