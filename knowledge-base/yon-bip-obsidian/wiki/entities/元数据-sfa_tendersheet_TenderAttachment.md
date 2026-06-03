---
tags: [BIP, 元数据, 数据字典, sfa.tendersheet.TenderAttachment]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投标附件 (`sfa.tendersheet.TenderAttachment`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_tender_attachment` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标附件 |
| 物理表 | `sfa_tender_attachment` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 25 个 |
| 子表 | 1 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `tenderAttachementDef` | `sfa.tendersheet.TenderAttachmentDef` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `tender_file_classify` | `crmc_custdocref` |
| `ytenant_id` | `` |
| `` | `` |
| `tenderAttachmentDefineCharacter` | `` |
| `detail_id` | `` |
| `tender_sheet_id` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `modifier` | `modifier` | 修改人名称 |
| `cFileName` | `cFileName` | `fileName` | 投标附件名称 |
| `cFolder` | `cFolder` | `folder` | 投标文件附件 |
| `remark` | `remark` | `remark` | 投标文件备注 |
| `` | `creator` | `creator` | 投标文件上传者 |
| `signingStatus` | `signingStatus` | `signingStatus` | 签署状态 |
| `signtoryId` | `signtoryId` | `signtoryId` | 签署人Id |
| `signtory` | `signtory` | `signtory` | 签署人 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tender_sheet_id` | `tender_sheet_id` | `tenderSheetId` | 投标单ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `tender_file_classify` | `tender_file_classify` | `tenderFileClassify` | 投标文件分类 |
| `detail_id` | `detail_id` | `detailId` | 投标单明细ID |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `signDate` | `signDate` | `signDate` | 签署日期 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 投标文件ID |
| `cFileSize` | `cFileSize` | `size` | 投标文件大小 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 投标文件时间戳 |
| `create_time` | `create_time` | `createTime` | 投标文件上传时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenderAttachmentDefineCharacter` | `tenderAttachmentDefineCharacter` | `tenderAttachmentDefineCharacter` | 投标附件自定义项特征组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `tenderAttachementDef` | 投标附件自定义项扩展 |
