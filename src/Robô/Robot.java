//Feito por Yuri Barbosa de Almeida e Pedro Henrique Costa de Gois

package Robô;

import java.lang.reflect.Field;

public class Robot extends Mobile {

	private State state = State.CENTER;

	private int topLimit, bottomLimit, leftLimit, rightLimit;
	private Move currentDir = Move.RIGHT;
	private int steps = 0;
	private int maxSteps = 0;
	private boolean spiralInitialized = false;

	public Robot() {
	}

	public Move move() {
		switch (state) {
			case STOP:
				return Move.STOP;
			case CENTER:
				return goCenter();
			case TOP_LEFT:
				return goTopLeft();
			case SPIRAL:
				return executeSpiralMove();
		}
		return Move.STOP;
	}

	public void setState(State newState) {
		this.state = newState;
		if (newState == State.SPIRAL) {
			this.spiralInitialized = false;
		}
	}

	private int getPrivateInt(Matrix matrix, String fieldName) {
		try {
			Field f = matrix.getClass().getDeclaredField(fieldName);
			f.setAccessible(true);
			return f.getInt(matrix);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao acessar campo " + fieldName, e);
		}
	}

	private int getPrivateStaticInt(Class<?> clazz, String fieldName) {
		try {
			Field f = clazz.getDeclaredField(fieldName);
			f.setAccessible(true);
			return f.getInt(null);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao acessar campo estático " + fieldName, e);
		}
	}

	private Move goCenter() {
		Matrix matrix = this.GPS;
		int line = matrix.getLine(getId());
		int col = matrix.getColumn(getId());

		int borderBottom = getPrivateInt(matrix, "border_bottom");
		int borderRight = getPrivateInt(matrix, "border_right");
		int borderTop = getPrivateStaticInt(Matrix.class, "BORDER_TOP");
		int borderLeft = getPrivateStaticInt(Matrix.class, "BORDER_LEFT");

		int centerLine = (borderBottom + borderTop) / 2;
		int centerCol = (borderRight + borderLeft) / 2;

		if (line > centerLine) {
			return Move.UP;
		} else if (line < centerLine) {
			return Move.DOWN;
		} else if (col > centerCol) {
			return Move.LEFT;
		} else if (col < centerCol) {
			return Move.RIGHT;
		} else {
			this.state = State.STOP;
			return Move.STOP;
		}
	}

	private Move goTopLeft() {
		Matrix matrix = this.GPS;
		int line = matrix.getLine(getId());
		int col = matrix.getColumn(getId());

		int borderTop = getPrivateStaticInt(Matrix.class, "BORDER_TOP");
		int borderLeft = getPrivateStaticInt(Matrix.class, "BORDER_LEFT");

		if (line > borderTop) {
			return Move.UP;
		} else if (col > borderLeft) {
			return Move.LEFT;
		} else {
			this.state = State.STOP;
			return Move.STOP;
		}
	}

	private void initSpiral() {
		Matrix matrix = this.GPS;
		topLimit = getPrivateStaticInt(Matrix.class, "BORDER_TOP");
		leftLimit = getPrivateStaticInt(Matrix.class, "BORDER_LEFT");
		bottomLimit = getPrivateInt(matrix, "border_bottom");
		rightLimit = getPrivateInt(matrix, "border_right");
		currentDir = Move.RIGHT;
		steps = 0;
		maxSteps = rightLimit - leftLimit;
	}

	private Move executeSpiralMove() {
		Matrix matrix = this.GPS;
		int line = matrix.getLine(getId());
		int col = matrix.getColumn(getId());
		int borderTop = getPrivateStaticInt(Matrix.class, "BORDER_TOP");
		int borderLeft = getPrivateStaticInt(Matrix.class, "BORDER_LEFT");

		if (!spiralInitialized) {
			if (line > borderTop) {
				return Move.UP;
			}
			if (col > borderLeft) {
				return Move.LEFT;
			}
			initSpiral();
			this.spiralInitialized = true;
		}
		return spiral();
	}

	private Move spiral() {
		Matrix matrix = this.GPS;
		int line = matrix.getLine(getId());
		int col = matrix.getColumn(getId());

		int centerLine = (getPrivateInt(matrix, "border_bottom") + getPrivateStaticInt(Matrix.class, "BORDER_TOP")) / 2;
		int centerCol = (getPrivateInt(matrix, "border_right") + getPrivateStaticInt(Matrix.class, "BORDER_LEFT")) / 2;

		if(line == centerLine && col == centerCol) {
			this.state = State.STOP;
			return Move.STOP;
		}

		// CORREÇÃO PRINCIPAL: Lógica de curva e contagem de passos
		if (steps >= maxSteps) {
			steps = 0;
			switch (currentDir) {
				case RIGHT:
					currentDir = Move.DOWN;
					topLimit++;
					maxSteps = bottomLimit - topLimit;
					break;
				case DOWN:
					currentDir = Move.LEFT;
					rightLimit--;
					maxSteps = rightLimit - leftLimit;
					break;
				case LEFT:
					currentDir = Move.UP;
					bottomLimit--;
					maxSteps = bottomLimit - topLimit;
					break;
				case UP:
					currentDir = Move.RIGHT;
					leftLimit++;
					maxSteps = rightLimit - leftLimit;
					break;
				default:
					break;
			}
		}

		steps++;
		return currentDir;
	}
}