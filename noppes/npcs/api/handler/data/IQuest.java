package noppes.npcs.api.handler.data;

import noppes.npcs.api.IContainer;
import noppes.npcs.api.entity.ICustomNpc;
import noppes.npcs.api.entity.IPlayer;

public interface IQuest {

	IQuestObjective addTask();

	IQuestCategory getCategory();

	ICustomNpc<?> getCompleterNpc();

	String getCompleteText();

	int getExtraButton();

	String getExtraButtonText();

	int[] getForgetDialogues();

	int[] getForgetQuests();

	int getId();

	boolean getIsRepeatable();

	int getLevel();

	String getLogText();

	String getName();

	IQuest getNextQuest();

	IQuestObjective[] getObjectives(IPlayer<?> player);

	IContainer getRewards();

	int getRewardType();

	String getTitle();

	boolean isCancelable();

	boolean isSetUp();

	boolean removeTask(IQuestObjective task);

	void save();

	void sendChangeToAll();

	void setCancelable(boolean cancelable);

	void setCompleterNpc(ICustomNpc<?> npc);

	void setCompleteText(String text);

	void setExtraButton(int type);

	void setExtraButtonText(String hover);

	void setForgetDialogues(int[] forget);

	void setForgetQuests(int[] forget);

	void setLevel(int level);

	void setLogText(String text);

	void setName(String name);

	void setNextQuest(IQuest quest);

	void setRewardText(String text);

	void setRewardType(int type);

}
