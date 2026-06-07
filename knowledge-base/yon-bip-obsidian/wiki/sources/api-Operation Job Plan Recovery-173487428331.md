---
title: "工序作业计划新增与分派V1"
apiId: "1734874283317919750"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Operation Job Plan"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Operation Job Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 工序作业计划新增与分派V1

>  请求方式	POST | Operation Job Plan (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/procedureplan/saveAndDispatch/v1
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	单据数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
orderId	long	否	否	生产订单Id，生产订单Id和生产订单号orderCode不能同时为空，同时存在时优先级orderId>orderCode 示例：2550590505308416
orderCode	string	否	否	生产订单号orderCode，生产订单orderId和生产订单号orderCode不能同时为空，同时存在时优先级orderId>orderCode 示例：SCDD20211207000004
orderProductId	long	否	是	生产订单产品行ID 示例：2550590505308417
orderProcessId	long	否	是	生产订单工序ID 示例：2550590505308420
productId	long	否	否	物料id，物料Id和物料Code不能同时为空，同时存在时优先级Id>Code 示例：2550590505308425
deviceId	object	是	否	设备
productCode	string	否	否	物料编码，物料Id和物料Code不能同时为空，同时存在时优先级Id>Code 示例：A001
shiftId	number
小数位数:0,最大长度:19	否	否	班次id，班次Id和班次Code同时存在时优先级Id>Code 示例：2268369694605443094
shiftCode	string	否	否	班次code，班次Id和班次Code同时存在时优先级Id>Code 示例：BC
teamId	long	否	否	班组id，班组Id和班组Code同时存在时优先级Id>Code 示例：1958606807208191
teamCode	string	否	否	班组code，班组Id和班组Code同时存在时优先级Id>Code 示例：T001
staffId	object	是	否	员工
scheduleProdNum	BigDecimal	否	是	计划加工数量 示例：100.00
mainUnitId	long	否	否	主计量单位id，主计量单位Id和主计量单位Code同时存在时优先级Id>Code 示例：1958606807208193
mainUnitCode	string	否	否	主计量单位code，主计量单位Id和主计量单位Code同时存在时优先级Id>Code 示例：M001
scheduleStartTime	DateTime	否	否	计划开工时间 示例：2023-01-01 00:00:00
scheduleEndTime	DateTime	否	否	计划完工时间 示例：2023-01-02 00:00:00
remark	string	否	否	描述 示例：描述信息
schedulePrepareTime	BigDecimal	否	否	计划准备工时 示例：10.00
scheduleProcessTime	BigDecimal	否	否	计划加工工时 示例：20.00
timeUnit	int	否	否	时间单位枚举：0-天；1-小时；2-分；3-秒 示例：1
scheduleId	string	否	是	排程ID，调用方生成且唯一，查询和删除时使用 示例：2550590505308424
resubmitCheckKey	string	否	是	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»

## 3. 请求示例

Url: /yonbip/mfg/procedureplan/saveAndDispatch/v1?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "951ada30e0969e954f5d9058fff6a512",
			"orderId": 2550590505308416,
			"orderCode": "SCDD20211207000004",
			"orderProductId": 2550590505308417,
			"orderProcessId": 2550590505308420,
			"productId": 2550590505308425,
			"deviceId": [
				{
					"id": "2001366661735120908",
					"code": "D01"
				}
			],
			"productCode": "A001",
			"shiftId": 2268369694605443094,
			"shiftCode": "BC",
			"teamId": 1958606807208191,
			"teamCode": "T001",
			"staffId": [
				{
					"id": "2095502217346809863",
					"code": "S01"
				}
			],
			"scheduleProdNum": 100,
			"mainUnitId": 1958606807208193,
			"mainUnitCode": "M001",
			"scheduleStartTime": "2023-01-01 00:00:00",
			"scheduleEndTime": "2023-01-02 00:00:00",
			"remark": "描述信息",
			"schedulePrepareTime": 10,
			"scheduleProcessTime": 20,
			"timeUnit": 1,
			"scheduleId": "2550590505308424"
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
code	string	否	返回码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
count	int	否	操作记录数 示例：2
sucessCount	int	否	成功记录数 示例：1
failCount	int	否	失败记录数 示例：1
failInfos	object	是	失败信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"failInfos": [
			{
				"failinfo": ""
			}
		]
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
	1	2025-06-26	
新增
请求参数 shiftId
新增
请求参数 shiftCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

