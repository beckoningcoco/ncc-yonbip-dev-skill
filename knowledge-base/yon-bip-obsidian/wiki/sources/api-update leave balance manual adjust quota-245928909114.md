---
title: "休假额度更新手工调整值"
apiId: "2459289091141271558"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Leave Quota"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Leave Quota]
platform_version: "BIP"
source_type: community-api-docs
---

# 休假额度更新手工调整值

>  请求方式	POST | Leave Quota (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/time/leave/updateManualAdjustQuota
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
leaveTypeId	string	否	是	休假类型
staffId	string	否	是	员工id
year	string	否	是	年份
manualAdjustQuota	string	否	是	手工调整变动值
month	string	否	否	月度假 1-12，季度假30-33，半年假40-41
remark	string	否	否	备注
modifierUserId	string	否	否	操作人
modifierStaffId	string	否	否	操作人
items	object	是	否	加班转调休子账户
itemType	string	否	否	子账户类型
manualAdjustQuota	string	否	否	子账户手工调整变动值
remark	string	否	否	备注

## 3. 请求示例

Url: /yonbip/HCC/time/leave/updateManualAdjustQuota?access_token=访问令牌
Body: {
	"leaveTypeId": "",
	"staffId": "",
	"year": "",
	"manualAdjustQuota": "",
	"month": "",
	"remark": "",
	"modifierUserId": "",
	"modifierStaffId": "",
	"items": [
		{
			"itemType": "",
			"manualAdjustQuota": "",
			"remark": ""
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
code	string	否	返回信息码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	是	信息集
id	string	否	主键id 示例：9b031cccd4c3463dacea85e4a3780126
tenantId	string	否	租户id 示例：e1dpehzh
staffId	string	否	员工id 示例：2079349291340032
schemeId	string	否	假期方案id 示例：28f58ea2a7ef4ec4b7e0f55f1001bc54
leaveType	string	否	休假类别 示例：31e9eb6927444a6c81121f1aebdc067f
leaveRefId	string	否	公共休假类别的id 示例：e1dpehzhleavetype00001
year	string	否	年度 示例：2021
beginDateTime	date
格式:yyyy-MM-dd HH:mm:ss	否	有效期开始日期 示例：2022-12-02 00:20:06
endDateTime	date
格式:yyyy-MM-dd HH:mm:ss	否	有效期结束日期 示例：2022-12-02 00:20:06
month	string	否	月 示例：11
lastEndDateTime	date
格式:yyyy-MM-dd HH:mm:ss	否	延长有效期结束日期 示例：2022-12-02 00:20:06
curQuota	number
小数位数:8,最大长度:38	否	本期额度 示例：0.0000
preForwardQuota	number
小数位数:8,最大长度:38	否	上期结转 示例：0.0000
manualAdjustQuota	number
小数位数:8,最大长度:38	否	手工调整 示例：0.0000
initialRestQuota	number
小数位数:8,最大长度:38	否	初始已休 示例：0.0000
usedQuota	number
小数位数:8,最大长度:38	否	已休 示例：0.0000
usedQuotaApproving	number
小数位数:8,最大长度:38	否	已休(审核中) 示例：0.0000
usedQuotaApproved	number
小数位数:8,最大长度:38	否	已休(已审核) 示例：0.0000
restQuota	number
小数位数:8,最大长度:38	否	可休 示例：0.0000
clearingState	number
小数位数:0,最大长度:38	否	结算状态 0:未结算 1:已结算 示例：0
invalidState	number
小数位数:0,最大长度:38	否	作废状态 0:未作废 1:已作废 示例：0
periodType	string	否	假期期间类型[0：按考勤年 1：按入职周年 2:按照考勤月 3:自定义] 示例：0
source	number
小数位数:0,最大长度:38	否	休假额度来源 0:公式计算 1:手工录入 示例：1
planQuota	number
小数位数:2,最大长度:38	否	计划额度

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "9b031cccd4c3463dacea85e4a3780126",
			"tenantId": "e1dpehzh",
			"staffId": "2079349291340032",
			"schemeId": "28f58ea2a7ef4ec4b7e0f55f1001bc54",
			"leaveType": "31e9eb6927444a6c81121f1aebdc067f",
			"leaveRefId": "e1dpehzhleavetype00001",
			"year": "2021",
			"beginDateTime": "2022-12-02 00:20:06",
			"endDateTime": "2022-12-02 00:20:06",
			"month": "11",
			"lastEndDateTime": "2022-12-02 00:20:06",
			"curQuota": 0,
			"preForwardQuota": 0,
			"manualAdjustQuota": 0,
			"initialRestQuota": 0,
			"usedQuota": 0,
			"usedQuotaApproving": 0,
			"usedQuotaApproved": 0,
			"restQuota": 0,
			"clearingState": 0,
			"invalidState": 0,
			"periodType": "0",
			"source": 1,
			"planQuota": 0
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

