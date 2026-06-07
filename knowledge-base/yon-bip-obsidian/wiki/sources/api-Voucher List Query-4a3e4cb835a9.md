---
title: "凭证列表查询"
apiId: "4a3e4cb835a94d73b1633524731ef9b7"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Voucher"
domain: "EFI"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 凭证列表查询

>  请求方式	POST | Voucher (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/fi/ficloud/voucher/queryconditiondetail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
accbook	string	否	是	账簿ID
groupnum	int	否	否	获取条数
begin	int	否	否	开始位置(区别页码)
conditions	object	是	是	部分条件必输(必须录入会计期间)
field	string	否	是	查询字段（"period"：会计期间，"maketime"：制单日期，"voucherStatus"：凭证状态(00暂存,01提交,02纠错,03审核,04记账,05作废)，"billcode"：凭证号，"accsubject"：科目，"maker"：制单人，"auditor"：审核人，"tallyman"：记账人，"description"：摘要，"currency"：币种，"vouchertype"：凭证类型）
part	string	否	否	字段所属（"header"：凭证头，"body"：分录行）
value	string	否	否	字段值
operator	string	否	否	匹配方式"=","like"

## 3. 请求示例

Url: /yonbip/fi/ficloud/voucher/queryconditiondetail?access_token=访问令牌
Body: {
	"accbook": "",
	"groupnum": 0,
	"begin": 0,
	"conditions": [
		{
			"field": "",
			"part": "",
			"value": "",
			"operator": ""
		}
	]
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
totalcount	long	否	总计 示例：2
code	long	否	编码 示例：200
data	object	是	返回数据
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
voucherType	string	否	凭证类型
body	object	是	对象
header	object	否	凭证头
success	boolean	否	返回标识 示例：true
totalPage	long	否	总页数 示例：4
message	string	否	返回信息 示例：操作成功.

## 5. 正确返回示例

{
	"totalcount": 2,
	"code": 200,
	"data": [
		{
			"voucherType": "",
			"body": [
				{
					"id": "2EB427DB-C1BA-46DE-BE89-44C896135321",
					"tenantid": "",
					"rate_org": 1,
					"price": 0,
					"accsubject": {
						"id": "31E52262-95A2-4FA3-9FB6-AA33056D127C",
						"code": "1121",
						"name": "应收票据",
						"measuredoc": "",
						"numcheck": true
					},
					"currency_org": "",
					"description": "",
					"recordnumber": 1,
					"quantity": "",
					"credit_original": "20",
					"credit_org": 20,
					"debit_original": 0,
					"debit_org": 0,
					"currency": {
						"id": "2088838729405952",
						"code": "CNY",
						"name": "人民币",
						"moneydigit": 6,
						"moneyrount": 4,
						"pricedigit": 6,
						"pricerount": 4
					},
					"voucherid": "079FBEC1-DF6F-444B-9A19-4AA890C9C48E",
					"srctplid": "",
					"modify_rule": "",
					"ratetype": {
						"id": "2088838731945472",
						"code": "02",
						"name": "用户自定义汇率",
						"digit": 6
					},
					"auxiliary": "F203D5E9-1934-42F7-9501-E10C64970C8F",
					"accsubject2": "",
					"clientauxiliary": [
						{
							"id": "",
							"code": "0005",
							"name": "客户",
							"datatype": "doc",
							"field": "vr5",
							"required": false,
							"auxiliarytype": "",
							"value": "1743373289017600",
							"helpcode": "",
							"commoned": false,
							"helpvalue": "",
							"auxiliaryvalue": "",
							"helpname": "",
							"doctype": "customer",
							"data": {
								"id": "1743373289017600",
								"code": "00012005160003",
								"name": "客-B公司"
							}
						}
					],
					"cashFlowProjectList": [
						{
							"cashFlowProjectName": "",
							"negative": true
						}
					],
					"measuredoc_org": {
						"id": "",
						"name": "",
						"code": "",
						"precision": 0,
						"truncationType": 0
					},
					"rate_org_op": ""
				}
			],
			"header": {
				"id": "079FBEC1-DF6F-444B-9A19-4AA890C9C48E",
				"srcsystem": "总账管理",
				"tenantid": "",
				"srctplid": "",
				"accbook": {
					"id": "F87D4834-27D4-4A30-A931-2497105F475B",
					"name": "稻香账簿003",
					"code": "dxbook003"
				},
				"cfstatus": "",
				"maker": {
					"id": "48e6944e-fcc7-4954-8cd1-4230aa0d41d2",
					"code": "YHT-739-6811619598777781",
					"name": "稻香"
				},
				"voucherstatus": "04",
				"billcode": 20,
				"secondorg": "",
				"maketime": "2021-06-16",
				"modify_rule": "",
				"displaybillcode": "20",
				"accbody": "",
				"auditor": {
					"id": "81191106-0be1-415e-ab2f-0a64ab847e44",
					"code": "YHT-11397-114321517914155759",
					"name": "2000wy1523"
				},
				"signer": {
					"id": "",
					"code": "",
					"name": ""
				},
				"tallyman": {
					"id": "81191106-0be1-415e-ab2f-0a64ab847e44",
					"code": "YHT-11397-114321517914155759",
					"name": "2000wy1523"
				},
				"desbilltype": "",
				"processingState": "",
				"totaldebit_org": 20,
				"totalcredit_org": 8000,
				"srcsystemid": {
					"id": "0173936c-284c-11ea-b07e-7cd30ad3ad3e",
					"code": "figl",
					"name": "总账管理"
				},
				"displayname": "记-20",
				"def2": "~",
				"deptcode": "",
				"period": "2021-06",
				"description": "",
				"attachedbill": 2,
				"dr": false,
				"cashflowitem": ""
			}
		}
	],
	"success": true,
	"totalPage": 4,
	"message": "操作成功."
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
0	查询失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-28	
新增
请求参数 (4)
新增
返回参数 (6)
新增
错误码 0
	2	2025-08-12	
更新
请求说明
删除
请求参数 (4)
删除
返回参数 (6)
删除
错误码 0
新增API

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

