
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.cargo.Vocabulary;


/**
 * Logistics Object prent class, containing all common properties for logistics objects.
 * 
 * This class was generated by OWL2Java 0.16.4
 * 
 */
@OWLClass(iri = Vocabulary.s_c_LogisticsObject)
public class LogisticsObject
    implements Serializable
{

    @Id(generated = true)
    protected String id;
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    protected Set<String> types;
    @Properties
    protected Map<String, Set<String>> properties;
    /**
     * Events object
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_event)
    protected Set<Event> event;
    /**
     * Company identifier from the Internet of Logistics of the entity that hosts the Logistics Object.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_companyIdentifier)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String companyIdentifier;

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
        return ((((("LogisticsObject {"+ name)+"<")+ id)+">")+"}");
    }

    public void setEvent(Set<Event> event) {
        this.event = event;
    }

    public Set<Event> getEvent() {
        return event;
    }

    public void setCompanyIdentifier(String companyIdentifier) {
        this.companyIdentifier = companyIdentifier;
    }

    public String getCompanyIdentifier() {
        return companyIdentifier;
    }

}
