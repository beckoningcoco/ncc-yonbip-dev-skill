---
title: "计划独立需求批量保存"
apiId: "2448044815204483076"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Planned Independent Demand"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Planned Independent Demand]
platform_version: "BIP"
source_type: community-api-docs
---

# 计划独立需求批量保存

>  请求方式	POST | Planned Independent Demand (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/MFC/requirementsplanning/batchsave
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	需求数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
_status	string	否	是	数据状态，枚举值，Insert：插入，Update：更新 示例：Insert
id	string	否	否	计划独立需求数据ID，当编辑时ID不能为空，创建时ID为空
code	string	否	否	需求编码，手动编码必须输入code，自动不需要输入code
vouchdate	string	否	否	单据日期，新增时不能为空 示例：2026-01-13
orgId	string	否	否	工厂ID，工厂ID和工厂编码不能同时为空，ID和编码同时存在，以ID为准 示例：2261315730772480
orgCode	string	否	否	工厂编码，工厂ID和工厂编码不能同时为空，ID和编码同时存在，以ID为准 示例：005
transTypeId	string	否	否	交易类型ID，交易类型ID和交易类型编码同时为空时取系统默认交易类型，ID和编码同时存在，以ID为准 示例：1248018423173517
transTypeCode	string	否	否	交易类型编码，交易类型ID和交易类型编码同时为空时取系统默认交易类型，ID和编码同时存在，以ID为准 示例：PO-001
departmentId	string	否	否	部门ID，ID和编码同时存在，以ID为准 示例：2261520777695488
departmentCode	string	否	否	部门编码，ID和编码同时存在，以ID为准 示例：005001
remark	string	否	否	备注 示例：xxx
salesForecastDetail	object	是	是	独立需求详情

## 3. 请求示例

Url: /yonbip/MFC/requirementsplanning/batchsave?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"_status": "Insert",
			"id": "",
			"code": "",
			"vouchdate": "2026-01-13",
			"orgId": "2261315730772480",
			"orgCode": "005",
			"transTypeId": "1248018423173517",
			"transTypeCode": "PO-001",
			"departmentId": "2261520777695488",
			"departmentCode": "005001",
			"remark": "xxx",
			"salesForecastDetail": [
				{
					"_status": "",
					"id": "",
					"productId": 2107178162671872,
					"productCode": "000003",
					"requirementDate": "2021-08-24",
					"requirementNumber": 5,
					"assistUnitCount": 0,
					"assistUnit": "",
					"assistUnitCode": "",
					"customerId": "1458124801280835587",
					"customerCode": "",
					"warehouseId": "",
					"warehouseCode": "",
					"projectId": "1988277487931643",
					"projectCode": "00000010",
					"wbs": "2162449770980835332",
					"wbsCode": "任务1223"
				}
			]
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
code	long	否	返回码状态码，200成功999失败 示例：200
code	string	否	单据编号
code	string	否	单据编号
message	string	否	操作通知信息 示例：操作成功
data	object	否	结果数据
count	number
小数位数:0,最大长度:5	否	保存的数据条数
sucessCount	number
小数位数:0,最大长度:5	否	保存成功的条数
failCount	number
小数位数:0,最大长度:5	否	保存失败的条数
messages	string	否	保存失败信息
infos	object	是	保存成功的数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 0,
		"sucessCount": 0,
		"failCount": 0,
		"messages": "",
		"infos": [
			{}
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

