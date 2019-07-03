package tests.archunit.domain;

public class ContractId {

	private Integer contractNumber;

	public ContractId(Integer contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Integer getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(Integer contractNumber) {
		this.contractNumber = contractNumber;
	}

}
