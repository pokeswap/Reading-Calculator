package jkeller.readingcalc;
public class calc {
	static int pagesRead,pagesInBook;
	static double timeToRead, timePerPage, mypagesPerDay, daysLeft;
	public calc(int pagesRread,int timeToRread,int pagesInBbook,int daysLleft) {
		pagesRead= pagesRread;
		pagesInBook=pagesInBbook;
		daysLeft=(double)daysLleft;
		timeToRead=(double)timeToRread;
	}

	double timePerPage() {
		timePerPage=timeToRead/pagesRead;
		System.out.println(timePerPage+" time per page");
		return timePerPage;
	}
	
	static int timePerPage(int read,int numpages) {
		return read/numpages;
	}
	
	double pagesPerDay() {
		mypagesPerDay=(double)pagesInBook/daysLeft;
		return mypagesPerDay;
	}
	
	
	static double pagesPerDay(int numpages, int left) {
		return numpages/left;
	}
	
	double calculate() {
		pagesPerDay();
		timePerPage();
		return mypagesPerDay*timePerPage;
	}
	
	static double calculate(int pagesPerDay, double timePerPage) {
		return mypagesPerDay*timePerPage;
	}


}
