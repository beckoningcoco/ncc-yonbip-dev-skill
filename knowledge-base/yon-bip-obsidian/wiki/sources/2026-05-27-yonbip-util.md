---
tags: [YonBipUtil, 工具类, OpenAPI, 应收发票, 文件上传, 员工查询]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-yonbip-util.md]
---

# YonBipUtil

> 封装调用 BIP 开放平台 API 的工具类，集成 IYmsJdbcApi、YmsHttpClient、YonBipHttpUtil。

## 核心方法

| 方法 | 功能 |
|------|------|
| `saveReceivable(Map)` | 应收发票保存，调 `/yonbip/EFI/receivable/save` |
| `querystaffDetail(Map)` | 员工信息查询，调 `/yonbip/hrcloud/staff/listmdd` |
| `uploadFile(type, id, name, base64)` | 文件上传，调 `/yonbip/uspace/iuap-apcom-file` |
| `queryBipUser(code)` | 通过编码查询用户，调 `/yonbip/digitalModel/userCode/getByCode` |
| `queryCostCenter(code)` | 成本中心批量查询，调 `/yonbip/AMP/bd/v1/costcenter` |

## 依赖注入

使用 `@Qualifier("yonbip")` 注入 YmsHttpClient，通过 YonBipHttpUtil 获取 access_token 后调用 API。

## 关键概念

- [[YmsHttpClient]]
- [[OpenAPI 调用]]
- [[YonBipHttpUtil]]
