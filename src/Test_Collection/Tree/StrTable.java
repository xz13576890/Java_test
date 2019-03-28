package Test_Collection.Tree;

/**
 * NameTable 记录人名的表格
 * 由ID 建立索引
 */
public interface StrTable {
    String lookup(String id);
    void insert(String id, String  name);

}
