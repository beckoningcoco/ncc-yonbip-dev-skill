---
title: "冲销明细查询"
apiId: "2253841976239063042"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Plan Operation"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Plan Operation]
platform_version: "BIP"
source_type: community-api-docs
---

# 冲销明细查询

>  请求方式	POST | Plan Operation (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/requirementsplanning/getConsumInfo
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
data	object	否	是	参数
orgId	string	否	是	组织id 示例：1608788551787872266
orderDocumentType	string	否	是	单据类型编码 10.销售订单 ,40.组织间需求 ,50.调拨申请 ,250.调拨订单 示例：10
docLineId	string	是	是	单据行id 示例：["1608788551787872266","1608788551787872267"]
pageIndex	number
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:4	否	是	每页行数 示例：10 默认值：10

## 3. 请求示例

Url: /yonbip/mfg/requirementsplanning/getConsumInfo?access_token=访问令牌
Body: {
	"data": {
		"orgId": "1608788551787872266",
		"orderDocumentType": "10",
		"docLineId": [
			"1608788551787872266",
			"1608788551787872267"
		],
		"pageIndex": 1,
		"pageSize": 10
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
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	返回码，调用成功时返回200 示例：200
code	string	否	单据编号
code	string	否	单据编号
message	string	否	操作记录 示例：操作成功
data	object	否	数据信息
pageIndex	number
小数位数:0,最大长度:10	否	页号 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页行数 示例：1
recordCount	number
小数位数:0,最大长度:10	否	行总数 示例：4
recordList	object	是	冲销数据
pageCount	number
小数位数:0,最大长度:10	否	页码数 示例：4
beginPageIndex	number
小数位数:0,最大长度:10	否	开始页码 示例：2
endPageIndex	number
小数位数:0,最大长度:10	否	结束页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 4,
		"recordList": [
			{
				"consumDocNo": "YCD20240111000001",
				"consumDocId": 1904710072015519747,
				"consumDocLineId": 1904710072015519748,
				"docLineNo": "10",
				"fcRootDocNo": "YCD20240111000001",
				"docLineId": 1904711489346863111,
				"docNo": "UO-123720240111000001",
				"productId": 1898796383108333571,
				"consumDocQty": 100,
				"consumQty": 100,
				"rootDocDate": "2024-01-12 00:00:00",
				"consumReqDate": "2024-01-11 00:00:00",
				"docQty": 360,
				"fcDocumentType": 20,
				"_status": "Unchanged",
				"_realtype": "true",
				"_entityName": "mr.planworkbench.MrpConsum",
				"_keyName": "id"
			}
		],
		"pageCount": 4,
		"beginPageIndex": 2,
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
0	未传入优惠券档案id	coupon_id值填写有误
310008	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
更新
请求说明
	2	2025-04-29	
新增
请求参数 pageIndex
新增
请求参数 pageSize
新增
返回参数 (25)
删除
返回参数 (26)
	3	2025-04-28	
更新
请求参数 orgId

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

