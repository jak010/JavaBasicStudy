package CleanCodeThink.LSP;


// 직사각형은 정사각형이 아니지만
// 정사각형은 직사각형이다

import org.w3c.dom.css.Rect;

// 직사각형
class Rectangle {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

}

// 정사각형
// 정사각형은 가로와 세로의 길이가 같으므로
// setWidth()나 setHeight()를 호출하면 가로와 세로를 모두 값을 바꿔줘야함
class Square extends Rectangle {

    @Override
    public void setWidth(final int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(final int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}


public class Example01 {

    void increaseHeight(final Rectangle rectangle) {

        if (rectangle instanceof Square) { // OCP 위반
            throw new IllegalArgumentException();
        }


        if (rectangle.getHeight() <= rectangle.getWidth()) {
            rectangle.setHeight(rectangle.getHeight() + 1);
        }
    }


    public static void main(String[] args) {


    }
}
