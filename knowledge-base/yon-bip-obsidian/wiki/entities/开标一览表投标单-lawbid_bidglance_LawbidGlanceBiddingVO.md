---
tags: ["BIP", "元数据", "数据字典", "lawbid.bidglance.LawbidGlanceBiddingVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标一览表投标单 (`lawbid.bidglance.LawbidGlanceBiddingVO`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`cpu_bidding`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标一览表投标单 |
| 物理表 | `cpu_bidding` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 19:56:31.5150` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 投标单id |

## 部署信息

- 部署时间: 2026-05-22 23:55:27:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 4 | 跨租户供应商租户接口 | `cpu.itf.IVendorTenant` | 14 |

---

## 直接属性（166个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidSubjectId` | 投标标段id | `bid_subject_id` | Long |
| 2 | `biddingStartTime` | 竞价开始时间 | `bidding_start_time` | Date |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `isLatest` | 是否最新阶段 | `is_latest` | Boolean |
| 6 | `negotiateEndTime` | 谈判回复截止时间 | `negotiate_end_time` | Date |
| 7 | `roundState` | 最新谈判轮次状态 | `round_state` | Integer |
| 8 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `id` | 投标单id | `id` | Long |
| 11 | `enterpriseId` | 供应商租户ID | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 12 | `bidProjectId` | 项目ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 13 | `bidProjectCode` | 项目编码 | `bid_project_code` | String |
| 14 | `bidProjectName` | 项目名 | `bid_project_name` | String |
| 15 | `bidSectionId` | 标段(包)编号 | `bid_section_id` | 95fd3c1d-7e86-43ec-b5be-66ba3d6c6ad3 |
| 16 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 17 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 18 | `status` | 投标状态 | `status` | Integer |
| 19 | `bidDeadline` | 投标截止时间 | `bid_deadline` | Date |
| 20 | `bidType` | 采购方式 | `bid_type` | String |
| 21 | `signStatus` | 签到状态 | `sign_status` | Integer |
| 22 | `signTime` | 签到时间 | `sign_time` | Date |
| 23 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 24 | `earnestType` | 保证金缴纳状态 | `earnest_type` | Integer |
| 25 | `biddingType` | 竞价方式 | `bidding_type` | Integer |
| 26 | `winStatus` | 中标状态 | `win_status` | Integer |
| 27 | `notes` | 备注 | `notes` | String |
| 28 | `payMode` | 付款方式 | `pay_mode` | String |
| 29 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 30 | `bidOpenTime` | 开标时间 | `bid_open_time` | Date |
| 31 | `bidOpenPlaceType` | 开标地点类型 | `bid_open_place_type` | String |
| 32 | `bidOpenPlace` | 开标地点 | `bid_open_place` | String |
| 33 | `bidFileId` | 招标文件ID | `bid_file_id` | Long |
| 34 | `bidFileName` | 招标文件 | `bid_file_name` | String |
| 35 | `submitStatus` | 文件提交状态 | `submit_status` | Integer |
| 36 | `secretStatus` | 加密状态 | `secret_status` | Integer |
| 37 | `bidClearFile` | 澄清文件 | `bid_clear_file` | String |
| 38 | `qualifyFileId` | 资格预审文件ID | `qualify_file_id` | Long |
| 39 | `bidEnsureMoney` | 投标保证金 | `bid_ensure_money` | Decimal |
| 40 | `consignationId` | 委托单ID | `consignation_id` | String |
| 41 | `consignationNo` | 委托单号 | `consignation_no` | String |
| 42 | `consignationName` | 委托名称 | `consignation_name` | String |
| 43 | `purchaseType` | 采购类别 | `purchase_type` | String |
| 44 | `bidQuotationMethod` | 报价方式 | `bid_quotation_method` | String |
| 45 | `bidQuotationCurrency` | 报价币种 | `bid_quotation_currency` | String |
| 46 | `purEnterpriseId` | 采购方租户ID | `pur_enterprise_id` | Long |
| 47 | `buyerName` | 采购员姓名 | `buyer_name` | String |
| 48 | `buyerTel` | 采购员电话 | `buyer_tel` | String |
| 49 | `buyerEmail` | 采购员邮箱 | `buyer_email` | String |
| 50 | `buyerFax` | 采购员传真 | `buyer_fax` | String |
| 51 | `linkman` | 联系人 | `linkman` | String |
| 52 | `linkmanUserId` | 联系人id | `linkman_user_id` | String |
| 53 | `linkmanTel` | 联系方式 | `linkman_tel` | String |
| 54 | `linkmanMail` | 联系人邮箱 | `linkman_mail` | String |
| 55 | `linkmanFax` | 联系人传真 | `linkman_fax` | String |
| 56 | `signerId` | 签到人ID | `signer_id` | Long |
| 57 | `signerName` | 签到人姓名 | `signer_name` | String |
| 58 | `qualifyCheckStep` | 资格审核当前流程阶段 0代表预审阶段 1代表后审阶段 | `qualify_check_step` | Integer |
| 59 | `pubts` | 时间戳 | `pubts` | DateTime |
| 60 | `supplydocId` | 供应商档案ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 61 | `workDuration` | 工期 | `work_duration` | String |
| 62 | `fileSubmitTime` | 文件提交时间 | `file_submit_time` | Date |
| 63 | `agencyOrgId` | 招标代理机构组织ID | `agency_org_id` | String |
| 64 | `agencyOrgName` | 招标代理机构组织名称 | `agency_org_name` | String |
| 65 | `evaluationStatus` | 评标阶段的投标人状态,1默认,2否决(不可评标) | `evaluation_status` | Integer |
| 66 | `preqDocSubmitEnd` | 资格预审响应文件递交截止时间 | `preq_doc_submit_end` | Date |
| 67 | `preqOpenTime` | 资格预审开标时间 | `preq_open_time` | Date |
| 68 | `preqOpenPlace` | 资格预审开标地点 | `preq_open_place` | String |
| 69 | `round` | 谈判轮次 | `round` | Integer |
| 70 | `combination` | 是否是组合标 | `combination` | Integer |
| 71 | `rate` | 税率 | `rate` | Decimal |
| 72 | `quotationRate` | 报价响应率 | `quotation_rate` | Decimal |
| 73 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 74 | `lawBid` | 法定招标 | `law_bid` | Integer |
| 75 | `alternativeBidSolution` | 是否允许递交备选投标方案 | `alternative_bid_solution` | Integer |
| 76 | `priceType` | 报价方式 含税 不含税 | `price_type` | String |
| 77 | `preSignStatus` | 预审签到状态 | `pre_sign_status` | Integer |
| 78 | `preSignTime` | 预审签到时间 | `pre_sign_time` | Date |
| 79 | `preSignerName` | 预审签到人姓名 | `pre_signer_name` | String |
| 80 | `preSignerId` | 预审签到人id | `pre_signer_id` | Long |
| 81 | `negotiateName` | 谈判标题 | `negotiate_name` | String |
| 82 | `negotiateStime` | 谈判开始时间 | `negotiate_stime` | Date |
| 83 | `negotiateEtime` | 谈判结束时间 | `negotiate_etime` | Date |
| 84 | `referncePrice` | 参考报价(上一轮报价) | `refernce_price` | Decimal |
| 85 | `negotiateState` | 是否最后一轮谈判默认为0 | `negotiate_state` | Integer |
| 86 | `quoteScope` | 报价范围 | `quote_scope` | Integer |
| 87 | `bidFileTemplateId` | 标书模板id | `bid_file_template_id` | Long |
| 88 | `supplyCode` | 供应商9s编码 | `supply_code` | String |
| 89 | `bidPreScoreTemplateId` | 预审评分模板id | `bidpre_score_template_id` | Long |
| 90 | `bidScoreTemplateId` | 后审评分模板id | `bid_score_template_id` | Long |
| 91 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 92 | `techDemand` | 技术质量要求 | `tech_demand` | String |
| 93 | `bizDemand` | 商务要求 | `biz_demand` | String |
| 94 | `bidTotalSecret` | 总价加密 | `bid_total_secret` | String |
| 95 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 96 | `technical` | 技术指标 | `technical` | String |
| 97 | `other` | 其他 | `other` | String |
| 98 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 99 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 100 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 101 | `enterpriseName` | 投标单位 | `enterprise_name` | String |
| 102 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 103 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 104 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 105 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 106 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 107 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 108 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 109 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 110 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 111 | `manager` | 项目经理 | `manager` | String |
| 112 | `techleader` | 技术负责人 | `techleader` | String |
| 113 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 114 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 115 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 116 | `supOther` | 供应商其他 | `sup_other` | String |
| 117 | `ingredientFlag` | 材质(0否 1 是) | `ingredient_flag` | Integer |
| 118 | `singleFlag` | 单重(0否 1 是) | `single_flag` | Integer |
| 119 | `producerFlag` | 产地(0否 1 是) | `producer_flag` | Integer |
| 120 | `manufacturerFlag` | 制造商(0否 1 是) | `manufacturer_flag` | Integer |
| 121 | `lifetimeFlag` | 寿命(0否 1 是) | `lifetime_flag` | Integer |
| 122 | `reason` | 淘汰理由 | `reason` | String |
| 123 | `supplyClassName` | 供应分类名称 | `supply_class_name` | String |
| 124 | `decryptTime` | 文件解密时间 | `decrypt_time` | Date |
| 125 | `preBidFileTemplateId` | 资格预审文件模板id | `prebid_file_template_id` | Long |
| 126 | `ipMac` | ip | `ip_mac` | String |
| 127 | `dollarTotal` | 美元总价 | `dollar_total` | Decimal |
| 128 | `yenTotal` | 日元总价 | `yen_total` | Decimal |
| 129 | `euroTotal` | 欧元总价 | `euro_total` | Decimal |
| 130 | `poundTotal` | 英镑总价 | `pound_total` | Decimal |
| 131 | `earnestReturn` | 退保证金状态 | `earnest_return` | Integer |
| 132 | `isSecret` | 附件是否加密0否1是 | `is_secret` | Integer |
| 133 | `invitation` | 邀请标识1邀请 默认0 | `invitation` | Integer |
| 134 | `eliminate` | 淘汰环节 | `eliminate` | Long |
| 135 | `supBuyTime` | 供应商购买标书时间 | `sup_buy_time` | Date |
| 136 | `payTime` | 付款成功时间 | `pay_time` | Date |
| 137 | `submitTime` | 投标时间 | `submit_time` | Date |
| 138 | `preqSubmitTime` | 预审投标提交时间 | `preq_submit_time` | Date |
| 139 | `statement` | 投标声明 | `statement` | String |
| 140 | `security` | 投标一览表 | `security` | String |
| 141 | `priceOpenType` | 价格开启方式 | `price_open_type` | String |
| 142 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 143 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 144 | `itemsCount` | 总报价项数 | `items_count` | Integer |
| 145 | `totalBidCount` | 总报价数量 | `total_bid_count` | Decimal |
| 146 | `taxBidTotalLow` | 含税总价 | `tax_bid_total_low` | Decimal |
| 147 | `bidTotalLow` | 无税总价 | `bid_total_low` | Decimal |
| 148 | `sumPrice` | 总报价 | `sum_price` | Decimal |
| 149 | `marginAmount` | 保证金金额 | `margin_amount` | Decimal |
| 150 | `taxBidTotalUp` | 含税总价大写 | `tax_bid_total_up` | String |
| 151 | `bidTotalUp` | 无税总价大写 | `bid_total_up` | String |
| 152 | `paymentType` | 投保人缴纳方式 | `payment_type` | String |
| 153 | `marginStatus` | 保证金递交状态 | `margin_status` | String |
| 154 | `hasEncrypt` | 文件是否加密 | `has_encrypt` | Boolean |
| 155 | `encryptFileTime` | 文件加密时间 | `encrypt_file_time` | Date |
| 156 | `decryptFileTime` | 文件解密时间 | `decrypt_file_time` | Date |
| 157 | `bidBillType` | 招标单据类型 | `bid_bill_type` | String |
| 158 | `highestPrice` | 最高限价合计 | `highest_price` | Decimal |
| 159 | `addressMac` | mac地址 | `address_mac` | String |
| 160 | `taxBidTotalSecret` | 含税投标总价加密 | `tax_bid_total_secret` | String |
| 161 | `taxSumPrice` | 含税总报价 | `tax_sum_price` | Decimal |
| 162 | `encryptFileVersion` | 文件加解密版本 | `encrypt_file_version` | String |
| 163 | `multipleStageBid` | 是否两阶段 | `multiple_stage_bid` | Boolean |
| 164 | `currentStageReviewType` | 当前阶段类型 | `current_stage_review_type` | String |
| 165 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 166 | `bidderDetails` | 开标一览表投标单物料 | `` | 2f33b230-e0e5-45ba-888b-4a9fc5e3b7de |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplydocId` | 供应商档案ID | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `enterpriseId` | 供应商租户ID | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `bidderDetails` | 开标一览表投标单物料 | `lawbid.bidglance.LawbidGlanceBiddingMaterialDetailVO` | None | true |
| 5 | `bidProjectId` | 项目ID | `lawbid.project.LawbidProject` | None |  |
| 6 | `bidSectionId` | 标段(包)编号 | `lawbid.bidglance.LawbidGlanceSection` | None | true |
