---
title: "根据业务量指标定义编码批量查询维度类型配置信息"
apiId: "1972396798109024261"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Business Volume Indicator Definition"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Volume Indicator Definition]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据业务量指标定义编码批量查询维度类型配置信息

>  请求方式	GET | Business Volume Indicator Definition (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/AMP/businessvolume/batchgetdimensionconfigbycodes
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
codes	string	query	是	多个业务量指标定义编码，以","号分割    示例: zr01

## 3. 请求示例

Url: /yonbip/AMP/businessvolume/batchgetdimensionconfigbycodes?access_token=访问令牌&codes=zr01

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
code	string	否	返回状态编码 示例：200
message	string	否	返回状态提示 示例：操作成功
data	object	是	返回数据
code	string	否	业务量指标定义编码 示例：123
name	string	否	业务量指标定义名称 示例：321
indicatorType	string	否	指标定义类别，sum：总值，fixed：固定值 示例：fixed
indicatorStatus	string	否	指标定义启用状态，0：启用，1：停用，2：未启用 示例：0
indicatorUnit	string	否	指标单位id 示例：1525645209096421378
id	string	否	指标定义id 示例：1584144184091082753
indicatorUnitCode	string	否	指标单位编码 示例：HUR
businessVolumeDimension	object	是	指标维度数组

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"code": "123",
			"name": "321",
			"indicatorType": "fixed",
			"indicatorStatus": "0",
			"indicatorUnit": "1525645209096421378",
			"id": "1584144184091082753",
			"indicatorUnitCode": "HUR",
			"businessVolumeDimension": [
				{
					"id": "1584144184091082754",
					"docCode": "accBody",
					"required": true,
					"sortNumber": 1,
					"refCode": "bd_allaccbodyref",
					"uri": "accBody"
				}
			]
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	请检查请求参数

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

