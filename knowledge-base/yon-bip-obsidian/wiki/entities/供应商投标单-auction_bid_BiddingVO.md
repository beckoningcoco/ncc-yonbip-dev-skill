---
tags: ["BIP", "元数据", "数据字典", "auction.bid.BiddingVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商投标单 (`auction.bid.BiddingVO`)

>  | 物理表：`cpu_bidding`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商投标单 |
| 物理表 | `cpu_bidding` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 23:26:35.2140` |

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
| 3 | `bidProjectId` | 项目ID | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 4 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 5 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 6 | `id` | ID | `id` | Long |
| 7 | `bidSectionId` | 标段(包)编号 | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 8 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 9 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 10 | `status` | 投标状态 | `status` | Integer |
| 11 | `bidDeadline` | 投标截止时间 | `bid_deadline` | Date |
| 12 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 13 | `bidType` | 采购方式 | `bid_type` | String |
| 14 | `purchaseName` | 采购方式 | `purchase_name` | String |
| 15 | `signStatus` | 签到状态 | `sign_status` | Integer |
| 16 | `bidSubjectId` | 投标标段id | `bid_subject_id` | Long |
| 17 | `bidBondId` | 保证金 | `bid_bond_id` | 47513cc1-a656-44fc-a9ab-95e7321bcdc5 |
| 18 | `bidBillStatus` | 竞拍单据状态 | `bid_bill_status` | Integer |
| 19 | `processorId` | 处理人ID | `processor_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 20 | `processTime` | 处理时间 | `process_time` | DateTime |
| 21 | `processor` | 处理人 | `processor` | String |
| 22 | `isLatest` | 是否最新阶段 | `is_latest` | Boolean |
| 23 | `biddingAddType` | 投标添加方式 | `bidding_add_type` | Short |
| 24 | `abandonBidding` | 放弃投标原因 | `abandon_bidding` | String |
| 25 | `conversionBidTotalLow` | 换算后投标总价 | `conversion_bid_total_low` | Decimal |
| 26 | `conversionTaxBidTotalLow` | 换算后含税投标总价 | `conversion_tax_bid_total_low` | Decimal |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 28 | `dr` | 逻辑删除标记 | `dr` | Short |
| 29 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 30 | `signTime` | 签到时间 | `sign_time` | Date |
| 31 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 32 | `earnestType` | 保证金缴纳状态 | `earnest_type` | Integer |
| 33 | `negotiateEndTime` | 谈判回复截止时间 | `negotiate_end_time` | Date |
| 34 | `biddingStartTime` | 竞价开始时间 | `bidding_start_time` | Date |
| 35 | `biddingType` | 竞价方式 | `bidding_type` | Integer |
| 36 | `winStatus` | 中标状态 | `win_status` | Integer |
| 37 | `notes` | 备注 | `notes` | String |
| 38 | `payMode` | 付款方式 | `pay_mode` | String |
| 39 | `bidFileId` | 招标文件 | `bid_file_id` | Long |
| 40 | `bidFileName` | 招标文件 | `bid_file_name` | String |
| 41 | `bidOpenTime` | 开标时间 | `bid_open_time` | Date |
| 42 | `taxBidTotalLow` | 投标含税总价 | `tax_bid_total_low` | Decimal |
| 43 | `bidOpenPlaceType` | 开标地点类型 | `bid_open_place_type` | String |
| 44 | `taxBidTotalUp` | 投标含税总价大写 | `tax_bid_total_up` | String |
| 45 | `bidOpenPlace` | 开标地点 | `bid_open_place` | String |
| 46 | `bidTotalLow` | 投标无税总价 | `bid_total_low` | Decimal |
| 47 | `bidTotalUp` | 投标无税总价大写 | `bid_total_up` | String |
| 48 | `submitStatus` | 文件提交状态 | `submit_status` | Integer |
| 49 | `secretStatus` | 加密状态 | `secret_status` | Integer |
| 50 | `bidClearFile` | 澄清文件 | `bid_clear_file` | String |
| 51 | `qualifyFileId` | 资格预审文件ID | `qualify_file_id` | Long |
| 52 | `bidEnsureMoney` | 投标保证金 | `bid_ensure_money` | Decimal |
| 53 | `consignationId` | 委托单ID | `consignation_id` | String |
| 54 | `consignationNo` | 委托单号 | `consignation_no` | String |
| 55 | `consignationName` | 委托名称 | `consignation_name` | String |
| 56 | `purchaseType` | 采购类别 | `purchase_type` | String |
| 57 | `bidQuotationMethod` | 报价方式 | `bid_quotation_method` | String |
| 58 | `bidQuotationCurrency` | 报价币种 | `bid_quotation_currency` | String |
| 59 | `purEnterpriseId` | 采购方租户ID | `pur_enterprise_id` | Long |
| 60 | `buyerName` | 采购员姓名 | `buyer_name` | String |
| 61 | `buyerTel` | 采购员电话 | `buyer_tel` | String |
| 62 | `buyerEmail` | 采购员邮箱 | `buyer_email` | String |
| 63 | `buyerFax` | 采购员传真 | `buyer_fax` | String |
| 64 | `linkman` | 联系人 | `linkman` | String |
| 65 | `linkmanUserId` | 联系人id | `linkman_user_id` | String |
| 66 | `linkmanTel` | 联系方式 | `linkman_tel` | String |
| 67 | `linkmanMail` | 联系人邮箱 | `linkman_mail` | String |
| 68 | `linkmanFax` | 联系人传真 | `linkman_fax` | String |
| 69 | `signerId` | 签到人ID | `signer_id` | Long |
| 70 | `signerName` | 签到人姓名 | `signer_name` | String |
| 71 | `qualifyCheckStep` | 资格审核当前流程阶段 0代表预审阶段 1代表后审阶段 | `qualify_check_step` | Integer |
| 72 | `pubts` | 时间戳 | `pubts` | DateTime |
| 73 | `supplydocId` | 供应商档案ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 74 | `workDuration` | 工期 | `work_duration` | String |
| 75 | `fileSubmitTime` | 文件提交时间 | `file_submit_time` | Date |
| 76 | `agencyOrgId` | 招标代理机构组织ID | `agency_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 77 | `agencyOrgName` | 招标代理机构组织名称 | `agency_org_name` | String |
| 78 | `evaluationStatus` | 评标阶段的投标人状态,1默认,2否决(不可评标) | `evaluation_status` | Integer |
| 79 | `preqDocSubmitEnd` | 资格预审响应文件递交截止时间 | `preq_doc_submit_end` | Date |
| 80 | `preqOpenTime` | 资格预审开标时间 | `preq_open_time` | Date |
| 81 | `preqOpenPlace` | 资格预审开标地点 | `preq_open_place` | String |
| 82 | `biddingAuctionDefineCharacter` | 竞拍报价表头特征 | `define_character_id` | 2bcc6fb1-ff49-467c-84ff-1558d6f150b5 |
| 83 | `round` | 谈判轮次;初始单据 谈判轮次为0; 发起谈判时 谈判轮次从1开始 | `round` | Integer |
| 84 | `roundState` | 最新谈判轮次状态,;最新版本状态,0为旧版本,1为最新版本;没有谈判,默认为1 | `round_state` | Integer |
| 85 | `combination` | 是否是组合标 | `combination` | Integer |
| 86 | `rate` | 税率 | `rate` | Decimal |
| 87 | `quotationRate` | 报价响应率 | `quotation_rate` | Decimal |
| 88 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 89 | `lawBid` | 法定招标 | `law_bid` | Integer |
| 90 | `alternativeBidSolution` | 是否允许递交备选投标方案 | `alternative_bid_solution` | Integer |
| 91 | `priceType` | 报价方式 含税 不含税 | `price_type` | String |
| 92 | `preSignStatus` | 预审签到状态 | `pre_sign_status` | Integer |
| 93 | `preSignTime` | 预审签到时间 | `pre_sign_time` | Date |
| 94 | `preSignerName` | 预审签到人姓名 | `pre_signer_name` | String |
| 95 | `preSignerId` | 预审签到人id | `pre_signer_id` | Long |
| 96 | `negotiateName` | 谈判标题 | `negotiate_name` | String |
| 97 | `negotiateStime` | 谈判开始时间 | `negotiate_stime` | Date |
| 98 | `negotiateEtime` | 谈判结束时间 | `negotiate_etime` | Date |
| 99 | `referncePrice` | 参考报价(上一轮报价) | `refernce_price` | Decimal |
| 100 | `negotiateState` | 是否最后一轮谈判默认为0 | `negotiate_state` | Integer |
| 101 | `quoteScope` | 报价范围 | `quote_scope` | Integer |
| 102 | `bidFileTemplateId` | 标书模板id | `bid_file_template_id` | Long |
| 103 | `supplyCode` | 供应商9s编码 | `supply_code` | String |
| 104 | `bidPreScoreTemplateId` | 预审评分模板id | `bidpre_score_template_id` | Long |
| 105 | `bidScoreTemplateId` | 预审评分模板id | `bid_score_template_id` | Long |
| 106 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 107 | `techDemand` | 技术质量要求 | `tech_demand` | String |
| 108 | `bizDemand` | 商务要求 | `biz_demand` | String |
| 109 | `bidTotalSecret` | 总价加密 | `bid_total_secret` | String |
| 110 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 111 | `technical` | 技术指标 | `technical` | String |
| 112 | `other` | 其他 | `other` | String |
| 113 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 114 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 115 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 116 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 117 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 118 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 119 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 120 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 121 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 122 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 123 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 124 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 125 | `manager` | 项目经理 | `manager` | String |
| 126 | `techleader` | 技术负责人 | `techleader` | String |
| 127 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 128 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 129 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 130 | `supOther` | 供应商其他 | `sup_other` | String |
| 131 | `ingredientFlag` | 材质(0否 1 是) | `ingredient_flag` | Integer |
| 132 | `singleFlag` | 单重(0否 1 是) | `single_flag` | Integer |
| 133 | `producerFlag` | 产地(0否 1 是) | `producer_flag` | Integer |
| 134 | `manufacturerFlag` | 制造商(0否 1 是) | `manufacturer_flag` | Integer |
| 135 | `lifetimeFlag` | 寿命(0否 1 是) | `lifetime_flag` | Integer |
| 136 | `reason` | 淘汰理由 | `reason` | String |
| 137 | `supplyClassName` | 供应分类名称 | `supply_class_name` | String |
| 138 | `decryptTime` | 文件解密时间 | `decrypt_time` | Date |
| 139 | `preBidFileTemplateId` | 资格预审文件模板id | `prebid_file_template_id` | Long |
| 140 | `ipMac` | ip | `ip_mac` | String |
| 141 | `dollarTotal` | 美元总价 | `dollar_total` | Decimal |
| 142 | `yenTotal` | 日元总价 | `yen_total` | Decimal |
| 143 | `euroTotal` | 欧元总价 | `euro_total` | Decimal |
| 144 | `poundTotal` | 英镑总价 | `pound_total` | Decimal |
| 145 | `earnestReturn` | 退保证金状态 | `earnest_return` | Integer |
| 146 | `isSecret` | 附件是否加密0否1是 | `is_secret` | Integer |
| 147 | `invitation` | 邀请标识1邀请 默认0 | `invitation` | Integer |
| 148 | `eliminate` | 淘汰环节 | `eliminate` | Long |
| 149 | `supBuyTime` | 供应商购买标书时间 | `sup_buy_time` | Date |
| 150 | `payTime` | 付款成功时间 | `pay_time` | Date |
| 151 | `submitTime` | 投标提交时间 | `submit_time` | Date |
| 152 | `preqSubmitTime` | 预审投标提交时间 | `preq_submit_time` | Date |
| 153 | `statement` | 投标声明 | `statement` | String |
| 154 | `security` | 投标一览表 | `security` | String |
| 155 | `priceOpenType` | 价格开启方式 | `price_open_type` | String |
| 156 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 157 | `itemsCount` | 总报价项数 | `items_count` | Integer |
| 158 | `totalBidCount` | 总报价数量 | `total_bid_count` | Decimal |
| 159 | `sumPrice` | 总报价 | `sum_price` | Decimal |
| 160 | `marginAmount` | 保证金金额 | `margin_amount` | Decimal |
| 161 | `paymentType` | 投保人缴纳方式 | `payment_type` | String |
| 162 | `marginStatus` | 保证金递交状态 | `margin_status` | String |
| 163 | `hasEncrypt` | 文件是否加密 | `has_encrypt` | Boolean |
| 164 | `encryptFileTime` | 文件加密时间 | `encrypt_file_time` | Date |
| 165 | `decryptFileTime` | 文件解密时间 | `decrypt_file_time` | Date |
| 166 | `bidBillType` | 招标单据类型 | `bid_bill_type` | String |
| 167 | `highestPrice` | 最高限价合计 | `highest_price` | Decimal |
| 168 | `addressMac` | mac地址 | `address_mac` | String |
| 169 | `taxBidTotalSecret` | 含税投标总价加密 | `tax_bid_total_secret` | String |
| 170 | `taxSumPrice` | 含税总报价 | `tax_sum_price` | Decimal |
| 171 | `encryptFileVersion` | 文件加解密版本 | `encrypt_file_version` | String |
| 172 | `multipleStageBid` | 是否两阶段 | `multiple_stage_bid` | Boolean |
| 173 | `currentStageReviewType` | 当前阶段类型 | `current_stage_review_type` | String |
| 174 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 175 | `buyerTenant` | 采购商租户ID | `buyer_tenant_id` | String |
| 176 | `transactionTypeId` | 交易类型ID | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 177 | `bidderDetails` | 投标物料 | `` | 6f99718a-b71a-4661-9975-b43aed08885a |
| 178 | `biddingFiles` | 投标文件 | `` | 94a4e062-748e-4fe9-8a7e-5301f3910d12 |
| 179 | `defines` | 供应商投标单自定义项表 | `` | 6c99d5dc-deb7-4cfa-a368-0b28bafb49e4 |
| 180 | `invitationVO` | 供应商标段关系 | `` | 71b2c005-ec05-44a6-aff8-f8d78fca9353 |

---

## 关联属性（14个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `biddingAuctionDefineCharacter` | 竞拍报价表头特征 | `auction.bid.BiddingAuctionDefineCharacter` | None |  |
| 2 | `transactionTypeId` | 交易类型ID | `bd.bill.TransType` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `bidderDetails` | 投标物料 | `auction.bid.BiddingMaterialDetailVO` | None | true |
| 5 | `bidProjectId` | 项目ID | `auction.project.AuctionProject` | None |  |
| 6 | `biddingFiles` | 投标文件 | `auction.bid.BiddingFileVO` | None | true |
| 7 | `defines` | 供应商投标单自定义项表 | `auction.bid.BiddingAuctionFreeDefine` | None | true |
| 8 | `invitationVO` | 供应商标段关系 | `auction.bid.InvitationVO` | None | true |
| 9 | `processorId` | 处理人ID | `base.user.BipUser` | Service |  |
| 10 | `supplydocId` | 供应商档案ID | `aa.vendor.Vendor` | Service |  |
| 11 | `bidBondId` | 保证金 | `auction.biddingbond.BiddingBondInfoVO` | None |  |
| 12 | `enterpriseId` | 供应商租户ID | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 13 | `agencyOrgId` | 招标代理机构组织ID | `org.func.BaseOrg` | Service |  |
| 14 | `bidSectionId` | 标段(包)编号 | `auction.project.AuctionSection` | None |  |
