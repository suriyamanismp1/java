/*import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BreakoutBall extends JFrame implements ActionListener, KeyListener {

    // Constants
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int PADDLE_WIDTH = 80;
    private static final int PADDLE_HEIGHT = 10;
    private static final int BALL_DIAMETER = 20;
    private static final int BRICK_WIDTH = 70;
    private static final int BRICK_HEIGHT = 30;
    private static final int NUM_BRICKS = 60;
    private static final int TIMER_DELAY = 10;
    private static final int GAME_TIME = 60;
    private static final int SCORE_MULTIPLIER = 10;

    // Variables
    public Paddle paddle1;
    private Paddle paddle2;
    private Ball ball;
    private Brick[] bricks;
    private Timer timer;
    private int timeRemaining;
    private int player1Score;
    private int player2Score;
    private boolean isMultiplayer;
    private boolean isGameStarted;
    private JLabel timeLabel;
    private JLabel player1ScoreLabel;
    private JLabel player2ScoreLabel;
    private JLabel winnerLabel;

    // Constructor
    public BreakoutBall(boolean isMultiplayer) {
        this.isMultiplayer = isMultiplayer;

        // Set up window
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Breakout Game");
        setResizable(false);

        // Set up game objects
        paddle1 = new Paddle(WIDTH / 2 - PADDLE_WIDTH / 2, HEIGHT - PADDLE_HEIGHT - 20, PADDLE_WIDTH, PADDLE_HEIGHT, Color.BLUE);
        if (isMultiplayer) {
            paddle2 = new Paddle(WIDTH / 2 - PADDLE_WIDTH / 2, 10, PADDLE_WIDTH, PADDLE_HEIGHT, Color.RED);
        }
        ball = new Ball(WIDTH / 2 - BALL_DIAMETER / 2, HEIGHT / 2 - BALL_DIAMETER / 2, BALL_DIAMETER, BALL_DIAMETER, Color.BLACK);
        bricks = new Brick[NUM_BRICKS];
        for (int i = 0; i < NUM_BRICKS; i++) {
            int x = (i % 10) * (BRICK_WIDTH + 2) + 1;
            int y = (i / 10) * (BRICK_HEIGHT + 2) + 50;
            bricks[i] = new Brick(x, y, BRICK_WIDTH, BRICK_HEIGHT, Color.GREEN);
        }

        // Set up timer
        timer = new Timer(TIMER_DELAY, this);

        // Set up labels
        timeRemaining = GAME_TIME;
        timeLabel = new JLabel("Time: " + timeRemaining);
        player1Score = 0;
        player1ScoreLabel = new JLabel("Player 1 Score: " + player1Score);
        player2Score = 0;
        player2ScoreLabel = new JLabel("Player 2 Score: " + player2Score);
        winnerLabel = new JLabel("");
        //timeLabel.setBounds(10,0);
        // Set up labels (continued)
        player1ScoreLabel.setBounds(WIDTH / 2 - 80, 0, 160, 20);
        if (isMultiplayer) {
            player2ScoreLabel.setBounds(WIDTH / 2 - 80, HEIGHT - 20, 160, 20);
        } else {
            player2ScoreLabel.setBounds(WIDTH / 2 - 80, HEIGHT - 40, 160, 20);
        }
        winnerLabel.setBounds(WIDTH / 2 - 80, HEIGHT / 2 - 20, 160, 40);

        // Add components to window
        add(paddle1);
        if (isMultiplayer) {
            add(paddle2);
        }
        add(ball);
        for (int i = 0; i < NUM_BRICKS; i++) {
            add(bricks[i]);
        }
        add(timeLabel);
        add(player1ScoreLabel);
        add(player2ScoreLabel);
        add(winnerLabel);

        // Add listeners
        addKeyListener(this);

        // Start game
        isGameStarted = false;
        startGame();
    }

    // Start the game
    private void startGame() {
        ball.resetPosition();
        paddle1.resetPosition();
        if (isMultiplayer) {
            paddle2.resetPosition();
        }
        for (int i = 0; i < NUM_BRICKS; i++) {
            bricks[i].setVisible(true);
        }
        player1Score = 0;
        player1ScoreLabel.setText("Player 1 Score: " + player1Score);
        player2Score = 0;
        player2ScoreLabel.setText("Player 2 Score: " + player2Score);
        timeRemaining = GAME_TIME;
        timeLabel.setText("Time: " + timeRemaining);
        winnerLabel.setText("");
        timer.start();
        isGameStarted = true;
    }

    // Handle timer events
    public void actionPerformed(ActionEvent e) {
        if (isGameStarted) {
            // Move ball
            ball.move();

            // Check if ball hits paddle
            if (ball.intersects(paddle1)) {
                ball.bounceUp();
                player1Score += SCORE_MULTIPLIER;
                player1ScoreLabel.setText("Player 1 Score: " + player1Score);
            }
            if (isMultiplayer && ball.intersects(paddle2)) {
                ball.bounceDown();
                player2Score += SCORE_MULTIPLIER;
                player2ScoreLabel.setText("Player 2 Score: " + player2Score);
            }

            // Check if ball hits brick
            for (int i = 0; i < NUM_BRICKS; i++) {
                if (bricks[i].isVisible() && ball.intersects(bricks[i])) {
                    ball.bounce();
                    bricks[i].setVisible(false);
                    if (i % 2 == 0) {
                        player1Score += SCORE_MULTIPLIER;
                        player1ScoreLabel.setText("Player 1 Score: " + player1Score);
                    } else {
                        player2Score += SCORE_MULTIPLIER;
                        player2ScoreLabel.setText("Player 2 Score: " + player2Score);
                    }
                }
            }

            // Check if ball hits wall
            if (ball.getX() < 0 || ball.getX() + ball.getWidth() > WIDTH) {
                ball.bounceSide();
            }
            if (ball.getY() < 0) {
                ball.bounceUp();
            }
            if (ball.getY() + ball.getHeight() > HEIGHT) {
                if (isMultiplayer) {
                    ball.resetPosition();
                    paddle1.resetPosition();
                    paddle2.resetPosition();
                    player1Score = 0;
                    player1ScoreLabel.setText("Player 1 Score: " + player1Score);
                    player2Score = 0;
                    player2ScoreLabel.setText("Player 2 Score: " + player2Score);
                } else {
                    // Single player mode
                    timer.stop();
                    winnerLabel.setText("Game Over!");
                    isGameStarted = false;
                }
            }

            // Update time label
            timeRemaining--;
            if (timeRemaining == 0) {
                timer.stop();
                isGameStarted = false;
                int winner = player1Score > player2Score ? 1 : 2;
                winnerLabel.setText("Player " + winner + " Wins!");
            } else {
                timeLabel.setText("Time: " + timeRemaining);
            }
        }

        // Repaint window
        repaint();
    }

    // Handle key events
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            paddle1.moveLeft();
        } else if (key == KeyEvent.VK_RIGHT) {
            paddle1.moveRight();
        } else if (isMultiplayer && key == KeyEvent.VK_A) {
            paddle2.moveLeft();
        } else if (isMultiplayer && key == KeyEvent.VK_D) {
            paddle2.moveRight();
        } else if (key == KeyEvent.VK_SPACE && !isGameStarted) {
            startGame();
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    // Main method
    public static void main(String[] args) {
        JFrame frame = new JFrame("Breakout Ball");
        BreakoutBall game = new BreakoutBall();
        frame.getContentPane().add(game);
        frame.pack();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
*/