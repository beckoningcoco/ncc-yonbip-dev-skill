---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "lawbid.bidorder.BidInvitation"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 标段包子表 (`lawbid.bidorder.BidInvitation`)

> ycBusinessCenter | 物理表：`cpu_bid_invitation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标段包子表 |
| 物理表 | `cpu_bid_invitation` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:43.8280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（82个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `agencyEnterpriseId` | 招标代理机构租户ID | `agency_enterprise_id` | Long |
| 2 | `agencyEnterpriseName` | 招标代理机构租户名称 | `agency_enterprise_name` | String |
| 3 | `ewalletDetailId` | 缴费单子表id | `ewallet_detail_id` | Long |
| 4 | `agencyOfficialCode` | 招标代理机构组织编码 | `agency_official_code` | String |
| 5 | `agencyOrgId` | 招标代理机构组织ID | `agency_org_id` | Long |
| 6 | `applyTime` | 报名时间 | `apply_time` | DateTime |
| 7 | `applyTimeBegin` | 报名开始时间 | `apply_time_begin` | DateTime |
| 8 | `applyTimeEnd` | 报名截止时间 | `apply_time_end` | DateTime |
| 9 | `approveSuggestion` | 采购商审批意见 | `approve_suggestion` | String |
| 10 | `approveTime` | 采购商审批时间 | `approve_time` | DateTime |
| 11 | `bidDocChildId` | 招标文件子表ID | `bid_doc_child_id` | c5e9e2bd-4010-4ba3-9d39-10172dc5bf8f |
| 12 | `bidDocMainId` | 招标文件主表ID | `bid_doc_main_id` | 0abbc965-d427-4894-8f28-b88624633703 |
| 13 | `bidDocSaleBegin` | 文件购买起始时间 | `bid_doc_sale_begin` | DateTime |
| 14 | `bidEndReason` | 结束淘汰原因 | `bid_end_reason` | String |
| 15 | `bidEnsureMoney` | 投标保障金金额 | `bid_ensure_money` | Decimal |
| 16 | `bidIpAddress` | 供应商投标ip地址 | `bid_ip_address` | String |
| 17 | `bidNoticeId` | 供应商报名主表 | `bid_notice_id` | 9856b255-b5b6-4b2e-a8b9-a2c4ae9962b5 |
| 18 | `bidOpeningTime` | 开标时间 | `bid_opening_time` | DateTime |
| 19 | `bidProjectId` | 采购项目ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 20 | `bidType` | 采购方式 | `bid_type` | String |
| 21 | `biddingId` | 投标主表ID | `bidding_id` | 560d390c-4459-4448-8e73-f6ce26a04dba |
| 22 | `buyGetBiddoc` | 是否付费领取标书 | `buy_get_biddoc` | Short |
| 23 | `buyerTenant` | 采购商租户ID | `buyer_tenant_id` | String |
| 24 | `createTime` | 创建日期 | `create_time` | DateTime |
| 25 | `docReceiveTimeEnd` | 文件领取截止时间 | `doc_receive_time_end` | DateTime |
| 26 | `docSubmitType` | 文件递交方式 | `doc_submit_type` | String |
| 27 | `downloadTime` | 首次下载时间 | `download_time` | DateTime |
| 28 | `dr` | 逻辑删除标记 | `dr` | Short |
| 29 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 30 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 31 | `file` | 附件 | `file` | String |
| 32 | `invitationEndTime` | 邀请答复截止日期 | `invitation_end_time` | DateTime |
| 33 | `invoiceStatus` | 发票状态 | `invoice_status` | String |
| 34 | `invoiceTime` | 开票时间 | `invoice_time` | DateTime |
| 35 | `invoiceType` | 发票类型 | `invoice_type` | String |
| 36 | `isBidEnsure` | 是否需要投标保证金 | `is_bid_ensure` | Short |
| 37 | `isLatest` | 是否最新阶段 | `is_latest` | Boolean |
| 38 | `lastBidTime` | 最后一次投标时间 | `bid_end_time` | DateTime |
| 39 | `marginStatus` | 保证金递交状态 | `margin_status` | String |
| 40 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 41 | `noticeGetBiddoc` | 报名领取标书 | `notice_get_biddoc` | Short |
| 42 | `orderId` | 订单ID | `order_id` | 5e9f5c82-1e96-44c1-8081-4183576af71a |
| 43 | `orderStatus` | 订单状态 | `order_status` | String |
| 44 | `payStatus` | 支付状态 | `pay_status` | String |
| 45 | `payTime` | 支付时间 | `pay_time` | DateTime |
| 46 | `payType` | 支付方式 | `pay_type` | String |
| 47 | `paymentType` | 保证金缴纳方式 | `payment_type` | String |
| 48 | `pubts` | 时间戳 | `pubts` | DateTime |
| 49 | `purBillstatus` | 采购商端状态 | `pur_billstatus` | String |
| 50 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 51 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 52 | `purchaseStatus` | 购买状态 | `purchase_status` | String |
| 53 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 54 | `receirtTime` | 接受时间 | `receirt_time` | DateTime |
| 55 | `responseTime` | 答复时间 | `response_time` | DateTime |
| 56 | `selectBidnotice` | 当前标保是否被选中报名 | `select_bidnotice` | Short |
| 57 | `status` | 投标状态 | `status` | String |
| 58 | `submitStatus` | 文件提交状态 | `submit_status` | Integer |
| 59 | `supBackInfo` | 供应商回执邀请信息 | `sup_back_info` | String |
| 60 | `supBillstatus` | 供应商端状态 | `sup_billstatus` | String |
| 61 | `supIpAddress` | 供应商报名ip地址 | `sup_ip_address` | String |
| 62 | `supPersonFax` | 联系人传真 | `sup_person_fax` | String |
| 63 | `supPersonMail` | 联系人邮箱 | `sup_person_mail` | String |
| 64 | `supPersonName` | 联系人名称 | `sup_person_name` | String |
| 65 | `supPersonTel` | 联系人电话 | `sup_person_tel` | String |
| 66 | `tenantId` | 租户ID | `tenant_id` | String |
| 67 | `tenderDocQuestionEnd` | 投标提问截止时间 | `tender_doc_question_end` | DateTime |
| 68 | `tenderDocSubmitEnd` | 投标书递交截止时间 | `tender_doc_submit_end` | DateTime |
| 69 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 70 | `winStatus` | 中标状态 | `win_status` | String |
| 71 | `ytenant` | 租户ID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 72 | `id` | ID | `id` | Long |
| 73 | `selectBuy` | 选中购买 | `select_buy` | Short |
| 74 | `bidProjectName` | 项目名称 | `bid_project_name` | String |
| 75 | `bidProjectCode` | 项目编号 | `bid_project_code` | String |
| 76 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 77 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 78 | `bidDocSaleEnd` | 文件领取截止时间 | `bid_doc_sale_end` | DateTime |
| 79 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 80 | `bidSectionId` | 需求明细 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 81 | `saleAmount` | 投标文件金额 | `sale_amount` | Decimal |
| 82 | `remarks` | 备注 | `remarks` | String |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `orderId` | 订单ID | `lawbid.bidorder.BidOrder` | None | true |
| 2 | `ytenant` | 租户ID | `yht.tenant.YhtTenant` | Service |  |
| 3 | `biddingId` | 投标主表ID | `lawbid.bid.BiddingVO` | None |  |
| 4 | `bidDocMainId` | 招标文件主表ID | `lawbid.calldocument.CallBidDocument` | None |  |
| 5 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `bidDocChildId` | 招标文件子表ID | `lawbid.calldocument.CallBidDocumentSection` | None |  |
| 7 | `bidProjectId` | 采购项目ID | `lawbid.project.LawbidProject` | None |  |
| 8 | `bidNoticeId` | 供应商报名主表 | `lawbid.bidnotice.NoticeVO` | None |  |
| 9 | `bidSectionId` | 需求明细 | `lawbid.section.LawbidSection` | None |  |
