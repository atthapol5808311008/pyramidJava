class v18{
public static void main (String args[]){
int vcol;
for(int vrow=1;vrow<=5;vrow++) {
	for(vcol=vrow;vcol<=vrow;vcol++) {
	System.out.print(vcol);	
	}
	for(vcol=1;vcol<=vrow;vcol++) {
	System.out.print(" ");
	}
	System.out.print(vcol-1);
	for(vcol=1;vcol<=6-vrow;vcol++) {
	System.out.print(" ");
	}
	System.out.print(vcol+3);
	System.out.println("");
}
}
}