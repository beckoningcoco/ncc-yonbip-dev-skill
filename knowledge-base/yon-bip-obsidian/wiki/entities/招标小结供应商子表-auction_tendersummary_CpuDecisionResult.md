---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.tendersummary.CpuDecisionResult"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 招标小结供应商子表 (`auction.tendersummary.CpuDecisionResult`)

> ycSouringAuction | 物理表：`cpu_tendersummary_supplier`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 招标小结供应商子表 |
| 物理表 | `cpu_tendersummary_supplier` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:38.6890` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（118个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `upstreamSupplierId` | 汇总报价单表头主键 | `upstream_supplier_id` | b1392faa-f850-4468-b4b3-d7f1f85fc4b4 |
| 2 | `decisionResultDefineCharacter` | 中标结果子表自定义项特征属性 | `decision_result_define_character` | d037ca46-4e3e-401a-8fb6-7c8624cec650 |
| 3 | `id` | id | `id` | Long |
| 4 | `enterpriseId` | 企业租户id | `enterprise_id` | Long |
| 5 | `ranking` | 候选排名 | `ranking` | Integer |
| 6 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 7 | `bidScore` | 分数 | `bid_score` | Decimal |
| 8 | `taxBidPrice` | 报价含税总价 | `tax_bid_price` | Decimal |
| 9 | `bidProjectId` | 项目ID | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 10 | `bidPrice` | 报价无税总价 | `bid_price` | Decimal |
| 11 | `bidProjectCode` | 项目编码 | `bid_project_code` | String |
| 12 | `rmbTotal` | 人民币总价 | `rmb_total` | Decimal |
| 13 | `taxFictitiousPrice` | 拟中标含税总价 | `tax_fictitious_price` | Decimal |
| 14 | `bidProjectName` | 项目名 | `bid_project_name` | String |
| 15 | `fictitiousPrice` | 拟中标无税总价 | `fictitious_price` | Decimal |
| 16 | `bidSectionId` | 标段（包）id | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 17 | `taxWinPrice` | 中标含税总价 | `tax_win_price` | Decimal |
| 18 | `bidSectionCode` | 标段（包）编号 | `bid_section_code` | String |
| 19 | `winPrice` | 中标无税总价 | `win_price` | Decimal |
| 20 | `bidSectionName` | 标段（包）名称 | `bid_section_name` | String |
| 21 | `state` | 预留状态 | `state` | Integer |
| 22 | `approveNotes` | 定标意见 | `approve_notes` | String |
| 23 | `bidNoticeFile` | 附件 | `bid_notice_file` | String |
| 24 | `priceUnit` | 货币单位 中标价格 | `price_unit` | String |
| 25 | `winNum` | 中标数量 | `win_num` | Decimal |
| 26 | `noticeNotes` | 中标结果公告时说明 | `notice_notes` | String |
| 27 | `adviceNotes` | 中标通知书时说明 | `advice_notes` | String |
| 28 | `serciePrice` | 服务费 | `sercie_price` | Decimal |
| 29 | `serciePriceUnit` | 货币单位服务费 | `sercie_price_unit` | String |
| 30 | `deratePrice` | 服务费减免额度 | `derate_price` | Decimal |
| 31 | `picketageId` | 主表主键 | `picketage_id` | Long |
| 32 | `supplydocId` | 投标人ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 33 | `supEnterpriseId` | 租户 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 34 | `decisionId` | 定标单主键 | `decision_id` | b2dc61df-e91a-4136-981a-295501d2e771 |
| 35 | `ispay` | 是否交费 | `isPay` | Integer |
| 36 | `eliminateStatus` | 供应商是否淘汰 | `eliminate_status` | Integer |
| 37 | `payDate` | 交费日期 | `pay_date` | DateTime |
| 38 | `deadlineDate` | 最后期限 | `deadline_date` | DateTime |
| 39 | `bidType` | 招标方式 | `bid_type` | String |
| 40 | `decisionCount` | 中标条目数 | `decision_count` | Integer |
| 41 | `editPath` | word文件名 | `edit_path` | String |
| 42 | `editPreview` | pdf文件名 | `edit_preview` | String |
| 43 | `sealStatus` | 盖章状态 | `seal_status` | Integer |
| 44 | `templateId` | 模板ID | `template_id` | Long |
| 45 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 46 | `payMode` | 付款方式 | `pay_mode` | String |
| 47 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 48 | `technical` | 技术指标 | `technical` | String |
| 49 | `other` | 其他 | `other` | String |
| 50 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 51 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 52 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 53 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 54 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 55 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 56 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 57 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 58 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 59 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 60 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 61 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 62 | `manager` | 项目经理 | `manager` | String |
| 63 | `techleader` | 技术负责人 | `techleader` | String |
| 64 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 65 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 66 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 67 | `supOther` | 供应商其他 | `sup_other` | String |
| 68 | `ingredientFlag` | 材质 | `ingredient_flag` | Integer |
| 69 | `singleFlag` | 单重 | `single_flag` | Integer |
| 70 | `producerFlag` | 产地 | `producer_flag` | Integer |
| 71 | `manufacturerFlag` | 制造商 | `manufacturer_flag` | Integer |
| 72 | `lifetimeFlag` | 寿命 | `lifetime_flag` | Integer |
| 73 | `dollarTotal` | 美元总价 | `dollar_total` | Decimal |
| 74 | `yenTotal` | 日元总价 | `yen_total` | Decimal |
| 75 | `euroTotal` | 欧元总价 | `euro_total` | Decimal |
| 76 | `poundTotal` | 英镑总价 | `pound_total` | Decimal |
| 77 | `isunite` | 是否是联合体投标 | `isUnite` | Integer |
| 78 | `mainBidderId` | 主投人租户id | `main_bidder_id` | Long |
| 79 | `mainId` | 主投人id | `main_id` | Long |
| 80 | `earnestType` | 保证金缴纳状态 | `earnest_type` | Integer |
| 81 | `earnestReturn` | 退保证金状态 | `earnest_return` | Integer |
| 82 | `supplyCode` | 供应商编码 | `supply_code` | String |
| 83 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 84 | `detailSealStatus` | 中标明细盖章状态 | `detail_seal_status` | Integer |
| 85 | `detailSealDate` | 明细签章日期 | `detail_seal_date` | DateTime |
| 86 | `sealDate` | 中标通知书签章日期 | `seal_date` | DateTime |
| 87 | `invitation` | 邀请标识 | `invitation` | Integer |
| 88 | `supStatus` | 供应商调整状态 | `sup_status` | Integer |
| 89 | `sendDate` | 发送时间 | `send_date` | DateTime |
| 90 | `supSubmitDate` | 供应商提交时间 | `sup_submit_date` | DateTime |
| 91 | `noticeDownloadTime` | 中标通知书下载时间 | `notice_download_time` | DateTime |
| 92 | `sealId` | 章id | `seal_id` | String |
| 93 | `amountServiceFee` | 服务费金额 | `amount_service_fee` | Decimal |
| 94 | `paymentReason` | 缴费原因 | `payment_reason` | String |
| 95 | `paymentNotice` | 缴费通知单 | `payment_notice` | String |
| 96 | `needPayServiceFee` | 是否缴纳中标服务费 | `need_pay_service_fee` | Boolean |
| 97 | `processingStatus` | 处理状态 | `processing_status` | Boolean |
| 98 | `processingTime` | 处理时间 | `processing_time` | DateTime |
| 99 | `purchasingPerson` | 采购负责人 | `purchasing_person` | String |
| 100 | `feeType` | 服务费类型 | `fee_type` | String |
| 101 | `code` | 订单号 | `code` | String |
| 102 | `isBid` | 是否中标 | `isBid` | Boolean |
| 103 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 104 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 105 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 106 | `editStatus` | 编辑状态 | `edit_status` | Integer |
| 107 | `fictitiousNum` | 拟中标数量 | `fictitious_num` | Decimal |
| 108 | `fictitiousScore` | 拟中标分数 | `fictitious_score` | Decimal |
| 109 | `freeDefine` | 招标小结供应商子表自定义项 | `` | 74af70ca-5f19-4ae0-85ca-3c37b42e942f |
| 110 | `notselectSuppliericeContent` | 内容 | `notice_content` | String |
| 111 | `pubts` | 时间戳 | `pubts` | DateTime |
| 112 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 113 | `supplementRate` | 税率 | `supplement_rate` | Decimal |
| 114 | `supplierReview` | 供应商查看情况 | `supplier_review` | String |
| 115 | `supplydocName` | 拟中标供应商 | `supplydoc_name` | String |
| 116 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 117 | `ts` | 时间戳 | `ts` | DateTime |
| 118 | `ytenant` | 租户id | `ytenant_id` | String |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 2 | `supplydocId` | 投标人ID | `aa.vendor.Vendor` | Service |  |
| 3 | `freeDefine` | 招标小结供应商子表自定义项 | `auction.tendersummary.CpuDecisionResultFreeDefine` | None | true |
| 4 | `supEnterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `decisionResultDefineCharacter` | 中标结果子表自定义项特征属性 | `auction.tendersummary.SummarySupplierDefineCharacter` | None |  |
| 6 | `decisionId` | 定标单主键 | `auction.tendersummary.CpuDecision` | None | true |
| 7 | `bidProjectId` | 项目ID | `auction.project.AuctionProject` | None |  |
| 8 | `upstreamSupplierId` | 汇总报价单表头主键 | `auction.scoringdata.ScoringDataMark` | None |  |
| 9 | `bidSectionId` | 标段（包）id | `auction.project.AuctionSection` | None |  |
