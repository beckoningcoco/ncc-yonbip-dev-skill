---
title: "编制数据查询接口"
apiId: "1857385330617352193"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Headcount Allocation"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Headcount Allocation]
platform_version: "BIP"
source_type: community-api-docs
---

# 编制数据查询接口

>  请求方式	POST | Headcount Allocation (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/queryNumber
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
schemaId	number
小数位数:0,最大长度:20	否	否	编制方案Id 示例：2109017955455467520
periodId	number
小数位数:0,最大长度:20	否	否	编制期间Id 示例：2261997371911045126
orgIds	string	否	否	组织id列表，用逗号隔开 示例：2122293493207924738,2122293493207924740
released	boolean	否	否	是否已下达或已分解 示例：true
composizeDimension	object	是	否	编制维度 示例：[{"dimensionCode":"01","dimensionItemCodes":"001,002"}]
dimensionCode	string	否	否	维度编码 示例：“002“
dimensionItemCodes	string	否	否	维度项编码，用逗号隔开 示例："01,02“
exactlyMatchComposizeDimension	boolean	否	否	是否精确匹配编制维度条件 示例：false
timePoint	string	否	否	查询时间点，如果不填，则查询全量信息 示例：2023-11-08 00:00:00
pageIndex	int	否	否	页号,如果不填，默认值为1 示例：1 默认值：1
pageSize	int	否	否	每页记录数，如果不填，默认值为20 示例：20 默认值：20

## 3. 请求示例

Url: /yonbip/hrcloud/queryNumber?access_token=访问令牌
Body: {
	"schemaId": 2109017955455467520,
	"periodId": 2261997371911045126,
	"orgIds": "2122293493207924738,2122293493207924740",
	"released": true,
	"composizeDimension": [
		{
			"dimensionCode": "01",
			"dimensionItemCodes": "001,002"
		}
	],
	"exactlyMatchComposizeDimension": false,
	"timePoint": "2023-11-08 00:00:00",
	"pageIndex": 1,
	"pageSize": 20
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
code	int	否	返回码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	业务数据对象
pageIndex	int	否	页码 示例：1
pageSize	int	否	每页记录数 示例：20
recordCount	int	否	总记录数 示例：30
recordList	object	是	数据列表
pageCount	int	否	总页数 示例：4
beginPageIndex	int	否	起始页 示例：1
endPageIndex	int	否	结束页 示例：1

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 30,
		"recordList": [
			{
				"occupyNumber": 1.2,
				"periodId": 1783203608881266691,
				"realNumber": 1,
				"organizationName": "部门型组织下的组织",
				"periodName": "7月份期间",
				"type": 1,
				"dptAllocatedNumber": 0,
				"planNumber": 2,
				"organizationId": "1635342066844172297",
				"split": [
					{
						"occupyNumber": 1,
						"periodId": 1783203608881266691,
						"dimensionItemCode": "0000000002",
						"realNumber": 0,
						"periodDimensionItemId": 1790545778154930181,
						"dimensionCode": "001",
						"allocationId": 1791483472604299266,
						"pubts": "2023-09-13 17:13:28",
						"dimensionItemName": "硕士",
						"periodDimensionId": 1790545778154930180,
						"dimensionName": "学位",
						"planNumber": 1,
						"strictControlFlag": true
					}
				],
				"organizationCode": "00000024",
				"releaseStatus": 2,
				"orgAllocatedNumber": 1,
				"id": 1791483472604299266,
				"pubts": "2023-11-08 10:32:20",
				"strictControlFlag": true
			}
		],
		"pageCount": 4,
		"beginPageIndex": 1,
		"endPageIndex": 1
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
500	查询失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-18	
新增
请求参数 (8)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

