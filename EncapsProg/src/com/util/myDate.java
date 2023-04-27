package com.util;

public class myDate {
	private int day;

	private int month;

	private int year;

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month > 12) {
			this.month = 12;
		} else if (month < 1) {
			this.month = 1;
		} else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 2030) {
			this.year = 2030;
		} else if (year < 2023) {
			this.year = 2023;
		} else {
			this.year = year;
		}
	}

	public void setDay(int day) {
		this.day = day;
		if (this.year % 4 == 0) {
			if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8
					|| this.month == 10 || this.month == 12) {
				if (this.day > 31) {
					this.day = 31;
				} else if (this.day < 1) {
					this.day = 1;
				} else {
					this.day = day;
				}
			} else {
				if (this.day > 30)
					this.day = 30;
				else if (this.day < 1) {
					this.day = 1;
				} else
					this.day = day;
			}
			// Feb logic starts here
			if (this.month == 2) {
				if (this.day >= 30) {
					this.day = 29;
				} else if (this.day < 1) {
					this.day = 1;
				} else
					this.day = 1;
			}
		} else if (this.month == 2)
			this.day = 28;
		else if (this.day < 1) {
			this.day = 1;
		}

	}

	public String toString() {
		return day + "-" + month + "-" + year;
	}

}
