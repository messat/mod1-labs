package lab3BCars;

//factory class used to generate number plate from the array
public class RegistrationPlateFactory {
	//reg index fetches a number from the array using index value
	static int regIndex = 0;
	
	private static String[] registrationPlates = {
			 "LA05 XYZ", // London 
			 "NG58 JKL", // Nottingham 
			 "MA13 HYP", // Manchester 
			 "BX06 TUV", // Birmingham 
			 "CF67 QRS", // Cardiff 
			 "YS09 PQR", // Yorkshire 
			 "WD21 NML", // Exeter area (Western region)
			 "KR16 FGH", // Northampton
			 "SJ04 UVW", // Glasgow 
			 "LV22 ABC", // Liverpool
			 "WX19 XYZ"  // Bristol 
			};
	
	//returns an instance of RegistrationPlate object instance
	public static RegistrationPlate getNextRegistrationPlate() {
			//declares the creation of object to instantiate a registration plate .
			RegistrationPlate reg = new RegistrationPlate();
			reg.setNumber(registrationPlates[regIndex]);
			System.out.println(registrationPlates[regIndex]);
			regIndex++;
			return reg;
		
	}

}
