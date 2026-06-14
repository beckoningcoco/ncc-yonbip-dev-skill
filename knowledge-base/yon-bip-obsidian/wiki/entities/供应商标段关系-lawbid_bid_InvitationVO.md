---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "lawbid.bid.InvitationVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商标段关系 (`lawbid.bid.InvitationVO`)

> **平台版本：BIP 旗舰版 V5**

> ycBusinessCenter 模块 | 物理表：`cpu_bid_invitation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商标段关系 |
| 物理表 | `cpu_bid_invitation` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 20:14:19.6670` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:58:29:000

## 依赖接口（6个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 供应商标段关联接口 | `bid.itf.IInvitation` | 441 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 跨租户供应商租户接口 | `cpu.itf.IVendorTenant` | 14 |
| 6 | lawbidTenant租户相关 | `lawbid.itf.ITenant` | 2 |

---

## 直接属性（84个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `biddingId` | 投标主表 | `bidding_id` | 560d390c-4459-4448-8e73-f6ce26a04dba |
| 2 | `bidProjectId` | 采购项目 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 3 | `bidSectionId` | 标段包 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 4 | `bidDocMainId` | 招标文件主表 | `bid_doc_main_id` | 0abbc965-d427-4894-8f28-b88624633703 |
| 5 | `bidDocChildId` | 招标文件子表 | `bid_doc_child_id` | c5e9e2bd-4010-4ba3-9d39-10172dc5bf8f |
| 6 | `announcementSectionId` | 公告标包标段信息 | `announcement_section_id` | 1dd01106-207a-4f75-a076-499451600fbf |
| 7 | `bidNoticeId` | 供应商报名主表 | `bid_notice_id` | 9856b255-b5b6-4b2e-a8b9-a2c4ae9962b5 |
| 8 | `scoreResponseTimeEnd` | 评标答复截止时间 | `score_response_time_end` | DateTime |
| 9 | `tenantId` | 租户 | `tenant_id` | String |
| 10 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 11 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 12 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 13 | `bidType` | 采购方式 | `bid_type` | String |
| 14 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 15 | `downloadTime` | 首次下载时间 | `download_time` | DateTime |
| 16 | `receirtTime` | 接受时间 | `receirt_time` | DateTime |
| 17 | `createTime` | 创建日期 | `create_time` | DateTime |
| 18 | `bidSectionCode` | 标段编号 | `bid_section_code` | String |
| 19 | `bidSectionName` | 标段名称 | `bid_section_name` | String |
| 20 | `supBillstatus` | 供应商端状态 | `sup_billstatus` | String |
| 21 | `purBillstatus` | 采购商端状态 | `pur_billstatus` | String |
| 22 | `approveTime` | 采购商审批时间 | `approve_time` | DateTime |
| 23 | `approveSuggestion` | 采购商审批意见 | `approve_suggestion` | String |
| 24 | `agencyEnterpriseId` | 招标代理机构租户 | `agency_enterprise_id` | Long |
| 25 | `agencyOrgId` | 招标代理机构组织 | `agency_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 26 | `agencyEnterpriseName` | 招标代理机构租户名称 | `agency_enterprise_name` | String |
| 27 | `agencyOfficialCode` | 招标代理机构组织编码 | `agency_official_code` | String |
| 28 | `noticeGetBiddoc` | 报名领取标书 | `notice_get_biddoc` | Short |
| 29 | `buyGetBiddoc` | 是否付费领取标书 | `buy_get_biddoc` | Short |
| 30 | `isBidEnsure` | 是否需要投标保证金 | `is_bid_ensure` | Short |
| 31 | `supPersonName` | 联系人名称 | `sup_person_name` | String |
| 32 | `supPersonTel` | 联系人电话 | `sup_person_tel` | String |
| 33 | `supPersonFax` | 联系人传真 | `sup_person_fax` | String |
| 34 | `bidEnsureMoney` | 投标保障金金额 | `bid_ensure_money` | Decimal |
| 35 | `bidDocSaleBegin` | 文件购买起始时间 | `bid_doc_sale_begin` | DateTime |
| 36 | `bidDocSaleEnd` | 文件购买截止时间 | `bid_doc_sale_end` | DateTime |
| 37 | `tenderDocSubmitEnd` | 投标书递交截止时间 | `tender_doc_submit_end` | DateTime |
| 38 | `supBackInfo` | 供应商回执邀请信息 | `sup_back_info` | String |
| 39 | `remarks` | 备注 | `remarks` | String |
| 40 | `selectBidnotice` | 当前标保是否被选中报名 | `select_bidnotice` | Short |
| 41 | `tenderDocQuestionEnd` | 投标提问截止时间 | `tender_doc_question_end` | DateTime |
| 42 | `purchaseStatus` | 购买状态 | `purchase_status` | String |
| 43 | `saleAmount` | 文件发售金额 | `sale_amount` | Decimal |
| 44 | `orderStatus` | 订单状态 | `order_status` | String |
| 45 | `invoiceStatus` | 发票状态 | `invoice_status` | String |
| 46 | `invoiceType` | 发票类型 | `invoice_type` | String |
| 47 | `invoiceTime` | 开票时间 | `invoice_time` | DateTime |
| 48 | `payStatus` | 支付状态 | `pay_status` | String |
| 49 | `payType` | 支付方式 | `pay_type` | String |
| 50 | `orderId` | 订单 | `order_id` | Long |
| 51 | `payTime` | 支付时间 | `pay_time` | DateTime |
| 52 | `selectBuy` | 是否选中购买 | `select_buy` | Short |
| 53 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 54 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 55 | `supIpAddress` | 供应商报名地址 | `sup_ip_address` | String |
| 56 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 57 | `submitStatus` | 文件提交状态 | `submit_status` | Integer |
| 58 | `status` | 投标状态 | `status` | String |
| 59 | `paymentType` | 保证金缴纳方式 | `payment_type` | String |
| 60 | `marginStatus` | 保证金递交状态 | `margin_status` | String |
| 61 | `bidIpAddress` | 供应商投标ip地址 | `bid_ip_address` | String |
| 62 | `docSubmitType` | 文件递交方式 | `doc_submit_type` | String |
| 63 | `applyTime` | 报名时间 | `apply_time` | DateTime |
| 64 | `responseTime` | 答复时间 | `response_time` | DateTime |
| 65 | `lastBidTime` | 最后一次投标时间 | `bid_end_time` | DateTime |
| 66 | `bidOpeningTime` | 开标时间 | `bid_opening_time` | DateTime |
| 67 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 68 | `winStatus` | 中标状态 | `win_status` | String |
| 69 | `bidEndReason` | 结束淘汰原因 | `bid_end_reason` | String |
| 70 | `applyTimeBegin` | 报名开始时间 | `apply_time_begin` | DateTime |
| 71 | `applyTimeEnd` | 报名截止时间 | `apply_time_end` | DateTime |
| 72 | `docReceiveTimeEnd` | 文件领取截止时间 | `doc_receive_time_end` | DateTime |
| 73 | `isLatest` | 是否最新阶段 | `is_latest` | Boolean |
| 74 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 75 | `invitationEndTime` | 邀请答复截止日期 | `invitation_end_time` | DateTime |
| 76 | `file` | 附件 | `file` | String |
| 77 | `eliminateStatus` | 淘汰状态 | `eliminate_status` | String |
| 78 | `supPersonMail` | 联系人邮箱 | `sup_person_mail` | String |
| 79 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 80 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 81 | `dr` | 逻辑删除标记 | `dr` | Short |
| 82 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 83 | `id` | ID | `id` | Long |
| 84 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `announcementSectionId` | 公告标包标段信息 | `lawbid.announcement.LawbidAnnouncementSection` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `biddingId` | 投标主表 | `lawbid.bid.BiddingVO` | None | true |
| 4 | `bidDocMainId` | 招标文件主表 | `lawbid.calldocument.CallBidDocument` | None |  |
| 5 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `bidDocChildId` | 招标文件子表 | `lawbid.calldocument.CallBidDocumentSection` | None |  |
| 7 | `bidProjectId` | 采购项目 | `lawbid.project.LawbidProject` | None |  |
| 8 | `agencyOrgId` | 招标代理机构组织 | `org.func.BaseOrg` | Service |  |
| 9 | `bidNoticeId` | 供应商报名主表 | `lawbid.bidnotice.NoticeVO` | None |  |
| 10 | `bidSectionId` | 标段包 | `lawbid.section.LawbidSection` | None |  |
