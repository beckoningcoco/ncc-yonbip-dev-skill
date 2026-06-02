---
tags: [BIP, 元数据, 数据字典, sa, sa.agent.AgentProductRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 客户商品对照表 (`sa.agent.AgentProductRelation`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `agentproductrelation` | 应用: `SCMSA` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户商品对照表 |
| 物理表 | `agentproductrelation` |
| 应用 | `SCMSA` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `id` | `id` | |

## 部署信息

- 部署时间: 2026-05-22 23:41:56:000
- 安装来源: `/app/uorders/ubill/src/ubill-server/scripts/db/patch/mongodb/V5_R0_2507/0001_udinghuo/0010_iuap_common/DML/0270_iuap_metadata/202602/202601132018_metadata_sa-agent_delta.zip`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `isMain`, `doc`

## 依赖接口（5 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| IShop (`IShop`) | `base.itf.IShop` | 65 | 1 |
| IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |
| IEnable (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 全部属性（46 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `agentCategoryId` | agentCategoryId | `iagentcategoryid` | 3198ce2d-0e64-462d-bacf-54d18171756a | `quote` |  | true |
| 2 | `agentId` | agentId | `iagentId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 3 | `agentLevelId` | agentLevelId | `iAgentLevelId` | 40e121d8-8927-4bf1-ba4f-22a7b9f7b3b5 | `quote` |  | true |
| 4 | `agentRelationId` | agentRelationId | `iagentrelationid` | c6b2ce53-9c17-45ca-b313-c775c94bc001 | `quote` |  | true |
| 5 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 7 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 8 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 9 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 10 | `merchantAuth` | merchantAuth | `iAgentId` | 7cc86f92-b244-4581-8dcf-a6b7cb76516f | `quote` |  | true |
| 11 | `minOrderQty` | minOrderQty | `iminorderqty` | Decimal | `number` |  | true |
| 12 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 13 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 16 | `productAuth` | 产品权限 | `iProductId` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 | `quote` |  | true |
| 17 | `productClassId` | 产品分类ID | `iproductclassid` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | `quote` |  | true |
| 18 | `productId` | productId | `iproductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | true |
| 19 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true |
| 20 | `salesOrgId` | salesOrgId | `isalesorgid` | 4991976e-11ee-406e-bdbb-0f73f9f89ff2 | `quote` |  | true |
| 21 | `shop` | shop | `iShopID` | Long | `long` |  | true |
| 22 | `skuId` | skuId | `iskuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |  | true |
| 23 | `taxCode` | tax编码 | `cTaxCode` | String | `text` |  | true |
| 24 | `taxId` | taxId | `cTaxId` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | true |
| 25 | `taxItems` | taxItems | `cTaxItems` | String | `text` |  | true |
| 26 | `taxRate` | 税率 | `fTaxRate` | Decimal | `number` |  | true |
| 27 | `transactionTypeId` | transactionTypeId | `iTransactionTypeId` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | true |
| 28 | `transactionTypeId_name` | transactionTypeId名称 | `transactionTypeId_name` | String | `text` |  | true |
| 29 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |  | true |
| 30 | `agentProductApplyRange` | agentProductApplyRange | `` | 71db33ee-cc2b-44cc-8fdf-3a5b24758870 | `` |  |  |
| 31 | `detail` | etail(日期) | `` | 001a4eb5-247b-4deb-b48d-fd57901e8704 | `` |  |  |
| 32 | `disablets` | isablets(日期) | `disablets` | DateTime | `dateTime` |  | true |
| 33 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |  | true |
| 34 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |  | true |
| 35 | `iProductAuxUnitId` | iProductAuxUnitId | `iunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | true |
| 36 | `iProductUnitId` | iProductUnitId | `iProductUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | true |
| 37 | `invExchRate` | nvExchRate(ID) | `fAuxExchangeRate` | Decimal | `number` |  | true |
| 38 | `invExchRateDen` | nvExchRateDen(ID) | `invexchrateden` | Decimal | `number` |  | true |
| 39 | `invExchRateNum` | nvExchRateNum(ID) | `invexchratenum` | Decimal | `number` |  | true |
| 40 | `invPriceExchRate` | nvPriceExchRate(ID) | `fMainExchangeRate` | Decimal | `number` |  | true |
| 41 | `invPriceExchRateDen` | nvPriceExchRateDen(ID) | `invpriceexchrateden` | Decimal | `number` |  | true |
| 42 | `invPriceExchRateNum` | nvPriceExchRateNum(ID) | `invpriceexchratenum` | Decimal | `number` |  | true |
| 43 | `masterUnitId` | masterUnitId | `masterUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | true |
| 44 | `productUnitName` | productUnit名称 | `cProductUnitName` | String | `text` |  | true |
| 45 | `unitName` | 单位名称 | `cProductAuxUnitName` | String | `text` |  | true |
| 46 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |

## 关联属性（20 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `agentId` | agentId | `aa.merchant.Merchant` | `iagentId` | 外键 |  |  | Service |  |
| 2 | `productClassId` | 产品分类ID | `pc.cls.PresentationClass` | `iproductclassid` | 外键 |  |  | Service |  |
| 3 | `agentLevelId` | agentLevelId | `aa.agentlevel.AgentLevel` | `iAgentLevelId` | 外键 |  |  | Service |  |
| 4 | `iProductAuxUnitId` | iProductAuxUnitId | `pc.unit.Unit` | `iunitid` | 外键 |  |  | Service |  |
| 5 | `productId` | productId | `pc.product.Product` | `iproductid` | 外键 |  |  | Service |  |
| 6 | `transactionTypeId` | transactionTypeId | `bd.bill.TransType` | `iTransactionTypeId` | 外键 |  |  | Service |  |
| 7 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 8 | `merchantAuth` | merchantAuth | `pb.dataauth.MerchantAuthDataAuth` | `iAgentId` | 外键 |  |  | None |  |
| 9 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 10 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 11 | `agentRelationId` | agentRelationId | `aa.merchant.MerchantApplyRange` | `iagentrelationid` | 外键 |  |  | Service |  |
| 12 | `masterUnitId` | masterUnitId | `pc.unit.Unit` | `masterUnitId` | 外键 |  |  | Service |  |
| 13 | `agentProductApplyRange` | agentProductApplyRange | `sa.agent.AgentProductApplyRange` | `` | agentProductApplyRange → agentProductId | 1..n | Y | None |  |
| 14 | `taxId` | taxId | `archive.taxArchives.TaxRateArchive` | `cTaxId` | 外键 |  |  | Service |  |
| 15 | `productAuth` | 产品权限 | `pb.dataauth.ProductDataAuth` | `iProductId` | 外键 |  |  | None |  |
| 16 | `detail` | etail(日期) | `sa.agent.AgentProductExtend` | `` | detail → agentProductId | 0..n | Y | None |  |
| 17 | `iProductUnitId` | iProductUnitId | `pc.unit.Unit` | `iProductUnitId` | 外键 |  |  | Service |  |
| 18 | `agentCategoryId` | agentCategoryId | `aa.custcategory.CustCategory` | `iagentcategoryid` | 外键 |  |  | Service |  |
| 19 | `skuId` | skuId | `pc.product.ProductSKU` | `iskuid` | 外键 |  |  | Service |  |
| 20 | `salesOrgId` | salesOrgId | `org.func.SalesOrg` | `isalesorgid` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT iagentcategoryid, iagentId, iAgentLevelId, iagentrelationid, create_date, create_time, creator, creatorId
FROM agentproductrelation
```