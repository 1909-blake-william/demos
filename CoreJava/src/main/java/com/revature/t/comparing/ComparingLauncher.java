package com.revature.t.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.revature.e.objects.Pencil;

public class ComparingLauncher {
	public static void main(String[] args) {
		List<Pencil> pencils = new ArrayList<Pencil>();
		pencils.add(new Pencil(true, "plastic", false, false, "pink", 0));
		pencils.add(new Pencil(true, "wood", true, false, "orange", 3));
		pencils.add(new Pencil(true, "metal", true, false, "blue", 10));
		pencils.add(new Pencil(true, "wood", false, false, "potato", 3));
		pencils.add(new Pencil(true, "copper", false, false, "blue", 8));
		pencils.add(new Pencil(false, "carbon fiber", false, false, "carbon", 3));

		Collections.sort(pencils);
		for (Pencil p : pencils) {
			System.out.println(p);
		}

		System.out.println("now by color");
//		pencils.sort(new PencilColorComparator());
//		for (Pencil p : pencils) {
//			System.out.println(p);
//		}
		pencils.sort((o1, o2) -> {
			return o1.getColor().compareTo(o2.getColor());
		});
		
		pencils.forEach((Pencil p) -> {
			System.out.println(p);
		});

	}
}
