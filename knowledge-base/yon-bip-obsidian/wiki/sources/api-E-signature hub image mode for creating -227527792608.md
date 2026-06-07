---
title: "电子签hub图片模式制作个人印章"
apiId: "2275277926089883649"
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

# 电子签hub图片模式制作个人印章

>  请求方式	POST | E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/id/seal/image/user/v1/create
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
accountId	string	否	否	电子签用户accountId，和uniqueId两者必有一个值非空，如果两个字段都有值，则以accountId为准，标记制作的印章所属电子签用户 示例：8927c043be45ddba04a58ababe5989d5
uniqueId	string	否	否	电子签用户业务系统方绑定的唯一用户标识 示例：123123
sealImageData	string	否	是	印章图片的base64 示例：data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAABIAAAAKICAIAAACHSRZ
sealName	string	否	是	个人印章名称 示例：印章名称
sealNo	string	否	否	印章业务系统方关联的唯一印章编号 示例：123123
isSignature	string	否	否	该印章图片是否是手写签名图片，默认值false 示例：false

## 3. 请求示例

Url: /yonbip/id/seal/image/user/v1/create?access_token=访问令牌
Body: {
	"accountId": "8927c043be45ddba04a58ababe5989d5",
	"uniqueId": "123123",
	"sealImageData": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAABIAAAAKICAIAAACHSRZ",
	"sealName": "印章名称",
	"sealNo": "123123",
	"isSignature": "false"
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
sealId	string	否	印章ID 示例：7f0f2514d673ce30fdf6c4627139b260
sealName	string	否	印章名称 示例：印章名称
sealNo	string	否	业务系统方绑定的印章唯一标识 示例：123123

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"sealId": "7f0f2514d673ce30fdf6c4627139b260",
		"sealName": "印章名称",
		"sealNo": "123123"
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

