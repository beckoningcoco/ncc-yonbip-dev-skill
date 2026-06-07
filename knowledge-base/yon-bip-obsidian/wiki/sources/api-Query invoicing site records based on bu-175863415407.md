---
title: "根据业务单元id和业务单元职能查询开票点档案"
apiId: "1758634154072211464"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Common Settings"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Common Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据业务单元id和业务单元职能查询开票点档案

>  请求方式	POST | Tax Common Settings (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/org/billing-station
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
corpid	string	否	否	租户id 示例：0000LEC83AYQD8S8W60000
orgType	string	否	是	业务单元职能类型：纳税主体：taxpayerorg，会计主体：financeorg，销售组织：salesorg 示例：taxpayerorg
orgCode	string	否	是	业务单元组织编码 示例：zxhw
basOrgId	string	否	是	业务单元组织id 示例：12211

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/org/billing-station?access_token=访问令牌
Body: [{
	"corpid": "0000LEC83AYQD8S8W60000",
	"orgType": "taxpayerorg",
	"orgCode": "zxhw",
	"basOrgId": "12211"
}]

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
datas	object	是	开票点信息
id	string	否	开票点id 示例：1798767127344709634
code	string	否	开票点编码 示例：lsq测试开票点
name	string	否	开票点名称 示例：dd117
orgType	string	否	关联组织类型 示例：taxpayerorg
orgCode	string	否	关联组织编码 示例：zxhw
msg	string	否	响应信息 示例：success
code	string	否	响应编码 示例：200

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"datas": [
			{
				"id": "1798767127344709634",
				"code": "lsq测试开票点",
				"name": "dd117",
				"orgType": "taxpayerorg",
				"orgCode": "zxhw"
			}
		],
		"msg": "success",
		"code": "200"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
9999	无法根据会计主体id获取组织id	业务异常
1002	当前传入的组织未关联到开票点,请到开票点档案设置开票点,并在开票来源组织中引入当前组织	业务异常

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

