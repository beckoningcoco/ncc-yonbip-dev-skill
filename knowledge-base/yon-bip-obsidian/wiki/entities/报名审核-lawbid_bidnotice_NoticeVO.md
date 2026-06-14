---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "lawbid.bidnotice.NoticeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报名审核 (`lawbid.bidnotice.NoticeVO`)

> ycBusinessCenter | 物理表：`cpu_bid_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报名审核 |
| 物理表 | `cpu_bid_notice` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:42:32.4380` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（44个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `billStatus` | 供应商报名状态 | `billstatus` | String |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人 | `creator` | String |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 7 | `modifier` | 修改人 | `modifier` | String |
| 8 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 9 | `noticeVODefineCharacter` | 投标报名表头自定义项 | `define_character_id` | d4d59b12-9200-4655-b63e-940a5820d16b |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `signupEndTime` | 报名结束时间 | `signup_end_time` | DateTime |
| 12 | `signupStartTime` | 报名开始时间 | `signup_start_time` | DateTime |
| 13 | `supIpAddress` | 供应商报名ip地址 | `sup_ip_address` | String |
| 14 | `supName` | 供应商名称 | `sup_name` | String |
| 15 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 16 | `id` | id | `id` | Long |
| 17 | `bidProjectId` | 招标项目主表ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 18 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 19 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 20 | `bidType` | 采购方式 | `bid_type` | String |
| 21 | `supPersonName` | 联系人名称 | `sup_person_name` | String |
| 22 | `noticeStatus` | 报名状态 | `notice_status` | String |
| 23 | `supPersonTel` | 联系人电话 | `sup_person_tel` | String |
| 24 | `supPersonFax` | 联系人传真 | `sup_person_fax` | String |
| 25 | `supPersonMail` | 联系人邮箱 | `sup_person_mail` | String |
| 26 | `supSignTime` | 供应商报名时间 | `sup_sign_time` | DateTime |
| 27 | `purNoticeId` | 关联公告包id | `pur_notice_id` | c8caefa3-7f5b-4560-bb77-c2962503e2df |
| 28 | `hasBidAllSection` | 是否全部报名标保 | `has_bid_all_section` | Short |
| 29 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 30 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 31 | `supplydocId` | 供应商档案主键 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 32 | `tenantId` | tenantId | `tenant_id` | String |
| 33 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 34 | `createDate` | 创建日期 | `create_date` | Date |
| 35 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 36 | `defines` | 报名主表自定义项表 | `` | db359dec-49d7-4ede-946f-c5e076f4a51e |
| 37 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 38 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 39 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 40 | `noticeApproves` | 报名审核记录子表 | `` | f8cee0e8-7a8a-4222-b132-a3629368af89 |
| 41 | `noticeFiles` | 报名文件子表 | `` | 1c5191a4-360c-45d4-9124-628e0b016ab2 |
| 42 | `noticeInvitations` | 报名标段子表 | `` | a14787be-fcf8-495d-bef0-26d33bcd3c69 |
| 43 | `purOrgId` | 采购组织主键 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 44 | `verifystate` | 审批状态 | `verifystate` | Short |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织主键 | `org.func.BaseOrg` | Service |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `bidProjectId` | 招标项目主表ID | `lawbid.project.LawbidProject` | None |  |
| 6 | `defines` | 报名主表自定义项表 | `lawbid.bidnotice.BidNoticeFreeDefine` | None | true |
| 7 | `purNoticeId` | 关联公告包id | `lawbid.announcement.LawbidAnnouncement` | None |  |
| 8 | `noticeApproves` | 报名审核记录子表 | `lawbid.bidnotice.NoticeApproveVO` | None | true |
| 9 | `noticeVODefineCharacter` | 投标报名表头自定义项 | `lawbid.bidnotice.NoticeVODefineCharacter` | None |  |
| 10 | `supplydocId` | 供应商档案主键 | `aa.vendor.Vendor` | Service |  |
| 11 | `noticeFiles` | 报名文件子表 | `lawbid.bidnotice.NoticeFileVO` | None | true |
| 12 | `noticeInvitations` | 报名标段子表 | `lawbid.bidnotice.NoticeInvitationVO` | None | true |
| 13 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
