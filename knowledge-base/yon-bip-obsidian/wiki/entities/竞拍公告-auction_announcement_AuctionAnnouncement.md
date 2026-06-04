---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.announcement.AuctionAnnouncement"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍公告 (`auction.announcement.AuctionAnnouncement`)

> ycSouringAuction | 物理表：`cpu_bid_announcement`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍公告 |
| 物理表 | `cpu_bid_announcement` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:23.5350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `bid_project_code` | String | 竞拍项目编号 |

---

## 直接属性（78个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 2 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 3 | `flowSource` | 审批源 | `flow_source` | String |
| 4 | `id` | id | `id` | Long |
| 5 | `noticeGetBiddoc` | 是否需要报名领取标书 | `notice_get_biddoc` | String |
| 6 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 7 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `bidderQualification` | 投标人资格条件 | `bidder_qualification` | String |
| 9 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `verifystate` | 审批状态 | `verifystate` | Short |
| 12 | `returncount` | 退回次数 | `returncount` | Short |
| 13 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime |
| 15 | `createDate` | 创建日期 | `create_date` | Date |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `creator` | 创建人名称 | `creator` | String |
| 19 | `modifier` | 修改人名称 | `modifier` | String |
| 20 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `agencyContactPersonWay` | 联系方式 | `agency_contact_person_way` | String |
| 23 | `changeCount` | 变化次数 | `change_count` | Integer |
| 24 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 25 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 26 | `isHistoryFlow` | 是否为历史审批流 | `is_history_flow` | Integer |
| 27 | `historyFlowKey` | 历史businessKey | `history_flow_key` | String |
| 28 | `bidNoticeName` | 公告名称 | `bid_notice_name` | String |
| 29 | `tenantId` | tenant租户 | `tenant_id` | String |
| 30 | `auditor` | 审批人名称 | `auditor` | String |
| 31 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 32 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 33 | `auditDate` | 审批日期 | `audit_date` | Date |
| 34 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 35 | `templateContent` | 公告信息 | `template_content` | String |
| 36 | `agencyContactPersonName` | 联系人 | `agency_contact_person_name` | String |
| 37 | `agencyContactPersonTel` | 联系人电话 | `agency_contact_person_tel` | String |
| 38 | `signupStartTime` | 报名开始时间 | `signup_start_time` | DateTime |
| 39 | `AuctionAnnouncementDefineCharacter` | 竞拍公告自定义项 | `define_character_id` | c22351e5-191c-41df-aab6-bab6f453052d |
| 40 | `bidDocSaleBegin` | 领取开始时间 | `bid_doc_sale_begin` | DateTime |
| 41 | `auctionProjectId` | 招标项目ID | `lawbid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 42 | `signupEndTime` | 报名截止时间 | `signup_end_time` | DateTime |
| 43 | `bidDocSaleEnd` | 领取截止时间 | `bid_doc_sale_end` | DateTime |
| 44 | `bidProjectCode` | 竞拍项目编号 | `bid_project_code` | String |
| 45 | `bidProjectName` | 竞拍项目名称 | `bid_project_name` | String |
| 46 | `projectSummary` | 项目概述 | `project_summary` | String |
| 47 | `fileCode` | 附件 | `file_code` | String |
| 48 | `qualificationRequire` | 投标人资格条件(富文本) | `qualification_require` | String |
| 49 | `bidDocGetMode` | 文件领取方式 | `bid_doc_get_mode` | String |
| 50 | `docReceivePlace` | 文件现场领取地点 | `doc_receive_place` | String |
| 51 | `tenderDocSubmitEnd` | 递交截止时间 | `tender_doc_submit_end` | DateTime |
| 52 | `tenderDocSubmitMode` | 递交方式 | `tender_doc_submit_mode` | String |
| 53 | `tenderDocSubmitPlace` | 递交地点 | `tender_doc_submit_place` | String |
| 54 | `tenderDocQuestionEnd` | 询问截止时间 | `tender_doc_question_end` | DateTime |
| 55 | `bidOpenTime` | 开标时间 | `bid_open_time` | DateTime |
| 56 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 57 | `bidOpenPlace` | 开标地点 | `bid_open_place` | String |
| 58 | `tenderNoticePassTime` | 发布招标公告/投标邀请时间 | `tender_notice_pass_time` | DateTime |
| 59 | `agencyContactPersonMail` | 邮箱 | `agency_contact_person_mail` | String |
| 60 | `bidOpenPlaceType` | 开标地点类型 | `bid_open_place_type` | String |
| 61 | `agencyContactPersonFax` | 传真 | `agency_contact_person_fax` | String |
| 62 | `bidNoticeChannel` | 招标公告发布渠道 | `bid_notice_channel` | String |
| 63 | `noticeTemplateId` | 公告模板id | `notice_template_id` | 9afba638-be6f-4d54-b870-3448a8ccf849 |
| 64 | `agencyContactPersonId` | 招标代理联系人ID | `agency_contact_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 65 | `noticeMakerPersionId` | 公告制作人/经办人ID | `notice_maker_persion_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 66 | `noticeMakerPersionName` | 公告制作人/经办人 | `notice_maker_persion_name` | String |
| 67 | `noticeMakerTime` | 公告创建时间 | `notice_maker_time` | DateTime |
| 68 | `purOrgId` | 代理公司组织id | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 69 | `copy` | 是否同步信息至其他标段 | `copy` | Short |
| 70 | `useNoticeTemplate` | 是否使用公告模板 | `use_notice_template` | Short |
| 71 | `bidDocStatus` | 公告状态 | `bid_doc_status` | String |
| 72 | `noticeContent` | 公告内容 | `notice_content` | String |
| 73 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 74 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 75 | `announcementQualifyList` | 发标资格审核条件 | `` | 19e576cf-077d-4edd-9add-46e2a6693910 |
| 76 | `announcementSectionList` | 公告标包标段信息 | `` | d046c9cf-68b1-48bb-8686-13a20ae80de7 |
| 77 | `define` | 竞拍公告自由自定义项 | `` | 6977be9c-c6c4-4ad9-ab54-32340c14ea81 |
| 78 | `invitationSupplierList` | 邀请供应商 | `` | 437dcdfb-3f74-427a-b85c-8b2ef5e32df1 |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 代理公司组织id | `org.func.BaseOrg` | Service |  |
| 2 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `announcementQualifyList` | 发标资格审核条件 | `auction.announcement.AuctionAnnouncementQualify` | None | true |
| 6 | `noticeTemplateId` | 公告模板id | `bctask.noticetemplate.NoticeTemplate` | Service |  |
| 7 | `noticeMakerPersionId` | 公告制作人/经办人ID | `bd.staff.Staff` | Service |  |
| 8 | `announcementSectionList` | 公告标包标段信息 | `auction.announcement.AuctionAnnouncementSection` | None | true |
| 9 | `auctionProjectId` | 招标项目ID | `auction.project.AuctionProject` | None |  |
| 10 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 11 | `AuctionAnnouncementDefineCharacter` | 竞拍公告自定义项 | `auction.announcement.AuctionAnnouncementDefineCharacter` | None |  |
| 12 | `invitationSupplierList` | 邀请供应商 | `auction.announcement.AuctionInvitationSupplier` | None | true |
| 13 | `transTypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 14 | `define` | 竞拍公告自由自定义项 | `auction.announcement.AuctionAnnouncementFreedefine` | None | true |
| 15 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 16 | `agencyContactPersonId` | 招标代理联系人ID | `bd.staff.Staff` | Service |  |
