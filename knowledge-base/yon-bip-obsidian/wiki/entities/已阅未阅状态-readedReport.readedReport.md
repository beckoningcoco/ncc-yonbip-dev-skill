---
tags: ["BIP", "元数据", "数据字典", "ycBase", "bctask.readedReport.readedReport"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 已阅未阅状态 (`bctask.readedReport.readedReport`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_readed_report` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `bctask.readedReport.readedReport` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 已阅未阅状态 |
| 物理表 | `cpu_readed_report` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 业务对象ID | `d5c738e2-208a-4053-a970-0151dbb26b87` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:42.2550` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:30:37:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202512221135_metadata_bctask-readedReport.zip`
- **安装人**: mongoTools
- **安装排名**: `faa8415d-5a1d-4411-8d27-a1dbda4d253d`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 直接属性（共 34 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `businessTypeId` | 业务类型档案 | `business_type_id` | String | `text` |  | ✓ |
| 2 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 4 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 5 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 6 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 8 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 9 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 10 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 11 | `invited` | 是否受邀 | `invited` | Short | `short` |  | ✓ |
| 12 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 13 | `modifierId` | 修改人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 14 | `modifyDate` | 查看日期 | `modify_date` | Date | `date` |  | ✓ |
| 15 | `modifyTime` | 查看时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 17 | `readDate` | 查看日期 | `read_date` | Date | `date` |  | ✓ |
| 18 | `readTime` | 查看时间 | `read_time` | DateTime | `timestamp` |  | ✓ |
| 19 | `readed` | 查看状态 | `readed` | Short | `short` |  | ✓ |
| 20 | `reader` | 查看人名称 | `reader` | String | `text` |  | ✓ |
| 21 | `readerEmil` | 查看人联系邮箱 | `reader_emil` | String | `text` |  | ✓ |
| 22 | `readerId` | 查看人 | `reader_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 23 | `readerPhone` | 查看人联系电话 | `reader_phone` | String | `text` |  | ✓ |
| 24 | `sourceBillCode` | 来源单据编码 | `source_bill_code` | String | `text` |  | ✓ |
| 25 | `sourceBillId` | 来源单据ID | `source_bill_id` | Long | `long` |  | ✓ |
| 26 | `sourceBillType` | 单据来源类型 | `source_bill_type` | String | `text` |  | ✓ |
| 27 | `supplyContact` | 供应商联系人名称 | `supply_contact` | String | `text` |  | ✓ |
| 28 | `supplyContactEmail` | 联系人邮箱 | `supplyContactEmail` | String | `text` |  | ✓ |
| 29 | `supplyContactId` | 供应商联系人 | `supply_contact_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 30 | `supplyContactPhone` | 联系人电话 | `supplyContactPhone` | String | `text` |  | ✓ |
| 31 | `supplyDocId` | 供应商档案 | `supply_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 32 | `supplyTenantId` | 供应商租户 | `supply_tenant_id` | String | `text` |  | ✓ |
| 33 | `supplyTenantName` | 供应商租户名称 | `supply_tenant_name` | String | `text` |  | ✓ |
| 34 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `supplyContactId` | 供应商联系人 | `base.user.User` | `supply_contact_id` |  →  |  |  | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |
| 5 | `supplyDocId` | 供应商档案 | `aa.vendor.Vendor` | `supply_doc_id` |  →  |  |  | Service |  |
| 6 | `readerId` | 查看人 | `base.user.User` | `reader_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `supplyContactId` (供应商联系人) | `base.user.User` | `supply_contact_id` |
| `creatorId` (创建人) | `base.user.User` | `creator_id` |
| `modifierId` (修改人) | `base.user.User` | `modifier_id` |
| `supplyDocId` (供应商档案) | `aa.vendor.Vendor` | `supply_doc_id` |
| `readerId` (查看人) | `base.user.User` | `reader_id` |
