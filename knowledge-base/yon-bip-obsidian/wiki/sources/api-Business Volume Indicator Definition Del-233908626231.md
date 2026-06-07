---
title: "业务量指标定义删除"
apiId: "2339086262318137346"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Volume Indicator Definition"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Volume Indicator Definition]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务量指标定义删除

>  请求方式	POST | Business Volume Indicator Definition (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/FCC/yonbip-fi-epub/businessvolumeindex/bill/batchdelete
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
billnum	string	否	否	单据编码 示例：fiepub_business_volume_index_list 默认值：fiepub_business_volume_index_list
data	object	是	否	请求数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	ID 示例：2339075765426978821
code	string	否	否	编码 示例：aaa
name	object	否	否	名称
indicatorType	string	否	否	指标类别 示例：fixed
indicatorStatus	string	否	否	启用状态 示例：2
indicatorUnit	string	否	否	指标单位ID 示例：1526290038214623237
indicatorUnit_name	string	否	否	指标单位名称 示例：秒
businessDesc	object	否	否	业务描述

## 3. 请求示例

Url: /yonbip/FCC/yonbip-fi-epub/businessvolumeindex/bill/batchdelete?access_token=访问令牌
Body: {
	"billnum": "fiepub_business_volume_index_list",
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "2339075765426978821",
			"code": "aaa",
			"name": {
				"zh_CN": "aaa"
			},
			"indicatorType": "fixed",
			"indicatorStatus": "2",
			"indicatorUnit": "1526290038214623237",
			"indicatorUnit_name": "秒",
			"businessDesc": {}
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
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	响应数据
count	number
小数位数:0,最大长度:10	否	总条数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功条数 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败条数 示例：0
messages	string	是	失败的提示信息
infos	string	是	成功的数据
failInfos	string	是	失败的数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			""
		],
		"failInfos": [
			""
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
999	业务逻辑异常	业务逻辑异常

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

