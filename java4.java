class v4{
public static void main (String args[]){
for(int vrow=1;vrow<=4;vrow++) {
	for(int vcol=1;vcol<=vrow;vcol++) {
	System.out.print("*");
	}
	for(int vcol=vrow;vcol>=2;vcol--){
	System.out.print(vcol);
	}
	for(int vcol=1;vcol<=vrow;vcol++){
	System.out.print(vcol);
	}
	System.out.println ("");
}
}
}
