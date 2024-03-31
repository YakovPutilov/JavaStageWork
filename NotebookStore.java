import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class NotebookStore {
    public static void main(String[] args) {
        Notebook2 note1 = new Notebook2("RSTE", 1500, 8, 64, "Win10");
        Notebook2 note2 = new Notebook2("YUiK", 1700, 256, 128, "Linx");
        Notebook2 note3 = new Notebook2("OP3Oi", 1900, 32, 64, "Win10");
        Notebook2 note4 = new Notebook2("UtRRQ", 2400, 128, 512, "macOS");

        // System.out.println(note1);
        // System.out.println(note2);
        // System.out.println(note3);
        // System.out.println(note4);
        HashSet<Notebook2> noteHashSet = new HashSet<>(Arrays.asList(note1, note2, note3, note4));
        for (Notebook2 note : noteHashSet){
            System.out.println(note);
        }
        HashMap<Integer, Integer> searchParams = searchParamsHashMap();
        System.out.println(searchParams);
        
        HashMap<Integer, String> opSysMap = new HashMap<>();
        opSysMap.put(1, "Win10");
        opSysMap.put(2, "macOS");
        opSysMap.put(3, "Linx");

        boolean flag = false;
        for (Notebook2 note : noteHashSet){
            if (note.getProcFreq() >= searchParams.get(1) && note.getRam() >= searchParams.get(2) && note.getHddCapac() >= searchParams.get(3)){
                if (note.getOpSys().equals(opSysMap.get(searchParams.get(4))) || searchParams.get(4) == 0) {
                    System.out.println(note.getId());
                    flag = true;
                }
            }
            
        }
        if (!flag) System.out.println("not founded");
    }
    public static int requestParamType() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input parameter type:\n 1: proc frequency \n 2: RAM capacity \n 3: HDD capacity \n 4: OperationSystem \n For complite input 0");    
        int type = scanner.nextInt();
        return type;
    }
    public static int requestParamSize() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input parameter size \n for OperatonSystem type input\n 1: Win10 \n 2: macOS \n 3: Linx");    
        int size = scanner.nextInt();
        return size;
    }
    public static HashMap<Integer, Integer> searchParamsHashMap() {
        HashMap<Integer, Integer> resHashMap = new HashMap<>();
        for (int i = 1; i < 5; i++) {
            resHashMap.put( i, 0);
        }
        
        int type = -1;
        while (type != 0) {
            type = requestParamType();
            if (type > 0 && type < 5) {
                resHashMap.put(type, requestParamSize());
            }
        }
        
        return resHashMap;

    }
    
}
