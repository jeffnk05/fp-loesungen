package io.fp.nextday;

public enum Month {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER,
	NOVEMBER, DECEMBER;


	public Month getNextMonth() {
		return values()[(ordinal() +1) % values().length];
	}
}
