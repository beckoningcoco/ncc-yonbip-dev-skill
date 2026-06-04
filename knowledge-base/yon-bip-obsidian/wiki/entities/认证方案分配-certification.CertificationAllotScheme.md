---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.certification.CertificationAllotScheme"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 认证方案分配 (`cpu-supplymgr.certification.CertificationAllotScheme`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_certification_allot_scheme` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.certification.CertificationAllotScheme` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 认证方案分配 |
| 物理表 | `cpu_certification_allot_scheme` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `fcec5a60-cac3-4f09-a335-c3519e50d6c4` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:25.2000` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |
| 编码 | `code` | `code` | String | 方案编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:46:03:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202604201451_metadata_cpu-supplymgr-certification_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `c3626984-9105-4707-80d5-0237f2d24f31`

## 业务场景

- `UITemplate`
- `billcode`
- `userdefine`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |

---

## 直接属性（共 27 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | id | `id` | Long | `long` |  | ✓ |
| 2 | `pubts` | pubts | `pubts` | DateTime | `timestamp` |  | ✓ |
| 3 | `name` | 方案名称 | `name` | String | `multiLanguage` |  | ✓ |
| 4 | `code` | 方案编码 | `code` | String | `text` |  | ✓ |
| 5 | `orgId` | 所属组织 | `org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 6 | `deptId` | 所属部门 | `dept_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 7 | `operatorName` | 操作人 | `operator_name` | String | `text` |  | ✓ |
| 8 | `authMode` | 认证模式 | `auth_mode` | String | `text` |  | ✓ |
| 9 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 10 | `abilityId` | 等级体系 | `ability_id` | 960ce6ff-03b4-4afc-ba32-2342d2e50e5b | `quote` |  | ✓ |
| 11 | `categoryList` | 认证方案适用物料分类 | `` | 9a7556cb-7099-4d49-ae1d-6d4317697655 | `` |  |  |
| 12 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 14 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 15 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 16 | `detailList` | 认证方案认证详细信息 | `` | 1977a28f-4eb9-4559-8802-adee0fb09fd6 | `` |  |  |
| 17 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 18 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 19 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 20 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 21 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 22 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 23 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 25 | `orgList` | 认证方案适用组织范围 | `` | 745324a2-45bb-4843-95d5-b7905ef9867b | `` |  |  |
| 26 | `userDefineCharacter` | 认证方案分配特征属性 | `user_define_character` | edcbec30-bbb3-4059-9f1f-9a583688bd08 | `UserDefine` |  | ✓ |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 10 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `userDefineCharacter` | 认证方案分配特征属性 | `cpu-supplymgr.certification.CertificationAllotSchemeDefineCharacter` | `user_define_character` |  →  |  |  | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `deptId` | 所属部门 | `org.func.BaseOrg` | `dept_id` |  →  |  |  | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 6 | `detailList` | 认证方案认证详细信息 | `cpu-supplymgr.certification.CertificationAllotSchemeDetail` | `` | detailList → schemeId | 0..n | true | None |  |
| 7 | `categoryList` | 认证方案适用物料分类 | `cpu-supplymgr.certification.CertificationAllotSchemeCategory` | `` | categoryList → schemeId | 0..n | true | None |  |
| 8 | `orgList` | 认证方案适用组织范围 | `cpu-supplymgr.certification.CertificationAllotSchemeOrg` | `` | orgList → schemeId | 0..n | true | None |  |
| 9 | `abilityId` | 等级体系 | `aa.supplyability.SupplyAbility` | `ability_id` |  →  |  |  | Service |  |
| 10 | `orgId` | 所属组织 | `bd.adminOrg.BaseOrgVO` | `org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **detailList**: `detailList` → `cpu-supplymgr.certification.CertificationAllotSchemeDetail` | 0..n
- **categoryList**: `categoryList` → `cpu-supplymgr.certification.CertificationAllotSchemeCategory` | 0..n
- **orgList**: `orgList` → `cpu-supplymgr.certification.CertificationAllotSchemeOrg` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `deptId` (所属部门) | `org.func.BaseOrg` | `dept_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `abilityId` (等级体系) | `aa.supplyability.SupplyAbility` | `ability_id` |
| `orgId` (所属组织) | `bd.adminOrg.BaseOrgVO` | `org_id` |
