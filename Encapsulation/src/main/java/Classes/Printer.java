package Classes;

public class Printer {
    private int tonerLevel;//private encapsulation
    private int pagesPrinted;//private encapsulation
    private final boolean duplex;//private encapsulation
    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel <0 || tonerLevel > 100){
            this.tonerLevel = -1;
        }else{
            this.tonerLevel = tonerLevel;
        }
        this.duplex=duplex;
        this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount <=0 || tonerAmount >= 100){
            return -1;
        }
        if(tonerAmount + tonerAmount>100) {
            return -1;
        }
        this.tonerLevel += tonerAmount;
        return tonerLevel;


    }
    public int printPages(int pages){
        if(duplex){
            int pagesToPrint=pages/2;
            if(pages%2!=0){
                this.pagesPrinted+=pagesToPrint+1;
                return pagesToPrint+1;
            }
            this.pagesPrinted+=pagesToPrint;
            return pagesToPrint;
        }
        else {
            this.pagesPrinted += pages;
            return pages;
        }
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }

}
