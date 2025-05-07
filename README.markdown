# Receipt Application

## Overview
Receipt Application is a Java Swing-based desktop tool for generating receipts. Users input product details (name, net price, quantity, VAT percentage), which are added to a receipt. The app displays itemized entries, calculates net, tax, and gross totals, and provides options to finalize the receipt or exit the program.

## Features
- **Product Entry**: Input product name, net price, quantity, and VAT percentage.
- **Receipt Management**: Add items to a receipt, view details, and calculate totals.
- **Display**: Shows each added item with net, tax, and gross values in a text area.
- **Summary**: Finalize the receipt to view total net, tax, and gross amounts in a dialog.
- **User Interface**: Includes buttons for adding items, finalizing the receipt, and exiting.
- **Input Validation**: Assumes valid inputs via `Pobierz_Dane` class (not shown).

## Requirements
- Java 8 or higher
- Libraries: Standard Java libraries (Swing, AWT)
- Classes (assumed to exist in the `zad3` package):
  - `Paragon`
  - `Pobierz_Dane`
  - `Produkt`
  - `PozycjaParagonu`

## Setup
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-directory>
   ```
2. Ensure the required classes (`Paragon`, `Pobierz_Dane`, `Produkt`, `PozycjaParagonu`) are in the `zad3` package.
3. Compile the application:
   ```bash
   javac zad3/*.java
   ```
4. Run the application:
   ```bash
   java zad3.Okno_Graficzne
   ```

## Usage
1. Launch the application to open the GUI.
2. **Interface**:
   - **Input Fields**: Enter product name, net price, quantity, and VAT percentage.
   - **Add Item Button**: Adds the product to the receipt and displays details.
   - **Receipt Display**: Shows all added items with net, tax, and gross values.
   - **Finalize Receipt Button**: Shows a dialog with total net, tax, and gross amounts.
   - **Exit Button**: Closes the application.
3. **Actions**:
   - Click "Dodaj pozycje do paragonu" to add a product.
   - Click "Koniec wprowadzania danych do paragonu" to view the receipt summary.
   - Click "Koniec programu" to exit.

## File Structure
- `zad3/Okno_Graficzne.java`: Main Java file with GUI and receipt logic.
- `zad3/Paragon.java`: (Assumed) Handles receipt data and calculations.
- `zad3/Pobierz_Dane.java`: (Assumed) Validates and parses input data.
- `zad3/Produkt.java`: (Assumed) Represents a product with price and VAT.
- `zad3/PozycjaParagonu.java`: (Assumed) Represents a receipt item with quantity.
- `README.md`: This file, providing project documentation.

## Notes
- The app assumes the existence of `Paragon`, `Pobierz_Dane`, `Produkt`, and `PozycjaParagonu` classes for receipt logic and input validation.
- The GUI uses a null layout, which may not be ideal for responsive design; consider using a layout manager for production.
- Input fields are cleared after adding an item for convenience.
- The summary dialog uses HTML-like formatting but may not render as intended in `JOptionPane`.
- No database is used; receipt data is stored in memory during runtime.

## Contributing
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make changes and commit (`git commit -m "Add feature"`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact
For questions or feedback, open an issue on GitHub or contact the repository owner.