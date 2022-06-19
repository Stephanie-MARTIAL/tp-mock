package com.tp.mock;

import java.util.Arrays;
import java.util.List;

public class CroupierBoule {

	public static void main(String[] args) {
		getNumSorti();
	
		
		
	}
	
	public static int getNumSorti() {

		List<Integer> chiffres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		for (Integer chiffre : chiffres) {
			if (chiffre == 1 || chiffre == 3 || chiffre == 7 || chiffre == 9) {
				int chiffreImpair = chiffre;
				System.out.println(chiffreImpair + " est un chiffe impair ");
			} else {
				int chiffrePair = chiffre;
				System.out.println( chiffrePair + " est un chiffe pair");
			}
		}
		
		System.out.println("--------------------------------------");
		for (Integer chiffre : chiffres) {
			if (chiffre == 1 || chiffre == 3 || chiffre == 6 || chiffre == 8) {
				int chiffreNoir = chiffre; 
				System.out.println(chiffreNoir + " est un chiffe noir ");
			}else{
				int chiffreRouge = chiffre; 
				System.out.println(chiffreRouge + " est un chiffe rouge ");
			}
		}
		
		System.out.println("--------------------------------------");
		for (Integer chiffre : chiffres) {
			if (chiffre == 1 || chiffre == 2 || chiffre == 3 || chiffre == 4) {
				int chiffreManque = chiffre; 
				System.out.println(chiffreManque + " est un chiffe manque ");
			}else if(chiffre == 6 || chiffre == 7 || chiffre == 8 || chiffre == 9){
				int chiffrePasse = chiffre; 
				System.out.println(chiffrePasse + " est un chiffe passe ");
			}else {
				int chiffreCinq = chiffre;
				System.out.println(chiffreCinq + " est un chiffe cinq ");
			}
		}
		return 0;

	}
}
