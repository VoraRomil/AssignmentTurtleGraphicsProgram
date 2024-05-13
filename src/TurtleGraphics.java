import java.awt.Color;
import uk.ac.leedsbeckett.oop.OOPGraphics;
import java.util.ArrayList;
import java.util.List;

public class TurtleGraphics extends OOPGraphics {

    private List<String> commandList = new ArrayList<>();

    public TurtleGraphics() {
        // Ensure the turtle/pen starts in the middle of the canvas and pointing down
        extracted();
        turnLeft(270); // Point down
        penDown(); // Pen down by default
    }

	private void extracted() {
		move(getWidth() / 2, getHeight() / 2);
	}
	
	public void about() {
        super.about();
        System.out.println("This is TurtleGraphics class, overridden Romil Vora");
    }
	
	public void  square(int length)
	{
		for (int i = 0; i < 4; i++)
		{
			forward(length);
			turnRight(90);
		}
		reset;
		penDown;
		setStroke(2);
		setPenColour(Color.BLUE);
	}

    public void processCommand(String command) {
        if (command.equals("about")) {
            about();
            commandList.add(command);
        } else if (command.equals("penup")) {
            penUp();
            commandList.add(command);
        } else if (command.equals("pendown")) {
            penDown();
            commandList.add(command);
        } else if (command.startsWith("turnleft")) {
            if (command.contains(" ")) {
                int degrees = Integer.parseInt(command.split("\\s+")[1]);
                turnLeft(degrees);
            } else {
                turnLeft();
            }
            commandList.add(command);
        } else if (command.startsWith("turnright")) {
            if (command.contains(" ")) {
                int degrees = Integer.parseInt(command.split("\\s+")[1]);
                turnRight(degrees);
            } else {
                turnRight();
            }
            commandList.add(command);
        } else if (command.startsWith("forward")) {
            if (command.contains(" ")) {
                int distance;
                try {
                    distance = Integer.parseInt(command.split("\\s+")[1]);
                    forward(distance);
                    commandList.add(command);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid parameter for forward command: " + command);
                }
            } else {
                System.out.println("Missing parameter for forward command: " + command);
            }
        } else if (command.startsWith("backward")) {
            if (command.contains(" ")) {
                int distance;
                try {
                    distance = Integer.parseInt(command.split("\\s+")[1]);
                    forward(distance);
                    commandList.add(command);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid parameter for backward command: " + command);
                }
            } else {
                System.out.println("Missing parameter for backward command: " + command);
            }
        } else if (command.equals("black")) {
            setPenColour(Color.BLACK);
            commandList.add(command);
        } else if (command.equals("green")) {
            setPenColour(Color.GREEN);
            commandList.add(command);
        } else if (command.equals("red")) {
            setPenColour(Color.RED);
            commandList.add(command);
        } else if (command.equals("white")) {
            setPenColour(Color.WHITE);
            commandList.add(command);
        } else if (command.equals("reset")) {
            reset();
            commandList.add(command);
        } else if (command.equals("clear")) {
            clear();
            commandList.add(command);
        } else {
            System.out.println("Invalid command: " + command);
        }
    }

}
