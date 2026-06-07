---
title: "《税金补提单》查询接口"
apiId: "2201136886346416131"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Accrual"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Accrual]
platform_version: "BIP"
source_type: community-api-docs
---

# 《税金补提单》查询接口

>  请求方式	POST | Tax Accrual (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxoth/api/accrual/query-supp-list
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
pageIndex	number
小数位数:0,最大长度:10	否	是	第几页 示例：1
pagesize	number
小数位数:0,最大长度:10	否	是	每页大小 示例：20
searchParam	object	否	是	数据的搜索项
nsrsbhs	string	是	否	纳税人识别号，会计主体编码和纳税人识别号必输一项 最大请求量：100
orgCodes	string	是	否	会计主体编码，纳税人识别号和会计主体编码必输一项 最大请求量：100
accrualStart	string	否	否	计提所属期起（yyyy-MM） 示例：2025-01
accrualEnd	string	否	否	计提所属期止（yyyy-MM） 示例：2025-01
taxTypes	string	是	否	申报内容 61：房产税从价,62：房产税从租,1：增值税,42：城市维护建设税,43：教育费附加,44：地方教育附加,21：消费税,3：企业所得税,5：印花税,10：环境保护税,23：资源税,6：房产税,14：城镇土地使用税,22：耕地占用税,30：土地增值税,25：车船税,24：契税,26：车辆购置税,7：工会经费,9：残疾人就业保障金,8：文化事业建设费,15：水利建设专项费

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/accrual/query-supp-list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pagesize": 20,
	"searchParam": {
		"nsrsbhs": [
			""
		],
		"orgCodes": [
			""
		],
		"accrualStart": "2025-01",
		"accrualEnd": "2025-01",
		"taxTypes": [
			""
		]
	}
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
code	string	否	状态码 示例：200
message	string	否	信息 示例：操作成功
data	string	否	响应信息
msg	string	否	消息 示例：成功
datas	object	是	数据
pageIndex	number
小数位数:0,最大长度:10	否	第几页 示例：1
pagesize	number
小数位数:0,最大长度:10	否	每页大小 示例：20
recordCount	number
小数位数:0,最大长度:10	否	总数
recordList	object	是	计提数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": "200",
		"msg": "成功",
		"datas": [
			{
				"pageIndex": 1,
				"pagesize": 20,
				"recordCount": 0,
				"recordList": [
					{
						"code": "SJJT2025011300008",
						"declareStart": "2023-11-01",
						"declareEnd": "2023-11-30",
						"accrualPeriod": "",
						"accrualAmountSum": 111123123,
						"nsrsbh": "",
						"nsrmc": "",
						"fileObjects": [
							{
								"fileName": "",
								"filePath": "",
								"fileSize": ""
							}
						],
						"supplyItemApiQueryResps": [
							{
								"reportType": "",
								"remark": "",
								"accrualAmount": 0,
								"orgCode": "",
								"orgName": "",
								"accrualStart": "2023-11-01",
								"accrualEnd": "2023-11-01",
								"supplyAmount": 0,
								"actualAmount": 0
							}
						],
						"supplyAmountSum": 0,
						"actualAmount": 0
					}
				]
			}
		]
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
9999	系统异常	错误提示信息

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

