---
title: "查看设计BOM详情（多层平铺）"
apiId: "2536498275098296403"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product Structure Management"
domain: "PLMPDM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Structure Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看设计BOM详情（多层平铺）

>  请求方式	POST | Product Structure Management (PLMPDM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/current_yonbip_default_sys/RDC/openapi/ebom/v1/getFlatBomTree
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
bomViewerId	string	否	否	BOM查看器ID
bomver	string	否	否	BOM版本
level	number
小数位数:2,最大长度:10	否	否	层级深度
useUIMeta	boolean	否	否	是否使用UI元数据
fullLevelViewFlag	boolean	否	否	完整层级视图标识

## 3. 请求示例

Url: /current_yonbip_default_sys/RDC/openapi/ebom/v1/getFlatBomTree?access_token=访问令牌
Body: {
	"bomViewerId": "",
	"bomver": "",
	"level": 0,
	"useUIMeta": true,
	"fullLevelViewFlag": true
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
小数位数:2,最大长度:10	否	返回码，调用成功时返回200 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	是	BOM树数据列表
		否	
		否	
id	number
小数位数:0,最大长度:20	否	BOM ID 示例：2379171063414652933
partId	string	否	物料ID 示例：2379170350450081797
partCode	string	否	物料编码 示例：ycc2025101100001
partRevision	string	否	物料版本 示例：A
bomRevision	string	否	BOM版本 示例：A
BomLinkList	object	是	BOM关联列表
BomPartInfo	object	否	BOM物料信息
traceId	string	否	追踪ID 示例：a47799da0d3c04be
uploadable	string	否	是否可上传 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"id": 2379171063414652933,
			"partId": "2379170350450081797",
			"partCode": "ycc2025101100001",
			"partRevision": "A",
			"bomRevision": "A",
			"BomLinkList": [
				{
					"id": 2379171063414652934,
					"fromPartCode": "ycc2025101100001",
					"fromPartRevision": "A",
					"toPartCode": "ycc2025101100002",
					"toPartRevision": "O",
					"amount": 1,
					"linkRemark": "111",
					"sequence": 1,
					"BomPartInfo": {
						"id": 2382131489892466690,
						"code": "ycc2025101100002",
						"revision": "O",
						"name": "G20251011A1.15",
						"specification": "0423test",
						"material": "0423test1",
						"model": "0423test",
						"unit": 1992469628465446917,
						"unit_name": "cm",
						"weight": 0
					},
					"BomLinkSubPartList": [
						{
							"id": 2427254613555544067,
							"amount": 1,
							"subPartId": "2363566802982141953",
							"subPartId_code": "ycc2025092000001",
							"subPartId_revision": "A",
							"BomPartInfo": {
								"id": 2363566802982141953,
								"code": "ycc2025092000001",
								"name": "G20250920A",
								"revision": "A",
								"specification": "0423test"
							}
						}
					]
				}
			],
			"BomPartInfo": {
				"id": 2379170350450081797,
				"code": "ycc2025101100001",
				"name": "G20251011A",
				"revision": "A",
				"specification": "0423test",
				"material": "0423test",
				"model": "0423test",
				"unit": 1981178314063085575,
				"unit_name": "kg",
				"weight": 0
			}
		}
	],
	"traceId": "a47799da0d3c04be",
	"uploadable": "0"
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

