---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidopen.CpuBidOpenSettingVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标设置表 (`lawbid.bidopen.CpuBidOpenSettingVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bidopen_setting`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标设置表 |
| 物理表 | `cpu_bidopen_setting` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:40.8570` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2025-10-24 23:57:22:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 3 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 4 | `sectionId` | 标段（包）ID | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 5 | `sectionCode` | 标段(包)编码 | `section_code` | String |
| 6 | `sectionName` | 标段（包）名称 | `section_name` | String |
| 7 | `bidopenId` | 开标记录主表 | `bidopen_id` | d9b08ed7-bb49-4184-bf86-23970f6dcb80 |
| 8 | `needDecryptCountDown` | 是否需要开标解密倒计时 | `need_decrypt_count_down` | Integer |
| 9 | `decryptTimeCount` | 开标解密时间(分钟) | `decrypt_time_count` | Integer |
| 10 | `needSupervisorPsw` | 是否需要开标监督人密码 | `need_supervisor_psw` | Integer |
| 11 | `supervisorPsw` | 监督人密码 | `supervisor_psw` | String |
| 12 | `supervisorPsnId` | 监督人员id | `supervisor_psn_id` | String |
| 13 | `supervisorPsnName` | 开标监督人 | `supervisor_psn_name` | String |
| 14 | `supervisorUserId` | 监督人userid | `supervisor_user_id` | String |
| 15 | `supervisorMobile` | 监督人手机号 | `supervisor_mobile` | String |
| 16 | `supervisorEmail` | 监督人邮箱 | `supervisor_email` | String |
| 17 | `countStartTime` | 解密倒计时开始时间 | `count_start_time` | DateTime |
| 18 | `dr` | 逻辑删除标记 | `dr` | Short |
| 19 | `pswSendStatus` | 密码发送状态,1成功,0失败 | `psw_sender_status` | Integer |
| 20 | `pswSendTime` | 密码发送时间 | `psw_sender_time` | DateTime |
| 21 | `pswSenderPsnId` | 密码发送人id | `psw_sender_psn_id` | String |
| 22 | `pswSenderPsnName` | 密码发送人 | `psw_sender_psn_name` | String |
| 23 | `pswSenderUserId` | 密码发送人userid | `psw_sender_user_id` | String |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidopenId` | 开标记录主表 | `lawbid.bidopen.CpuBidOpenVO` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `sectionId` | 标段（包）ID | `lawbid.section.LawbidSection` | None |  |
