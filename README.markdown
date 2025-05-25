# 🧾🛒 JavaSwing ReceiptPro: Itemized Receipt Generator 🛍️
_A Java Swing-based desktop application for creating itemized receipts, allowing users to input product details, calculate totals (net, tax, gross), and finalize the receipt._

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-%3E%3D8-007396.svg?logo=java&logoColor=white)](https://www.java.com/)
[![Swing](https://img.shields.io/badge/UI-Java%20Swing-orange.svg)]() <!-- Generic Swing badge -->
[![AWT](https://img.shields.io/badge/UI-Java%20AWT-orange.svg)]() <!-- Generic AWT badge -->

## 📋 Table of Contents
1.  [Overview](#-overview)
2.  [Key Features](#-key-features)
3.  [Screenshots (Conceptual)](#-screenshots-conceptual)
4.  [System Requirements & Dependencies](#-system-requirements--dependencies)
5.  [Core Classes (Assumed - `zad3` package)](#-core-classes-assumed---zad3-package)
6.  [Installation and Setup](#️-installation-and-setup)
7.  [Application Usage](#️-application-usage)
8.  [File Structure (Expected)](#-file-structure-expected)
9.  [Technical Notes](#-technical-notes)
10. [Contributing](#-contributing)
11. [License](#-license)
12. [Contact](#-contact)

## 📄 Overview

**JavaSwing ReceiptPro** (from main class `zad3.Okno_Graficzne`), developed by Adrian Lesniak, is a desktop application built with Java Swing and AWT. It provides a graphical user interface for generating itemized receipts. Users can input details for various products, including name, net price, quantity, and VAT (Value Added Tax) percentage. The application then adds these items to a running receipt, displaying individual item calculations (net, tax, gross). Finally, users can finalize the receipt to view the overall total net amount, total tax, and total gross amount in a summary dialog. The system relies on several assumed classes within a `zad3` package (`Paragon`, `Pobierz_Dane`, `Produkt`, `PozycjaParagonu`) to handle data structures and logic.

## ✨ Key Features

*   📝 **Product Entry**:
    *   Input fields for Product Name, Net Price, Quantity, and VAT Percentage.
*   🧾 **Dynamic Receipt Management**:
    *   "Dodaj pozycje do paragonu" (Add item to receipt) button: Adds the currently entered product details as a new line item.
    *   The application likely uses a `Paragon` (Receipt) class to manage a collection of `PozycjaParagonu` (Receipt Item) objects.
*   📊 **Real-Time Display & Calculations**:
    *   A `JTextArea` (or similar) displays each added item, showing its:
        *   Product Name
        *   Quantity
        *   Net Price
        *   VAT Percentage
        *   Calculated Tax Amount for the item
        *   Calculated Gross Price for the item
*   💰 **Receipt Summary & Finalization**:
    *   "Koniec wprowadzania danych do paragonu" (End data entry for receipt) button:
        *   Calculates the total net amount, total tax amount, and total gross amount for all items on the receipt.
        *   Displays these totals in a `JOptionPane` summary dialog.
*   🖥️ **Graphical User Interface (Swing/AWT)**:
    *   A main window (`JFrame`) with input fields (`JTextField`), buttons (`JButton`), and a display area (`JTextArea`).
    *   An "Koniec programu" (End program) button to exit the application.
*   ✔️ **Input Validation (Assumed)**:
    *   Relies on an assumed `Pobierz_Dane` (Get Data) class to handle the validation and parsing of user inputs from the text fields. (Specific validation rules are not detailed but are crucial for robustness).

## 🖼️ Screenshots (Conceptual)

**Coming soon!**

_This section would ideally show screenshots of: the main application window with input fields and the receipt display area, an example of items added to the receipt, and the final summary dialog showing total net, tax, and gross amounts._

## ⚙️ System Requirements & Dependencies

*   **Java Development Kit (JDK)**: Java 8 or higher (for compilation and running).
*   **Java Runtime Environment (JRE)**: Required to run the compiled application if distributed.
*   **Standard Java Libraries**:
    *   `javax.swing.*` (for GUI components like `JFrame`, `JTextField`, `JButton`, `JTextArea`, `JOptionPane`)
    *   `java.awt.*` (for layout managers, event handling, graphics if used)
    *   Core Java libraries for data structures, string manipulation, number formatting, etc.
*   📦 **Custom Classes (Assumed to be in `zad3` package)**:
    *   `Paragon.java`
    *   `Pobierz_Dane.java`
    *   `Produkt.java`
    *   `PozycjaParagonu.java`
    *   The main GUI class `Okno_Graficzne.java` itself.

## 🧩 Core Classes (Assumed - `zad3` package)

This application's logic is distributed across several key classes, which are assumed to exist and be implemented correctly within a `zad3` package:

*   **`Okno_Graficzne.java`**: The main class containing the Swing GUI setup, event handlers for buttons, and interactions with other classes.
*   **`Paragon.java` (Receipt)**: Likely holds a list of `PozycjaParagonu` objects and methods to calculate total net, tax, and gross amounts for the entire receipt.
*   **`Pobierz_Dane.java` (GetData)**: Responsible for fetching data from the input `JTextField`s and, critically, **validating** this input (e.g., ensuring price/quantity are numeric, VAT is a valid percentage).
*   **`Produkt.java` (Product)**: Represents a product with attributes like name, net price, and VAT rate.
*   **`PozycjaParagonu.java` (ReceiptItem)**: Represents a single line item on the receipt, likely holding a `Produkt` object and the `quantity`. It would also calculate its own item-specific net, tax, and gross values.

## 🛠️ Installation and Setup

1.  **Clone or Download the Source Code**:
    ```bash
    git clone <repository-url>
    cd <repository-directory>
    ```
    *(Replace `<repository-url>` and `<repository-directory>` if applicable, or simply download/place all `.java` files in a directory structure reflecting the `zad3` package).*

2.  **Ensure Project Structure**:
    *   All Java source files (`Okno_Graficzne.java`, `Paragon.java`, `Pobierz_Dane.java`, `Produkt.java`, `PozycjaParagonu.java`) should be located within a subfolder named `zad3` relative to your main project/compilation directory.

3.  **Ensure Java Development Kit (JDK) is Installed**:
    Verify you have JDK 8 or higher installed and configured.

4.  **Compile the Java Application**:
    Open a terminal or command prompt, navigate to the directory **containing** the `zad3` folder (i.e., the parent directory of `zad3`), and compile the Java files:
    ```bash
    javac zad3/*.java
    ```
    This command compiles all `.java` files within the `zad3` package.

5.  **Run the Java Application**:
    From the same directory (the parent directory of `zad3`), run the main class:
    ```bash
    java zad3.Okno_Graficzne
    ```
    *(Note the use of the fully qualified class name, including the package).*

## 💡 Application Usage

1.  Compile and run the application `zad3.Okno_Graficzne` as detailed in the "Installation and Setup" section.
2.  **Interface**:
    *   A graphical window will appear with input fields for:
        *   "Nazwa produktu" (Product Name)
        *   "Cena netto" (Net Price)
        *   "Ilość" (Quantity)
        *   "Procent VAT" (VAT Percentage)
    *   Buttons:
        *   "Dodaj pozycje do paragonu" (Add item to receipt)
        *   "Koniec wprowadzania danych do paragonu" (End data entry for receipt / Finalize)
        *   "Koniec programu" (End program / Exit)
    *   A text area will display the items added to the current receipt.
3.  **Actions**:
    *   **Adding an Item**:
        1.  Fill in the product name, net price, quantity, and VAT percentage in their respective text fields.
        2.  Click the "Dodaj pozycje do paragonu" button.
        3.  The item will be processed (validation via `Pobierz_Dane`, calculations), and its details (name, qty, net, tax, gross) will appear in the receipt display area.
        4.  The input fields will likely be cleared, ready for the next item.
    *   **Finalizing the Receipt**:
        1.  After adding all desired items, click the "Koniec wprowadzania danych do paragonu" button.
        2.  A `JOptionPane` dialog will appear, showing the total net amount, total tax amount, and total gross amount for the entire receipt.
    *   **Exiting**:
        1.  Click the "Koniec programu" button to close the application.

## 🗂️ File Structure (Expected)

*   `zad3/` (package/folder)
    *   `Okno_Graficzne.java`: The main Java source file containing the Swing GUI, event handling, and primary application logic.
    *   `Paragon.java`: (Assumed) Class for managing receipt data and total calculations.
    *   `Pobierz_Dane.java`: (Assumed) Class for input fetching and validation.
    *   `Produkt.java`: (Assumed) Class representing a product.
    *   `PozycjaParagonu.java`: (Assumed) Class representing an item line on the receipt.
*   `README.md`: This documentation file.

*(No external data files like `.txt` or log files are mentioned for this project in the provided description beyond the in-memory receipt.)*

## 📝 Technical Notes

*   **Assumed Class Structure**: The functionality heavily relies on the correct implementation and interaction of the `Paragon`, `Pobierz_Dane`, `Produkt`, and `PozycjaParagonu` classes within the `zad3` package. Their internal logic is crucial.
*   **GUI Layout (`null` layout)**: The description notes the GUI uses a `null` layout (`setLayout(null)`). While this allows precise pixel positioning of components, it is generally **not recommended** for Swing applications as it makes the UI rigid, difficult to maintain, and non-responsive to window resizing or different screen resolutions/DPI settings. Using standard Swing Layout Managers (e.g., `BorderLayout`, `GridLayout`, `FlowLayout`, `GridBagLayout`, or a combination) is best practice for creating adaptable UIs.
*   **Input Field Clearing**: Input fields are cleared after an item is added, which is a good usability feature.
*   **Summary Dialog Formatting**: The note about HTML-like formatting in the `JOptionPane` for the summary suggests it might be trying to use `<html>` tags. While `JOptionPane` supports basic HTML, complex rendering might not work as expected or look native.
*   **No Data Persistence**: Receipt data is stored in memory only during the application's runtime. Closing the application will lose the current receipt data unless a save/load feature is implemented.
*   **Input Validation Source**: Validation is attributed to the `Pobierz_Dane` class, which is a good separation of concerns. The robustness of the application depends on how thoroughly this class validates different input types (e.g., non-numeric for price/qty, valid VAT range).

## 🤝 Contributing

Contributions to this **JavaSwing ReceiptPro** application are welcome! Ideas include:

*   Implementing file saving/loading for receipts.
*   Replacing the `null` layout with standard Swing Layout Managers for better responsiveness.
*   Enhancing input validation within `Pobierz_Dane`.
*   Adding features like editing/deleting items from the receipt, printing functionality, or VAT rate lookups.
*   Improving the visual design or theming.

1.  Fork the repository.
2.  Create a new branch for your feature (`git checkout -b feature/SaveReceiptToFile`).
3.  Make your changes to the Java source files.
4.  Commit your changes (`git commit -m 'Feature: Implement saving receipt to TXT'`).
5.  Push to the branch (`git push origin feature/SaveReceiptToFile`).
6.  Open a Pull Request.

Please ensure your code is well-commented and adheres to good Java and Swing development practices.

## 📃 License

This project is licensed under the **MIT License**.
(If you have a `LICENSE` file in your repository, refer to it: `See the LICENSE file for details.`)

## 📧 Contact

Application concept by **Adrian Lesniak**.
For questions or feedback, please open an issue on the GitHub repository or contact the repository owner.

---
🧾 _Generating itemized receipts with Java Swing, one product at a time!_
