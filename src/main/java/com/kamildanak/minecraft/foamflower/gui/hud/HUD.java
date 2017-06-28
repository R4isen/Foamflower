package com.kamildanak.minecraft.foamflower.gui.hud;

import com.kamildanak.minecraft.foamflower.Utils;
import com.kamildanak.minecraft.foamflower.gui.IGuiWrapper;
import com.kamildanak.minecraft.foamflower.gui.elements.GuiElement;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;

public abstract class HUD extends GuiScreen implements IGuiWrapper {
    private Minecraft mc;

    public HUD(Minecraft mc) {
        this.mc = mc;
    }

    public void render() {
        getRoot().render();
    }

    public abstract GuiElement getRoot();

    @Override
    public FontRenderer fontRenderer() {
        return mc.fontRenderer;
    }

    @Override
    public void bindTexture(String texture) {
        Utils.bind(texture);
    }

    @Override
    public void drawString(String text, int sx, int sy, int color) {
        mc.fontRenderer.drawString(text, sx, sy, color);
    }

    @Override
    public void drawTiledRect(int x2, int y, int w2, int h1, int u2, int v1, int texw2, int texh1) {

    }

    public void drawTexturedRectangle(int x, int y, int textureX, int textureY, int width, int height) {
        super.drawTexturedModalRect(x, y, textureX, textureY, width, height);
    }

    @Override
    public void drawCenteredString(String caption, int i, int i1, int color) {

    }

    public Minecraft getMinecraft() {
        return mc;
    }

}
