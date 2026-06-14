---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.tenderAnnouncement.LawbidAnnouncementSectionTender"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购标书标包信息 (`lawbid.tenderAnnouncement.LawbidAnnouncementSectionTender`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_announcement_section_tender`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购标书标包信息 |
| 物理表 | `cpu_bid_announcement_section_tender` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:03:14.2310` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:58:02:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 采购公告标包接口 | `tenderAnnouncement.itf.ITenderAnnouncementSection` | 4 |

---

## 直接属性（87个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 3 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `bidScorePlanId` | 评标办法id | `bid_score_plan_id` | 47d2f6a7-a9be-4eb1-af5f-b15b0564d14a |
| 5 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `announcementId` | 公告主表ID | `announcement_id` | e764c131-bca2-44d7-a8af-fe17cb0837f8 |
| 7 | `bidEvaluationPlanId` | 初审办法id | `bid_evaluation_plan_id` | 47d2f6a7-a9be-4eb1-af5f-b15b0564d14a |
| 8 | `bidSectionId` | 标段ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 9 | `projectSectionId` | 项目标段子表ID | `project_section_id` | ecfe849d-8880-4a81-ac60-5318b0a7915b |
| 10 | `purchaseTypeName` | 采购类型名称 | `purchase_type_name` | String |
| 11 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 12 | `lawbidAnnouncementSectionTenderDefineCharacter` | 采购公告标包信息自定义项 | `define_character_id` | 4a89c766-9a38-41bd-b4d8-3790deb96919 |
| 13 | `bidSectionCode` | 标段编号 | `bid_section_code` | String |
| 14 | `bidSectionName` | 标段名称 | `bid_section_name` | String |
| 15 | `priceOpenType` | 价格开启方式 | `price_open_type` | String |
| 16 | `enableCaState` | 是否启用CA签章 | `enable_ca_state` | String |
| 17 | `issuance` | 选择文件发售 | `issuance` | Integer |
| 18 | `saleAmount` | 文件发售金额 | `sale_amount` | Decimal |
| 19 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 20 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 21 | `isBidEnsure` | 选择投标保证金 | `is_bid_ensure` | Integer |
| 22 | `bidEnsureMoney` | 投标保证金 | `bid_ensure_money` | Decimal |
| 23 | `bidBiddocId` | 招标文件id | `bid_biddoc_id` | Long |
| 24 | `bidDocId` | 关联公告id | `bid_notice_id` | Long |
| 25 | `sectionStatus` | 标包状态 | `section_status` | String |
| 26 | `hasFileEncrypt` | 投标文件是否加密 | `has_file_encrypt` | Short |
| 27 | `signupStartTime` | 报名开始时间 | `signup_start_time` | DateTime |
| 28 | `signupEndTime` | 报名结束时间 | `signup_end_time` | DateTime |
| 29 | `bidDocSaleBegin` | 领取开始时间 | `bid_doc_sale_begin` | DateTime |
| 30 | `bidDocSaleEnd` | 领取结束时间 | `bid_doc_sale_end` | DateTime |
| 31 | `bidDocGetMode` | 文件领取方式 | `bid_doc_get_mode` | String |
| 32 | `docReceivePlace` | 文件现场领取地点 | `doc_receive_place` | String |
| 33 | `tenderDocSubmitEnd` | 递交截止时间 | `tender_doc_submit_end` | DateTime |
| 34 | `tenderDocQuestionEnd` | 提问截止时间 | `tender_doc_question_end` | DateTime |
| 35 | `bidOpenTime` | 开标时间 | `bid_open_time` | DateTime |
| 36 | `tenderDocSubmitMode` | 递交方式 | `tender_doc_submit_mode` | String |
| 37 | `tenderDocSubmitPlace` | 递交地点 | `tender_doc_submit_place` | String |
| 38 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 39 | `bidOpenPlace` | 开标地点 | `bid_open_place` | String |
| 40 | `bidNoticeStatus` | 招标公告状态 | `bid_notice_status` | String |
| 41 | `bidExplain` | 备注 | `bid_explain` | String |
| 42 | `bidBillType` | 招标单据类型 | `bid_bill_type` | String |
| 43 | `multipleStageBid` | 是否两阶段招标 | `multiple_stage_bid` | Short |
| 44 | `multipleCollect` | 是否两阶段招标汇总 | `multiple_collect` | Short |
| 45 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 46 | `multipleLatestStage` | 是否最新阶段 | `multiple_latest_stage` | Short |
| 47 | `agencyContactPersonFax` | 传真 | `agency_contact_person_fax` | String |
| 48 | `agencyContactPersonId` | 招标代理联系人ID | `agency_contact_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 49 | `agencyContactPersonMail` | 邮箱 | `agency_contact_person_mail` | String |
| 50 | `agencyContactPersonName` | 联系人 | `agency_contact_person_name` | String |
| 51 | `agencyContactPersonTel` | 联系人电话 | `agency_contact_person_tel` | String |
| 52 | `agencyContactPersonWay` | 联系方式 | `agency_contact_person_way` | String |
| 53 | `agoMarkGroupId` | 委托单制单人ID | `ago_mark_group_id` | Long |
| 54 | `auctionEndTime` | 竞拍结束时间 | `auction_end_time` | DateTime |
| 55 | `auctionStartTime` | 竞拍开始时间 | `auction_start_time` | DateTime |
| 56 | `bidSectionDocStatus` | 招标文件状态 | `bid_section_doc_status` | String |
| 57 | `bidSectionNoticeStatus` | 招标公告状态 | `bid_section_notice_status` | String |
| 58 | `bidType` | 采购方式 | `bid_type` | String |
| 59 | `billMakerId` | 制单人ID | `bill_maker_id` | String |
| 60 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 61 | `callBidDoumentSectionFileList` | 项目标段投标文件 | `` | fd595c89-279b-4792-acf0-8c6af07745fd |
| 62 | `callBidPaymentMethodList` | 标书缴纳方式 | `` | 839792f0-0ebd-4a89-9208-af04b46440ef |
| 63 | `callDepositPaymentMethodList` | 保证金缴纳方式 | `` | eba07d60-30af-4105-9c9a-c537830fb016 |
| 64 | `cngMakerId` | 委托单制单人ID | `cng_maker_id` | String |
| 65 | `combination` | 是否组合标 | `combination` | Integer |
| 66 | `consignorContactPersonFax` | 委托方联系人传真 | `consignor_contact_person_fax` | String |
| 67 | `consignorContactPersonId` | 委托方联系人ID | `consignor_contact_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 68 | `consignorContactPersonMail` | 委托方联系人邮箱 | `consignor_contact_person_mail` | String |
| 69 | `consignorContactPersonName` | 委托方联系人名称 | `consignor_contact_person_name` | String |
| 70 | `consignorContactPersonWay` | 委托方联系人联系方式 | `consignor_contact_person_way` | String |
| 71 | `consignorOrgId` | 委托方组织ID | `consignor_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 72 | `consignorOrgName` | 委托方组织名称 | `consignor_org_name` | String |
| 73 | `define` | 采购公告标包标段信息自由自定义项 | `` | db1fff69-7b3b-41aa-938c-716fe30d43b7 |
| 74 | `dr` | 逻辑删除标记 | `dr` | Short |
| 75 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 76 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 77 | `lawBid` | 法定招标 | `law_bid` | Integer |
| 78 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 79 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 80 | `paymentType` | 保证金缴纳方式 | `payment_type` | String |
| 81 | `pmName` | 项目经理名称 | `pm_name` | String |
| 82 | `pmPersonId` | 项目经理ID | `pm_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 83 | `purchaseTypeId` | 采购类型ID | `purchase_type_id` | Long |
| 84 | `singleCharge` | 负责方 | `single_charge` | Integer |
| 85 | `triedBidauction` | 是否试竞价 | `tried_bid_auction` | String |
| 86 | `triedEndTime` | 试竞拍结束时间 | `tried_end_time` | DateTime |
| 87 | `triedStartTime` | 试竞拍开始时间 | `tried_start_time` | DateTime |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pmPersonId` | 项目经理ID | `bd.staff.Staff` | Service |  |
| 2 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `consignorOrgId` | 委托方组织ID | `org.func.BaseOrg` | Service |  |
| 4 | `callBidPaymentMethodList` | 标书缴纳方式 | `lawbid.tenderAnnouncement.CallBidPaymentMethodTender` | None | true |
| 5 | `bidEvaluationPlanId` | 初审办法id | `lawbid.scoreplan.BidScorePlan` | None |  |
| 6 | `lawbidAnnouncementSectionTenderDefineCharacter` | 采购公告标包信息自定义项 | `lawbid.tenderAnnouncement.LawbidAnnouncementSectionTenderDefineCharacter` | None |  |
| 7 | `consignorContactPersonId` | 委托方联系人ID | `bd.staff.Staff` | Service |  |
| 8 | `announcementId` | 公告主表ID | `lawbid.tenderAnnouncement.LawbidAnnouncementTender` | None | true |
| 9 | `define` | 采购公告标包标段信息自由自定义项 | `lawbid.tenderAnnouncement.LawbidAnnouncementSectionTenderFreedefine` | None | true |
| 10 | `bidScorePlanId` | 评标办法id | `lawbid.scoreplan.BidScorePlan` | None |  |
| 11 | `projectSectionId` | 项目标段子表ID | `lawbid.project.LawbidProjectSection` | None |  |
| 12 | `callBidDoumentSectionFileList` | 项目标段投标文件 | `lawbid.tenderAnnouncement.CallBidDocumentSectionFileTender` | None | true |
| 13 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 14 | `callDepositPaymentMethodList` | 保证金缴纳方式 | `lawbid.tenderAnnouncement.CallDepositPaymentMethodTender` | None | true |
| 15 | `bidSectionId` | 标段ID | `lawbid.section.LawbidSection` | None |  |
| 16 | `agencyContactPersonId` | 招标代理联系人ID | `bd.staff.Staff` | Service |  |
