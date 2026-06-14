---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.tendersummary.CpuDecisionBidOpen"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标设置表 (`auction.tendersummary.CpuDecisionBidOpen`)

> ycSouringAuction | 物理表：`cpu_decision_bidopen`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标设置表 |
| 物理表 | `cpu_decision_bidopen` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:37.3730` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidOpenStatus` | 开标状态 | `bid_open_status` | String |
| 2 | `bidopenId` | 开标记录主表 | `bidopen_id` | d9b08ed7-bb49-4184-bf86-23970f6dcb80 |
| 3 | `decisionId` | 招标小结主键 | `decision_id` | b2dc61df-e91a-4136-981a-295501d2e771 |
| 4 | `decryptTimeCount` | 开标解密时间(分钟) | `decrypt_time_count` | Integer |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 7 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 8 | `id` | ID | `id` | Long |
| 9 | `needDecryptCountDown` | 是否需要开标解密倒计时 | `need_decrypt_count_down` | Integer |
| 10 | `needSupervisorPsw` | 是否需要开标监督人密码 | `need_supervisor_psw` | Integer |
| 11 | `pswSendStatus` | 密码发送状态,1成功,0失败 | `psw_sender_status` | Integer |
| 12 | `pswSendTime` | 密码发送时间 | `psw_sender_time` | DateTime |
| 13 | `pswSenderPsnId` | 密码发送人id | `psw_sender_psn_id` | String |
| 14 | `pswSenderPsnName` | 密码发送人 | `psw_sender_psn_name` | String |
| 15 | `pswSenderUserId` | 密码发送人userid | `psw_sender_user_id` | String |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `sectionCode` | 标段(包)编码 | `section_code` | String |
| 18 | `sectionId` | 标段（包） | `section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 19 | `sectionName` | 标段（包）名称 | `section_name` | String |
| 20 | `supervisorEmail` | 监督人邮箱 | `supervisor_email` | String |
| 21 | `supervisorMobile` | 监督人手机号 | `supervisor_mobile` | String |
| 22 | `supervisorPsnId` | 监督人员id | `supervisor_psn_id` | String |
| 23 | `supervisorPsnName` | 监督人员名称 | `supervisor_psn_name` | String |
| 24 | `supervisorPsw` | 监督人密码 | `supervisor_psw` | String |
| 25 | `supervisorUserId` | 监督人userid | `supervisor_user_id` | String |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidopenId` | 开标记录主表 | `lawbid.bidopen.CpuBidOpenVO` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `sectionId` | 标段（包） | `auction.project.AuctionSection` | None |  |
| 5 | `decisionId` | 招标小结主键 | `auction.tendersummary.CpuDecision` | None | true |
