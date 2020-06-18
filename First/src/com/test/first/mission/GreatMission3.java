package com.test.first.mission;

public class GreatMission3 {
	   public static void main(String[] args) {
	      /*영어합계 : ? , 평균 : ?
	       *수학합계 : ? , 평균 : ?
	       *국어합계 : ? , 평균 : ?
	       *전체합계 : ? , 평균 : ?
	       */
	      int guamok = 3;
	      int[][] arr = {
	            {10,100,88}, //영어
	            {34,99,45}, //수학
	            {98,65,87} //국어
	      };
	      int total = 0;
	      String[] clsArr = {"영어", "수학", "국어","전체"};
	      int[] avg = new int[guamok];
	      int[] hap = new int[guamok];
	      for(int i = 0 ; i < arr.length ; i++) {
	         for(int z = 0 ; z < arr.length ; z++) {
	            hap[i] += arr[i][z]; // 과목별 합계
	            avg[i] = (int)hap[i]/guamok;
	         }
	         System.out.printf("%s합계 : %d , 평균 : %d\n",clsArr[i] , hap[i], avg[i]);
	         total +=hap[i];
	      }
	      System.out.printf("%s합계 : %d , 평균 : %d\n",clsArr[guamok] , total, (int)total/guamok);
	   }
	}
