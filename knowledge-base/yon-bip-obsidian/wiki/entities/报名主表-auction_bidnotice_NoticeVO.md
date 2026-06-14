---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "auction.bidnotice.NoticeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报名主表 (`auction.bidnotice.NoticeVO`)

> ycBusinessCenter | 物理表：`cpu_bid_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报名主表 |
| 物理表 | `cpu_bid_notice` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:27:01.2100` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（44个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `billStatus` | 供应商报名状态 | `billstatus` | String |
| 3 | `bidNoticeAuctionDefineCharacter` | 报名主表自定义项 | `define_character_id` | 2a8059fd-f08e-4aa0-a1ff-b51823e82c32 |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime |
| 5 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 6 | `creator` | 创建人 | `creator` | String |
| 7 | `modifier` | 修改人 | `modifier` | String |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `supIpAddress` | 供应商报名地址 | `sup_ip_address` | String |
| 10 | `supName` | 供应商名称 | `sup_name` | String |
| 11 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 12 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 13 | `signupStartTime` | 报名开始时间 | `signup_start_time` | DateTime |
| 14 | `signupEndTime` | 报名截止时间 | `signup_end_time` | DateTime |
| 15 | `bidProjectId` | 招标项目主表ID | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 16 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 17 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 18 | `bidType` | 采购方式 | `bid_type` | String |
| 19 | `supPersonName` | 联系人名称 | `sup_person_name` | String |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `noticeStatus` | 报名状态 | `notice_status` | String |
| 22 | `supPersonTel` | 联系人电话 | `sup_person_tel` | String |
| 23 | `supPersonFax` | 联系人传真 | `sup_person_fax` | String |
| 24 | `supPersonMail` | 联系人邮箱 | `sup_person_mail` | String |
| 25 | `supSignTime` | 供应商报名时间 | `sup_sign_time` | DateTime |
| 26 | `purNoticeId` | 关联公告包id | `pur_notice_id` | 2c5fa673-819e-4dd0-93a3-c1af081ef94a |
| 27 | `hasBidAllSection` | 是否全部报名标保 | `has_bid_all_section` | Short |
| 28 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 29 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 30 | `supplydocId` | 供应商档案主键 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 31 | `vendorTenant` | vendorTenant | `vendor_tenant_id` | String |
| 32 | `tenantId` | tenantId | `tenant_id` | String |
| 33 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 34 | `createDate` | 创建日期 | `create_date` | Date |
| 35 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 36 | `defines` | 报名主表自定义项表 | `` | 717d4dba-5585-4c59-a5fc-d1a835fd8131 |
| 37 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 38 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 39 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 40 | `noticeApproves` | 供应商报名审核记录表 | `` | 79553459-1cfd-4980-98ed-fc4ff8b0bf92 |
| 41 | `noticeFiles` | 供应商报名资质附件表 | `` | 705783ab-cb89-46d9-b296-0e2f386a7049 |
| 42 | `noticeInvitations` | 报名标段信息 | `` | 43b5d55c-6f74-4db7-a16a-e00921491510 |
| 43 | `purOrgId` | 采购组织主键 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 44 | `verifystate` | 审批状态 | `verifystate` | Short |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织主键 | `org.func.BaseOrg` | Service |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | Service |  |
| 3 | `bidNoticeAuctionDefineCharacter` | 报名主表自定义项 | `auction.bidnotice.BidNoticeAuctionDefineCharacter` | None |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `bidProjectId` | 招标项目主表ID | `auction.project.AuctionProject` | None |  |
| 7 | `defines` | 报名主表自定义项表 | `auction.bidnotice.BidNoticeFreeDefine` | None | true |
| 8 | `purNoticeId` | 关联公告包id | `auction.announcement.AuctionAnnouncement` | None |  |
| 9 | `noticeApproves` | 供应商报名审核记录表 | `auction.bidnotice.NoticeApproveVO` | None | true |
| 10 | `supplydocId` | 供应商档案主键 | `aa.vendor.Vendor` | Service |  |
| 11 | `noticeFiles` | 供应商报名资质附件表 | `auction.bidnotice.NoticeFileVO` | None | true |
| 12 | `noticeInvitations` | 报名标段信息 | `auction.bidnotice.NoticeInvitationVO` | None | true |
| 13 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
