package tests.archunit.usecase;

import tests.archunit.domain.AllContracts;
import tests.archunit.domain.Contract;
import tests.archunit.domain.ContractId;

public class RegisterNewContractUseCase {

	private AllContracts allContracts;

	public RegisterNewContractUseCase(AllContracts allContracts) {
		this.allContracts = allContracts;
	}

	public void register(ContractToRegisterDto dto) {
		Contract contract = new Contract();
		contract.setContractId(new ContractId(dto.getContractNumber()));
		contract.setNotes(dto.getNotes());
		
		allContracts.add(contract);
	}

}
