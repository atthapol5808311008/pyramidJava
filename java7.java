class v7{
public static void main (String args[]){
for(int vrow=1;vrow<=7;vrow++) {
	for(int vcol=0;vcol<=7-vrow;vcol++) {
	System.out.print(" ");
	}
	for(int vcol=1;vcol<=1;vcol++){
	System.out.print(vcol);
	}
	for(int vcol=3;vcol<=1+vrow;vcol++){
	System.out.print(vcol-1);
	}
	System.out.print(vrow);
	for(int vcol=vrow;vcol>=1;vcol--){
	System.out.print(vcol);
	}
	System.out.println("");
}
}
}