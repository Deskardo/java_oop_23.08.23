package home_work_3.ex_002;

// дефолтный метод рассчета площади прямоугольника
interface IcalulateAreaDefault {

    default int calculateArea(int width, int height) {
        return width * height;
    }

}
