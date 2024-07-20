# DatabaseManager Script

## Overview

This Python script manages database connections and queries using the `mysql-connector-python` package. It includes functionality to connect to a MySQL database, execute queries, and close the connection.

## Attention Required!

⚠️ **IMPORTANT:** Before running the script, please ensure that you modify the database connection details in the `DatabaseManager` class according to your local MySQL setup.

## Configuration

To customize the script for your environment, follow these steps:

1. **Update Database Connection Details:**
    - Open the `DatabaseManager` class in the script.
    - Change the `host`, `user`, `password`, and `database` parameters to match your local MySQL server configuration.

    ```python
    manage = DatabaseManager('127.0.0.1', 'root', 'mody', 'film_database')
    ```

    - `host`: The address of your MySQL server (e.g., `'127.0.0.1'` for localhost).
    - `user`: Your MySQL username.
    - `password`: Your MySQL password.
    - `database`: The name of the database you want to connect to.

2. **Install Required Package:**
    - Ensure you have the `mysql-connector-python` package installed. You can install it using pip:

    ```bash
    pip install mysql-connector-python
    ```

3. **Run the Script:**
    - Execute the script to connect to your MySQL database and perform any operations defined in it.

    ```bash
    python your_script_name.py
    ```

## Notes

- **Connection Error Handling:** The script includes basic error handling to inform you if the connection fails.
- **Connection Closure:** The script ensures that the connection is properly closed after operations.

## Example Usage

Here’s an example of running the script:

```python
manage = DatabaseManager('127.0.0.1', 'root', 'your_password', 'your_database')
manage.connect()
# Add more operations here
manage.close_connection()
