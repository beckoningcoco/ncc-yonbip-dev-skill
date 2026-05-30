---
tags: [翻译档案, 翻译, 编码转ID, 业务单元, 用户, 交易类型, 物料, 供应商, 客户, 自定义档案, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-translate-archives.md]
---

# 旗舰版翻译档案代码汇总

> "翻译"指通过编码/名称/ID 查询对应档案的其他属性（如编码转 ID、ID 转名称）。本文汇总各档案的翻译方法。

## 翻译方法速查

| 档案 | 服务/API | URI |
|------|----------|-----|
| 业务单元 | `IOrgUnitQueryService.listIdsByCodes` / `getByCondition` | `org.func.BaseOrg` |
| 用户 | `billQueryRepository.queryBySchema` | `base.user.BipUser` |
| 交易类型 | `ITransTypeService.queryMultiLTransTypes` | - |
| 物料 | `IProductServiceV2.getProductByCode` | `pc.product.Product` |
| 供应商 | `IVendorPubQueryService` | `aa.vendor.Vendor` |
| 客户 | `IMerchantServiceV2` | `aa.merchant.Merchant` |
| 项目 | `IProjectService` | - |
| 自定义档案 | `DefDocListService` + `DefDocService` | - |

## 翻译的本质

将字段值（如部门 ID）映射到另一个档案中自动获取其他属性（名称、编码等），本质是预设的 SQL 关联查询。既可以"根据 ID 查名称"，也可以"根据编码查 ID"。

## 关键概念

- [[翻译档案]]
- [[IOrgUnitQueryService]]
- [[ITransTypeService]]
- [[IProductServiceV2]]
