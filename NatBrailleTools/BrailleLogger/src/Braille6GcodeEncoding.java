import java.awt.Point;
import java.util.ArrayList;

/**
 * 
 */
  
/**
 * @author lenovo
 *
 */
public class Braille6GcodeEncoding implements BrailleGcodeEncoding {
	private static final BrailleGcodeDot[] dot =  new BrailleGcodeDot[] {
		new BrailleGcodeDot('a', new int[] {1}),
		new BrailleGcodeDot('b', new int[] {1,2}),
		new BrailleGcodeDot('c', new int[] {1,4}),
		
		
		new BrailleGcodeDot('d', new int[]{1,4,5}),
		new BrailleGcodeDot('e', new int[] {1,5}),
		new BrailleGcodeDot('f', new int[]{1,2,4}),
		new BrailleGcodeDot('g', new int[]{1,2,4,5}),
		new BrailleGcodeDot('h', new int[]{1,2,5}),
		new BrailleGcodeDot('i', new int[]{2,4}),
		new BrailleGcodeDot('j', new int[]{2,4,5}),
		new BrailleGcodeDot('k', new int[]{1,3}),
		new BrailleGcodeDot('l', new int[]{1,2,3}),
		new BrailleGcodeDot('m', new int[]{1,3,4}),
		new BrailleGcodeDot('n', new int[]{1,3,4,5}),
		new BrailleGcodeDot('o', new int[]{1,3,5}),
		new BrailleGcodeDot('p', new int[]{1,2,3,4}),
		new BrailleGcodeDot('q', new int[]{1,2,3,4,5}),
		new BrailleGcodeDot('r', new int[]{1,2,3,5}),
		new BrailleGcodeDot('s', new int[]{2,3,4}),
		new BrailleGcodeDot('t', new int[]{2,3,4,5}),
		new BrailleGcodeDot('u', new int[]{1,3,6}),
		new BrailleGcodeDot('v', new int[]{1,2,3,6}),
		new BrailleGcodeDot('w', new int[]{2,4,5,6}),
		new BrailleGcodeDot('x', new int[]{1,3,4,6}),
		new BrailleGcodeDot('y', new int[]{1,3,4,5,6}),
		new BrailleGcodeDot('z', new int[]{1,3,5,6}),
		
		new BrailleGcodeDot(' ', new int[]{}),
		new BrailleGcodeDot('.', new int[]{2,5,6}),
		new BrailleGcodeDot(',', new int[]{2}),
		new BrailleGcodeDot('?', new int[]{2,6}),
		new BrailleGcodeDot(';', new int[]{2,3}),
		new BrailleGcodeDot(',', new int[]{2,4}),
		new BrailleGcodeDot('!', new int[]{2,3,5}),
		new BrailleGcodeDot('(', new int[]{2,3,6}),
		new BrailleGcodeDot(')', new int[]{3,5,6}),
		new BrailleGcodeDot('\'', new int[]{3}),
		new BrailleGcodeDot('-', new int[]{3,6}),
		new BrailleGcodeDot('/', new int[]{3,4}),
		new BrailleGcodeDot('*', new int[]{3,5}),
		new BrailleGcodeDot('+', new int[]{2,3,5}),
		new BrailleGcodeDot('=', new int[]{2,3,5,6}),
		new BrailleGcodeDot('0', new int[]{3, 4, 5, 6}),
		new BrailleGcodeDot('1', new int[]{1, 6}),
		new BrailleGcodeDot('2', new int[]{1, 2, 6}),
		new BrailleGcodeDot('3', new int[]{1, 4, 6}),
		new BrailleGcodeDot('4', new int[]{1, 4, 5, 6}),
		new BrailleGcodeDot('5', new int[]{1, 5, 6}),
		new BrailleGcodeDot('6', new int[]{1, 2, 4, 6}),
		new BrailleGcodeDot('7', new int[]{1, 2, 4, 5, 6}),
		new BrailleGcodeDot('8', new int[]{1, 2, 5, 6}),
		new BrailleGcodeDot('9', new int[]{2, 4, 6}),
		
		new BrailleGcodeDot('à', new int[]{1, 2, 3,5, 6}),
		new BrailleGcodeDot('â', new int[]{1, 6}),
		new BrailleGcodeDot('ç', new int[]{1,2, 3, 4, 6}),
		new BrailleGcodeDot('è', new int[]{2, 3, 4, 6}),
		new BrailleGcodeDot('é', new int[]{1, 2, 3, 4, 5, 6}),
		new BrailleGcodeDot('ê', new int[]{1, 2, 6}),
		new BrailleGcodeDot('ë', new int[]{1, 2, 4, 6}),
		new BrailleGcodeDot('î', new int[]{1, 4, 6}),
		new BrailleGcodeDot('ï', new int[]{1,2, 4, 5, 6}),
		new BrailleGcodeDot('ù', new int[]{2, 3, 4, 5, 6}),
		new BrailleGcodeDot('û', new int[]{1, 5, 6}),
		new BrailleGcodeDot('ü', new int[]{1, 2, 5, 6}),
		
		new BrailleGcodeDot('¨', new int[]{4, 6}), // Majuscule NatBraille
		new BrailleGcodeDot('`', new int[]{6}), // Chiffres NatBraille
		new BrailleGcodeDot('\"', new int[]{2, 3, 5, 6}) // Chiffres NatBraille
			 
	};
	
	private final int  nrow = 2; // number of row in braille encoding
	private final int  nline = 3; // number of line in braille encoding
		
	
	
	
	public Braille6GcodeEncoding() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see BrailleGodeEncoding#GetCharacterDots(char)
	 */
	@Override
	public ArrayList<Point> GetCharacterDots(char a) {
		//TODO make this fast
		
		for (int i =0; i < dot.length;i++)
		{
			if (dot[i].getCar() == a)
			{
				ArrayList<Point> Braille = new ArrayList<Point>();
				for (int d = 0; d < dot[i].getPos().length; d++) 
				{
					int x = dot[i].getPos()[d] <= nline ? 0 : 1;
					int y = dot[i].getPos()[d] <= nline ? dot[i].getPos()[d] - 1 : dot[i].getPos()[d] - 1 - nline;
					
					Braille.add(new Point(x,y));
				}
				
				return Braille;
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see BrailleGodeEncoding#getNRow()
	 */
	@Override
	public int getNRow() {
		return nrow;
	}

	/* (non-Javadoc)
	 * @see BrailleGodeEncoding#getNline()
	 */
	@Override
	public int getNline() {
		return nline;
	}

}
