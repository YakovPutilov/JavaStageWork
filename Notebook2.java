import java.util.Objects;

public class Notebook2 {
    private String id;
    private int procFreq;
    private int ram;
    private int hddCapac;
    private String opSys;

    public Notebook2(String id, int procFreq, int ram, int hddCapac, String opSys){
        this.id = id;
        this.procFreq = procFreq;
        this.ram = ram;
        this.hddCapac = hddCapac;
        this.opSys = opSys;
        
    }
    public String getId(){
        return id;
    }
    public int getProcFreq(){
        return procFreq;
    }
    public int getRam(){
        return ram;
    }
    public int getHddCapac(){
        return hddCapac;
    }
    public String getOpSys(){
        return opSys;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setProcFreq(int procFreq){
        this.procFreq = procFreq;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public void setHddCapac(int hddCapac){
        this.hddCapac = hddCapac;
    }
     public void setOpSys(String opSys){
        this.opSys = opSys;

    }
    @Override
    public String toString(){

        return ("ID: " + id + ", FREQ: " + procFreq + ", RAM: " + ram + ", HDD: " + hddCapac + ", OS: " + opSys);
    }
    @Override
    public boolean equals(Object o){
        if (this == o ) return true;
        if (o == null ||getClass() != o.getClass()) return false;
        Notebook2 note = (Notebook2) o;
        return procFreq == note.procFreq && Objects.equals(id, note.id);

        
    }

}

