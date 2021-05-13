package fr.wildcodeschool.unittesting;

import org.junit.Test;
import junit.framework.Assert;

public class StringUtilsTest {
	
	@Test
	public void TestVowels() {
		
		StringUtils vowels = new StringUtils();
		Assert.assertEquals("aie", vowels.vowels("sandrine"));
	}

	//Pb de doublons (plusieurs fois la même voyelle en sortie) + une même voyelle en maj et min doit être considérée comme étant égale
	@Test
	public void TestVowelsMaj() {
		
		StringUtils vowels = new StringUtils();
		Assert.assertEquals("AaaaIe", vowels.vowels("sAaaandrIne"));
	}
	
	// pas d'exception à tort lorsque la paramètre en entrée est absent	
	@Test
	public void TestVowelsParamAbs() {
		
		StringUtils vowels = new StringUtils();
		Assert.assertEquals("", vowels.vowels("") );
	}
	
	// ----------------------------- //
	
	@Test
	public void TestVowels2() {
		
		StringUtils vowels = new StringUtils();
		Assert.assertEquals("aie", vowels.vowelsCorrected("sandrine"));
	}

	//Pb de doublons (plusieurs fois la même voyelle en sortie) + une même voyelle en maj et min doit être considérée comme étant égale
	@Test
	public void TestVowelsMaj2() {
		
		StringUtils vowels = new StringUtils();
		Assert.assertEquals("aie", vowels.vowelsCorrected("sAaaandrIne"));
	}
	
	// pas d'exception à tort lorsque la paramètre en entrée est absent	
	@Test
	public void TestVowelsParamAbs2() {
		
		StringUtils vowels = new StringUtils();
		Assert.assertEquals("Erreur : pas de paramètre en entrée à tort", vowels.vowelsCorrected("") );
	}
	
}
