import java.util.ArrayList;
import java.util.Scanner;

class Human {
    protected String nik;
    protected String name;
    protected String jenis_kelamin;

    public Human() {
        this.nik = "";
        this.name = "";
        this.jenis_kelamin = "";
    }

    public Human(String nik, String name, String jenis_kelamin) {
        this.nik = nik;
        this.name = name;
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getNik() {
        return this.nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJenisKelamin() {
        return this.jenis_kelamin;
    }

    public void setJenisKelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
}

class Temp extends Human {
    protected String nim;
    protected String prodi;
    protected String fakultas;

    public Temp() {
        super();
        this.nim = "";
        this.prodi = "";
        this.fakultas = "";
    }

    public Temp(String nik, String name, String jenis_kelamin, String nim, String prodi, String fakultas) {
        super(nik, name, jenis_kelamin);
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}

class SivitasAkademik extends Temp {
    protected String asal_univ;
    protected String email;

    public SivitasAkademik() {
        super();
        this.asal_univ = "";
        this.email = "";
    }

    public SivitasAkademik(String nik, String name, String jenis_kelamin, String nim, String prodi, String fakultas, String asal_univ, String email) {
        super(nik, name, jenis_kelamin, nim, prodi, fakultas);
        this.asal_univ = asal_univ;
        this.email = email;
    }

    public String getAsalUniv() {
        return this.asal_univ;
    }

    public void setAsalUniv(String asal_univ) {
        this.asal_univ = asal_univ;
    }

    public String getEmail() {
        return this.email;
    }

    public void setemail(String email)
    {
        this.email = email;
    }
}
class Main
{
    public static void main(String [] args)
    {
        ArrayList<SivitasAkademik> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int no = 0;
        do
        {

            System.out.print("=MENU INPUT=\n");
            System.out.print("NIK       : ");
            String nik = sc.next();
            if(nik.equals("N"))
            {
                break;
            }
            System.out.print("NAMA      : ");
            String name = sc.next();
            System.out.print("JENIS KELAMIN : ");
            String jenis_kelamin = sc.next();
            System.out.print("NIM       : ");
            String nim = sc.next();             
            System.out.print("Prodi     : ");
            String prodi = sc.next();
            System.out.print("Fakultas  : ");
            String fakultas = sc.next();
            System.out.print("Asal Univ  : ");
            String asal_univ = sc.next();
            System.out.print("Email     : ");
            String email = sc.next();
            System.out.println();

            list.add(new SivitasAkademik(nik, name, jenis_kelamin,nim, prodi, fakultas,asal_univ,email));
           
            System.out.println("=================================================================================================================================");
            System.out.println("|   NIK   |      Name      |     Jenis Kelamin     |   nim    |     Prodi     |     fakultas     |     Asal     |     Email     |");
            System.out.println("=================================================================================================================================");
            for (int i=0;i<list.size();i++) {
            // System.out.println(e);
                System.out.printf("|%-9s|%-16s|%-23s|%-10s|%-15s|%-18s|%-14s|%-15s|\n", list.get(i).getNik(), list.get(i).getName(), list.get(i).getJenisKelamin(),list.get(i).getNim(),list.get(i).getProdi(),list.get(i).getFakultas(),list.get(i).getAsalUniv(),list.get(i).getEmail());

            }
            System.out.println("=================================================================================================================================");
            System.out.println();
            
        }while(no<10);
        
    }
    // static void displayMenu()
    // {
    //     System.out.println("1. Input Data");
    //     System.out.println("2. Show Data");
    //     System.out.println("3. Delete Data");
    //     System.out.println("4. Edit Data");
    //     System.out.println("5. Exit");
    // }

    // public static void main(String [] args)
    // {
        
    //     ArrayList<Temp> list = new ArrayList<>();
    //     Scanner sc = new Scanner(System.in);
    //     Scanner sc1 = new Scanner(System.in);
    //     // ArrayList<String> array = new ArrayList<String>();
    //     int tc = 0;

    //     do
    //     {
    //         displayMenu();
    //         System.out.print("Your Choice : ");
    //         tc = sc1.nextInt();

    //         if(tc == 1)
    //         {
    //             System.out.print("=MENU INPUT=\n");
    //             System.out.print("NIM       : ");
    //             String nim = sc.next();
    //             System.out.print("Name      : ");
    //             String name = sc.next();
    //             System.out.print("Prodi     : ");
    //             String prodi = sc.next();
    //             System.out.print("Fakultas  : ");
    //             String fakultas = sc.next();
    //             System.out.println();

    //             list.add(new Temp(nim, name, prodi, fakultas));
    //         }
    //         else if (tc == 2)
    //         {
    //             System.out.println("================================================================");
    //             System.out.println("|   nim    |      Name      |     Prodi     |     fakultas     |");
    //             System.out.println("================================================================");
    //             for (int i=0;i<list.size();i++) {
    //                 // System.out.println(e);
    //                 System.out.printf("|%-10s|%-16s|%-15s|%-18s|\n", list.get(i).getNim(), list.get(i).getName(), list.get(i).getprodi(),list.get(i).getfakultas());
    //             }
    //             System.out.println("================================================================");
    //             System.out.println();
    //         }
    //         else if (tc == 3)
    //         {
    //             boolean pp = false;
    //             System.out.print("Input data NIM to be deleted : ");
    //             String no = sc.next();
    //             Iterator <Temp> i = list.iterator();
    //             while (i.hasNext()){
    //                 Temp temporary = i.next();
    //                 System.out.println();
    //                 if((temporary.getNim()).equals(no)){
    //                     i.remove();
    //                     pp = true;
    //                 }
    //             }

    //             if(!pp)
    //             {
    //                 System.out.println("Data not found!");
    //             }
    //             else
    //             {
    //                 System.out.println("Data has been deleted!");
    //             }
    //         }
    //         else if (tc == 4)
    //         {
    //             boolean pp = false;
    //             System.out.print("Input data NIM to be edited : ");
    //             String no = sc.next();
    //             Iterator <Temp> i = list.iterator();
    //             while (i.hasNext()){
    //                 Temp temporary = i.next();
    //                 System.out.println();
    //                 if((temporary.getNim()).equals(no)){
    //                     System.out.print("=MENU  EDIT=\n");
    //                     System.out.print("NIM       : ");
    //                     String nim = sc.next();
    //                     temporary.setNim(nim);
    //                     System.out.print("Name      : ");
    //                     String name = sc.next();
    //                     temporary.setName(name);
    //                     System.out.print("Prodi     : ");
    //                     String prodi = sc.next();
    //                     temporary.setProdi(prodi);
    //                     System.out.print("Fakultas  : ");
    //                     String fakultas = sc.next();
    //                     temporary.setFakultas(fakultas);
    //                     System.out.println();
    //                     pp = true;
    //                 }
    //             }

    //             if(!pp)
    //             {
    //                 System.out.println("Data not found!");
    //             }
    //             else
    //             {
    //                 System.out.println("Data has been edited!");
    //             }
    //         }
    //     }while (tc != 5);
    //     sc.close();
    //     sc1.close();
    // }
}