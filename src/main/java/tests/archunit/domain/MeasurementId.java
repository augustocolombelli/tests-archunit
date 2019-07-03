package tests.archunit.domain;

public class MeasurementId {

	private Integer contractNumber;
	private Measurement measurementNumber;

	public Integer getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(Integer contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Measurement getMeasurementNumber() {
		return measurementNumber;
	}

	public void setMeasurementNumber(Measurement measurementNumber) {
		this.measurementNumber = measurementNumber;
	}

}
