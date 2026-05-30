---
tags: [BIP, OpenAPI, 工具类, 后端]
created: 2026-05-28
updated: 2026-05-28
sources: [2026-05-28-maogeping-bip-v5-code-reference]
---

# YonbipUtil

> BIP OpenAPI 调用中心，封装所有平台 API 调用，是客开代码与 BIP 平台交互的核心工具类。

## 核心方法

### doPost — 标准 POST 调用

```java
private Object doPost(String url, Map<String, Object> reqBody) {
    HttpOptions httpOptions = new HttpOptions();
    httpOptions.setSocketTimeout(180000);  // 长耗时操作关键配置

    InputParam inputParam = InputParam.build()
            .setUrl(url).setBody(reqBody)
            .setContentType(InputParam.CONTENT_TYPE_JSON)
            .setMethod(InputParam.METHOD_POST);

    OpenServiceBuilder builder = OpenServiceBuilder.build()
            .appKey(appKey).appSecret(appSecret).env(env)
            .inputParam(inputParam);

    Map<String, Object> result = Invoke.getResult(builder, inputParam);
    if (!"200".equals(result.get("code"))) {
        throw new BusinessException(result.get("code").toString(),
                result.get("message").toString());
    }
    return result.get("data");
}
```

### doGet — 标准 GET 调用

```java
private Object doGet(String url) {
    InputParam inputParam = InputParam.build()
            .setUrl(url).setMethod(InputParam.METHOD_GET);
    // ... 同 doPost 的 builder 和 result 处理
}
```

## 按领域分类的方法

### 应付 (FI-AP)
`savePayable`, `submitPayable`, `auditPayable`, `deletePayable`, `unAuditPayable`, `paybillHxPayable`

### 付款 (FI-Payment)
`savePayment`, `submitPayment`, `auditPayment`, `deletePayment`

### 收款 (FI-Collection)
`saveCollection`, `auditCollection`, `submitCollection`, `deleteCollection`

### 资金 (CTM)
`saveFundPayment`, `submitFundPayment`, `deleteFundPayment`, `fundSave`

### 销售 (SD)
`saveSaleOrder`, `batchAuditSaleOrder`, `saveSaleInvoice`, `deleteSaleInvoice`

### 供应链 (SCM)
`saveOthIn`, `auditOthIn`, `saveOthOut`, `saveTransferApply`, `mergeSaveStorein`

### 制造 (MFG)
`openOutApply`, `closeOutApply`, `changeOutApply`, `saveProOrderChange`

### 参考数据查询
`queryBustypeByCode`, `queryCurrencyByCode`, `queryProductByCode`, `queryProjectByCode`, `queryCustomerByCode`, `queryDefDocByCode`

## 配置依赖

通过 `@Value` 注入：`yonbip.app_key`, `yonbip.app_secret`, `yonbip.env`

## 注入的服务

`ITransTypeService`, `ITenantCurrencyService`, `IProductServiceV2`, `IProjectService`, `DefDocService`, `IBillQueryRepository`, `IMerchantServiceV2`

## 相关页面

- [[IBillQueryRepository]]
- [[API调用]]
- [[BIP后端开发模板]]
- [[毛戈平 BIP V5 客开代码参考]]
