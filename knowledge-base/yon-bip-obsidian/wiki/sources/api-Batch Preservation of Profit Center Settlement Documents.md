---
title: "利润中心结算单批量保存"
apiId: "2058473646444773384"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Profit Center Settlement Document"
domain: "CO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Profit Center Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 利润中心结算单批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Profit Center Settlement Document (CO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CO/fieis/settlement/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| controlScopeId | string | 否 | 是 | 管控范围id 示例：1528679182566948867 |
| currencyId | string | 否 | 是 | 结算币种id或编码 示例：CNY |
| pcsDate | string | 否 | 是 | 制单日期 示例：2024-07-06 |
| pcsTime | string | 否 | 否 | 制单时间 示例：2024-07-06 17:29:38 |
| settlementClass | string | 否 | 是 | 内部结算分类，manage:管理规则类，business:业务交易类 示例：manage |
| settlementTypeId | string | 否 | 是 | 内部结算类型id 示例：1939070634919198725 |
| category | string | 否 | 否 | 交易类型 示例：1939070634919198725 |
| settlementAmount | string | 否 | 否 | 结算金额 示例：12.22 |
| settlementRuleId | string | 否 | 否 | 管理类结算规则id 示例：1612410592202588165 |
| settlementStyle | string | 否 | 是 | 结算方式,propcsettlement: 供方确认结算,dempcsettlement: 需方确认结算 示例：propcsettlement |
| pcsCreateStyle | string | 否 | 是 | 结算单生成方式,枚举,MR: 管理类结算规则生成,BT: 业务结算规则生成,HAND: 手工生成 示例：HAND |
| accPeriodScheme | string | 否 | 否 | 期间方案id，默认取管控范围期间方案 示例：1525643714430500872 |
| periodType | string | 否 | 否 | 会计期间类型,month:月,quarter:季,year:年 示例：month |
| period | string | 否 | 否 | 期间 示例：2022-11 |
| autoExamine | boolean | 否 | 否 | 是否自动审核，默认值是false,true的情况自动发起审核 示例：true |
| spcenter | string | 否 | 否 | 供方利润中心id或编码 示例：FQ1 |
| dpcenter | string | 否 | 否 | 需方利润中心id或编码 示例：FQ2 |
| accpurpose | string | 否 | 否 | 核算目的 示例：1525643714430500872 |
| mainPc | string | 否 | 否 | 利润中心 示例：1556970140740354053 |
| blnNew | string | 否 | 否 | 冲销最新单据,1:是，0：否 示例：0 |
| transactionRule | string | 否 | 否 | 业务交易类规则 示例：2023716331439259654 |
| company | string | 否 | 否 | 公司 示例：1528688571368603656 |
| sCompany | string | 否 | 否 | 供方公司 示例：1528688571368603656 |
| dCompany | string | 否 | 否 | 需方公司 示例：1528441481898491905 |
| dept | string | 否 | 否 | 部门 示例：1849958455896965126 |
| sDept | string | 否 | 否 | 供方部门 示例：1849958455896965126 |
| dDept | string | 否 | 否 | 需方部门 示例：1939083579943813123 |
| constCenter | string | 否 | 否 | 成本中心 示例：1534533102750138369 |
| sConstCenter | string | 否 | 否 | 供方成本中心 示例：1534533102750138369 |
| dConstCenter | string | 否 | 否 | 需方成本中心 示例：1534533102750138369 |
| stockOrg | string | 否 | 否 | 库存组织 示例：1528688571368603656 |
| sStockOrg | string | 否 | 否 | 供方仓库组织，不传时，根据供方仓库组织回填 |
| dStockOrg | string | 否 | 否 | 需方库存组织，不传时，根据需方仓库组织回填 |
| wareHouse | string | 否 | 否 | 仓库id 示例：1879771954196512776 |
| sWareHouse | string | 否 | 否 | 供方仓库id或编码 示例：106687 |
| dWareHouse | string | 否 | 否 | 需方仓库id或编码 示例：106687 |
| srcBillTypeId | string | 否 | 否 | 来源单据类型 示例：1153091135960163 |
| srcBillTradeTypeId | string | 否 | 否 | 来源单据交易类型 示例：1935198575874539526 |
| srcBillId | string | 否 | 是 | 来源单据id 示例：2022912416636993545 |
| srcBillNo | string | 否 | 否 | 来源单据编号 示例：PCEIS20240219220820 |
| srcBillDate | string | 否 | 否 | 来源单据日期 示例：2024-02-20 |
| billTypeId | string | 否 | 否 | 单据类型 示例：1545571529475489793 |
| sourceApplication | string | 否 | 否 | 来源应用 示例：127 |
| rateDate | string | 否 | 否 | 汇率日期 示例：2024-06-13 |
| billDate | string | 否 | 否 | 记账日期 示例：2024-06-14 |
| saleOrg | string | 否 | 否 | 销售组织 示例：2039228619425841154 |
| purOrg | string | 否 | 否 | 采购组织 示例：2018992752178495498 |
| osmOrg | string | 否 | 否 | 委外组织 示例：2018992752178495498 |
| mmOrg | string | 否 | 否 | 生产组织 示例：2018992752178495498 |
| customer | string | 否 | 否 | 客户 示例：2022920740285710345 |
| supplierId | string | 否 | 否 | 供货供应商 示例：2019013436722118657 |
| invoiceSupplierId | string | 否 | 否 | 开票供应商 示例：2019013436722118657 |
| blnReturn | string | 否 | 否 | 退货标识 示例：0 |
| isUpdateCost | boolean | 否 | 否 | 是否推存货，true:是，false：否 示例：true 默认值：false |
| proInventory | boolean | 否 | 否 | 供方传存货标识,isUpdateCost为true时，供方传存货填写true为供方传存货，填写false为供方不传存货。isUpdateCost为false时,供方传存货不用填写，默认是false 示例：true |
| demInventory | boolean | 否 | 否 | 需方传存货标识,isUpdateCost为true时，需方传存货填写true为需方传存货，填写false为需方不传存货。isUpdateCost为false时,需方传存货不用填写，默认是false 示例：true |
| orgId | string | 否 | 否 | 主组织id 示例：2019013436722118657 |
| bustype | string | 否 | 否 | 交易类型id 示例：2019013436722118657 |
| PCSettlementDetailList | object | 是 | 是 | 结算单详情 |
| serviceTypeId | string | 否 | 否 | 服务分类，不传时，根据服务回填 |
| serviceId | string | 否 | 是 | 服务id或编码 示例：000008-000001 |
| sProfitCenterId | string | 否 | 否 | 供方利润中心id或编码 示例：FQ1 |
| dProfitCenterId | string | 否 | 否 | 需方利润中心id或编码 示例：FQ2 |
| currencyId | string | 否 | 否 | 结算币种 示例：1525643705855773169 |
| settlementUnitPrice | number |
| 小数位数:8,最大长度:21 | 否 | 是 | 结算单价 示例：100 |
| settlementQuantity | number |
| 小数位数:8,最大长度:21 | 否 | 是 | 结算数量 示例：100 |
| settlementUnit | string | 否 | 否 | 计量单位id或编码 示例：KW·h |
| settlementAmount | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 结算金额，不用传，自动根据结算单价，结算数量计算 |
| pricingStrategy | string | 否 | 否 | 定价策略 示例：1 |
| pricingPlanId | string | 否 | 否 | 定价方案id 示例：1576275151159820292 |
| priceDetailId | string | 否 | 否 | 定价详情id 示例：1586639989571584011 |
| priceCurrency | string | 否 | 否 | 定价币种id 示例：1525643705855773169 |
| commodityCategory | string | 否 | 否 | 商品分类id 示例：1567963633530437640 |
| supplier | string | 否 | 否 | 供应商id 示例：1583484812117147660 |
| supplierCategory | string | 否 | 否 | 供应商类别 示例：1684337249868054530 |
| project | string | 否 | 否 | 项目id 示例：1535890802043518978 |
| projectCategory | string | 否 | 否 | 项目类别id 示例：1624182719607996422 |
| warehouse | string | 否 | 否 | 仓库id 示例：1608732201847881737 |
| jobType | string | 否 | 否 | 作业类型id 示例：1572395266670592005 |
| productLine | string | 否 | 否 | 产品线id 示例：1857441130755915782 |
| customerCategory | string | 否 | 否 | 客户分类id 示例：1857444463650537474 |
| ruleDetailId | string | 否 | 否 | 规则明细id 示例：1586641578709483523 |
| controlScopeId | string | 否 | 否 | 管控范围id 示例：1528679182566948867 |
| pcsDate | string | 否 | 否 | 制单日期 示例：2022-05-01 |
| settlementClass | string | 否 | 否 | 内部结算分类 示例：manage |
| settlementTypeId | string | 否 | 否 | 内部结算类型id 示例：2038447553852997635 |
| settlementRuleId | string | 否 | 否 | 内部结算规则id 示例：1586641578709483521 |
| settlementStyle | string | 否 | 否 | 结算单结算方式 示例：bothpcsettlement |
| pcsCreateStyle | string | 否 | 否 | 结算单生成方式 示例：MR |
| busiDate | string | 否 | 是 | 业务日期 示例：2022-12-01 |
| materialNature | string | 否 | 否 | 物料性质 示例：2 |
| materialAttribute | string | 否 | 否 | 物料属性 示例：7 |
| asset | string | 否 | 否 | 资产id 示例：1576042123396907009 |
| location | string | 否 | 否 | 位置id 示例：1584355711230935042 |
| productDate | string | 否 | 否 | 生产日期 示例：2023-01-01 |
| dept | string | 否 | 否 | 部门id 示例：1525643705855773169 |
| sDept | string | 否 | 否 | 供方部门 示例：1525643705855773169 |
| dDept | string | 否 | 否 | 需方部门id 示例：1528679182566948867 |
| sConstCenter | string | 否 | 否 | 供方成本中心id 示例：1534533102750138369 |
| dConstCenter | string | 否 | 否 | 需方成本中心id 示例：1528679182566948867 |
| sStockOrg | string | 否 | 否 | 供方库存组织，不传时，根据供方仓库组织回填 示例：1528441481898491905 |
| dStockOrg | string | 否 | 否 | 需方库存组织，不传时，根据需方仓库组织回填 示例：1528441481898491905 |
| sWarehouse | string | 否 | 否 | 供方仓库id或编码 示例：106687 |
| dWarehouse | string | 否 | 否 | 需方仓库id或编码 示例：106687 |
| srcBillId | string | 否 | 否 | 来源单据id 示例：2019014725227511808 |
| srcBillNo | string | 否 | 否 | 来源单据号 示例：CGRK000020240613000000 |
| srcBillDate | string | 否 | 否 | 来源单据日期 示例：2024-06-13 |
| srcBillTypeId | string | 否 | 否 | 来源单据类型 示例：15 |
| srcBillTradeTypeId | string | 否 | 否 | 来源单据交易类型 示例：1528679182566948867 |
| saleOrg | string | 否 | 否 | 销售组织 示例：2018992752178495498 |
| purOrg | string | 否 | 否 | 采购组织 示例：2018992752178495498 |
| osmOrg | string | 否 | 否 | 委外组织 示例：2018992752178495498 |
| mmOrg | string | 否 | 否 | 生产组织 示例：1528679182566948867 |
| customer | string | 否 | 否 | 客户 示例：2032370458614038533 |
| invoiceSupplierId | string | 否 | 否 | 开票供应商id 示例：2019013436722118657 |
| supplierId | string | 否 | 否 | 供货供应商id 示例：2019013436722118657 |
| serviceCode | string | 否 | 否 | 服务编码 示例：0252|000001 |
| serviceTypeCode | string | 否 | 否 | 服务分类编码 示例：000000000252 |
| periodType | string | 否 | 否 | 会计期间类型 示例：2032370458614038533 |
| period | string | 否 | 否 | 会计期间 示例：2024-09 |
| dCompanyId | string | 否 | 否 | 需方公司id 示例：1772741987656531969 |
| sCompanyId | string | 否 | 否 | 供方公司id 示例：1772741987656531969 |
| srcBillLineId | string | 否 | 否 | 来源单据行id，标识来源单据明细，取价时使用 示例：2131224190548705287 |
| blnTiered | string | 否 | 否 | 是否阶梯定价,0:否,1:是 示例：0 |
| bound | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 数量下限 示例：5 |
| singlePrice | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 单价价格 示例：100 |
| pricingCoefficient | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 定价系数 示例：2 |
| settlementPricing | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 结算定价 示例：200 |
| conversionRate | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 转换汇率 示例：1 |
| businessVolumeId | string | 否 | 否 | 业务量指标id 示例：1788338336770818055 |
| tieredUnikey | string | 否 | 否 | 阶梯定价唯一键 示例：1890760301616562184 |
| blnNew | string | 否 | 否 | 冲销最新单据,0:否,1:是 示例：0 |
| blnScrap | boolean | 否 | 否 | 是否废品 示例：false |
| blnGift | string | 否 | 否 | 是否赠品，0：否，1：是 示例：0 |
| invalidDate | string | 否 | 否 | 有效期截止日期 示例：2024-04-01 |
| ownerType | string | 否 | 否 | 货权归属 示例：0 |
| stockStatus | string | 否 | 否 | 库存状态 示例：1939818139783528499 |
| batchNo | string | 否 | 否 | 批次号 示例：pch001 |
| firstBillTypeId | string | 否 | 否 | 源头单据类型 示例：20 |
| firstSourceId | string | 否 | 否 | 源头单据id 示例：12456 |
| firstUpCode | string | 否 | 否 | 源头单据编码 示例：20240401000001 |
| firstLineNo | string | 否 | 否 | 源头单据行号 示例：1000 |
| firstLineId | string | 否 | 否 | 源头单据行id 示例：2038350470599671809 |
| firstDate | string | 否 | 否 | 源头单据日期 示例：2024-04-01 |
| lineNo | string | 否 | 否 | 行号 示例：3 |
| srcBillLineNo | string | 否 | 否 | 来源单据行号 示例：35683846 |
| blnAutoCalcCost | boolean | 否 | 否 | 是否自动计算成本 示例：false |
| busiWbs | string | 否 | 否 | 业务WBS 示例：2038439333449957382 |
| sourceApplication | string | 否 | 否 | 来源应用 示例：127 |
| orderNo | string | 否 | 否 | 订单编号 示例：QbOJ-000000000-20240709-000006 |
| orderRowNo | string | 否 | 否 | 订单行号 示例：10 |
| orderTransType | string | 否 | 否 | 订单交易类型 示例：1939818122622009378 |
| costAllocBill | string | 否 | 否 | 结转成本单据 示例：st_salesout |
| outputType | string | 否 | 否 | 产出类型 示例：2 |
| rateDate | string | 否 | 否 | 汇率日期 示例：2024-07-09 |
| notaxPrice | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 原币无税单价 示例：23 |
| notaxAmount | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 原币无税金额 示例：23900 |
| costPrice | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 成本单价 示例：3400 |
| costAmount | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 成本金额 示例：5600 |
| oriCurrency | string | 否 | 否 | 原币币种id 示例：2038439333449957382 |
| oriAmount | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 原币金额 示例：3400 |
| oriRate | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 原币汇率 示例：1 |
| oriRateType | string | 否 | 否 | 原币汇率类型 示例：0000L6YQ8AVLFUZPXD0000 |
| busiBillDate | string | 否 | 否 | 业务单据日期 示例：2024-07-09 |
| busiBillTypeId | string | 否 | 否 | 业务单据类型 示例：1939818122622009378 |
| busiBillId | string | 否 | 否 | 业务单据id 示例：1939818122622009378 |
| busiBillNo | string | 否 | 否 | 业务单据号 示例：123456 |
| busiBillRowId | string | 否 | 否 | 业务单据行ID 示例：1020202002 |
| busiBillRowNo | string | 否 | 否 | 业务单据行号 示例：35683846 |
| wbs | string | 否 | 否 | WBS 示例：1939818122622009378 |

## 3. 请求示例

Url: /yonbip/CO/fieis/settlement/save?access_token=访问令牌
Body: [{
	"controlScopeId": "1528679182566948867",
	"currencyId": "CNY",
	"pcsDate": "2024-07-06",
	"pcsTime": "2024-07-06 17:29:38",
	"settlementClass": "manage",
	"settlementTypeId": "1939070634919198725",
	"category": "1939070634919198725",
	"settlementAmount": "12.22",
	"settlementRuleId": "1612410592202588165",
	"settlementStyle": "propcsettlement",
	"pcsCreateStyle": "HAND",
	"accPeriodScheme": "1525643714430500872",
	"periodType": "month",
	"period": "2022-11",
	"autoExamine": true,
	"spcenter": "FQ1",
	"dpcenter": "FQ2",
	"accpurpose": "1525643714430500872",
	"mainPc": "1556970140740354053",
	"blnNew": "0",
	"transactionRule": "2023716331439259654",
	"company": "1528688571368603656",
	"sCompany": "1528688571368603656",
	"dCompany": "1528441481898491905",
	"dept": "1849958455896965126",
	"sDept": "1849958455896965126",
	"dDept": "1939083579943813123",
	"constCenter": "1534533102750138369",
	"sConstCenter": "1534533102750138369",
	"dConstCenter": "1534533102750138369",
	"stockOrg": "1528688571368603656",
	"sStockOrg": "",
	"dStockOrg": "",
	"wareHouse": "1879771954196512776",
	"sWareHouse": "106687",
	"dWareHouse": "106687",
	"srcBillTypeId": "1153091135960163",
	"srcBillTradeTypeId": "1935198575874539526",
	"srcBillId": "2022912416636993545",
	"srcBillNo": "PCEIS20240219220820",
	"srcBillDate": "2024-02-20",
	"billTypeId": "1545571529475489793",
	"sourceApplication": "127",
	"rateDate": "2024-06-13",
	"billDate": "2024-06-14",
	"saleOrg": "2039228619425841154",
	"purOrg": "2018992752178495498",
	"osmOrg": "2018992752178495498",
	"mmOrg": "2018992752178495498",
	"customer": "2022920740285710345",
	"supplierId": "2019013436722118657",
	"invoiceSupplierId": "2019013436722118657",
	"blnReturn": "0",
	"isUpdateCost": true,
	"proInventory": true,
	"demInventory": true,
	"orgId": "2019013436722118657",
	"bustype": "2019013436722118657",
	"PCSettlementDetailList": [
		{
			"serviceTypeId": "",
			"serviceId": "000008-000001",
			"sProfitCenterId": "FQ1",
			"dProfitCenterId": "FQ2",
			"currencyId": "1525643705855773169",
			"settlementUnitPrice": 100,
			"settlementQuantity": 100,
			"settlementUnit": "KW·h",
			"settlementAmount": 0,
			"pricingStrategy": "1",
			"pricingPlanId": "1576275151159820292",
			"priceDetailId": "1586639989571584011",
			"priceCurrency": "1525643705855773169",
			"commodityCategory": "1567963633530437640",
			"supplier": "1583484812117147660",
			"supplierCategory": "1684337249868054530",
			"project": "1535890802043518978",
			"projectCategory": "1624182719607996422",
			"warehouse": "1608732201847881737",
			"jobType": "1572395266670592005",
			"productLine": "1857441130755915782",
			"customerCategory": "1857444463650537474",
			"ruleDetailId": "1586641578709483523",
			"controlScopeId": "1528679182566948867",
			"pcsDate": "2022-05-01",
			"settlementClass": "manage",
			"settlementTypeId": "2038447553852997635",
			"settlementRuleId": "1586641578709483521",
			"settlementStyle": "bothpcsettlement",
			"pcsCreateStyle": "MR",
			"busiDate": "2022-12-01",
			"materialNature": "2",
			"materialAttribute": "7",
			"asset": "1576042123396907009",
			"location": "1584355711230935042",
			"productDate": "2023-01-01",
			"dept": "1525643705855773169",
			"sDept": "1525643705855773169",
			"dDept": "1528679182566948867",
			"sConstCenter": "1534533102750138369",
			"dConstCenter": "1528679182566948867",
			"sStockOrg": "1528441481898491905",
			"dStockOrg": "1528441481898491905",
			"sWarehouse": "106687",
			"dWarehouse": "106687",
			"srcBillId": "2019014725227511808",
			"srcBillNo": "CGRK000020240613000000",
			"srcBillDate": "2024-06-13",
			"srcBillTypeId": "15",
			"srcBillTradeTypeId": "1528679182566948867",
			"saleOrg": "2018992752178495498",
			"purOrg": "2018992752178495498",
			"osmOrg": "2018992752178495498",
			"mmOrg": "1528679182566948867",
			"customer": "2032370458614038533",
			"invoiceSupplierId": "2019013436722118657",
			"supplierId": "2019013436722118657",
			"serviceCode": "0252|000001",
			"serviceTypeCode": "000000000252",
			"periodType": "2032370458614038533",
			"period": "2024-09",
			"dCompanyId": "1772741987656531969",
			"sCompanyId": "1772741987656531969",
			"srcBillLineId": "2131224190548705287",
			"blnTiered": "0",
			"bound": 5,
			"singlePrice": 100,
			"pricingCoefficient": 2,
			"settlementPricing": 200,
			"conversionRate": 1,
			"businessVolumeId": "1788338336770818055",
			"tieredUnikey": "1890760301616562184",
			"blnNew": "0",
			"blnScrap": false,
			"blnGift": "0",
			"invalidDate": "2024-04-01",
			"ownerType": "0",
			"stockStatus": "1939818139783528499",
			"batchNo": "pch001",
			"firstBillTypeId": "20",
			"firstSourceId": "12456",
			"firstUpCode": "20240401000001",
			"firstLineNo": "1000",
			"firstLineId": "2038350470599671809",
			"firstDate": "2024-04-01",
			"lineNo": "3",
			"srcBillLineNo": "35683846",
			"blnAutoCalcCost": false,
			"busiWbs": "2038439333449957382",
			"sourceApplication": "127",
			"orderNo": "QbOJ-000000000-20240709-000006",
			"orderRowNo": "10",
			"orderTransType": "1939818122622009378",
			"costAllocBill": "st_salesout",
			"outputType": "2",
			"rateDate": "2024-07-09",
			"notaxPrice": 23,
			"notaxAmount": 23900,
			"costPrice": 3400,
			"costAmount": 5600,
			"oriCurrency": "2038439333449957382",
			"oriAmount": 3400,
			"oriRate": 1,
			"oriRateType": "0000L6YQ8AVLFUZPXD0000",
			"busiBillDate": "2024-07-09",
			"busiBillTypeId": "1939818122622009378",
			"busiBillId": "1939818122622009378",
			"busiBillNo": "123456",
			"busiBillRowId": "1020202002",
			"busiBillRowNo": "35683846",
			"wbs": "1939818122622009378"
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应消息，成功或者失败原因 示例：success |
| data | object | 是 | 保存成功的单据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": [
		{}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-04-24

新增

请求参数 (60)

更新

请求参数 (29)

删除

请求参数 (5)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

