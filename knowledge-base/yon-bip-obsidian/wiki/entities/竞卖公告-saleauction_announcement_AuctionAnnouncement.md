---
tags: ["BIP", "元数据", "数据字典", "ycAuction", "saleauction.announcement.AuctionAnnouncement"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞卖公告 (`saleauction.announcement.AuctionAnnouncement`)

> ycAuction | 物理表：`cpu_bid_announcement`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞卖公告 |
| 物理表 | `cpu_bid_announcement` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycAuction` |
| 构建时间 | `2026-06-04 23:43:46.6440` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `bid_project_code` | String | 竞卖项目编号 |

---

## 直接属性（78个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 2 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 3 | `flowSource` | 审批源 | `flow_source` | String |
| 4 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 5 | `id` | id | `id` | Long |
| 6 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 7 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `verifystate` | 审批状态 | `verifystate` | Short |
| 10 | `returncount` | 退回次数 | `returncount` | Short |
| 11 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime |
| 13 | `createDate` | 创建日期 | `create_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `creator` | 创建人名称 | `creator` | String |
| 17 | `modifier` | 修改人名称 | `modifier` | String |
| 18 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `agencyContactPersonWay` | 联系方式 | `agency_contact_person_way` | String |
| 21 | `bidderQualification` | 投标人资格条件 | `bidder_qualification` | String |
| 22 | `changeCount` | 变化次数 | `change_count` | Integer |
| 23 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 24 | `isHistoryFlow` | 是否为历史审批流 | `is_history_flow` | Integer |
| 25 | `bidNoticeName` | 公告名称 | `bid_notice_name` | String |
| 26 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 27 | `historyFlowKey` | 历史businessKey | `history_flow_key` | String |
| 28 | `tenantId` | tenant租户 | `tenant_id` | String |
| 29 | `auditor` | 审批人名称 | `auditor` | String |
| 30 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 31 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 32 | `auditDate` | 审批日期 | `audit_date` | Date |
| 33 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 34 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 35 | `noticeContent` | 公告信息 | `notice_content` | String |
| 36 | `noticeGetBiddoc` | 是否须报名 | `notice_get_biddoc` | String |
| 37 | `agencyContactPersonName` | 联系人 | `agency_contact_person_name` | String |
| 38 | `agencyContactPersonTel` | 联系人电话 | `agency_contact_person_tel` | String |
| 39 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 40 | `signupStartTime` | 报名开始时间 | `signup_start_time` | DateTime |
| 41 | `AuctionAnnouncementDefineCharacter` | 竞卖公告自定义项 | `define_character_id` | 341d4292-cc51-4bde-8aa3-02b801fab329 |
| 42 | `bidDocSaleBegin` | 领取开始时间 | `bid_doc_sale_begin` | DateTime |
| 43 | `auctionProjectId` | 招标项目ID | `lawbid_project_id` | 9f8b9356-4cd6-4ae7-8dc0-c84dfecdda07 |
| 44 | `signupEndTime` | 报名截止时间 | `signup_end_time` | DateTime |
| 45 | `bidDocSaleEnd` | 领取截止时间 | `bid_doc_sale_end` | DateTime |
| 46 | `bidProjectCode` | 竞卖项目编号 | `bid_project_code` | String |
| 47 | `bidProjectName` | 竞卖项目名称 | `bid_project_name` | String |
| 48 | `projectSummary` | 项目概述 | `project_summary` | String |
| 49 | `fileCode` | 附件 | `file_code` | String |
| 50 | `qualificationRequire` | 竞卖方资格条件 | `qualification_require` | String |
| 51 | `bidDocGetMode` | 文件领取方式 | `bid_doc_get_mode` | String |
| 52 | `docReceivePlace` | 文件现场领取地点 | `doc_receive_place` | String |
| 53 | `tenderNoticePassTime` | 发布招标公告/投标邀请时间 | `tender_notice_pass_time` | DateTime |
| 54 | `tenderDocSubmitEnd` | 递交截止时间 | `tender_doc_submit_end` | DateTime |
| 55 | `agencyContactPersonMail` | 邮箱 | `agency_contact_person_mail` | String |
| 56 | `tenderDocSubmitMode` | 递交方式 | `tender_doc_submit_mode` | String |
| 57 | `bidOpenPlaceType` | 开标地点类型 | `bid_open_place_type` | String |
| 58 | `tenderDocSubmitPlace` | 递交地点 | `tender_doc_submit_place` | String |
| 59 | `agencyContactPersonFax` | 传真 | `agency_contact_person_fax` | String |
| 60 | `tenderDocQuestionEnd` | 询问截止时间 | `tender_doc_question_end` | DateTime |
| 61 | `bidNoticeChannel` | 公告发布渠道 | `bid_notice_channel` | String |
| 62 | `bidOpenTime` | 开标时间 | `bid_open_time` | DateTime |
| 63 | `noticeTemplateId` | 公告模板id | `notice_template_id` | 9afba638-be6f-4d54-b870-3448a8ccf849 |
| 64 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 65 | `bidOpenPlace` | 开标地点 | `bid_open_place` | String |
| 66 | `agencyContactPersonId` | 招标代理联系人ID | `agency_contact_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 67 | `templateContent` | 公告内容 | `template_content` | String |
| 68 | `noticeMakerPersionId` | 公告制作人/经办人ID | `notice_maker_persion_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 69 | `noticeMakerPersionName` | 公告制作人/经办人 | `notice_maker_persion_name` | String |
| 70 | `noticeMakerTime` | 公告创建时间 | `notice_maker_time` | DateTime |
| 71 | `purOrgId` | 代理公司组织id | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 72 | `copy` | 是否同步信息至其他标段 | `copy` | Short |
| 73 | `useNoticeTemplate` | 是否使用公告模板 | `use_notice_template` | Short |
| 74 | `bidDocStatus` | 招标文件状态 | `bid_doc_status` | String |
| 75 | `announcementQualifyList` | 发标资格审核条件 | `` | 97e1a6a5-75ae-483f-a19c-ad338540b617 |
| 76 | `announcementSectionList` | 公告标包标段信息 | `` | 26f7d286-a241-415b-9be1-935fb4d87fd2 |
| 77 | `define` | 竞卖公告自由自定义项 | `` | 6170815f-d06b-4412-97c6-12765d6ddf11 |
| 78 | `invitationSupplierList` | 邀请供应商 | `` | f25c9fc8-aa0b-40f9-84ec-b536457f319e |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 代理公司组织id | `org.func.BaseOrg` | Service |  |
| 2 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `announcementQualifyList` | 发标资格审核条件 | `saleauction.announcement.AuctionAnnouncementQualify` | None | true |
| 6 | `noticeTemplateId` | 公告模板id | `bctask.noticetemplate.NoticeTemplate` | Service |  |
| 7 | `noticeMakerPersionId` | 公告制作人/经办人ID | `bd.staff.Staff` | Service |  |
| 8 | `announcementSectionList` | 公告标包标段信息 | `saleauction.announcement.AuctionAnnouncementSection` | None | true |
| 9 | `auctionProjectId` | 招标项目ID | `saleauction.project.AuctionProject` | None |  |
| 10 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 11 | `AuctionAnnouncementDefineCharacter` | 竞卖公告自定义项 | `saleauction.announcement.AuctionAnnouncementDefineCharacter` | None |  |
| 12 | `invitationSupplierList` | 邀请供应商 | `saleauction.announcement.AuctionInvitationSupplier` | None | true |
| 13 | `transTypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 14 | `define` | 竞卖公告自由自定义项 | `saleauction.announcement.AuctionAnnouncementFreedefine` | None | true |
| 15 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 16 | `agencyContactPersonId` | 招标代理联系人ID | `bd.staff.Staff` | Service |  |
