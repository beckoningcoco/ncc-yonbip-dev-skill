---
title: "工时汇报保存V2"
apiId: "2235124354134835206"
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

# 工时汇报保存V2

>  请求方式	POST | Working Hrs Report (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/v2/workhoursmaintain/save
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
data	object	否	是	单据数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	否	主键， 新增时无需填写，修改时必填 示例：1957365595279616
orgId	number
小数位数:0,最大长度:19	否	否	工厂id，id和编码同时存在，以id为准 示例：1866605942198527
orgCode	string	否	否	工厂编码，id和编码同时存在，以id为准 示例：zzygc
vouchdate	date
格式:yyyy-MM-dd	否	否	业务日期 示例：2022-04-20
transTypeId	string	否	否	交易类型id或code 示例：1712793547098292224
remarks	string	否	否	备注 示例：工时汇报备注信息
_status	string	否	是	操作标识，新增-Insert，修改-Update，不变-Unchange 示例：Insert
workHourReportDetail	object	是	否	工时汇报详情

## 3. 请求示例

Url: /yonbip/mfg/v2/workhoursmaintain/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 1957365595279616,
		"orgId": 1866605942198527,
		"orgCode": "zzygc",
		"vouchdate": "2022-04-20",
		"transTypeId": "1712793547098292224",
		"remarks": "工时汇报备注信息",
		"_status": "Insert",
		"workHourReportDetail": [
			{
				"id": 2236705331680903184,
				"productOrderLineId": 2235111821535084571,
				"orderCode": "2237365579823448073",
				"orderLineNo": 10,
				"orderProcessId": 2237368259883040774,
				"sn": 10,
				"workCenter": "2235114699132764167",
				"consumptionCategory": 0,
				"workCategory": 0,
				"shiftId": "2267134530742648835",
				"teamId": "2235116279680729089",
				"deviceId": "2235116545968701445",
				"staffId": "2235116760747474948",
				"actualPrepareTime": "3",
				"actualProcessTime": "3",
				"timeUnit": 1,
				"_status": "Insert"
			}
		]
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
code	string	否	单据编号
code	string	否	单据编号
code	string	否	返回状态code 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	data
id	string	否	主键 示例：2740176022868224
code	string	否	单据编号 示例：WH20250320000002
status	string	否	单据状态 示例：1
orgId	string	否	工厂id 示例：2036615013323008
orgIdName	string	否	组织名称 示例：Amy测试
vouchdate	string	否	业务日期 示例：2022-04-20 00:00:00
pubts	string	否	时间戳 示例：2025-03-20 09:01:29
transTypeId	string	否	交易类型id 示例：1997611082204054307
transTypeName	string	否	交易类型 示例：工时汇报
transTypeCode	string	否	交易类型code 示例：WH01
remarks	string	否	备注 示例：工时汇报备注
createType	string	否	创建方式 示例：0
verifystate	string	否	审批状态 示例：2
isWfControlled	string	否	是否审批流控制 示例：false
creatorId	string	否	创建人id 示例：1998343502991196166
creator	string	否	创建人 示例：张三
createTime	string	否	创建时间 示例：2025-03-20 09:01:28
createDate	string	否	创建日期 示例：2025-03-20 00:00:00
workHourReportDetail	object	是	工时汇报详情

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "2740176022868224",
		"code": "WH20250320000002",
		"status": "1",
		"orgId": "2036615013323008",
		"orgIdName": "Amy测试",
		"vouchdate": "2022-04-20 00:00:00",
		"pubts": "2025-03-20 09:01:29",
		"transTypeId": "1997611082204054307",
		"transTypeName": "工时汇报",
		"transTypeCode": "WH01",
		"remarks": "工时汇报备注",
		"createType": "0",
		"verifystate": "2",
		"isWfControlled": "false",
		"creatorId": "1998343502991196166",
		"creator": "张三",
		"createTime": "2025-03-20 09:01:28",
		"createDate": "2025-03-20 00:00:00",
		"workHourReportDetail": [
			{
				"id": "2226790116211294214",
				"lineno": "10",
				"productOrderId": "2740176022868224",
				"productOrderIdCode": "SCDD20250319000047",
				"productOrderLineId": "2740176022868225",
				"orderLineNo": "10",
				"productOrderAuditDate": "2025-03-20 00:00:00",
				"productDeptId": "2036615013323008",
				"productDeptIdName": "生产一部",
				"productId": "1997611082204054307",
				"productName": "铝合金板材",
				"productCode": "WL20250320001",
				"orderProcessId": "2740176022868226",
				"orderProcessIdSn": "1",
				"snOperationName": "切割",
				"workCenter": "2740176022868227",
				"workCenterName": "加工中心A区",
				"batchNo": "PC20250320001",
				"consumptionCategory": "1",
				"workCategory": "1",
				"teamId": "2740176022868231",
				"teamIdName": "班组A",
				"teamIdCode": "BZ20250320001",
				"staffId": "2740176022868232",
				"staffIdName": "张三",
				"staffIdCode": "RY20250320001",
				"deviceId": "2740176022868233",
				"deviceIdName": "切割机001",
				"deviceIdCode": "SB20250320001",
				"actualPrepareTime": "2.5",
				"actualProcessTime": "5.0",
				"planProcessTime": "4.5",
				"planPrepareTime": "2.0",
				"timeUnit": "1",
				"shiftId": "2267134530742648835",
				"shiftIdName": "班次A",
				"shiftIdCode": "BC"
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
	1	2025-06-25	
更新
请求说明
	2	2025-04-10	
新增
请求参数 orderCode
新增
请求参数 orderLineNo
新增
请求参数 orderProcessId
更新
请求参数 productOrderLineId

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

