---
title: "入库单同步"
apiId: "9412be0be1ed4b5dbcd1b27d536952d7"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procure-to-Pay"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procure-to-Pay]
platform_version: "BIP"
source_type: community-api-docs
---

# 入库单同步

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/godownentry/initGodownEntry
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
tenantId	string	否	否	租户id 示例：租户id
data	object	是	否	data
erppurchaseorgvid	string	否	否	erp采购组织版本id 示例：erp采购组织版本id
bcompname	string	否	否	集团公司名称（租户名) 示例：集团公司名称（租户名)
erpstockwh	string	否	否	库存仓库主键 示例：库存仓库主键
maintaxprice	string	否	否	含税单价 示例：含税单价
totalmainnum	string	否	否	主总数量（应收主数量） 示例：主总数量（应收主数量）
actualinnum	string	否	否	实收数量 示例：实收数量,必填
signaturer	string	否	否	签字人主键 示例：签字人主键
taxtypeflag	string	否	否	扣税类别 示例：扣税类别
stkwhcode	string	否	否	库存仓库编码 示例：库存仓库编码
erpsupplybid	string	否	否	供应商主键（表体） 示例：供应商主键（表体）
erppurchasedeptid	string	否	否	采购部门主键 示例：采购部门主键
erpgodownbrowno	string	否	否	对应erp入库单表体行号 示例：对应erp入库单表体行号,必填
taxprice	string	否	否	含税单价 示例：含税单价,必填
erpsupplyid	string	否	否	erp供应商ID 示例： erp供应商ID,必填
price	string	否	否	无税单价 示例：无税单价,必填
invoicedmainnum	string	否	否	累计开票主数量 示例：累计开票主数量,必填
erpreqstoorgid	string	否	否	需求库存组织ID 示例：需求库存组织ID
ctrantypeid	string	否	否	入库类型id 示例：入库类型id
erpstockorgid	string	否	否	库存组织ID 示例：库存组织ID,必填
signpsnname	string	否	否	签字人名称 示例：签字人名称
purorgname	string	否	否	采购组织名称 示例：采购组织名称
purdeptcode	string	否	否	采购部门编码 示例：采购部门编码
dmakedate	string	否	否	制单日期 示例：制单日期
erpsourcebid	string	否	否	Erp来源单据表体行主键（上游单据） 示例：Erp来源单据表体行主键（上游单据）
calcostmny	string	否	否	计成本金额 示例：计成本金额
reqstkorgcode	string	否	否	需求库存组织编码 示例：需求库存组织编码
taxamount	string	否	否	税额 示例：税额,必填
whpsncode	string	否	否	库管员编码 示例：库管员编码
compcode	string	否	否	公司编码 示例：公司编码
erpwarehouse	string	否	否	仓库ID 示例：仓库ID
erpcompanyvid	string	否	否	erp公司版本ID 示例：erp公司版本ID
erpfirstbillbno	string	否	否	Erp源头单据表体行号 示例：Erp源头单据表体行号
erpmainunit	string	否	否	主单位ID 示例：主单位ID
mainunitcode	string	否	否	主单位编码 示例：主单位编码
godownbdate	string	否	否	入库时间 示例：入库时间
erpmaterialid	string	否	否	erp物料主键 示例： erp物料主键,必填
changestdrate	string	否	否	折本汇率 示例：折本汇率
erpsourcehid	string	否	否	Erp来源单据表头主键（入库上游单据） 示例：Erp来源单据表头主键（入库上游单据）
erpcompanybid	string	否	否	公司ID（表体） 示例：公司ID（表体）
erppurchaseorgid	string	否	否	erp采购组织id 示例：erp采购组织id,必填
compname	string	否	否	公司名称 示例：公司名称
erpgodownbid	string	否	否	对应erp入库单表体主键 示例：对应erp入库单表体主键,必填
erpcompanybvid	string	否	否	公司版本主键（表体） 示例：公司版本主键（表体）
erpcurrencyid	string	否	否	币种主键 示例：币种主键
erpfirstbillhid	string	否	否	Erp源头单据表头主键 示例：Erp源头单据表头主键
vtrantypecode	string	否	否	入库类型编码 示例：入库类型编码
whpsnname	string	否	否	库管员名称 示例：库管员名称
bmakeusername	string	否	否	制单人名称 示例：制单人名称
erpgodownno	string	否	否	erp入库单号 示例： erp入库单号,必填
changerate	string	否	否	换算率 示例：换算率
erpstockorgvid	string	否	否	库存组织版本主键 示例：库存组织版本主键
hfanorgname	string	否	否	结算财务组织名称 示例：结算财务组织名称
erpsourcebno	string	否	否	Erp来源单据表体行号 示例：Erp来源单据表体行号
godowndate	string	否	否	入库时间 示例：入库时间,必填
stkwhname	string	否	否	库存仓库名称 示例：库存仓库名称
erppurchaserid	string	否	否	Erp采购员主键 示例：Erp采购员主键
hstoname	string	否	否	仓库名称 示例：仓库名称
erpfanaceorgvid	string	否	否	结算财务组织版本ID 示例：结算财务组织版本ID
signdate	string	否	否	签字日期 示例：签字日期
signpsncode	string	否	否	签字人编码 示例：签字人编码
erpreqstoorgvid	string	否	否	需求库存组织版本ID 示例：需求库存组织版本ID
erpfanaceorgoid	string	否	否	结算财务组织ID 示例：结算财务组织ID
erpsourcetranstype	string	否	否	来源交易类型 示例：来源交易类型
erpcompanyid	string	否	否	公司主键 示例：公司主键
currencycode	string	否	否	币种编码 示例：币种编码
ntotalnum	string	否	否	总数量 示例：总数量
stockorgname	string	否	否	库存组织名称 示例：库存组织名称
hstocode	string	否	否	仓库编码 示例：仓库编码
totalnum	string	否	否	总数量（应收数量） 示例：总数量（应收数量）,必填
unitname	string	否	否	单位名称 示例：单位名称
reqstkorgname	string	否	否	需求库存组织名称 示例：需求库存组织名称
godownstatus	string	否	否	入库状态 示例：入库状态
erpmaterialvid	string	否	否	物料版本主键 示例：物料版本主键
erpgroup	string	否	否	erp集团主键 示例：erp集团主键
taxrate	string	否	否	税率 示例：税率,必填
mainunitname	string	否	否	主单位名称 示例：主单位名称
erpfirstbilltype	string	否	否	源头单据类型 示例：源头单据类型
erpfirsttranstype	string	否	否	源头交易类型 示例：源头交易类型
bcompcode	string	否	否	公司编码（表体） 示例：公司编码（表体）
erppurchasedeptvid	string	否	否	采购部门版本ID 示例：采购部门版本ID
erprececountryid	string	否	否	收货国家ID 示例：收货国家ID
purchasername	string	否	否	采购员名称 示例：采购员名称
purorgcode	string	否	否	采购组织编码 示例：采购组织编码,必填
freplenishflag	string	否	否	是否采购入库 示例：是否采购入库
bmakeusercode	string	否	否	制单人编码 示例：制单人编码
purdeptname	string	否	否	采购部门名称 示例：采购部门名称
mainprice	string	否	否	主无税单价 示例：主无税单价
erpgodownid	string	否	否	erp入库单Id 示例： erp入库单Id,必填
caltaxmny	string	否	否	计税金额 示例：计税金额
erpsourcetype	string	否	否	来源单据类型 示例：来源单据类型
hfanorgcode	string	否	否	结算财务组织编码 示例：结算财务组织编码
erpunit	string	否	否	单位主键 示例：单位主键
billmarker	string	否	否	制单人编码 示例：制单人编码
erpfirstbillhno	string	否	否	源头单据号 示例：源头单据号
erpgodownhid	string	否	否	对应erp入库单表头主键 示例：对应erp入库单表头主键,必填
purchasercode	string	否	否	采购员编号 示例：采购员编号
erpfirstbillbid	string	否	否	源头单据表体主键 示例：源头单据表体主键
unitcode	string	否	否	单位编码 示例：单位编码
currencyname	string	否	否	币种名称 示例：币种名称
stockorgcode	string	否	否	库存组织编码 示例：库存组织编码,必填
taxmny	string	否	否	价税合计 示例：价税合计,必填
actualinmainnum	string	否	否	实收主数量 示例：实收主数量,必填
erpwhsmanager	string	否	否	库管员主键 示例：库管员主键
erpdr	long	否	否	0 示例：0
erpsendcountryid	string	否	否	发货国ID 示例：发货国ID
erpsourcehno	string	否	否	来源单据号 示例：来源单据号
mny	string	否	否	必填的总金额 示例：必填的总金额
purchaseUnitId	string	否	否	采购单位id 多单位 示例：购单位id 多单位
purchaseUnitCode	string	否	否	采购单位code 示例：采购单位code
mainUnitId	string	否	否	主单位id 多单位 示例：主单位id 多单
unitId	string	否	否	计价单位id 示例：计价单位id
purchaseExchRate	BigDecimal	否	否	采购换算率 多单位
priceExchRate	BigDecimal	否	否	计价换算率
actualInPurchaseNum	BigDecimal	否	否	实收采购数量
invoicedNum	BigDecimal	否	否	已开票计价数量
invoicedPurchaseNum	BigDecimal	否	否	已开票采购数量

## 3. 请求示例

Url: /yonbip/cpu/godownentry/initGodownEntry?access_token=访问令牌
Body: {
	"tenantId": "租户id",
	"data": [
		{
			"erppurchaseorgvid": "erp采购组织版本id",
			"bcompname": "集团公司名称（租户名)",
			"erpstockwh": "库存仓库主键",
			"maintaxprice": "含税单价",
			"totalmainnum": "主总数量（应收主数量）",
			"actualinnum": "实收数量,必填",
			"signaturer": "签字人主键",
			"taxtypeflag": "扣税类别",
			"stkwhcode": "库存仓库编码",
			"erpsupplybid": "供应商主键（表体）",
			"erppurchasedeptid": "采购部门主键",
			"erpgodownbrowno": "对应erp入库单表体行号,必填",
			"taxprice": "含税单价,必填",
			"erpsupplyid": " erp供应商ID,必填",
			"price": "无税单价,必填",
			"invoicedmainnum": "累计开票主数量,必填",
			"erpreqstoorgid": "需求库存组织ID",
			"ctrantypeid": "入库类型id",
			"erpstockorgid": "库存组织ID,必填",
			"signpsnname": "签字人名称",
			"purorgname": "采购组织名称",
			"purdeptcode": "采购部门编码",
			"dmakedate": "制单日期",
			"erpsourcebid": "Erp来源单据表体行主键（上游单据）",
			"calcostmny": "计成本金额",
			"reqstkorgcode": "需求库存组织编码",
			"taxamount": "税额,必填",
			"whpsncode": "库管员编码",
			"compcode": "公司编码",
			"erpwarehouse": "仓库ID",
			"erpcompanyvid": "erp公司版本ID",
			"erpfirstbillbno": "Erp源头单据表体行号",
			"erpmainunit": "主单位ID",
			"mainunitcode": "主单位编码",
			"godownbdate": "入库时间",
			"erpmaterialid": " erp物料主键,必填",
			"changestdrate": "折本汇率",
			"erpsourcehid": "Erp来源单据表头主键（入库上游单据）",
			"erpcompanybid": "公司ID（表体）",
			"erppurchaseorgid": "erp采购组织id,必填",
			"compname": "公司名称",
			"erpgodownbid": "对应erp入库单表体主键,必填",
			"erpcompanybvid": "公司版本主键（表体）",
			"erpcurrencyid": "币种主键",
			"erpfirstbillhid": "Erp源头单据表头主键",
			"vtrantypecode": "入库类型编码",
			"whpsnname": "库管员名称",
			"bmakeusername": "制单人名称",
			"erpgodownno": " erp入库单号,必填",
			"changerate": "换算率",
			"erpstockorgvid": "库存组织版本主键",
			"hfanorgname": "结算财务组织名称",
			"erpsourcebno": "Erp来源单据表体行号",
			"godowndate": "入库时间,必填",
			"stkwhname": "库存仓库名称",
			"erppurchaserid": "Erp采购员主键",
			"hstoname": "仓库名称",
			"erpfanaceorgvid": "结算财务组织版本ID",
			"signdate": "签字日期",
			"signpsncode": "签字人编码",
			"erpreqstoorgvid": "需求库存组织版本ID",
			"erpfanaceorgoid": "结算财务组织ID",
			"erpsourcetranstype": "来源交易类型",
			"erpcompanyid": "公司主键",
			"currencycode": "币种编码",
			"ntotalnum": "总数量",
			"stockorgname": "库存组织名称",
			"hstocode": "仓库编码",
			"totalnum": "总数量（应收数量）,必填",
			"unitname": "单位名称",
			"reqstkorgname": "需求库存组织名称",
			"godownstatus": "入库状态",
			"erpmaterialvid": "物料版本主键",
			"erpgroup": "erp集团主键",
			"taxrate": "税率,必填",
			"mainunitname": "主单位名称",
			"erpfirstbilltype": "源头单据类型",
			"erpfirsttranstype": "源头交易类型",
			"bcompcode": "公司编码（表体）",
			"erppurchasedeptvid": "采购部门版本ID",
			"erprececountryid": "收货国家ID",
			"purchasername": "采购员名称",
			"purorgcode": "采购组织编码,必填",
			"freplenishflag": "是否采购入库",
			"bmakeusercode": "制单人编码",
			"purdeptname": "采购部门名称",
			"mainprice": "主无税单价",
			"erpgodownid": " erp入库单Id,必填",
			"caltaxmny": "计税金额",
			"erpsourcetype": "来源单据类型",
			"hfanorgcode": "结算财务组织编码",
			"erpunit": "单位主键",
			"billmarker": "制单人编码",
			"erpfirstbillhno": "源头单据号",
			"erpgodownhid": "对应erp入库单表头主键,必填",
			"purchasercode": "采购员编号",
			"erpfirstbillbid": "源头单据表体主键",
			"unitcode": "单位编码",
			"currencyname": "币种名称",
			"stockorgcode": "库存组织编码,必填",
			"taxmny": "价税合计,必填",
			"actualinmainnum": "实收主数量,必填",
			"erpwhsmanager": "库管员主键",
			"erpdr": 0,
			"erpsendcountryid": "发货国ID",
			"erpsourcehno": "来源单据号",
			"mny": "必填的总金额",
			"purchaseUnitId": "购单位id 多单位",
			"purchaseUnitCode": "采购单位code",
			"mainUnitId": "主单位id 多单",
			"unitId": "计价单位id",
			"purchaseExchRate": 0,
			"priceExchRate": 0,
			"actualInPurchaseNum": 0,
			"invoicedNum": 0,
			"invoicedPurchaseNum": 0
		}
	]
}

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
result	string	否	返回状态

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"result": ""
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
004	ERP入库单同步失败!	向服务方咨询
001	租户参数为空	向服务方咨询

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
新增
请求参数 (9)
更新
请求参数 (109)
更新
返回参数 result
删除
错误码 002
删除
错误码 003

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

