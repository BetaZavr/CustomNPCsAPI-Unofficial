package noppes.npcs.api;

import net.minecraft.nbt.NBTBase;
import noppes.npcs.api.entity.IEntity;
import noppes.npcs.util.RayTraceResults;
import noppes.npcs.util.RayTraceRotate;
import noppes.npcs.util.RayTraceVec;

public interface IMetods {

	String deleteColor(String str);

	double distanceTo(double x0, double y0, double z0, double x1, double y1, double z1);

	double distanceTo(IEntity<?> entity, IEntity<?> target);

	RayTraceRotate getAngles3D(double dx, double dy, double dz, double mx, double my, double mz);

	RayTraceRotate getAngles3D(IEntity<?> entity, IEntity<?> target);

	String getJSONStringFromObject(Object obj);

	RayTraceVec getPosition(double cx, double cy, double cz, double yaw, double pitch, double radius);

	RayTraceVec getPosition(IEntity<?> entity, double yaw, double pitch, double radius);

	RayTraceVec getVector3D(double dx, double dy, double dz, double mx, double my, double mz);

	RayTraceVec getVector3D(IEntity<?> entity, IEntity<?> target);

	RayTraceVec getVector3D(IEntity<?> entity, IPos pos);

	RayTraceResults rayTraceBlocksAndEntitys(IEntity<?> entity, double yaw, double pitch, double distance);

	Object readObjectFromNbt(NBTBase tag);

	IEntity<?> transferEntity(IEntity<?> entity, int dimension, IPos pos);

	NBTBase writeObjectToNbt(Object value);

}
