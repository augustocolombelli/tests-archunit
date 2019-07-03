package tests.archunit.usecase;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.junit.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;

public class UseCaseArchitectureTest {

	
	@Test
	public void useCasesShouldNotDependOnClassesInConfigurationAndInfrasctructure() {
		JavaClasses importedClasses = new ClassFileImporter().importPackages("tests.archunit");
		
		ArchRule myRule = noClasses()
				.that().resideInAPackage("..usecase..")
				.should().dependOnClassesThat().resideInAnyPackage("..configuration..", "..infrastructure..");
		
		myRule.check(importedClasses);
	}
}
