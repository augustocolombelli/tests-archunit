package tests.archunit.domain;

import java.util.Collection;

public class Contract {

	private ContractId contractId;
	private Collection<Measurement> measurements;
	private String notes;

	public ContractId getContractId() {
		return contractId;
	}

	public void setContractId(ContractId contractId) {
		this.contractId = contractId;
	}

	public Collection<Measurement> getMeasurements() {
		return measurements;
	}

	public void setMeasurements(Collection<Measurement> measurements) {
		this.measurements = measurements;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
