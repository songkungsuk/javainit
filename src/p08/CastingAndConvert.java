package p08;

class Desktop {
	
}

class Window extends Desktop{
	
}

class Mouse {
	
}

public class CastingAndConvert {
	public static void main(String[] args) {

		Desktop desk = new Window();
		Desktop d = (Desktop) desk;
	}
}
