
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class SnakeGame2 extends JPanel implements ActionListener {

    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEIGHT = 400;
    private static final int UNIT_SIZE = 20;
    private static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / (UNIT_SIZE * UNIT_SIZE);

    private int delay = 200; // Default delay, changes with difficulty level

    private final int[] x = new int[GAME_UNITS];
    private final int[] y = new int[GAME_UNITS];
    private int bodyParts = 6;
    private int applesEaten;
    private int appleX;
    private int appleY;
    private int shrinkFoodX;
    private int shrinkFoodY;
    private char direction = 'R';
    private boolean running = false;
    private Timer timer;
    private Timer obstacleTimer;
    private Random random;
    private ArrayList<Point> obstacles;

    private enum GameStatus {
        START, RUNNING, GAME_OVER
    }

    private enum Difficulty {
        EASY, MEDIUM, HARD, VERY_HARD
    }

    private GameStatus gameStatus;
    private Difficulty difficulty;

    public SnakeGame2() {
        random = new Random();
        obstacles = new ArrayList<>();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        gameStatus = GameStatus.START;
        difficulty = Difficulty.EASY;
        startGame();
    }

    private void startGame() {
        x[0] = UNIT_SIZE;
        y[0] = UNIT_SIZE;
        applesEaten = 0;
        bodyParts = 6;
        obstacles.clear();
        newApple();
        newShrinkFood();
        running = true;
        timer = new Timer(delay, this);
        timer.start();
        obstacleTimer = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewObstacle();
            }
        });
        obstacleTimer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        if (gameStatus == GameStatus.START) {
            drawStartScreen(g);
        } else if (gameStatus == GameStatus.RUNNING) {
            drawGame(g);
        } else if (gameStatus == GameStatus.GAME_OVER) {
            drawGameOverScreen(g);
        }
    }

    private void drawStartScreen(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Ink Free", Font.BOLD, 40));
        g.drawString("Press Enter to Start", 150, SCREEN_HEIGHT / 2);
        g.drawString("Difficulty: " + difficulty, 200, SCREEN_HEIGHT / 2 + 50);
        g.setFont(new Font("Ink Free", Font.PLAIN, 20));
        g.drawString("Use 1-4 to set difficulty (1: Easy, 2: Medium, 3: Hard, 4: Very Hard)", 50, SCREEN_HEIGHT / 2 + 100);
    }

    private void drawGameOverScreen(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 40));
        g.drawString("Game Over!", 220, SCREEN_HEIGHT / 2 - 50);

        g.setColor(Color.white);
        g.setFont(new Font("Ink Free", Font.BOLD, 20));
        g.drawString("Press Enter to Restart", 230, SCREEN_HEIGHT / 2 + 20);
        g.drawString("Score: " + applesEaten, 260, SCREEN_HEIGHT / 2 + 50);
    }

    private void drawGame(Graphics g) {
        // Draw snake
        for (int i = 0; i < bodyParts; i++) {
            if (i == 0) {
                g.setColor(Color.green);
            } else {
                g.setColor(new Color(45, 180, 0));
            }
            g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
        }

        // Draw apple
        g.setColor(Color.red);
        g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

        // Draw shrink food
        g.setColor(Color.blue);
        g.fillOval(shrinkFoodX, shrinkFoodY, UNIT_SIZE, UNIT_SIZE);

        // Draw obstacles
        g.setColor(Color.gray);
        for (Point obstacle : obstacles) {
            g.fillRect(obstacle.x, obstacle.y, UNIT_SIZE, UNIT_SIZE);
        }

        // Draw game border
        g.setColor(Color.white);
        g.drawRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);

        // Draw score
        g.setColor(Color.white);
        g.setFont(new Font("Ink Free", Font.BOLD, 20));
        g.drawString("Score: " + applesEaten, 10, g.getFont().getSize());
    }

    private void newApple() {
        appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
    }

    private void newShrinkFood() {
        shrinkFoodX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        shrinkFoodY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
    }

    private void addNewObstacle() {
        int obstacleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        int obstacleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
        obstacles.add(new Point(obstacleX, obstacleY));
    }

    private void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        switch (direction) {
            case 'U':
                y[0] -= UNIT_SIZE;
                break;
            case 'D':
                y[0] += UNIT_SIZE;
                break;
            case 'L':
                x[0] -= UNIT_SIZE;
                break;
            case 'R':
                x[0] += UNIT_SIZE;
                break;
        }
    }

    private void checkApple() {
        if (x[0] == appleX && y[0] == appleY) {
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }

    private void checkShrinkFood() {
        if (x[0] == shrinkFoodX && y[0] == shrinkFoodY) {
            if (bodyParts > 1) {
                bodyParts--;
            }
            if (applesEaten > 0) {
                applesEaten--;
            }
            newShrinkFood();
        }
    }

    private void checkCollisions() {
        // Check if head collides with body
        for (int i = bodyParts; i > 0; i--) {
            if (x[0] == x[i] && y[0] == y[i]) {
                running = false;
                gameStatus = GameStatus.GAME_OVER;
            }
        }

        // Check if head touches left border
        if (x[0] < 0) {
            running = false;
            gameStatus = GameStatus.GAME_OVER;
        }

        // Check if head touches right border
        if (x[0] >= SCREEN_WIDTH) {
            running = false;
            gameStatus = GameStatus.GAME_OVER;
        }

        // Check if head touches top border
        if (y[0] < 0) {
            running = false;
            gameStatus = GameStatus.GAME_OVER;
        }

        // Check if head touches bottom border
        if (y[0] >= SCREEN_HEIGHT) {
            running = false;
            gameStatus = GameStatus.GAME_OVER;
        }

        // Check if head collides with obstacles
        for (Point obstacle : obstacles) {
            if (x[0] == obstacle.x && y[0] == obstacle.y) {
                running = false;
                gameStatus = GameStatus.GAME_OVER;
            }
        }

        if (!running) {
            timer.stop();
            obstacleTimer.stop();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApple();
            checkShrinkFood();
            checkCollisions();
        }
        repaint();
    }

    private void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
        switch (difficulty) {
            case EASY:
                delay = 200;
                break;
            case MEDIUM:
                delay = 150;
                break;
            case HARD:
                delay = 100;
                break;
            case VERY_HARD:
                delay = 50;
                break;
        }
        if (timer != null) {
            timer.setDelay(delay);
        }
    }

    private class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
                case KeyEvent.VK_ENTER:
                    if (gameStatus == GameStatus.START || gameStatus == GameStatus.GAME_OVER) {
                        gameStatus = GameStatus.RUNNING;
                        startGame();
                    }
                    break;
                case KeyEvent.VK_1:
                    setDifficulty(Difficulty.EASY);
                    break;
                case KeyEvent.VK_2:
                    setDifficulty(Difficulty.MEDIUM);
                    break;
                case KeyEvent.VK_3:
                    setDifficulty(Difficulty.HARD);
                    break;
                case KeyEvent.VK_4:
                    setDifficulty(Difficulty.VERY_HARD);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        SnakeGame2 gamePanel = new SnakeGame2();
        frame.add(gamePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snake Game");
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
