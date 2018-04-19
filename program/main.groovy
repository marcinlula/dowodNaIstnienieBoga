​1:


2:
String heloWorld() {
}

heloWorld();​

3: 

​String heloWorld() {
    System.out.println("Helo World!");
}

heloWorld();​

4: 

​String heloWorld() {
    if( Math.random() <= 0.5 ) {
        System.out.println("Helo World!");
    } else {
        System.out.println( "Goodnight World" );
    }
}

heloWorld();​

5:

​String heloWorld(double arg) {
    if( Math.random() <= arg ) {
        System.out.println("Helo World!");
    } else {
        System.out.println( "Goodnight World" );
    }
}

double zaangazowanie = 0.1;
heloWorld(zaangazowanie);
​
