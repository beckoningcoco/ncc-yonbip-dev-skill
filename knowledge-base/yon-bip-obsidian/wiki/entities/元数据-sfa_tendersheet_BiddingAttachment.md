---
tags: [BIP, 元数据, 数据字典, sfa.tendersheet.BiddingAttachment]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 招标附件 (`sfa.tendersheet.BiddingAttachment`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_bidding_attachment` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 招标附件 |
| 物理表 | `sfa_bidding_attachment` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 21 个 |
| 子表 | 1 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `biddingAttachementDef` | `sfa.tendersheet.BiddingAttachmentDef` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `biddingAttachmentDefineCharacter` | `` |
| `bidding_file_classify` | `crmc_custdocref` |
| `` | `` |
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

> 共 21 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `modifier` | `modifier` | 修改人名称 |
| `cFileName` | `cFileName` | `fileName` | 招标附件名称 |
| `cFolder` | `cFolder` | `folder` | 招标文件附件 |
| `remark` | `remark` | `remark` | 招标文件备注 |
| `` | `creator` | `creator` | 招标文件上传者 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tender_sheet_id` | `tender_sheet_id` | `tenderSheetId` | 投标单ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `bidding_file_classify` | `bidding_file_classify` | `biddingFileClassify` | 招标文件分类ID |
| `detail_id` | `detail_id` | `detailId` | 投标单明细ID |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 招标文件ID |
| `cFileSize` | `cFileSize` | `size` | 招标文件大小 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 招标文件时间戳 |
| `create_time` | `create_time` | `createTime` | 招标文件上传时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `biddingAttachmentDefineCharacter` | `biddingAttachmentDefineCharacter` | `biddingAttachmentDefineCharacter` | 招标附件自定义项特征组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `biddingAttachementDef` | 招标附件自定义项扩展 |
