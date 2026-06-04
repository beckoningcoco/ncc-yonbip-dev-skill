---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.announcement.LawbidAnnouncementSection"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购公告标包信息 (`lawbid.announcement.LawbidAnnouncementSection`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_announcement_section`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购公告标包信息 |
| 物理表 | `cpu_bid_announcement_section` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:24.1210` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2025-10-24 23:57:48:000

## 依赖接口（6个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 公告标包接口 | `announcement.itf.IAnnouncementSection` | 1205 |
| 6 | lawbidTenant租户相关 | `lawbid.itf.ITenant` | 2 |

---

## 直接属性（78个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `announcementId` | 公告主表ID | `announcement_id` | c8caefa3-7f5b-4560-bb77-c2962503e2df |
| 2 | `projectSectionId` | 项目标段子表ID | `project_section_id` | ecfe849d-8880-4a81-ac60-5318b0a7915b |
| 3 | `bidSectionId` | 标段ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 4 | `lawbidAnnouncementSectionDefineCharacter` | 采购公告标包信息自定义项 | `define_character_id` | 13173312-513c-4cea-8d15-7c6c34350197 |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 9 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 10 | `bidSectionCode` | 标段编号 | `bid_section_code` | String |
| 11 | `bidSectionName` | 标段名称 | `bid_section_name` | String |
| 12 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 13 | `purchaseTypeName` | 采购类型名称 | `purchase_type_name` | String |
| 14 | `purchaseTypeId` | 采购类型ID | `purchase_type_id` | Long |
| 15 | `bidExplain` | 备注 | `bid_explain` | String |
| 16 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 17 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 18 | `bidType` | 采购方式 | `bid_type` | String |
| 19 | `bidBiddocId` | 招标文件id | `bid_biddoc_id` | Long |
| 20 | `isBidEnsure` | 选择投标保证金 | `is_bid_ensure` | Integer |
| 21 | `bidEnsureMoney` | 标书投标保证金 | `bid_ensure_money` | Decimal |
| 22 | `paymentType` | 保证金缴纳方式 | `payment_type` | String |
| 23 | `bidDocId` | 关联公告id | `bid_notice_id` | Long |
| 24 | `saleAmount` | 文件发售金额 | `sale_amount` | Decimal |
| 25 | `issuance` | 选择文件发售 | `issuance` | Integer |
| 26 | `sectionStatus` | 标包状态 | `section_status` | String |
| 27 | `hasFileEncrypt` | 投标文件是否加密 | `has_file_encrypt` | Short |
| 28 | `signupStartTime` | 报名开始时间 | `signup_start_time` | DateTime |
| 29 | `signupEndTime` | 报名结束时间 | `signup_end_time` | DateTime |
| 30 | `bidDocSaleBegin` | 领取开始时间 | `bid_doc_sale_begin` | DateTime |
| 31 | `bidDocSaleEnd` | 领取结束时间 | `bid_doc_sale_end` | DateTime |
| 32 | `bidDocGetMode` | 文件领取方式 | `bid_doc_get_mode` | String |
| 33 | `docReceivePlace` | 文件现场领取地点 | `doc_receive_place` | String |
| 34 | `tenderDocSubmitEnd` | 递交截止时间 | `tender_doc_submit_end` | DateTime |
| 35 | `tenderDocQuestionEnd` | 提问截止时间 | `tender_doc_question_end` | DateTime |
| 36 | `bidOpenTime` | 开标时间 | `bid_open_time` | DateTime |
| 37 | `tenderDocSubmitMode` | 递交方式 | `tender_doc_submit_mode` | String |
| 38 | `tenderDocSubmitPlace` | 递交地点 | `tender_doc_submit_place` | String |
| 39 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 40 | `bidOpenPlace` | 开标地点 | `bid_open_place` | String |
| 41 | `bidNoticeStatus` | 招标公告状态 | `bid_notice_status` | String |
| 42 | `billMakerId` | 制单人ID | `bill_maker_id` | String |
| 43 | `combination` | 是否组合标 | `combination` | Integer |
| 44 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 45 | `lawBid` | 法定招标 | `law_bid` | Integer |
| 46 | `cngMakerId` | 委托单制单人ID | `cng_maker_id` | String |
| 47 | `singleCharge` | 负责方 | `single_charge` | Integer |
| 48 | `consignorOrgName` | 委托方组织名称 | `consignor_org_name` | String |
| 49 | `consignorContactPersonName` | 委托方联系人名称 | `consignor_contact_person_name` | String |
| 50 | `consignorContactPersonWay` | 委托方联系人联系方式 | `consignor_contact_person_way` | String |
| 51 | `consignorContactPersonFax` | 委托方联系人传真 | `consignor_contact_person_fax` | String |
| 52 | `consignorContactPersonMail` | 委托方联系人邮箱 | `consignor_contact_person_mail` | String |
| 53 | `pmName` | 项目经理名称 | `pm_name` | String |
| 54 | `agencyContactPersonWay` | 联系方式 | `agency_contact_person_way` | String |
| 55 | `agencyContactPersonName` | 联系人 | `agency_contact_person_name` | String |
| 56 | `agencyContactPersonTel` | 联系人电话 | `agency_contact_person_tel` | String |
| 57 | `agencyContactPersonMail` | 邮箱 | `agency_contact_person_mail` | String |
| 58 | `agencyContactPersonFax` | 传真 | `agency_contact_person_fax` | String |
| 59 | `bidBillType` | 招标单据类型 | `bid_bill_type` | String |
| 60 | `multipleStageBid` | 是否两阶段招标 | `multiple_stage_bid` | Short |
| 61 | `multipleCollect` | 是否两阶段招标汇总 | `multiple_collect` | Short |
| 62 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 63 | `multipleLatestStage` | 是否最新阶段 | `multiple_latest_stage` | Short |
| 64 | `agoMarkGroupId` | 委托单制单人ID | `ago_mark_group_id` | Long |
| 65 | `bidSectionDocStatus` | 招标文件状态 | `bid_section_doc_status` | String |
| 66 | `bidSectionNoticeStatus` | 招标公告状态 | `bid_section_notice_status` | String |
| 67 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 68 | `priceOpenType` | 价格开启方式 | `price_open_type` | String |
| 69 | `enableCaState` | 是否启用CA签章 | `enable_ca_state` | String |
| 70 | `consignorOrgId` | 委托方组织ID | `consignor_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 71 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 72 | `agencyContactPersonId` | 招标代理联系人ID | `agency_contact_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 73 | `consignorContactPersonId` | 委托方联系人ID | `consignor_contact_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 74 | `pmPersonId` | 项目经理ID | `pm_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 75 | `tenantId` | tenant租户 | `tenant_id` | String |
| 76 | `id` | 主键 | `id` | Long |
| 77 | `pubts` | 时间戳 | `pubts` | DateTime |
| 78 | `define` | 采购公告标包标段信息自由自定义项 | `` | 8e11b4af-bb89-4cee-b3ac-5b2e1cf463ee |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pmPersonId` | 项目经理ID | `bd.staff.Staff` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `consignorContactPersonId` | 委托方联系人ID | `bd.staff.Staff` | Service |  |
| 4 | `consignorOrgId` | 委托方组织ID | `org.func.BaseOrg` | Service |  |
| 5 | `announcementId` | 公告主表ID | `lawbid.announcement.LawbidAnnouncement` | None | true |
| 6 | `define` | 采购公告标包标段信息自由自定义项 | `lawbid.announcement.LawbidAnnouncementSectionFreedefine` | None | true |
| 7 | `projectSectionId` | 项目标段子表ID | `lawbid.project.LawbidProjectSection` | None |  |
| 8 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 9 | `lawbidAnnouncementSectionDefineCharacter` | 采购公告标包信息自定义项 | `lawbid.announcement.LawbidAnnouncementSectionDefineCharacter` | None |  |
| 10 | `bidSectionId` | 标段ID | `lawbid.section.LawbidSection` | None |  |
| 11 | `agencyContactPersonId` | 招标代理联系人ID | `bd.staff.Staff` | Service |  |
