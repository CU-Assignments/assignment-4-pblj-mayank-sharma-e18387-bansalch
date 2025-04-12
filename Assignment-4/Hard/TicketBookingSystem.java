
#  Hard Level: Ticket Booking System with Multithreading

---

##  Problem Statement

Develop a ticket booking system using synchronized threads to:
- Prevent double booking
- Prioritize VIP bookings

---

##  Key Concepts Used

- Multithreading – For handling booking requests simultaneously
- Synchronization – To ensure booking is thread-safe
- Thread Priorities – To handle VIP vs regular bookings

---

##  How to Run

1. Navigate to the `Hard/` folder.
2. Compile and run the file:
```bash
javac TicketBookingSystem.java
java TicketBookingSystem
```
3. Observe how synchronization and thread priorities affect execution.

---

Ticket Booking System with Multithreading(examples)


Initial available seats: 10

Thread: VIP_1 trying to book 3 seats.
Seats booked by VIP_1. Remaining seats: 7

Thread: VIP_2 trying to book 4 seats.
Seats booked by VIP_2. Remaining seats: 3

Thread: Regular_1 trying to book 2 seats.
Seats booked by Regular_1. Remaining seats: 1

Thread: Regular_2 trying to book 2 seats.
Not enough seats for Regular_2. Remaining seats: 1

---
