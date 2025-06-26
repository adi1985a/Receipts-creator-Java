# 🧾🛒 JavaSwing ReceiptPro: Modern Receipt Generator 🛍️
<p align="center">
  <img src="zad3/header.jpg" width="400"/>
</p>
_A modern Java Swing desktop application for creating and managing itemized receipts. Enter product details, calculate totals (net, VAT, gross), and save your receipt with a stylish, user-friendly interface._

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-%3E%3D8-007396.svg?logo=java&logoColor=white)](https://www.java.com/)
[![Swing](https://img.shields.io/badge/UI-Java%20Swing-orange.svg)]()

## 📋 Table of Contents
1.  [Overview](#-overview)
2.  [Key Features](#-key-features)
3.  [Screenshots](#-screenshots)
4.  [System Requirements & Dependencies](#-system-requirements--dependencies)
5.  [Core Classes](#-core-classes)
6.  [Installation and Setup](#️-installation-and-setup)
7.  [Application Usage](#️-application-usage)
8.  [File Structure](#-file-structure)
9.  [Technical Notes](#-technical-notes)
10. [Contributing](#-contributing)
11. [License](#-license)
12. [Contact](#-contact)

## 📄 Overview

**JavaSwing ReceiptPro** (main class: `zad3.Okno_Graficzne`), developed by Adrian Lesniak, is a modern desktop application built with Java Swing. It features a clean, dark-themed interface with a custom header image, clear input fields, and live summary. Users can add, remove, and save receipt items, with all controls and messages in English. The application is ideal for small businesses and shops needing quick, stylish receipt management.

<br> 
<p align="center">
  <img src="screenshots/1.gif" width="70%">
</p>
<br>


## ✨ Key Features

*   📝 **Product Entry**:
    *   Input fields for Product Name, Net Price, Quantity, and VAT Rate (%).
*   ➕ **Add/Remove Items**:
    *   "Add item to receipt" button: Adds the current product to the receipt.
    *   "Remove last item" button: Removes the most recently added item.
*   💾 **Save Receipt**:
    *   "Save receipt to file" button: Exports the current receipt and summary to a text file.
*   📊 **Live Summary**:
    *   Always-visible summary bar showing total items, net, VAT, and gross values.
*   🖥️ **Modern GUI**:
    *   Dark theme, large fonts, centered layout, and a custom JPG header image.
    *   All labels, buttons, and dialogs in English.
*   ✔️ **Input Validation**:
    *   Ensures all fields are filled and numeric values are valid before adding an item.
*   👤 **Author**:
    *   Program created by Adrian Lesniak (displayed in the app).

## 🖼️ Screenshots

_Sample screenshots of the main window, with header image, input fields, buttons, receipt area, and summary bar._

<p align="center">
  <img src="screenshots\1.jpg" width="300"/>
  <img src="screenshots\2.jpg" width="300"/>
  <img src="screenshots\3.jpg" width="300"/>
  <img src="screenshots\4.jpg" width="300"/>
  <img src="screenshots\5.jpg" width="300"/>
  <img src="screenshots\6.jpg" width="300"/>
  <img src="screenshots\7.jpg" width="300"/>
</p>

## ⚙️ System Requirements & Dependencies

*   **Java Development Kit (JDK)**: Java 8 or higher
*   **Java Runtime Environment (JRE)**: For running the compiled application
*   **Standard Java Libraries**:
    *   `javax.swing.*` (GUI)
    *   `java.awt.*` (layout, events)
*   **Custom Classes (in `zad3` package)**:
    *   `Okno_Graficzne.java` (main GUI)
    *   `Paragon.java` (receipt logic)
    *   `Pobierz_Dane.java` (input validation)
    *   `Produkt.java` (product model)
    *   `PozycjaParagonu.java` (receipt item)
    *   `header.jpg` (header image)

## 🧩 Core Classes

*   **`Okno_Graficzne.java`**: Main class with the Swing GUI, event handlers, and layout.
*   **`Paragon.java`**: Manages receipt items and calculates totals.
*   **`Pobierz_Dane.java`**: Handles input validation and parsing.
*   **`Produkt.java`**: Represents a product (name, net price, VAT).
*   **`PozycjaParagonu.java`**: Represents a receipt line (product + quantity).

## 🛠️ Installation and Setup

1.  **Clone or Download the Source Code**:
    ```bash
    git clone <repository-url>
    cd <repository-directory>
    ```
2.  **Project Structure**:
    *   Place all Java files in `src/zad3/` and the header image as `src/zad3/header.jpg`.
3.  **Compile the Application**:
    ```bash
    cd src
    javac zad3/*.java
    ```
4.  **Run the Application**:
    ```bash
    java zad3.Okno_Graficzne
    ```

## 💡 Application Usage

- **Start the program**: The main window appears with a header image, description, and author.
- **Add an item**: Fill in all fields and click "Add item to receipt". The item appears in the table below.
- **Remove last item**: Click "Remove last item" to delete the most recent entry.
- **Save receipt**: Click "Save receipt to file" to export the receipt and summary.
- **Live summary**: The summary bar at the bottom updates automatically.
- **Exit**: Click "Exit program" to close the application.

## 🗂️ File Structure

*   `src/zad3/Okno_Graficzne.java`
*   `src/zad3/Paragon.java`
*   `src/zad3/Pobierz_Dane.java`
*   `src/zad3/Produkt.java`
*   `src/zad3/PozycjaParagonu.java`
*   `src/zad3/header.jpg`
*   `README.markdown`

## 📝 Technical Notes

*   The interface is fully in English.
*   The header image is loaded from `src/zad3/header.jpg` and scaled proportionally.
*   All elements are centered and visible on program start.
*   Input validation prevents empty or invalid entries.
*   Receipt data is stored in memory; saving to file is available.

## 🤝 Contributing

Contributions are welcome! Ideas:
- Add PDF export
- Add item editing
- Add receipt printing
- Improve theming

1. Fork the repository
2. Create a feature branch
3. Commit and push your changes
4. Open a Pull Request

## 📃 License

This project is licensed under the **MIT License**.

## 📧 Contact

Application by **Adrian Lesniak**.

---
🧾 _Generating itemized receipts with Java Swing, one product at a time!_
