import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Company> companies = new ArrayList<>();
    public static Integer printCompanyOptions(Company c) {
        System.out.println("Current Software Company : " + c.getName());
        c.hierarchy(0);
        System.out.println("Company Options : ");
        System.out.println("1. Add Project Manager\n2. Delete Project Manager\n3. Enter Project Manager Options\n4. Back");
        Integer sl = Integer.parseInt(sc.nextLine());
        return sl;
    }
    public static Integer printManagerOptions(ProjectManager m) {
        System.out.println("Current Project Manager : " + m.getName());
        m.hierarchy(0);
        System.out.println("PM Options : ");
        System.out.println("1. Add Developer\n2. Delete Developer\n3. Back");
        Integer sl = Integer.parseInt(sc.nextLine());
        return sl;
    }
    public static void addpm(Company c) {
        String name;
        String projectname;
        System.out.println("Project Manager Name : ");
        name = sc.nextLine();
        System.out.println("Project Name : ");
        projectname = sc.nextLine();
        if (c.addpm(new ProjectManager(name, projectname)) == false) {
            System.out.println("Not possible to create project");
        }
    }
    public static void adddev(ProjectManager m) {
        String name;
        System.out.println("Developer Name: ");
        name = sc.nextLine();
        if (m.addDev(new Developer(name, m.getProject())) == false) {
            System.out.println("Not possible to create developer");
        }
    }
    public static void rempm(Company c) {
        String name;
        System.out.println("Project Manager Name : ");
        name = sc.nextLine();
        if (c.rempm(name) == false) {
            System.out.println("Project Manager Doesn't exist");
        }

    }
    public static void remdev (ProjectManager m) {
        String name;
        System.out.println("Developer Name : ");
        name = sc.nextLine();
        if (m.remdev(name) == false) {
            System.out.println("Developer Doesn't exist");
        }
    }
    public static Integer softwareoptions() {
        System.out.println("Current software companies : ");
        for (int i = 0; i < companies.size(); i++) {
            companies.get(i).hierarchy(0);
        }
        System.out.println("Software page Options : ");
        System.out.println("1. Create new software company\n2. Delete software company\n3. Enter Company Menu");
        Integer sl = Integer.parseInt(sc.nextLine());
        return sl;
    }
    public static void createCompany() {
        System.out.println("Company Name :");
        String name;
        name = sc.nextLine();
        companies.add(new Company(name));
    }
    public static void deleteCompany () {
        System.out.println("Company name to delete : ");
        String name;
        name = sc.nextLine();
        int x = -1;
        for (Company c : companies) {
            x++;
            if (c.getName().equalsIgnoreCase(name)) {
                c.removeall();
                companies.remove(x);
                System.out.println("Software Company " + name + " removed");
                return;
            }
        }
    }
    public static ProjectManager getmanager(Company c) {
        System.out.println("Name of PM : ");
        String name;
        name = sc.nextLine();
        for (ProjectManager m : c.projectManagers) {
            if (m.getName().equalsIgnoreCase(name)) return m;
        }
        return null;
    }
    public static Company getcompany() {
        System.out.println("Nmae of Company : ");
        String name;
        name = sc.nextLine();
        for (Company c : companies) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return  null;
    }

    public static void main(String[] args) {
        while(true) {
            Integer sl = softwareoptions();
            if (sl.equals(1)) {
                createCompany();
            }
            else if (sl.equals(2)) {
                deleteCompany();
            }
            else if (sl.equals(3)) {
                Company c = getcompany();
                Integer s2 = -1;
                while (!s2.equals(4)) {
                    s2 = printCompanyOptions(c);
                    if (s2.equals(1)) {
                        addpm(c);
                    }
                    else if (s2.equals(2)) {
                        rempm(c);
                    }
                    else if (s2 == 3) {
                        ProjectManager pm = getmanager(c);
                        Integer s3 = -1;
                        while (!s3.equals(3)) {
                            s3 = printManagerOptions(pm);
                            if (s3.equals(1)) adddev(pm);
                            else if (s3.equals(2)) remdev(pm);
                        }
                    }

                }
            }
        }
    }
}
