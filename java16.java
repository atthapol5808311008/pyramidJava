class v16{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	
	for(int vcol=vrow;vcol>=1;vcol--){
		System.out.print(vcol);
	}

	for(int vcol=1;vcol<=5-vrow;vcol++){
		System.out.print("  ");
	}

	for(int vcol=vrow;vcol>=1;vcol--){
		System.out.print("*");
	}

	System.out.println("");
}
}
}