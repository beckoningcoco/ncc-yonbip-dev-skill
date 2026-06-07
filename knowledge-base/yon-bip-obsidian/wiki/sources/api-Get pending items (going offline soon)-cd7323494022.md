---
title: "获取待办条目（即将下线）"
apiId: "cd732349402241b9a7a4701069523d45"
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

# 获取待办条目（即将下线）

>  请求方式	POST | To-do Message (APP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/rest/todo/upesn/v2/items
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
done_status	string	query	否	默认值是0，0未办 1 已办 11 已忽略 -1 删除
page_no	string	query	否	默认为0 为第一页
page_size	string	query	否	每页条数(默认10条)
Body参数
名称	类型	数组	必填	描述
appId	string	否	是	应用ID，对应ykjld【常用字段说明</a>】
yhtUserId	string	否	是	友户通用户id
businessKey	string	否	否	业务方创建时传递的业务标识
typeName	string	否	否	显示在IM待办的 页签名称（即创建时传递的页签名称

## 3. 请求示例

Url: /yonbip/uspace/rest/todo/upesn/v2/items?access_token=访问令牌&done_status=&page_no=&page_size=
Body: {
	"appId": "",
	"yhtUserId": "",
	"businessKey": "",
	"typeName": ""
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
appId	string	否	创建出来的待办的appId
businessKey	string	否	待办事件唯一KEY, 用来标记为已处理或者删除使用，需要业务系统保证唯一性
qzId	string	否	空间id
memId	string	否	空间用户id
mUrl	string	否	移动端打开URL
webUrl	string	否	WEB端或PC端打开URL
typeName	string	否	类型名称, 即移动端页签名称
content	string	否	事件描述
title	string	否	事件标题
doneStatus	int	否	0 未办 1 已办
readTs	int	否	-1 未读 其余 已读时间戳
createTime	long	否	创建时间
updateTime	long	否	更新时间
createTsLong	long	否	创建时间戳
tenantId	string	否	租户id
yhtUserId	string	否	友户通用户id
displayCode	string	否	错误码

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"appId": "",
		"businessKey": "",
		"qzId": "",
		"memId": "",
		"mUrl": "",
		"webUrl": "",
		"typeName": "",
		"content": "",
		"title": "",
		"doneStatus": 0,
		"readTs": 0,
		"createTime": 0,
		"updateTime": 0,
		"createTsLong": 0,
		"tenantId": "",
		"yhtUserId": "",
		"displayCode": ""
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-04	
更新
请求参数 appId
新增
返回参数 displayCode
支持返回错误码

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

