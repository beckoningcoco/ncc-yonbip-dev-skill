---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.announcement.AuctionAnnouncementSection"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 公告标包标段信息 (`auction.announcement.AuctionAnnouncementSection`)

> ycSouringAuction | 物理表：`cpu_bid_announcement_section`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 公告标包标段信息 |
| 物理表 | `cpu_bid_announcement_section` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:52.3170` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（84个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 3 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `announcementId` | 公告主表ID | `announcement_id` | 2c5fa673-819e-4dd0-93a3-c1af081ef94a |
| 6 | `bidSectionId` | 标段ID | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 7 | `projectSectionId` | 项目标段子表ID | `project_section_id` | 19bd41ed-e7a3-4291-95c0-abc0d0555724 |
| 8 | `purchaseTypeName` | 拍卖物类型名称 | `purchase_type_name` | String |
| 9 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 10 | `AuctionAnnouncementSectionDefineCharacter` | 竞拍公告标包信息自定义项 | `define_character_id` | c0080033-ea95-4d78-a2bc-f2ecbba295a3 |
| 11 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 12 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 13 | `purchaseType` | 拍卖物类型 | `purchase_type` | String |
| 14 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 15 | `bidBiddocId` | 招标文件id | `bid_biddoc_id` | Long |
| 16 | `isBidEnsure` | 选择投标保证金 | `is_bid_ensure` | Integer |
| 17 | `bidEnsureMoney` | 投标保证金 | `bid_ensure_money` | Decimal |
| 18 | `paymentType` | 保证金缴纳方式 | `payment_type` | String |
| 19 | `bidExplain` | 备注 | `bid_explain` | String |
| 20 | `bidDocId` | 关联公告id | `bid_notice_id` | Long |
| 21 | `consignorOrgName` | 委托方组织名称 | `consignor_org_name` | String |
| 22 | `saleAmount` | 文件发售金额 | `sale_amount` | Decimal |
| 23 | `issuance` | 选择文件发售 | `issuance` | Integer |
| 24 | `triedStartTime` | 试竞拍开始时间 | `tried_start_time` | DateTime |
| 25 | `triedEndTime` | 试竞拍结束时间 | `tried_end_time` | DateTime |
| 26 | `auctionStartTime` | 竞拍开始时间 | `auction_start_time` | DateTime |
| 27 | `auctionEndTime` | 竞拍结束时间 | `auction_end_time` | DateTime |
| 28 | `triedBidauction` | 是否试竞价 | `tried_bid_auction` | String |
| 29 | `sectionStatus` | 标包状态 | `section_status` | String |
| 30 | `hasFileEncrypt` | 投标文件是否加密 | `has_file_encrypt` | Short |
| 31 | `signupStartTime` | 回复开始时间 | `signup_start_time` | DateTime |
| 32 | `signupEndTime` | 回复结束时间 | `signup_end_time` | DateTime |
| 33 | `bidDocSaleBegin` | 领取开始时间 | `bid_doc_sale_begin` | DateTime |
| 34 | `bidDocSaleEnd` | 领取结束时间 | `bid_doc_sale_end` | DateTime |
| 35 | `bidDocGetMode` | 文件领取方式 | `bid_doc_get_mode` | String |
| 36 | `bidNoticeStatus` | 招标公告状态 | `bid_notice_status` | String |
| 37 | `docReceivePlace` | 文件现场领取地点 | `doc_receive_place` | String |
| 38 | `tenderDocSubmitEnd` | 递交截止时间 | `tender_doc_submit_end` | DateTime |
| 39 | `tenderDocQuestionEnd` | 提问截止时间 | `tender_doc_question_end` | DateTime |
| 40 | `bidOpenTime` | 开标时间 | `bid_open_time` | DateTime |
| 41 | `tenderDocSubmitMode` | 递交方式 | `tender_doc_submit_mode` | String |
| 42 | `tenderDocSubmitPlace` | 递交地点 | `tender_doc_submit_place` | String |
| 43 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 44 | `bidOpenPlace` | 开标地点 | `bid_open_place` | String |
| 45 | `agencyContactPersonFax` | 传真 | `agency_contact_person_fax` | String |
| 46 | `agencyContactPersonId` | 招标代理联系人ID | `agency_contact_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 47 | `agencyContactPersonMail` | 邮箱 | `agency_contact_person_mail` | String |
| 48 | `agencyContactPersonName` | 联系人 | `agency_contact_person_name` | String |
| 49 | `agencyContactPersonTel` | 联系人电话 | `agency_contact_person_tel` | String |
| 50 | `agencyContactPersonWay` | 联系方式 | `agency_contact_person_way` | String |
| 51 | `agoMarkGroupId` | 委托单制单人ID | `ago_mark_group_id` | Long |
| 52 | `auctionDepositPaymentMethodList` | 保证金缴纳方式 | `` | a3473af5-a72b-4d6b-b01a-223ae22727d8 |
| 53 | `bidBillType` | 招标单据类型 | `bid_bill_type` | String |
| 54 | `bidSectionDocStatus` | 招标文件状态 | `bid_section_doc_status` | String |
| 55 | `bidSectionNoticeStatus` | 招标公告状态 | `bid_section_notice_status` | String |
| 56 | `bidType` | 采购方式 | `bid_type` | String |
| 57 | `billMakerId` | 制单人ID | `bill_maker_id` | String |
| 58 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 59 | `cngMakerId` | 委托单制单人ID | `cng_maker_id` | String |
| 60 | `combination` | 是否组合标 | `combination` | Integer |
| 61 | `consignorContactPersonFax` | 委托方联系人传真 | `consignor_contact_person_fax` | String |
| 62 | `consignorContactPersonId` | 委托方联系人ID | `consignor_contact_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 63 | `consignorContactPersonMail` | 委托方联系人邮箱 | `consignor_contact_person_mail` | String |
| 64 | `consignorContactPersonName` | 委托方联系人名称 | `consignor_contact_person_name` | String |
| 65 | `consignorContactPersonWay` | 委托方联系人联系方式 | `consignor_contact_person_way` | String |
| 66 | `consignorOrgId` | 委托方组织ID | `consignor_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 67 | `define` | 公告标包标段信息由自定义项 | `` | 657a187c-1860-472c-94cb-bf61127588ae |
| 68 | `dr` | 逻辑删除标记 | `dr` | Short |
| 69 | `enableCaState` | 是否启用CA签章 | `enable_ca_state` | String |
| 70 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 71 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 72 | `lawBid` | 法定招标 | `law_bid` | Integer |
| 73 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 74 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 75 | `multipleCollect` | 是否两阶段招标汇总 | `multiple_collect` | Short |
| 76 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 77 | `multipleLatestStage` | 是否最新阶段 | `multiple_latest_stage` | Short |
| 78 | `multipleStageBid` | 是否两阶段招标 | `multiple_stage_bid` | Short |
| 79 | `pmName` | 项目经理名称 | `pm_name` | String |
| 80 | `pmPersonId` | 项目经理ID | `pm_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 81 | `priceOpenType` | 价格开启方式 | `price_open_type` | String |
| 82 | `purchaseTypeId` | 采购类型ID | `purchase_type_id` | Long |
| 83 | `singleCharge` | 负责方 | `single_charge` | Integer |
| 84 | `tenantId` | tenant租户 | `tenant_id` | String |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `AuctionAnnouncementSectionDefineCharacter` | 竞拍公告标包信息自定义项 | `auction.announcement.AuctionAnnouncementSectionDefineCharacter` | None |  |
| 2 | `pmPersonId` | 项目经理ID | `bd.staff.Staff` | Service |  |
| 3 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `consignorContactPersonId` | 委托方联系人ID | `bd.staff.Staff` | Service |  |
| 5 | `consignorOrgId` | 委托方组织ID | `org.func.BaseOrg` | Service |  |
| 6 | `announcementId` | 公告主表ID | `auction.announcement.AuctionAnnouncement` | None | true |
| 7 | `auctionDepositPaymentMethodList` | 保证金缴纳方式 | `auction.announcement.AuctionDepositPaymentMethod` | None | true |
| 8 | `define` | 公告标包标段信息由自定义项 | `auction.announcement.AuctionAnnouncementSectionFreedefine` | None | true |
| 9 | `projectSectionId` | 项目标段子表ID | `auction.project.AuctionProjectSection` | None |  |
| 10 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 11 | `bidSectionId` | 标段ID | `auction.project.AuctionSection` | None |  |
| 12 | `agencyContactPersonId` | 招标代理联系人ID | `bd.staff.Staff` | Service |  |
