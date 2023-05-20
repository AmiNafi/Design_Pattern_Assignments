import java.util.ArrayList;

public class ProjectManager implements EmployeeInterface{
    String name, role, project;
    ArrayList <Developer> developers;
    public ProjectManager(String n, String p) {
        developers = new ArrayList<>();
        name = n;
        project = p;
        role = "Project Manager";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(ArrayList<Developer> developers) {
        this.developers = developers;
    }

    @Override
    public void printDetails() {
        System.out.println("Name : " + getName());
        System.out.println("Role : " + getRole());
        System.out.println("Current Project : " + getProject());
        System.out.println("Number of Supervisees " + developers.size());
    }
    public boolean remdev (String name) {
        for (Developer d : developers) {
            if (d.getName().equalsIgnoreCase(name)) {
                developers.remove(d);
                System.out.println(d.getName() + " Removed");
                return true;
            }
        }
        System.out.println("Developer " + name + " doesn't exist");
        return false;
    }
    public void removeall() {
        while(developers.size() > 0) {
            remdev(developers.get(0).getName());
            System.out.println("All developers removed from project " + getProject());
        }
    }
    public boolean addDev(Developer dev) {
        for (Developer dv : developers) {
            if (dev.getName().equalsIgnoreCase(dv.getName())) return false;
        }
        developers.add(dev);
        return true;
    }
    @Override
    public void hierarchy(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("\t");
        }
        System.out.println("- " + getName() + " (" + getProject() + ")");
        for (Developer d : developers) {
            d.hierarchy(x + 1);
        }
    }

    @Override
    public void print(int x) {

    }
}
