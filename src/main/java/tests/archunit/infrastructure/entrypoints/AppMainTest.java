package tests.archunit.infrastructure.entrypoints;

import tests.archunit.configuration.UseCaseConfiguration;
import tests.archunit.usecase.ContractToRegisterDto;
import tests.archunit.usecase.RegisterNewContractUseCase;

public class AppMainTest {

	public static void main(String[] args) {
		RegisterNewContractUseCase useCase = new UseCaseConfiguration().getRegisterNewContractUseCase();
		
		useCase.register(new ContractToRegisterDto(522, "Contrato 1"));
		useCase.register(new ContractToRegisterDto(523, "Contrato 2"));
		useCase.register(new ContractToRegisterDto(524, "Contrato 3"));
	}
	 
}