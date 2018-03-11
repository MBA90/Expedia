
package com.mba.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInfo implements Serializable
{

    @SerializedName("persona")
    @Expose
    private Persona persona;
    @SerializedName("userId")
    @Expose
    private String userId;
    
    private final static long serialVersionUID = 4525462267963511706L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserInfo() {
    }

    /**
     * 
     * @param userId
     * @param persona
     */
    public UserInfo(Persona persona, String userId) {
        super();
        this.persona = persona;
        this.userId = userId;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
