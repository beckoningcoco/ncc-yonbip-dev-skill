---
title: "实物管理获取首页基本信息"
apiId: "1719295723975999490"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Device Registration Management"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Device Registration Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 实物管理获取首页基本信息

>  请求方式	POST | Device Registration Management (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ssc/pdm/postbox/gethomepageinfo
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	请求参数
deviceNo	string	否	是	设备编号：邮单筒出厂唯一编号 示例：US90A*****059020

## 3. 请求示例

Url: /yonbip/ssc/pdm/postbox/gethomepageinfo?access_token=访问令牌
Body: {
	"data": {
		"deviceNo": "US90A*****059020"
	}
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
code	string	否	请求返回编码 示例：200
message	string	否	请求返回信息 示例：操作成功
data	object	否	请求返回数据
deviceLicense	boolean	否	设备许可状态：实物管理许可（有效：true；无效：false） 示例：false
tenantName	string	否	租户名称：当前租户名称 示例：****集团
tenantLogo	string	否	租户logo：当前租户logo地址 示例：https://cdn.yon********t/tenant/logo/1675325189723.png
boxRemains	object	否	投递筒余量：该设备各投递筒剩余的容量 示例：{ "1": 167, "2": 199 }
boxMaximums	object	否	投递筒最大容量：该设备各投递筒的最大投递量 示例：{ "1": 200, "2": 200 }
alertMsg	string	否	许可状态无效时的提示信息 示例：未购买实物管理服务授权许可，请尽快加购

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"deviceLicense": false,
		"tenantName": "****集团",
		"tenantLogo": "https://cdn.yon********t/tenant/logo/1675325189723.png",
		"boxRemains": {
			"1": 167,
			"2": 199
		},
		"boxMaximums": {
			"1": 200,
			"2": 200
		},
		"alertMsg": "未购买实物管理服务授权许可，请尽快加购"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
036-507-020001	服务端逻辑异常	服务端报错，请联系开发人员
036-507-020004	操作失败，xxx参数不能为空	缺少必要参数，请补全
036-507-020006	操作失败，未找到该设备的绑定信息！ 设备编号：xxxxxxxxx	设备未绑定
036-507-020016	未购买实物管理服务授权许可，请尽快加购/实物管理授权许可已过期，请及时续费	实物管理许可未购买或者不在许可期间内，需要加购实物管理

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

