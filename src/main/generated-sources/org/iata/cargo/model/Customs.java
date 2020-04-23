
package org.iata.cargo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.cargo.Vocabulary;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;


/**
 * Customs value declaration
 * 
 * This class was generated by OWL2Java 0.14.1
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Customs)
public class Customs
    implements Serializable
{

    @Id(generated = true)
@JsonProperty("@id")
    protected String id;
    @JsonIgnore
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @JsonIgnore
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
@JsonProperty("@type")
    protected Set<String> types;
    @Properties
    @JsonIgnore
    protected Map<String, Set<String>> properties;
    /**
     * Goods value declaration for customs
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_amount_A_A)
    protected Set<Value> amount;
    /**
     * NCV (No Customs Value) indicator when no value is declared for customs
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_noCustomsValue)
    protected Set<String> noCustomsValue;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setProperties(Map<String, Set<String>> properties) {
        this.properties = properties;
    }

    public Map<String, Set<String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return ((((("Customs {"+ name)+"<")+ id)+">")+"}");
    }

    public void setAmount(Set<Value> amount) {
        this.amount = amount;
    }

    public Set<Value> getAmount() {
        return amount;
    }

    public void setNoCustomsValue(Set<String> noCustomsValue) {
        this.noCustomsValue = noCustomsValue;
    }

    public Set<String> getNoCustomsValue() {
        return noCustomsValue;
    }

}
