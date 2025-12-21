@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repo;

    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public Product addProduct(Product product) {
        if (product.getModelNumber() == null || product.getModelNumber().isBlank()) {
            throw new RuntimeException("Model number required");
        }
        if (product.getCategory() == null || product.getCategory().isBlank()) {
            throw new RuntimeException("Category required");
        }
        return repo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }
}
