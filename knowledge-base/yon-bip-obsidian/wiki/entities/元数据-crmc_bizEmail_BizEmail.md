---
tags: [BIP, 元数据, 数据字典, crmc.bizEmail.BizEmail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务邮件 (`crmc.bizEmail.BizEmail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_biz_email` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：`077b02ee-4f58-4181-83a4-2281da35bfb1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务邮件 |
| 物理表 | `crmc_biz_email` |
| 数据库 schema | `yycrm` |
| 所属应用 | `ACT` |
| 直连字段 | 37 个 |
| 子表 | 6 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bizEmailRelatedContactList` | `crmc.bizEmail.BizEmailRelatedContact` | composition |
| `bizEmailRelatedOpptList` | `crmc.bizEmail.BizEmailRelatedOppt` | composition |
| `bizEmailRelatedCustomerList` | `crmc.bizEmail.BizEmailRelatedCustomer` | composition |
| `bizEmailRelatedClueList` | `crmc.bizEmail.BizEmailRelatedClue` | composition |
| `bizEmailRelatedPersonList` | `crmc.bizEmail.BizEmailRelatedPerson` | composition |
| `bizEmailRelatedFollowRecordList` | `crmc.bizEmail.BizEmailRelatedFollowRecord` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ower` | `` |
| `ytenant_id` | `` |

## 继承接口 (2个, 9字段)

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

> 共 37 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `annex_file_id` | `annex_file_id` | `annexFileId` | 附件组id(协同id) |
| `` | `creator` | `creator` | 创建人名称 |
| `file_ids` | `file_ids` | `fileIds` | 正文中嵌入图片的协同id |
| `is_seen` | `is_seen` | `isSeen` | 是否已读 |
| `message_id` | `message_id` | `messageId` | 邮件messageId |
| `` | `modifier` | `modifier` | 修改人名称 |
| `parent_message_id` | `parent_message_id` | `parentMessageId` | 父级邮件messageId |
| `receiver_email_address` | `receiver_email_address` | `receiverEmailAddress` | 收件人邮箱 |
| `receiver_email_name` | `receiver_email_name` | `receiverEmailName` | 收件人姓名 |
| `recipient_email_address` | `recipient_email_address` | `recipientEmailAddress` | 抄送人邮箱 |
| `recipient_email_name` | `recipient_email_name` | `recipientEmailName` | 抄送人姓名 |
| `relate_email_config` | `relate_email_config` | `relateEmailConfig` | 关联邮箱配置 |
| `sender_email_address` | `sender_email_address` | `senderEmailAddress` | 发件人邮箱 |
| `sender_email_name` | `sender_email_name` | `senderEmailName` | 发件人姓名 |
| `subject` | `subject` | `subject` | 主题 |
| `text_content` | `text_content` | `textContent` | 正文 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ower` | `ower` | `ower` | 所有人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `type` | `type` | `type` | 类型 |
| `urgency_level` | `urgency_level` | `urgencyLevel` | 紧急程度 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `email_config_id` | `email_config_id` | `emailConfigId` | 邮件配置id |
| `id` | `id` | `id` | ID |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bizEmailRelatedClueList` | 业务邮件关联线索 |
| `` | `` | `bizEmailRelatedContactList` | 业务邮件关联联系人 |
| `` | `` | `bizEmailRelatedCustomerList` | 业务邮件关联客户 |
| `` | `` | `bizEmailRelatedFollowRecordList` | 业务邮件关联跟进记录 |
| `` | `` | `bizEmailRelatedOpptList` | 业务邮件关联商机 |
| `` | `` | `bizEmailRelatedPersonList` | 业务邮件关联人员 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `receive_time` | `receive_time` | `receiveTime` | 接收时间 |
| `send_time` | `send_time` | `sendTime` | 发送时间 |
