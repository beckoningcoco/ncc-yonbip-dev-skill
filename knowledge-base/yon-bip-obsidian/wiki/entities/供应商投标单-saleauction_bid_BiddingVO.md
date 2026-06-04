---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "saleauction.bid.BiddingVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商投标单 (`saleauction.bid.BiddingVO`)

> ycBusinessCenter | 物理表：`cpu_bidding`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商投标单 |
| 物理表 | `cpu_bidding` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:42:38.4030` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（180个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `enterpriseId` | 供应商租户ID | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 2 | `enterpriseName` | 供应商租户名 | `enterprise_name` | String |
| 3 | `bidProjectId` | 项目ID | `bid_project_id` | 9f8b9356-4cd6-4ae7-8dc0-c84dfecdda07 |
| 4 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 5 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 6 | `id` | ID | `id` | Long |
| 7 | `bidSectionId` | 标段(包)编号 | `bid_section_id` | 052621d8-fde7-4ab0-94bf-b179c720ce6d |
| 8 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 9 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 10 | `status` | 投标状态 | `status` | Integer |
| 11 | `bidDeadline` | 投标截止时间 | `bid_deadline` | Date |
| 12 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 13 | `bidType` | 采购方式 | `bid_type` | String |
| 14 | `purchaseName` | 采购方式 | `purchase_name` | String |
| 15 | `signStatus` | 签到状态 | `sign_status` | Integer |
| 16 | `bidSubjectId` | 投标标段id | `bid_subject_id` | Long |
| 17 | `bidBillStatus` | 竞拍单据状态 | `bid_bill_status` | Integer |
| 18 | `processorId` | 处理人ID | `processor_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 19 | `processTime` | 处理时间 | `process_time` | DateTime |
| 20 | `processor` | 处理人 | `processor` | String |
| 21 | `isLatest` | 是否最新阶段 | `is_latest` | Boolean |
| 22 | `biddingAddType` | 投标添加方式 | `bidding_add_type` | Short |
| 23 | `abandonBidding` | 放弃投标原因 | `abandon_bidding` | String |
| 24 | `conversionBidTotalLow` | 换算后投标总价 | `conversion_bid_total_low` | Decimal |
| 25 | `conversionTaxBidTotalLow` | 换算后含税投标总价 | `conversion_tax_bid_total_low` | Decimal |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 27 | `dr` | 逻辑删除标记 | `dr` | Short |
| 28 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 29 | `signTime` | 签到时间 | `sign_time` | Date |
| 30 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 31 | `earnestType` | 保证金缴纳状态 | `earnest_type` | Integer |
| 32 | `negotiateEndTime` | 谈判回复截止时间 | `negotiate_end_time` | Date |
| 33 | `biddingStartTime` | 竞价开始时间 | `bidding_start_time` | Date |
| 34 | `biddingType` | 竞价方式 | `bidding_type` | Integer |
| 35 | `winStatus` | 中标状态 | `win_status` | Integer |
| 36 | `notes` | 备注 | `notes` | String |
| 37 | `payMode` | 付款方式 | `pay_mode` | String |
| 38 | `bidFileId` | 招标文件 | `bid_file_id` | Long |
| 39 | `bidFileName` | 招标文件 | `bid_file_name` | String |
| 40 | `bidOpenTime` | 开标时间 | `bid_open_time` | Date |
| 41 | `taxBidTotalLow` | 投标含税总价 | `tax_bid_total_low` | Decimal |
| 42 | `bidOpenPlaceType` | 开标地点类型 | `bid_open_place_type` | String |
| 43 | `taxBidTotalUp` | 投标含税总价大写 | `tax_bid_total_up` | String |
| 44 | `bidOpenPlace` | 开标地点 | `bid_open_place` | String |
| 45 | `bidTotalLow` | 投标无税总价 | `bid_total_low` | Decimal |
| 46 | `bidTotalUp` | 投标无税总价大写 | `bid_total_up` | String |
| 47 | `submitStatus` | 文件提交状态 | `submit_status` | Integer |
| 48 | `secretStatus` | 加密状态 | `secret_status` | Integer |
| 49 | `bidClearFile` | 澄清文件 | `bid_clear_file` | String |
| 50 | `qualifyFileId` | 资格预审文件ID | `qualify_file_id` | Long |
| 51 | `bidEnsureMoney` | 投标保证金 | `bid_ensure_money` | Decimal |
| 52 | `consignationId` | 委托单ID | `consignation_id` | String |
| 53 | `consignationNo` | 委托单号 | `consignation_no` | String |
| 54 | `consignationName` | 委托名称 | `consignation_name` | String |
| 55 | `purchaseType` | 采购类别 | `purchase_type` | String |
| 56 | `bidQuotationMethod` | 报价方式 | `bid_quotation_method` | String |
| 57 | `bidQuotationCurrency` | 报价币种 | `bid_quotation_currency` | String |
| 58 | `purEnterpriseId` | 采购方租户ID | `pur_enterprise_id` | Long |
| 59 | `buyerName` | 采购员姓名 | `buyer_name` | String |
| 60 | `buyerTel` | 采购员电话 | `buyer_tel` | String |
| 61 | `buyerEmail` | 采购员邮箱 | `buyer_email` | String |
| 62 | `buyerFax` | 采购员传真 | `buyer_fax` | String |
| 63 | `linkman` | 联系人 | `linkman` | String |
| 64 | `linkmanUserId` | 联系人id | `linkman_user_id` | String |
| 65 | `linkmanTel` | 联系方式 | `linkman_tel` | String |
| 66 | `linkmanMail` | 联系人邮箱 | `linkman_mail` | String |
| 67 | `linkmanFax` | 联系人传真 | `linkman_fax` | String |
| 68 | `signerId` | 签到人ID | `signer_id` | Long |
| 69 | `signerName` | 签到人姓名 | `signer_name` | String |
| 70 | `qualifyCheckStep` | 资格审核当前流程阶段 0代表预审阶段 1代表后审阶段 | `qualify_check_step` | Integer |
| 71 | `pubts` | 时间戳 | `pubts` | DateTime |
| 72 | `supplydocId` | 供应商档案ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 73 | `workDuration` | 工期 | `work_duration` | String |
| 74 | `fileSubmitTime` | 文件提交时间 | `file_submit_time` | Date |
| 75 | `agencyOrgId` | 招标代理机构组织ID | `agency_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 76 | `agencyOrgName` | 招标代理机构组织名称 | `agency_org_name` | String |
| 77 | `evaluationStatus` | 评标阶段的投标人状态,1默认,2否决(不可评标) | `evaluation_status` | Integer |
| 78 | `preqDocSubmitEnd` | 资格预审响应文件递交截止时间 | `preq_doc_submit_end` | Date |
| 79 | `preqOpenTime` | 资格预审开标时间 | `preq_open_time` | Date |
| 80 | `preqOpenPlace` | 资格预审开标地点 | `preq_open_place` | String |
| 81 | `round` | 谈判轮次;初始单据 谈判轮次为0; 发起谈判时 谈判轮次从1开始 | `round` | Integer |
| 82 | `biddingAuctionDefineCharacter` | 竞卖报价表头特征 | `define_character_id` | 1281447a-90b4-4d17-bb63-a80b5d5b0361 |
| 83 | `roundState` | 最新谈判轮次状态,;最新版本状态,0为旧版本,1为最新版本;没有谈判,默认为1 | `round_state` | Integer |
| 84 | `combination` | 是否是组合标 | `combination` | Integer |
| 85 | `rate` | 税率 | `rate` | Decimal |
| 86 | `quotationRate` | 报价响应率 | `quotation_rate` | Decimal |
| 87 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 88 | `lawBid` | 法定招标 | `law_bid` | Integer |
| 89 | `alternativeBidSolution` | 是否允许递交备选投标方案 | `alternative_bid_solution` | Integer |
| 90 | `priceType` | 报价方式 含税 不含税 | `price_type` | String |
| 91 | `preSignStatus` | 预审签到状态 | `pre_sign_status` | Integer |
| 92 | `preSignTime` | 预审签到时间 | `pre_sign_time` | Date |
| 93 | `preSignerName` | 预审签到人姓名 | `pre_signer_name` | String |
| 94 | `preSignerId` | 预审签到人id | `pre_signer_id` | Long |
| 95 | `negotiateName` | 谈判标题 | `negotiate_name` | String |
| 96 | `negotiateStime` | 谈判开始时间 | `negotiate_stime` | Date |
| 97 | `negotiateEtime` | 谈判结束时间 | `negotiate_etime` | Date |
| 98 | `referncePrice` | 参考报价(上一轮报价) | `refernce_price` | Decimal |
| 99 | `negotiateState` | 是否最后一轮谈判默认为0 | `negotiate_state` | Integer |
| 100 | `quoteScope` | 报价范围 | `quote_scope` | Integer |
| 101 | `bidFileTemplateId` | 标书模板id | `bid_file_template_id` | Long |
| 102 | `supplyCode` | 供应商9s编码 | `supply_code` | String |
| 103 | `bidPreScoreTemplateId` | 预审评分模板id | `bidpre_score_template_id` | Long |
| 104 | `bidScoreTemplateId` | 预审评分模板id | `bid_score_template_id` | Long |
| 105 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 106 | `techDemand` | 技术质量要求 | `tech_demand` | String |
| 107 | `bizDemand` | 商务要求 | `biz_demand` | String |
| 108 | `bidTotalSecret` | 总价加密 | `bid_total_secret` | String |
| 109 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 110 | `technical` | 技术指标 | `technical` | String |
| 111 | `other` | 其他 | `other` | String |
| 112 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 113 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 114 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 115 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 116 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 117 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 118 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 119 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 120 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 121 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 122 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 123 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 124 | `manager` | 项目经理 | `manager` | String |
| 125 | `techleader` | 技术负责人 | `techleader` | String |
| 126 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 127 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 128 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 129 | `supOther` | 供应商其他 | `sup_other` | String |
| 130 | `ingredientFlag` | 材质(0否 1 是) | `ingredient_flag` | Integer |
| 131 | `singleFlag` | 单重(0否 1 是) | `single_flag` | Integer |
| 132 | `producerFlag` | 产地(0否 1 是) | `producer_flag` | Integer |
| 133 | `manufacturerFlag` | 制造商(0否 1 是) | `manufacturer_flag` | Integer |
| 134 | `lifetimeFlag` | 寿命(0否 1 是) | `lifetime_flag` | Integer |
| 135 | `reason` | 淘汰理由 | `reason` | String |
| 136 | `supplyClassName` | 供应分类名称 | `supply_class_name` | String |
| 137 | `decryptTime` | 文件解密时间 | `decrypt_time` | Date |
| 138 | `preBidFileTemplateId` | 资格预审文件模板id | `prebid_file_template_id` | Long |
| 139 | `ipMac` | ip | `ip_mac` | String |
| 140 | `dollarTotal` | 美元总价 | `dollar_total` | Decimal |
| 141 | `yenTotal` | 日元总价 | `yen_total` | Decimal |
| 142 | `euroTotal` | 欧元总价 | `euro_total` | Decimal |
| 143 | `poundTotal` | 英镑总价 | `pound_total` | Decimal |
| 144 | `earnestReturn` | 退保证金状态 | `earnest_return` | Integer |
| 145 | `isSecret` | 附件是否加密0否1是 | `is_secret` | Integer |
| 146 | `invitation` | 邀请标识1邀请 默认0 | `invitation` | Integer |
| 147 | `eliminate` | 淘汰环节 | `eliminate` | Long |
| 148 | `supBuyTime` | 供应商购买标书时间 | `sup_buy_time` | Date |
| 149 | `payTime` | 付款成功时间 | `pay_time` | Date |
| 150 | `submitTime` | 投标提交时间 | `submit_time` | Date |
| 151 | `preqSubmitTime` | 预审投标提交时间 | `preq_submit_time` | Date |
| 152 | `statement` | 投标声明 | `statement` | String |
| 153 | `security` | 投标一览表 | `security` | String |
| 154 | `priceOpenType` | 价格开启方式 | `price_open_type` | String |
| 155 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 156 | `itemsCount` | 总报价项数 | `items_count` | Integer |
| 157 | `totalBidCount` | 总报价数量 | `total_bid_count` | Decimal |
| 158 | `sumPrice` | 总报价 | `sum_price` | Decimal |
| 159 | `marginAmount` | 保证金金额 | `margin_amount` | Decimal |
| 160 | `paymentType` | 投保人缴纳方式 | `payment_type` | String |
| 161 | `marginStatus` | 保证金递交状态 | `margin_status` | String |
| 162 | `hasEncrypt` | 文件是否加密 | `has_encrypt` | Boolean |
| 163 | `encryptFileTime` | 文件加密时间 | `encrypt_file_time` | Date |
| 164 | `decryptFileTime` | 文件解密时间 | `decrypt_file_time` | Date |
| 165 | `bidBillType` | 招标单据类型 | `bid_bill_type` | String |
| 166 | `highestPrice` | 最高限价合计 | `highest_price` | Decimal |
| 167 | `addressMac` | mac地址 | `address_mac` | String |
| 168 | `taxBidTotalSecret` | 含税投标总价加密 | `tax_bid_total_secret` | String |
| 169 | `taxSumPrice` | 含税总报价 | `tax_sum_price` | Decimal |
| 170 | `encryptFileVersion` | 文件加解密版本 | `encrypt_file_version` | String |
| 171 | `multipleStageBid` | 是否两阶段 | `multiple_stage_bid` | Boolean |
| 172 | `currentStageReviewType` | 当前阶段类型 | `current_stage_review_type` | String |
| 173 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 174 | `buyerTenant` | 采购商租户ID | `buyer_tenant_id` | String |
| 175 | `transactionTypeId` | 交易类型ID | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 176 | `bidderDetails` | 投标物料 | `` | fc91190c-4610-4d07-bdfa-c63fc4974a12 |
| 177 | `biddingFee` | 供应商缴费信息 | `` | 34ad9582-e7ee-497c-ba70-6fa0c011c723 |
| 178 | `biddingFiles` | 投标文件 | `` | d539a522-9993-4896-b97b-645cb54e6375 |
| 179 | `defines` | 供应商投标单自定义项表 | `` | 5429580c-13a0-4230-ab20-c4fef188d1ec |
| 180 | `invitationVO` | 供应商标段关系 | `` | 95f89b9a-5a24-45e2-aa4c-7fe9da2d6627 |

---

## 关联属性（14个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `biddingAuctionDefineCharacter` | 竞卖报价表头特征 | `saleauction.bid.BiddingAuctionDefineCharacter` | None |  |
| 2 | `transactionTypeId` | 交易类型ID | `bd.bill.TransType` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `bidderDetails` | 投标物料 | `saleauction.bid.BiddingMaterialDetailVO` | None | true |
| 5 | `bidProjectId` | 项目ID | `saleauction.project.AuctionProject` | None |  |
| 6 | `biddingFiles` | 投标文件 | `saleauction.bid.BiddingFileVO` | None | true |
| 7 | `defines` | 供应商投标单自定义项表 | `saleauction.bid.BiddingAuctionFreeDefine` | None | true |
| 8 | `invitationVO` | 供应商标段关系 | `saleauction.bid.InvitationVO` | None | true |
| 9 | `processorId` | 处理人ID | `base.user.BipUser` | Service |  |
| 10 | `supplydocId` | 供应商档案ID | `aa.vendor.Vendor` | Service |  |
| 11 | `biddingFee` | 供应商缴费信息 | `saleauction.bid.BiddingFee` | None | true |
| 12 | `enterpriseId` | 供应商租户ID | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 13 | `agencyOrgId` | 招标代理机构组织ID | `org.func.BaseOrg` | Service |  |
| 14 | `bidSectionId` | 标段(包)编号 | `saleauction.project.AuctionSection` | None |  |
