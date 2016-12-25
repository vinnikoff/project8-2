/**
 * Created by VINNI on 25.12.16.
 */
public interface AbstractDAO<T> {

    T save(T);
    void delete(T);
    void deleteAll(List T);
    void saveAll(List T);
    List<T> getList();
    void deleteByld(long id);
    T get(long id);

}
