# Thyme Leaf Project

### A Simple MVC Application using Springboot, Bootstrap and MySQL

# Person Management System

This project utilizes the Spring Framework to develop a web application following the Model-View-Controller (MVC) architecture. The primary purpose is to manage information about individuals using a simple CRUD (Create, Read, Update, Delete) system.

# PersonEntity Class Documentation

The `PersonEntity` class represents an entity in the context of a person in the application. It is annotated with `@Entity` to indicate that it is a JPA entity and can be persisted in a database. The class also utilizes Lombok annotations (`@Data`, `@AllArgsConstructor`, `@NoArgsConstructor`) to generate boilerplate code for getters, setters, constructors, and more.

## Controller: PersonController

The `PersonController` class is responsible for handling HTTP requests and managing the flow of the application.

### Annotations Used:

- `@Controller`: Indicates that this class is a controller in the MVC architecture.
- `@Autowired`: Utilized for Dependency Injection.

### Endpoint Mapping:

- **Home Page:**
  - `@GetMapping("/")`: Displays the home page, listing all individuals fetched from the repository.

- **Add Person Page:**
  - `@GetMapping("/savePersonPage")`: Displays the page for adding a new person.

- **Save Person:**
  - `@PostMapping("/savePerson")`: Saves a new person and redirects the user to the home page.

- **Update Person Page:**
  - `@GetMapping("/updatePersonPage/{id}")`: Displays the page for updating a person, based on the provided ID.

- **Delete Person:**
  - `@GetMapping("/deletePerson/{id}")`: Deletes a person with the specified ID and redirects to the home page.

### Dependency Injection:

- `@Autowired private PersonRepository repository;`: Injects the `PersonRepository` for accessing data related to `PersonEntity`.

### Model Usage:

- `Model model`: Used for communication with the view layer, sending data to the view.

### Optional Usage:

- `Optional<PersonEntity>`: Using Optional in this context is a way to explicitly handle the possibility that no entity is found with the specified ID. It helps prevent potential NullPointerExceptions that could occur if you were directly working with a null value.

### Redirect:

- `return "redirect:/";`: Redirects the user to another URL (in this case, the home page) after performing an operation.
