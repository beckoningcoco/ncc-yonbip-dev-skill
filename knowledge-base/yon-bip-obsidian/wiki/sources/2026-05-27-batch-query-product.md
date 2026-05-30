---
tags: [物料查询, IProductServiceV2, 批量查询, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-batch-query-product.md]
---

# 旗舰版批量根据物料编码查询物料信息

> 使用 IProductServiceV2.listProductInfo 批量根据物料编码查询物料信息（如单位 ID）。

## 代码

```java
@Autowired
private IProductServiceV2 productService;

public Map<String, String> batchGetProductUnitId(List<String> productCodes) {
    ProductQryDTO qryDTO = new ProductQryDTO();
    qryDTO.setProductCodeList(productCodes);
    List<ProductDTO> list = productService.listProductInfo(qryDTO, new String[]{"id", "code", "unitId"});
    // 构建 code -> unitId 的 Map
}
```

`listProductInfo` 第二个参数指定需要返回的字段数组。

## 关键概念

- [[IProductServiceV2]]
- [[物料编码]]
- [[ProductDTO]]
