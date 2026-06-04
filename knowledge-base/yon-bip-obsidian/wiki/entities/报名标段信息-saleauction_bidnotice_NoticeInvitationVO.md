---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "saleauction.bidnotice.NoticeInvitationVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报名标段信息 (`saleauction.bidnotice.NoticeInvitationVO`)

> ycBusinessCenter | 物理表：`cpu_bid_invitation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报名标段信息 |
| 物理表 | `cpu_bid_invitation` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:56.7270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（81个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `biddingId` | 投标主表ID | `bidding_id` | af94c771-f926-452b-8760-f06c22b53d8f |
| 3 | `bidProjectId` | 采购项目 | `bid_project_id` | 9f8b9356-4cd6-4ae7-8dc0-c84dfecdda07 |
| 4 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 5 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 6 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 7 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 8 | `bidType` | 采购方式 | `bid_type` | String |
| 9 | `bidSectionCode` | 标段（包）编号 | `bid_section_code` | String |
| 10 | `downloadTime` | 首次下载时间 | `download_time` | DateTime |
| 11 | `receirtTime` | 接受时间 | `receirt_time` | DateTime |
| 12 | `createTime` | 创建日期 | `create_time` | DateTime |
| 13 | `bidSectionName` | 标段（包）名称 | `bid_section_name` | String |
| 14 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 15 | `bidSectionId` | 标段包 | `bid_section_id` | 052621d8-fde7-4ab0-94bf-b179c720ce6d |
| 16 | `supBillstatus` | 供应商端状态 | `sup_billstatus` | String |
| 17 | `purBillstatus` | 采购商端状态 | `pur_billstatus` | String |
| 18 | `approveTime` | 采购商审批时间 | `approve_time` | DateTime |
| 19 | `approveSuggestion` | 采购商审批意见 | `approve_suggestion` | String |
| 20 | `agencyEnterpriseId` | 招标代理机构租户ID | `agency_enterprise_id` | Long |
| 21 | `agencyOrgId` | 招标代理机构组织ID | `agency_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 22 | `agencyEnterpriseName` | 招标代理机构租户名称 | `agency_enterprise_name` | String |
| 23 | `agencyOfficialCode` | 招标代理机构组织编码 | `agency_official_code` | String |
| 24 | `noticeGetBiddoc` | 报名领取标书 | `notice_get_biddoc` | Short |
| 25 | `buyGetBiddoc` | 是否付费领取标书 | `buy_get_biddoc` | Short |
| 26 | `isBidEnsure` | 是否需要投标保证金 | `is_bid_ensure` | Short |
| 27 | `supPersonName` | 联系人 | `sup_person_name` | String |
| 28 | `supPersonTel` | 联系电话 | `sup_person_tel` | String |
| 29 | `supPersonFax` | 传真 | `sup_person_fax` | String |
| 30 | `supPersonMail` | 邮箱 | `sup_person_mail` | String |
| 31 | `bidNoticeId` | 供应商报名主表 | `bid_notice_id` | 9f3db86b-e723-4fde-a245-f09c2e59bab1 |
| 32 | `bidEnsureMoney` | 投标保障金金额 | `bid_ensure_money` | Decimal |
| 33 | `bidDocSaleBegin` | 文件购买起始时间 | `bid_doc_sale_begin` | DateTime |
| 34 | `bidDocSaleEnd` | 文件购买截止时间 | `bid_doc_sale_end` | DateTime |
| 35 | `tenderDocSubmitEnd` | 投标书递交截止时间 | `tender_doc_submit_end` | DateTime |
| 36 | `supBackInfo` | 供应商回执邀请信息 | `sup_back_info` | String |
| 37 | `remarks` | 备注 | `remarks` | String |
| 38 | `selectBidnotice` | 当前标保是否被选中报名 | `select_bidnotice` | Short |
| 39 | `tenderDocQuestionEnd` | 投标提问截止时间 | `tender_doc_question_end` | DateTime |
| 40 | `purchaseStatus` | 购买状态 | `purchase_status` | String |
| 41 | `saleAmount` | 文件发售金额 | `sale_amount` | Decimal |
| 42 | `orderStatus` | 订单状态 | `order_status` | String |
| 43 | `invoiceStatus` | 发票状态 | `invoice_status` | String |
| 44 | `invoiceType` | 发票类型 | `invoice_type` | String |
| 45 | `invoiceTime` | 开票时间 | `invoice_time` | DateTime |
| 46 | `payStatus` | 支付状态 | `pay_status` | String |
| 47 | `payType` | 支付方式 | `pay_type` | String |
| 48 | `orderId` | 订单id | `order_id` | Long |
| 49 | `payTime` | 支付时间 | `pay_time` | DateTime |
| 50 | `selectBuy` | 是否选中购买 | `select_buy` | Short |
| 51 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 52 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 53 | `supIpAddress` | 供应商报名ip地址 | `sup_ip_address` | String |
| 54 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 55 | `submitStatus` | 文件提交状态 | `submit_status` | Integer |
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
| 71 | `vendorTenant` | 采购商租户Id | `vendor_tenant_id` | String |
| 72 | `invitationEndTime` | 邀请答复截止日期 | `invitation_end_time` | DateTime |
| 73 | `file` | 附件 | `file` | String |
| 74 | `status` | 投标状态 | `status` | String |
| 75 | `tenantId` | tenantId | `tenant_id` | String |
| 76 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 77 | `announcementSectionId` | 公告标包标段信息 | `announcement_section_id` | 26f7d286-a241-415b-9be1-935fb4d87fd2 |
| 78 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 79 | `dr` | 逻辑删除标记 | `dr` | Short |
| 80 | `eliminateStatus` | 淘汰状态 | `eliminate_status` | String |
| 81 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `announcementSectionId` | 公告标包标段信息 | `saleauction.announcement.AuctionAnnouncementSection` | None |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | Service |  |
| 3 | `biddingId` | 投标主表ID | `saleauction.bid.BiddingVO` | None |  |
| 4 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `bidProjectId` | 采购项目 | `saleauction.project.AuctionProject` | None |  |
| 6 | `agencyOrgId` | 招标代理机构组织ID | `org.func.BaseOrg` | Service |  |
| 7 | `bidNoticeId` | 供应商报名主表 | `saleauction.bidnotice.NoticeVO` | None | true |
| 8 | `bidSectionId` | 标段包 | `saleauction.project.AuctionSection` | None |  |
