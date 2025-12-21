public interface WarrantyRepository extends JpaRepository<Warranty, Long> {
    boolean existsBySerialNumber(String serialNumber);
    List<Warranty> findByUserId(Long userId);
    List<Warranty> findByExpiryDateBetween(LocalDate start, LocalDate end);
}
