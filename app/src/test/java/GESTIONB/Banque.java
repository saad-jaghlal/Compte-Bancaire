package GESTIONB;

import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.util.Map;

public class Banque {
//	private Map<String,Compte> comptes;
	private List<Compte> comptes;
	public Banque() {
//		this.comptes = new Hashtable<>();
		this.comptes= new ArrayList<>();
	}
	public int IndiceCompte(String code) {
		for(int i=0;i<comptes.size();i++) {
			if(code == comptes.get(i).getCode()) {
				return i;
			}
		}
		return -1 ;
		}
		
	public void ajouter(Compte C)throws Exception{
//		Boolean t = true;
//		for(int i=0;i<comptes.size();i++) {
//			if (comptes.get(i).getCode()==C.getCode()) {
//				t=false;
//				break;
////				return false;
//			}
//		}
//		if(t) {
//			comptes.add(C);
//		}
//		else throw new Exception("compte dija la boutique");
////		comptes.add(C);
////		return true;
		if (IndiceCompte(C.getCode())==-1) {
			comptes.add(C);
		}
		else throw new Exception("compte dija la boutique");
		}
	
	public void afficher() {
			System.out.println(comptes);
	}
	public Boolean Supprimer(String code) {
		if(IndiceCompte(code)!=-1) {
			comptes.remove(IndiceCompte(code));
			return true;
		}
		return false;
	}
	public Boolean Supprimer(Compte C) {
//		if(IndiceCompte(C.getCode())!=-1) {
//			comptes.remove(IndiceCompte(C.getCode()));
//			return true;
//		}
//		return false;
		if(Supprimer(C.getCode())) return true;
		return false;
	}
//	public String IndiceCompte(String code) {
//		if (comptes.containsKey(code)) {
//			return code;
//		}
//		return "-1";
//	}
//	public void ajouter(Compte C)throws Exception{
////		if(Integer.parseInt(IndiceCompte(C.getCode()))==-1)
//		if (!comptes.containsKey(C.getCode())){
//			comptes.put(C.getCode(),C);
//		}else throw new Exception("compte dija la boutique");
//	}
//	public void afficher() {
//		System.out.println(comptes);
//}
//public int nombreDesComptes() {
//	int count=0;
//	for(Compte C : comptes.values()) {
//		if (C instanceof CompteCourant) {
//			count++;
//		}
//		
//	}return count;
}
	
	
