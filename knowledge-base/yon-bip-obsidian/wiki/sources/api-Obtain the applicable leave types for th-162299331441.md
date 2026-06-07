---
title: "通过staffId或userId获取该员工适用的休假类型"
apiId: "1622993314417475591"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Leave Type"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Leave Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 通过staffId或userId获取该员工适用的休假类型

>  请求方式	GET | Leave Type (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/leave/getLeaveTypeNew
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
userId	string	query	否	用户userId（staffId 或 userId 必填其一，建议 staffId）    示例: f322bb55-d693-46eb-ab4c-6868fa2c1bad    默认值: f322bb55-d693-46eb-ab4c-6868fa2c1bad
staffId	string	query	否	员工id（staffId 和 userId取其一，有 staffId 优先用 staffId）    示例: 1618229791961907201

## 3. 请求示例

Url: /yonbip/hrcloud/time/leave/getLeaveTypeNew?access_token=访问令牌&userId=f322bb55-d693-46eb-ab4c-6868fa2c1bad&staffId=1618229791961907201

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
id	string	否	休假类型主键 示例：31e9eb6927444a6c81121f1aebdc067f
ts	long	否	时间戳 示例：1616398972000
es	long	否	是否支持 ElasticSearch，0=不支持，1=支持 示例：0
creationtime	long	否	创建时间 示例：1529649972000
creator	string	否	创建人 示例：4a143f32-aea4-4d3f-be23-7d9bba6d0190
modifiedtime	long	否	更新时间 示例：1616398973000
modifier	string	否	更新人 示例：6a9d9d08-6291-4f65-8578-af301fb19211
tenantid	string	否	租户id 示例：e1dpehzh
ytenantId	string	否	租户id 示例：e1dpehzh
mainId	string	否	该休假类型关联的休假规则id 示例：fce6b3cb47dc4437ba63132381048402
refId	string	否	引用的休假类型id 示例：e1dpehzhleavetype00001
code	string	否	休假类型code 示例：5
typeName	string	否	休假类型名称 示例：年假
enablestate	string	否	启用状态，0=停用，1=启用 示例：1
isDefault	string	否	是否是预置：0：用户自定义，1:预置 示例：0
minTime	string	否	最小休假时间 示例：1
minUnit	string	否	最小休假单位，1=小时，2=天 示例：2
limitTime	float	否	是否限制休假时长，-1.0=不限制 示例：-1.0
limitTimeDown	float	否	单次请假时长下限 示例：0.0
limitUnit	string	否	单次请假时长单位 1:小时,2:天 示例：2
iscontainrest	string	否	是否含公休日 0：否，1：是 示例：1
iscontainholiday	string	否	是否含节假日 0：否，1：是 示例：0
isattachment	string	否	是否必须上传附件 0：否，1：是 示例：0
controlLeaveTime	string	否	是否控制休假时长 0：否，1：是 示例：1
staffVisible	string	否	员工是否可见，0：不可见，1：可见 示例：1
managerVisible	string	否	经理是否可见，0：不可见，1：可见 示例：0
ispositivestaff	string	否	是否为转正人员，0：否，1：是 示例：0
islimitworkage	string	否	是否工龄限制，0：否，1：是 示例：0
limitworkyear	int	否	工龄限制年数 示例：-1
islimitsiling	string	否	是否司龄限制，0：否，1：是 示例：0
limitsilingyear	int	否	司龄限制年数 示例：-1
islimitgender	string	否	是否性别限制，0：否，1：是 示例：0
gendertype	string	否	性别, 0: 男, 1: 女, 2: 不限 示例：2
jobType	string	否	适用的职务类别
psnType	string	否	适用的人员类别
islimit	string	否	是否启用额度检查 0：不启用，1：启用 示例：1
periodtype	string	否	假期期间类型 0：按考勤年 1：按入职周年 2：按考勤月 示例：0
isextensionvalidity	string	否	是否可延长有效期 0：否 1：是 示例：1
extendday	int	否	延长月数 示例：0
periodmethod	string	否	假期期间结算方式 0:过期作废 1:结转至下一年 2:结算年假工资 示例：0
source	string	否	额度来源 0:公式计算 1:手工录入 示例：0
formulastr	string	否	公式 示例：year()
formula	string	否	翻译后公式 示例：year()
remark	string	否	备注说明 示例：年假备注说明
timeType	string	否	时间类型，0：精确到分钟，1：按半小时，2：按半天 示例：1
leaveSort	int	否	0:普通假;1:前置假;2:后置假; 示例：0
leaveOrder	int	否	假别顺序 前置假用; 示例：0
leaveSequence	int	否	假类型顺序(同leaveOrder 区分) 示例：1
showQuotaFlag	int	否	休假额度展示标识 示例：0：展示（默认）1：不展示
settlementType	int	否	结算方式 示例：1:统一结算 2:组合结算

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "31e9eb6927444a6c81121f1aebdc067f",
			"ts": 1616398972000,
			"es": 0,
			"creationtime": 1529649972000,
			"creator": "4a143f32-aea4-4d3f-be23-7d9bba6d0190",
			"modifiedtime": 1616398973000,
			"modifier": "6a9d9d08-6291-4f65-8578-af301fb19211",
			"tenantid": "e1dpehzh",
			"ytenantId": "e1dpehzh",
			"mainId": "fce6b3cb47dc4437ba63132381048402",
			"refId": "e1dpehzhleavetype00001",
			"code": "5",
			"typeName": "年假",
			"enablestate": "1",
			"isDefault": "0",
			"minTime": "1",
			"minUnit": "2",
			"limitTime": -1,
			"limitTimeDown": 0,
			"limitUnit": "2",
			"iscontainrest": "1",
			"iscontainholiday": "0",
			"isattachment": "0",
			"controlLeaveTime": "1",
			"staffVisible": "1",
			"managerVisible": "0",
			"ispositivestaff": "0",
			"islimitworkage": "0",
			"limitworkyear": -1,
			"islimitsiling": "0",
			"limitsilingyear": -1,
			"islimitgender": "0",
			"gendertype": "2",
			"jobType": "",
			"psnType": "",
			"islimit": "1",
			"periodtype": "0",
			"isextensionvalidity": "1",
			"extendday": 0,
			"periodmethod": "0",
			"source": "0",
			"formulastr": "year()",
			"formula": "year()",
			"remark": "年假备注说明",
			"timeType": "1",
			"leaveSort": 0,
			"leaveOrder": 0,
			"leaveSequence": 1,
			"showQuotaFlag": NaN,
			"settlementType": NaN
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

