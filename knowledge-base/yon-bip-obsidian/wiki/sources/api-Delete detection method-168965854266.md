---
title: "检测方法保存"
apiId: "1689658542669168642"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Testing Method"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Testing Method]
platform_version: "BIP"
source_type: community-api-docs
---

# 检测方法保存

>  请求方式	POST | Testing Method (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/detectionmethod/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	检测方法数组
code	string	否	否	检测方法编码,在手工编码时必填 示例：TM00005
name	string	否	是	检测方法名称 示例：检测依据测试数据
id	long	否	否	检测方法主键，修改时必输
type	string	否	否	分类 示例：分类1
edition	string	否	否	版本，新增时必输，修改时非必输。修改时，版本不可修改。 示例：1.0
validFrom	string	否	是	有效期从，新增时，如果编码有相同的数据，有效期从必须大于已有版本的有效期从。修改时不做校验。 示例：2022-09-09
expiryDate	string	否	否	有效期止 示例：2031-08-09
_status	string	否	否	操作标识：Insert为新增，Update为修改 示例：Insert 默认值：Insert
note	string	否	否	备注 示例：测试备注

## 3. 请求示例

Url: /yonbip/imcs/detectionmethod/save?access_token=访问令牌
Body: {
	"data": {
		"code": "TM00005",
		"name": "检测依据测试数据",
		"id": 0,
		"type": "分类1",
		"edition": "1.0",
		"validFrom": "2022-09-09",
		"expiryDate": "2031-08-09",
		"_status": "Insert",
		"note": "测试备注"
	}
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
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
code	string	否	返回码，成功时返回200 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	调用成功时的返回数据
code	string	否	检测方法编码 示例：test
name	string	否	检测方法名称 示例：666
note	string	否	备注 示例：002
type	string	否	分类 示例：1.2
edition	string	否	版本 示例：LN-002
expiryDate	string	否	有效期止 示例：2022-07-14 00:00:00
validFrom	string	否	有效期从 示例：2022-07-14 00:00:00
createDate	string	否	创建日期 示例：2022-07-14
createTime	string	否	创建时间 示例：2022-07-14 20:10:36
creator	string	否	创建人名称 示例：张宏明test1
creatorId	long	否	创建人ID 示例：2412726014562560
id	long	否	检测方法ID 示例：2707446336983552

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "test",
		"name": "666",
		"note": "002",
		"type": "1.2",
		"edition": "LN-002",
		"expiryDate": "2022-07-14 00:00:00",
		"validFrom": "2022-07-14 00:00:00",
		"createDate": "2022-07-14",
		"createTime": "2022-07-14 20:10:36",
		"creator": "张宏明test1",
		"creatorId": 2412726014562560,
		"id": 2707446336983552
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
999	编码不能为空	编码不能为空

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

