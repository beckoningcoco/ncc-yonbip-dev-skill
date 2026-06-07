---
title: "生产订单修订"
apiId: "2074979197148725251"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "MO"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, MO]
platform_version: "BIP"
source_type: community-api-docs
---

# 生产订单修订

>  请求方式	POST | MO (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/productionorder/orderUpdate
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	long	否	否	生产订单id,id和code不能同时为空 示例：1691208501880160299
code	string	否	否	生产订单号,id和code不能同时为空 示例：SCDD1000002550
completionInspection	boolean	否	否	齐套检查 示例：true
out_sys_id	string	否	否	外部来源Id 示例：2297527422652672
out_sys_code	string	否	否	外部来源编码 示例：SCDD20230101
out_sys_version	string	否	否	外部系统版本 示例：01
out_sys_type	string	否	否	外部来源类型 示例：u8c
exchangeStatus	string	否	否	交换状态 示例：1
failedInfo	string	否	否	失败信息
remark	string	否	否	备注 示例：测试APS
orderProduct	object	是	否	生产订单产品行
id	long	否	是	产品行id 示例：1691208501880160300
startDate	Date	否	否	开工日期,日期格式为“yyyy-MM-dd”,开工日期和完工日期必须同时填写 示例：2023-03-26
finishDate	Date	否	否	完工日期,日期格式为“yyyy-MM-dd”,开工日期和完工日期必须同时填写 示例：2023-03-31
apsLock	long	否	否	排程状态:0-未锁定,1-已锁定 示例：1 示例：1
orderProcess	object	是	否	工序
quantity	number
小数位数:8,最大长度:26	否	否	生产数量，生产数量和件数同时填写以生产数量为准 示例：10
auxiliaryQuantity	number
小数位数:8,最大长度:26	否	否	生产件数，生产数量和件数同时填写以生产数量为准 示例：10
projectId	string	否	否	项目Id/项目编码 示例：1691208501880160399
orderMaterial	object	是	否	材料
out_sys_lineid	string	否	否	外部来源行 示例：1691208501880160393
out_sys_rowno	string	否	否	外部来源行号 示例：10

## 3. 请求示例

Url: /yonbip/mfg/productionorder/orderUpdate?access_token=访问令牌
Body: [{
	"id": 1691208501880160299,
	"code": "SCDD1000002550",
	"completionInspection": true,
	"out_sys_id": "2297527422652672",
	"out_sys_code": "SCDD20230101",
	"out_sys_version": "01",
	"out_sys_type": "u8c",
	"exchangeStatus": "1",
	"failedInfo": "",
	"remark": "测试APS",
	"orderProduct": [
		{
			"id": 1691208501880160300,
			"startDate": "2023-03-26",
			"finishDate": "2023-03-31",
			"apsLock": 1,
			"orderProcess": [
				{
					"id": 1691208501880160300,
					"planStartDate": "2023-03-26 00:00:22",
					"planEndDate": "2023-03-31 00:00:22"
				}
			],
			"quantity": 10,
			"auxiliaryQuantity": 10,
			"projectId": "1691208501880160399",
			"orderMaterial": [
				{
					"id": 1691208501880160399,
					"isWholeSet": true,
					"wholePoint": 1,
					"requirementDate": "2024-12-19"
				}
			],
			"out_sys_lineid": "1691208501880160393",
			"out_sys_rowno": "10"
		}
	]
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
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
code	string	否	返回码，成功时返回200 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据信息
successOrder	object	是	更新成功的生产订单
failedOrder	object	是	更新失败的信息列表
failCount	long	否	失败数量 示例：1
successCount	long	否	成功数量 示例：1
count	long	否	数量 示例：2

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"successOrder": [
			{
				"id": 1691208501880160299,
				"code": "SCDD1000002550",
				"remark": "测试APS",
				"orderProduct": [
					{
						"id": 1691208501880160300,
						"startDate": "2023-03-26",
						"finishDate": "2023-03-31",
						"apsLock": 1,
						"orderProcess": [
							{
								"id": 1691208501880160300,
								"planStartDate": "2023-03-26 00:00:22",
								"planEndDate": "2023-03-31 00:00:22"
							}
						]
					}
				]
			}
		],
		"failedOrder": [
			{
				"message": [
					"订单不存在或者状态已改变"
				],
				"order": [
					{
						"id": 1691208501880160299,
						"code": "SCDD1000002550",
						"remark": "测试APS",
						"orderProduct": [
							{
								"id": 1691208501880160300,
								"finishDate": "2023-03-31",
								"startDate": "2023-03-26",
								"apsLock": 1,
								"orderProcess": [
									{
										"id": 1691208501880160300,
										"planStartDate": "2023-03-26  00:00:22",
										"planEndDate": "2023-03-31 00:00:22"
									}
								]
							}
						]
					}
				]
			}
		],
		"failCount": 1,
		"successCount": 1,
		"count": 2
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
999	取决于错误类型，不同错误信息不同	

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

