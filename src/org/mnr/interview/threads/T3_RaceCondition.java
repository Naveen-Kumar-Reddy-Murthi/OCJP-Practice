package org.mnr.interview.threads;

public class T3_RaceCondition {

	public static void main(String[] args) {
		T3_RaceCondition r = new T3_RaceCondition();
		
		TicketBooking p1 = r.new TicketBooking();

		new Thread(p1,"Person1").start();
		new Thread(p1,"Person2").start();

	}
	
	class TicketBooking implements Runnable{
		private int totalTickets=1;
		

		@Override
		public synchronized void  run() {
			
			/**
			 * here removed synchronized keyword on method to observer race codition
			 * data will be inconsistent
			 */
			
//			System.out.println("Waiting to book tickets for "+ this.name);
			
			if(totalTickets>0){
				
				System.out.println(Thread.holdsLock(this));
				
//				System.out.println("Tickets booking for "+ Thread.currentThread().getName());
				
				try{
					Thread.sleep(1000);
				}
				catch(Exception e){}
				
				totalTickets--;
				System.out.println("Tickets Booked for "+ Thread.currentThread().getName());
				System.out.println("Available tickets :"+totalTickets);
			}
			else
				System.out.println("Tickets are not available to book for "+ Thread.currentThread().getName());
			
		}
		
	}

}
