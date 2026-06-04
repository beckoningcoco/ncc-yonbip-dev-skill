---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contract.ContractSignParty"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 合同多方签署 (`cpu-contract.contract.ContractSignParty`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycContractManagement 模块实体元数据字典。
> 物理表：`cpu_ct_sign_party` | 所属应用：`ycContractManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-contract.contract.ContractSignParty` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同多方签署 |
| 物理表 | `cpu_ct_sign_party` |
| 数据库 schema | `cpu-contract` |
| 所属应用 | `ycContractManagement` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:20.7060` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-23 00:06:30:000
- **安装来源**: `/app/data_scripts/cpu-cooperation-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_cpu_cooperation/0010_iuap_common/DML/0270_iuap_metadata/202604/202604191627_metadata_cpu-contract-contract_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `5fd1f31f-c9a9-4e8e-bae6-f667ee15d75c`

## 术语标记

`BusinessData`, `character`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 16 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `type` | 关联客商类型 | `type` | String | `text` |  | ✓ |
| 2 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 3 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 6 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 7 | `contractId` | 多方签署表对应合同主键 | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 | `quote` |  | ✓ |
| 8 | `memo` | 供应商id | `memo` | String | `text` |  | ✓ |
| 9 | `phone` | 联系电话 | `phone` | String | `text` |  | ✓ |
| 10 | `address` | 通讯地址 | `address` | String | `text` |  | ✓ |
| 11 | `supplydocId` | 供应商主键 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 12 | `ContractSignPartyChdId` | 自定义特征 | `chd_id` | f2a2734d-1120-4671-b4e7-ca5a7832db89 | `UserDefine` |  | ✓ |
| 13 | `customerId` | 客户主键 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | ✓ |
| 14 | `onlineSign` | 是否线上签署 | `online_sign` | Boolean | `switch` |  | ✓ |
| 15 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 16 | `signOrder` | 签署顺序 | `sign_order` | Integer | `int` |  | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ContractSignPartyChdId` | 自定义特征 | `cpu-contract.contract.ContractSignPartyChd` | `chd_id` |  →  |  |  | None |  |
| 2 | `supplydocId` | 供应商主键 | `aa.vendor.Vendor` | `supplydoc_id` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `contractId` | 多方签署表对应合同主键 | `cpu-contract.contract.ContractVO` | `contract_id` | contractPartyList → contractId | 0..n | true | None |  |
| 5 | `customerId` | 客户主键 | `aa.merchant.Merchant` | `customer_id` |  →  |  |  | Service |  |
| 6 | `orgId` | 组织 | `org.func.BaseOrg` | `org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **contractId**: `contractPartyList` → `cpu-contract.contract.ContractVO` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `supplydocId` (供应商主键) | `aa.vendor.Vendor` | `supplydoc_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `customerId` (客户主键) | `aa.merchant.Merchant` | `customer_id` |
| `orgId` (组织) | `org.func.BaseOrg` | `org_id` |
