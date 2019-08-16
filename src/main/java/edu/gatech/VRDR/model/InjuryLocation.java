package edu.gatech.VRDR.model;

import java.util.UUID;

import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Location;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.VRDR.model.util.CommonUtil;

@ResourceDef(name="Location", profile="http://www.hl7.org/fhir/us/vrdr/StructureDefinition/VRDR-Injury-Location")
public class InjuryLocation extends Location{
	
	public InjuryLocation() {
		super();
		CommonUtil.initResource(this);
	}
}