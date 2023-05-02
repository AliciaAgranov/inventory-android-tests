package com.inventory.manager;

import com.inventory.tests.TestBase;

public class Point extends TestBase {

    public int x;
    public int y;

    public Point (int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getX()
    {
        return x;
    }

    public int getY() {
        return y;
    }
    public Point moveBy(int xOffset, int yOffset)
    {
        return new Point(x+xOffset, y+yOffset);
    }
}
