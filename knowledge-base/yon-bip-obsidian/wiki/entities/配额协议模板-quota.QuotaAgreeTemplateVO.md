---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.quota.QuotaAgreeTemplateVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 配额协议模板 (`cpubase.quota.QuotaAgreeTemplateVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_qtagree_template` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.quota.QuotaAgreeTemplateVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配额协议模板 |
| 物理表 | `cpu_qtagree_template` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `372f6d62-2a93-4171-b20f-302a6e696970` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:19:18.0920` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |
| 编码 | `code` | `code` | String | 模版编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:53:08:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202604281540_metadata_cpubase-quota_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `281827f8-2128-4fbd-863c-6aa747ab63ee`

## 业务场景

- `FieldAuth`
- `dataMultilanguage`
- `UITemplate`
- `DataAuth`
- `billcode`
- `userdefine`

## 术语标记

`ConfigData`, `data_auth`

## 约束

- **code** (transformKey): code — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): 主键 — 唯一字段: `['id']`

## 依赖接口（共 7 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 审计信息 (`YcIAuditInfo`) | `aa.priceformula.YcIAuditInfo` | 201 | 2 |
| 4 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 5 | 自动编码 (`IAutoCode`) | `ucfbase.ucfbaseItf.IAutoCode` | 37 | 0 |
| 6 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 7 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |

---

## 直接属性（共 27 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `QuotaAgreeAllotVOTempList` | 配额协议分配表体 | `` | fcb41886-15ed-4ba5-b999-27894ad4e4ca | `` |  |  |
| 2 | `code` | 模版编码 | `code` | String | `text` |  | ✓ |
| 3 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 5 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 7 | `creatorName` | 创建人名称 | `creatorName` | String | `text` |  | ✓ |
| 8 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 10 | `enable` | 状态 | `enable` | Short | `short` |  | ✓ |
| 11 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 12 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 13 | `isSys` | 是否系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 14 | `manageId` | 管理员 | `manage_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 15 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 16 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 17 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 18 | `modifierName` | 修改人名称 | `modifierName` | String | `text` |  | ✓ |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 21 | `name` | 模版名称 | `name` | String | `multiLanguage` |  | ✓ |
| 22 | `orgId` | 管理组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 23 | `priority` | 优先级 | `priority` | Integer | `int` |  | ✓ |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 25 | `quotaAgreeTempChdId` | 配额协议模版自定义项 | `tempchd_id` | 8d6f69d0-bda0-4cc5-b511-9914904dbc2d | `UserDefine` |  | ✓ |
| 26 | `sysId` | 系统标识 | `sys_id` | Long | `long` |  | ✓ |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 7 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `manageId` | 管理员 | `bd.staff.Staff` | `manage_id` |  →  |  |  | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 5 | `quotaAgreeTempChdId` | 配额协议模版自定义项 | `cpubase.quota.QuotaAgreeTempChd` | `tempchd_id` |  →  |  |  | None |  |
| 6 | `QuotaAgreeAllotVOTempList` | 配额协议分配表体 | `cpubase.quota.QuotaAgreeTempAllotVO` | `` | QuotaAgreeAllotVOTempList → agreeId | 1..n | true | None |  |
| 7 | `orgId` | 管理组织 | `org.func.BaseOrg` | `org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **QuotaAgreeAllotVOTempList**: `QuotaAgreeAllotVOTempList` → `cpubase.quota.QuotaAgreeTempAllotVO` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `manageId` (管理员) | `bd.staff.Staff` | `manage_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `orgId` (管理组织) | `org.func.BaseOrg` | `org_id` |
