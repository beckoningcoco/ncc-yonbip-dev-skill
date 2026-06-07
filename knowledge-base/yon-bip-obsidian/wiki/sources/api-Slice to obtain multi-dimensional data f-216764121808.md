---
title: "切片获取单元格多维数据"
apiId: "2167641218087911429"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "ABC Analysis"
domain: "EPM"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 切片获取单元格多维数据

>  请求方式	POST | ABC Analysis (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/abca/cube/queryCubeDataBySlicing
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
cubeCode	string	否	是	模型编码 示例：cubeCode
dimMembersList	object	是	是	维度成员 示例：[{"ENTITY":["LA003"],"YEARS":["2024"],"PERIOD":["7"],"SCENARIO":["Budget"],"CURRENCY":["CNY"],"VERSION":["v0"]}]
keyPropMap	object	否	否	主键映射，如平台维度成员使用ID场景 示例：{ "ENTITY": "code" }
filterDims	object	是	否	参与过滤的维度 示例：["ACCOUNT"]
filterDataType	number
小数位数:0,最大长度:2	否	否	数据过滤形式：[0:不过滤,1:只查询base数据,2:做了空数据过滤,3:做了0数据过滤,4:做了空和0数据过滤,5:切片脚本查询,6:带文本的切片脚本查询(只查询Base数据)] 默认值：5
sandbox	string	否	否	沙箱
syscode	string	否	是	系统编码,作业成本：ABCA 示例:ABCA 示例：ABCA

## 3. 请求示例

Url: /yonbip/qyjx/abca/cube/queryCubeDataBySlicing?access_token=访问令牌
Body: {
	"cubeCode": "cubeCode",
	"dimMembersList": [
		{
			"ENTITY": [
				"LA003"
			],
			"YEARS": [
				"2024"
			],
			"PERIOD": [
				"7"
			],
			"SCENARIO": [
				"Budget"
			],
			"CURRENCY": [
				"CNY"
			],
			"VERSION": [
				"v0"
			]
		}
	],
	"keyPropMap": {
		"ENTITY": "code"
	},
	"filterDims": [
		"ACCOUNT"
	],
	"filterDataType": 0,
	"sandbox": "",
	"syscode": "ABCA"
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
code	number
小数位数:2,最大长度:10	否	状态码 示例：200
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
success	boolean	否	请求是否成功
data	object	否	返回数据
cubeDatas	object	是	多维数据 示例：[{"path":{"ENTITY": "LA003","YEARS": "2024","PERIOD": "7","ACCOUNT": "hjpAcc4","SCENARIO": "Budget","CURRENCY": "CNY","VERSION": "v0"},"value": "50000"} ]

## 5. 正确返回示例

{
	"code": 200,
	"success": true,
	"data": {
		"cubeDatas": [
			{
				"path": {
					"ENTITY": "LA003",
					"YEARS": "2024",
					"PERIOD": "7",
					"ACCOUNT": "hjpAcc4",
					"SCENARIO": "Budget",
					"CURRENCY": "CNY",
					"VERSION": "v0"
				},
				"value": "50000"
			}
		]
	}
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

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

