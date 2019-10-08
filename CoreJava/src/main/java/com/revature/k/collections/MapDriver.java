package com.revature.k.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.revature.e.objects.Pencil;

public class MapDriver {
	public static void main(String[] args) {
		Map<String, Pencil> pencilStore = new HashMap<String, Pencil>();
		pencilStore.put("Bic Ballpoint Pen V1", new Pencil(false, "wood", false, false, "black", 2));
		pencilStore.put("Techongeroga V2", new Pencil(false, "wood", true, false, "yellow", 5));
		pencilStore.put("Uniball", new Pencil(true, "potato", true, true, "potato", 6));

//		System.out.println(pencilStore.get("Techongeroga V2"));

		for (Entry<String, Pencil> entry : pencilStore.entrySet()) {
			System.out.println("key: " + entry.getKey() + "     value: " + entry.getValue());
		}
	}
}
