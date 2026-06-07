---
title: "电商对账单导入"
apiId: "47690564cb814aa3a58c650ad64ece08"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Online Retailer Statement"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Online Retailer Statement]
platform_version: "BIP"
source_type: community-api-docs
---

# 电商对账单导入

>  请求方式	POST | Online Retailer Statement (B2C)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/accountstatement/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	扩展数据
shopCode	string	否	是	店铺编码 示例：1008
tid	string	否	是	交易编号 示例：DD20210719
financeNo	string	否	是	财务流水号 示例：CC20210719
costItemName	string	否	是	费用项目（系统预置值：货款、佣金、其他。用户也可手工添加。当费用项目为“货款”时，参数inFee必填；当费用项目为非“货款”时，参数outFee必填） 示例：佣金
confirmDate	DateTime	否	是	确认日期 示例：2021-07-19 00:00:00
businessNo	string	否	否	业务流水号 示例：S20210719
inFee	string	否	否	货款金额 示例：32.2
outFee	string	否	否	费用金额 示例：22,7
productName	string	否	否	商品名称 示例：牙膏
orderFee	float	否	否	订单金额 示例：233
otherAccount	string	否	否	对方账户 示例：2222333344445555123
orderDate	DateTime	否	否	订单日期 示例：2021-07-11 11:23:45
memo	string	否	否	备注 示例：这是一条电商对账单API导入的测试数据
cnBillCode	string	否	否	菜鸟单据编号 示例：CN001
_status	string	否	是	Insert,Update 示例：Insert

## 3. 请求示例

Url: /yonbip/sd/accountstatement/save?access_token=访问令牌
Body: {
	"data": [
		{
			"shopCode": "1008",
			"tid": "DD20210719",
			"financeNo": "CC20210719",
			"costItemName": "佣金",
			"confirmDate": "2021-07-19 00:00:00",
			"businessNo": "S20210719",
			"inFee": "32.2",
			"outFee": "22,7",
			"productName": "牙膏",
			"orderFee": 233,
			"otherAccount": "2222333344445555123",
			"orderDate": "2021-07-11 11:23:45",
			"memo": "这是一条电商对账单API导入的测试数据",
			"cnBillCode": "CN001",
			"_status": "Insert"
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
code	int	否	返回状态码
message	string	否	返回提示信息
data	object	否	返回操作数据
count	string	否	总条数
sucessCount	string	否	成功条数
failCount	string	否	失败条数
messages	string	否	提示信息
infos	object	否	信息

## 5. 正确返回示例

{
	"code": 0,
	"message": "",
	"data": {
		"count": "",
		"sucessCount": "",
		"failCount": "",
		"messages": "",
		"infos": {
			"shopCode": "",
			"tid": "",
			"financeNo": "",
			"costItemName": "",
			"confirmDate": "",
			"businessNo": "",
			"inFee": "",
			"outFee": "",
			"productName": "",
			"shop_id": "",
			"pubts": "",
			"costItem": "",
			"cnBillCode": "",
			"org": "",
			"tenant": "",
			"yTenantId": "",
			"accountCustomItemtenant": "",
			"orderDate": "",
			"memo": "",
			"otherAccount": "",
			"orderFee": 0
		}
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
999	业务逻辑异常	请检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-10-20	
更新
请求参数 _status
	2	2025-06-25	
更新
请求说明
更新
请求参数 (14)
更新
返回参数 (29)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

