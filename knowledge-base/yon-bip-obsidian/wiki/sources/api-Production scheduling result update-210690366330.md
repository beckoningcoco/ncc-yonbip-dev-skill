---
title: "计划排产结果更新"
apiId: "2106903663301623808"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Interface Table of Production Scheduling Results"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Interface Table of Production Scheduling Results]
platform_version: "BIP"
source_type: community-api-docs
---

# 计划排产结果更新

>  请求方式	POST | Interface Table of Production Scheduling Results (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/schedule/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
isPublish	string	否	是	是否发布：0-不发布；1-发布 示例：0 默认值：0
data	object	是	是	更新或新增的数据集合
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
orgId	string	否	否	组织ID 示例：1915347743952338954
capacityObjectId	string	否	是	加工中心ID 示例：1680783173126979590
routeId	string	否	是	工艺约束ID 示例：1680783173126979590
routeLineId	string	否	是	工艺约束行ID 示例：1680783173126979590
demandId	string	否	是	排产需求ID 示例：2071177300687192071
scheduledQuantity	number
小数位数:2,最大长度:8	否	否	排产数量（与排产主单位数量二者必传一） 示例：2.00
unit	string	否	否	单位 示例：1892244650984996881
scheduledMainQuantity	number
小数位数:2,最大长度:8	否	否	排产主单位数量（与排产数量二者必传一） 示例：2.00
mainUnit	string	否	否	主单位 示例：1892244650984996881
scheduledDate	date
格式:yyyy-MM-dd	否	是	排产日期 示例：2024-01-01
shiftId	string	否	否	班次ID 示例：1742887872475734017
shiftCode	string	否	否	班次编码 示例：早班

## 3. 请求示例

Url: /yonbip/mfg/schedule/save?access_token=访问令牌
Body: {
	"isPublish": "0",
	"data": [
		{
			"resubmitCheckKey": "",
			"orgId": "1915347743952338954",
			"capacityObjectId": "1680783173126979590",
			"routeId": "1680783173126979590",
			"routeLineId": "1680783173126979590",
			"demandId": "2071177300687192071",
			"scheduledQuantity": 2,
			"unit": "1892244650984996881",
			"scheduledMainQuantity": 2,
			"mainUnit": "1892244650984996881",
			"scheduledDate": "2024-01-01",
			"shiftId": "1742887872475734017",
			"shiftCode": "早班"
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
code	string	否	返回码，成功时返回200，失败时返回999 示例：200
message	string	否	错误信息

## 5. 正确返回示例

{
	"code": "200",
	"message": ""
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
999	抱歉，系统出现了一些问题，请稍后再试。如果问题持续，请联系技术支持。	

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

