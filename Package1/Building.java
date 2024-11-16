package Package1;

public class Building {

	private int lengthoftheplot;
	private int breathoftheplot;

	public Building(int lengthoftheplot , int breathoftheplot) {
		super();
		this.lengthoftheplot = lengthoftheplot;
		this.breathoftheplot = breathoftheplot;
	}

	public int getLengthoftheplot() {
		return lengthoftheplot;
	}

	public void setLengthoftheplot(int lengthoftheplot) {
		this.lengthoftheplot = lengthoftheplot;
	}

	public int getBreathoftheplot() {
		return breathoftheplot;
	}

	public void setBreathoftheplot(int breathoftheplot) {
		this.breathoftheplot = breathoftheplot;
	}


   
    public int calculateSquareFeet(int length, int breadth) {
        return length * breadth;
    }

    
    public double calculateDaysRequired(int squareFeet) {
        int constructionRatePerDay = 20; 
        return ( squareFeet / constructionRatePerDay);
    }

    
    public int calculateConstructionCost(int squareFeet) {
        int costPerSquareFoot = 3200; 
        return squareFeet * costPerSquareFoot;
    }

    
    public int calculateMaterialCost(int squareFeet) {
        int materialCostPerSquareFoot = 2000; 
        return squareFeet * materialCostPerSquareFoot;
    }

    public int calculateTotalCost(int constructionCost, int materialCost) {
        return constructionCost + materialCost;
    }
    public int findTotalCost(int squareFeet)
    {
		return (calculateConstructionCost(squareFeet)+calculateMaterialCost(squareFeet));
    	
    }


}
