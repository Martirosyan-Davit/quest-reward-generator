# Quest Reward Generator

This project generates a sequence of quest rewards for a game. The rewards are represented by a string consisting of characters "b" (bronze chest) and "s" (silver chest). The sequence starts with a higher probability of "b" and transitions to a higher probability of "s" towards the end.

## Getting Started

These instructions will guide you through setting up and running the project on your local machine.

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A text editor or IDE (such as IntelliJ IDEA, Eclipse, or VSCode)
- Command-line interface (CLI)

### Installation

1. **Clone the repository:**

    ```sh
    git clone https://github.com/Martirosyan-Davit/quest-reward-generator.git
    cd quest-reward-generator
    ```

2. **Open the project in your preferred IDE:**
   - Open your IDE.
   - Select "Open project" and navigate to the `quest-reward-generator` directory.
   - The IDE should detect the `QuestRewardGenerator.java` file and open it.

### Running the Project

You can run the project directly from your IDE or using the command line.

#### Running from the Command Line

1. **Navigate to the project directory:**

    ```sh
    cd path/to/quest-reward-generator
    ```

2. **Compile the Java file:**

    ```sh
    javac QuestRewardGenerator.java && javac Main.java
    ```

3. **Run the compiled class:**

    ```sh
    java Main
    ```

4. **Follow the instructions:**
   - After running the command `java Main`, the program will prompt you to enter a number of quests.
   - Type a valid integer between 1 and 10,000 and press Enter.
   - The program will then generate and print the corresponding reward sequence.

#### Running from the IDE

1. **Open `Main.java` in your IDE.**
2. **Find the `main` method.**
3. **Click the "Run" button in your IDE (usually a green arrow).**
