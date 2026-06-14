---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.tendersummary.CpuDecisionBidOpen"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标设置表 (`lawbid.tendersummary.CpuDecisionBidOpen`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_decision_bidopen`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标设置表 |
| 物理表 | `cpu_decision_bidopen` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:03:17.1040` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2025-10-24 23:58:07:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `pswSenderPsnId` | 密码发送人主键 | `psw_sender_psn_id` | String |
| 3 | `pswSenderPsnName` | 发送人 | `psw_sender_psn_name` | String |
| 4 | `supervisorPsnId` | 监督人员主键 | `supervisor_psn_id` | String |
| 5 | `bidopenId` | 开标记录主表 | `bidopen_id` | d9b08ed7-bb49-4184-bf86-23970f6dcb80 |
| 6 | `supervisorPsnName` | 接收人 | `supervisor_psn_name` | String |
| 7 | `pswSendTime` | 发送时间 | `psw_sender_time` | DateTime |
| 8 | `pswSendStatus` | 发送状态 | `psw_sender_status` | Integer |
| 9 | `supervisorPsw` | 密码内容 | `supervisor_psw` | String |
| 10 | `bidOpenStatus` | 开标状态 | `bid_open_status` | String |
| 11 | `decisionId` | 招标小结主键 | `decision_id` | 99f460d4-748b-4181-a22c-b517478411e1 |
| 12 | `decryptTimeCount` | 开标解密时间(分钟) | `decrypt_time_count` | Integer |
| 13 | `dr` | 逻辑删除标记 | `dr` | Short |
| 14 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 15 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 16 | `needDecryptCountDown` | 是否需要开标解密倒计时 | `need_decrypt_count_down` | Integer |
| 17 | `needSupervisorPsw` | 是否需要开标监督人密码 | `need_supervisor_psw` | Integer |
| 18 | `pswSenderUserId` | 密码发送人userid | `psw_sender_user_id` | String |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `sectionCode` | 标段(包)编码 | `section_code` | String |
| 21 | `sectionId` | 标段（包） | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 22 | `sectionName` | 标段（包）名称 | `section_name` | String |
| 23 | `supervisorEmail` | 监督人邮箱 | `supervisor_email` | String |
| 24 | `supervisorMobile` | 监督人手机号 | `supervisor_mobile` | String |
| 25 | `supervisorUserId` | 监督人userid | `supervisor_user_id` | String |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidopenId` | 开标记录主表 | `lawbid.bidopen.CpuBidOpenVO` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `sectionId` | 标段（包） | `lawbid.section.LawbidSection` | None |  |
| 5 | `decisionId` | 招标小结主键 | `lawbid.tendersummary.CpuDecision` | None | true |
