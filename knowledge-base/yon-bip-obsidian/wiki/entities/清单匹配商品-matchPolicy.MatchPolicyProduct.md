---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.matchPolicy.MatchPolicyProduct"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 清单匹配商品 (`mall.matchPolicy.MatchPolicyProduct`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`match_policy_product` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.matchPolicy.MatchPolicyProduct` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 清单匹配商品 |
| 物理表 | `match_policy_product` |
| domain/服务域 | `yonbip-cpu-mall` |
| schema | `cpu_mall` |
| 所属应用 | `ycYuncaiMall` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:51.1950` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2026-05-23 00:59:44:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202601191140_metadata_mall-matchPolicy_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `38e11223-66ec-4358-837a-c932a7c8b024`

## 术语标记

`BusinessData`

## 约束

- **bizUniqueIndex_transform** (transformKey): 唯一业务规则 — 唯一字段: `['id']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`
- **bizUniqueIndex** (Unique): 唯一业务规则 — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 企业ID (`IEnterprise`) | `cpu-base.itf.IEnterprise` | 7 | 1 |

---

## 直接属性（共 43 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | id | `id` | Long | `long` |  | ✓ |
| 2 | `enterpriseId` | enterpriseId | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` | ✓ |  |
| 3 | `detailId` | 策略详情 | `detail_id` | 20821437-110c-4d0e-98db-a4ba30dfb900 | `quote` |  | ✓ |
| 4 | `wareTitle` | 商品名称 | `ware_title` | String | `text` |  | ✓ |
| 5 | `priceId` | 运营价格协议 | `price_id` | Long | `long` |  | ✓ |
| 6 | `channel` | 渠道id | `channel_id` | Long | `long` |  | ✓ |
| 7 | `purpose` | 采购用途 | `purpose_id` | Long | `long` |  | ✓ |
| 8 | `purposeName` | 采购用途名称 | `purpose_name` | String | `text` |  | ✓ |
| 9 | `purchaseOrgId` | 允销组织ID | `purchase_org_id` | String | `text` |  | ✓ |
| 10 | `purchaseOrgName` | 允销组织名称 | `purchase_org_name` | String | `text` |  | ✓ |
| 11 | `operateOrgName` | 商品运营组织名称 | `operate_org_name` | String | `text` |  | ✓ |
| 12 | `formulaId` | 公式价 | `formula_id` | Long | `long` |  | ✓ |
| 13 | `contractId` | 采购合同 | `contract_id` | Long | `long` |  | ✓ |
| 14 | `contractMaterialId` | 合同详情id | `contract_material_id` | Long | `long` |  | ✓ |
| 15 | `materialPriceUnitId` | 计价单位id | `material_price_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 16 | `priceExchRate` | 计价换算率 | `price_exch_rate` | Decimal | `number` |  | ✓ |
| 17 | `materialPriceUnitName` | 计价单位 | `material_price_unit_name` | String | `text` |  | ✓ |
| 18 | `priceExchRateNum` | 计价换算率分子 | `price_exch_ratenum` | Decimal | `number` |  | ✓ |
| 19 | `priceExchRateDen` | 计价换算率分母 | `price_exch_rateden` | Decimal | `number` |  | ✓ |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 21 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 23 | `quotaType` | 报价方式 | `quota_type` | String | `text` |  | ✓ |
| 24 | `skuId` | 商品skuId | `sku_id` | Long | `long` |  | ✓ |
| 25 | `skuCode` | 商品sku编码 | `sku_code` | String | `text` |  | ✓ |
| 26 | `productUnit` | 商品单位 | `product_unit` | String | `text` |  | ✓ |
| 27 | `quantity` | 商品采购数量 | `quantity` | Decimal | `number` |  | ✓ |
| 28 | `pictureUrl` | 商品图片url | `picture_url` | String | `text` |  | ✓ |
| 29 | `supplier` | 供应商id | `supplier_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 30 | `supplierName` | 供应商 | `supplier_name` | String | `text` |  | ✓ |
| 31 | `taxPrice` | 含税单价 | `tax_price` | Decimal | `number` |  | ✓ |
| 32 | `price` | 无税单价 | `price` | Decimal | `number` |  | ✓ |
| 33 | `taxRate` | 税率 | `tax_rate` | Decimal | `number` |  | ✓ |
| 34 | `taxAmount` | 含税金额 | `tax_amount` | Decimal | `number` |  | ✓ |
| 35 | `amount` | 无税金额 | `amount` | Decimal | `number` |  | ✓ |
| 36 | `materialQuantity` | 物料下单数量 | `material_quantity` | Decimal | `number` |  | ✓ |
| 37 | `materialUnit` | 物料下单单位 | `material_unit` | String | `text` |  | ✓ |
| 38 | `selectTag` | 是否选中 | `select_tag` | Integer | `int` |  | ✓ |
| 39 | `executeQuantity` | 订单执行量 | `execute_quantity` | Decimal | `number` |  | ✓ |
| 40 | `operateOrg` | 商品运营组织 | `operate_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 41 | `showOperate` | 是否展示运营组织 | `show_operate` | Boolean | `switch` |  | ✓ |
| 42 | `originTaxPrice` | 原始允销含税单价 | `origin_tax_price` | Decimal | `number` |  | ✓ |
| 43 | `originPrice` | 原始允销无税单价 | `origin_price` | Decimal | `number` |  | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `supplier` | 供应商id | `cpu-privilege.enterprise.EnterprisePOJO` | `supplier_id` |  →  |  |  | Service |  |
| 3 | `detailId` | 策略详情 | `mall.matchPolicy.MatchPolicyDetail` | `detail_id` | matchPolicyProduct → detailId | 0..n | true | None |  |
| 4 | `enterpriseId` | enterpriseId | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |  →  |  |  | Service |  |
| 5 | `operateOrg` | 商品运营组织 | `org.func.BaseOrg` | `operate_org_id` |  →  |  |  | Service |  |
| 6 | `materialPriceUnitId` | 计价单位id | `pc.unit.Unit` | `material_price_unit_id` |  →  |  |  | Service |  |

### Composition（子表）

- **detailId**: `matchPolicyProduct` → `mall.matchPolicy.MatchPolicyDetail` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `supplier` (供应商id) | `cpu-privilege.enterprise.EnterprisePOJO` | `supplier_id` |
| `enterpriseId` (enterpriseId) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |
| `operateOrg` (商品运营组织) | `org.func.BaseOrg` | `operate_org_id` |
| `materialPriceUnitId` (计价单位id) | `pc.unit.Unit` | `material_price_unit_id` |
