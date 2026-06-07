---
title: "社保：删除社保档案接口"
apiId: "2108845254821019651"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Social Security File"
domain: "CPSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Social Security File]
platform_version: "BIP"
source_type: community-api-docs
---

# 社保：删除社保档案接口

>  请求方式	POST | Social Security File (CPSM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/insuranceArchive/delArchiveForByd
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量删除
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
ids	string	是	否	社保档案id集合，与archiveinfos二者不可同时为空 示例：["1443254018194276354","1443254018194276355"]
archiveInfos	object	是	否	社保档案信息集合
detailId	string	否	否	社保档案详情id 示例：2003051130816823306
staffId	string	否	是	社保档案员工id 示例：1447681253300502529
orgId	string	否	是	社保档案任职组织id 示例：1450613367330308098
manageOrgId	string	否	否	社保档案子表管理组织id 示例：2672109798838528
insuranceYearMonth	string	否	否	社保档案子表年月 示例：2024-10
insuranceTypeIds	string	是	否	社保档案子表险种id集合 示例：["2639347241652480","2639347241652482"]

## 3. 请求示例

Url: /yonbip/hrcloud/insuranceArchive/delArchiveForByd?access_token=访问令牌
Body: {
	"ids": [
		"1443254018194276354",
		"1443254018194276355"
	],
	"archiveInfos": [
		{
			"detailId": "2003051130816823306",
			"staffId": "1447681253300502529",
			"orgId": "1450613367330308098",
			"manageOrgId": "2672109798838528",
			"insuranceYearMonth": "2024-10",
			"insuranceTypeIds": [
				"2639347241652480",
				"2639347241652482"
			]
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
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
code	number
小数位数:0,最大长度:10	否	响应码200成功，999失败 示例：999
errMsg	string	否	错误信息 示例：该员工存在待减员信息，不能进行删除操作！
traceId	string	否	traceId 示例：89707d7b21806803
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": 999,
		"errMsg": "该员工存在待减员信息，不能进行删除操作！\n"
	},
	"traceId": "89707d7b21806803",
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

