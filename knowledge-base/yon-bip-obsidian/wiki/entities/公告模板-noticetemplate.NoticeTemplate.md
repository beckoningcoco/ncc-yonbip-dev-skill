---
tags: ["BIP", "元数据", "数据字典", "ycBase", "bctask.noticetemplate.NoticeTemplate"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 公告模板 (`bctask.noticetemplate.NoticeTemplate`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_notice_template` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `bctask.noticetemplate.NoticeTemplate` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 公告模板 |
| 物理表 | `cpu_notice_template` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 业务对象ID | `908494f2-9b8a-4793-a984-ab5e37c0228f` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:43.5860` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:30:33:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202512041459_metadata_bctask-noticetemplate_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `34310a2b-ef93-40de-882c-52fd0a24a838`

## 业务场景

- `extdevelop`
- `dataMultilanguage`
- `UITemplate`
- `billcode`

## 术语标记

`ConfigData`

## 约束

- **UK_code** (transformKey): code — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 4 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 5 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 30 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `applyOrgs` | 适用采购组织 | `` | 78869ee8-11c8-41d9-b8d7-fa1c674963a4 | `` |  |  |
| 2 | `bidFileId` | 招标文件ID | `bid_file_id` | String | `text` |  | ✓ |
| 3 | `businessTypeId` | 业务类型 | `business_type_id` | 7c191065-2c91-48d3-a75f-5ccca8aa3c62 | `quote` |  | ✓ |
| 4 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 5 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 7 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 8 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 9 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 11 | `enable` | 启用 | `enable` | Short | `short` |  | ✓ |
| 12 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 13 | `evalBidMethod` | 评标办法 | `eval_bid_method` | String | `text` |  | ✓ |
| 14 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 15 | `isSys` | 是否系统预制 | `is_sys` | Short | `short` |  | ✓ |
| 16 | `materialCategories` | 适用物料分类 | `` | 6550677d-5920-4f12-be6e-fb4a7b19b197 | `` |  |  |
| 17 | `microServiceCode` | 微服务编码 | `micro_service_code` | String | `text` |  | ✓ |
| 18 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 19 | `modifierId` | 修改人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 20 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 22 | `name` | 名称 | `name` | String | `multiLanguage` |  | ✓ |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 24 | `purchaseMode` | 适用采购方式 | `` | 61df60e8-5ccf-4bf4-94a7-f67a3f3e1cd9 | `` |  |  |
| 25 | `purchaseTypes` | 适用采购类型 | `` | 189586a5-ee4e-48ad-bd06-d93ab7518907 | `` |  |  |
| 26 | `sysId` | 系统预制 | `sys_id` | Long | `long` |  | ✓ |
| 27 | `templateContents` | 公告模板内容 | `` | 63160fa3-d2b9-4d9d-9097-2ab7b7527092 | `` |  |  |
| 28 | `templateTypeId` | 模板类型 | `template_type_id` | ffb680e8-d532-4018-8abe-9143613f9129 | `quote` |  | ✓ |
| 29 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 30 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 11 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `templateTypeId` | 模板类型 | `bctask.noticetemplate.NoticeTemplateType` | `template_type_id` |  →  |  |  | None |  |
| 2 | `templateContents` | 公告模板内容 | `bctask.noticetemplate.NoticeTemplateContent` | `` | templateContents → templateId | 0..n | true | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `purchaseMode` | 适用采购方式 | `bctask.noticetemplate.NoticeTemplateApplyPurchaseMode` | `` | purchaseMode → templateId | 0..n | true | None |  |
| 5 | `purchaseTypes` | 适用采购类型 | `bctask.noticetemplate.NoticeTemplateApplyPurchaseType` | `` | purchaseTypes → templateId | 0..n | true | None |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |
| 8 | `transTypeId` | 交易类型 | `bd.bill.TransType` | `trans_type_id` |  →  |  |  | Service |  |
| 9 | `applyOrgs` | 适用采购组织 | `bctask.noticetemplate.NoticeTemplateApplyOrg` | `` | applyOrgs → templateId | 0..n | true | None |  |
| 10 | `materialCategories` | 适用物料分类 | `bctask.noticetemplate.NoticeTemplateApplyMaterialCategory` | `` | materialCategories → templateId | 0..n | true | None |  |
| 11 | `businessTypeId` | 业务类型 | `bctask.noticetemplate.NoticeTemplateBusinessType` | `business_type_id` |  →  |  |  | None |  |

### Composition（子表）

- **templateContents**: `templateContents` → `bctask.noticetemplate.NoticeTemplateContent` | 0..n
- **purchaseMode**: `purchaseMode` → `bctask.noticetemplate.NoticeTemplateApplyPurchaseMode` | 0..n
- **purchaseTypes**: `purchaseTypes` → `bctask.noticetemplate.NoticeTemplateApplyPurchaseType` | 0..n
- **applyOrgs**: `applyOrgs` → `bctask.noticetemplate.NoticeTemplateApplyOrg` | 0..n
- **materialCategories**: `materialCategories` → `bctask.noticetemplate.NoticeTemplateApplyMaterialCategory` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creator_id` |
| `modifierId` (修改人) | `base.user.User` | `modifier_id` |
| `transTypeId` (交易类型) | `bd.bill.TransType` | `trans_type_id` |
