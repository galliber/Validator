import java.util.Scanner;

public class Main 
{
	public static void main(String[]args)
	{
		printIntroduction();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name.(It has to start with a capital letter and contain only letters and spacess)");
		System.out.println("It also must be between 8 and 50 characters long. :");
		String name=sc.nextLine();
		
		System.out.println("Enter your email:");
		String email=sc.nextLine();
		
		System.out.println("Enter your Facility Key.(it has to look like this : 12-345):");
		String facilityKey=sc.nextLine();
		
		System.out.println("Enter your EGN.(Must contain 10 numbers written together):");
		String EGN=sc.nextLine();
		
		User user1=new User(name, email, facilityKey, EGN);
	}
	public static void printIntroduction()
	{
		System.out.println("This program will ask you to enter your information and after");
		System.out.println("that, it will tell you if the information is correct or not.\n\n");
	}
	/*�� ������� ������� ��������� � ���� �� �� �������� ���� ������� 
	�� �������� ��������, �� �� �������� ����, �� �� �� ������� 
	��� ����� ��� ������� �� �������� ��������, � ��� �� ��, �� �� �� �������.������, ������� ��, �� � ���� ���� ����.
	���������� ����� ��� ������ - ������������ �����. 
	������������ ����� �� ����� �� ������ � ����, �� ������ ��� ������ ��������
	���� ��� ������� �� ������� �����, �� � email-������� ���� � ������ ������ �� �������� �� �.
	������ email-������� � ������ �������� �������, �� ���� �� � ������, ������� �� �� �����. */
}
