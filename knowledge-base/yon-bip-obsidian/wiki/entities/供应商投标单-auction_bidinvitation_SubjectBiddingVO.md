---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.bidinvitation.SubjectBiddingVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商投标单 (`auction.bidinvitation.SubjectBiddingVO`)

> ycSouringAuction | 物理表：`cpu_bidding`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商投标单 |
| 物理表 | `cpu_bidding` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:55.0880` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（173个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `bidSubjectId` | 投标项目主表 | `bid_subject_id` | b0c5a734-8ee8-451f-bf27-48ee8c2e5790 |
| 3 | `status` | 状态 | `status` | Integer |
| 4 | `abandonBidding` | 放弃投标原因 | `abandon_bidding` | String |
| 5 | `addressMac` | mac地址 | `address_mac` | String |
| 6 | `agencyOrgId` | 招标代理机构组织 | `agency_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 7 | `agencyOrgName` | 招标代理机构组织名称 | `agency_org_name` | String |
| 8 | `alternativeBidSolution` | 是否允许递交备选投标方案 | `alternative_bid_solution` | Integer |
| 9 | `bidBillStatus` | 竞拍单据状态 | `bid_bill_status` | Integer |
| 10 | `bidBillType` | 招标单据类型 | `bid_bill_type` | String |
| 11 | `bidBondId` | 保证金 | `bid_bond_id` | 47513cc1-a656-44fc-a9ab-95e7321bcdc5 |
| 12 | `bidClearFile` | 澄清文件 | `bid_clear_file` | String |
| 13 | `bidDeadline` | 投标截止时间 | `bid_deadline` | Date |
| 14 | `bidEnsureMoney` | 投标保证金 | `bid_ensure_money` | Decimal |
| 15 | `bidFileId` | 招标文件 | `bid_file_id` | Long |
| 16 | `bidFileName` | 招标文件 | `bid_file_name` | String |
| 17 | `bidFileTemplateId` | 标书模板 | `bid_file_template_id` | Long |
| 18 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 19 | `bidOpenPlace` | 开标地点 | `bid_open_place` | String |
| 20 | `bidOpenPlaceType` | 开标地点类型 | `bid_open_place_type` | String |
| 21 | `bidOpenTime` | 开标时间 | `bid_open_time` | Date |
| 22 | `bidPreScoreTemplateId` | 预审评分模板 | `bidpre_score_template_id` | Long |
| 23 | `bidProjectCode` | 项目编码 | `bid_project_code` | String |
| 24 | `bidProjectId` | 采购项目id | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 25 | `bidProjectName` | 项目名 | `bid_project_name` | String |
| 26 | `bidQuotationCurrency` | 报价币种 | `bid_quotation_currency` | String |
| 27 | `bidQuotationMethod` | 报价方式 | `bid_quotation_method` | String |
| 28 | `bidScoreTemplateId` | 后审评分模板 | `bid_score_template_id` | Long |
| 29 | `bidSectionCode` | 标段（包）编号 | `bid_section_code` | String |
| 30 | `bidSectionId` | 标段包id | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 31 | `bidSectionName` | 标段（包）名称 | `bid_section_name` | String |
| 32 | `bidTotalLow` | 投标总价小写 | `bid_total_low` | Decimal |
| 33 | `bidTotalSecret` | 总价加密 | `bid_total_secret` | String |
| 34 | `bidTotalUp` | 投标总价大写 | `bid_total_up` | String |
| 35 | `bidType` | 采购方式 | `bid_type` | String |
| 36 | `biddingAddType` | 投标添加方式 | `bidding_add_type` | Short |
| 37 | `biddingStartTime` | 竞价开始时间 | `bidding_start_time` | Date |
| 38 | `biddingType` | 竞价方式 | `bidding_type` | Integer |
| 39 | `bizDemand` | 商务要求 | `biz_demand` | String |
| 40 | `buyerEmail` | 采购员邮箱 | `buyer_email` | String |
| 41 | `buyerFax` | 采购员传真 | `buyer_fax` | String |
| 42 | `buyerName` | 采购员姓名 | `buyer_name` | String |
| 43 | `buyerTel` | 采购员电话 | `buyer_tel` | String |
| 44 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 45 | `combination` | 是否是组合标 | `combination` | Integer |
| 46 | `consignationId` | 委托单 | `consignation_id` | String |
| 47 | `consignationName` | 委托名称 | `consignation_name` | String |
| 48 | `consignationNo` | 委托单号 | `consignation_no` | String |
| 49 | `conversionBidTotalLow` | 换算后投标总价 | `conversion_bid_total_low` | Decimal |
| 50 | `conversionTaxBidTotalLow` | 换算后含税投标总价 | `conversion_tax_bid_total_low` | Decimal |
| 51 | `currentStageReviewType` | 当前阶段类型 | `current_stage_review_type` | String |
| 52 | `decryptFileTime` | 文件解密时间 | `decrypt_file_time` | Date |
| 53 | `decryptTime` | 文件解密时间 | `decrypt_time` | Date |
| 54 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 55 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 56 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 57 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 58 | `dollarTotal` | 美元总价 | `dollar_total` | Decimal |
| 59 | `dr` | 逻辑删除标记 | `dr` | Short |
| 60 | `earnestReturn` | 退保证金状态 | `earnest_return` | Integer |
| 61 | `earnestType` | 保证金缴纳状态 | `earnest_type` | Integer |
| 62 | `eliminate` | 淘汰环节 | `eliminate` | Long |
| 63 | `encryptFileTime` | 文件加密时间 | `encrypt_file_time` | Date |
| 64 | `encryptFileVersion` | 文件加解密版本 | `encrypt_file_version` | String |
| 65 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 66 | `enterpriseName` | 供应商租户名 | `enterprise_name` | String |
| 67 | `euroTotal` | 欧元总价 | `euro_total` | Decimal |
| 68 | `evaluationStatus` | 是否谈判 | `evaluation_status` | Integer |
| 69 | `fileSubmitTime` | 文件提交时间 | `file_submit_time` | Date |
| 70 | `hasEncrypt` | 文件是否加密 | `has_encrypt` | Boolean |
| 71 | `highestPrice` | 最高限价合计 | `highest_price` | Decimal |
| 72 | `ingredientFlag` | 材质 | `ingredient_flag` | Integer |
| 73 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 74 | `invitation` | 邀请标识 | `invitation` | Integer |
| 75 | `invitationVO` | 投标标段关系 | `` | 07fdb52e-7740-4e50-a433-17216d640d27 |
| 76 | `ipMac` | ip | `ip_mac` | String |
| 77 | `isLatest` | 是否最新阶段 | `is_latest` | Boolean |
| 78 | `isSecret` | 附件是否加密 | `is_secret` | Integer |
| 79 | `itemsCount` | 总报价项数 | `items_count` | Integer |
| 80 | `lawBid` | 法定招标 | `law_bid` | Integer |
| 81 | `lifetimeFlag` | 寿命 | `lifetime_flag` | Integer |
| 82 | `linkman` | 联系人 | `linkman` | String |
| 83 | `linkmanFax` | 联系人传真 | `linkman_fax` | String |
| 84 | `linkmanMail` | 联系人邮箱 | `linkman_mail` | String |
| 85 | `linkmanTel` | 联系方式 | `linkman_tel` | String |
| 86 | `linkmanUserId` | 联系人 | `linkman_user_id` | String |
| 87 | `manager` | 项目经理 | `manager` | String |
| 88 | `manufacturerFlag` | 制造商 | `manufacturer_flag` | Integer |
| 89 | `marginAmount` | 保证金金额 | `margin_amount` | Decimal |
| 90 | `marginStatus` | 保证金递交状态 | `margin_status` | String |
| 91 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 92 | `multipleStageBid` | 是否两阶段 | `multiple_stage_bid` | Boolean |
| 93 | `negotiateEndTime` | 谈判回复截止时间 | `negotiate_end_time` | Date |
| 94 | `negotiateEtime` | 谈判结束时间 | `negotiate_etime` | Date |
| 95 | `negotiateName` | 谈判标题 | `negotiate_name` | String |
| 96 | `negotiateState` | 是否最后一轮谈判 | `negotiate_state` | Integer |
| 97 | `negotiateStime` | 谈判开始时间 | `negotiate_stime` | Date |
| 98 | `notes` | 备注 | `notes` | String |
| 99 | `other` | 其他 | `other` | String |
| 100 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 101 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 102 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 103 | `payMode` | 付款方式 | `pay_mode` | String |
| 104 | `payTime` | 付款成功时间 | `pay_time` | Date |
| 105 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 106 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 107 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 108 | `paymentType` | 投保人缴纳方式 | `payment_type` | String |
| 109 | `poundTotal` | 英镑总价 | `pound_total` | Decimal |
| 110 | `preBidFileTemplateId` | 资格预审文件模板 | `prebid_file_template_id` | Long |
| 111 | `preSignStatus` | 预审签到状态 | `pre_sign_status` | Integer |
| 112 | `preSignTime` | 预审签到时间 | `pre_sign_time` | Date |
| 113 | `preSignerId` | 预审签到人 | `pre_signer_id` | Long |
| 114 | `preSignerName` | 预审签到人姓名 | `pre_signer_name` | String |
| 115 | `preqDocSubmitEnd` | 资格预审响应文件递交截止时间 | `preq_doc_submit_end` | Date |
| 116 | `preqOpenPlace` | 资格预审开标地点 | `preq_open_place` | String |
| 117 | `preqOpenTime` | 资格预审开标时间 | `preq_open_time` | Date |
| 118 | `preqSubmitTime` | 预审投标提交时间 | `preq_submit_time` | Date |
| 119 | `priceOpenType` | 价格开启方式 | `price_open_type` | String |
| 120 | `priceType` | 报价方式 | `price_type` | String |
| 121 | `producerFlag` | 产地 | `producer_flag` | Integer |
| 122 | `pubts` | 时间戳 | `pubts` | DateTime |
| 123 | `purEnterpriseId` | 采购方租户 | `pur_enterprise_id` | Long |
| 124 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 125 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 126 | `purchaseType` | 采购类别 | `purchase_type` | String |
| 127 | `qualifyCheckStep` | 资格审核当前流程阶段 | `qualify_check_step` | Integer |
| 128 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 129 | `qualifyFileId` | 资格预审文件 | `qualify_file_id` | Long |
| 130 | `quotationRate` | 报价响应率 | `quotation_rate` | Decimal |
| 131 | `quoteScope` | 报价范围 | `quote_scope` | Integer |
| 132 | `rate` | 税率 | `rate` | Decimal |
| 133 | `reason` | 淘汰理由 | `reason` | String |
| 134 | `referncePrice` | 参考报价(上一轮报价) | `refernce_price` | Decimal |
| 135 | `round` | 谈判轮次 | `round` | Integer |
| 136 | `roundState` | 最新谈判轮次状态 | `round_state` | Integer |
| 137 | `secretStatus` | 加密状态 | `secret_status` | Integer |
| 138 | `security` | 投标一览表 | `security` | String |
| 139 | `signStatus` | 签到状态 | `sign_status` | Integer |
| 140 | `signTime` | 签到时间 | `sign_time` | Date |
| 141 | `signerId` | 签到人 | `signer_id` | Long |
| 142 | `signerName` | 签到人姓名 | `signer_name` | String |
| 143 | `singleFlag` | 单重 | `single_flag` | Integer |
| 144 | `statement` | 投标声明 | `statement` | String |
| 145 | `submitStatus` | 文件提交状态 | `submit_status` | Integer |
| 146 | `submitTime` | 投标提交时间 | `submit_time` | Date |
| 147 | `sumPrice` | 总报价 | `sum_price` | Decimal |
| 148 | `supBuyTime` | 供应商购买标书时间 | `sup_buy_time` | Date |
| 149 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 150 | `supOther` | 供应商其他 | `sup_other` | String |
| 151 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 152 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 153 | `supplyClassName` | 供应分类名称 | `supply_class_name` | String |
| 154 | `supplyCode` | 供应商9s编码 | `supply_code` | String |
| 155 | `supplydocId` | 供应商档案 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 156 | `taxBidTotalLow` | 含税投标总价小写 | `tax_bid_total_low` | Decimal |
| 157 | `taxBidTotalSecret` | 含税投标总价加密 | `tax_bid_total_secret` | String |
| 158 | `taxBidTotalUp` | 含税投标总价大写 | `tax_bid_total_up` | String |
| 159 | `taxSumPrice` | 含税总报价 | `tax_sum_price` | Decimal |
| 160 | `techDemand` | 技术质量要求 | `tech_demand` | String |
| 161 | `techleader` | 技术负责人 | `techleader` | String |
| 162 | `technical` | 技术指标 | `technical` | String |
| 163 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 164 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 165 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 166 | `totalBidCount` | 总报价数量 | `total_bid_count` | Decimal |
| 167 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 168 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 169 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 170 | `winStatus` | 中标状态 | `win_status` | Integer |
| 171 | `workDuration` | 工期 | `work_duration` | String |
| 172 | `yenTotal` | 日元总价 | `yen_total` | Decimal |
| 173 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidSubjectId` | 投标项目主表 | `auction.bidinvitation.BidSubjectVO` | None | true |
| 2 | `invitationVO` | 投标标段关系 | `auction.bidinvitation.SubjectInvitationVO` | None | true |
| 3 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 4 | `supplydocId` | 供应商档案 | `aa.vendor.Vendor` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `bidBondId` | 保证金 | `auction.biddingbond.BiddingBondInfoVO` | None |  |
| 7 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 8 | `bidProjectId` | 采购项目id | `auction.project.AuctionProject` | None |  |
| 9 | `agencyOrgId` | 招标代理机构组织 | `org.func.BaseOrg` | Service |  |
| 10 | `bidSectionId` | 标段包id | `auction.project.AuctionSection` | None |  |
