---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.invitation.Invitation"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商邀约 (`cpu-supplymgr.invitation.Invitation`)

> **平台版本：BIP 旗舰版 V5**

> ycSupplierManagement 模块 | 物理表：`cpu_invitation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商邀约 |
| 物理表 | `cpu_invitation` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `b25c4f2a-d85e-43c0-8a12-138412636723` |
| 元数据类型 | `Class` |
| 构建时间 | `2026-06-04 16:37:58.7030` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `invitation_code` | String | 邀请编码 |

## 部署信息

- 部署时间: 2026-01-23 23:43:53:000
- 安装人: mongoTools

## 依赖接口（4个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 审计信息 | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 3 | 自动编号 | `voucher.base.IAutoCode` | 49 | 1 |
| 4 | 审批流信息 | `base.itf.IApprovalFlow` | 134 | 3 |

---

## 直接属性（33个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 |
|---|--------|--------|---------|------|---------|
| 1 | `returncount` | 退回次数 | `returncount` | Short | `short` |
| 2 | `recruitNotice` | 招募内容 | `recruit_notice` | String | `text` |
| 3 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |
| 4 | `recruitShortCode` | 招募短链接码 | `recruit_short_code` | String | `text` |
| 5 | `code` | 邀请编码 | `invitation_code` | String | `text` |
| 6 | `invitationDept` | 邀请部门 | `invitation_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 | `quote` |
| 7 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 8 | `invitationPromoterDealFlag` | 邀请人处理准入受理单 | `invitation_promoter_deal_flag` | String | `text` |
| 9 | `invitationUserDefineCharacter` | 邀约单特征自定义项 | `invitation_userDefineCharacter` | 4a4f7603-c87a-4c69-afdc-eb1d339dd896 | `UserDefine` |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 11 | `invitationPhone` | 邀请人手机号 | `invitation_phone` | String | `text` |
| 12 | `id` | ID | `id` | Long | `long` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 14 | `invitationDate` | 单据日期 | `invitation_date` | Date | `date` |
| 15 | `publishTime` | 发布时间 | `publish_time` | DateTime | `timestamp` |
| 16 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 17 | `recruitUrl` | 招募链接 | `recruit_url` | String | `text` |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 19 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |
| 20 | `invitationExpire` | 邀约有效期 | `invitation_expire` | DateTime | `timestamp` |
| 21 | `invitationPromoter` | 邀请人 | `invitation_promoter` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 22 | `recruitStatus` | 招募状态 | `recruit_status` | String | `text` |
| 23 | `invitationDesc` | 邀请说明 | `invitation_desc` | String | `text` |
| 24 | `invitationType` | 邀约类型 | `invitation_type` | String | `text` |
| 25 | `invitationOrg` | 邀请组织 | `invitation_org` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 26 | `transType` | 交易类型 | `transType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 28 | `recruitResponseCount` | 响应供应商数量 | `recruit_response_count` | Integer | `int` |
| 29 | `name` | 邀请主题 | `invitation_name` | String | `text` |
| 30 | `invitationCount` | 邀请供应商数量 | `invitation_count` | Integer | `int` |
| 31 | `invitationRecruitFlag` | 是否发布招募 | `invitation_recruit_flag` | String | `text` |
| 32 | `invitationStatus` | 单据状态 | `invitation_status` | String | `text` |
| 33 | `invitationinfos` | 供应商邀约信息 | `` | 09c74868-6530-4884-b393-18859ac5ce25 | `` |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `invitationUserDefineCharacter` | 邀约单特征自定义项 | `cpu-supplymgr.invitation.InvitationUserDefineCharacter` | None |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 3 | `invitationOrg` | 邀请组织 | `bd.adminOrg.BaseOrgVO` | Service |  |
| 4 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `invitationDept` | 邀请部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 7 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 8 | `invitationPromoter` | 邀请人 | `bd.staff.Staff` | Service |  |
| 9 | `invitationinfos` | 供应商邀约信息 | `cpu-supplymgr.invitation.InvitationInfo` | None | true |
