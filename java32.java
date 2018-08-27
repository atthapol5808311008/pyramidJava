class v32{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	for(int vcol=1;vcol<=8-vrow;vcol++) {
	System.out.print(vcol);	
	}
	for(int vcol=1;vcol<=2+vrow;vcol++) {
	System.out.print(" ");	
	}
	System.out.print(vrow+2);
	System.out.println("");
}
}
}