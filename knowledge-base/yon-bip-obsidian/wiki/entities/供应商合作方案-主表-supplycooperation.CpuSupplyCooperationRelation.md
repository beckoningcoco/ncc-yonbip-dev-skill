---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplycooperation.CpuSupplyCooperationRelation"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商合作方案-主表 (`cpu-supplymgr.supplycooperation.CpuSupplyCooperationRelation`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_supply_cooperation_relation` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplycooperation.CpuSupplyCooperationRelation` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商合作方案-主表 |
| 物理表 | `cpu_supply_cooperation_relation` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `a8540a58-c933-4b96-8c85-e6bd3c27ddb9` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:56.1520` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |
| 编码 | `code` | `code` | String | 方案编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:46:03:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202604201512_metadata_cpu-supplymgr-supplycooperation_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `07ae0cfd-cf5a-4f25-acf2-49843e5aaee0`

## 业务场景

- `dataMultilanguage`

## 术语标记

`ConfigData`, `isMain`

## 约束

- **codeTrans** (transformKey): 编码翻译规则 — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 18 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | id | `id` | Long | `long` |  | ✓ |
| 2 | `code` | 方案编码 | `code` | String | `text` |  | ✓ |
| 3 | `name` | 方案名称 | `name` | String | `multiLanguage` |  | ✓ |
| 4 | `orgId` | 创建组织ID | `org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 5 | `deptId` | 所属部门ID | `dept_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 6 | `type` | 方案类型 | `type` | String | `text` |  | ✓ |
| 7 | `operatorId` | 操作人ID | `operator_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 8 | `stopStatus` | 状态 | `stop_status` | String | `text` |  | ✓ |
| 9 | `enterpriseId` | 租户ID | `enterprise_id` | Long | `long` |  | ✓ |
| 10 | `pubts` | pubts | `pubts` | DateTime | `timestamp` |  | ✓ |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 12 | `categorys` | 适用主供物料范围-子表 | `` | bcb3a360-5cb7-4d00-87b1-e6401eca35c7 | `` |  |  |
| 13 | `details` | 合作关系详情-子表 | `` | 8f7a08f4-afb1-4206-ab5a-b1394e2ad7df | `` |  |  |
| 14 | `freezeDetails` | 冻结状态-子表 | `` | 27d0c494-e370-45f6-b9f1-2f418e269c16 | `` |  |  |
| 15 | `orgs` | 适用组织范围-子表 | `` | b93bff4c-098b-47cc-a116-96b2b8e490db | `` |  |  |
| 16 | `sources` | 来源状态详情-子表 | `` | 6576283d-521e-4f51-8a4a-62cfb5e59c81 | `` |  |  |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 18 | `ytenantId` | ytenantId | `ytenant_id` | String | `text` |  | ✓ |

---

## 关联属性（共 9 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `categorys` | 适用主供物料范围-子表 | `cpu-supplymgr.supplycooperation.CpuSupCooRelationCategory` | `` | categorys → relationId | 0..n | true | None |  |
| 2 | `freezeDetails` | 冻结状态-子表 | `cpu-supplymgr.supplycooperation.CpuSupCooRelationFreezeDetail` | `` | freezeDetails → relationId | 0..n | true | None |  |
| 3 | `sources` | 来源状态详情-子表 | `cpu-supplymgr.supplycooperation.CpuSupCooRelationSource` | `` | sources → relationId | 0..n | true | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `deptId` | 所属部门ID | `bd.adminOrg.BaseOrgVO` | `dept_id` |  →  |  |  | Service |  |
| 6 | `details` | 合作关系详情-子表 | `cpu-supplymgr.supplycooperation.CpuSupCooRelationDetail` | `` | details → relationId | 0..n | true | None |  |
| 7 | `orgs` | 适用组织范围-子表 | `cpu-supplymgr.supplycooperation.CpuSupCooRelationOrg` | `` | orgs → relationId | 0..n | true | None |  |
| 8 | `operatorId` | 操作人ID | `bd.staff.Staff` | `operator_id` |  →  |  |  | Service |  |
| 9 | `orgId` | 创建组织ID | `bd.adminOrg.BaseOrgVO` | `org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **categorys**: `categorys` → `cpu-supplymgr.supplycooperation.CpuSupCooRelationCategory` | 0..n
- **freezeDetails**: `freezeDetails` → `cpu-supplymgr.supplycooperation.CpuSupCooRelationFreezeDetail` | 0..n
- **sources**: `sources` → `cpu-supplymgr.supplycooperation.CpuSupCooRelationSource` | 0..n
- **details**: `details` → `cpu-supplymgr.supplycooperation.CpuSupCooRelationDetail` | 0..n
- **orgs**: `orgs` → `cpu-supplymgr.supplycooperation.CpuSupCooRelationOrg` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `deptId` (所属部门ID) | `bd.adminOrg.BaseOrgVO` | `dept_id` |
| `operatorId` (操作人ID) | `bd.staff.Staff` | `operator_id` |
| `orgId` (创建组织ID) | `bd.adminOrg.BaseOrgVO` | `org_id` |
