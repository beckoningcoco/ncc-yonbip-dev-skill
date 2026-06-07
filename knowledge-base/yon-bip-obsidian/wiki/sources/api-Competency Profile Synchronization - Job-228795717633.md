---
title: "胜任力档案同步-职配"
apiId: "2287957176332320775"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Competency Management"
domain: "TLNT"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Competency Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 胜任力档案同步-职配

>  请求方式	POST | Competency Management (TLNT)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/yonbip-hr-cpt/cptArchive/jobMatchSync
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
YonBIP-Accept-Language	string	header	否	多语请求参数    示例: *
Body参数
名称	类型	数组	必填	描述
syncItems	object	是	是	同步数据请求体 最大请求量：100
bizUniqueKey	string	否	是	业务唯一键 示例：testwang25061001
staffId	string	否	否	BIP员工Id 示例：1949545321422389250
staffCode	string	否	否	BIP员工编码
totalScore	number
小数位数:2,最大长度:10	否	是	评估总分 示例：40.1
matchLevel	string	否	否	匹配等级
matchDegree	number
小数位数:2,最大长度:10	否	否	匹配度
overView	string	否	否	综合评价 示例：综合评价示例：优秀符合同意
bizActivityName	string	否	是	业务活动名称 示例：活动示例1
bizActivityUniqueKey	string	否	是	业务活动唯一键 示例：testwang250610-act-1
bizDateTime	number
小数位数:0,最大长度:13	否	是	业务发起时间戳 示例：1749462854000
bizYear	string	否	否	业务所属年度 示例：2024
archiveSyncDetailList	object	是	是	胜任力档案明细
categoryInfoList	object	是	否	档案明细分类信息

## 3. 请求示例

Url: /yonbip/hrcloud/yonbip-hr-cpt/cptArchive/jobMatchSync?access_token=访问令牌
Header: 
	YonBIP-Accept-Language : "*"
Body: {
	"syncItems": [
		{
			"bizUniqueKey": "testwang25061001",
			"staffId": "1949545321422389250",
			"staffCode": "",
			"totalScore": 40.1,
			"matchLevel": "",
			"matchDegree": 0,
			"overView": "综合评价示例：优秀符合同意",
			"bizActivityName": "活动示例1",
			"bizActivityUniqueKey": "testwang250610-act-1",
			"bizDateTime": 1749462854000,
			"bizYear": "2024",
			"archiveSyncDetailList": [
				{
					"entryCode": "2023110902",
					"entryName": "词条示例1",
					"evalScore": 18,
					"scoreRangeStart": 0,
					"scoreRangeEnd": 20,
					"categoryKey": "category1-1"
				}
			],
			"categoryInfoList": [
				{
					"categoryName": "分类示例1",
					"categoryUniqueKey": "category1-1",
					"parentUniqueKey": "root",
					"level": 0,
					"orderIndex": 1
				}
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
traceId	string	否	traceId 示例：aa5276192d752b29

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"traceId": "aa5276192d752b29"
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

