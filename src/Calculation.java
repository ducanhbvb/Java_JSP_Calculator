public class Calculation {
    private float numberOne;
    private float numberTwo;
    private String phep;

    public Calculation() {
    }

    public Calculation(float numberOne, float numberTwo, String phep) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.phep = phep;
    }

    public float getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(float numberOne) {
        this.numberOne = numberOne;
    }

    public float getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(float numberTwo) {
        this.numberTwo = numberTwo;
    }

    public String getPhep() {
        return phep;
    }

    public void setPhep(String phep) {
        this.phep = phep;
    }

    public float count(){
        float result;
        switch (phep){
            case "summation":
                result=getNumberOne()+getNumberTwo();
                break;

            case "subtraction":
                result=getNumberOne()-getNumberTwo();
                break;
            case "multiplication":
                result=getNumberOne()*getNumberTwo();
                break;
            case "division": {
                if(getNumberTwo()!=0) {
                    result=getNumberOne()/getNumberTwo();
                    break;
                }else throw new ArithmeticException("Division number zero");
            }
            default:
                throw new ArithmeticException("not select");
        }
        return result;
    }
//    public float summation(float numberOne, float numberTwo){
//        return numberOne+numberTwo;
//    }
//    public float subtraction(float numberOne,float numberTwo){
//        return numberOne-numberTwo;
//    }
//    public float multiplication(float numberOne,float numberTwo){
//        return numberOne*numberTwo;
//    }
//    public float division(float numberOne, float numberTwo){
//        return numberOne/numberTwo;
//    }
}
