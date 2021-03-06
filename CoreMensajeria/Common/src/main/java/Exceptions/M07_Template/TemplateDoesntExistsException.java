package Exceptions.M07_Template;

import Exceptions.PersonalizedException;

/**
 * Exeption personalizada para indicar que no existe una plantilla
 * y cual es el idTemplate que no existe.
 */
public class TemplateDoesntExistsException extends PersonalizedException {
    private int idTemplate;

    public TemplateDoesntExistsException() {
        super();
    }

    public TemplateDoesntExistsException(Exception e) {
        super(e);
    }

    public TemplateDoesntExistsException(String message) {
        super(message);
    }

    public TemplateDoesntExistsException(String message, Exception e) {
        super(message, e);
    }

    public TemplateDoesntExistsException(String message, Exception e, int idTemplate) {
        super(message, e);
        this.idTemplate = idTemplate;
    }

    public int getIdTemplate() {
        return idTemplate;
    }
}
