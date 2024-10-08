package conditional;

public class DoWhile {

	public static void main(String[] args) {

		String name = "tom";
		String password = "tiger";

		int count = 0;

		do {

			if (count == 1) {

				break;
			}

			count++;

			System.out.println("Welcome to Facebook Login Page");

		} while (validate(name, password));

	}

	public static boolean validate(String name, String password) {

		boolean flag = false;

		if (name.equals("javeed") && password.equals("tiger")) {

			System.out.println("Login success , Welcome to Dashboard");

			flag = true;

		} else {

			System.err.println("Invalid credentials");
		}

		return flag;

	}

}
