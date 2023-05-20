public class Developer implements EmployeeInterface{
    String name, role, project;

    public Developer(String n, String p) {
        name = n;
        role = "Developer";
        project = p;
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

    @Override
    public void printDetails() {
        System.out.println("Name : " + name);
        System.out.println("Role : " + role);
        System.out.println("Current Project : " + project);
    }

    @Override
    public void hierarchy(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("\t");
        }
        System.out.println("- " + getName());
    }

    @Override
    public void print(int x) {
        if (x == 1) {
            hierarchy(0);
        }
        else printDetails();
    }
}
