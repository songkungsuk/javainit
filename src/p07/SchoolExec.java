package p07;

class fa{
	int a;
	
	public void printdasd(int a) {
		System.out.println(this.a);
	}
}
class fa2{
	int a;
	
	public void printdasd(int a) {
		System.out.println(this.a);
	}
}

class fa3{
	int a;
	
	public void printdasd(int a) {

		System.out.println(this.a);
		
	}
}


public class SchoolExec {
		
	public static void main(String[] args) {

		School object = new MiddleSchool();
		MiddleSchool m = (MiddleSchool)object;
		
		School middle = new MiddleSchool();
		School high = new HighSchool();
		School school = new School();
		
		school.name = "학교";
		middle.name = "양주";
		high.name = "양주";
		
		School[] schools = new School[3];
		schools[0] = school;
		schools[1] = middle;
		schools[2] = high;
		
		for(int i=0; i<schools.length; i++) {
			System.out.print(schools[i].name);
			if(schools[i] instanceof MiddleSchool) {
				
				MiddleSchool ms = (MiddleSchool)schools[i];
				ms.studentType = "middleSchool";
				System.out.println(ms.studentType);
				
			}else if (schools[i] instanceof HighSchool) {
				
				HighSchool hs = (HighSchool)schools[i];
				hs.studentType = "HighSchool";
				System.out.println(hs.studentType);
				
			} else {
				System.out.println();
			}
				
			
		}
		
	
	}
}
