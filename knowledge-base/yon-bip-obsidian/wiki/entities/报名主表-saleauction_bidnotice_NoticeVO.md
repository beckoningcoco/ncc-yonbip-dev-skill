---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "saleauction.bidnotice.NoticeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报名主表 (`saleauction.bidnotice.NoticeVO`)

> ycBusinessCenter | 物理表：`cpu_bid_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报名主表 |
| 物理表 | `cpu_bid_notice` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:42:39.9640` |

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
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `supIpAddress` | 供应商报名地址 | `sup_ip_address` | String |
| 6 | `supName` | 供应商名称 | `sup_name` | String |
| 7 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 10 | `creator` | 创建人 | `creator` | String |
| 11 | `modifier` | 修改人 | `modifier` | String |
| 12 | `signupStartTime` | 报名开始时间 | `signup_start_time` | DateTime |
| 13 | `signupEndTime` | 报名截止时间 | `signup_end_time` | DateTime |
| 14 | `bidProjectId` | 招标项目主表ID | `bid_project_id` | 9f8b9356-4cd6-4ae7-8dc0-c84dfecdda07 |
| 15 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 16 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 17 | `bidType` | 采购方式 | `bid_type` | String |
| 18 | `supPersonName` | 联系人 | `sup_person_name` | String |
| 19 | `noticeStatus` | 报名状态 | `notice_status` | String |
| 20 | `supPersonTel` | 联系电话 | `sup_person_tel` | String |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `supPersonFax` | 传真 | `sup_person_fax` | String |
| 23 | `supPersonMail` | 邮箱 | `sup_person_mail` | String |
| 24 | `supSignTime` | 供应商报名时间 | `sup_sign_time` | DateTime |
| 25 | `purNoticeId` | 关联公告包id | `pur_notice_id` | ba0cbbbd-ef81-4f06-9fb0-e40a40cde1fa |
| 26 | `hasBidAllSection` | 是否全部报名标保 | `has_bid_all_section` | Short |
| 27 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 28 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 29 | `supplydocId` | 供应商档案主键 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 30 | `tenantId` | tenantId | `tenant_id` | String |
| 31 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 32 | `vendorTenant` | vendorTenant | `vendor_tenant_id` | String |
| 33 | `bidNoticeAuctionDefineCharacter` | 竞拍报名表头自定义项 | `define_character_id` | baa95d1e-729f-4456-8f04-d1e9126265a8 |
| 34 | `createDate` | 创建日期 | `create_date` | Date |
| 35 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 36 | `defines` | 报名主表自定义项表 | `` | 8fd4f324-41bd-4ef0-8c9a-150947470f18 |
| 37 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 38 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 39 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 40 | `noticeApproves` | 供应商报名审核记录表 | `` | f4b4ba64-d234-4f5c-9200-d5676ab22ca5 |
| 41 | `noticeFiles` | 供应商报名资质附件表 | `` | bc425757-81bc-42a9-9ec4-298e99670775 |
| 42 | `noticeInvitations` | 报名标段信息 | `` | 3269a77f-59f6-464f-9e94-e5e3e0b46c05 |
| 43 | `purOrgId` | 采购组织主键 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 44 | `verifystate` | 审批状态 | `verifystate` | Short |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织主键 | `org.func.BaseOrg` | Service |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | Service |  |
| 3 | `bidNoticeAuctionDefineCharacter` | 竞拍报名表头自定义项 | `saleauction.bidnotice.BidNoticeAuctionDefineCharacter` | None |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `bidProjectId` | 招标项目主表ID | `saleauction.project.AuctionProject` | None |  |
| 7 | `defines` | 报名主表自定义项表 | `saleauction.bidnotice.BidNoticeFreeDefine` | None | true |
| 8 | `purNoticeId` | 关联公告包id | `saleauction.announcement.AuctionAnnouncement` | None |  |
| 9 | `noticeApproves` | 供应商报名审核记录表 | `saleauction.bidnotice.NoticeApproveVO` | None | true |
| 10 | `supplydocId` | 供应商档案主键 | `aa.vendor.Vendor` | Service |  |
| 11 | `noticeFiles` | 供应商报名资质附件表 | `saleauction.bidnotice.NoticeFileVO` | None | true |
| 12 | `noticeInvitations` | 报名标段信息 | `saleauction.bidnotice.NoticeInvitationVO` | None | true |
| 13 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
