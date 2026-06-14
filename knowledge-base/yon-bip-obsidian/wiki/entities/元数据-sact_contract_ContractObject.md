---
tags: [BIP, 元数据, 数据字典, sact.contract.ContractObject]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同标的 (`sact.contract.ContractObject`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sact_contractobject` | domain：`sact` | 应用：`SACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同标的 |
| 物理表 | `sact_contractobject` |
| domain/服务域 | `sact` |
| schema | `scmmp` |
| 所属应用 | `SACT` |
| 直连字段 | 185 个 |
| 子表 | 2 个 |
| 关联引用 | 38 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `frees` | `sact.contract.ContractObjectFreeDefine` | composition |
| `defines` | `sact.contract.ContractObjectDefine` | composition |

## 关联引用 (38个)

| 字段名 | 引用类型 |
|--------|---------|
| `qualitypriceScheme` | `` |
| `activity` | `` |
| `agentProductId` | `` |
| `wbs` | `` |
| `taxcodeid` | `` |
| `ibatchid` | `` |
| `` | `` |
| `iReceiver` | `` |
| `optional_quotation_id` | `` |
| `freeidx1` | `` |
| `variantConfiguration` | `` |
| `freeidx2` | `` |
| `freeidx3` | `` |
| `freeidx4` | `` |
| `freeidx5` | `` |
| `skuid` | `productcenter.productskuref` |
| `tenant_id` | `` |
| `cqtunitid` | `productcenter.pc_productassitunitsref` |
| `saleunitid` | `productcenter.pc_productassitunitsref` |
| `oProductClass_id` | `productcenter.pc_presentationclassref` |
| `optional_quotation_sub_id` | `` |
| `productid` | `productcenter.productref` |
| `ytenant_id` | `` |
| `contractObjectCharacteristics` | `` |
| `sact_vid` | `` |
| `optionCharacteristics` | `` |
| `masterunit_id` | `` |
| `contractObjectDefineCharacter` | `` |
| `sourceType` | `transtype.bd_billtypetreeref` |
| `istockid` | `udinghuo.aa_warehouseref` |
| `iReceiverCust` | `productcenter.merchantRef` |
| `istockOrgid` | `udinghuo.stockOrgref` |
| `costCurrency` | `` |
| `finorgid` | `udinghuo.financeOrgref` |
| `project_Id` | `ucfbasedoc.bd_projectNewRef` |
| `sactExecuteId` | `` |

## 继承接口 (14个, 77字段)

- **换算比** (`gscm.itf.IUOMExchRate`)
  - `` → ``
  - `invexchrateden` → `invexchrateden`
  - `invexchratenum` → `invexchratenum`
  - `` → ``
  - `` → ``
- **计价换算比** (`gscm.itf.IUOMPriceExchRate`)
  - `` → ``
  - `invpriceexchrateden` → `invpriceexchrateden`
  - `invpriceexchratenum` → `invpriceexchratenum`
  - `` → ``
  - `` → ``
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **后端自动行号接口** (`base.itf.ILineNo`)
  - `lineno` → `lineno`
- **源头单据信息** (`sale.aa.IFirstSourceData`)
  - `firstlineno` → `firstlineno`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **原币金额信息** (`voucher.base.IOriMoneyInfo`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **本币金额信息** (`voucher.base.INatMoneyInfo`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **生单回写** (`base.itf.IBackWrite`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``
- **行关闭信息** (`base.itf.ILineClosing`)
  - `linecloser` → `linecloser`
  - `lineclose_time` → `lineclose_time`
- **自定义项(批次)** (`base.itf.UserdefItemBatch`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **伙伴表体接口** (`sact.pub.ICustLine`)
  - `iReceiveAddress` → `iReceiveAddress`
  - `iReceiveMobile` → `iReceiveMobile`
  - `cReceiver` → `cReceiver`
  - `iReceiverCust` → `iReceiverCust`
  - `iReceiver` → `iReceiver`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **外部来源行线索** (`base.itf.IOutSysObjLineClue`)
  - `out_sys_lineid` → `out_sys_lineid`
  - `out_sys_rowno` → `out_sys_rowno`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 185 个直连字段

### 文本字段 (71个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productsaletype` | `productsaletype` | `productsaletype` | 商品售卖类型 |
| `variantconfigcts_code` | `variantconfigcts_code` | `variantconfigctsCode` | 配置号 |
| `variantconfigcts_version` | `variantconfigcts_version` | `variantconfigctsVersion` | 配置清单版本 |
| `linecloser` | `linecloser` | `linecloser` | 行关闭人 |
| `out_sys_rowno` | `out_sys_rowno` | `out_sys_rowno` | 外部来源行号 |
| `costId` | `costId` | `costId` | 成本价格记录id |
| `out_sys_lineid` | `out_sys_lineid` | `out_sys_lineid` | 外部来源行 |
| `cReceiver` | `cReceiver` | `receiver` | 收货人 |
| `` | `firstsource` | `firstsource` | 源头单据类型 |
| `` | `firstupcode` | `firstupcode` | 源头单据号 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `iReceiveAddress` | `iReceiveAddress` | `receiveAddress` | 收货地址 |
| `iReceiveMobile` | `iReceiveMobile` | `receiveMobile` | 收货电话 |
| `cSpecDescription` | `cSpecDescription` | `specDescription` | 规格描述 |
| `idKey` | `idKey` | `idKey` | 外部线索 |
| `free1` | `free1` | `free1` | 颜色 |
| `free2` | `free2` | `free2` | 物料规格2 |
| `free3` | `free3` | `free3` | 物料规格3 |
| `free4` | `free4` | `free4` | 物料规格4 |
| `free5` | `free5` | `free5` | 物料规格5 |
| `free6` | `free6` | `free6` | 物料规格6 |
| `free7` | `free7` | `free7` | 物料规格7 |
| `free8` | `free8` | `free8` | 物料规格8 |
| `free9` | `free9` | `free9` | 物料规格9 |
| `free10` | `free10` | `free10` | 物料规格10 |
| `freex1` | `freex1` | `freex1` | 动态规格1 |
| `freex2` | `freex2` | `freex2` | 动态规格2 |
| `freex3` | `freex3` | `freex3` | 动态规格3 |
| `freex4` | `freex4` | `freex4` | 动态规格4 |
| `freex5` | `freex5` | `freex5` | 动态规格5 |
| `cbatchno` | `cbatchno` | `batchNo` | 批次号 |
| `memo` | `memo` | `memo` | 备注 |
| `cAgentProductName` | `cAgentProductName` | `agentProductName` | 客户商品名称 |
| `cAgentSkuCode` | `cAgentSkuCode` | `agentSkuCode` | 客户商品SKU编码 |
| `cAgentSkuName` | `cAgentSkuName` | `agentSkuName` | 客户商品SKU名称 |
| `cAgentProductCode` | `cAgentProductCode` | `agentProductCode` | 客户商品编码 |
| `source` | `source` | `source` | 上游单据类型 |
| `` | `upcode` | `upcode` | 上游单据号 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单类型编码 |
| `` | `define1` | `define1` | 批次属性1 |
| `` | `define2` | `define2` | 批次属性2 |
| `` | `define3` | `define3` | 批次属性3 |
| `` | `define4` | `define4` | 批次属性4 |
| `` | `define5` | `define5` | 批次属性5 |
| `` | `define6` | `define6` | 批次属性6 |
| `` | `define7` | `define7` | 批次属性7 |
| `` | `define8` | `define8` | 批次属性8 |
| `` | `define9` | `define9` | 批次属性9 |
| `` | `define10` | `define10` | 批次属性10 |
| `` | `define11` | `define11` | 批次属性11 |
| `` | `define12` | `define12` | 批次属性12 |
| `` | `define13` | `define13` | 批次属性13 |
| `` | `define14` | `define14` | 批次属性14 |
| `` | `define15` | `define15` | 批次属性15 |
| `` | `define16` | `define16` | 批次属性16 |
| `` | `define17` | `define17` | 批次属性17 |
| `` | `define18` | `define18` | 批次属性18 |
| `` | `define19` | `define19` | 批次属性19 |
| `` | `define20` | `define20` | 批次属性20 |
| `` | `define21` | `define21` | 批次属性21 |
| `` | `define22` | `define22` | 批次属性22 |
| `` | `define23` | `define23` | 批次属性23 |
| `` | `define24` | `define24` | 批次属性24 |
| `` | `define25` | `define25` | 批次属性25 |
| `` | `define26` | `define26` | 批次属性26 |
| `` | `define27` | `define27` | 批次属性27 |
| `` | `define28` | `define28` | 批次属性28 |
| `` | `define29` | `define29` | 批次属性29 |
| `` | `define30` | `define30` | 批次属性30 |
| `settlementInspectionSource` | `settlementInspectionSource` | `settlementInspectionSource` | 质检结果来源 |
| `settlementMeasureSource` | `settlementMeasureSource` | `settlementMeasureSource` | 结算计量来源 |

### 引用字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `variantConfiguration` | `variantConfiguration` | `variantConfiguration` | 选配参数文件id |
| `sactExecuteId` | `sactExecuteId` | `sactExecuteId` | 合同执行情况ID |
| `optional_quotation_id` | `optional_quotation_id` | `optionalQuotationId` | 配置报价清单 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `costCurrency` | `costCurrency` | `costCurrency` | 成本币种 |
| `productid` | `productid` | `productAuth` | 商品权限 |
| `iReceiverCust` | `iReceiverCust` | `receiverCustId` | 收货客户 |
| `iReceiver` | `iReceiver` | `receiverId` | 收货人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `sact_vid` | `sact_vid` | `sactVId` | 表头 |
| `productid` | `productid` | `productId` | 物料 |
| `skuid` | `skuid` | `skuId` | SKU |
| `oProductClass_id` | `oProductClass_id` | `productClass` | 商品分类 |
| `freeidx1` | `freeidx1` | `freeidx1` | 动态规格1 |
| `freeidx2` | `freeidx2` | `freeidx2` | 动态规格2 |
| `freeidx3` | `freeidx3` | `freeidx3` | 动态规格3 |
| `freeidx4` | `freeidx4` | `freeidx4` | 动态规格4 |
| `freeidx5` | `freeidx5` | `freeidx5` | 动态规格5 |
| `saleunitid` | `saleunitid` | `saleunitId` | 销售单位 |
| `cqtunitid` | `cqtunitid` | `cqtUnitId` | 计价单位 |
| `masterunit_id` | `masterunit_id` | `masterUnitId` | 主计量单位 |
| `taxcodeid` | `taxcodeid` | `taxcCodeId` | 税码 |
| `finorgid` | `finorgid` | `finOrgId` | 开票组织 |
| `istockOrgid` | `istockOrgid` | `stockOrgId` | 库存组织ID |
| `istockid` | `istockid` | `stockId` | 仓库ID |
| `ibatchid` | `ibatchid` | `batchId` | 批次号ID |
| `project_Id` | `project_Id` | `projectId` | 项目 |
| `agentProductId` | `agentProductId` | `agentProductId` | 客户商品ID |
| `sourceType` | `sourceType` | `sourceType` | 上游单据的单据类型ID |
| `optional_quotation_sub_id` | `optional_quotation_sub_id` | `optionalQuotationSubId` | 配置报价清单行ID |
| `qualitypriceScheme` | `qualitypriceScheme` | `qualitypriceScheme` | 优质优价方案 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isbatchmanage` | `isbatchmanage` | `isBatchManage` | 是否批次号管理 |
| `isexpirydatemanage` | `isexpirydatemanage` | `isExpiryDateManage` | 是否有效期管理 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quoteIdentification` | `quoteIdentification` | `quoteIdentification` | 价格标识 |
| `irowno` | `irowno` | `rowno` | 行号 |
| `cqtUnitExchangeType` | `cqtUnitExchangeType` | `cqtUnitExchangeType` | 固定-浮动(计价) |
| `saleUnitExchangeType` | `saleUnitExchangeType` | `saleUnitExchangeType` | 固定-浮动(销售) |
| `iexpiredateno` | `iexpiredateno` | `expireDateNo` | 保质期 |
| `` | `isPriceSettled` | `isPriceSettled` | 价格结算 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cexpiredateunit` | `cexpiredateunit` | `expireDateUnit` | 保质期单位 |

### 长整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `variantconfigctsId` | `variantconfigctsId` | `variantconfigctsId` | 选配结果清单id |
| `` | `firstsourceautoid` | `firstsourceautoid` | 源头单据子表id |
| `` | `firstsourceid` | `firstsourceid` | 源头单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `id` | `id` | `id` | 表体 |
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `pto_id` | `pto_id` | `ptoId` | PTO件ID |
| `pto_row_id` | `pto_row_id` | `ptoRowId` | PTO件行ID |

### 数值字段 (53个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fBaseCost` | `fBaseCost` | `baseCost` | 基础报价金额 |
| `fBaseDiscountMoney` | `fBaseDiscountMoney` | `baseDiscountMoney` | 报价扣额 |
| `fBaseDiscountRate` | `fBaseDiscountRate` | `baseDiscountRate` | 报价扣率% |
| `fBasePrice` | `fBasePrice` | `basePrice` | 基础报价 |
| `fLowestPrice` | `fLowestPrice` | `lowestPrice` | 最低售价 |
| `fNatExpenseApportion` | `fNatExpenseApportion` | `natExpenseApportion` | 本币整单费用分摊金额 |
| `fNatExpenseSum` | `fNatExpenseSum` | `natExpenseSum` | 本币预估行费用金额 |
| `fNatExpenseTaxPrice` | `fNatExpenseTaxPrice` | `natExpenseTaxPrice` | 本币预估行费用单价 |
| `fOriExpenseApportion` | `fOriExpenseApportion` | `oriExpenseApportion` | 整单费用分摊金额 |
| `fOriExpenseSum` | `fOriExpenseSum` | `oriExpenseSum` | 预估行费用金额 |
| `fOriExpenseTaxPrice` | `fOriExpenseTaxPrice` | `oriExpenseTaxPrice` | 预估行费用单价 |
| `quoteAmtExclTax` | `quoteAmtExclTax` | `quoteAmtExclTax` | 报价无税金额 |
| `quoteExclTax` | `quoteExclTax` | `quoteExclTax` | 无税报价 |
| `natTaxReceiEMoney` | `natTaxReceiEMoney` | `natTaxReceiEMoney` | 行应收费用本币含税金额 |
| `permit_ratio` | `permit_ratio` | `permitRatio` | 容差比例 |
| `costExchRate` | `costExchRate` | `costExchRate` | 成本汇率 |
| `fFavorableRate` | `fFavorableRate` | `favorableRate` | 倒扣 |
| `fCusFavorableRate` | `fCusFavorableRate` | `cusFavorableRate` | 报价倒扣 |
| `preGProfitRate` | `preGProfitRate` | `preGProfitRate` | 行预估毛利率 |
| `costMoney` | `costMoney` | `costMoney` | 成本金额 |
| `preGProfit` | `preGProfit` | `preGProfit` | 行预估毛利 |
| `natReceiEMoney` | `natReceiEMoney` | `natReceiEMoney` | 行应收费用本币无税金额 |
| `costPrice` | `costPrice` | `costPrice` | 成本价 |
| `natTaxPayEMoney` | `natTaxPayEMoney` | `natTaxPayEMoney` | 行应付费用本币含税金额 |
| `natPayEMoney` | `natPayEMoney` | `natPayEMoney` | 行应付费用本币无税金额 |
| `fDiscMoney` | `fDiscMoney` | `discMoney` | 行折扣额 |
| `fDiscRate` | `fDiscRate` | `discRate` | 扣率% |
| `firstlineno` | `firstlineno` | `firstlineno` | 源头行号 |
| `fNatDiscMoney` | `fNatDiscMoney` | `natDiscMoney` | 本币行折扣额 |
| `fSaleMoney` | `fSaleMoney` | `saleMoney` | 报价含税金额 |
| `fSalePrice` | `fSalePrice` | `salePrice` | 报价含税价格 |
| `uplineno` | `uplineno` | `uplineno` | 来源行号 |
| `lineno` | `lineno` | `lineno` | 行号 |
| `invexchrate` | `invexchrate` | `invExchRate` | 销售换算率 |
| `subqty` | `subqty` | `subQty` | 销售数量 |
| `invPriceExchRate` | `invPriceExchRate` | `invPriceExchRate` | 计价换算率 |
| `priceQty` | `priceQty` | `priceQty` | 计价数量 |
| `qty` | `qty` | `qty` | 数量 |
| `oritaxunitprice` | `oritaxunitprice` | `oriTaxUnitPrice` | 含税单价 |
| `orisum` | `orisum` | `oriSum` | 含税金额 |
| `oriunitprice` | `oriunitprice` | `oriUnitPrice` | 无税单价 |
| `orimoney` | `orimoney` | `oriMoney` | 无税金额 |
| `natsum` | `natsum` | `natSum` | 本币含税金额 |
| `nattaxunitprice` | `nattaxunitprice` | `natTaxUnitPrice` | 本币含税单价 |
| `natmoney` | `natmoney` | `natMoney` | 本币无税金额 |
| `natunitprice` | `natunitprice` | `natUnitPrice` | 本币无税单价 |
| `nattax` | `nattax` | `natTax` | 本币税额 |
| `taxrate` | `taxrate` | `taxRate` | 税率 |
| `oritax` | `oritax` | `oriTax` | 税额 |
| `invexchrateden` | `invexchrateden` | `invExchRateDen` | 换算率分母 |
| `invexchratenum` | `invexchratenum` | `invExchRateNum` | 换算率分子 |
| `invpriceexchrateden` | `invpriceexchrateden` | `invPriceExchRateDen` | 计价换算率分母 |
| `invpriceexchratenum` | `invpriceexchratenum` | `invPriceExchRateNum` | 计价换算率分子 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lineclose_time` | `lineclose_time` | `linecloseTime` | 行关闭时间 |
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `dproductdate` | `dproductdate` | `productDate` | 生产日期 |
| `dvaliddate` | `dvaliddate` | `invalidDate` | 有效期至 |

### OptionCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `optionCharacteristics` | `optionCharacteristics` | `optionCharacteristics` | 选配特征组 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contractObjectCharacteristics` | `contractObjectCharacteristics` | `contractObjectCharacteristics` | 自由项特征组 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contractObjectDefineCharacter` | `contractObjectDefineCharacter` | `contractObjectDefineCharacter` | 销售合同标的自定义项特征属性组 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `costExchRateOps` | `costExchRateOps` | `costExchRateOps` | 成本汇率折算方式 |
| `` | `` | `defines` | 合同标的自定义项 |
| `` | `` | `frees` | 合同标的自由自定义项 |
