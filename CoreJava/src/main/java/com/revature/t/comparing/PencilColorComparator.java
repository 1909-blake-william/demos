package com.revature.t.comparing;

import java.util.Comparator;

import com.revature.e.objects.Pencil;

public class PencilColorComparator implements Comparator<Pencil> {

	@Override
	public int compare(Pencil o1, Pencil o2) {
		return o1.getColor().compareTo(o2.getColor());
	}

}
