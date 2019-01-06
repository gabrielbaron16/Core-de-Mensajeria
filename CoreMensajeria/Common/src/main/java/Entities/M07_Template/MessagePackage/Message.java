package Entities.M07_Template.MessagePackage;

import Entities.Entity;

import java.util.*;

/**
 * Message class uses for storing message information from a template
 */
public class Message extends Entity {
    /**
     * list of parameters of the message
     */
    private ArrayList<Parameter> parameterArrayList;
    /**
     * string with de message and parameters
     */
    private String message;

    private int templateId;

    /**
     * empty builder
     */
    public Message() {}

    /**
     * builder with only the message id.
     * @param messageId message id
     */
    public Message(int messageId) {
        this.set_id(messageId);
    }

    /**
     * builder with the list of parameters and string with message and parameters
     * @param parameterArrayList list of parameters of the message
     * @param message string with message and parameters
     */
    public Message(ArrayList<Parameter> parameterArrayList, String message) {
        this.parameterArrayList = parameterArrayList;
        this.message = message;
    }

    /**
     *  builder with id message, the list of parameters and string with message and parameters
     * @param messageId message id
     * @param parameterArrayList ist of parameters of the message
     * @param message string with message and parameters
     */
    public Message(int messageId, ArrayList<Parameter> parameterArrayList, String message) {
        this.set_id(messageId);
        this.parameterArrayList = parameterArrayList;
        this.message = message;
    }

    public Message(int messageId, String message, int templateId) {
        this.set_id(messageId);
        this.message = message;
        this.templateId = templateId;
    }

    /**
     * Builder with all the data
     * @param messageId
     * @param parameterArrayList
     * @param message
     * @param templateId
     */
    public Message(int messageId,ArrayList<Parameter> parameterArrayList, String message, int templateId) {
        this.set_id(messageId);
        this.parameterArrayList = parameterArrayList;
        this.message = message;
        this.templateId = templateId;
    }

    /**
     * show the list of parameters of the message
     * @return ArrayList of parameters
     */
    public ArrayList<Parameter> getParameterArrayList() {
        return parameterArrayList;
    }

    /**
     * add/modify the list of the parameters of the message
     * @param parameters new list of the parameters
     */
    public void setParameters(ArrayList<Parameter> parameters) {
        this.parameterArrayList = parameters;
    }

    public void addParameter(Parameter parameter){
        parameterArrayList.add(parameter);
    }

    /**
     * show string whit message and parameters of the message
     * @return string whit message and parameters of the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * add/modify string whit message and parameters of the message
     * @param message new string whit message and parameters
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Get the id of the Template
     * @return Template ID
     */
    public int getTemplateId() {
        return templateId;
    }

    /**
     * set Template ID
     * @param templateId
     */
    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message1 = (Message) o;
        return Objects.equals(getParameterArrayList(), message1.getParameterArrayList()) &&
                Objects.equals(getMessage(), message1.getMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getParameterArrayList(), getMessage());
    }

}

