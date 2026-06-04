---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.decisioncandidate.CpuDsnCandidatePublicity"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 中标候选人公示供应商子表 (`auction.decisioncandidate.CpuDsnCandidatePublicity`)

> ycSouringAuction | 物理表：`cpu_candidate_result`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 中标候选人公示供应商子表 |
| 物理表 | `cpu_candidate_result` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:07.0290` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（119个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `decisionResultDefineCharacter` | 中标结果子表自定义项特征属性 | `decision_result_define_character` | 7abce55e-82b7-4a49-81ce-155b23f6fd6d |
| 2 | `id` | id | `id` | Long |
| 3 | `bidProjectId` | 项目ID | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 4 | `upstreamSupplierId` | 汇总报价单表头主键 | `upstream_supplier_id` | b1392faa-f850-4468-b4b3-d7f1f85fc4b4 |
| 5 | `bidSectionId` | 标段(包)编号主键 | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 6 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 7 | `ranking` | 出价排名 | `ranking` | Integer |
| 8 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 9 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 10 | `bidScore` | 分数 | `bid_score` | Decimal |
| 11 | `taxBidPrice` | 出价含税总价 | `tax_bid_price` | Decimal |
| 12 | `bidProjectCode` | 项目编码 | `bid_project_code` | String |
| 13 | `bidPrice` | 出价无税总价 | `bid_price` | Decimal |
| 14 | `rmbTotal` | 人民币总价 | `rmb_total` | Decimal |
| 15 | `bidProjectName` | 项目名 | `bid_project_name` | String |
| 16 | `taxFictitiousPrice` | 拟中标含税总价 | `tax_fictitious_price` | Decimal |
| 17 | `fictitiousPrice` | 拟中标无税总价 | `fictitious_price` | Decimal |
| 18 | `bidSectionCode` | 标段（包）编号 | `bid_section_code` | String |
| 19 | `taxWinPrice` | 中标含税总价 | `tax_win_price` | Decimal |
| 20 | `bidSectionName` | 标段（包）名称 | `bid_section_name` | String |
| 21 | `winPrice` | 中标无税总价 | `win_price` | Decimal |
| 22 | `state` | 预留状态 | `state` | Integer |
| 23 | `approveNotes` | 定标意见 | `approve_notes` | String |
| 24 | `bidNoticeFile` | 附件 | `bid_notice_file` | String |
| 25 | `priceUnit` | 货币单位 中标价格 | `price_unit` | String |
| 26 | `winNum` | 中标数量 | `win_num` | Decimal |
| 27 | `noticeNotes` | 中标结果公告时说明 | `notice_notes` | String |
| 28 | `adviceNotes` | 中标通知书时说明 | `advice_notes` | String |
| 29 | `serciePrice` | 服务费 | `sercie_price` | Decimal |
| 30 | `serciePriceUnit` | 货币单位服务费 | `sercie_price_unit` | String |
| 31 | `deratePrice` | 服务费减免额度 | `derate_price` | Decimal |
| 32 | `picketageId` | 主表主键 | `picketage_id` | Long |
| 33 | `supplydocId` | 投标人ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 34 | `supEnterpriseId` | 租户 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 35 | `decisionId` | 定标单主键 | `decision_id` | c93185c0-7cb2-4962-ba11-eb04e1292ca6 |
| 36 | `ispay` | 是否交费 | `isPay` | Integer |
| 37 | `eliminateStatus` | 供应商是否淘汰 | `eliminate_status` | Integer |
| 38 | `payDate` | 交费日期 | `pay_date` | DateTime |
| 39 | `deadlineDate` | 最后期限 | `deadline_date` | DateTime |
| 40 | `bidType` | 招标方式 | `bid_type` | String |
| 41 | `decisionCount` | 中标条目数 | `decision_count` | Integer |
| 42 | `editPath` | word文件名 | `edit_path` | String |
| 43 | `editPreview` | pdf文件名 | `edit_preview` | String |
| 44 | `sealStatus` | 盖章状态 | `seal_status` | Integer |
| 45 | `templateId` | 模板ID | `template_id` | Long |
| 46 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 47 | `payMode` | 付款方式 | `pay_mode` | String |
| 48 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 49 | `technical` | 技术指标 | `technical` | String |
| 50 | `other` | 其他 | `other` | String |
| 51 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 52 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 53 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 54 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 55 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 56 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 57 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 58 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 59 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 60 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 61 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 62 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 63 | `manager` | 项目经理 | `manager` | String |
| 64 | `techleader` | 技术负责人 | `techleader` | String |
| 65 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 66 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 67 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 68 | `supOther` | 供应商其他 | `sup_other` | String |
| 69 | `ingredientFlag` | 材质 | `ingredient_flag` | Integer |
| 70 | `singleFlag` | 单重 | `single_flag` | Integer |
| 71 | `producerFlag` | 产地 | `producer_flag` | Integer |
| 72 | `manufacturerFlag` | 制造商 | `manufacturer_flag` | Integer |
| 73 | `lifetimeFlag` | 寿命 | `lifetime_flag` | Integer |
| 74 | `dollarTotal` | 美元总价 | `dollar_total` | Decimal |
| 75 | `yenTotal` | 日元总价 | `yen_total` | Decimal |
| 76 | `euroTotal` | 欧元总价 | `euro_total` | Decimal |
| 77 | `poundTotal` | 英镑总价 | `pound_total` | Decimal |
| 78 | `isunite` | 是否是联合体投标 | `isUnite` | Integer |
| 79 | `mainBidderId` | 主投人租户id | `main_bidder_id` | Long |
| 80 | `mainId` | 主投人id | `main_id` | Long |
| 81 | `earnestType` | 保证金缴纳状态 | `earnest_type` | Integer |
| 82 | `earnestReturn` | 退保证金状态 | `earnest_return` | Integer |
| 83 | `supplyCode` | 供应商编码 | `supply_code` | String |
| 84 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 85 | `detailSealStatus` | 中标明细盖章状态 | `detail_seal_status` | Integer |
| 86 | `detailSealDate` | 明细签章日期 | `detail_seal_date` | DateTime |
| 87 | `sealDate` | 中标通知书签章日期 | `seal_date` | DateTime |
| 88 | `invitation` | 邀请标识 | `invitation` | Integer |
| 89 | `supStatus` | 供应商调整状态 | `sup_status` | Integer |
| 90 | `sendDate` | 发送时间 | `send_date` | DateTime |
| 91 | `supSubmitDate` | 供应商提交时间 | `sup_submit_date` | DateTime |
| 92 | `noticeDownloadTime` | 中标通知书下载时间 | `notice_download_time` | DateTime |
| 93 | `sealId` | 章id | `seal_id` | String |
| 94 | `amountServiceFee` | 服务费金额 | `amount_service_fee` | Decimal |
| 95 | `paymentReason` | 缴费原因 | `payment_reason` | String |
| 96 | `paymentNotice` | 缴费通知单 | `payment_notice` | String |
| 97 | `needPayServiceFee` | 是否缴纳中标服务费 | `need_pay_service_fee` | Boolean |
| 98 | `processingStatus` | 处理状态 | `processing_status` | Boolean |
| 99 | `processingTime` | 处理时间 | `processing_time` | DateTime |
| 100 | `purchasingPerson` | 采购负责人 | `purchasing_person` | String |
| 101 | `feeType` | 服务费类型 | `fee_type` | String |
| 102 | `code` | 订单号 | `code` | String |
| 103 | `isBid` | 是否中标 | `isBid` | Boolean |
| 104 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 105 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 106 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 107 | `editStatus` | 编辑状态 | `edit_status` | Integer |
| 108 | `fictitiousNum` | 拟中标数量 | `fictitious_num` | Decimal |
| 109 | `fictitiousScore` | 拟中标分数 | `fictitious_score` | Decimal |
| 110 | `freeDefine` | 中标候选人公示供应商信息子表自定义自由项表 | `` | 081c78d6-25a4-4156-9e73-bdd0fd51d9a9 |
| 111 | `notselectSuppliericeContent` | 内容 | `notice_content` | String |
| 112 | `pubts` | 时间戳 | `pubts` | DateTime |
| 113 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 114 | `supplementRate` | 税率 | `supplement_rate` | Decimal |
| 115 | `supplierReview` | 供应商查看情况 | `supplier_review` | String |
| 116 | `supplydocName` | 拟中标供应商 | `supplydoc_name` | String |
| 117 | `ts` | 时间戳 | `ts` | DateTime |
| 118 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 119 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 2 | `supplydocId` | 投标人ID | `aa.vendor.Vendor` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `freeDefine` | 中标候选人公示供应商信息子表自定义自由项表 | `auction.decisioncandidate.CpuDsnCandidatePublicityFreeDefine` | None | true |
| 5 | `supEnterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `decisionResultDefineCharacter` | 中标结果子表自定义项特征属性 | `auction.decisioncandidate.CandidateResultDefineCharacter` | None |  |
| 7 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 8 | `decisionId` | 定标单主键 | `auction.decisioncandidate.CpuCandidatePublicity` | None | true |
| 9 | `bidProjectId` | 项目ID | `auction.project.AuctionProject` | None |  |
| 10 | `upstreamSupplierId` | 汇总报价单表头主键 | `auction.scoringdata.ScoringDataMark` | None |  |
| 11 | `bidSectionId` | 标段(包)编号主键 | `auction.project.AuctionSection` | None |  |
