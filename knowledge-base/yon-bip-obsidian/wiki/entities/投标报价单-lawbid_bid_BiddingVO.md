---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "lawbid.bid.BiddingVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 投标报价单 (`lawbid.bid.BiddingVO`)

> **平台版本：BIP 旗舰版 V5**

> ycBusinessCenter 模块 | 物理表：`cpu_bidding`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标报价单 |
| 物理表 | `cpu_bidding` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 19:56:27.1240` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2026-05-22 23:55:18:000

## 依赖接口（7个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 供应商投标单公共接口 | `bid.itf.IBidding` | 965 |
| 2 | 采购模板-领域扩展字段 | `tpl.itf.TplId` | 53 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 5 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 6 | 跨租户供应商租户接口 | `cpu.itf.IVendorTenant` | 14 |
| 7 | 审计信息 | `base.itf.IAuditInfo` | 340 |

---

## 直接属性（199个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidSubjectId` | 投标标段id | `bid_subject_id` | Long |
| 2 | `biddingAddType` | 投标添加方式 | `bidding_add_type` | Short |
| 3 | `biddingVODefineCharacter` | 投标报价表头自定义项 | `define_character_id` | ea6ca602-eb49-4296-bd96-d44fbd9c5ce1 |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `isLatest` | 是否最新阶段 | `is_latest` | Boolean |
| 6 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 8 | `enterpriseId` | 供应商租户ID | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 9 | `templateId` | 模板ID | `template_id` | 9846efd9-caa6-4b42-a848-477a09a83b44 |
| 10 | `enterpriseName` | 供应商租户名 | `enterprise_name` | String |
| 11 | `billTemplateId` | 采购模板ID | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 |
| 12 | `bidProjectId` | 采购项目ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 13 | `bidBondId` | 标段(包)编码 | `bid_bond_id` | 386b1d93-ca72-438f-af23-21dc87611046 |
| 14 | `bidProjectCode` | 采购项目编码 | `bid_project_code` | String |
| 15 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 16 | `id` | ID | `id` | Long |
| 17 | `bidSectionId` | 标段(包)ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 18 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 19 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 20 | `status` | 投标状态 | `status` | Integer |
| 21 | `bidDeadline` | 投标截止时间 | `bid_deadline` | Date |
| 22 | `bidType` | 采购方式 | `bid_type` | String |
| 23 | `encodeRandomKey` | 随机秘钥密文 | `encode_random_key` | String |
| 24 | `decryptState` | 解密状态 | `decrypt_state` | String |
| 25 | `processorId` | 处理人ID | `processor_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 26 | `processTime` | 处理时间 | `process_time` | DateTime |
| 27 | `processor` | 处理人 | `processor` | String |
| 28 | `abandonBidding` | 放弃投标原因 | `abandon_bidding` | String |
| 29 | `createTime` | 创建时间 | `create_time` | DateTime |
| 30 | `createDate` | 创建日期 | `create_date` | Date |
| 31 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 32 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 33 | `creator` | 创建人名称 | `creator` | String |
| 34 | `modifier` | 修改人名称 | `modifier` | String |
| 35 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 36 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 37 | `signStatus` | 签到状态 | `sign_status` | Integer |
| 38 | `signTime` | 签到时间 | `sign_time` | Date |
| 39 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 40 | `earnestType` | 保证金缴纳状态 | `earnest_type` | Integer |
| 41 | `negotiateEndTime` | 谈判回复截止时间 | `negotiate_end_time` | Date |
| 42 | `biddingStartTime` | 竞价开始时间 | `bidding_start_time` | Date |
| 43 | `biddingType` | 竞价方式 | `bidding_type` | Integer |
| 44 | `winStatus` | 中标状态 | `win_status` | Integer |
| 45 | `notes` | 备注 | `notes` | String |
| 46 | `payMode` | 付款方式 | `pay_mode` | String |
| 47 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 48 | `bidOpenTime` | 开标时间 | `bid_open_time` | Date |
| 49 | `bidOpenPlaceType` | 开标地点类型 | `bid_open_place_type` | String |
| 50 | `bidOpenPlace` | 开标地点 | `bid_open_place` | String |
| 51 | `bidFileId` | 招标文件ID | `bid_file_id` | Long |
| 52 | `bidFileName` | 招标文件 | `bid_file_name` | String |
| 53 | `submitStatus` | 文件提交状态 | `submit_status` | Integer |
| 54 | `secretStatus` | 加密状态 | `secret_status` | Integer |
| 55 | `bidClearFile` | 澄清文件 | `bid_clear_file` | String |
| 56 | `qualifyFileId` | 资格预审文件ID | `qualify_file_id` | Long |
| 57 | `bidEnsureMoney` | 投标保证金 | `bid_ensure_money` | Decimal |
| 58 | `consignationId` | 委托单ID | `consignation_id` | String |
| 59 | `consignationNo` | 委托单号 | `consignation_no` | String |
| 60 | `conversionBidTotalLow` | 换算后投标总价 | `conversion_bid_total_low` | Decimal |
| 61 | `consignationName` | 委托名称 | `consignation_name` | String |
| 62 | `purchaseType` | 采购类别 | `purchase_type` | String |
| 63 | `conversionTaxBidTotalLow` | 换算后含税投标总价 | `conversion_tax_bid_total_low` | Decimal |
| 64 | `bidQuotationMethod` | 报价方式 | `bid_quotation_method` | String |
| 65 | `bidQuotationCurrency` | 报价币种 | `bid_quotation_currency` | String |
| 66 | `bidTotalLow` | 投标总价小写 | `bid_total_low` | Decimal |
| 67 | `bidTotalUp` | 投标总价大写 | `bid_total_up` | String |
| 68 | `purEnterpriseId` | 采购方租户ID | `pur_enterprise_id` | Long |
| 69 | `buyerName` | 采购员姓名 | `buyer_name` | String |
| 70 | `buyerTel` | 采购员电话 | `buyer_tel` | String |
| 71 | `buyerEmail` | 采购员邮箱 | `buyer_email` | String |
| 72 | `buyerFax` | 采购员传真 | `buyer_fax` | String |
| 73 | `linkman` | 联系人 | `linkman` | String |
| 74 | `linkmanUserId` | 联系人id | `linkman_user_id` | String |
| 75 | `linkmanTel` | 联系方式 | `linkman_tel` | String |
| 76 | `linkmanMail` | 联系人邮箱 | `linkman_mail` | String |
| 77 | `linkmanFax` | 联系人传真 | `linkman_fax` | String |
| 78 | `signerId` | 签到人ID | `signer_id` | Long |
| 79 | `signerName` | 签到人姓名 | `signer_name` | String |
| 80 | `qualifyCheckStep` | 资格审核当前流程阶段 0代表预审阶段 1代表后审阶段 | `qualify_check_step` | Integer |
| 81 | `pubts` | 时间戳 | `pubts` | DateTime |
| 82 | `supplydocId` | 供应商档案ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 83 | `workDuration` | 工期 | `work_duration` | String |
| 84 | `fileSubmitTime` | 文件提交时间 | `file_submit_time` | Date |
| 85 | `agencyOrgId` | 招标代理机构组织ID | `agency_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 86 | `agencyOrgName` | 招标代理机构组织名称 | `agency_org_name` | String |
| 87 | `evaluationStatus` | 评标阶段的投标人状态,1默认,2否决(不可评标) | `evaluation_status` | Integer |
| 88 | `preqDocSubmitEnd` | 资格预审响应文件递交截止时间 | `preq_doc_submit_end` | Date |
| 89 | `preqOpenTime` | 资格预审开标时间 | `preq_open_time` | Date |
| 90 | `preqOpenPlace` | 资格预审开标地点 | `preq_open_place` | String |
| 91 | `round` | 谈判轮次 | `round` | Integer |
| 92 | `roundState` | 最新谈判轮次状态 | `round_state` | Integer |
| 93 | `combination` | 是否是组合标 | `combination` | Integer |
| 94 | `rate` | 税率 | `rate` | Decimal |
| 95 | `quotationRate` | 报价响应率 | `quotation_rate` | Decimal |
| 96 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 97 | `lawBid` | 法定招标 | `law_bid` | Integer |
| 98 | `alternativeBidSolution` | 是否允许递交备选投标方案 | `alternative_bid_solution` | Integer |
| 99 | `priceType` | 报价方式 含税 不含税 | `price_type` | String |
| 100 | `preSignStatus` | 预审签到状态 | `pre_sign_status` | Integer |
| 101 | `preSignTime` | 预审签到时间 | `pre_sign_time` | Date |
| 102 | `preSignerName` | 预审签到人姓名 | `pre_signer_name` | String |
| 103 | `preSignerId` | 预审签到人id | `pre_signer_id` | Long |
| 104 | `negotiateName` | 谈判标题 | `negotiate_name` | String |
| 105 | `negotiateStime` | 谈判开始时间 | `negotiate_stime` | Date |
| 106 | `negotiateEtime` | 谈判结束时间 | `negotiate_etime` | Date |
| 107 | `referncePrice` | 参考报价(上一轮报价) | `refernce_price` | Decimal |
| 108 | `negotiateState` | 是否最后一轮谈判默认为0 | `negotiate_state` | Integer |
| 109 | `quoteScope` | 报价范围 | `quote_scope` | Integer |
| 110 | `bidFileTemplateId` | 标书模板id | `bid_file_template_id` | Long |
| 111 | `supplyCode` | 供应商9s编码 | `supply_code` | String |
| 112 | `bidPreScoreTemplateId` | 预审评分模板id | `bidpre_score_template_id` | Long |
| 113 | `bidScoreTemplateId` | 后审评分模板id | `bid_score_template_id` | Long |
| 114 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 115 | `techDemand` | 技术质量要求 | `tech_demand` | String |
| 116 | `bizDemand` | 商务要求 | `biz_demand` | String |
| 117 | `bidTotalSecret` | 总价加密 | `bid_total_secret` | String |
| 118 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 119 | `technical` | 技术指标 | `technical` | String |
| 120 | `other` | 其他 | `other` | String |
| 121 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 122 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 123 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 124 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 125 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 126 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 127 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 128 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 129 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 130 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 131 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 132 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 133 | `manager` | 项目经理 | `manager` | String |
| 134 | `techleader` | 技术负责人 | `techleader` | String |
| 135 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 136 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 137 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 138 | `supOther` | 供应商其他 | `sup_other` | String |
| 139 | `ingredientFlag` | 材质(0否 1 是) | `ingredient_flag` | Integer |
| 140 | `singleFlag` | 单重(0否 1 是) | `single_flag` | Integer |
| 141 | `producerFlag` | 产地(0否 1 是) | `producer_flag` | Integer |
| 142 | `manufacturerFlag` | 制造商(0否 1 是) | `manufacturer_flag` | Integer |
| 143 | `lifetimeFlag` | 寿命(0否 1 是) | `lifetime_flag` | Integer |
| 144 | `reason` | 淘汰理由 | `reason` | String |
| 145 | `supplyClassName` | 供应分类名称 | `supply_class_name` | String |
| 146 | `decryptTime` | 文件解密时间 | `decrypt_time` | Date |
| 147 | `preBidFileTemplateId` | 资格预审文件模板id | `prebid_file_template_id` | Long |
| 148 | `ipMac` | ip | `ip_mac` | String |
| 149 | `dollarTotal` | 美元总价 | `dollar_total` | Decimal |
| 150 | `yenTotal` | 日元总价 | `yen_total` | Decimal |
| 151 | `euroTotal` | 欧元总价 | `euro_total` | Decimal |
| 152 | `poundTotal` | 英镑总价 | `pound_total` | Decimal |
| 153 | `earnestReturn` | 退保证金状态 | `earnest_return` | Integer |
| 154 | `isSecret` | 附件是否加密0否1是 | `is_secret` | Integer |
| 155 | `invitation` | 邀请标识1邀请 默认0 | `invitation` | Integer |
| 156 | `eliminate` | 淘汰环节 | `eliminate` | Long |
| 157 | `supBuyTime` | 供应商购买标书时间 | `sup_buy_time` | Date |
| 158 | `payTime` | 付款成功时间 | `pay_time` | Date |
| 159 | `submitTime` | 投标提交时间 | `submit_time` | Date |
| 160 | `preqSubmitTime` | 预审投标提交时间 | `preq_submit_time` | Date |
| 161 | `statement` | 投标声明 | `statement` | String |
| 162 | `security` | 投标一览表 | `security` | String |
| 163 | `priceOpenType` | 价格开启方式 | `price_open_type` | String |
| 164 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 165 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 166 | `itemsCount` | 总报价项数 | `items_count` | Integer |
| 167 | `totalBidCount` | 总报价数量 | `total_bid_count` | Decimal |
| 168 | `sumPrice` | 总报价 | `sum_price` | Decimal |
| 169 | `marginAmount` | 保证金金额 | `margin_amount` | Decimal |
| 170 | `paymentType` | 投保人缴纳方式 | `payment_type` | String |
| 171 | `marginStatus` | 保证金递交状态 | `margin_status` | String |
| 172 | `hasEncrypt` | 文件是否加密 | `has_encrypt` | Boolean |
| 173 | `encryptFileTime` | 文件加密时间 | `encrypt_file_time` | Date |
| 174 | `decryptFileTime` | 文件解密时间 | `decrypt_file_time` | Date |
| 175 | `bidBillType` | 招标单据类型 | `bid_bill_type` | String |
| 176 | `highestPrice` | 最高限价合计 | `highest_price` | Decimal |
| 177 | `addressMac` | mac地址 | `address_mac` | String |
| 178 | `taxBidTotalLow` | 含税投标总价小写 | `tax_bid_total_low` | Decimal |
| 179 | `taxBidTotalUp` | 含税投标总价大写 | `tax_bid_total_up` | String |
| 180 | `taxBidTotalSecret` | 含税投标总价加密 | `tax_bid_total_secret` | String |
| 181 | `taxSumPrice` | 含税总报价 | `tax_sum_price` | Decimal |
| 182 | `encryptFileVersion` | 文件加解密版本 | `encrypt_file_version` | String |
| 183 | `multipleStageBid` | 是否两阶段 | `multiple_stage_bid` | Boolean |
| 184 | `currentStageReviewType` | 当前阶段类型 | `current_stage_review_type` | String |
| 185 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 186 | `buyerTenant` | 采购商租户ID | `buyer_tenant_id` | String |
| 187 | `transactionTypeId` | 交易类型ID | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 188 | `encryptInfoKey` | 供应商投标报价总价CA加密密钥密文 | `encrypt_info_key` | String |
| 189 | `encryptInfo` | 结构化加密密文 | `encrypt_info` | String |
| 190 | `encryMode` | 加密方式 | `encry_mode` | String |
| 191 | `cpu` | 投标报价计算机CPU型号 | `cpu` | String |
| 192 | `mac` | 投标报价计算机MAC地址 | `mac` | String |
| 193 | `disk` | 投标报价计算机硬盘序列号 | `disk` | String |
| 194 | `loginuser` | 投标报价计算机登录用户名 | `loginuser` | String |
| 195 | `computername` | 投标报价计算机名称 | `computername` | String |
| 196 | `bidderDetails` | 投标报价单物料 | `` | 102df149-dc26-44a9-8fbe-02be312d8a34 |
| 197 | `biddingFiles` | 投标报价单文件 | `` | c34e59a4-7ae6-4e36-b7c8-067739bcce44 |
| 198 | `defines` | 供应商投标单自定义项表 | `` | 9160d616-70a6-4d68-a0e0-33bafea7b800 |
| 199 | `invitationVO` | 供应商标段关系 | `` | dafa9612-abba-4574-a497-3edf69966ab2 |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billTemplateId` | 采购模板ID | `tpl.templateinst.TplBillTemplateInst` | Service |  |
| 2 | `transactionTypeId` | 交易类型ID | `bd.bill.TransType` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `biddingVODefineCharacter` | 投标报价表头自定义项 | `lawbid.bid.BiddingVODefineCharacter` | None |  |
| 7 | `templateId` | 模板ID | `tpl.templateorginst.TplTemplateInst` | Service |  |
| 8 | `bidderDetails` | 投标报价单物料 | `lawbid.bid.BiddingMaterialDetailVO` | None | true |
| 9 | `bidProjectId` | 采购项目ID | `lawbid.project.LawbidProject` | None |  |
| 10 | `biddingFiles` | 投标报价单文件 | `lawbid.bid.BiddingFileVO` | None | true |
| 11 | `defines` | 供应商投标单自定义项表 | `lawbid.bid.BiddingFreeDefine` | None | true |
| 12 | `invitationVO` | 供应商标段关系 | `lawbid.bid.InvitationVO` | None | true |
| 13 | `processorId` | 处理人ID | `base.user.BipUser` | Service |  |
| 14 | `supplydocId` | 供应商档案ID | `aa.vendor.Vendor` | Service |  |
| 15 | `bidBondId` | 标段(包)编码 | `lawbid.biddingbond.BiddingBondInfoVO` | None |  |
| 16 | `enterpriseId` | 供应商租户ID | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 17 | `agencyOrgId` | 招标代理机构组织ID | `org.func.BaseOrg` | Service |  |
| 18 | `bidSectionId` | 标段(包)ID | `lawbid.section.LawbidSection` | None |  |
