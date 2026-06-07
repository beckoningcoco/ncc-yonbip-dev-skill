---
title: "根据时间区间查询项目"
apiId: "1570061707963269123"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据时间区间查询项目

>  请求方式	POST | Project (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/project/findProjectsBetweenDate
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
startDate	Date	否	是	开始时间（格式：yyyy-MM-dd） 示例：2022-03-09
endDate	Date	否	是	结束时间（格式：yyyy-MM-dd） 示例：2022-06-10
page	int	否	否	分页页码（不能小于1） 示例：1 默认值：1
count	int	否	否	每页大小（不能小于0） 示例：10 默认值：10

## 3. 请求示例

Url: /yonbip/pm/project/findProjectsBetweenDate?access_token=访问令牌
Body: {
	"startDate": "2022-03-09",
	"endDate": "2022-06-10",
	"page": 1,
	"count": 10
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	string	否	请求状态编码 示例：200
message	string	否	请求状态描述 示例：操作成功
data	object	是	返回数据
pageIndex	int	否	分页页数 示例：0
pageSize	int	否	分页数量 示例：10
recordCount	int	否	数据总量 示例：681
pageCount	int	否	分页总页数 示例：69
beginPageIndex	int	否	分页首页 示例：1
endPageIndex	int	否	分页末页 示例：10
recordList	object	是	数据集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"pageIndex": 0,
			"pageSize": 10,
			"recordCount": 681,
			"pageCount": 69,
			"beginPageIndex": 1,
			"endPageIndex": 10,
			"recordList": [
				{
					"custManagerId": "2469713902162176",
					"sourceId": "2470856582779136",
					"parent": 2482098809869312,
					"departmentId": "2469710188007680",
					"modifier": "9e3c430e-3b79-471f-9445-08236a39f6c8",
					"estiIncomeMny": 50000,
					"natEstiExpendMny": 10000,
					"dr": 0,
					"constrPeriod": 999,
					"deliveryList": [
						{
							"unitPrice": 88.5,
							"totalMny": 8849.56,
							"productId": 2470767201440000,
							"totalTaxMny": 10000,
							"ytenant": "0000KUM991V7BR516C0000",
							"orgId": "2469709537334528",
							"dr": 0,
							"contractObjectId": "2471000024240385",
							"taxRate": 13,
							"qty": 100,
							"unitTaxPrice": 100,
							"id": 2471000429842688,
							"pubts": "2021-12-22 20:44:40",
							"projectId": "2470856672137472",
							"finOrgId": "2469709537334528",
							"skuId": 2470767213220096,
							"cqtUnitId": 2470766143344896,
							"defines": {
								"define1": "",
								"define2": ""
							}
						}
					],
					"path": "2470856672137472|",
					"natCurrencyId": "2469603733737984",
					"modifyTime": "2021-12-10 19:23:37",
					"projectDate": "2021-10-12 00:00:00",
					"settlementBasis": 2,
					"estiExpendMny": 10000,
					"id": 2470856672137472,
					"currencyId": "2469603733737984",
					"natEstiIncomeMny": 50000,
					"estiManDays": 55,
					"isWfControlled": false,
					"level": 1,
					"natEstiProfitMny": 40000,
					"expectSignDate": "2021-10-12 00:00:00",
					"isEnd": false,
					"txStatus": 0,
					"sourceType": "PMC1001-02",
					"keyFlag": false,
					"name": "用友网络科技股份有限公司",
					"finOrgId": "2469709537334528",
					"verifystate": 2,
					"configs": {
						"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
						"createTime": "2021-10-12 11:25:23",
						"projectFileId": "2470856668434944",
						"scheduleModelType": 1,
						"ytenant": "0000KUM991V7BR516C0000",
						"id": 2699275895493476,
						"pubts": "2022-04-20 11:27:31",
						"projectId": 2470856672137472,
						"wbsScheduleMethod": 0,
						"dr": 0
					},
					"code": "00000002",
					"exchRate": 1,
					"orgId": "2469709537334528",
					"customerId": 2470769264939264,
					"pubts": "2022-06-09 17:26:47",
					"planEndDate": "2024-07-06 00:00:00",
					"projectStatusId": 1461150837626634461,
					"exchRateTypeId": "0000KUM991V7BR516C0000",
					"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
					"projectFileId": "2470856668434944",
					"ytenant": "0000KUM991V7BR516C0000",
					"managerId": "2481053510357248",
					"projectStatus": 12,
					"projectTypeId": "2643576439952128",
					"createTime": "2021-10-12 11:25:23",
					"estiProfitMny": 40000,
					"planStartDate": "2021-10-12 00:00:00",
					"categoryId": "2470770940957184",
					"salesOrgId": "2469709537334528",
					"orgName": "用友网络科技股份有限公司",
					"orgCode": "10",
					"categoryCode": "00000001",
					"categoryName": "希望类",
					"managerName": "王策",
					"customerCode": "01",
					"customerName": "项目云事业部",
					"custManagerName": "追忆蓝星",
					"salesOrgCode": "10",
					"salesOrgName": "",
					"projectStatusName": "立项",
					"projectStatusCode": "20",
					"finOrgCode": "10",
					"exchangerate_name": "基准汇率",
					"finOrgCurrencyMoneyDigit": 4,
					"currency_name": "人民币",
					"finOrgCurrencyPriceDigit": 4,
					"finOrgExchangerateId": "0000KUM991V7BR516C0000",
					"finOrgCurrency": "2469603733737984",
					"currency_code": "CNY",
					"finOrgName": "用友网络科技股份有限公司",
					"finOrgCurrencyId": "2469603733737984",
					"currencyName": "人民币",
					"currencyMoneyRount": 4,
					"currencyPriceRount": 4,
					"currencyCurrTypeSign": "¥",
					"currencyPriceDigit": 4,
					"currencyCode": "CNY",
					"currencyMoneyDigit": 4,
					"departmentName": "项目云",
					"departmentCode": "0101",
					"exchagerateTypeCode": "01",
					"exchagerateTypeId": "0000KUM991V7BR516C0000",
					"exchagerateTypeName": "基准汇率",
					"natCurrencyCode": "CNY",
					"natCurrencyPriceRount": 4,
					"natCurrencyCurrTypeSign": "¥",
					"natCurrencyPriceDigit": 4,
					"natCurrencyName": "人民币",
					"natCurrencyMoneyRount": 4,
					"projectTypeName": "通用项目",
					"projectTypeCode": "projectType0",
					"defines": {
						"define1": "",
						"define2": ""
					}
				}
			]
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
0	未传入优惠券档案id	coupon_id值填写有误
1032001990099	其他异常	稍后重试
1032001990001	未接收到参数	检查是否填写了参数
1032001990002	开始时间和结束时间不能为空	检查是否输入了时间区间
1032001990003	开始时间不能晚于结束时间	检查开始时间是否晚于结束时间
1032001990004	分页信息异常，页码从1开始，每页大小不能小于0	检查分页页码是否小于1，每页大小是否小于0

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

