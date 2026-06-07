---
title: "差旅费报销单列表查询"
apiId: "1cc64e397f1c4a32ac17fb0fdd7a946d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Travel Expense Report"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Travel Expense Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 差旅费报销单列表查询

>  请求方式	POST | Travel Expense Report (ZNBZ)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/znbz/rbsm/api/bill/travelexpbill/list
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageSize	number
小数位数:2,最大长度:10	否	是	每页行数 示例：20
pageIndex	number
小数位数:2,最大长度:10	否	是	页号 示例：1
code	string	否	否	编码 示例：12
status	number
小数位数:2,最大长度:10	否	否	单据状态(0:待提交;1:审批完成;3:审批中) 示例：0
open_vouchdate_begin	string	否	否	单据日期开始时间, 格式为:yyyy-MM-dd 示例：2021-07-01
open_vouchdate_end	string	否	否	单据日期结束时间, 格式为:yyyy-MM-dd 示例：2021-07-02
vreason	string	否	否	报销说明 示例：你好
cfinaceorg	string	否	否	费用承担组织id 示例：1837963849289957378
bustype	string	否	否	交易类型id 示例：1837319990757819631
pubts	string	否	否	时间戳开始时间|时间戳结束时间 例如：2021-05-06 23:10:00|2021-05-08 12:09:00 示例：2021-05-06 23:10:00|2021-05-08 12:09:00
simpleVOs	object	是	否	简单查询条件
field	string	否	否	字段(pubts:时间戳、creator:创建人名称) 示例：pubts
op	string	否	否	比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between
value1	string	否	否	查询条件值1 示例：2021-07-01 00:00:00
value2	string	否	否	查询条件值2 示例：2021-07-31 23:59:59

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/travelexpbill/list?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"code": "12",
	"status": 0,
	"open_vouchdate_begin": "2021-07-01",
	"open_vouchdate_end": "2021-07-02",
	"vreason": "你好",
	"cfinaceorg": "1837963849289957378",
	"bustype": "1837319990757819631",
	"pubts": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "between",
			"value1": "2021-07-01 00:00:00",
			"value2": "2021-07-31 23:59:59"
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
code	string	否	返回编码 示例：200
displayCode	string	否	异常码
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	返回数据
pageIndex	long	否	页号 示例：1
pageSize	long	否	每页行数 示例：10
recordCount	long	否	总记录数 示例：1042
recordList	object	是	当前页记录
pageCount	long	否	总页数 示例：105
beginPageIndex	long	否	起始页数 示例：1
endPageIndex	long	否	结束页数 示例：10
sumRecordList	object	否	合计值

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1042,
		"recordList": [
			{
				"vhandledeptid": "1961983235248384",
				"chandleorg": "1961970750984448",
				"returncount": 0,
				"verifystate": 0,
				"code": "000008",
				"bustype_name": "普通报销单交易类型1",
				"npaymentmny": 100,
				"modifier": "19904568888",
				"creatorId": 1951632935211264,
				"modifierId": 1951632935211264,
				"chandleorg_name": "福建中烟工业有限责任公司",
				"nshouldpaymny": 100,
				"vouchdate": "2019-12-10 00:00:00",
				"modifyTime": "2020-11-06 16:21:57",
				"cfinaceorg": "1961970750984448",
				"ismulticurrency": false,
				"iswithholdingcav": false,
				"id": 1989845555466496,
				"ishaveloanbill": false,
				"pubts": "2021-06-30 10:08:12",
				"vreason": "11111111",
				"createDate": "2020-11-06 00:00:00",
				"isdeferexpense": false,
				"vfinacedeptid_name": "行政部-福建中烟",
				"vattachmentass": "4z4Kma0Qq6yMuZmsTrCKRE54wk8mKa7D",
				"creator": "19904568888",
				"modifyDate": "2020-11-06 00:00:00",
				"ncavmny": 0,
				"isWfControlled": false,
				"vfinacedeptid": "1961982461595904",
				"nexpensemny": 100,
				"isfinished": false,
				"dcostdate": "2019-12-10 00:00:00",
				"bustype": "1987017269809408",
				"cfinaceorg_name": "福建中烟工业有限责任公司",
				"nsummny": 100,
				"createTime": "2020-11-06 16:15:37",
				"vhandledeptid_name": "烟叶一科-福建中烟",
				"pk_billtype": "znbzbx_expensebill",
				"status": 0
			}
		],
		"pageCount": 105,
		"beginPageIndex": 1,
		"endPageIndex": 10,
		"sumRecordList": {
			"nnataccpaymny": 0,
			"nsummny": 0,
			"ncavmny": 0,
			"npaymentmny": 0,
			"nnatshouldpaymny": 0,
			"nnatpaymentmny": 0,
			"nexpensemny": 0,
			"nnatexpensemny": 0,
			"nnatcavmny": 0,
			"naccpaymny": 0,
			"nshouldpaymny": 0,
			"nnatsummny": 0
		}
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1021000999999	服务器异常	请联系系统管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-11	
新增
返回参数 displayCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

