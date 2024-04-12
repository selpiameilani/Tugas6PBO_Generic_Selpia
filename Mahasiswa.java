
package mahasiswa;

public class Mahasiswa<T, U, V> {
    private T nim;
    private U name;
    private V clas;
    
    public T getnim() {
        return nim;
    }
    
    public void setnim(T nim) {
        this.nim = nim;
    }
    
    public U getname() {
        return name;
    }
    
    public void setname (U name) {
        this.name = name;
    }
    
    public V getclas () {
        return  clas ;
    }
    
    public void setclas ( V clas) {
        this.clas = clas;
    }
    
    public static void main(String[] args) {
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setnim("1102020");
        m.setname("Ferdi");
        m.setclas(21);
        
        System.out.println(m.getnim());
        System.out.println(m.getname());
        System.out.println(m.getclas());
    }
}
