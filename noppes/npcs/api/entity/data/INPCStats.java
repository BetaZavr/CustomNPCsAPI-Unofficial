package noppes.npcs.api.entity.data;

public interface INPCStats {

	int getAggroRange();

	int getCombatRegen();

	int getCreatureType();

	int getHealthRegen();

	boolean getHideDeadBody();

	boolean getImmune(int type);

	int getLevel();

	double getMaxHealth();

	INPCMelee getMelee();

	INPCRanged getRanged();

	int getRarity();

	String getRarityTitle();

	float getResistance(String damageName);
	
	String[] getResistanceKeys();

	int getRespawnTime();

	int getRespawnType();

	boolean isCalmdown();

	void setAggroRange(int range);

	void setCalmdown(boolean bo);

	void setCombatRegen(int regen);

	void setCreatureType(int type);

	void setHealthRegen(int regen);

	void setHideDeadBody(boolean hide);

	void setImmune(int type, boolean bo);

	void setLevel(int level);

	void setMaxHealth(double maxHealth);

	void setRarity(int rarity);

	void setRarityTitle(String rarity);

	void setResistance(String damageName, float value);

	void setRespawnTime(int seconds);

	void setRespawnType(int type);

}
