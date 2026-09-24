# App Constructora: Construction Project Management

A Java desktop app for managing construction projects (*obras*). It tracks the people involved, the budget for each trade, and every expense against that budget, so you can see a project's financial status at a glance.

> Built as the second group assignment (*Obligatorio 2*) for **Programming II** at Universidad ORT Uruguay by **Nicolás Hobbins** and **Matías Medina**.
> The UI is in Spanish.

---

## Features

- **Trade categories (*Rubros*):** register and edit categories such as Painting, Plumbing, Electrical or Carpentry. A quick-start option loads 10 predefined categories.
- **People management:** register **Owners** (*Propietarios*) and **Foremen** (*Capataces*). Input is validated: names must be letters only, IDs must be numeric, IDs can't repeat, and dates must be valid.
- **Project registration (*Obras*):** link an owner and a foreman to a project with a unique permit number, an address and a start date. You build the budget by clicking a dynamically generated button for each category and entering its amount.
- **Expense tracking (*Gastos*):** log expenses for a project with the category, amount, month/year and description. Each expense gets its own sequential number.
- **Expense payment:** mark expenses as paid (reimbursed).
- **Project status dashboard:** shows the total budget, total spent, paid vs. unpaid spending and the remaining balance. It also has a **color-coded expense list**:
  | Color | Meaning |
  |---|---|
  | 🟩 Green | Budgeted & reimbursed |
  | 🟢 Light green | Budgeted & not reimbursed |
  | 🟧 Orange | Not budgeted & reimbursed |
  | 🟥 Red | Not budgeted & not reimbursed |
- **Import:** load a full project, including its budget, from a text file picked with a file chooser.
- **Export:** write every owner and foreman to `Personas.txt`, sorted **by name** or **by ID**.
- **Persistence:** the whole system state is saved automatically when you close the app. On the next start you can pick up where you left off (*Sistema Anterior*) or start fresh (*Sistema Nuevo*).
- **Splash screen:** a welcome screen that closes itself after 3 seconds.

---

## Tech Stack

| Area | Tools |
|---|---|
| Language | **Java** (source/target JDK 22) |
| GUI | **Java Swing** (`JFrame`, `JList`, `JMenuBar`, `JOptionPane`, `JFileChooser`, custom cell renderers) |
| IDE / UI designer | **Apache NetBeans** with the GUI Builder (`.form` files) |
| Build | **Apache Ant** (`build.xml`, `nbproject/`) |
| Persistence | Java Object Serialization (`sistema.ser`) |
| File I/O | `java.util.Scanner`, `java.util.Formatter`, `java.nio.file.Paths`, `FileWriter` |
| Concurrency | `ScheduledExecutorService` (timer for the splash screen) |

---

## Techniques & Design Concepts

- **Layered architecture:** the code is split into three packages with separate responsibilities:
  - `Dominio`: the domain model and business rules
  - `Interfaz`: the Swing UI
  - `io`: reading, writing, importing and exporting files
- **Object-oriented design:**
  - **Inheritance:** `Propietario` and `Capataz` both extend a base `Usuario` class.
  - **Encapsulation:** all fields are private and accessed through getters and setters.
  - **Composition:** an `Obra` holds lists of `Presupuesto` and `Gasto`, and each of those points to a `Rubro`.
- **Facade:** `Sistema` is the single entry point to the domain. It handles registration, validation, searching and sorting.
- **Observer pattern:** `Sistema` extends `Observable`, and windows like `VentanaRegistroObra` implement `Observer`, so the UI refreshes automatically when the data changes.
- **Serialization:** the whole object graph is saved and loaded with `ObjectOutputStream` / `ObjectInputStream`, and every class declares a `serialVersionUID`.
- **Validation:** regular expressions (`\\d+`, `[a-zA-Z\\s]+`), uniqueness checks for IDs, permits and categories, and date checks against the current year with `Calendar`.
- **Lambdas and the Collections API:** sorting uses `Collections.sort` with lambda comparators. There's also a generic `<T>` helper that removes duplicates with a `HashSet`.
- **Custom rendering:** `ColoresParaGastos` extends `DefaultListCellRenderer` to color each expense by its status.
- **Dynamic UI:** the category buttons are generated at runtime in a `GridLayout`, and their listener is an inner class (`RubroListener`).
- **Event-driven programming:** Swing `ActionListener`s, `ListSelectionListener`s and window events (for example, saving on `windowClosing`).
- **Text-file parsing:** reads a custom `#`-delimited format.

---

## Project Structure

```
App_Constructora/
├── src/
│   ├── Dominio/        # Domain model: Sistema, Obra, Gasto, Presupuesto, Rubro, Usuario, Propietario, Capataz
│   ├── Interfaz/       # Swing windows (+ NetBeans .form files) and the ColoresParaGastos renderer
│   ├── io/             # ArchivoLectura, ArchivoGrabacion, ImportaDatosObra, ExportaDatosPersona
│   └── img/            # Icons and background images
├── nbproject/          # NetBeans project configuration
├── build.xml           # Ant build script
├── sistema.ser         # Saved system state (generated at runtime)
└── Personas.txt        # Export output (generated at runtime)
```

---

## Getting Started

### Requirements
- JDK 22 or later
- Apache NetBeans (recommended) **or** Apache Ant

### Run in NetBeans
1. `File → Open Project` and select the `App_Constructora` folder.
2. Run the project. The main class is `Interfaz.MenuVentanas`.

### Build with Ant
```bash
ant jar
java -jar dist/P2_Obligatorio2.jar
```

### Usage flow
1. On the start screen, choose **Sistema Nuevo** (empty), **Sistema Anterior** (load the saved state) or **Sólo rubros** (start with 10 predefined categories).
2. Use the **Registros** menu to add categories, foremen, owners and projects.
3. Use the **Gastos** menu to log expenses, mark them as paid and open the **Estado de obra** dashboard.
4. Use **Importación y Exportación** to import a project or export the list of people.

---

## Import File Format

```
<foreman ID>#<owner ID>#<address>#<month>#<year>#<permit number>
<line ignored>
<category>#<amount>#<category>#<amount>#...
```

The owner and foreman must already be registered. If a category in the file doesn't exist yet, it's created automatically.

---

## Authors

- **Nicolás Hobbins**: [@NicoHob](https://github.com/NicoHob)
- **Matías Medina**
