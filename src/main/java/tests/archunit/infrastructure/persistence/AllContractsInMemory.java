package tests.archunit.infrastructure.persistence;

import java.util.ArrayList;
import java.util.List;

import tests.archunit.domain.AllContracts;
import tests.archunit.domain.Contract;

public class AllContractsInMemory implements AllContracts{

	private List<Contract> contracts;
	
	public AllContractsInMemory() {
		contracts = new ArrayList<Contract>();
	}
	
	public void add(Contract contract) {
		contracts.add(contract);
		System.out.println("Contract "+ contract.getContractId().getContractNumber() + " was added with success.");
	}

}
