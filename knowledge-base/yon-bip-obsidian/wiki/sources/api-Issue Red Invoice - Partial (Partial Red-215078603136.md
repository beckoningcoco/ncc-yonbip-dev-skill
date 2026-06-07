---
title: "开红票-部分(原发票部分红冲)"
apiId: "2150786031362244612"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoicing"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing]
platform_version: "BIP"
source_type: community-api-docs
---

# 开红票-部分(原发票部分红冲)

>  请求方式	POST | Invoicing (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/tax/invoiceclient-web/api/invoiceApply/part-red-withjson
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	否	数据体
autoAudit	boolean	否	否	自动审核，即不需要人工在发票平台确认开票，直接进行开票 false:不自动审核，即需要人工确认如果不传，代表true
einvoiceApplyList	object	是	否	开票请求体
emailConfigList	object	是	否	邮箱交付信息
smsConfigList	object	是	否	短信交付信息
urlConfigList	object	是	否	url交付信息
auditReturnConfigs	object	是	否	退回地址信息

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/invoiceApply/part-red-withjson?access_token=访问令牌
Body: {
	"data": {
		"autoAudit": true,
		"einvoiceApplyList": [
			{
				"orgcode": "",
				"fpqqlsh": "",
				"fplx": "",
				"fpDm": "",
				"fpHm": "",
				"hcyy": "",
				"hzxxbbh": "",
				"xsfNsrsbh": "",
				"gmfMc": "",
				"gmfNsrsbh": "",
				"kpr": "",
				"skr": "",
				"fhr": "",
				"slsm": "",
				"allElcUserName": "",
				"allElcPassWord": "",
				"lydjh": "",
				"define": {},
				"jshj": 0,
				"hjje": 0,
				"hjse": 0,
				"lyid": "",
				"bmbBbh": "",
				"items": [
					{
						"hh": "",
						"xmmc": "",
						"xmbm": "",
						"ggxh": "",
						"dw": "",
						"xmsl": "",
						"xmdj": 0,
						"xmje": 0,
						"xmjshj": 0,
						"sl": 0,
						"se": 0,
						"spbm": "",
						"define": {
							"特征key": "特征值示例 选填"
						}
					}
				]
			}
		],
		"emailConfigList": [
			{
				"fpqqlsh": "",
				"address": ""
			}
		],
		"smsConfigList": [
			{
				"fpqqlsh": "",
				"address": ""
			}
		],
		"urlConfigList": [
			{
				"fpqqlsh": "",
				"url": ""
			}
		],
		"auditReturnConfigs": [
			{
				"fpqqlsh": "",
				"url": ""
			}
		]
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
code	string	否	状态码 示例：0000
code	string	否	状态码 示例：0000
message	string	否	信息 示例：操作成功
message	string	否	信息 示例：操作成功
data	string	否	响应信息
data	string	否	响应信息

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功",
	"data": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1001	价税合计必须小于0	请确认价税合计金额

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-09-02	
新增
请求参数 fplx
新增
请求参数 xsfNsrsbh
新增
请求参数 lydjh
更新
请求参数 (7)
	2	2025-08-14	
新增
请求参数 (12)
删除
请求参数 (12)
修改回调字段名。
	3	2025-08-07	
更新
请求参数 fpDm
取消发票号码必填。

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

