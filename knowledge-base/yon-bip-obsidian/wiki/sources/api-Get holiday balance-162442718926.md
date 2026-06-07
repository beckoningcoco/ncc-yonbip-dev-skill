---
title: "获取假期余额"
apiId: "1624427189269168131"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Leave Quota"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Leave Quota]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取假期余额

>  请求方式	GET | Leave Quota (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/leave/queryOneTotalBalance
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
leavetypeid	string	query	是	休假类型    示例: 11
userId	string	query	否	用户userId（staffId 或 userId 必填其一，建议 staffId）    示例: 11
staffId	string	query	否	员工id（staffId 和 userId取其一，有 staffId 优先用 staffId）    示例: 11
year	string	query	否	年份
month	string	query	否	月份

## 3. 请求示例

Url: /yonbip/hrcloud/time/leave/queryOneTotalBalance?access_token=访问令牌&leavetypeid=11&userId=11&staffId=11&year=&month=

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
data	object	否	信息集
id	string	否	主键id 示例：9b031cccd4c3463dacea85e4a3780126
ts	long	否	时间戳 示例：1610124019000
creationtime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间 示例：2022-12-02 00:20:06
creator	string	否	创建人 示例：timeTaskLeave
modifiedtime	date
格式:yyyy-MM-dd HH:mm:ss	否	修改时间 示例：2022-12-02 00:20:0600
modifier	string	否	修改人 示例：timeTaskLeave
tenantid	string	否	租户id 示例：e1dpehzh
staffid	string	否	员工id 示例：2079349291340032
schemeid	string	否	假期方案id 示例：28f58ea2a7ef4ec4b7e0f55f1001bc54
leavetype	string	否	休假类别 示例：31e9eb6927444a6c81121f1aebdc067f
leaverefid	string	否	设置引用预置休假类别的id 示例：e1dpehzhleavetype00001
year	string	否	年度 示例：2021
begindatetime	DateTime	否	有效期开始日期 示例：2022-12-02 00:20:06
enddatetime	DateTime	否	有效期结束日期 示例：2022-12-02 00:20:06
lastenddatetime	DateTime	否	延长有效期结束日期 示例：2022-12-02 00:20:06
curquota	BigDecimal	否	本期额度 示例：0.0000
preForwardQuota	BigDecimal	否	上期结转 示例：0.0000
manualAdjustQuto	BigDecimal	否	手工调整 示例：0.0000
initialRestQuota	BigDecimal	否	初始已休 示例：0.0000
usedquota	BigDecimal	否	已休 示例：0.0000
usedquotaapproving	BigDecimal	否	已休(审核中) 示例：0.0000
usedquotaapproved	BigDecimal	否	已休(已审核) 示例：0.0000
restquota	BigDecimal	否	可休 示例：0.0000
clearingstate	int	否	结算状态 0:未结算 1:已结算 示例：0
invalidstate	int	否	作废状态 0:未作废 1:已作废 示例：0
periodtype	int	否	假期期间类型[0：按考勤年 1：按入职周年 2:按照考勤月 3:自定义] 示例：0
source	long	否	休假额度来源 0:公式计算 1:手工录入 示例：1
planQuota	string	否	计划额度

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "9b031cccd4c3463dacea85e4a3780126",
		"ts": 1610124019000,
		"creationtime": "2022-12-02 00:20:06",
		"creator": "timeTaskLeave",
		"modifiedtime": "2022-12-02 00:20:0600",
		"modifier": "timeTaskLeave",
		"tenantid": "e1dpehzh",
		"staffid": "2079349291340032",
		"schemeid": "28f58ea2a7ef4ec4b7e0f55f1001bc54",
		"leavetype": "31e9eb6927444a6c81121f1aebdc067f",
		"leaverefid": "e1dpehzhleavetype00001",
		"year": "2021",
		"begindatetime": "2022-12-02 00:20:06",
		"enddatetime": "2022-12-02 00:20:06",
		"lastenddatetime": "2022-12-02 00:20:06",
		"curquota": 0,
		"preForwardQuota": 0,
		"manualAdjustQuto": 0,
		"initialRestQuota": 0,
		"usedquota": 0,
		"usedquotaapproving": 0,
		"usedquotaapproved": 0,
		"restquota": 0,
		"clearingstate": 0,
		"invalidstate": 0,
		"periodtype": 0,
		"source": 1,
		"planQuota": ""
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
401	假别类型无效	修改休假类型id

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-18	
更新
请求说明
新增
请求参数 year
新增
请求参数 month
新增
返回参数 planQuota
更新
返回参数 creationtime
更新
返回参数 modifiedtime

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

