---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.tenderAnnouncement.LawbidAnnouncementTender"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购公告合并 (`lawbid.tenderAnnouncement.LawbidAnnouncementTender`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_announcement_tender`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购公告合并 |
| 物理表 | `cpu_bid_announcement_tender` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:45.3590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:58:02:000

## 依赖接口（9个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |
| 4 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 5 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 6 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 7 | 审批兼容信息 | `lawbid.commonitf.ICompatibleFlowInfo` | 6 |
| 8 | 采购标书接口 | `tenderAnnouncement.itf.ITenderAnnouncement` | 4 |
| 9 | 审批信息 | `base.itf.IApprovalInfo` | 172 |

---

## 直接属性（79个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 2 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 3 | `flowSource` | 审批源 | `flow_source` | String |
| 4 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 5 | `id` | id | `id` | Long |
| 6 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 7 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `bidderQualification` | 投标人资格条件(文本) | `bidder_qualification` | String |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `verifystate` | 审批状态 | `verifystate` | Short |
| 11 | `returncount` | 退回次数 | `returncount` | Short |
| 12 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `createDate` | 创建日期 | `create_date` | Date |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `creator` | 创建人名称 | `creator` | String |
| 18 | `modifier` | 修改人名称 | `modifier` | String |
| 19 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `agencyContactPersonWay` | 联系方式 | `agency_contact_person_way` | String |
| 22 | `changeCount` | 变化次数 | `change_count` | Integer |
| 23 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 24 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 25 | `isHistoryFlow` | 是否为历史审批流 | `is_history_flow` | Integer |
| 26 | `historyFlowKey` | 历史businessKey | `history_flow_key` | String |
| 27 | `auditor` | 审批人名称 | `auditor` | String |
| 28 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 30 | `auditDate` | 审批日期 | `audit_date` | Date |
| 31 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 32 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 33 | `noticeContent` | 公告内容 | `notice_content` | String |
| 34 | `noticeGetBiddoc` | 报名通过后领取文件 | `notice_get_biddoc` | String |
| 35 | `agencyContactPersonName` | 联系人 | `agency_contact_person_name` | String |
| 36 | `agencyContactPersonTel` | 联系人电话 | `agency_contact_person_tel` | String |
| 37 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 38 | `signupStartTime` | 报名开始时间 | `signup_start_time` | DateTime |
| 39 | `lawbidAnnouncementTenderDefineCharacter` | 采购公告自定义项 | `define_character_id` | da775c08-8d2f-48cf-bd73-f4beefc4c803 |
| 40 | `lawbidProjectId` | 招标项目ID | `lawbid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 41 | `signupEndTime` | 报名截止时间 | `signup_end_time` | DateTime |
| 42 | `bidDocSaleBegin` | 领取开始时间 | `bid_doc_sale_begin` | DateTime |
| 43 | `bidDocSaleEnd` | 领取截止时间 | `bid_doc_sale_end` | DateTime |
| 44 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 45 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 46 | `projectSummary` | 项目概述 | `project_summary` | String |
| 47 | `qualificationRequire` | 投标人资格条件(富文本) | `qualification_require` | String |
| 48 | `fileCode` | 附件 | `file_code` | String |
| 49 | `bidFileCode` | 招标文件 | `bid_file_code` | String |
| 50 | `bidDocGetMode` | 文件领取方式 | `bid_doc_get_mode` | String |
| 51 | `docReceivePlace` | 文件现场领取地点 | `doc_receive_place` | String |
| 52 | `tenderDocSubmitEnd` | 递交截止时间 | `tender_doc_submit_end` | DateTime |
| 53 | `tenderDocSubmitMode` | 递交方式 | `tender_doc_submit_mode` | String |
| 54 | `tenderDocSubmitPlace` | 递交地点 | `tender_doc_submit_place` | String |
| 55 | `bidOpenTime` | 开标时间 | `bid_open_time` | DateTime |
| 56 | `bidOpenPlaceType` | 开标方式 | `bid_open_place_type` | String |
| 57 | `bidOpenPlace` | 开标地点 | `bid_open_place` | String |
| 58 | `tenderDocQuestionEnd` | 询问截止时间 | `tender_doc_question_end` | DateTime |
| 59 | `tenderNoticePassTime` | 发布招标公告/投标邀请时间 | `tender_notice_pass_time` | DateTime |
| 60 | `agencyContactPersonMail` | 邮箱 | `agency_contact_person_mail` | String |
| 61 | `bidOpenMode` | 开标地点类型 | `bid_open_mode` | String |
| 62 | `agencyContactPersonFax` | 传真 | `agency_contact_person_fax` | String |
| 63 | `bidNoticeChannel` | 公告发布渠道 | `bid_notice_channel` | String |
| 64 | `noticeTemplateId` | 公告模板id | `notice_template_id` | 9afba638-be6f-4d54-b870-3448a8ccf849 |
| 65 | `bidNoticeName` | 公告名称 | `bid_notice_name` | String |
| 66 | `agencyContactPersonId` | 招标代理联系人ID | `agency_contact_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 67 | `templateContent` | 公告信息 | `template_content` | String |
| 68 | `noticeMakerPersionId` | 公告制作人/经办人ID | `notice_maker_persion_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 69 | `noticeMakerPersionName` | 公告制作人/经办人 | `notice_maker_persion_name` | String |
| 70 | `noticeMakerTime` | 公告创建时间 | `notice_maker_time` | DateTime |
| 71 | `purOrgId` | 代理公司组织id | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 72 | `copy` | 是否同步信息至其他标段 | `copy` | Short |
| 73 | `useNoticeTemplate` | 是否使用公告模板 | `use_notice_template` | Short |
| 74 | `bidDocStatus` | 招标文件状态 | `bid_doc_status` | String |
| 75 | `announcementQualifyList` | 发标报名审核条件 | `` | b455eb0a-6930-470c-86e1-dabf2ea351df |
| 76 | `announcementSectionList` | 采购标书标包信息 | `` | cabadb1e-5c64-4035-bbba-d79c9db61370 |
| 77 | `channelList` | 采购标书外部发布渠道 | `` | f67fa031-472d-4415-828c-11b7ad4f4bfd |
| 78 | `define` | 采购公告自由自定义项 | `` | be962603-9d45-4d83-9902-139030a3e590 |
| 79 | `invitationSupplierList` | 采购公告邀请供应商 | `` | 8440c6ba-59af-44a6-a53a-c4f95f52d329 |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 代理公司组织id | `org.func.BaseOrg` | Service |  |
| 2 | `lawbidProjectId` | 招标项目ID | `lawbid.project.LawbidProject` | None |  |
| 3 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `announcementQualifyList` | 发标报名审核条件 | `lawbid.tenderAnnouncement.LawbidAnnouncementQualifyTender` | None | true |
| 7 | `noticeTemplateId` | 公告模板id | `bctask.noticetemplate.NoticeTemplate` | Service |  |
| 8 | `noticeMakerPersionId` | 公告制作人/经办人ID | `bd.staff.Staff` | Service |  |
| 9 | `announcementSectionList` | 采购标书标包信息 | `lawbid.tenderAnnouncement.LawbidAnnouncementSectionTender` | None | true |
| 10 | `channelList` | 采购标书外部发布渠道 | `lawbid.tenderAnnouncement.LawbidAnnouncementChannelTender` | None | true |
| 11 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 12 | `invitationSupplierList` | 采购公告邀请供应商 | `lawbid.tenderAnnouncement.LawbidInvitationSupplierTender` | None | true |
| 13 | `transTypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 14 | `define` | 采购公告自由自定义项 | `lawbid.tenderAnnouncement.LawbidAnnouncementTenderFreedefine` | None | true |
| 15 | `lawbidAnnouncementTenderDefineCharacter` | 采购公告自定义项 | `lawbid.tenderAnnouncement.LawbidAnnouncementTenderDefineCharacter` | None |  |
| 16 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 17 | `agencyContactPersonId` | 招标代理联系人ID | `bd.staff.Staff` | Service |  |
