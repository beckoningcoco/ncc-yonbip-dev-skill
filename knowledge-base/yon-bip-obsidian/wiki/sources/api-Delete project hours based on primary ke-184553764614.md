---
title: "基于项目维度填报项目工时"
apiId: "1845537646146748420"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Working Hour"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Working Hour]
platform_version: "BIP"
source_type: community-api-docs
---

# 基于项目维度填报项目工时

>  请求方式	POST | Project Working Hour (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/workHour/import
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
data	object	否	否	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
projectCode	string	否	否	项目编码 示例：00000091
projectId	string	否	否	项目ID，项目ID和编码至少录入一项，项目ID和项目编码同时存在，以项目ID为准 示例：1436530349981564934
submitterStaffCode	string	否	否	项目成员编码 示例：0023
submitterStaffId	string	否	否	项目成员ID，项目成员ID和编码至少录入一项，项目成员ID和项目成员编码同时存在，以项目成员ID为准 示例：1466274476011814914
reportFromDate	Date	否	是	开始日期 示例：2022-11-09
reportToDate	Date	否	是	结束日期 示例：2022-11-09
dailyFromTime	Time	否	否	填报开始时间,填报方式为按小时填报时可以为空，其他情况必填 示例：08:00:00
dailyToTime	Time	否	否	填报结束时间,填报方式为按小时填报时可以为空，其他情况必填 示例：18:00:00
fillerId	string	否	否	填报人ID，填报人ID和编码至少录入一项，填报人ID和填报人编码同时存在，以填报人ID为准 示例：1499729797431951369
fillerCode	string	否	否	填报人编码 示例：000000000000000000909029
projectScheduleTaskId	string	否	否	项目活动ID，项目活动ID与项目活动编码同时存在时，以项目活动ID为准 示例：2002121931737792513
projectScheduleTaskCode	string	否	否	项目活动编码 示例：RWXZ202405210001
fillMethod	number
小数位数:0,最大长度:2	否	否	填报方式：1按照日期填报，2按照小时填报，默认为1 示例：1 默认值：1
workhours	number
小数位数:6,最大长度:10	否	否	工时 示例：8
description	string	否	否	备注(可支持255个字符) 示例：工时备注

## 3. 请求示例

Url: /yonbip/pm/workHour/import?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"projectCode": "00000091",
		"projectId": "1436530349981564934",
		"submitterStaffCode": "0023",
		"submitterStaffId": "1466274476011814914",
		"reportFromDate": "2022-11-09",
		"reportToDate": "2022-11-09",
		"dailyFromTime": "08:00:00",
		"dailyToTime": "18:00:00",
		"fillerId": "1499729797431951369",
		"fillerCode": "000000000000000000909029",
		"projectScheduleTaskId": "2002121931737792513",
		"projectScheduleTaskCode": "RWXZ202405210001",
		"fillMethod": 1,
		"workhours": 8,
		"description": "工时备注"
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
code	long	否	请求状态编码 示例：200
message	string	否	请求状态编码 示例：操作成功
data	object	是	返回结果
id	string	否	工时上报ID 示例：2080071757136920582
projectId	string	否	项目ID 示例：1956800543487688711
orgId	string	否	组织ID 示例：1852753964327501825
fillDate	string	否	填报日期 示例：2022-08-31

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"id": "2080071757136920582",
			"projectId": "1956800543487688711",
			"orgId": "1852753964327501825",
			"fillDate": "2022-08-31"
		}
	]
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
1032001990093	项目ID和项目编码不允许同时为空	检查项目ID和编码是否为空
1032001990097	项目不存在	检查项目ID或者编码是否正确
1032001990092	项目成员ID和项目成员编码不允许同时为空	检查项目成员ID和编码是否为空
1032001990091	项目成员不存在	检查项目成员ID或者编码是否正确
1032001990094	填报人ID和填报人编码不允许同时为空	检查填报人ID或者编码是否为空
1032001990095	填报人不存在	检查填报人ID或者编码是否正确
1032001990099	服务端逻辑异常	联系开发人员
1032001990198	填报方式为按照小时填报，工时不能为空	填报方式为按照小时填报，工时不能为空
1032001990199	填报开始时间不能为空	填报开始时间不能为空
1032001990200	填报结束时间不能为空	填报结束时间不能为空
1032001990201	备注不可超过255个字符	备注不可超过255个字符
1001001000003	未查询到工作日历，请先维护!	未查询到工作日历，请先维护!
1032001990202	每日填报小时超过24小时	每日填报小时超过24小时
1032001990203	按照小时填报,工时需要大于0	按照小时填报,工时需要大于0

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

