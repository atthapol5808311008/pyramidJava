class v28{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	for(int vcol=5;vcol>=vrow;vcol--) {
	System.out.print(vcol);
	}
	for(int vcol=1;vcol<=vrow;vcol++) {
	System.out.print(" ");
	}
	for(int vcol=2;vcol<=vrow;vcol++) {
	System.out.print(" ");
	}
	for(int vcol=vrow;vcol<=5;vcol++) {
	System.out.print(vcol);
	}
	System.out.println("");
}
}
}