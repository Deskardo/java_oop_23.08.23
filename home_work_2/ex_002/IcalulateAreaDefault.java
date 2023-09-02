package home_work_2.ex_002;

// дефолтный метод рассчета площади прямоугольника
interface IcalulateAreaDefault {

    default int calculateArea(int width, int height) {
        return width * height;
    }

}
