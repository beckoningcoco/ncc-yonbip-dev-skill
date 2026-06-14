---
tags: ["BIP", "元数据", "数据字典", "auction.bid.InvitationVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商标段关系 (`auction.bid.InvitationVO`)

>  | 物理表：`cpu_bid_invitation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商标段关系 |
| 物理表 | `cpu_bid_invitation` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 23:26:55.6050` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（81个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `biddingId` | 投标主表ID | `bidding_id` | b1e45acc-57ae-4a37-a971-a848cddafaf1 |
| 2 | `bidProjectId` | 采购项目id | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 3 | `bidSectionId` | 标段包id | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 4 | `bidNoticeId` | 供应商报名主表 | `bid_notice_id` | 46ff8154-5b89-4faf-9361-0e81207b9ac4 |
| 5 | `announcementSectionId` | 公告标包标段信息 | `announcement_section_id` | d046c9cf-68b1-48bb-8686-13a20ae80de7 |
| 6 | `tenantId` | 租户 | `tenant_id` | String |
| 7 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 8 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 9 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 10 | `bidType` | 采购方式 | `bid_type` | String |
| 11 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 12 | `downloadTime` | 首次下载时间 | `download_time` | DateTime |
| 13 | `receirtTime` | 接受时间 | `receirt_time` | DateTime |
| 14 | `createTime` | 创建日期 | `create_time` | DateTime |
| 15 | `bidSectionCode` | 标段编号 | `bid_section_code` | String |
| 16 | `bidSectionName` | 标段名称 | `bid_section_name` | String |
| 17 | `supBillstatus` | 供应商端状态 | `sup_billstatus` | String |
| 18 | `purBillstatus` | 采购商端状态 | `pur_billstatus` | String |
| 19 | `approveTime` | 采购商审批时间 | `approve_time` | DateTime |
| 20 | `approveSuggestion` | 采购商审批意见 | `approve_suggestion` | String |
| 21 | `agencyEnterpriseId` | 招标代理机构租户 | `agency_enterprise_id` | Long |
| 22 | `agencyOrgId` | 招标代理机构组织 | `agency_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 23 | `agencyEnterpriseName` | 招标代理机构租户名称 | `agency_enterprise_name` | String |
| 24 | `agencyOfficialCode` | 招标代理机构组织编码 | `agency_official_code` | String |
| 25 | `noticeGetBiddoc` | 报名领取标书 | `notice_get_biddoc` | Short |
| 26 | `buyGetBiddoc` | 是否付费领取标书 | `buy_get_biddoc` | Short |
| 27 | `isBidEnsure` | 是否需要投标保证金 | `is_bid_ensure` | Short |
| 28 | `supPersonName` | 联系人名称 | `sup_person_name` | String |
| 29 | `supPersonTel` | 联系人电话 | `sup_person_tel` | String |
| 30 | `supPersonFax` | 联系人传真 | `sup_person_fax` | String |
| 31 | `bidEnsureMoney` | 投标保障金金额 | `bid_ensure_money` | Decimal |
| 32 | `bidDocSaleBegin` | 文件购买起始时间 | `bid_doc_sale_begin` | DateTime |
| 33 | `bidDocSaleEnd` | 文件购买截止时间 | `bid_doc_sale_end` | DateTime |
| 34 | `tenderDocSubmitEnd` | 投标书递交截止时间 | `tender_doc_submit_end` | DateTime |
| 35 | `supBackInfo` | 供应商回执邀请信息 | `sup_back_info` | String |
| 36 | `remarks` | 备注 | `remarks` | String |
| 37 | `selectBidnotice` | 当前标保是否被选中报名 | `select_bidnotice` | Short |
| 38 | `tenderDocQuestionEnd` | 投标提问截止时间 | `tender_doc_question_end` | DateTime |
| 39 | `purchaseStatus` | 购买状态 | `purchase_status` | String |
| 40 | `saleAmount` | 文件发售金额 | `sale_amount` | Decimal |
| 41 | `orderStatus` | 订单状态 | `order_status` | String |
| 42 | `invoiceStatus` | 发票状态 | `invoice_status` | String |
| 43 | `invoiceType` | 发票类型 | `invoice_type` | String |
| 44 | `invoiceTime` | 开票时间 | `invoice_time` | DateTime |
| 45 | `payStatus` | 支付状态 | `pay_status` | String |
| 46 | `payType` | 支付方式 | `pay_type` | String |
| 47 | `orderId` | 订单 | `order_id` | Long |
| 48 | `payTime` | 支付时间 | `pay_time` | DateTime |
| 49 | `selectBuy` | 是否选中购买 | `select_buy` | Short |
| 50 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 51 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 52 | `supIpAddress` | 供应商报名地址 | `sup_ip_address` | String |
| 53 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 54 | `submitStatus` | 文件提交状态 | `submit_status` | Integer |
| 55 | `status` | 投标状态 | `status` | String |
| 56 | `paymentType` | 保证金缴纳方式 | `payment_type` | String |
| 57 | `marginStatus` | 保证金递交状态 | `margin_status` | String |
| 58 | `bidIpAddress` | 供应商投标ip地址 | `bid_ip_address` | String |
| 59 | `docSubmitType` | 文件递交方式 | `doc_submit_type` | String |
| 60 | `applyTime` | 报名时间 | `apply_time` | DateTime |
| 61 | `responseTime` | 答复时间 | `response_time` | DateTime |
| 62 | `lastBidTime` | 最后一次投标时间 | `bid_end_time` | DateTime |
| 63 | `bidOpeningTime` | 开标时间 | `bid_opening_time` | DateTime |
| 64 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 65 | `winStatus` | 中标状态 | `win_status` | String |
| 66 | `bidEndReason` | 结束淘汰原因 | `bid_end_reason` | String |
| 67 | `applyTimeBegin` | 报名开始时间 | `apply_time_begin` | DateTime |
| 68 | `applyTimeEnd` | 报名截止时间 | `apply_time_end` | DateTime |
| 69 | `docReceiveTimeEnd` | 文件领取截止时间 | `doc_receive_time_end` | DateTime |
| 70 | `isLatest` | 是否最新阶段 | `is_latest` | Boolean |
| 71 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 72 | `invitationEndTime` | 邀请答复截止日期 | `invitation_end_time` | DateTime |
| 73 | `file` | 附件 | `file` | String |
| 74 | `eliminateStatus` | 淘汰状态 | `eliminate_status` | String |
| 75 | `supPersonMail` | 联系人邮箱 | `sup_person_mail` | String |
| 76 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 77 | `dr` | 逻辑删除标记 | `dr` | Short |
| 78 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 79 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 80 | `id` | 主键 | `id` | Long |
| 81 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `announcementSectionId` | 公告标包标段信息 | `auction.announcement.AuctionAnnouncementSection` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `biddingId` | 投标主表ID | `auction.bid.BiddingVO` | None | true |
| 4 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `bidProjectId` | 采购项目id | `auction.project.AuctionProject` | None |  |
| 6 | `agencyOrgId` | 招标代理机构组织 | `org.func.BaseOrg` | Service |  |
| 7 | `bidNoticeId` | 供应商报名主表 | `auction.bidnotice.NoticeVO` | None |  |
| 8 | `bidSectionId` | 标段包id | `auction.project.AuctionSection` | None |  |
