class v23{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	System.out.print(vrow);
	for(int vcol=1;vcol<=7-vrow;vcol++) {
	System.out.print("*");	
	}
	for(int vcol=2;vcol<=vrow;vcol++) {
	System.out.print(" ");	
	}
	System.out.print(vrow);
	System.out.println("");
}
}
}