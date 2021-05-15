package generics;

public interface EntityRepository<T> extends Entity {
	void add(T entity);
	void delete(T entity);
	void update(T entity);

}
