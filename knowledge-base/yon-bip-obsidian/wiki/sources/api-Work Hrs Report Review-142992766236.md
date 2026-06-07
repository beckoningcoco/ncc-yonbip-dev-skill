---
title: "工时汇报审核"
apiId: "1429927662369374208"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Working Hrs Report"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Working Hrs Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 工时汇报审核

>  请求方式	POST | Working Hrs Report (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/workhoursmaintain/batchaudit
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	工时汇报数据集
id	string	否	否	单据id，id和code同时传入，以id为准，无论id是否正确，id优先级大于code 示例：2247035758837235719
code	string	否	否	单据code，id和code同时传入，以id为准，无论id是否正确，id优先级大于code 示例：WH20250416000021

## 3. 请求示例

Url: /yonbip/mfg/workhoursmaintain/batchaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "2247035758837235719",
			"code": "WH20250416000021"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
code	int	否	返回码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
count	int	否	操作记录数 示例：1
sucessCount	int	否	成功记录数 示例：1
failCount	int	否	失败记录数 示例：0
messages	string	是	结果信息
infos	object	是	单据信息
failInfos	object	是	失败信息

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
			{
				"vouchdate": "2022-04-21 00:00:00",
				"id": 2741504896357376,
				"pubts": "2022-04-21 17:18:44",
				"orgId": "2578616857580032",
				"status": 1,
				"verifystate": 2,
				"auditor": "YonSuite默认用户",
				"auditorId": NaN,
				"auditTime": "2022-04-21 17:18:44",
				"auditDate": "2022-04-21 00:00:00"
			}
		],
		"failInfos": [
			{
				"id": 2740176022868224,
				"message": "非开立态单据不可审核"
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
0	未传入优惠券档案id	coupon_id值填写有误
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-04-16	
新增
请求参数 code
更新
请求参数 data
更新
请求参数 id
工时汇报审核添加code

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

