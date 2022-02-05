package com.vlad.wsh.oop;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Zwierze zwierze1 = new Zwierze(150,"Timon","kopytny",150,14,"trawa");
		Zwierze zwierze2 = new Zwierze(30,"Dori","ziemnowodny",150,"plankton");
		Zwierze zwierze3 = new Zwierze(10,"Orlen",15);
		Zwierze zwierze4 = new Zwierze("Omega",25,3,13);
		Zwierze zwierze5 = new Zwierze(15,"Itar");
		Zwierze zwierze6 = new Zwierze();

		zwierze2.setWzrost(150);
		zwierze3.setWzrost(100);
		zwierze3.setRodzajZywnosci("Korm");

		System.out.println(zwierze1);
		System.out.println(zwierze2);
		System.out.println(zwierze3);
		System.out.println(zwierze4);
		System.out.println(zwierze5);
		System.out.println(zwierze6);
	}
}
