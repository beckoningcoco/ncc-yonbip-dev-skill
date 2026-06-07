---
title: "电子签hub签署回调说明"
apiId: "2325790460918890505"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子签hub签署回调说明

>  请求方式	POST | E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/TRST/hubCallback/rest/signChange
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
event	string	否	是	通知事件 SIGN_FLOW_FINISH:签署完成、SIGN_FLOW_UPDATE:签署过程更新 示例：SIGN_FLOW_FINISH
flowId	string	否	否	签署流程ID，创建签署流程返回值 示例：1802d6721ca3fc2e93faa4cc1355f353
bizId	string	否	否	业务系统方的签署流程ID,创建签署流程时有值时，则该参数需要传回 示例：213122
flowType	string	否	是	common：普通签署、cancellation：作废签署、refuse：拒绝签署 revoke：撤回流程 示例：common
status	string	否	是	event为SIGN_FLOW_FINISH: 1签署完成 ，2 签署链接过期 ，3同意作废 ，5拒绝作废，7 拒绝签署，9撤回签署;SIGN_FLOW_UPDATE时：1 签署完成，5拒绝作废，3：同意作废，4 静默签署失败，7 拒绝签署 示例：SIGN_FLOW_FINISH
accountInfo	object	否	是	操作人信息
accountId	string	否	是	电子签平台用户账户id 示例：75dc318e1c624d91603bf99a92b49699
accountUniqueId	string	否	否	业务系统创建用户时传入的用户标识，有则传值 示例：wee42
companyId	string	否	否	企业ID,当签署节点属于企业签时，此参数必传 示例：82f70e66767588eaca88ddbc17ba4836
name	string	否	否	签署节点用户姓名 示例：张三
signerId	string	否	是	签署节点id，创建签署时返回值 示例：YISHNJEHDSA
signUrl	string	否	否	签署人签署的链接Url 示例：Https:\\yonyou.com\yonbip-hy-tstsggbd/sign/UYEBS
finishDocUrls	object	否	是	签署文档信息，签署完成/作废完成后有值
docId	string	否	是	文档ID 示例：123123123132
signFileKey	string	否	是	签署后的文档fileKey 示例：2affb3dc522f08cdfd34ca606f5efd31
docFileKey	string	否	否	原始文档fileKey 示例：5addd268901d112c1cc8a7e4b3c1ca5b
downloadUrl	string	否	否	签署后的文档下载url 示例：https://bip-pre.yonyoucloud.com/yonbip-baas/rest/donload?123213123
signResult	string	否	否	签署结果，撤回、签署成功等操作结果描述 示例：签署成功
signTime	string	否	是	签署时间 示例：2025-07-01 01:04:23
createTime	string	否	否	合同创建时间 示例：2025-06-11 12:05:13
endTime	string	否	否	合同结束时间 示例：2025-07-01 01:04:23
refuseReason	string	否	否	当拒签时，此参数有值 示例：合同错误

## 3. 请求示例

Url: /yonbip/TRST/hubCallback/rest/signChange?access_token=访问令牌
Body: {
	"event": "SIGN_FLOW_FINISH",
	"flowId": "1802d6721ca3fc2e93faa4cc1355f353",
	"bizId": "213122",
	"flowType": "common",
	"status": "SIGN_FLOW_FINISH",
	"accountInfo": {
		"accountId": "75dc318e1c624d91603bf99a92b49699",
		"accountUniqueId": "wee42",
		"companyId": "82f70e66767588eaca88ddbc17ba4836",
		"name": "张三",
		"signerId": "YISHNJEHDSA",
		"signUrl": "Https:\\\\yonyou.com\\yonbip-hy-tstsggbd/sign/UYEBS"
	},
	"finishDocUrls": {
		"docId": "123123123132",
		"signFileKey": "2affb3dc522f08cdfd34ca606f5efd31",
		"docFileKey": "5addd268901d112c1cc8a7e4b3c1ca5b",
		"downloadUrl": "https://bip-pre.yonyoucloud.com/yonbip-baas/rest/donload?123213123"
	},
	"signResult": "签署成功",
	"signTime": "2025-07-01 01:04:23",
	"createTime": "2025-06-11 12:05:13",
	"endTime": "2025-07-01 01:04:23",
	"refuseReason": "合同错误"
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
message	string	否	success
code	string	否	200 示例：200
data	string	否	响应数据，此接口为空值

## 5. 正确返回示例

{
	"message": "",
	"code": "200",
	"data": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
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

