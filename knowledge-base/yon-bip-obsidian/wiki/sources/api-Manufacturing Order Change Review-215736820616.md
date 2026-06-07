---
title: "生产订单变更审核"
apiId: "2157368206169735171"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "MO Change"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, MO Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 生产订单变更审核

>  请求方式	POST | MO Change (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/productionorderchange/audit
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	生产订单变更数据集
id	long	否	否	生产订单变更Id 示例：2188538959925504

## 3. 请求示例

Url: /yonbip/mfg/productionorderchange/audit?access_token=访问令牌
Body: {
	"data": {
		"id": 2188538959925504
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
code	long	否	返回码，调用成功时返回200 示例：200
message	string	否	message 示例：操作成功
message	string	否	接口返回信息 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
data	object	否	接口返回数据
verifystate	long	否	审批状态，-1：驳回；0：开立；1：已提交；2：已审批 示例：2
code	string	否	单据编号 示例：SCDD202103180001
isWfControlled	boolean	否	是否审批流控制，true：是；false：否 示例：false
auditor	string	否	审核人 示例：u8c_vip@163.com
auditorId	long	否	审核人id 示例：1430419077140736
auditTime	string	否	审核时间 示例：2021-04-26 20:21:22
transTypeId	string	否	交易类型id 示例：1248018423173517
id	long	否	单据id 示例：2179165275443456
pubts	string	否	时间戳 示例：2021-04-26 20:21:20
tenant	long	否	租户id 示例：1292161350684928
status	long	否	订单状态： 0-开立，1-已审核 示例：1
auditDate	string	否	审核日期 示例：2021-04-26 00:00:00

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"verifystate": 2,
		"code": "SCDD202103180001",
		"isWfControlled": false,
		"auditor": "u8c_vip@163.com",
		"auditorId": 1430419077140736,
		"auditTime": "2021-04-26 20:21:22",
		"transTypeId": "1248018423173517",
		"id": 2179165275443456,
		"pubts": "2021-04-26 20:21:20",
		"tenant": 1292161350684928,
		"status": 1,
		"auditDate": "2021-04-26 00:00:00"
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
	1	2026-04-20	
新增
请求参数 (41)
更新
请求参数 (18)
新增
返回参数 (13)
更新
返回参数 (28)
修改工序序列参数说明
	2	2025-12-19	
新增
请求参数 reserveTypeId
新增
请求参数 reserveid
新增
返回参数 (5)
更新
返回参数 (7)
	3	2025-09-05	
更新
请求参数 (4)
更新
返回参数 (7)
作业改名资源
	4	2025-06-24	
新增
请求参数 remark
新增
请求参数 remark

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

