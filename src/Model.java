import java.util.Random;

public class Model {
	private String[][] allSymbols;
	StringBuilder result;
	private int length;
	
	
	public Model() {
		this.allSymbols = new String[][]{
				{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"},
				{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"},
				{"1","2","3","4","5","6","7","8","9","0"},
				{"!","?","#",".",",","$","*","&","/"}
		};
		this.result = new StringBuilder();
		this.length = 10; // could be variable

		generatePassword();

	}
	
    private void generatePassword() {
		int upper=0, lower=0, numbers=0, symbols=0;
		int maxUpper=4, maxLower=4, maxNumbers=2, maxSymbols=2; // could be variable
		while(result.length()<length){
				int first, second;
				first = newRandom(100)%4;
				if(first==0 && upper<maxUpper){
					upper++;
					second = newRandom(allSymbols[first].length);
					result.append(allSymbols[first][second]);
				}
				if(first==1 && lower<maxLower){
					lower++;
					second = newRandom(allSymbols[first].length);
					result.append(allSymbols[first][second]);
				}
				if(first==2 && numbers<maxNumbers){
					numbers++;
					second = newRandom(allSymbols[first].length);
					result.append(allSymbols[first][second]);
				}
				if(first==3 && symbols<maxSymbols){
					numbers++;
					second = newRandom(allSymbols[first].length);
					result.append(allSymbols[first][second]);
				}
		}
    }
	
	int newRandom(int max){
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(max);
		return randomInt;
	}
	
}
