---
title: "转移申请保存"
apiId: "2357004711283392512"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer Application"
domain: "ASSAA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 转移申请保存

>  请求方式	POST | Transfer Application (ASSAA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/transferapply/save
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
data	object	否	是	请求数据
bill_code	string	否	是	单据编码 示例：ZYSQ202509110001
bill_date	string	否	否	单据日期 示例：2025-09-11
pk_org	string	否	是	资产组织 示例：2097842201331499014
pk_applier	string	否	是	申请人 示例：2097843421112696834
pk_applydept	string	否	是	申请部门 示例：2097842416079863809
bill_type	string	否	否	单据类型 示例：5B01 默认值：5B01
transi_type	string	否	否	交易类型 示例：5B01-01 默认值：5B01-01
pk_transitype	string	否	否	交易类型 示例：2097839796130414602
bodyvos	object	是	否	表体数据
_status	string	否	是	操作 示例：Insert

## 3. 请求示例

Url: /yonbip/ACC/transferapply/save?access_token=访问令牌
Body: {
	"data": {
		"bill_code": "ZYSQ202509110001",
		"bill_date": "2025-09-11",
		"pk_org": "2097842201331499014",
		"pk_applier": "2097843421112696834",
		"pk_applydept": "2097842416079863809",
		"bill_type": "5B01",
		"transi_type": "5B01-01",
		"pk_transitype": "2097839796130414602",
		"bodyvos": [
			{
				"auto_receive": 0,
				"pk_equip": "2226950215325712391",
				"pk_receiver_after": "2226947646927929347",
				"pk_receivedept_after": "2097842416079863809",
				"pk_location_before": "2097842416079863809",
				"pk_costcenter_before": "2097842416079863809",
				"pk_profitcenter_before": "2295276539359526923",
				"pk_jobmngfil_before": "2097842416079863809",
				"pk_receiver": "2097844915736150021",
				"pk_receivedept": "2097842416079863809",
				"pk_location_after": "2295276539359526923",
				"pk_costcenter_after": "2097842416079863809",
				"pk_profitcenter_after": "2097842416079863809",
				"pk_jobmngfil_after": "2097842416079863809",
				"close_flag": true,
				"progress_status": 0,
				"_status": "Insert"
			}
		],
		"_status": "Insert"
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
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	number
小数位数:0,最大长度:10	否	返回结果编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：2
pk_applier	string	否	申请人 示例：2232233592134041607
bill_date	string	否	单据日期 示例：2025-09-09
bill_code	string	否	单据编码 示例：ZYSQ202509090001
pk_org	string	否	资产组织 示例：2074711466078371850
pk_transitype	string	否	交易类型 示例：1419633579209523200
bill_type	string	否	单据类型 示例：5B01
id	string	否	单据主表主键 示例：2355237615777087491
pubts	string	否	时间戳 示例：2025-09-09 10:42:26
tenant	string	否	租户 示例：0000M0BRKC5ZFGRFNQ0000
creator	string	否	创建人 示例：b5afb217-2474-496d-808e-e2bf2ecfaa69
billmaketime	string	否	制单时间 示例：2025-09-09 10:42:25
audittime	string	否	审核时间 示例：2025-09-09 10:42:26
sysid	string	否	系统标识 示例：SAA
isWfControlled	boolean	否	是否流程核心单据 示例：false
auditor	string	否	审核人 示例：b5afb217-2474-496d-808e-e2bf2ecfaa69
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：1
pk_applydept	string	否	申请部门 示例：2074711990064381959
billmaker	string	否	制单人 示例：b5afb217-2474-496d-808e-e2bf2ecfaa69
transi_type	string	否	交易类型 示例：5B01-01
creationtime	string	否	创建时间 示例：2025-09-09 10:42:25
bodyvos	object	是	bodyvos
errorDetail	string	否	错误信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"returncount": 0,
		"verifystate": 2,
		"pk_applier": "2232233592134041607",
		"bill_date": "2025-09-09",
		"bill_code": "ZYSQ202509090001",
		"pk_org": "2074711466078371850",
		"pk_transitype": "1419633579209523200",
		"bill_type": "5B01",
		"id": "2355237615777087491",
		"pubts": "2025-09-09 10:42:26",
		"tenant": "0000M0BRKC5ZFGRFNQ0000",
		"creator": "b5afb217-2474-496d-808e-e2bf2ecfaa69",
		"billmaketime": "2025-09-09 10:42:25",
		"audittime": "2025-09-09 10:42:26",
		"sysid": "SAA",
		"isWfControlled": false,
		"auditor": "b5afb217-2474-496d-808e-e2bf2ecfaa69",
		"bill_status": 1,
		"pk_applydept": "2074711990064381959",
		"billmaker": "b5afb217-2474-496d-808e-e2bf2ecfaa69",
		"transi_type": "5B01-01",
		"creationtime": "2025-09-09 10:42:25",
		"bodyvos": [
			{
				"pk_receiver": "2091201580693979138",
				"auto_receive": 0,
				"close_flag": false,
				"pk_receiver_after": "2232233592134041607",
				"id": "2355237615777087492",
				"main_id": "2355237615777087491",
				"pk_location_after": "2091211081163735041",
				"pk_equip": "2319577266839879690",
				"pk_receivedept_after": "2074711990064381958",
				"progress_status": 1,
				"pk_receivedept": "2074711990064381958",
				"name_spec_model": "领借用资产_0723_4"
			}
		]
	},
	"errorDetail": ""
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
999	报错具体提示信息，例如：服务端逻辑异常	查看日志找对应异常服务定位产生原因

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

