public class BarCode { //implements Comparable
// instance variables
   private String _zip;
   private int _checkDigit;

// global variables
private static final String[] codeMap = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};

// constructors
//precondtion: zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
public BarCode(String zip) {
	//No need to check for precondition since we throw runtime exception
	_zip = zip;
	_checkDigit = checkSum();
}

// postcondition: Creates a copy of a bar code.
public BarCode(BarCode x){
	_zip = x._zip;
	_checkDigit = x._checkDigit;
}

//post: computes and returns the check sum for _zip
private int checkSum(){
	int regularSum = 0;
	for (int i = 0; i < _zip.length(); i++){
		regularSum += (int)(_zip.charAt(i) - '0');
	}
	return regularSum % 10;
}

//postcondition: format zip + check digit + barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
public String toString(){
	String checkedZip = _zip + _checkDigit;
	String symbolicCode = "";
	for (int i = 0; i < checkedZip.length(); i++){
		symbolicCode += codeMap[(int)(checkedZip.charAt(i) - '0')];
	}
	return checkedZip + "\t" + symbolicCode;
}


public boolean equals(Object other){
	return this == other || (other instanceof BarCode && toString().equals(other.toString()));
}
// postcondition: false if the object is not a BarCode, 
// false if it is a non-matching barcode
// true when they match.

/*
public int compareTo(Comparable other){

}
// postcondition: compares the zip + checkdigit 
*/
}