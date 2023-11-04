package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Transaction {

	Trader trader; 
	private int year; 
	private int value; 
	
	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	
	public Trader getTrader() {
		return trader;
	}


	public void setTrader(Trader trader) {
		this.trader = trader;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}

	
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(new Transaction(new Trader("Zara", "Pune"), 2022, 80000));
		transactions.add(new Transaction(new Trader("Yogesh", "Bangalore"), 2021, 50000));
		transactions.add(new Transaction(new Trader("Kanika", "Chennai"), 2011, 33000));
		transactions.add(new Transaction(new Trader("Sam", "Hyderabad"), 2011, 200000));
		transactions.add(new Transaction(new Trader("Karan", "Indore"), 2011, 80000));
		transactions.add(new Transaction(new Trader("Isha", "Delhi"), 2020, 12000));
		
		
		List<Transaction> tran = transactions.stream().filter(trans -> trans.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).collect (Collectors.toList());
		System.out.println("Transactions in the year 2011 (small to high):");
		System.out.println(tran);
		System.out.println();
		
		System.out.println("All the unique cities where the traders work:");
		List<String> uniqueCities=transactions.stream().map(Transaction::getTrader).map(Trader::getCity).distinct().collect(Collectors.toList());
		System.out.println(uniqueCities);
		System.out.println();
		
		System.out.println("All traders from Pune sorted in order:");
		List<Trader> name=transactions.stream().filter(city->city.getTrader().getCity().equals("Pune")).map(Transaction::getTrader).sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
		System.out.println(name);
		System.out.println();
		
		System.out.println("All the traders name sorted in alphabetical order:");
		String namesort=transactions.stream().map(Transaction::getTrader).sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList()).toString();
		System.out.println(namesort);
		System.out.println();
		
		System.out.println("Traders based in Indore:");
		Optional<Trader> indoreTraders = transactions.stream().filter(city -> city.getTrader().getCity() == "Indore").map(Transaction::getTrader).findAny();
		System.out.println(indoreTraders);
		System.out.println();
		
		System.out.println("Delhi Traders:");
		Optional<Transaction> delhiTraders =transactions.stream().filter(cityName->cityName.getTrader().getCity().equalsIgnoreCase("delhi")).findAny();
		System.out.println(delhiTraders.isPresent());
		System.out.println();
	
		Integer  highestTransaction = transactions.stream().collect(Collectors.groupingBy(value->value.getValue(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByKey()).get().getKey();;
		System.out.println("Transaction with Highest Value : "+highestTransaction);
		System.out.println();
		
		Integer  lowestTransaction = transactions.stream().collect(Collectors.groupingBy(value->value.getValue(),Collectors.counting())).entrySet().stream().min(Map.Entry.comparingByKey()).get().getKey();;
		System.out.println("Transaction with lowest Value : "+lowestTransaction);
		System.out.println();
		
		
	}

}
