import java.util.ArrayList;

public class Company {
    int totalProjects;
    String name;
    ArrayList<ProjectManager> projectManagers;

    public int getTotalProjects() {
        return totalProjects;
    }

    public void setTotalProjects(int totalProjects) {
        this.totalProjects = totalProjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ProjectManager> getProjectManagers() {
        return projectManagers;
    }

    public void setProjectManagers(ArrayList<ProjectManager> projectManagers) {
        this.projectManagers = projectManagers;
    }
    public Company(String nm) {
        name = nm;
        projectManagers = new ArrayList<>();
        totalProjects = 0;
    }
    public void printDetails() {
        System.out.println("Company Name : " + name);
        System.out.println("Number of Projects : " + totalProjects);
    }
    public void hierarchy (int x) {
        for (int i = 0; i < x; i++) System.out.print("\t");
        System.out.println("- " + getName());
        for (ProjectManager m : projectManagers) {
            m.hierarchy(x + 1);
        }
    }
    public void print(int x) {
        if (x == 1) {
            hierarchy(0);
        }
        else printDetails();
    }
    public boolean addpm(ProjectManager m) {
        for (ProjectManager pm : projectManagers) {
            if (m.getName().equalsIgnoreCase(pm.getName()) || pm.getProject().equalsIgnoreCase(m.getProject())) return false;
        }
        projectManagers.add(m);
        return true;
    }
    public boolean rempm(String name) {
        for (ProjectManager m : projectManagers) {
            if (m.getName().equalsIgnoreCase(name)) {
                projectManagers.remove(m);
                System.out.println("Project Manager " + m.getName() + " Removed");
                return true;
            }
        }
        System.out.println("Project Manager " + name + " doesn't exist");
        return false;
    }
    public void removeall () {
        while (projectManagers.size() > 0) {
            rempm(projectManagers.get(0).getName());
        }
        System.out.println("All project manager removed");
    }
}
