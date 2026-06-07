---
title: "电子签hub意愿认证"
apiId: "2275319106236317702"
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

# 电子签hub意愿认证

>  请求方式	POST | E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/id/identity/will/v1/auth
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
authType	string	否	是	认证方式,1:短信，2：签章密码 ，3:人脸 示例：1
smsCode	string	否	否	当authType为1时，该值必填，值为收到的验证码（与【发送短信验证码】接口连用，发送手机号为accountId对应用户手机号） 示例：123123
faceVerifyId	string	否	否	当authType为3时，该值必填，值人脸验证id（与【人脸验证】接口连用） 示例：86af143248e444f3aac4a63aa6e28e3f
sealPwd	string	否	否	当authType为2时，该值必填，值为设置的签署口令的MD5数据 示例：123123
accountId	string	否	是	签署人accountId 示例：37fe7c2f8a674c13b0a85cc4c68f400f
signerId	string	否	是	签署人节点signerId 示例：SE2WWEDS

## 3. 请求示例

Url: /yonbip/id/identity/will/v1/auth?access_token=访问令牌
Body: {
	"authType": "1",
	"smsCode": "123123",
	"faceVerifyId": "86af143248e444f3aac4a63aa6e28e3f",
	"sealPwd": "123123",
	"accountId": "37fe7c2f8a674c13b0a85cc4c68f400f",
	"signerId": "SE2WWEDS"
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
code	string	否	响应码 示例：200
message	string	否	响应信息 示例：success
data	object	否	响应数据
authId	string	否	意愿认证id 示例：0rkryi

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"authId": "0rkryi"
	}
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
	1	2025-08-15	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

