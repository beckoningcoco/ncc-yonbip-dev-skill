---
title: "单聊发送消息卡片"
apiId: "1769067900928262145"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Message Center"
domain: "APP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Message Center]
platform_version: "BIP"
source_type: community-api-docs
---

# 单聊发送消息卡片

>  请求方式	POST | Message Center (APP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/rest/chat/message/card
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
sender	string	否	是	发送者的友户通ID 示例：0fccd5d5-15b7-45dc-a84f-b4e650ee5af3
receiver	string	否	是	接受者的友户通ID 示例：927aaa47-a32f-4a7b-bc3d-aebf0467643b
url	string	否	是	点击消息卡片跳转地址 示例：https://www.yonyoucloud.com
title	string	否	是	消息卡片标题 示例：用友云
content	string	否	是	消息卡片内容 示例：全球领先的智能化商业平台
icon	string	否	否	消息卡片icon的图片url 示例：https://img.zcool.cn/community/018cbb5de0ada0a801215972bf044a.jpg

## 3. 请求示例

Url: /yonbip/uspace/rest/chat/message/card?access_token=访问令牌
Body: {
	"sender": "0fccd5d5-15b7-45dc-a84f-b4e650ee5af3",
	"receiver": "927aaa47-a32f-4a7b-bc3d-aebf0467643b",
	"url": "https://www.yonyoucloud.com",
	"title": "用友云",
	"content": "全球领先的智能化商业平台",
	"icon": "https://img.zcool.cn/community/018cbb5de0ada0a801215972bf044a.jpg"
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
code	string	否	返回值code 示例：200
message	string	否	返回值信息 示例：成功
data	object	否	返回值数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": {}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
10310124000001	参数错误	参数错误
10310124000002	消息文本长度超出限制	消息文本长度超出限制
10310124000003	用户数据异常	用户数据异常
10310124000004	没有相同租户	没有相同租户

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

