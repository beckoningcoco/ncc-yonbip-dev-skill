---
title: "智友chat接口(流式)"
apiId: "2309173765034475520"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "YonMate"
domain: "YYZDX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, YonMate]
platform_version: "BIP"
source_type: community-api-docs
---

# 智友chat接口(流式)

>  请求方式	POST | YonMate (YYZDX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/CPC/sse/webrobot/gateway/chat
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	其他
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
digitalCode	string	否	是	机器人 code 示例：bot001
msg	string	否	是	对话内容（用户输入） 示例：帮我查一下订单
inputType	number
小数位数:0,最大长度:1	否	是	输入类型：1-语音转文字，0-普通输入 示例：0
domain	string	否	是	领域/微服务编码（固定配置） 示例：YYZDX
chatId	string	否	是	会话 ID（首条消息为空，后续需带回） 示例：c12345
tenantid	string	否	是	租户 ID 示例：t001
userid	string	否	是	用户 ID 示例：u001
devicetype	string	否	是	设备类型（web / ios/ android ） 示例：web
deviceid	string	否	是	设备 ID（多轮对话需保持一致） 示例：device-123
commandId	string	否	否	快捷指令 ID 示例：cmd-01
chatType	string	否	否	聊天内容类型：0-文本，1-文件/图片，2-快捷指令 示例：0
pageContext	object	否	否	页面上下文（智能体感知页面信息）
billNo	string	否	否	上下文单据编号 示例：BN20240703001
serviceCode	string	否	否	上下文服务代码 示例：SC-ORDER
serviceName	string	否	否	上下文服务名称 示例：订单查询
businessData	object	否	否	上下文业务数据
fileList	object	是	否	文件列表
id	string	否	否	文件 ID 示例：f001
url	string	否	否	文件 URL 示例：https://example.com/a.png
name	string	否	否	文件名称 示例：a.png
extension	string	否	否	文件后缀 示例：png
extendAttribute	object	否	否	扩展属性（JSON 对象）
yht_access_token	string	否	否	yht 访问令牌 示例：token-abc
staffId	string	否	否	数智员工ID
closeChatId	string	否	否	随机id，停止生成时使用

## 3. 请求示例

Url: /yonbip/CPC/sse/webrobot/gateway/chat?access_token=访问令牌
Body: {
	"digitalCode": "bot001",
	"msg": "帮我查一下订单",
	"inputType": 0,
	"domain": "YYZDX",
	"chatId": "c12345",
	"tenantid": "t001",
	"userid": "u001",
	"devicetype": "web",
	"deviceid": "device-123",
	"commandId": "cmd-01",
	"chatType": "0",
	"pageContext": {
		"billNo": "BN20240703001",
		"serviceCode": "SC-ORDER",
		"serviceName": "订单查询",
		"businessData": {}
	},
	"fileList": [
		{
			"id": "f001",
			"url": "https://example.com/a.png",
			"name": "a.png",
			"extension": "png"
		}
	],
	"extendAttribute": {},
	"yht_access_token": "token-abc",
	"staffId": "",
	"closeChatId": ""
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	number
小数位数:0,最大长度:1	否	返回码：1-成功，0-失败 示例：1
chatId	string	否	会话 ID 示例：2287802179567222797
feedback	boolean	否	是否展示反馈按钮 示例：true
traceId	string	否	链路 TraceId 示例：c764dbd595b696eb
responses	object	是	应答结果数组
data	object	否	单条应答数据
intentFlowDebugInfo	string	否	调试信息
replyMessageId	string	否	回复消息 ID
contextId	string	否	上下文 ID 示例：2287803012790878217
thoughtChainResponses	string	否	思维链应答
digitalCode	string	否	数字人 Code
digitalName	string	否	数字人名称

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": 1,
		"chatId": "2287802179567222797",
		"feedback": true,
		"traceId": "c764dbd595b696eb",
		"responses": [
			{
				"data": {
					"nodeId": "84a61b8f-e25a-41cf-96c5-5078e392625f",
					"answerType": "",
					"code": "",
					"text": "",
					"planTxt": "",
					"vpaWebUIResourceData": {
						"resourceCode": "RC2035398805667446785",
						"resourceName": "智友联系人列表组件",
						"sectionName": "robotCard.VPAAddressListCard",
						"resourceType": 1,
						"jsUrl": "/iuap-aip-vpa/ucf-wh/websdk/static/robotCard.umd.js"
					},
					"vpaWebUIResourceCode": "RC2035398805667446785",
					"showData": {
						"text": "已为您找到以下联系人",
						"content": {
							"showData": {
								"listData": [
									{
										"image": "https://example.com/a.png",
										"itemclieckParam": {},
										"name": "侯伟",
										"describe": "用友网络科技股份有限公司"
									}
								],
								"scene": "contacts"
							}
						}
					}
				}
			}
		],
		"intentFlowDebugInfo": "",
		"replyMessageId": "",
		"contextId": "2287803012790878217",
		"thoughtChainResponses": "",
		"digitalCode": "",
		"digitalName": ""
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
0	未传入优惠券档案id	coupon_id值填写有误
013-504-520013	请关闭智能体流式开关	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-16	
新增
请求参数 closeChatId
增加closeChatId用来停止生成

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

