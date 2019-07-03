package tests.archunit.usecase;

public class ContractToRegisterDto {

	private Integer contractNumber;
	private String notes;

	public ContractToRegisterDto(Integer contractNumber, String notes) {
		this.contractNumber = contractNumber;
		this.notes = notes;
	}

	public Integer getContractNumber() {
		return contractNumber;
	}

	public String getNotes() {
		return notes;
	}

}
