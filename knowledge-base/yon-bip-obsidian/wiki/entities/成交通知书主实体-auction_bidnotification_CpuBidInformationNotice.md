---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.bidnotification.CpuBidInformationNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交通知书主实体 (`auction.bidnotification.CpuBidInformationNotice`)

> ycSouringAuction | 物理表：`cpu_bid_information_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交通知书主实体 |
| 物理表 | `cpu_bid_information_notice` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:56.3880` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（36个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `ytenant` | 租户  | `ytenant_id` | String |
| 5 | `noticeStatus` | 发布状态 | `notice_status` | String |
| 6 | `preVersionId` | 前一版本ID | `pre_version_id` | Long |
| 7 | `versionNo` | 版本编号 | `version_no` | String |
| 8 | `publishDatetime` | 通知书发布时间 | `publish_datetime` | DateTime |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 13 | `creator` | 创建人名称 | `creator` | String |
| 14 | `modifier` | 修改人名称 | `modifier` | String |
| 15 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `dr` | 逻辑删除标记 | `dr` | Short |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 20 | `decisionId` | 竞拍结果(主实体) | `decision_id` | cef2e51c-ec7a-4453-9655-76897331f5b9 |
| 21 | `noticePublish` | 是否发布 | `notice_publish` | Integer |
| 22 | `sectionId` | 竞拍标段主键 | `section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 23 | `projectId` | 竞拍项目主键 | `project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 24 | `needPayServiceFee` | 是否缴纳 | `need_pay_service_fee` | Short |
| 25 | `payUnit` | 缴纳单位 | `pay_unit` | String |
| 26 | `totalAmountServiceFee` | 服务费总金额 | `total_amount_service_fee` | Decimal |
| 27 | `noticeShape` | 通知书形式 | `notice_shape` | String |
| 28 | `unsuccessfulBidNotice` | 未中标通知书 | `unsuccessful_bid_notice` | Short |
| 29 | `bidNotices` | 通知书(全部供应商数据) | `` | 2df66a90-6367-40f9-a49e-8791263e7967 |
| 30 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 31 | `noticeCandidates` | 成交结果(中标供应商数据) | `` | 20315b69-f4de-44c4-a019-7b126cf46781 |
| 32 | `purOrgId` | 采购组织主键 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 33 | `returncount` | 退回次数 | `returncount` | Short |
| 34 | `serviceCharges` | 缴纳服务费(中标供应商数据) | `` | 024b7d7a-f363-4489-b992-7806777a17b7 |
| 35 | `status` | 云审状态 | `workflow_status` | Short |
| 36 | `verifystate` | 审批状态 | `verifystate` | Short |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织主键 | `org.func.BaseOrg` | Service |  |
| 2 | `serviceCharges` | 缴纳服务费(中标供应商数据) | `auction.bidnotification.CpuServiceChargeNotice` | None | true |
| 3 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 4 | `noticeCandidates` | 成交结果(中标供应商数据) | `auction.bidnotification.CpuNoticeCandidate` | None | true |
| 5 | `bidNotices` | 通知书(全部供应商数据) | `auction.bidnotification.CpuBidNotification` | None | true |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 9 | `sectionId` | 竞拍标段主键 | `auction.project.AuctionSection` | None |  |
| 10 | `decisionId` | 竞拍结果(主实体) | `auction.decisionresult.CpuDecision` | None |  |
| 11 | `projectId` | 竞拍项目主键 | `auction.project.AuctionProject` | None |  |
