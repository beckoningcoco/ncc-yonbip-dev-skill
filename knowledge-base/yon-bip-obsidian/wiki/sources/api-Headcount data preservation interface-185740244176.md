---
title: "编制数据保存接口"
apiId: "1857402441767059465"
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

# 编制数据保存接口

>  请求方式	POST | Headcount Allocation (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/saveNumber
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
allocationList	object	是	是	数据列表
periodId	number
小数位数:0,最大长度:19	否	是	期间id，必填 示例：1981907771450720257
esoPlanNumber	number
小数位数:0,最大长度:10	否	否	计划编制本级数 示例：3
organizationName	string	否	否	组织名称 示例：菊花组织
strictControlFlag	boolean	否	否	是否严控 示例：true
periodName	string	否	是	期间名称，必填，用于期间匹配 示例：2024年编制期间-第1月度
allocationId	number
小数位数:0,最大长度:19	否	否	allocationId 示例：1992609077619851265
type	number
小数位数:0,最大长度:10	否	是	编制数据类型：type=1表示编制下达数据，type=2表示编制分解数据 示例：1
schemaName	string	否	否	方案名称 示例：jing-test
dptAllocatedNumber	number
小数位数:0,最大长度:10	否	否	部门已分配数 示例：0
planNumber	number
小数位数:0,最大长度:10	否	是	计划编制数 示例：45
organizationId	string	否	是	组织id 示例：1951690718036099080
split	object	是	否	编制拆分列表
controlFlag	boolean	否	否	controlFlag 示例：false
organizationCode	string	否	是	组织机构编码，必填，用于组织匹配 示例：jh
schemaId	number
小数位数:0,最大长度:19	否	否	方案id 示例：1992608897231224833
releaseStatus	number
小数位数:0,最大长度:10	否	是	下达状态：1=未下达，2=已下达 示例：1
maintainMode	number
小数位数:0,最大长度:10	否	否	方案维护方式 示例：2
unitId	string	否	否	unitId 示例：1951690718036099080
orgAllocatedNumber	number
小数位数:0,最大长度:10	否	否	组织已分配数 示例：33
id	number
小数位数:0,最大长度:19	否	是	编制数据id，必填 示例：1992609077619851265
pubts	string	否	否	时间戳，格式：yyyy-MM-dd HH:mm:ss 示例：2024-08-27 15:06:39
cycleName	string	否	否	周期名称 示例：月度周期

## 3. 请求示例

Url: /yonbip/hrcloud/saveNumber?access_token=访问令牌
Body: {
	"allocationList": [
		{
			"periodId": 1981907771450720257,
			"esoPlanNumber": 3,
			"organizationName": "菊花组织",
			"strictControlFlag": true,
			"periodName": "2024年编制期间-第1月度",
			"allocationId": 1992609077619851265,
			"type": 1,
			"schemaName": "jing-test",
			"dptAllocatedNumber": 0,
			"planNumber": 45,
			"organizationId": "1951690718036099080",
			"split": [
				{
					"esoPlanNumber": 1,
					"strictControlFlag": true,
					"originalSplitId": 1992609773404553223,
					"allocationId": 1992609077619851265,
					"id": 1992609773404553223,
					"splitId": 1992609773404553223,
					"planNumber": 2,
					"composizeDimension": [
						{
							"schemaDimensionItemId": 1992608897231224846,
							"dimensionItemCode": "02",
							"composizeDimensionId": 1992609773404553224,
							"schemaDimensionId": 1992608897231224843,
							"dimensionCode": "1",
							"id": 1992609773404553224,
							"dimensionItemName": "实习生",
							"dimensionName": "人员类别（英）"
						}
					],
					"_convert_composizeDimension": "ok",
					"periodId": 1981907771450720257,
					"schemaId": 1992608897231224833
				}
			],
			"controlFlag": false,
			"organizationCode": "jh",
			"schemaId": 1992608897231224833,
			"releaseStatus": 1,
			"maintainMode": 2,
			"unitId": "1951690718036099080",
			"orgAllocatedNumber": 33,
			"id": 1992609077619851265,
			"pubts": "2024-08-27 15:06:39",
			"cycleName": "月度周期"
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
code	int	否	返回码 示例：200
message	string	否	返回信息 示例：保存成功
data	string	否	返回数据 示例：保存成功

## 5. 正确返回示例

{
	"code": 200,
	"message": "保存成功",
	"data": "保存成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2024-12-06	
新增
请求参数 (25)
更新
请求参数 (17)
删除
请求参数 (11)
新模型

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

