package assignment.week3.day2;

public class Desktop implements HardWare,Software {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop obj=new Desktop();
		System.out.println(obj.desktopModel("notepad"));
		System.out.println(obj.hardwareResources("Keyboard"));
		System.out.println(obj.softwareResources("OS window 11"));
	}

	public String softwareResources(String softwarename) {
		return softwarename;
	}

	public String hardwareResources(String hardwarename) {
		return hardwarename;
	}

	public String desktopModel(String softwarename) {
		// TODO Auto-generated method stub
		return softwarename;
	}

	

}
