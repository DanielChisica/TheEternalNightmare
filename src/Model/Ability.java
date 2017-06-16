/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Represents an instance of a shift and its attributes
 *
 * @author Daniel Jiménez Chísica
 * @since 20 March 2017
 */
public class Ability {

    private String concept;
    private int id;

    /**
     * This constructor initializes a shift with a input concept
     *
     * @param concept The concept of the consultation
     */
    public Ability(String concept) {
        this.concept = concept;
    }

    /**
     * Returns the concept of the consultation
     *
     * @return The concept of the shift
     */
    public String getConcept() {
        return concept;
    }

    /**
     * Sets the concept in the shift
     *
     * @param concept The concept of the consultation
     */
    public void setConcept(String concept) {
        this.concept = concept;
    }

    /**
     * Returns the identification number
     *
     * @return The integer with the identification
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the identification of the shift
     *
     * @param id The input identification of the shift
     */
    public void setId(int id) {
        this.id = id;
    }

}
