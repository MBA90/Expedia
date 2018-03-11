
package com.mba.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Persona implements Serializable
{

    @SerializedName("personaType")
    @Expose
    private String personaType;
    
    private final static long serialVersionUID = 1840391143245419314L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Persona() {
    }

    /**
     * 
     * @param personaType
     */
    public Persona(String personaType) {
        super();
        this.personaType = personaType;
    }

    public String getPersonaType() {
        return personaType;
    }

    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }

}
