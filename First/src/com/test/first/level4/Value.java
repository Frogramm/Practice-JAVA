package com.test.first.level4;

public class Value{
	
		private int val;
		
		public Value(int val) {
			this.val = val;
		}
		public int getVal() {
			return val;
		}
		@Override
		public boolean equals(Object obj) {
			Value objValue = (Value)obj;
			if(this.val == objValue.getVal()) {
				return true;
			}
			else return false;
		}
		@Override
		public String toString() {
			return String.valueOf(this.val); //valueOf -> String으로 return 해줌.
		}
	}
