package edu.gatech.VRDR.model;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.HumanName;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Practitioner;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.VRDR.model.util.CommonUtil;

@ResourceDef(name = "Practitioner", profile = "http://www.hl7.org/fhir/us/vrdr/StructureDefinition/@ResourceDef(name=\"Death Certificate Reference\", profile=\"http://www.hl7.org/fhir/us/vrdr/StructureDefinition/VRDR-Death-Pronouncement-Performer")
public class DeathPronouncementPerformer extends Practitioner {
	public DeathPronouncementPerformer(HumanName name, String qualiferIdentifier, CodeableConcept qualifierCode) {
		CommonUtil.initResource(this);
		addName(name);
		PractitionerQualificationComponent qualification = new PractitionerQualificationComponent(qualifierCode)
				.addIdentifier(new Identifier().setValue(qualiferIdentifier));
		addQualification(qualification);
	}
}
