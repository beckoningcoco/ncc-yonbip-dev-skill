---
title: "新增日程评论"
apiId: "2551876405504245762"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Calendar"
domain: "SC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Calendar]
platform_version: "BIP"
source_type: community-api-docs
---

# 新增日程评论

>  请求方式	POST | Calendar (SC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/schedules/{scheduleId}/comments
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
scheduleId	string	path	是	日程 ID
Body参数
名称	类型	数组	必填	描述
content	string	否	否	评论内容 示例：string
originCommentId	string	否	否	被引用的一级评论ID, 用来归并评论层级。 一级评论,该字段为空。 非一级评论,该字段不为空。 示例：string
parentCommentId	string	否	否	被引用评论ID 示例：string
parentReplyUId	string	否	否	被引用评论人的用户Id 示例：string
replyObjectOwnerUid	string	否	否	被评论的源数据发起人 示例：string
replyFileIds	string	否	否	文库json串(回复内容时所带的附件id) 如: [fid,fid] 默认值: [] 示例：[]
newReplyFileIds	string	否	否	文件服务取消双写 文件服务json串(回复内容时所带的附件id) 如: [fid,fid] 默认值: [] 示例：[]
replyToUids	string	否	否	需要接收评论推送的mid集合: ["mid", "mid"] 示例：[]
atToUids	string	否	否	需要接收at推送的mid集合: ["mid", "mid"] 示例：[]

## 3. 请求示例

Url: /yonbip/SCCC/schedules/{scheduleId}/comments?access_token=访问令牌
Body: {
	"content": "string",
	"originCommentId": "string",
	"parentCommentId": "string",
	"parentReplyUId": "string",
	"replyObjectOwnerUid": "string",
	"replyFileIds": "[]",
	"newReplyFileIds": "[]",
	"replyToUids": "[]",
	"atToUids": "[]"
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
hash	string	否	hash
data	object	否	data
commentId	string	否	评论id 示例：6a195c89b212dc1dc7e209c3
yhtUserId	string	否	友互通id 示例：eb723ace-445e-4d0a-a1aa-0c66e198e367
name	string	否	用户名 示例：测试
avatarUrl	string	否	头像地址 示例：https://cdn.yonyoucloud.com/avator/eb723ace-445e-4d0a-a1aa-0c66e198e367/1744784774317/original/original.png?v=v2SkWf
rname	string	否	rname
content	string	否	评论内容 示例：评论
created	string	否	创建时间 示例：1780046985
parentCommentId	string	否	父评论id 示例：6a19573eb212dc1dc7e20938
canDel	boolean	否	是否可删除 示例：true

## 5. 正确返回示例

{
	"code": 200,
	"hash": "",
	"data": {
		"commentId": "6a195c89b212dc1dc7e209c3",
		"yhtUserId": "eb723ace-445e-4d0a-a1aa-0c66e198e367",
		"name": "测试",
		"avatarUrl": "https://cdn.yonyoucloud.com/avator/eb723ace-445e-4d0a-a1aa-0c66e198e367/1744784774317/original/original.png?v=v2SkWf",
		"rname": "",
		"content": "评论",
		"created": "1780046985",
		"parentCommentId": "6a19573eb212dc1dc7e20938",
		"canDel": true
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

