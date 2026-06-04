---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidnotification.CpuBidInformationNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交通知书主实体 (`lawbid.bidnotification.CpuBidInformationNotice`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_information_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交通知书主实体 |
| 物理表 | `cpu_bid_information_notice` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:24:45.8150` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-01-23 23:56:07:000

## 依赖接口（7个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |
| 2 | 成交通知主接口 | `lawdecision.itf.ICpuBidInformationNotice` | 161 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 6 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 7 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（36个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `preVersionId` | 前一版本ID | `pre_version_id` | Long |
| 4 | `versionNo` | 版本编号 | `version_no` | String |
| 5 | `publishDatetime` | 通知书发布时间 | `publish_datetime` | DateTime |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime |
| 7 | `creator` | 创建人名称 | `creator` | String |
| 8 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `noticeStatus` | 发布状态 | `notice_status` | String |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `ytenant` | 租户 | `ytenant_id` | String |
| 18 | `id` | id | `id` | Long |
| 19 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 20 | `decisionId` | 采购结果(主实体) | `decision_id` | 1fc86047-2eea-424c-b46f-8fd24fdcc970 |
| 21 | `noticePublish` | 是否发布 | `notice_publish` | Integer |
| 22 | `sectionId` | 招标标段主键 | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 23 | `projectId` | 招标项目主键 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 24 | `needPayServiceFee` | 是否缴纳 | `need_pay_service_fee` | Short |
| 25 | `payUnit` | 缴纳单位 | `pay_unit` | String |
| 26 | `totalAmountServiceFee` | 服务费总金额 | `total_amount_service_fee` | Decimal |
| 27 | `noticeShape` | 通知书形式 | `notice_shape` | String |
| 28 | `unsuccessfulBidNotice` | 未中标通知书 | `unsuccessful_bid_notice` | Short |
| 29 | `bidNotices` | 通知书(全部供应商数据) | `` | c808d2fa-67bf-41bf-b89e-485c23d30e3e |
| 30 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 31 | `noticeCandidates` | 成交结果(中标供应商数据) | `` | 52039748-0763-40ba-acf7-a947829e8d94 |
| 32 | `purOrgId` | 采购组织主键 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 33 | `returncount` | 退回次数 | `returncount` | Short |
| 34 | `serviceCharges` | 缴纳服务费(中标供应商数据) | `` | a7a224b8-9d83-4c5e-b557-8e27d33d8220 |
| 35 | `status` | 云审状态 | `workflow_status` | Short |
| 36 | `verifystate` | 审批状态 | `verifystate` | Short |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织主键 | `org.func.BaseOrg` | Service |  |
| 2 | `serviceCharges` | 缴纳服务费(中标供应商数据) | `lawbid.bidnotification.CpuServiceChargeNotice` | None | true |
| 3 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 4 | `noticeCandidates` | 成交结果(中标供应商数据) | `lawbid.bidnotification.CpuNoticeCandidate` | None | true |
| 5 | `bidNotices` | 通知书(全部供应商数据) | `lawbid.bidnotification.CpuBidNotification` | None | true |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 9 | `sectionId` | 招标标段主键 | `lawbid.section.LawbidSection` | None |  |
| 10 | `decisionId` | 采购结果(主实体) | `lawbid.decisionresult.CpuDecision` | None |  |
| 11 | `projectId` | 招标项目主键 | `lawbid.project.LawbidProject` | None |  |
