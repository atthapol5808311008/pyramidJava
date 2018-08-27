class v13{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	for(int vcol=2;vcol<=vrow;vcol++) {
	System.out.print("  ");
	}
	for(int vcol=11;vcol>=11;vcol--){
	System.out.print(vcol-vrow-vrow);
	}
	for(int vcol=10;vcol>=6+vrow;vcol--){
	System.out.print(vcol-vrow-vrow);
	}
	for(int vcol=5;vcol>=1+vrow;vcol--){
	System.out.print(vcol-vrow);
	}
	System.out.println("");
}
}
}