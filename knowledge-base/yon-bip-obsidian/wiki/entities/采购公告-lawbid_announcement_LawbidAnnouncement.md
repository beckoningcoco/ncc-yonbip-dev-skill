---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.announcement.LawbidAnnouncement"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购公告 (`lawbid.announcement.LawbidAnnouncement`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_announcement`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购公告 |
| 物理表 | `cpu_bid_announcement` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:06.3410` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |
| 编码 | `bid_project_code` | String | 采购项目编号 |

## 部署信息

- 部署时间: 2026-01-23 23:56:16:000

## 依赖接口（10个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |
| 4 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 5 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 6 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 7 | 审批兼容信息 | `lawbid.commonitf.ICompatibleFlowInfo` | 6 |
| 8 | 公告接口 | `announcement.itf.IAnnouncement` | 1426 |
| 9 | lawbidTenant租户相关 | `lawbid.itf.ITenant` | 2 |
| 10 | 审批信息 | `base.itf.IApprovalInfo` | 172 |

---

## 直接属性（79个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `lawbidProjectId` | 招标项目ID | `lawbid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 2 | `lawbidAnnouncementDefineCharacter` | 采购公告自定义项 | `define_character_id` | a809d118-c06a-484c-9fec-9897ff30020a |
| 3 | `bidderQualification` | 投标人资格条件(文本) | `bidder_qualification` | String |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 7 | `verifystate` | 审批状态 | `verifystate` | Short |
| 8 | `returncount` | 退回次数 | `returncount` | Short |
| 9 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 10 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `createDate` | 创建日期 | `create_date` | Date |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `creator` | 创建人名称 | `creator` | String |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 20 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 21 | `flowSource` | 审批源 | `flow_source` | String |
| 22 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 23 | `templateContent` | 公告信息 | `template_content` | String |
| 24 | `signupStartTime` | 报名开始时间 | `signup_start_time` | DateTime |
| 25 | `signupEndTime` | 报名结束时间 | `signup_end_time` | DateTime |
| 26 | `bidDocSaleBegin` | 领取开始时间 | `bid_doc_sale_begin` | DateTime |
| 27 | `bidDocSaleEnd` | 领取结束时间 | `bid_doc_sale_end` | DateTime |
| 28 | `bidDocGetMode` | 文件领取方式 | `bid_doc_get_mode` | String |
| 29 | `docReceivePlace` | 文件现场领取地点 | `doc_receive_place` | String |
| 30 | `tenderDocSubmitEnd` | 递交截止时间 | `tender_doc_submit_end` | DateTime |
| 31 | `tenderDocSubmitMode` | 递交方式 | `tender_doc_submit_mode` | String |
| 32 | `tenderDocSubmitPlace` | 递交地点 | `tender_doc_submit_place` | String |
| 33 | `tenderDocQuestionEnd` | 提问截止时间 | `tender_doc_question_end` | DateTime |
| 34 | `bidOpenTime` | 开标时间 | `bid_open_time` | DateTime |
| 35 | `bidOpenPlace` | 开标地点 | `bid_open_place` | String |
| 36 | `agencyContactPersonWay` | 联系方式 | `agency_contact_person_way` | String |
| 37 | `agencyContactPersonName` | 联系人 | `agency_contact_person_name` | String |
| 38 | `agencyContactPersonTel` | 联系人电话 | `agency_contact_person_tel` | String |
| 39 | `agencyContactPersonFax` | 传真 | `agency_contact_person_fax` | String |
| 40 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 41 | `projectSummary` | 项目概述 | `project_summary` | String |
| 42 | `fileCode` | 附件 | `file_code` | String |
| 43 | `qualificationRequire` | 投标人资格条件(富文本) | `qualification_require` | String |
| 44 | `tenderNoticePassTime` | 发布招标公告/投标邀请时间 | `tender_notice_pass_time` | DateTime |
| 45 | `bidNoticeChannel` | 招标公告发布渠道 | `bid_notice_channel` | String |
| 46 | `agencyContactPersonId` | 招标代理联系人ID | `agency_contact_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 47 | `noticeMakerPersionId` | 公告制作人/经办人ID | `notice_maker_persion_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 48 | `noticeMakerPersionName` | 公告制作人/经办人 | `notice_maker_persion_name` | String |
| 49 | `noticeMakerTime` | 公告创建时间 | `notice_maker_time` | DateTime |
| 50 | `copy` | 是否同步信息至其他标段 | `copy` | Short |
| 51 | `noticeContent` | 公告内容 | `notice_content` | String |
| 52 | `useNoticeTemplate` | 是否使用公告模板 | `use_notice_template` | Short |
| 53 | `bidDocStatus` | 招标文件状态 | `bid_doc_status` | String |
| 54 | `noticeGetBiddoc` | 是否需要报名领取标书 | `notice_get_biddoc` | String |
| 55 | `changeCount` | 变化次数 | `change_count` | Integer |
| 56 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 57 | `noticeTemplateId` | 公告模板id | `notice_template_id` | 9afba638-be6f-4d54-b870-3448a8ccf849 |
| 58 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 59 | `isHistoryFlow` | 是否为历史审批流 | `is_history_flow` | Integer |
| 60 | `bidNoticeName` | 公告名称 | `bid_notice_name` | String |
| 61 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 62 | `agencyContactPersonMail` | 邮箱 | `agency_contact_person_mail` | String |
| 63 | `purOrgId` | 代理公司组织id | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 64 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 65 | `historyFlowKey` | 历史businessKey | `history_flow_key` | String |
| 66 | `bidOpenMode` | 开标地点类型 | `bid_open_mode` | String |
| 67 | `bidOpenPlaceType` | 开标方式 | `bid_open_place_type` | String |
| 68 | `tenantId` | tenant租户 | `tenant_id` | String |
| 69 | `auditor` | 审批人名称 | `auditor` | String |
| 70 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 71 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 72 | `auditDate` | 审批日期 | `audit_date` | Date |
| 73 | `id` | 主键 | `id` | Long |
| 74 | `pubts` | 时间戳 | `pubts` | DateTime |
| 75 | `announcementQualifyList` | 发标报名审核条件 | `` | cf8ac3bf-f6a7-4731-b370-0196ae7386d8 |
| 76 | `announcementSectionList` | 采购公告标包信息 | `` | 1dd01106-207a-4f75-a076-499451600fbf |
| 77 | `channelList` | 采购公告外部发布渠道 | `` | 1ac77246-e3d1-44fe-8eaa-3c7c107e8ee2 |
| 78 | `define` | 采购公告自由自定义项 | `` | 2fe33ed0-ace5-40ea-94f7-4cbd527a0a8d |
| 79 | `invitationSupplierList` | 采购公告邀请供应商 | `` | 0995ba7c-4a31-4fd3-8a53-003a3f238662 |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 代理公司组织id | `org.func.BaseOrg` | Service |  |
| 2 | `lawbidProjectId` | 招标项目ID | `lawbid.project.LawbidProject` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `announcementQualifyList` | 发标报名审核条件 | `lawbid.announcement.LawbidAnnouncementQualify` | None | true |
| 7 | `noticeTemplateId` | 公告模板id | `bctask.noticetemplate.NoticeTemplate` | Service |  |
| 8 | `noticeMakerPersionId` | 公告制作人/经办人ID | `bd.staff.Staff` | Service |  |
| 9 | `lawbidAnnouncementDefineCharacter` | 采购公告自定义项 | `lawbid.announcement.LawbidAnnouncementDefineCharacter` | None |  |
| 10 | `announcementSectionList` | 采购公告标包信息 | `lawbid.announcement.LawbidAnnouncementSection` | None | true |
| 11 | `channelList` | 采购公告外部发布渠道 | `lawbid.announcement.LawbidAnnouncementChannel` | None | true |
| 12 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 13 | `invitationSupplierList` | 采购公告邀请供应商 | `lawbid.announcement.LawbidInvitationSupplier` | None | true |
| 14 | `transTypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 15 | `define` | 采购公告自由自定义项 | `lawbid.announcement.LawbidAnnouncementFreedefine` | None | true |
| 16 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 17 | `agencyContactPersonId` | 招标代理联系人ID | `bd.staff.Staff` | Service |  |
