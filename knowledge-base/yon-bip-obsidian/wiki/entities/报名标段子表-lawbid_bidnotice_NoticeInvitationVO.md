---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "lawbid.bidnotice.NoticeInvitationVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报名标段子表 (`lawbid.bidnotice.NoticeInvitationVO`)

> ycBusinessCenter | 物理表：`cpu_bid_invitation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报名标段子表 |
| 物理表 | `cpu_bid_invitation` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:42.3310` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（83个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `announcementSectionId` | 公告标包标段信息 | `announcement_section_id` | 1dd01106-207a-4f75-a076-499451600fbf |
| 2 | `buyerTenant` | 采购商租户Id | `buyer_tenant_id` | String |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `id` | id | `id` | Long |
| 6 | `biddingId` | 投标主表ID | `bidding_id` | 560d390c-4459-4448-8e73-f6ce26a04dba |
| 7 | `bidProjectId` | 采购项目 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 8 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 9 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 10 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 11 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 12 | `bidType` | 采购方式 | `bid_type` | String |
| 13 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 14 | `downloadTime` | 首次下载时间 | `download_time` | DateTime |
| 15 | `receirtTime` | 接受时间 | `receirt_time` | DateTime |
| 16 | `createTime` | 创建日期 | `create_time` | DateTime |
| 17 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 18 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 19 | `bidSectionId` | 标段包 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 20 | `supBillstatus` | 供应商端状态 | `sup_billstatus` | String |
| 21 | `purBillstatus` | 采购商端状态 | `pur_billstatus` | String |
| 22 | `approveTime` | 采购商审批时间 | `approve_time` | DateTime |
| 23 | `approveSuggestion` | 采购商审批意见 | `approve_suggestion` | String |
| 24 | `agencyEnterpriseId` | 招标代理机构租户ID | `agency_enterprise_id` | Long |
| 25 | `agencyOrgId` | 招标代理机构组织ID | `agency_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 26 | `agencyEnterpriseName` | 招标代理机构租户名称 | `agency_enterprise_name` | String |
| 27 | `agencyOfficialCode` | 招标代理机构组织编码 | `agency_official_code` | String |
| 28 | `noticeGetBiddoc` | 报名领取标书 | `notice_get_biddoc` | Short |
| 29 | `buyGetBiddoc` | 是否付费领取标书 | `buy_get_biddoc` | Short |
| 30 | `isBidEnsure` | 是否需要投标保证金 | `is_bid_ensure` | Short |
| 31 | `supPersonName` | 联系人名称 | `sup_person_name` | String |
| 32 | `supPersonTel` | 联系人电话 | `sup_person_tel` | String |
| 33 | `supPersonFax` | 联系人传真 | `sup_person_fax` | String |
| 34 | `supPersonMail` | 联系人邮箱 | `sup_person_mail` | String |
| 35 | `bidNoticeId` | 供应商报名主表 | `bid_notice_id` | 9856b255-b5b6-4b2e-a8b9-a2c4ae9962b5 |
| 36 | `bidEnsureMoney` | 投标保障金金额 | `bid_ensure_money` | Decimal |
| 37 | `bidDocSaleBegin` | 文件购买起始时间 | `bid_doc_sale_begin` | DateTime |
| 38 | `bidDocSaleEnd` | 文件购买截止时间 | `bid_doc_sale_end` | DateTime |
| 39 | `tenderDocSubmitEnd` | 投标书递交截止时间 | `tender_doc_submit_end` | DateTime |
| 40 | `supBackInfo` | 供应商回执邀请信息 | `sup_back_info` | String |
| 41 | `remarks` | 备注 | `remarks` | String |
| 42 | `selectBidnotice` | 当前标保是否被选中报名 | `select_bidnotice` | Short |
| 43 | `tenderDocQuestionEnd` | 投标提问截止时间 | `tender_doc_question_end` | DateTime |
| 44 | `purchaseStatus` | 购买状态 | `purchase_status` | String |
| 45 | `saleAmount` | 文件发售金额 | `sale_amount` | Decimal |
| 46 | `orderStatus` | 订单状态 | `order_status` | String |
| 47 | `invoiceStatus` | 发票状态 | `invoice_status` | String |
| 48 | `invoiceType` | 发票类型 | `invoice_type` | String |
| 49 | `invoiceTime` | 开票时间 | `invoice_time` | DateTime |
| 50 | `payStatus` | 支付状态 | `pay_status` | String |
| 51 | `payType` | 支付方式 | `pay_type` | String |
| 52 | `orderId` | 订单id | `order_id` | Long |
| 53 | `payTime` | 支付时间 | `pay_time` | DateTime |
| 54 | `selectBuy` | 是否选中购买 | `select_buy` | Short |
| 55 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 56 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 57 | `supIpAddress` | 供应商报名ip地址 | `sup_ip_address` | String |
| 58 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 59 | `submitStatus` | 文件提交状态 | `submit_status` | Integer |
| 60 | `paymentType` | 保证金缴纳方式 | `payment_type` | String |
| 61 | `marginStatus` | 保证金递交状态 | `margin_status` | String |
| 62 | `bidIpAddress` | 供应商投标ip地址 | `bid_ip_address` | String |
| 63 | `docSubmitType` | 文件递交方式 | `doc_submit_type` | String |
| 64 | `applyTime` | 报名时间 | `apply_time` | DateTime |
| 65 | `responseTime` | 答复时间 | `response_time` | DateTime |
| 66 | `lastBidTime` | 最后一次投标时间 | `bid_end_time` | DateTime |
| 67 | `bidOpeningTime` | 开标时间 | `bid_opening_time` | DateTime |
| 68 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 69 | `winStatus` | 中标状态 | `win_status` | String |
| 70 | `bidEndReason` | 结束淘汰原因 | `bid_end_reason` | String |
| 71 | `bidDocMainId` | 招标文件主表ID | `bid_doc_main_id` | 0abbc965-d427-4894-8f28-b88624633703 |
| 72 | `bidDocChildId` | 招标文件子表ID | `bid_doc_child_id` | c5e9e2bd-4010-4ba3-9d39-10172dc5bf8f |
| 73 | `applyTimeBegin` | 报名开始时间 | `apply_time_begin` | DateTime |
| 74 | `applyTimeEnd` | 报名截止时间 | `apply_time_end` | DateTime |
| 75 | `docReceiveTimeEnd` | 文件领取截止时间 | `doc_receive_time_end` | DateTime |
| 76 | `isLatest` | 是否最新阶段 | `is_latest` | Boolean |
| 77 | `vendorTenant` | 采购商租户Id | `vendor_tenant_id` | String |
| 78 | `invitationEndTime` | 邀请答复截止日期 | `invitation_end_time` | DateTime |
| 79 | `file` | 附件 | `file` | String |
| 80 | `status` | 投标状态 | `status` | String |
| 81 | `tenantId` | tenantId | `tenant_id` | String |
| 82 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 83 | `eliminateStatus` | 淘汰状态 | `eliminate_status` | String |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `announcementSectionId` | 公告标包标段信息 | `lawbid.announcement.LawbidAnnouncementSection` | None |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | Service |  |
| 3 | `biddingId` | 投标主表ID | `lawbid.bid.BiddingVO` | None |  |
| 4 | `bidDocMainId` | 招标文件主表ID | `lawbid.calldocument.CallBidDocument` | None |  |
| 5 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `bidDocChildId` | 招标文件子表ID | `lawbid.calldocument.CallBidDocumentSection` | None |  |
| 7 | `bidProjectId` | 采购项目 | `lawbid.project.LawbidProject` | None |  |
| 8 | `agencyOrgId` | 招标代理机构组织ID | `org.func.BaseOrg` | Service |  |
| 9 | `bidNoticeId` | 供应商报名主表 | `lawbid.bidnotice.NoticeVO` | None | true |
| 10 | `bidSectionId` | 标段包 | `lawbid.section.LawbidSection` | None |  |
