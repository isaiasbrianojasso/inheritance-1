package uaslp.enginering.labs;

public class Application {

    public void run() {

        Menu menu = buildApplicationMenu();

        menu.draw();

    }

    private Menu buildApplicationMenu() {
        Menu applicationMenu = new Menu();

        Menu fileMenu = buildMenuFile();
        applicationMenu.addOption(fileMenu);

        Menu editMenu = buildMenuEdit();
        applicationMenu.addOption(editMenu);

        Menu viewMenu = buildMenuView();
        applicationMenu.addOption(viewMenu);

        Menu navigateMenu = buildMenuNavigate();
        applicationMenu.addOption(navigateMenu);



        // [ ] Un texto
        applicationMenu.addOption(new Checkbox("Un texto"));
        applicationMenu.addOption(new Checkbox("Otro texto"));

        // Opción 1 - Opcion 2 - Opcion 3
        applicationMenu.addOption(new ListBox("Opcion 1", "Opcion 2", "Opción 3"));
        applicationMenu.addOption(new Checkbox("Opcion 5"));

        // [|        ]
        applicationMenu.addOption(new EditBox());


        applicationMenu.addOption(new Button("Exit"));
        applicationMenu.addOption(new ListBox("Opcion 4", "Opcion 5"));
        applicationMenu.addOption(new EditBox());

        return applicationMenu;
    }

    private Menu buildMenuNavigate() {
        Menu navigateFile = new Menu("Navigate");

        navigateFile.addOption(new Button("Back"), "B");
        navigateFile.addOption(new Button("Forward"), "F");
        navigateFile.addOption(new Separator());
        navigateFile.addOption(new Button("Search everywhere"), "S");
        navigateFile.addOption(new Separator());
        navigateFile.addOption(new Button("Class"), "C");

        return navigateFile;
    }

    private Menu buildMenuView() {
        Menu viewFile = new Menu("View");

        viewFile.addOption(new Button("Tool Windows"), "T");
        viewFile.addOption(new Button("Appearance"), "A");

        return viewFile;
    }

    private Menu buildMenuEdit() {
        Menu editFile = new Menu("Edit");

        editFile.addOption(new Button("Undo"), "U");
        editFile.addOption(new Button("Redo"), "R");
        editFile.addOption(new Separator());
        editFile.addOption(new Button("Cut"), "C");
        editFile.addOption(new Button("Copy"));
        editFile.addOption(new Button("Paste"));
        editFile.addOption(new Button("Delete"));

        return editFile;
    }

    private Menu buildMenuFile() {
        Menu menuFile = new Menu("File");

        menuFile.addOption(new Button("Open"), "O");
        menuFile.addOption(new Button("Close project"), "X");
        menuFile.addOption(new Separator());
        menuFile.addOption(new Button("Settings"), "S");
        menuFile.addOption(new Button("Project Structure"));
        menuFile.addOption(new Separator());

        return menuFile;
    }
}