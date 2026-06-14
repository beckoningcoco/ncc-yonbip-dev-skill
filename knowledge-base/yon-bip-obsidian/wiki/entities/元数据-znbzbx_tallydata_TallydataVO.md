---
tags: [BIP, 元数据, 数据字典, znbzbx.tallydata.TallydataVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 个人账单主表 (`znbzbx.tallydata.TallydataVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_tallydata` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`e5dde999-6f8d-49e0-9053-e7e1fa343ca1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 个人账单主表 |
| 物理表 | `znbz_tallydata` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 340 个 |
| 子表 | 6 个 |
| 关联引用 | 30 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `tallydatataxdeductvos` | `znbzbx.tallydata.TallydataTaxDeductVO` | composition |
| `tallydatataxbvos` | `znbzbx.tallydata.TallydataTaxBVO` | composition |
| `tallydatabusbvos` | `znbzbx.tallydata.TallydataBusBVO` | composition |
| `tallydatatransrecords` | `znbzbx.tallydata.TallyTransRecordVO` | composition |
| `tallydataextvos` | `znbzbx.tallydata.TallydataExtVO` | composition |
| `tallydataamountbvos` | `znbzbx.tallydata.TallydataAmountBVO` | composition |

## 关联引用 (30个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `pk_invoicetype` | `` |
| `pk_consumekind` | `znbzbx_consumekindref` |
| `creatorId` | `` |
| `vtransferid` | `` |
| `pk_cusdoc` | `` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `expbillbustype` | `` |
| `pk_expensebill` | `` |
| `cfinaceorg` | `` |
| `pk_checkman` | `` |
| `pk_expenserecord` | `znbzbx_expenserecordref` |
| `voperatorid` | `` |
| `pk_costaddr` | `ucfbasedoc.bd_countryaddbuttonref` |
| `pk_seatgrade` | `znbzbx_seatgraderef` |
| `tenant_id` | `` |
| `vcountryId` | `` |
| `vreceiverid` | `` |
| `pk_startaddr` | `ucfbasedoc.bd_countryaddbuttonref` |
| `ytenant_id` | `` |
| `vctrlddeptid` | `` |
| `tallydataDcs` | `` |
| `pk_memoapply` | `` |
| `pk_costpsndoc` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (3个, 10字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 340 个直连字段

### 文本字段 (163个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `account` | `account` | `account` | 收入科目 |
| `applyOrgNo` | `applyOrgNo` | `applyOrgNo` | 申请单位编号 |
| `budgetaryLevels` | `budgetaryLevels` | `budgetaryLevels` | 预算级次 |
| `cargoOwner` | `cargoOwner` | `cargoOwner` | 货主单位 |
| `contractNo` | `contractNo` | `contractNo` | 合同(批文) |
| `customsName` | `customsName` | `customsName` | 填制单位 |
| `customsNo` | `customsNo` | `customsNo` | 报关单编号 |
| `ladingNo` | `ladingNo` | `ladingNo` | 提/装货单号 |
| `operationEntity` | `operationEntity` | `operationEntity` | 经营单位 |
| `payerPartyCode` | `payerPartyCode` | `payerPartyCode` | 交款人统一社会信用代码 |
| `payerPartyName` | `payerPartyName` | `payerPartyName` | 交款人 |
| `paymentPeriod` | `paymentPeriod` | `paymentPeriod` | 缴款期限 |
| `revenueBank` | `revenueBank` | `revenueBank` | 收款国库(银行) |
| `revenueOrg` | `revenueOrg` | `revenueOrg` | 收入机关 |
| `revenueTreasury` | `revenueTreasury` | `revenueTreasury` | 收款国库 |
| `transportNo` | `transportNo` | `transportNo` | 运输工具(号) |
| `vinvoicetypename` | `vinvoicetypename` | `vinvoicetypename` | 账单类型 |
| `vpicturefileid` | `vpicturefileid` | `vpicturefileid` | 协同文件ID |
| `attachs` | `attachs` | `attachs` | OFD文件id |
| `filename` | `filename` | `filename` | 发票文件名 |
| `costaddr_backup` | `costaddr_backup` | `costaddr_backup` | 发生地备注 |
| `matchedzipfileid` | `matchedzipfileid` | `matchedzipfileid` | pdf匹配上的zip文件ID |
| `matchedzipfileattachs` | `matchedzipfileattachs` | `matchedzipfileattachs` | pdf匹配上的zip文件附件 |
| `matchedmainfileid1` | `matchedmainfileid1` | `matchedmainfileid1` | 和主文件结构化信息一致的fileid1 |
| `matchedmainfileattachs1` | `matchedmainfileattachs1` | `matchedmainfileattachs1` | 和主文件结构化信息一致的fileattachs1 |
| `matchedmainfileid2` | `matchedmainfileid2` | `matchedmainfileid2` | 和主文件结构化信息一致的fileid2 |
| `matchedmainfileattachs2` | `matchedmainfileattachs2` | `matchedmainfileattachs2` | 和主文件结构化信息一致的fileattachs2 |
| `matchedmainfileid3` | `matchedmainfileid3` | `matchedmainfileid3` | 和主文件结构化信息一致的fileid3 |
| `refundmark` | `refundmark` | `refundmark` | 退票标识 |
| `vinvoicetype` | `vinvoicetype` | `vinvoicetype` | ocr发票类型 |
| `taxcheckfaileinfo` | `taxcheckfaileinfo` | `taxcheckfaileinfo` | 税务校验不通过规则 |
| `memoapply_no` | `memoapply_no` | `memoapply_no` | 申请单编号 |
| `invoice_order_no` | `invoice_order_no` | `invoice_order_no` | 发票/订单号 |
| `associates` | `associates` | `associates` | 联系人 |
| `associates_phone` | `associates_phone` | `associates_phone` | 联系人电话 |
| `diner` | `diner` | `diner` | 用餐人 |
| `diner_num` | `diner_num` | `diner_num` | 用餐人数 |
| `restaurant_name` | `restaurant_name` | `restaurant_name` | 餐厅名称 |
| `pk_invoicewallet` | `pk_invoicewallet` | `pk_invoicewallet` | 票袋pk |
| `vimageid` | `vimageid` | `vimageid` | PDF/OFD解析接口返回值 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `vinvoicetypecode` | `vinvoicetypecode` | `vinvoicetypecode` | 发票类型编码 |
| `vinvoicecode` | `vinvoicecode` | `vinvoicecode` | 发票代码 |
| `vinvoiceno` | `vinvoiceno` | `vinvoiceno` | 发票号码 |
| `vinvoicecheckno` | `vinvoicecheckno` | `vinvoicecheckno` | 发票校验码 |
| `vstartcity` | `vstartcity` | `vstartcity` | 出发城市 |
| `vstartaddr` | `vstartaddr` | `vstartaddr` | 出发地 |
| `vdestcity` | `vdestcity` | `vdestcity` | 到达城市 |
| `vdestaddr` | `vdestaddr` | `vdestaddr` | 目的地 |
| `vtrainnum` | `vtrainnum` | `vtrainnum` | 车次 |
| `vseatlevel` | `vseatlevel` | `vseatlevel` | 座位等级名称 |
| `vcustname` | `vcustname` | `vcustname` | 客商名称 |
| `vcusttaxid` | `vcusttaxid` | `vcusttaxid` | 销售方纳税人识别号 |
| `vbuyname` | `vbuyname` | `vbuyname` | 购买方名称 |
| `vbuytaxid` | `vbuytaxid` | `vbuytaxid` | 购买方纳税人识别号 |
| `vpicturepath` | `vpicturepath` | `vpicturepath` | 图片 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `nodecode` | `nodecode` | `nodecode` | 节点号 |
| `vinvoiceplace` | `vinvoiceplace` | `vinvoiceplace` | 发票所在地 |
| `vname` | `vname` | `vname` | 乘车人 |
| `vregion` | `vregion` | `vregion` | 发票区域 |
| `votherregion` | `votherregion` | `votherregion` | 其他发票区域 |
| `vimgsize` | `vimgsize` | `vimgsize` | 图片宽高 |
| `vreviseinfo` | `vreviseinfo` | `vreviseinfo` | 修订说明 |
| `vsourcesystemid` | `vsourcesystemid` | `vsourcesystemid` | 来源系统id |
| `vbitischanneltype` | `vbitischanneltype` | `vbitischanneltype` | 商旅订单渠道 |
| `vbitisordertype` | `vbitisordertype` | `vbitisordertype` | 商旅订单类型 |
| `vparentsourcesysid` | `vparentsourcesysid` | `vparentsourcesysid` | 来源系统父订单id |
| `vpaytype` | `vpaytype` | `vpaytype` | 支付类型 |
| `vduration` | `vduration` | `vduration` | 时长 |
| `vdiscount` | `vdiscount` | `vdiscount` | 折扣 |
| `vdomc` | `vdomc` | `vdomc` | 国内国际类型 |
| `vpremiumreason` | `vpremiumreason` | `vpremiumreason` | 溢价原因 |
| `vstarts` | `vstarts` | `vstarts` | 酒店星级 |
| `vroomtype` | `vroomtype` | `vroomtype` | 房型 |
| `vcarriage` | `vcarriage` | `vcarriage` | 车厢 |
| `vtrainseat` | `vtrainseat` | `vtrainseat` | 座位号 |
| `vlinkerphone` | `vlinkerphone` | `vlinkerphone` | 预订人电话 |
| `vpassengerphone` | `vpassengerphone` | `vpassengerphone` | 乘坐人电话 |
| `vflighttrainnum` | `vflighttrainnum` | `vflighttrainnum` | 接送航班号 |
| `vusecarsrv` | `vusecarsrv` | `vusecarsrv` | 车型 |
| `vqrcode` | `vqrcode` | `vqrcode` | 发票二维码 |
| `vhintmsg` | `vhintmsg` | `vhintmsg` | 提示信息 |
| `vinvoiceuuid` | `vinvoiceuuid` | `vinvoiceuuid` | 发票唯一标识 |
| `vsettleno` | `vsettleno` | `vsettleno` | 结算号 |
| `vflightnum` | `vflightnum` | `vflightnum` | 航段数 |
| `vrefundno` | `vrefundno` | `vrefundno` | 退票标识 |
| `vnewinvoiceno` | `vnewinvoiceno` | `vnewinvoiceno` | 新票号 |
| `vreserveunit` | `vreserveunit` | `vreserveunit` | 订票单位 |
| `vreducememo` | `vreducememo` | `vreducememo` | 扣减原因 |
| `path` | `path` | `path` | 发票图片路径 |
| `vprintnumber` | `vprintnumber` | `vprintnumber` | 印刷序号 |
| `vmachinenumber` | `vmachinenumber` | `vmachinenumber` | 机打号码 |
| `vmachinecode` | `vmachinecode` | `vmachinecode` | 机打代码 |
| `vcity` | `vcity` | `vcity` | 市 |
| `vprovince` | `vprovince` | `vprovince` | 省份 |
| `vtaxauthorities` | `vtaxauthorities` | `vtaxauthorities` | 主管税务机关 |
| `vtaxauthoritiescode` | `vtaxauthoritiescode` | `vtaxauthoritiescode` | 主管税务机关代码 |
| `vcertificatenumber` | `vcertificatenumber` | `vcertificatenumber` | 合格证号 |
| `vcarcode` | `vcarcode` | `vcarcode` | 车架号 |
| `vcarenginecode` | `vcarenginecode` | `vcarenginecode` | 发动机号码 |
| `vcarmodel` | `vcarmodel` | `vcarmodel` | 厂牌型号 |
| `vlicenseplate` | `vlicenseplate` | `vlicenseplate` | 车牌号 |
| `vcompany_name` | `vcompany_name` | `vcompany_name` | 二手车市场 |
| `vcompany_tax_id` | `vcompany_tax_id` | `vcompany_tax_id` | 二手车市场纳税人识别号 |
| `vregistration_number` | `vregistration_number` | `vregistration_number` | 登记证号 |
| `vgetontime` | `vgetontime` | `vgetontime` | 上车时间 |
| `vgetofftime` | `vgetofftime` | `vgetofftime` | 下车时间 |
| `daccountperiod` | `daccountperiod` | `daccountperiod` | 会计期间 |
| `vissueby` | `vissueby` | `vissueby` | 填开单位 |
| `vagentcode` | `vagentcode` | `vagentcode` | 销售单位代号 |
| `vcardtype` | `vcardtype` | `vcardtype` | 乘客证件类型 |
| `vuserid` | `vuserid` | `vuserid` | 身份证号 |
| `vserialnumber` | `vserialnumber` | `vserialnumber` | 火车票序列号 |
| `vstampinfo` | `vstampinfo` | `vstampinfo` | 印章信息 |
| `vstampcustname` | `vstampcustname` | `vstampcustname` | 印章销售方名称 |
| `vstampcusttaxid` | `vstampcusttaxid` | `vstampcusttaxid` | 印章销售方纳税人识别号 |
| `vbuyer_addr_tel` | `vbuyer_addr_tel` | `vbuyer_addr_tel` | 购买方地址电话 |
| `vbuyer_bank_account` | `vbuyer_bank_account` | `vbuyer_bank_account` | 购买方开户行帐号 |
| `vseller_addr_tel` | `vseller_addr_tel` | `vseller_addr_tel` | 销售方地址电话 |
| `vseller_bank_account` | `vseller_bank_account` | `vseller_bank_account` | 销售方开户行帐号 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `openid` | `openid` | `openid` | 用户openid |
| `cardid` | `cardid` | `cardid` | 发票卡券的card_id |
| `encrypt_code` | `encrypt_code` | `encrypt_code` | 发票卡券的加密code |
| `alipay_invoice_token` | `alipay_invoice_token` | `alipay_invoice_token` | 支付宝token |
| `alipay_user_id` | `alipay_user_id` | `alipay_user_id` | 支付宝用户 |
| `vattachmentass` | `vattachmentass` | `vattachmentass` | 单据附件id |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `receiptnumber` | `receiptnumber` | `receiptnumber` | 行程单号码 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `vdef6` | `vdef6` | `vdef6` | 自定义项6 |
| `vdef7` | `vdef7` | `vdef7` | 自定义项7 |
| `vdef8` | `vdef8` | `vdef8` | 自定义项8 |
| `vdef9` | `vdef9` | `vdef9` | 自定义项9 |
| `vdef10` | `vdef10` | `vdef10` | 自定义项10 |
| `GPNO` | `GPNO` | `GPNO` | GP单号 |
| `buyer_company_register` | `buyer_company_register` | `buyer_company_register` | 购买方公司注册号 |
| `carrier` | `carrier` | `carrier` | 承运人 |
| `check_hint_message` | `check_hint_message` | `check_hint_message` | 校验提示信息 |
| `countryCode` | `countryCode` | `countryCode` | 国家编码 |
| `eInvoiceNo` | `eInvoiceNo` | `eInvoiceNo` | 数电票号 |
| `gender` | `gender` | `gender` | 性别 |
| `inpatient_department` | `inpatient_department` | `inpatient_department` | 住院科别 |
| `inpatient_number` | `inpatient_number` | `inpatient_number` | 住院号 |
| `invoiceGroupId` | `invoiceGroupId` | `invoiceGroupId` | 账单关联关系 |
| `invoiceThirdId` | `invoiceThirdId` | `invoiceThirdId` | 费控税务交互标识 |
| `invoice_number` | `invoice_number` | `invoice_number` | 发票编码 |
| `medical_institution_type` | `medical_institution_type` | `medical_institution_type` | 医疗机构类型 |
| `medical_insurance_number` | `medical_insurance_number` | `medical_insurance_number` | 医保编号 |
| `medical_insurance_type` | `medical_insurance_type` | `medical_insurance_type` | 医保类型 |
| `medical_record_number` | `medical_record_number` | `medical_record_number` | 病历号 |
| `original_invoiceno` | `original_invoiceno` | `original_invoiceno` | 原税票发票号码 |
| `outpatient_number` | `outpatient_number` | `outpatient_number` | 门诊号 |
| `project_name` | `project_name` | `project_name` | 项目名称 |
| `restaurant_name_all` | `restaurant_name_all` | `restaurant_name_all` | 餐厅名称（全） |
| `seller_company_register` | `seller_company_register` | `seller_company_register` | 销售方公司注册号 |
| `tspz` | `tspz` | `tspz` | 特殊标识 |
| `vallguests` | `vallguests` | `vallguests` | 所有入住人 |

### 引用字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vreceiverid` | `vreceiverid` | `vreceiverid` | 账单接收人 |
| `vtransferid` | `vtransferid` | `vtransferid` | 账单转出人 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 财务组织 |
| `expbillbustype` | `expbillbustype` | `expbillbustype` | 报销单交易类型 |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 渠道 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `creatorId` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 修改人id |
| `pk_expenserecord` | `pk_expenserecord` | `pk_expenserecord` | 记事表头 |
| `pk_memoapply` | `pk_memoapply` | `pk_memoapply` | 出差申请表头 |
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 报销单表头 |
| `pk_invoicetype` | `pk_invoicetype` | `pk_invoicetype` | 发票类型pk |
| `pk_consumekind` | `pk_consumekind` | `pk_consumekind` | 发票消费类型 |
| `pk_startaddr` | `pk_startaddr` | `pk_startaddr` | 出发地pk |
| `pk_costaddr` | `pk_costaddr` | `pk_costaddr` | 发生地点 |
| `pk_seatgrade` | `pk_seatgrade` | `pk_seatgrade` | 座位等级 |
| `pk_costpsndoc` | `pk_costpsndoc` | `pk_costpsndoc` | 费用人员 |
| `voperatorid` | `voperatorid` | `voperatorid` | 操作员 |
| `pk_checkman` | `pk_checkman` | `pk_checkman` | 查验人 |
| `vctrlddeptid` | `vctrlddeptid` | `vctrlddeptid` | 费用承担部门 |
| `vcurrency` | `vcurrency` | `vcurrency` | 账单币种id |
| `vcountryId` | `vcountryId` | `vcountryId` | 国家地区 |

### 日期字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `scheduled_date` | `scheduled_date` | `scheduled_date` | 预定日期 |
| `meal_data` | `meal_data` | `meal_data` | 用餐日期 |
| `ddefdate1` | `ddefdate1` | `ddefdate1` | 自定义项(日期)1 |
| `ddefdate2` | `ddefdate2` | `ddefdate2` | 自定义项(日期)2 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `dopendate` | `dopendate` | `dopendate` | 开票日期 |
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |
| `dupdate` | `dupdate` | `dupdate` | 上传日期 |
| `dcheckdate` | `dcheckdate` | `dcheckdate` | 查验时间 |
| `darrivedate` | `darrivedate` | `darrivedate` | 到达日期 |
| `dhotelindate` | `dhotelindate` | `dhotelindate` | 入住日期 |
| `dhoteloutdate` | `dhoteloutdate` | `dhoteloutdate` | 离店日期 |
| `admission_date` | `admission_date` | `admission_date` | 入院日期 |
| `discharge_date` | `discharge_date` | `discharge_date` | 出院日期 |
| `origdopendate` | `origdopendate` | `origdopendate` | 原税票开票日期 |
| `visit_date` | `visit_date` | `visit_date` | 就诊日期 |

### 布尔字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isrefund` | `isrefund` | `isrefund` | 是否退票 |
| `bocrmodify` | `bocrmodify` | `bocrmodify` | 是否被修改 |
| `bused` | `bused` | `bused` | 是否已使用 |
| `istranssettle` | `istranssettle` | `istranssettle` | 是否机票结算完成 |
| `isdeduct` | `isdeduct` | `isdeduct` | 是否可抵扣 |
| `iscitytraffic` | `iscitytraffic` | `iscitytraffic` | 是否市内交通费 |
| `isagentmark` | `isagentmark` | `isagentmark` | 是否代开 |
| `bisForeign` | `bisForeign` | `bisForeign` | 是否国外票据 |
| `bisVirtual` | `bisVirtual` | `bisVirtual` | 是否为虚拟行 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `taxcheckstatus` | `taxcheckstatus` | `taxcheckstatus` | 税务校验结果 |
| `ireimbursetype` | `ireimbursetype` | `ireimbursetype` | 账单报销方式 |
| `catering_order_channel` | `catering_order_channel` | `catering_order_channel` | 餐饮订单渠道 |
| `dining_scene` | `dining_scene` | `dining_scene` | 用餐场景 |
| `dining_type` | `dining_type` | `dining_type` | 用餐方式 |
| `icarscenario` | `icarscenario` | `icarscenario` | 用车场景 |

### 短整数 (32个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cartype` | `cartype` | `cartype` | 用车类型 |
| `collectionWay` | `collectionWay` | `collectionWay` | 采集方式 |
| `status` | `status` | `status` | 账单状态 |
| `iauditdealstatus` | `iauditdealstatus` | `iauditdealstatus` | 稽核处理状态 |
| `iselecvmatched` | `iselecvmatched` | `iselecvmatched` | 电子凭证匹配关系 |
| `fileattribute` | `fileattribute` | `fileattribute` | 文件属性 |
| `isEleInvoice` | `isEleInvoice` | `isEleInvoice` | 是否电子 |
| `iinvoicestatus` | `iinvoicestatus` | `iinvoicestatus` | 增值税发票状态 |
| `imanualauditresult` | `imanualauditresult` | `imanualauditresult` | 初核稽核结果 |
| `ibusistatus` | `ibusistatus` | `ibusistatus` | 业务状态 |
| `icompanyseal` | `icompanyseal` | `icompanyseal` | 是否有公司印章 |
| `icheckstatus` | `icheckstatus` | `icheckstatus` | 查验状态 |
| `ipdfanalytype` | `ipdfanalytype` | `ipdfanalytype` | pdf解析方式 |
| `icodeanalytype` | `icodeanalytype` | `icodeanalytype` | pdf二维码解析方式 |
| `iuseproperties` | `iuseproperties` | `iuseproperties` | 用车性质 |
| `isourcesystem` | `isourcesystem` | `isourcesystem` | 来源系统 |
| `iapprovestatus` | `iapprovestatus` | `iapprovestatus` | 记账审核状态 |
| `igatherstatus` | `igatherstatus` | `igatherstatus` | 记账采集状态 |
| `ibuytype` | `ibuytype` | `ibuytype` | 变更状态 |
| `iexpenstatus` | `iexpenstatus` | `iexpenstatus` | 是否需要报销状态 |
| `iauditstatus` | `iauditstatus` | `iauditstatus` | 稽核状态 |
| `iatteststatus` | `iatteststatus` | `iatteststatus` | 抵扣状态 |
| `daccountyear` | `daccountyear` | `daccountyear` | 会计期间年度 |
| `daccountmonth` | `daccountmonth` | `daccountmonth` | 会计期间月度 |
| `iauditresult` | `iauditresult` | `iauditresult` | 稽核结果 |
| `iattestcheckstatus` | `iattestcheckstatus` | `iattestcheckstatus` | 抵扣核对状态 |
| `itraffictype` | `itraffictype` | `itraffictype` | 交通费用类型 |
| `ichecktype` | `ichecktype` | `ichecktype` | 账单类型 |
| `orientation` | `orientation` | `orientation` | 旋转角度 |
| `airtype` | `airtype` | `airtype` | 航空行程单类型 |
| `airporttype` | `airporttype` | `airporttype` | 机票类型 |
| `iinvreleasestatus` | `iinvreleasestatus` | `iinvreleasestatus` | 账单释放状态 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_pdfinvoice` | `pk_pdfinvoice` | `pk_pdfinvoice` | ocr原始数据pk |
| `id` | `id` | `id` | ID |
| `pk_ocrinvoice` | `pk_ocrinvoice` | `pk_ocrinvoice` | ocr原始数据pk |
| `pk_taxbusiclass` | `pk_taxbusiclass` | `pk_taxbusiclass` | 进项税转出原因 |
| `pk_attachsupply` | `pk_attachsupply` | `pk_attachsupply` | 附件补录pk |

### 数值字段 (67个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nothertaxmny` | `nothertaxmny` | `nothertaxmny` | 其它税额 |
| `tax_mny` | `tax_mny` | `tax_mny` | 税费 |
| `fare_collection_mny` | `fare_collection_mny` | `fare_collection_mny` | 抢票费 |
| `commission_mny` | `commission_mny` | `commission_mny` | 代购费 |
| `fine_mny` | `fine_mny` | `fine_mny` | 罚金 |
| `coupon_mny` | `coupon_mny` | `coupon_mny` | 优惠券金额 |
| `cancellation_mny` | `cancellation_mny` | `cancellation_mny` | 取消费用 |
| `tax_deductible_service_mny` | `tax_deductible_service_mny` | `tax_deductible_service_mny` | 服务费可抵扣税额 |
| `nservicetaxrate` | `nservicetaxrate` | `nservicetaxrate` | 服务费可抵扣税率 |
| `order_amount` | `order_amount` | `order_amount` | 订单金额 |
| `amount_services` | `amount_services` | `amount_services` | 服务费金额 |
| `nchecknum` | `nchecknum` | `nchecknum` | 查验次数 |
| `nmny` | `nmny` | `nmny` | 金额 |
| `ntaxmny` | `ntaxmny` | `ntaxmny` | 税额 |
| `npersonpayprice` | `npersonpayprice` | `npersonpayprice` | 个人支付金额 |
| `nuntaxmny` | `nuntaxmny` | `nuntaxmny` | 不含税金额 |
| `nsentticketfee` | `nsentticketfee` | `nsentticketfee` | 送票费 |
| `nrefundfee` | `nrefundfee` | `nrefundfee` | 退票费 |
| `nchangefee` | `nchangefee` | `nchangefee` | 改签费 |
| `ncompanypayprice` | `ncompanypayprice` | `ncompanypayprice` | 公司支付金额 |
| `nservicetaxmny` | `nservicetaxmny` | `nservicetaxmny` | 服务费可抵扣税额 |
| `nfare` | `nfare` | `nfare` | 票价 |
| `nfuelsurcharge` | `nfuelsurcharge` | `nfuelsurcharge` | 燃油附加费 |
| `ncadevelopmentfund` | `ncadevelopmentfund` | `ncadevelopmentfund` | 民航发展基金 |
| `ninsurance` | `ninsurance` | `ninsurance` | 保险费 |
| `nservicemny` | `nservicemny` | `nservicemny` | 服务费 |
| `ndeductmny` | `ndeductmny` | `ndeductmny` | 已抵扣金额 |
| `ndeductscale` | `ndeductscale` | `ndeductscale` | 抵扣比例 |
| `nmileage` | `nmileage` | `nmileage` | 里程 |
| `nordertotalmny` | `nordertotalmny` | `nordertotalmny` | 订单总价 |
| `nstandardprice` | `nstandardprice` | `nstandardprice` | 全价 |
| `ncoupon` | `ncoupon` | `ncoupon` | 优惠券 |
| `ninnightnum` | `ninnightnum` | `ninnightnum` | 间夜数 |
| `nroomnum` | `nroomnum` | `nroomnum` | 房间数 |
| `npaperticketfee` | `npaperticketfee` | `npaperticketfee` | 纸票出票费 |
| `nextracharge` | `nextracharge` | `nextracharge` | 酒店加收税额 |
| `ntransmny` | `ntransmny` | `ntransmny` | 总价 |
| `nauditmny` | `nauditmny` | `nauditmny` | 稽核票据金额 |
| `naudittaxmny` | `naudittaxmny` | `naudittaxmny` | 稽核税额 |
| `nauditnotaxmny` | `nauditnotaxmny` | `nauditnotaxmny` | 稽核不含税金额 |
| `ntaxrate` | `ntaxrate` | `ntaxrate` | 税率 |
| `nbxmny` | `nbxmny` | `nbxmny` | 报销金额 |
| `nouttotalmny` | `nouttotalmny` | `nouttotalmny` | 转出价税合计 |
| `nouttaxmny` | `nouttaxmny` | `nouttaxmny` | 转出进项税额 |
| `nreducetaxmny` | `nreducetaxmny` | `nreducetaxmny` | 实际代扣进项税额 |
| `ninoutnotaxmny` | `ninoutnotaxmny` | `ninoutnotaxmny` | 无税金额 |
| `ndeducttaxmny` | `ndeducttaxmny` | `ndeducttaxmny` | 可抵扣税额 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `annual_health_insurance_coverage` | `annual_health_insurance_coverage` | `annual_health_insurance_coverage` | 年度医保范围内 |
| `annual_outpatient_catastrophic_payment` | `annual_outpatient_catastrophic_payment` | `annual_outpatient_catastrophic_payment` | 年度门诊大额支付 |
| `cash_payment` | `cash_payment` | `cash_payment` | 现金支付 |
| `diff_amount` | `diff_amount` | `diff_amount` | 差异金额 |
| `late_payment_fine` | `late_payment_fine` | `late_payment_fine` | 滞纳金 |
| `original_amount` | `original_amount` | `original_amount` | 原税票金额 |
| `other_payments` | `other_payments` | `other_payments` | 其他支付 |
| `overall_amount` | `overall_amount` | `overall_amount` | 统筹金额 |
| `personal_account_payment` | `personal_account_payment` | `personal_account_payment` | 个人账户支付 |
| `personal_expense` | `personal_expense` | `personal_expense` | 个人自费 |
| `personal_payment` | `personal_payment` | `personal_payment` | 个人自付 |
| `personal_self1` | `personal_self1` | `personal_self1` | 自付一 |
| `personal_self2` | `personal_self2` | `personal_self2` | 自付二 |
| `vehicle_vessel_tax` | `vehicle_vessel_tax` | `vehicle_vessel_tax` | 车船税 |
| `withholding_tax_amount` | `withholding_tax_amount` | `withholding_tax_amount` | 代扣税税额 |

### timestamp (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtransfertime` | `dtransfertime` | `dtransfertime` | 转交时间 |
| `ddefdatetime1` | `ddefdatetime1` | `ddefdatetime1` | 自定义项(日期时间)1 |
| `ddefdatetime2` | `ddefdatetime2` | `ddefdatetime2` | 自定义项(日期时间)2 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `duploadtime` | `duploadtime` | `duploadtime` | 上传时间 |
| `dopentime` | `dopentime` | `dopentime` | 开票时间戳 |
| `kprqDetail` | `kprqDetail` | `kprqDetail` | 开票时间 |

### other (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ddeftime1` | `ddeftime1` | `ddeftime1` | 自定义项(时间)1 |
| `ddeftime2` | `ddeftime2` | `ddeftime2` | 自定义项(时间)2 |
| `` | `` | `tallydataamountbvos` | 个人账单金额子表 |
| `` | `` | `tallydatabusbvos` | 个人账单业务子表 |
| `` | `` | `tallydataextvos` | 账单扩展表 |
| `` | `` | `tallydatataxbvos` | 个人账单税额子表 |
| `` | `` | `tallydatataxdeductvos` | 账单税务抵扣 |
| `` | `` | `tallydatatransrecords` | 账单转交记录表 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tallydataDcs` | `tallydataDcs` | `tallydataDcs` | 账单自定义项 |
