package noppes.npcs.api.gui;

public interface IGuiTimer extends ICustomGuiComponent {

	int getColor();

	int getHeight();

	float getScale();

	String getText();

	int getWidth();

	IGuiTimer setColor(int color);

	IGuiTimer setScale(float scale);

	IGuiTimer setSize(int width, int height);

	void setTime(long start, long end);

}
