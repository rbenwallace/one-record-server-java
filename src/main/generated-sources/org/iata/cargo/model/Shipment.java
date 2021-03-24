
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * Shipment details
 * 
 * This class was generated by OWL2Java 0.16.4
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Shipment)
public class Shipment
    extends LogisticsObject
    implements Serializable
{

    /**
     * Details of contained piece(s)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_containedPiece_A)
    protected Set<Piece> containedPiece;
    /**
     * Name and UN/LOCODE code of the point or port of departure, shipment or destination, as required under the applicable delivery term
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_deliveryLocation)
    protected Set<Location> deliveryLocation;
    /**
     * Dimensions details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_dimensions_A_A)
    protected Set<Dimensions> dimensions;
    /**
     * Reference document details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_externalReference_A)
    protected Set<ExternalReference> externalReference;
    /**
     * Insurance details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_insurance)
    protected Set<Insurance> insurance;
    /**
     * Weight details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_totalGrossWeight)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Value totalGrossWeight;
    /**
     * Volumetric weight details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_volumetricWeight_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected Set<VolumetricWeight> volumetricWeight;
    /**
     * Waybill unique identifier (AWB or HWB)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_waybillNumber_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Waybill waybillNumber;
    /**
     * he date at which the delivery is supposed to happen. Format is YYYYMMDD.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_deliveryDate)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", max = 1)
    })
    protected Date deliveryDate;
    /**
     * General goods description
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_goodsDescription_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String goodsDescription;
    /**
     * Standard codes as defined by UNCEFACT & ICC that correspond to international rules for the interpretation of the most commonly used trade terms in different countries. UNECE recommendation n. 5 Incoterms 2000.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_incoterms)
    protected Set<String> incoterms;
    /**
     * payment of Other Charges will be made at origin (prepaid) or at destination (collect)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_otherChargesIndicator)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String otherChargesIndicator;
    /**
     * Total Piece Count
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_totalPieceCount)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#integer", max = 1)
    })
    protected Integer totalPieceCount;
    /**
     * Total SLAC of all piece groups 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_totalSLAC)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#integer", max = 1)
    })
    protected Integer totalSLAC;
    /**
     * payment for the Weight/Valuation will be made at origin (prepaid) or at destination (collect)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_weightValuationIndicator)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String weightValuationIndicator;

    public void setContainedPiece(Set<Piece> containedPiece) {
        this.containedPiece = containedPiece;
    }

    public Set<Piece> getContainedPiece() {
        return containedPiece;
    }

    public void setDeliveryLocation(Set<Location> deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public Set<Location> getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDimensions(Set<Dimensions> dimensions) {
        this.dimensions = dimensions;
    }

    public Set<Dimensions> getDimensions() {
        return dimensions;
    }

    public void setExternalReference(Set<ExternalReference> externalReference) {
        this.externalReference = externalReference;
    }

    public Set<ExternalReference> getExternalReference() {
        return externalReference;
    }

    public void setInsurance(Set<Insurance> insurance) {
        this.insurance = insurance;
    }

    public Set<Insurance> getInsurance() {
        return insurance;
    }

    public void setTotalGrossWeight(Value totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
    }

    public Value getTotalGrossWeight() {
        return totalGrossWeight;
    }

    public void setVolumetricWeight(Set<VolumetricWeight> volumetricWeight) {
        this.volumetricWeight = volumetricWeight;
    }

    public Set<VolumetricWeight> getVolumetricWeight() {
        return volumetricWeight;
    }

    public void setWaybillNumber(Waybill waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public Waybill getWaybillNumber() {
        return waybillNumber;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }

    public void setIncoterms(Set<String> incoterms) {
        this.incoterms = incoterms;
    }

    public Set<String> getIncoterms() {
        return incoterms;
    }

    public void setOtherChargesIndicator(String otherChargesIndicator) {
        this.otherChargesIndicator = otherChargesIndicator;
    }

    public String getOtherChargesIndicator() {
        return otherChargesIndicator;
    }

    public void setTotalPieceCount(Integer totalPieceCount) {
        this.totalPieceCount = totalPieceCount;
    }

    public Integer getTotalPieceCount() {
        return totalPieceCount;
    }

    public void setTotalSLAC(Integer totalSLAC) {
        this.totalSLAC = totalSLAC;
    }

    public Integer getTotalSLAC() {
        return totalSLAC;
    }

    public void setWeightValuationIndicator(String weightValuationIndicator) {
        this.weightValuationIndicator = weightValuationIndicator;
    }

    public String getWeightValuationIndicator() {
        return weightValuationIndicator;
    }

}
