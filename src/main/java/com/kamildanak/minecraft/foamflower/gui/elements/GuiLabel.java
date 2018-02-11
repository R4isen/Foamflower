package com.kamildanak.minecraft.foamflower.gui.elements;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;

public class GuiLabel extends GuiElement {
    private String caption;
    private int color;

    public GuiLabel(int x, int y, int w, int h, String caption, int color) {
        super(x, y, w, h);
        this.caption = I18n.format(caption).trim();
        this.color = color;
    }

    public GuiLabel(int x, int y, String caption, int color) {
        this(x, y, 0, 0, caption, color);
    }

    public GuiLabel(int x, int y, int w, int h, String caption) {
        this(x, y, w, h, caption, 0x404040);
    }

    public GuiLabel(int x, int y, String caption) {
        this(x, y, 0, 0, caption, 0x404040);
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = I18n.format(caption).trim();
    }

    @Override
    public void render() {
        if (hidden) return;
        GlStateManager.color(0, 0, 0, 0);
        gui.drawString(caption, getX(), getY() + 1, color);
    }

    @Override
    public int getHeight() {
        if (hidden) return 0;
        if (gui.fontRenderer() != null) return gui.fontRenderer().FONT_HEIGHT + 2;
        return 0;
    }

    @Override
    public int getWidth() {
        if (hidden) return 0;
        if (gui.fontRenderer() != null) return gui.fontRenderer().getStringWidth(caption);
        return 0;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
