---
title: "物料档案计量单位换算率查询"
apiId: "1882055425204420609"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料档案计量单位换算率查询

>  请求方式	GET | Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/product/getproductassistunitexchange
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
productId	long	query	是	物料id    示例: 1879670919384268805
unitId	long	query	是	辅计量单位id    示例: 1791182309484920842

## 3. 请求示例

Url: /yonbip/digitalModel/product/getproductassistunitexchange?access_token=访问令牌&productId=1879670919384268805&unitId=1791182309484920842

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
code	string	否	返回码，调用成功返回200 示例：200
message	string	否	调用完成返回信息 示例：操作成功
data	object	否	调用完成返回数据
productId	long	否	物料id 示例：1879670919384268800
mainUnitCount	BigDecimal	否	主计量单位数量 示例：5
unitExchangeType	int	否	换算方式，0表示固定换算，1表示浮动换算 示例：0
assistUnit	long	否	辅计量单位id 示例：1791182309484920800
assistUnitCode	string	否	辅计量单位编码 示例：BOX
assistUnitName	string	否	辅计量单位名称 示例：箱
assistUnitPrecision	int	否	辅计量精度 示例：0
assistUnitConvertCoefficient	BigDecimal	否	辅计量单位换算系数 示例：10
assistUnitTruncationType	int	否	辅计量批发舍位方式 示例：4
assistUnitCount	BigDecimal	否	辅计量单位数量 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"productId": 1879670919384268800,
		"mainUnitCount": 5,
		"unitExchangeType": 0,
		"assistUnit": 1791182309484920800,
		"assistUnitCode": "BOX",
		"assistUnitName": "箱",
		"assistUnitPrecision": 0,
		"assistUnitConvertCoefficient": 10,
		"assistUnitTruncationType": 4,
		"assistUnitCount": 1
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	计量单位ID和物料ID不能为空	入参不能为空

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

