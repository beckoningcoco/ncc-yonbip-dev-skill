---
title: "推送数据至“我发起的”"
apiId: "2253802831907127305"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "To-do Message"
domain: "APP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, To-do Message]
platform_version: "BIP"
source_type: community-api-docs
---

# 推送数据至“我发起的”

>  请求方式	POST | To-do Message (APP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/messagecenter/server/initiate/push/openapi
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
busId	string	否	是	业务id,不超过200字符 示例：xxx
source	string	否	是	来源标识，建议使用appkey，source+busId定位唯一业务数据 示例：xxx
userId	string	否	是	发起人用户id 示例：xxx
srcMsgId	string	否	是	幂等id重试用,要求每次都不一样，一样的请求会被拦截
title	string	否	是	展示的标题
delete	boolean	否	否	是否删除；true表示将busId对应的数据删除 示例：false 默认值：false
busTs	number
小数位数:0,最大长度:13	否	是	13位业务时间戳,新数据更新旧数据,用于区分是否需要更新
businessCode	string	否	否	单据编码
initiateTs	number
小数位数:0,最大长度:13	否	否	发起时间，13位毫秒时间戳
endTs	string	否	否	结束时间，13位毫秒时间戳
webUrl	string	否	否	web端跳转地址 示例：http://www.yonyoucloud.com
mobileUrl	string	否	否	移动端跳转地址 示例：http://www.yonyoucloud.com
attributes	object	否	否	扩展参数
catCode1st	string	否	否	自定义级一分类id
catCode2nd	string	否	否	自定义二级分类id
status	string	否	否	状态：IN_PROGRES=处理中；END=已完成；REJECT=已退回

## 3. 请求示例

Url: /yonbip/uspace/messagecenter/server/initiate/push/openapi?access_token=访问令牌
Body: {
	"busId": "xxx",
	"source": "xxx",
	"userId": "xxx",
	"srcMsgId": "",
	"title": "",
	"delete": false,
	"busTs": 0,
	"businessCode": "",
	"initiateTs": 0,
	"endTs": "",
	"webUrl": "http://www.yonyoucloud.com",
	"mobileUrl": "http://www.yonyoucloud.com",
	"attributes": {},
	"catCode1st": "",
	"catCode2nd": "",
	"status": ""
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
code	string	否	业务状态码 示例：200
message	string	否	提示信息 示例：成功
data	object	否	数据
flag	long	否	消息中心成功标识，0:成功，1失败 示例：0
msg	string	否	消息中心返回的提示信息 示例：success
displayCode	string	否	错误码

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": {
		"flag": 0,
		"msg": "success"
	},
	"displayCode": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
400	参数错误	查看message提示信息,检查字段类型和值是否正确

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-09-22	
更新
请求说明
消息openapi接口从消息平台迁移到消息中心
	2	2025-07-04	
新增
返回参数 displayCode
支持返回错误码
	3	2025-06-11	
新增
请求参数 delete
新增
请求参数 status
增加我发起的状态传参

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

