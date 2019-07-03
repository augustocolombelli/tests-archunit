package tests.archunit.configuration;

import tests.archunit.infrastructure.persistence.AllContractsInMemory;
import tests.archunit.usecase.RegisterNewContractUseCase;

public class UseCaseConfiguration {

    public RegisterNewContractUseCase getRegisterNewContractUseCase() {
        return new RegisterNewContractUseCase(new AllContractsInMemory());
    }

}
