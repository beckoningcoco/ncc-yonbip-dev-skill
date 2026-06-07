---
title: "WBS档案查询"
apiId: "2350973615100919811"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "WBS"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, WBS]
platform_version: "BIP"
source_type: community-api-docs
---

# WBS档案查询

>  请求方式	POST | WBS (PMPP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/PMCC/wbs/queryByCondition
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情批量查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
orgId	string	否	否	业务单元Id，业务单元id和编码至少录入一项，同时存在时，以业务组织id为准，来源于业务单元档案 示例：2251561215218176
orgCode	string	否	否	业务单元编码，来源于业务单元档案 示例：999
id	string	否	否	ID 示例：2700147969986817
code	string	否	否	WBS编码 示例：Test-J
name	string	否	否	WBS名称 示例：WBS
projectId	string	否	否	项目id，项目id和编码至少录入一项，当项目id和项目编码同时存在时，以id为准 示例：2700147969970432
projectCode	string	否	否	项目编码 示例：541190001
pubtsBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳开始时间 示例：2024-05-06 17:12:43
pubtsEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳结束时间 示例：2024-05-06 17:12:43
createTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建时间开始时间 示例：2024-05-06 17:12:43
createTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建时间结束时间 示例：2024-05-06 17:12:43
modifyTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	修改时间开始时间 示例：2024-05-06 17:12:43
modifyTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	修改时间结束时间 示例：2024-05-06 17:12:43
page	number
小数位数:0,最大长度:10	否	否	分页页码（不能小于1,默认为1） 默认值：1
count	number
小数位数:0,最大长度:10	否	否	每页数量（不能小于0,默认数量为50） 默认值：50

## 3. 请求示例

Url: /yonbip/PMCC/wbs/queryByCondition?access_token=访问令牌
Body: {
	"orgId": "2251561215218176",
	"orgCode": "999",
	"id": "2700147969986817",
	"code": "Test-J",
	"name": "WBS",
	"projectId": "2700147969970432",
	"projectCode": "541190001",
	"pubtsBegin": "2024-05-06 17:12:43",
	"pubtsEnd": "2024-05-06 17:12:43",
	"createTimeBegin": "2024-05-06 17:12:43",
	"createTimeEnd": "2024-05-06 17:12:43",
	"modifyTimeBegin": "2024-05-06 17:12:43",
	"modifyTimeEnd": "2024-05-06 17:12:43",
	"page": 0,
	"count": 0
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
code	string	否	请求状态编码 示例：请求状态编码
message	string	否	请求描述信息 示例：操作成功
data	object	是	返回数据
id	string	否	wbsId 示例：2700147969986817
code	string	否	wbs编码 示例：541190001
orgId	string	否	业务单元id（来源于业务单元档案） 示例：2251561215218176
finOrgId	string	否	会计主体 示例：1525652227072458756
completionRatio	number
小数位数:2,最大长度:4	否	完工比 示例：26.92
name	string	否	wbs名称 示例：WBS1
wbsDocType	string	否	WBS档类类型 0-项目,1-wbs 示例：0
projectId	string	否	项目ID 示例：2129024849306189834
stageId	string	否	项目阶段 示例：2097143229867098115
planStartDate	date
格式:yyyy-MM-dd	否	计划开始日期 示例：2025-01-01
planEndDate	date
格式:yyyy-MM-dd	否	计划结束日期 示例：2025-08-01
planTime	string	否	计划工期 示例：10
actualStartDate	date
格式:yyyy-MM-dd	否	实际开始日期 示例：2025-01-01
actualEndDate	date
格式:yyyy-MM-dd	否	实际完成日期 示例：2025-08-01
actualTime	string	否	实际工期 示例：10
wbsStatus	string	否	WBS状态 0-未开始，1-进行中，2-已完成 示例：0 默认值：0
wbsScheduleMethod	string	否	编制方式 1-自下而上，0-自上而下 示例：0 默认值：1
costAccountingFlag	string	否	是否成本核算 示例：0 默认值：false
costAccountingStartDate	date
格式:yyyy-MM-dd	否	成本核算启用日期 示例：2025-01-01
stageInspectionFlag	string	否	是否阶段验收：0-否，1是 示例：0 默认值：0
wbsBudgetFlag	string	否	WBS预算属性0-否，1是 示例：0 默认值：0
isGroupingWbs	string	否	是否库存管理WBS 0-否，1是 示例：0 默认值：0
scheduleFlag	string	否	是否计划 0-否，1是 示例：0 默认值：0
scheduleType	string	否	计划类型 示例：1530849206220619786 默认值：1453725457701666823
responsibleId	string	否	责任人id 示例：152995612789728871 默认值：1530682312368324613
departmentId	string	否	责任部门id 示例：1530848201200893960 默认值：1660017847957979142
remark	string	否	备注
sourceId	string	否	来源id 示例：0 默认值：1527104364113035314
sourceType	string	否	WBS来源类型1-项目分解2-计划编制3-项目档案 示例：0
currencyId	string	否	币种 示例：0 默认值：1525643705855773169
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	时间戳 示例：2023-10-21 10:54:40
createTime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间 示例：2023-10-21 10:54:40
modifyTime	date
格式:yyyy-MM-dd HH:mm:ss	否	修改时间 示例：2023-10-21 10:54:40
planHours	number
小数位数:0,最大长度:10	否	计划时长 示例：30
sort	number
小数位数:0,最大长度:10	否	排序号 示例：10
isEnd	number
小数位数:0,最大长度:10	否	是否末级 示例：1
level	number
小数位数:0,最大长度:10	否	层级 示例：3
parent	string	否	上级分类 示例：1525643705855773072
path	string	否	路径 示例：1525643705855773072|

## 5. 正确返回示例

{
	"code": "请求状态编码",
	"message": "操作成功",
	"data": [
		{
			"id": "2700147969986817",
			"code": "541190001",
			"orgId": "2251561215218176",
			"finOrgId": "1525652227072458756",
			"completionRatio": 26.92,
			"name": "WBS1",
			"wbsDocType": "0",
			"projectId": "2129024849306189834",
			"stageId": "2097143229867098115",
			"planStartDate": "2025-01-01",
			"planEndDate": "2025-08-01",
			"planTime": "10",
			"actualStartDate": "2025-01-01",
			"actualEndDate": "2025-08-01",
			"actualTime": "10",
			"wbsStatus": "0",
			"wbsScheduleMethod": "0",
			"costAccountingFlag": "0",
			"costAccountingStartDate": "2025-01-01",
			"stageInspectionFlag": "0",
			"wbsBudgetFlag": "0",
			"isGroupingWbs": "0",
			"scheduleFlag": "0",
			"scheduleType": "1530849206220619786",
			"responsibleId": "152995612789728871",
			"departmentId": "1530848201200893960",
			"remark": "",
			"sourceId": "0",
			"sourceType": "0",
			"currencyId": "0",
			"pubts": "2023-10-21 10:54:40",
			"createTime": "2023-10-21 10:54:40",
			"modifyTime": "2023-10-21 10:54:40",
			"planHours": 30,
			"sort": 10
		}
	],
	"isEnd": 1,
	"level": 3,
	"parent": "1525643705855773072",
	"path": "1525643705855773072|"
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
1032001990099	服务端逻辑异常	咨询开发人员

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

