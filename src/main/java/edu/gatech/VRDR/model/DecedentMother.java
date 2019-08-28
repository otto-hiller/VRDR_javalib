package edu.gatech.VRDR.model;

import org.hl7.fhir.dstu3.model.RelatedPerson;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.VRDR.model.util.CommonUtil;
import edu.gatech.VRDR.model.util.DecedentMotherUtil;

@ResourceDef(name = "RelatedPerson", profile = "http://www.hl7.org/fhir/us/vrdr/VRDR-Decedent-Mother")
public class DecedentMother extends RelatedPerson {
	public DecedentMother() {
		CommonUtil.initResource(this);
		setRelationship(DecedentMotherUtil.code);
	}
}