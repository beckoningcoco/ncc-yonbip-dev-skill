---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.bidinvitation.SubjectInvitationVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 投标标段关系 (`auction.bidinvitation.SubjectInvitationVO`)

> ycSouringAuction | 物理表：`cpu_bid_invitation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标标段关系 |
| 物理表 | `cpu_bid_invitation` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:51.0760` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（81个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `agencyEnterpriseId` | 招标代理机构租户 | `agency_enterprise_id` | Long |
| 2 | `agencyEnterpriseName` | 招标代理机构租户名称 | `agency_enterprise_name` | String |
| 3 | `agencyOfficialCode` | 招标代理机构组织编码 | `agency_official_code` | String |
| 4 | `agencyOrgId` | 招标代理机构组织 | `agency_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `announcementSectionId` | 公告标包标段信息 | `announcement_section_id` | d046c9cf-68b1-48bb-8686-13a20ae80de7 |
| 6 | `applyTime` | 报名时间 | `apply_time` | DateTime |
| 7 | `applyTimeBegin` | 报名开始时间 | `apply_time_begin` | DateTime |
| 8 | `applyTimeEnd` | 报名截止时间 | `apply_time_end` | DateTime |
| 9 | `approveSuggestion` | 采购商审批意见 | `approve_suggestion` | String |
| 10 | `approveTime` | 采购商审批时间 | `approve_time` | DateTime |
| 11 | `bidDocSaleBegin` | 文件购买起始时间 | `bid_doc_sale_begin` | DateTime |
| 12 | `bidDocSaleEnd` | 文件购买截止时间 | `bid_doc_sale_end` | DateTime |
| 13 | `bidEndReason` | 结束淘汰原因 | `bid_end_reason` | String |
| 14 | `bidEnsureMoney` | 投标保障金金额 | `bid_ensure_money` | Decimal |
| 15 | `bidIpAddress` | 供应商投标ip地址 | `bid_ip_address` | String |
| 16 | `bidNoticeId` | 供应商报名主表 | `bid_notice_id` | 46ff8154-5b89-4faf-9361-0e81207b9ac4 |
| 17 | `bidOpeningTime` | 开标时间 | `bid_opening_time` | DateTime |
| 18 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 19 | `bidProjectId` | 项目ID | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 20 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 21 | `bidSectionCode` | 标段编号 | `bid_section_code` | String |
| 22 | `bidSectionId` | 标段(包)编号 | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 23 | `bidSectionName` | 标段名称 | `bid_section_name` | String |
| 24 | `bidType` | 采购方式 | `bid_type` | String |
| 25 | `biddingId` | 投标主表ID | `bidding_id` | 15e79b2d-d323-481c-919e-348ab3f982b3 |
| 26 | `buyGetBiddoc` | 是否付费领取标书 | `buy_get_biddoc` | Short |
| 27 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 28 | `createTime` | 创建日期 | `create_time` | DateTime |
| 29 | `docReceiveTimeEnd` | 文件领取截止时间 | `doc_receive_time_end` | DateTime |
| 30 | `docSubmitType` | 文件递交方式 | `doc_submit_type` | String |
| 31 | `downloadTime` | 首次下载时间 | `download_time` | DateTime |
| 32 | `dr` | 逻辑删除标记 | `dr` | Short |
| 33 | `eliminateStatus` | 淘汰状态 | `eliminate_status` | String |
| 34 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 35 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 36 | `file` | 附件 | `file` | String |
| 37 | `id` | ID | `id` | Long |
| 38 | `invitationEndTime` | 邀请答复截止日期 | `invitation_end_time` | DateTime |
| 39 | `invoiceStatus` | 发票状态 | `invoice_status` | String |
| 40 | `invoiceTime` | 开票时间 | `invoice_time` | DateTime |
| 41 | `invoiceType` | 发票类型 | `invoice_type` | String |
| 42 | `isBidEnsure` | 是否需要投标保证金 | `is_bid_ensure` | Short |
| 43 | `isLatest` | 是否最新阶段 | `is_latest` | Boolean |
| 44 | `lastBidTime` | 最后一次投标时间 | `bid_end_time` | DateTime |
| 45 | `marginStatus` | 保证金递交状态 | `margin_status` | String |
| 46 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 47 | `noticeGetBiddoc` | 报名领取标书 | `notice_get_biddoc` | Short |
| 48 | `orderId` | 订单 | `order_id` | Long |
| 49 | `orderStatus` | 订单状态 | `order_status` | String |
| 50 | `payStatus` | 支付状态 | `pay_status` | String |
| 51 | `payTime` | 支付时间 | `pay_time` | DateTime |
| 52 | `payType` | 支付方式 | `pay_type` | String |
| 53 | `paymentType` | 保证金缴纳方式 | `payment_type` | String |
| 54 | `pubts` | 时间戳 | `pubts` | DateTime |
| 55 | `purBillstatus` | 采购商端状态 | `pur_billstatus` | String |
| 56 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 57 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 58 | `purchaseStatus` | 购买状态 | `purchase_status` | String |
| 59 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 60 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 61 | `receirtTime` | 接受时间 | `receirt_time` | DateTime |
| 62 | `remarks` | 备注 | `remarks` | String |
| 63 | `responseTime` | 答复时间 | `response_time` | DateTime |
| 64 | `saleAmount` | 文件发售金额 | `sale_amount` | Decimal |
| 65 | `selectBidnotice` | 当前标保是否被选中报名 | `select_bidnotice` | Short |
| 66 | `selectBuy` | 是否选中购买 | `select_buy` | Short |
| 67 | `status` | 投标状态 | `status` | String |
| 68 | `submitStatus` | 文件提交状态 | `submit_status` | Integer |
| 69 | `supBackInfo` | 供应商回执邀请信息 | `sup_back_info` | String |
| 70 | `supBillstatus` | 供应商端状态 | `sup_billstatus` | String |
| 71 | `supIpAddress` | 供应商报名地址 | `sup_ip_address` | String |
| 72 | `supPersonFax` | 联系人传真 | `sup_person_fax` | String |
| 73 | `supPersonMail` | 联系人邮箱 | `sup_person_mail` | String |
| 74 | `supPersonName` | 联系人名称 | `sup_person_name` | String |
| 75 | `supPersonTel` | 联系人电话 | `sup_person_tel` | String |
| 76 | `tenantId` | 租户 | `tenant_id` | String |
| 77 | `tenderDocQuestionEnd` | 投标提问截止时间 | `tender_doc_question_end` | DateTime |
| 78 | `tenderDocSubmitEnd` | 投标书递交截止时间 | `tender_doc_submit_end` | DateTime |
| 79 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 80 | `winStatus` | 中标状态 | `win_status` | String |
| 81 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `announcementSectionId` | 公告标包标段信息 | `auction.announcement.AuctionAnnouncementSection` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `biddingId` | 投标主表ID | `auction.bidinvitation.SubjectBiddingVO` | None | true |
| 4 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `bidProjectId` | 项目ID | `auction.project.AuctionProject` | None |  |
| 6 | `agencyOrgId` | 招标代理机构组织 | `org.func.BaseOrg` | Service |  |
| 7 | `bidNoticeId` | 供应商报名主表 | `auction.bidnotice.NoticeVO` | None |  |
| 8 | `bidSectionId` | 标段(包)编号 | `auction.project.AuctionSection` | None |  |
