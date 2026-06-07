---
title: "房产税台账-从价信息-新增(废弃)"
apiId: "1879030900645691393"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Real estate tax account"
domain: "TAX"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 房产税台账-从价信息-新增(废弃)

>  请求方式	POST | Real estate tax account (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/other-tax/api/house-valorem/add
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
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
orgCode	string	否	是	组织编码 示例：123123123
houseCode	string	否	否	房产编号（房产编号和房产税源编号不可同时为空，且不能同时填写） 示例：112233
originalValue	BigDecimal	否	否	房产计税价格（房产原值）13位整数+2位小数 示例：123.22
rentValue	BigDecimal	否	是	出租房产原值。13位整数+2位小数 示例：23.22
rentArea	BigDecimal	否	是	出租房产面积。13位整数+2位小数 示例：12.22
rateRatio	byte	否	是	计税比例（%）。最大为100，最小为0示例：传入20，则认为是0.2 示例：2
taxBegin	string	否	是	纳税义务起始时间，格式：yyyy-MM-dd 示例：2023-12-30
originalMethod	number
小数位数:0,最大长度:1	否	是	房产计税价格是否根据宗地容积率计算：0-否；1-是 示例：0
attachment	number
小数位数:2,最大长度:15	否	否	房屋附着物13位整数+2位小数 示例：125.32
landValue	number
小数位数:0,最大长度:15	否	否	土地价值。13位整数+2位小数 示例：1023.55
plotRatio	number
小数位数:2,最大长度:4	否	否	宗地容积率2位整数+2位小数 示例：2.03
sourceValue	number
小数位数:0,最大长度:15	否	否	房产原值（元）13位整数+2位小数 示例：123.22
code	string	否	否	房产税源编号（房产编号和房产税源编号不可同时为空，且不能同时填写） 示例：FCSY20240808000001

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/house-valorem/add?access_token=访问令牌
Body: [{
	"orgCode": "123123123",
	"houseCode": "112233",
	"originalValue": 123.22,
	"rentValue": 23.22,
	"rentArea": 12.22,
	"rateRatio": 2,
	"taxBegin": "2023-12-30",
	"originalMethod": 0,
	"attachment": 125.32,
	"landValue": 1023.55,
	"plotRatio": 2.03,
	"sourceValue": 123.22,
	"code": "FCSY20240808000001"
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
code	string	否	编码 示例：0000
message	string	否	消息 示例：操作成功

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
9999	系统异常	按返回信息处理

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

