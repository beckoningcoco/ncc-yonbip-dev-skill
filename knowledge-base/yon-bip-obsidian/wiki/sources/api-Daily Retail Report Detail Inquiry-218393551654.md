---
title: "零售日报详情查询"
apiId: "2183935516549316610"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Daily Retail Report"
domain: "RetailServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Daily Retail Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 零售日报详情查询

>  请求方式	POST | Daily Retail Report (RetailServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/dailyreport/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	零售日报id    示例: 2134228623200092169
code	string	query	否	零售日报单号    示例: TJD20241115000001

## 3. 请求示例

Url: /yonbip/sd/uretail/dailyreport/detail?access_token=访问令牌&id=2134228623200092169&code=TJD20241115000001

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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	数据集
businesstypeid	string	否	业务类型id 示例：1748193698452602889
currency_moneyDigit	number
小数位数:0,最大长度:10	否	币种金额精度 示例：2
currency_priceDigit	number
小数位数:0,最大长度:10	否	币种价格精度 示例：3
code	string	否	日报编码 示例：RL539620250120000009
refundOnly	number
小数位数:0,最大长度:10	否	是否仅退款(0:否,1:是） 示例：0
endDate	date
格式:yyyy-MM-dd HH:mm:ss	否	单据结束时间 示例：2025-01-20 16:31:53
planShipmentDate	date
格式:yyyy-MM-dd HH:mm:ss	否	交货日期 示例：2025-01-20 16:31:44
iMemberid	number
小数位数:0,最大长度:10	否	会员id 示例：0
discount	number
小数位数:2,最大长度:10	否	折扣额 示例：120
bTaxCalculate	boolean	否	已计算税额(true:是,false:否) 示例：true
presellState	number
小数位数:0,最大长度:10	否	预订单状态（0:未交货,1:已交货,2:已退订,3:部分交货） 示例：0
businessDate	date
格式:yyyy-MM-dd HH:mm:ss	否	业务日期 示例：2025-01-20 00:00:00
isCredit	number
小数位数:0,最大长度:10	否	是否赊销(0:否,1:是） 示例：0
postAccountStatus	number
小数位数:0,最大长度:10	否	过账状态(-1:过账失败,-2:未过账,0:不过账,1:过账中,2:过账成功,3:过账失败,99:未过账) 示例：2
rmDailyReportDetail	object	是	零售日报明细集合
rMDailyReportDefineCharacter	object	否	自定义项特征组
currency	string	否	币种id 示例：1748193698452604425
cust_name	string	否	客户名称 示例：直营店客户
id	string	否	日报id 示例：2183234414802108420
shipmentDate	date
格式:yyyy-MM-dd HH:mm:ss	否	交货日期 示例：2025-01-20 16:31:44
makeDate	date
格式:yyyy-MM-dd HH:mm:ss	否	制单日期 示例：2025-01-20 16:31:53
financeOrgId	string	否	开票组织id 示例：1748230583634886664
saveDate	date
格式:yyyy-MM-dd HH:mm:ss	否	保存日期 示例：2025-01-20 16:32:17
takeway	number
小数位数:0,最大长度:10	否	提货方式(0:即提,1:门店自提,2:中心配送,3:本店配送,5:周期配送,6:周期自提,7:他店配送) 示例：0
org	string	否	组织id 示例：1748230583634886664
financeOrgId_name	string	否	开票组织 示例：零售组织
fCardDisApportionSum	number
小数位数:2,最大长度:10	否	卡券折扣金额 示例：0
dept	string	否	部门id 示例：1748230884282597376
store	string	否	门店id 示例：1975876348671950849
businesstypeid_name	string	否	交易类型名称 示例：普通
money	number
小数位数:2,最大长度:10	否	金额 示例：680
fCardApportionSum	number
小数位数:2,最大长度:10	否	卡券结算金额 示例：0
qty	number
小数位数:2,最大长度:10	否	数量 示例：1
deliveryState	number
小数位数:0,最大长度:10	否	交货状态(0:未交货,1:已交货,2:已退订,3:部分交货) 示例：1
headerPrecision	number
小数位数:0,最大长度:10	否	最大数量精度 示例：0
stockOrgId	string	否	库存组织id 示例：1748230583634886664
ibillSource	number
小数位数:0,最大长度:10	否	单据来源(0:门店,1:商城预订,10:小程序普通,11:小程序站长,12:小程序分销,13:小程序周期购,14:小程序付费会员,15:小程序积分商城,16:会员中心) 示例：0
deliveryModify	boolean	否	交货时可修改商品(true:是,false:否) 示例：false
cust	string	否	客户ID 示例：1748274220487933957
startDate	string	否	单据开始时间 示例：2025-01-20 16:31:53
storeCode	string	否	门店编码 示例：5396
traceId	string	否	线索id 示例：d43951cd2d7d26b5

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"businesstypeid": "1748193698452602889",
		"currency_moneyDigit": 2,
		"currency_priceDigit": 3,
		"code": "RL539620250120000009",
		"refundOnly": 0,
		"endDate": "2025-01-20 16:31:53",
		"planShipmentDate": "2025-01-20 16:31:44",
		"iMemberid": 0,
		"discount": 120,
		"bTaxCalculate": true,
		"presellState": 0,
		"businessDate": "2025-01-20 00:00:00",
		"isCredit": 0,
		"postAccountStatus": 2,
		"rmDailyReportDetail": [
			{
				"nativeMoney": 680,
				"offlineUnit": "1765534852250599432",
				"taxsubject": "10006",
				"salesoutid": "2183234474920116227",
				"nativeTaxAmount": 32.38,
				"productName": "鸿星尔克",
				"taxsubject_name": "5%增值税税率",
				"fCardDisApportion": 0,
				"isBack": 0,
				"localtaxPrice": 680,
				"rmDailyReport": "2183234414802108420",
				"oUnitId": "1765534852250599432",
				"mainUnitid_name": "双",
				"outTaxrate": 5,
				"warehouseid": "1975874828271353864",
				"product_precision": 0,
				"product_mainprecision": 0,
				"localnotaxPrice": 647.62,
				"saleoutbillcode": "XS411836",
				"amountMoney": 647.62,
				"id": "2183234414802108421",
				"isSerialNoManage": false,
				"fDiscount": 120,
				"product": "1765535290323632128",
				"quantity": 1,
				"unitName": "双",
				"fCardApportion": 0,
				"fPrice": 680,
				"offlineRate": 1,
				"warehouseid_name": "存量测试门店仓",
				"propertiesValue": "颜色:红;尺码:S;",
				"rMDailyReportDetailCharacters": {
					"wjl001": "1765521048227282945",
					"ytenant": "0000LIV5L9915D6J9E0000",
					"id": "2183234414802108422",
					"pubts": "2025-01-20 16:32:17"
				},
				"nativeAmountMoney": 647.62,
				"modelDescription": "abc",
				"productsku": "1765535891638452226",
				"money": 680,
				"ownertype": 0,
				"fmainUnitQuantity": 1,
				"productcCode": "000015",
				"taxAmount": 32.38,
				"oriMoney": 680,
				"notaxPrice": 647.62,
				"inventoryowner": 0,
				"mainUnitid": "1765534852250599432"
			}
		],
		"rMDailyReportDefineCharacter": {
			"ytenant": "0000LIV5L9915D6J9E0000",
			"ydtzsp00004": "0",
			"id": "2183234414802108423",
			"pubts": "2025-01-20 16:32:17"
		},
		"currency": "1748193698452604425",
		"cust_name": "直营店客户",
		"id": "2183234414802108420",
		"shipmentDate": "2025-01-20 16:31:44",
		"makeDate": "2025-01-20 16:31:53",
		"financeOrgId": "1748230583634886664",
		"saveDate": "2025-01-20 16:32:17",
		"takeway": 0,
		"org": "1748230583634886664",
		"financeOrgId_name": "零售组织",
		"fCardDisApportionSum": 0,
		"dept": "1748230884282597376",
		"store": "1975876348671950849",
		"businesstypeid_name": "普通",
		"money": 680,
		"fCardApportionSum": 0,
		"qty": 1,
		"deliveryState": 1,
		"headerPrecision": 0,
		"stockOrgId": "1748230583634886664",
		"ibillSource": 0,
		"deliveryModify": false,
		"cust": "1748274220487933957",
		"startDate": "2025-01-20 16:31:53",
		"storeCode": "5396"
	},
	"traceId": "d43951cd2d7d26b5"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
code	999	未知服务异常

## 9. 接口变更日志

	序号	修改时间	变更内容概要
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

