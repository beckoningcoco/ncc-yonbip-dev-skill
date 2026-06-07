---
title: "工程变更申请列表查询"
apiId: "2126961014529327113"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Engineering Change Request"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Engineering Change Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 工程变更申请列表查询

>  请求方式	POST | Engineering Change Request (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/apply/ecn/list
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
pageIndex	number
小数位数:0,最大长度:10	否	是	当前页，默认当前页为1 示例1
pageSize	number
小数位数:0,最大长度:10	否	是	每页数目,最大值1000，默认每页10条数据，示例10
isSum	boolean	否	否	默认false 查表头+表体，为true时只查表头 默认值：false
vouchdateStart	date
格式:yyyy-MM-dd	否	否	单据日期开始，单据日期结束时间为空的时候，默认查询当前日期数据
vouchdateEnd	date
格式:yyyy-MM-dd	否	否	单据日期结束，单据日期开始时间为空的时候，默认查询当前日期数据
orgId	string	否	否	组织ID
orgCode	string	否	否	组织编码
transTypeId	string	否	否	交易类型ID
transTypeCode	string	否	否	交易类型编码
code	string	否	否	单据编号
productId	string	否	否	物料ID
productCode	string	否	否	物料编码
applyDeptId	string	否	否	申请部门ID
applyDeptCode	string	否	否	申请部门编码
applyUserId	string	否	否	申请人ID
applyUserCode	string	否	否	申请人编码
applyOrgId	string	否	否	申请组织ID
applyOrgCode	string	否	否	申请组织编码
changeReasonId	string	否	否	变更原因ID
changeReasonCode	string	否	否	变更原因编码
changeTypeId	string	否	否	变更类型ID
changeTypeCode	string	否	否	变更类型编码
status	number
小数位数:0,最大长度:10	否	否	单据状态：0:开立,1:已审核,2:已关闭,3:审核中

## 3. 请求示例

Url: /yonbip/mfg/apply/ecn/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"isSum": true,
	"vouchdateStart": "2026-06-07",
	"vouchdateEnd": "2026-06-07",
	"orgId": "",
	"orgCode": "",
	"transTypeId": "",
	"transTypeCode": "",
	"code": "",
	"productId": "",
	"productCode": "",
	"applyDeptId": "",
	"applyDeptCode": "",
	"applyUserId": "",
	"applyUserCode": "",
	"applyOrgId": "",
	"applyOrgCode": "",
	"changeReasonId": "",
	"changeReasonCode": "",
	"changeTypeId": "",
	"changeTypeCode": "",
	"status": 0
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
code	string	否	接口调用返回码，成功时返回200 示例：200
code	string	否	单据编号
code	string	否	单据编号
message	string	否	接口调用返回信息 示例：操作成功
data	object	否	接口调用返回数据
pageIndex	number
小数位数:0,最大长度:10	否	当前页数 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页条数 示例：10
recordCount	number
小数位数:0,最大长度:10	否	总条数 示例：2
recordList	object	是	数据集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 2,
		"recordList": [
			{
				"id": 2142208998834176019,
				"code": "ECR2024111201",
				"vouchdate": "2024-11-12 00:00:00",
				"orgId": "2085065094632308746",
				"orgName": "自动化_普通组织",
				"applyUserId": "2107446624476725256",
				"applyUserName": "自动化_工作中心",
				"applyDeptId": 2137941940265549826,
				"applyDeptName": "维尔薇二",
				"transTypeId": "2082132198896959708",
				"transTypeName": "通用工程变更申请",
				"applyOrgId": "2085065094632308746",
				"applyOrgName": "自动化_普通组织",
				"changeReasonId": 2085091852291145731,
				"changeReason": "自动化_工程变更原因",
				"changeTypeId": 2085091843701211143,
				"changeType": "自动化_工程变更类型",
				"status": 0,
				"ecrDetail!id": 2142208998834176020,
				"ecrDetail!lineNo": 10,
				"ecrDetail!content": "123123",
				"ecrDetail!acdType": 0
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

