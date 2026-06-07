---
title: "获取所有未结算的假期余额"
apiId: "1623593140960100352"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Leave Quota"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Leave Quota]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取所有未结算的假期余额

>  请求方式	GET | Leave Quota (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/leave/queryTotalBalanceByStaff
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
leavetypeid	string	query	否	休假类型,不指定查询所有的休假类型
userId	string	query	否	用户userId（staffId 或 userId 必填其一，建议 staffId）    示例: 30db0b7a1bbb11eabc3e0624d60000dc
staffId	string	query	否	员工id（staffId 和 userId取其一，有 staffId 优先用 staffId）    示例: 30db0b7a1bbb11eabc3e0624d60000dc

## 3. 请求示例

Url: /yonbip/hrcloud/time/leave/queryTotalBalanceByStaff?access_token=访问令牌&leavetypeid=&userId=30db0b7a1bbb11eabc3e0624d60000dc&staffId=30db0b7a1bbb11eabc3e0624d60000dc

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
staffid	string	否	用户信息 示例：2079349291340032
schemeid	string	否	假勤方案id 示例：28f58ea2a7ef4ec4b7e0f55f1001bc54
leavetype	string	否	休假类别 示例：31e9eb6927444a6c81121f1aebdc067f
leaverefid	string	否	休假类别引用的默认id 示例：e1dpehzhleavetype00001
year	string	否	年份 示例：2021
begindatetime	long	否	有效期开始日期 示例：1672502400000
enddatetime	long	否	有效期结束日期 示例：1672502400000
lastenddatetime	long	否	延长有效期结束日期 示例：1672502400000
curquota	BigDecimal	否	本期额度 示例：3
usedquota	BigDecimal	否	已休 示例：0
usedquotaapproving	BigDecimal	否	已休(审核中) 示例：0
usedquotaapproved	BigDecimal	否	已休(已审核) 示例：0
restquota	BigDecimal	否	可休 示例：3
clearingstate	long	否	结算状态 0:否，1：是 示例：0
invalidstate	long	否	作废状态 0:否 1:是 示例：0
tenantid	string	否	租户Id 示例：0000L6YQ8AVLFUZPXD0000
ts	number
小数位数:0,最大长度:20	否	时间戳 示例：1672524400000
periodtype	string	否	假期期间类型0：按考勤年 1：按入职周年 2:按照考勤月 3：自定义 示例：0
modifiedtime	long	否	修改时间 示例：1672524400000
creationtime	long	否	创建时间 示例：1672524400000
modifier	string	否	修改人 示例：2079349291340032
source	number
小数位数:0,最大长度:10	否	数据来源，0:公式计算，1:手工录入 示例：0
creator	string	否	创建人 示例：2079349291340032
manualquota	number
小数位数:4,最大长度:10	否	手动调整值
planquota	number
小数位数:4,最大长度:10	否	计划额度
nextquot	number
小数位数:4,最大长度:10	否	结转下期
preforwardquota	number
小数位数:4,最大长度:10	否	上期结转
leavetypename	string	否	休假类别
minunit	string	否	最小请假时间单位 1:小时,2:天
initquota	number
小数位数:4,最大长度:10	否	初始已休值

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "9b031cccd4c3463dacea85e4a3780126",
			"staffid": "2079349291340032",
			"schemeid": "28f58ea2a7ef4ec4b7e0f55f1001bc54",
			"leavetype": "31e9eb6927444a6c81121f1aebdc067f",
			"leaverefid": "e1dpehzhleavetype00001",
			"year": "2021",
			"begindatetime": 1672502400000,
			"enddatetime": 1672502400000,
			"lastenddatetime": 1672502400000,
			"curquota": 3,
			"usedquota": 0,
			"usedquotaapproving": 0,
			"usedquotaapproved": 0,
			"restquota": 3,
			"clearingstate": 0,
			"invalidstate": 0,
			"tenantid": "0000L6YQ8AVLFUZPXD0000",
			"ts": 1672524400000,
			"periodtype": "0",
			"modifiedtime": 1672524400000,
			"creationtime": 1672524400000,
			"modifier": "2079349291340032",
			"source": 0,
			"creator": "2079349291340032",
			"manualquota": 0,
			"planquota": 0,
			"nextquot": 0,
			"preforwardquota": 0,
			"leavetypename": "",
			"minunit": "",
			"initquota": 0
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
999	假别类型无效	检查参数

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-01	
更新
请求说明
新增
返回参数 (7)
更新
返回参数 (4)
删除
返回参数 schemeId
删除
返回参数 initquota
删除
返回参数 minunit

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

