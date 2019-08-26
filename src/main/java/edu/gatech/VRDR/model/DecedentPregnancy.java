package edu.gatech.VRDR.model;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Observation;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.VRDR.model.util.DecedentPregnancyUtil;

@ResourceDef(name = "Decedent Pregnancy", profile = "http://www.hl7.org/fhir/us/StructureDefinition/VRDR-Decedent-Pregnancy")
public class DecedentPregnancy extends Observation {
	public DecedentPregnancy(CodeableConcept value) {
		setStatus(DecedentPregnancyUtil.status);
		setCode(DecedentPregnancyUtil.code);
		setValue(value);
	}
}