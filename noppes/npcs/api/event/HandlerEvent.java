package noppes.npcs.api.event;

import noppes.npcs.api.handler.IFactionHandler;
import noppes.npcs.api.handler.IRecipeHandler;

public class HandlerEvent {

	public static class FactionsLoadedEvent extends CustomNPCsEvent {
		public IFactionHandler handler;

		public FactionsLoadedEvent(IFactionHandler handler) {
			this.handler = handler;
		}
	}

	public static class RecipesLoadedEvent extends CustomNPCsEvent {
		public IRecipeHandler handler;

		public RecipesLoadedEvent(IRecipeHandler handler) {
			this.handler = handler;
		}
	}

}
