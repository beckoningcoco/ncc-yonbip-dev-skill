---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.productSupply.ProductSupply"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 商品供货清单 (`mall.productSupply.ProductSupply`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`cpu_product_supply` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.productSupply.ProductSupply` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商品供货清单 |
| 物理表 | `cpu_product_supply` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycYuncaiMall` |
| 业务对象ID | `ff5f4f3b-0aed-4eae-bd97-76edc34c178f` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:00:33.1150` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 单据编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:52:51:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202512261400_metadata_mall-productSupply_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `77593581-f38b-40d0-8d59-f153bafe1459`

## 业务场景

- `FieldAuth`
- `workflow`
- `UITemplate`
- `DataAuth`
- `report`
- `billcode`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 自动编码 (`IAutoCode`) | `ucfbase.ucfbaseItf.IAutoCode` | 37 | 0 |
| 2 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 19 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `details` | 商品供货清单明细 | `` | 57ea3f9d-62c3-4582-a9dc-8a3041e72036 | `` |  |  |
| 2 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 3 | `decisionId` | 定标单主键 | `decision_id` | 1fc86047-2eea-424c-b46f-8fd24fdcc970 | `quote` |  | ✓ |
| 4 | `code` | 单据编码 | `code` | String | `text` |  | ✓ |
| 5 | `supplyDocId` | 供应商档案id | `supply_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 6 | `purOrgId` | 采购组织id | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 7 | `contractId` | 采购合同id | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 | `quote` |  | ✓ |
| 8 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 9 | `sourceType` | 来源类型 | `source_type` | String | `text` |  | ✓ |
| 10 | `source` | 来源类型 | `source` | String | `text` |  | ✓ |
| 11 | `buyerTenantId` | 采购商租户id | `buyer_tenant_id` | String | `text` |  | ✓ |
| 12 | `vendorTenantId` | 供应商租户id | `vendor_tenant_id` | String | `text` |  | ✓ |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 15 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 16 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 18 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |

---

## 关联属性（共 8 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purOrgId` | 采购组织id | `org.func.BaseOrg` | `pur_org_id` |  →  |  |  | Service |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 5 | `contractId` | 采购合同id | `cpu-contract.contract.ContractVO` | `contract_id` |  →  |  |  | Service |  |
| 6 | `supplyDocId` | 供应商档案id | `aa.vendor.Vendor` | `supply_doc_id` |  →  |  |  | Service |  |
| 7 | `details` | 商品供货清单明细 | `mall.productSupply.ProductSupplyDetail` | `` | details → productSupplyId | 1..n | true | None |  |
| 8 | `decisionId` | 定标单主键 | `lawbid.decisionresult.CpuDecision` | `decision_id` |  →  |  |  | Service |  |

### Composition（子表）

- **details**: `details` → `mall.productSupply.ProductSupplyDetail` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purOrgId` (采购组织id) | `org.func.BaseOrg` | `pur_org_id` |
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `contractId` (采购合同id) | `cpu-contract.contract.ContractVO` | `contract_id` |
| `supplyDocId` (供应商档案id) | `aa.vendor.Vendor` | `supply_doc_id` |
| `decisionId` (定标单主键) | `lawbid.decisionresult.CpuDecision` | `decision_id` |
