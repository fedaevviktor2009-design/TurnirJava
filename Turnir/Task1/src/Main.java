void main(String[] args) {
    CalculateFunction call = new CalculateFunction(4);
    CalculateFunction call1 = new CalculateFunction(5, 6);
    CalculateFunction call2 = new CalculateFunction(2, 2, 3);
    System.out.println("y = 3x + 5 = " + call.linerFunction());
    System.out.println("y = (a+b)/(a-b) = " + call1.divisionFunction());
    System.out.println("y = (ax/b)! = " + call2.factorialFunction());
}

