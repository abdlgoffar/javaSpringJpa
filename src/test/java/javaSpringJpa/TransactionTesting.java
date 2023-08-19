package javaSpringJpa;

import javaSpringJpa.services.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionTesting {
    @Autowired
    private CategoryService categoryService;

    @Test
    void failedTransactional() {
        this.categoryService.create();
    }

    @Test
    void successTransactional() {
        this.categoryService.operationDatabaseWithTransaction();
    }
}
