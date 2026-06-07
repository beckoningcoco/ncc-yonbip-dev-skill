---
title: "保存频率信息"
apiId: "2127593886572347401"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Frequency"
domain: "HRCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Frequency]
platform_version: "BIP"
source_type: community-api-docs
---

# 保存频率信息

>  请求方式	POST | Frequency (HRCS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/frequency/openApi/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	数据列表
id	number
小数位数:2,最大长度:36	否	否	id 示例：12333333333
code	string	否	是	频率编码 示例：1111xxxx
name	object	否	是	频率名称
enable	number
小数位数:0,最大长度:10	否	是	启用状态 示例：1
source	number
小数位数:0,最大长度:10	否	是	来源 示例：2
yearCoefficient	number
小数位数:0,最大长度:10	否	否	yearCoefficient 示例：11
beginDate	string	否	否	beginDate 示例：2024-10-30
endDate	string	否	否	endDate 示例：9999-12-31 00:00:00
desc	object	否	否	desc
distributionSite	string	否	否	站点id 示例：2131870514359566345

## 3. 请求示例

Url: /yonbip/hrcloud/frequency/openApi/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 12333333333,
			"code": "1111xxxx",
			"name": {
				"zh_CN": "测试110111118",
				"zh_TW": "繁体",
				"en_US": "test"
			},
			"enable": 1,
			"source": 2,
			"yearCoefficient": 11,
			"beginDate": "2024-10-30",
			"endDate": "9999-12-31 00:00:00",
			"desc": {
				"zh_TW": "繁体说明",
				"zh_CN": "中文说明",
				"en_US": "test_desc"
			},
			"distributionSite": "2131870514359566345"
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
小数位数:0,最大长度:10	否	编码 示例：200
message	string	否	提示信息 示例：操作成功
traceId	string	否	traceId 示例：057e5ebe062762f3
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"traceId": "057e5ebe062762f3",
	"uploadable": "0"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

