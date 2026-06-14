---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.decisionresult.CpuDecisionResult"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 中标结果子表 (`auction.decisionresult.CpuDecisionResult`)

> ycSouringAuction | 物理表：`cpu_dsn_result`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 中标结果子表 |
| 物理表 | `cpu_dsn_result` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:53.7900` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（124个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 3 | `ranking` | 候选排名 | `ranking` | Integer |
| 4 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 5 | `bidScore` | 分数 | `bid_score` | Decimal |
| 6 | `bidProjectId` | 项目ID | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 7 | `taxBidPrice` | 竞拍无税总价 | `tax_bid_price` | Decimal |
| 8 | `bidProjectCode` | 项目编码 | `bid_project_code` | String |
| 9 | `bidPrice` | 竞拍无税总价 | `bid_price` | Decimal |
| 10 | `rmbTotal` | 人民币总价 | `rmb_total` | Decimal |
| 11 | `supplementRate` | 税率 | `supplement_rate` | Decimal |
| 12 | `editStatus` | 编辑状态 | `edit_status` | Integer |
| 13 | `pushState` | 供应商履约类型 | `push_state` | String |
| 14 | `supplierReview` | 供应商查看情况 | `supplier_review` | String |
| 15 | `notselectSuppliericeContent` | 内容 | `notice_content` | String |
| 16 | `fictitiousNum` | 拟中标数量 | `fictitious_num` | Decimal |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `fictitiousScore` | 拟中标分数 | `fictitious_score` | Decimal |
| 19 | `supplydocName` | 投标人名称 | `supplydoc_name` | String |
| 20 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 21 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 22 | `tenantId` | tenantId | `tenant_id` | String |
| 23 | `ts` | 时间戳 | `ts` | DateTime |
| 24 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 25 | `ytenantId` | 租户 | `ytenant_id` | String |
| 26 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 27 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 28 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 29 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 30 | `bidProjectName` | 项目名 | `bid_project_name` | String |
| 31 | `taxFictitiousPrice` | 拟中标含税总价 | `tax_fictitious_price` | Decimal |
| 32 | `bidSectionId` | 标段(包)编号主键 | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 33 | `fictitiousPrice` | 拟中标无税总价 | `fictitious_price` | Decimal |
| 34 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 35 | `taxWinPrice` | 中标含税总价 | `tax_win_price` | Decimal |
| 36 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 37 | `winPrice` | 中标无税总价 | `win_price` | Decimal |
| 38 | `state` | 预留状态 | `state` | Integer |
| 39 | `isPushedContract` | 是否已推合同 | `is_pushed_contract` | Boolean |
| 40 | `isPushedOrder` | 是否已推订单 | `is_pushed_order` | Boolean |
| 41 | `approveNotes` | 定标意见 | `approve_notes` | String |
| 42 | `bidNoticeFile` | 附件 | `bid_notice_file` | String |
| 43 | `priceUnit` | 货币单位中标价格 | `price_unit` | String |
| 44 | `winNum` | 中标数量 | `win_num` | Decimal |
| 45 | `noticeNotes` | 中标结果公告时说明 | `notice_notes` | String |
| 46 | `adviceNotes` | 中标通知书时说明 | `advice_notes` | String |
| 47 | `serciePrice` | 服务费 | `sercie_price` | Decimal |
| 48 | `serciePriceUnit` | 货币单位服务费 | `sercie_price_unit` | String |
| 49 | `deratePrice` | 服务费减免额度 | `derate_price` | Decimal |
| 50 | `picketageId` | 主表主键 | `picketage_id` | Long |
| 51 | `supplydocId` | 中标竞拍方 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 52 | `supEnterpriseId` | 中标竞拍方 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 53 | `decisionId` | 定标单主键 | `decision_id` | cef2e51c-ec7a-4453-9655-76897331f5b9 |
| 54 | `ispay` | 是否交费 | `isPay` | Integer |
| 55 | `eliminateStatus` | 供应商是否淘汰 | `eliminate_status` | Integer |
| 56 | `payDate` | 交费日期 | `pay_date` | DateTime |
| 57 | `deadlineDate` | 最后期限 | `deadline_date` | DateTime |
| 58 | `bidType` | 招标方式 | `bid_type` | String |
| 59 | `decisionCount` | 中标条目数 | `decision_count` | Integer |
| 60 | `editPath` | word文件名 | `edit_path` | String |
| 61 | `editPreview` | pdf文件名 | `edit_preview` | String |
| 62 | `sealStatus` | 盖章状态 | `seal_status` | Integer |
| 63 | `templateId` | 模板ID | `template_id` | Long |
| 64 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 65 | `payMode` | 付款方式 | `pay_mode` | String |
| 66 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 67 | `technical` | 技术指标 | `technical` | String |
| 68 | `other` | 其他 | `other` | String |
| 69 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 70 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 71 | `decisionResultDefineCharacter` | 中标结果子表自定义项 | `decision_result_define_character` | bbb887b1-7136-4ee6-8c14-ed4aa2fa215b |
| 72 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 73 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 74 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 75 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 76 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 77 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 78 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 79 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 80 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 81 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 82 | `manager` | 项目经理 | `manager` | String |
| 83 | `techleader` | 技术负责人 | `techleader` | String |
| 84 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 85 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 86 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 87 | `supOther` | 供应商其他 | `sup_other` | String |
| 88 | `ingredientFlag` | 材质 | `ingredient_flag` | Integer |
| 89 | `singleFlag` | 单重 | `single_flag` | Integer |
| 90 | `producerFlag` | 产地 | `producer_flag` | Integer |
| 91 | `manufacturerFlag` | 制造商 | `manufacturer_flag` | Integer |
| 92 | `lifetimeFlag` | 寿命 | `lifetime_flag` | Integer |
| 93 | `dollarTotal` | 美元总价 | `dollar_total` | Decimal |
| 94 | `yenTotal` | 日元总价 | `yen_total` | Decimal |
| 95 | `euroTotal` | 欧元总价 | `euro_total` | Decimal |
| 96 | `poundTotal` | 英镑总价 | `pound_total` | Decimal |
| 97 | `isunite` | 是否是联合体投标 | `isUnite` | Integer |
| 98 | `mainBidderId` | 主投人租户主键 | `main_bidder_id` | Long |
| 99 | `mainId` | 主投人主键 | `main_id` | Long |
| 100 | `earnestType` | 保证金缴纳状态 | `earnest_type` | Integer |
| 101 | `earnestReturn` | 退保证金状态 | `earnest_return` | Integer |
| 102 | `supplyCode` | 供应商编码 | `supply_code` | String |
| 103 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 104 | `detailSealStatus` | 中标明细盖章状态 | `detail_seal_status` | Integer |
| 105 | `detailSealDate` | 明细签章日期 | `detail_seal_date` | DateTime |
| 106 | `sealDate` | 中标通知书签章日期 | `seal_date` | DateTime |
| 107 | `invitation` | 邀请标识 | `invitation` | Integer |
| 108 | `supStatus` | 供应商调整状态 | `sup_status` | Integer |
| 109 | `sendDate` | 发送时间 | `send_date` | DateTime |
| 110 | `supSubmitDate` | 供应商提交时间 | `sup_submit_date` | DateTime |
| 111 | `noticeDownloadTime` | 中标通知书下载时间 | `notice_download_time` | DateTime |
| 112 | `sealId` | 章id | `seal_id` | String |
| 113 | `amountServiceFee` | 服务费金额 | `amount_service_fee` | Decimal |
| 114 | `paymentReason` | 缴费原因 | `payment_reason` | String |
| 115 | `paymentNotice` | 缴费通知单 | `payment_notice` | String |
| 116 | `needPayServiceFee` | 是否缴纳中标服务费 | `need_pay_service_fee` | Boolean |
| 117 | `processingStatus` | 处理状态 | `processing_status` | Boolean |
| 118 | `processingTime` | 处理时间 | `processing_time` | DateTime |
| 119 | `purchasingPerson` | 采购负责人 | `purchasing_person` | String |
| 120 | `feeType` | 服务费类型 | `fee_type` | String |
| 121 | `code` | 订单号 | `code` | String |
| 122 | `isBid` | 是否中标 | `isBid` | Boolean |
| 123 | `upstreamSupplierId` | 汇总报价单表头主键 | `upstream_supplier_id` | b1392faa-f850-4468-b4b3-d7f1f85fc4b4 |
| 124 | `freeDefine` | 中标结果表自定义项表 | `` | 9955b6e7-4985-4b7f-9e07-e79e0589df28 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 2 | `supplydocId` | 中标竞拍方 | `aa.vendor.Vendor` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `freeDefine` | 中标结果表自定义项表 | `auction.decisionresult.CpuDecisionResultFreeDefine` | None | true |
| 5 | `supEnterpriseId` | 中标竞拍方 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `decisionResultDefineCharacter` | 中标结果子表自定义项 | `auction.decisionresult.AuctionDecisionResultDefineCharacter` | None |  |
| 7 | `decisionId` | 定标单主键 | `auction.decisionresult.CpuDecision` | None | true |
| 8 | `bidProjectId` | 项目ID | `auction.project.AuctionProject` | None |  |
| 9 | `upstreamSupplierId` | 汇总报价单表头主键 | `auction.scoringdata.ScoringDataMark` | None |  |
| 10 | `bidSectionId` | 标段(包)编号主键 | `auction.project.AuctionSection` | None |  |
