class v10{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	for(int vcol=1;vcol<=5-vrow;vcol++) {
	System.out.print(" ");
	}
	for(int vcol=1;vcol<=vrow;vcol++){
	System.out.print(vcol);
	}
	for(int vcol=vrow;vcol<=vrow;vcol++){
	System.out.print(6-vrow);
	}
	for(int vcol=vrow;vcol>=1;vcol--){
	System.out.print(vcol);
	}
	System.out.println("");
}
}
}