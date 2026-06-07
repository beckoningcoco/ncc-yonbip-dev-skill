---
title: "获取用户在当前租户下的公告列表"
apiId: "30c6f0f6bf0a42228482d287af100c62"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Announcement"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Announcement]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取用户在当前租户下的公告列表

>  请求方式	POST | Announcement (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/rest/v1/announce/transfer/getAfficheList
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
userId	string	否	是	友户通用户id
count	string	否	否	取数据个数，最多20个，不填默认10个
tenantId	string	否	是	租户id

## 3. 请求示例

Url: /yonbip/uspace/rest/v1/announce/transfer/getAfficheList?access_token=访问令牌
Body: {
	"userId": "",
	"count": "",
	"tenantId": ""
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
code	long	否	code 示例：0
data	object	否	data
list	object	是	list

## 5. 正确返回示例

{
	"code": 0,
	"data": {
		"list": [
			{
				"content": "《蜀道难》是中国唐代伟大诗人李白的代表作品。此诗袭用乐府旧题，以浪漫主义的手法，展开丰富的想象，艺术地再现了蜀道峥嵘、突兀、强悍、崎岖等奇丽惊险和不可凌越的磅礴气势，借以歌咏蜀地山川的壮秀，显示出祖国",
				"isRead": 1,
				"title": "噫吁嚱，危乎高哉！蜀道之难，难于上青天！蚕丛及鱼凫，开国何茫然！尔来四万八千岁，不与秦塞通人烟。西当太白有鸟道，可以横绝峨眉巅",
				"pubdate": "1559114231",
				"id": "36319",
				"typeName": "别动zm的分类无组织",
				"createTime": "1559114294",
				"type": "25223"
			}
		]
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

