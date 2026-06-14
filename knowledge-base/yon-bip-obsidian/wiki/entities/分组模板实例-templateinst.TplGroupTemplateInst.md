---
tags: ["BIP", "元数据", "数据字典", "ycBase", "tpl.templateinst.TplGroupTemplateInst"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 分组模板实例 (`tpl.templateinst.TplGroupTemplateInst`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_tpl_group_template_inst` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `tpl.templateinst.TplGroupTemplateInst` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分组模板实例 |
| 物理表 | `cpu_tpl_group_template_inst` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBase` |
| 业务对象ID | `c92ba16f-3b85-446f-baa1-dd3514f86e4e` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:00.4930` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 22:09:33:000
- **安装来源**: `/app/iuap-metadata-base-common/iuap-metadata-base/metadata-bootstrap/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-metadata-base/0010_iuap_common/DML/0270_iuap_metadata/202604/202604161115_metadata_ucfbase-ucfbaseItf.zip`
- **安装人**: mongoTools
- **安装排名**: `b5b48373-4313-49fc-8cb9-9678b9a19b33`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 4 | 跨租户供应商租户接口 (`IVendorTenant`) | `cpu.itf.IVendorTenant` | 14 | 1 |
| 5 | 分组模板基础表 (`TplGroupBase`) | `tpl.itf.TplGroupBase` | 98 | 16 |

---

## 直接属性（共 24 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `groupId` | 模板分组主键 | `group_id` | Long | `long` |  | ✓ |
| 3 | `groupName` | 模板分组名称 | `group_name` | String | `text` |  | ✓ |
| 4 | `groupNameResid` | 模板分组名称多语 | `group_name_resid` | String | `text` |  | ✓ |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 6 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 7 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 8 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String | `text` |  | ✓ |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 10 | `BillItemInsts` | 表单模板字段实例 | `` | ce6e6cd0-f1a5-4d1a-8524-f2ea6857e096 | `` |  |  |
| 11 | `bMain` | 是否主表 | `bMain` | Integer | `int` |  | ✓ |
| 12 | `billTemplateId` | 模板关联表主键 | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 | `quote` |  | ✓ |
| 13 | `cAlign` | 分组排列方式 | `cAlign` | String | `text` |  | ✓ |
| 14 | `cCode` | 编码 | `cCode` | String | `text` |  | ✓ |
| 15 | `cDataSourceName` | 数据源名称 | `cDataSourceName` | String | `text` |  | ✓ |
| 16 | `cStyle` | 样式 | `cStyle` | String | `text` |  | ✓ |
| 17 | `cSubId` | 子产品号 | `cSubId` | String | `text` |  | ✓ |
| 18 | `cType` | 表识类型 | `cType` | String | `text` |  | ✓ |
| 19 | `childrenField` | 子类字段 | `childrenField` | String | `text` |  | ✓ |
| 20 | `iBillEntityId` | 表单实体对象表主键 | `iBillEntityId` | Long | `long` |  | ✓ |
| 21 | `iBillId` | 所属表单基础表 | `iBillId` | Long | `long` |  | ✓ |
| 22 | `iOrder` | 排序号，从高到低排 | `iOrder` | Integer | `int` |  | ✓ |
| 23 | `iParentId` | 父级主键 | `iParentId` | Long | `long` |  | ✓ |
| 24 | `iTplId` | 表单模板表主键 | `iTplId` | Long | `long` |  | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `billTemplateId` | 模板关联表主键 | `tpl.templateinst.TplBillTemplateInst` | `bill_template_id` | GroupTemplateInsts → billTemplateId | 1..n | true | None |  |
| 2 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `BillItemInsts` | 表单模板字段实例 | `tpl.templateinst.TplBillItemInst` | `` | BillItemInsts → groupTemplateInstId | 1..n | true | None |  |

### Composition（子表）

- **billTemplateId**: `GroupTemplateInsts` → `tpl.templateinst.TplBillTemplateInst` | 1..n
- **BillItemInsts**: `BillItemInsts` → `tpl.templateinst.TplBillItemInst` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
