#concentric circles example

from graphics import *

def main():

    win = GraphWin("Circles",400,400)

    center_point = Point(200,200)
    radius = 10

    for i in range(3):
        draw_circle(center_point, radius, "cyan", win)
        radius = radius+10
        draw_circle(center_point, radius, "red", win)
        radius = radius+10
        draw_circle(center_point, radius, "blue", win)
        radius = radius+10
        draw_circle(center_point, radius, "purple", win)
        radius = radius+10
        draw_circle(center_point, radius, "green", win)
        radius = radius+10

    win.getMouse()
    win.close()


def draw_circle(center, r, color, win):
    cir = Circle(center, r)
    cir.setOutline(color)
    cir.draw(win)


main()