package net.finra.assess.domain;

import java.util.List;

public class Combinations {
	
	private long total;
	private List<String> combinations;
	private long numPages;
	
	public Combinations(long total, List<String> combinations, long numPages) {
		this.total = total;
		this.combinations = combinations;
		this.numPages = numPages;
	}

	public Combinations(long total, long numPages) {
		this.total = total;
		this.numPages = numPages;
	}

	public Combinations() {}

	@Override
	public String toString() {
		return "Combinations [total=" + total + ", combinations="
				+ combinations + ", numPages=" + numPages + "]";
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<String> getCombinations() {
		return combinations;
	}

	public void setCombinations(List<String> combinations) {
		this.combinations = combinations;
	}

	public long getNumPages() {
		return numPages;
	}

	public void setNumPages(long numPages) {
		this.numPages = numPages;
	}
	
}
