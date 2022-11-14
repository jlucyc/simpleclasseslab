public class Printer {
    public int sheetCount;

    public Printer(int sheetCount){
        this.sheetCount = sheetCount;
    }
    public int getPaper(){
        return this.sheetCount;
    }
}
