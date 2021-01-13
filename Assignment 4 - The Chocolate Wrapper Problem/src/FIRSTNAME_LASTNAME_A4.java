//INCLUDE A PREAMBLE COMMENT

// You should change the name of this so it corresponds to your actual name
// In order to do this, you should right click on your project in the Package Explorer
// Refactor > Rename

// This class should extend the ChocolateProblem class
// All of your work should be isolated to this class. Mr. P will not look at other classes
// or call any methods other than this.solveProblem(). You must ensure that calling this
// method will complete the calculation, and print an appropriate print statement.

public class FIRSTNAME_LASTNAME_A4 extends ChocolateProblem {
	// Your variables can be public for this assignment (no setters/getters needed)
	// You may add variables as you see fit
	public int initialMoney;
	public int barCost;
	public int exchangeWrappers;

	// You may add to this constructor, but do not change its method signature aside
	// from changing the name of the class (e.g. don't add more parameters).
	
	public FIRSTNAME_LASTNAME_A4(int iM, int bC, int eW) {
		this.initialMoney = iM;
		this.barCost = bC;
		this.exchangeWrappers = eW;
	}

	public void solveProblem() {
		// You must call your Recursive function inside of a print statement here
		// This should automatically update if you update the name of your class
		// You may wish to add parameter(s) to your recursive function
		// Mr. P will be calling this method to check your output, so it must be
		// precise.
		// This should be the ONLY output when running this method (no test print
		// statements, etc)

		System.out.println(this.getClass().getSimpleName() + ": " + recursionStep());
	}

	// You may customize this recursive function as you see fit, including its name,
	// method signature, etc.
	// This will be where you implement your algorithm to solve the Chocolate
	// Wrapper Problem.
	public int recursionStep() {
		// return 0 is only here as a placeholder - you'll likely want to change this.
		return 0;
	}
}
