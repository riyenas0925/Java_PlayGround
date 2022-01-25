package factorymethod.framework;

/*
    Template Method 패턴 사용

    하위 클래스에서 수행
    * createProduct : 제품을 만든다.
    * registerProduct : 제품을 등록한다.
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
