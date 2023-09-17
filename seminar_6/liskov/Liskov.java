package seminar_6.liskov;

// class Rectangle {
//     protected int width;
//     protected int height;

//     public void setWidth(int width) {
//         this.width = width;
//     }

//     public void setHeight(int height) {
//         this.height = height;
//     }

//     public int getArea() {
//         return width * height;
//     }

// }

// class Square extends Rectangle {
//     @Override
//     public void setWidth(int width) {
//         this.width = width;
//         this.height = width; // Квадрат требует, чтоб высота равнялась ширине.
//     }

//     @Override
//     public void setHeight(int height) {
//         this.height = height;
//         this.width = height; // Аналогично
//     }
// }

interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}