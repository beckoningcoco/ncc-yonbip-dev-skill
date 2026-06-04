---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contract.ContractOrgScopeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购合同适应组织 (`cpu-contract.contract.ContractOrgScopeVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycContractManagement 模块实体元数据字典。
> 物理表：`cpu_ct_org_scope` | 所属应用：`ycContractManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-contract.contract.ContractOrgScopeVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购合同适应组织 |
| 物理表 | `cpu_ct_org_scope` |
| 数据库 schema | `cpu-contract` |
| 所属应用 | `ycContractManagement` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:16.3450` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2025-10-25 02:05:53:000
- **安装来源**: `/app/data_scripts/cpu-cooperation-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_cpu_cooperation/0010_iuap_common/DML/0270_iuap_metadata/202509/202509160943_metadata_cpu-contract-contract.zip`
- **安装人**: mongoTools
- **安装排名**: `fa46ae10-4252-46db-91cd-4c0cf75ce444`

## 术语标记

`BusinessData`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 13 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 2 | `id` | id | `id` | Long | `long` |  | ✓ |
| 3 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 4 | `contractId` | 合同主键 | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 | `quote` |  | ✓ |
| 5 | `enterpriseId` | 企业主键(采购云) | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 6 | `enterpriseName` | 租户名称 | `enterprise_name` | String | `text` |  | ✓ |
| 7 | `puorgId` | 组织id | `pu_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 8 | `puorgCode` | 组织编码 | `pu_org_code` | String | `text` |  | ✓ |
| 9 | `puorgName` | 组织名称 | `pu_org_name` | String | `text` |  | ✓ |
| 10 | `dr` | dr | `dr` | Integer | `int` |  | ✓ |
| 11 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 12 | `changingAction` | 变更状态 | `changing_action` | String | `text` |  | ✓ |
| 13 | `changingInfo` | 表体变更信息 | `changing_info` | String | `text` |  | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `contractId` | 合同主键 | `cpu-contract.contract.ContractVO` | `contract_id` | contractScopeList → contractId | 0..n | true | None |  |
| 3 | `puorgId` | 组织id | `org.func.BaseOrg` | `pu_org_id` |  →  |  |  | Service |  |
| 4 | `enterpriseId` | 企业主键(采购云) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |  →  |  |  | Service |  |

### Composition（子表）

- **contractId**: `contractScopeList` → `cpu-contract.contract.ContractVO` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `puorgId` (组织id) | `org.func.BaseOrg` | `pu_org_id` |
| `enterpriseId` (企业主键(采购云)) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |
