---
title: "房产税源信息-房屋租赁信息-新增"
apiId: "2121578552943443973"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Property tax source information"
domain: "TAX"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 房产税源信息-房屋租赁信息-新增

>  请求方式	POST | Property tax source information (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/other-tax/api/house-lease/v1/add
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
recordType	string	否	否	记录分类 0-正常 1-税金调整 示例：1
orgCode	string	否	是	税务组织编码 示例：ON0011
lyid	string	否	否	房源来源业务id(房源来源业务id和房产税源编号不可同时为空，且不能同时填写) 示例：ly0011
code	string	否	否	房源房产税源编码(房源来源业务id和房产税源编号不可同时为空，且不能同时填写) 示例：C0011
sourceCode	string	否	是	租赁信息来源业务编号 示例：SC001001
sourceId	string	否	是	租赁信息来源id 示例：S1001122
rentArea	number
小数位数:0,最大长度:10	否	是	出租面积 示例：60
rentIncome	number
小数位数:0,最大长度:10	否	是	租金总收入 示例：1500
rentBegin	string	否	是	租赁期起 示例：2022-01-05
rentEnd	string	否	是	租赁期止 示例：2022-11-05
remark	string	否	否	备注 示例：租赁信息新增
updateHouseTax	string	否	否	自动生成/更新房产税台账(0-否；1-是) 示例：0 默认值：0

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/house-lease/v1/add?access_token=访问令牌
Body: {
	"recordType": "1",
	"orgCode": "ON0011",
	"lyid": "ly0011",
	"code": "C0011",
	"sourceCode": "SC001001",
	"sourceId": "S1001122",
	"rentArea": 60,
	"rentIncome": 1500,
	"rentBegin": "2022-01-05",
	"rentEnd": "2022-11-05",
	"remark": "租赁信息新增",
	"updateHouseTax": "0"
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
message	string	否	响应信息 示例：成功
code	string	否	响应编码 示例：200
data	object	否	返回数据
houseAccountLeaseCode	string	否	房屋租赁明细编号
sourceId	string	否	租赁信息来源id

## 5. 正确返回示例

{
	"message": "成功",
	"code": "200",
	"data": {
		"houseAccountLeaseCode": "",
		"sourceId": ""
	}
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
9999	系统异常	根据message信息修改
1001	请设置Redis客户端编码	设置redis客户端信息

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-09	
更新
请求说明
新增
请求参数 recordType
新增
请求参数 defineTerm
更新
请求参数 rentIncome
修改字段名
	2	2025-07-03	
更新
请求参数 orgCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

