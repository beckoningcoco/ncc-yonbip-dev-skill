---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.invitation.InvitationInfo"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商邀约信息 (`cpu-supplymgr.invitation.InvitationInfo`)

> **平台版本：BIP 旗舰版 V5**

> ycSupplierManagement 模块 | 物理表：`cpu_invitation_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商邀约信息 |
| 物理表 | `cpu_invitation_info` |
| domain/服务域 | `cpu-supplymgr` |
| schema | `cpu_suppliermgr` |
| 所属应用 | `ycSupplierManagement` |
| 元数据类型 | `Class` |
| 构建时间 | `2026-06-04 16:38:00.1930` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2024-11-22 23:10:40:000
- 安装人: mongoTools

## 依赖接口（1个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 |
|---|--------|--------|---------|------|---------|
| 1 | `contractPhone` | 联系人手机 | `contract_phone` | String | `text` |
| 2 | `invitationinfoUserDefineCharacter` | 邀约信息特征自定义项 | `invitationinfo_userDefineCharacter` | e2dc904a-b4c8-43c6-83f2-a1ae1c146e0e | `UserDefine` |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 4 | `invitationId` | 邀约单主键 | `invitation_id` | 36bcf7fc-1170-46a4-8f8d-905ab5d6fcac | `quote` |
| 5 | `contractEmail` | 联系人邮箱 | `contract_email` | String | `text` |
| 6 | `invitedRemark` | 邀请备注 | `invited_remark` | String | `text` |
| 7 | `contractPhonecode` | 联系人手机区号 | `contract_phonecode` | String | `text` |
| 8 | `invitationUrl` | 邀约链接 | `invitation_url` | String | `text` |
| 9 | `invitedSupplyName` | 被邀请供应商名称 | `invited_supply_name` | String | `text` |
| 10 | `contractName` | 联系人名称 | `contract_name` | String | `text` |
| 11 | `invitedStatus` | 邀请状态 | `invited_status` | String | `text` |
| 12 | `id` | ID | `id` | Long | `long` |
| 13 | `supplyapplyId` | 供应商准入受理单主键 | `supplyapply_id` | e4dae549-65e3-4e1c-a8f9-f1e53eccf6e8 | `quote` |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 15 | `invitationShortCode` | 邀约短链接码 | `invitation_short_code` | String | `text` |
| 16 | `sendMessageFlag` | 是否发送过消息标识 | `send_message_flag` | String | `text` |
| 17 | `supplyDocId` | 供应商档案Id | `supply_doc_id` | Long | `long` |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `invitationinfoUserDefineCharacter` | 邀约信息特征自定义项 | `cpu-supplymgr.invitation.InvitationInfoUserDefineCharacter` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `invitationId` | 邀约单主键 | `cpu-supplymgr.invitation.Invitation` | None | true |
| 4 | `supplyapplyId` | 供应商准入受理单主键 | `cpu-supplymgr.supplymgr.SupplyApply` | None |  |
