package tests.archunit.usecase;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.junit.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;

public class DomainArchitectureTest {

	@Test
	public void domainShouldNotDependOnClassesInUseCase() {
		JavaClasses importedClasses = new ClassFileImporter().importPackages("tests.archunit");
		
		ArchRule myRule = 
				noClasses()
				.that().resideInAPackage("..domain..")
				.should().dependOnClassesThat().resideInAPackage("..usecase..");
		
		myRule.check(importedClasses);
	}
}
