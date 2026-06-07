---
title: "获取租户下所有的休假类型"
apiId: "1602870121341124612"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Leave Type"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Leave Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取租户下所有的休假类型

>  请求方式	GET | Leave Type (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/leave/getLeaveTypeByTenant
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
language	string	query	否	多语参数zh_CN,zh_TW,en_US.错误或空参数系统默认租户默认语言    示例: zh_CN    默认值: zh_CN

## 3. 请求示例

Url: /yonbip/hrcloud/time/leave/getLeaveTypeByTenant?access_token=访问令牌&language=zh_CN

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
code	string	否	状态码 示例：200
message	string	否	消息 示例：操作成功
data	object	是	返回结果集
id	string	否	休假类型主键 示例：30db0b7a1bbb11eabc3e0624d60000dc
ts	long	否	时间戳 示例：1529649972000
es	long	否	是否支持 ElasticSearch，0=不支持，1=支持 示例：0
creationtime	long	否	创建时间 示例：1529649972000
creator	string	否	创建人 示例：4a143f32-aea4-4d3f-be23-7d9bba6d0190
modifiedtime	long	否	更新时间 示例：1529649972000
modifier	string	否	更新人 示例：4a143f32-aea4-4d3f-be23-7d9bba6d0190
tenantid	string	否	租户id 示例：4a143f32-aea4-4d3f-be23-7d9bba6d0190
mainId	string	否	该休假类型关联的休假规则id 示例：wvcxfph60000000001
refId	string	否	引用的休假类型id 示例：wvcxfph60000000001
code	string	否	休假类型编码 示例：5
typeName	string	否	休假类型名称 示例：年假
enablestate	string	否	启用状态，0=停用，1=启用 示例：1
isDefault	string	否	默认返回0:用户自定义 示例：0
minTime	string	否	最小休假时间，1=小时，2=天 示例：1
minUnit	string	否	最小休假单位，1=小时，2=天 示例：2
limitTime	number
小数位数:1,最大长度:2	否	限制休假时长，-1.0=不限制，其他值则为限制的天数 示例：-1.0
limitUnit	string	否	单次请假时长单位 1:小时,2:天 示例：1
iscontainrest	string	否	是否含公休日 0：否，1：是 示例：0
iscontainholiday	string	否	是否含节假日 0：否，1：是 示例：0
isattachment	string	否	是否必须上传附件 0：否，1：是 示例：0
controlLeaveTime	string	否	是否控制休假时长 0：否，1：是 示例：1
staffVisible	string	否	员工是否可见，0：不可见，1：可见 示例：1
managerVisible	string	否	经理是否可见，0：不可见，1：可见 示例：1
ispositivestaff	string	否	是否为转正人员，0=非转正人员，1=转正人员 示例：1
islimitworkage	string	否	是否工龄限制，0=无工龄限制，1=有工龄限制 示例：0
limitworkyear	int	否	是否工龄限制年数，0=不限制，1=限制 示例：0
islimitsiling	string	否	是否司龄限制，0=不限制，1=限制 示例：0
limitsilingyear	int	否	司龄限制年数，0=不限制，1=限制 示例：0
gendertype	string	否	性别, 0: 男, 1: 女, 2: 不限 示例：2
jobType	string	否	适用的职务类别
psnType	string	否	适用的人员类别
jobTypeName	string	否	适用的职务类别名称
psnTypeName	string	否	适用的人员类别名称
islimit	string	否	是否启用额度检查 0：不启用，1：启用 示例：0
isextensionvalidity	string	否	是否可延长有效期 0：否 1：是 示例：0
extendday	int	否	延长月数 示例：0
periodmethod	string	否	假期期间结算方式 0:过期作废 1:结转至下一年 2:结算年假工资 示例：0
source	string	否	额度来源 0:公式计算 1:手工录入 示例：1
formulastr	string	否	公式
formula	string	否	翻译后公式
remark	string	否	备注说明
leaveSort	int	否	0:普通假;1:前置假;2:后置假; 示例：0
ytenantId	string	否	租户id 示例：30db0b7a1bbb11eabc3e0624d60000dc
settlementType	int	否	结算方式 示例：0
showQuotaFlag	int	否	是否展示额度，0=不展示，1=展示 示例：0
periodtype	string	否	假期期间类型 0：按考勤年 1：按入职周年 2：按考勤月 示例：2
leaveSequence	int	否	假类型顺序(同leaveOrder 区分)
limitTimeDown	number
小数位数:0,最大长度:1	否	单次请假时长下限 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "30db0b7a1bbb11eabc3e0624d60000dc",
			"ts": 1529649972000,
			"es": 0,
			"creationtime": 1529649972000,
			"creator": "4a143f32-aea4-4d3f-be23-7d9bba6d0190",
			"modifiedtime": 1529649972000,
			"modifier": "4a143f32-aea4-4d3f-be23-7d9bba6d0190",
			"tenantid": "4a143f32-aea4-4d3f-be23-7d9bba6d0190",
			"mainId": "wvcxfph60000000001",
			"refId": "wvcxfph60000000001",
			"code": "5",
			"typeName": "年假",
			"enablestate": "1",
			"isDefault": "0",
			"minTime": "1",
			"minUnit": "2",
			"limitTime": -1,
			"limitUnit": "1",
			"iscontainrest": "0",
			"iscontainholiday": "0",
			"isattachment": "0",
			"controlLeaveTime": "1",
			"staffVisible": "1",
			"managerVisible": "1",
			"ispositivestaff": "1",
			"islimitworkage": "0",
			"limitworkyear": 0,
			"islimitsiling": "0",
			"limitsilingyear": 0,
			"gendertype": "2",
			"jobType": "",
			"psnType": "",
			"jobTypeName": "",
			"psnTypeName": "",
			"islimit": "0",
			"isextensionvalidity": "0",
			"extendday": 0,
			"periodmethod": "0",
			"source": "1",
			"formulastr": "",
			"formula": "",
			"remark": "",
			"leaveSort": 0,
			"ytenantId": "30db0b7a1bbb11eabc3e0624d60000dc",
			"settlementType": 0,
			"showQuotaFlag": 0,
			"periodtype": "2",
			"leaveSequence": 0,
			"limitTimeDown": 1
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
500	获取休假类型失败	检查休假类型

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-01	
更新
请求说明
新增
返回参数 limitTimeDown
更新
返回参数 (10)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

