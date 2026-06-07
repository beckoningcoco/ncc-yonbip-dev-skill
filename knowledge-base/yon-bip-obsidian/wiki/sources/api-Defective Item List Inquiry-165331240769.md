---
title: "取样方式删除"
apiId: "1653312407693950976"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Defective Item"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Defective Item]
platform_version: "BIP"
source_type: community-api-docs
---

# 取样方式删除

>  请求方式	POST | Defective Item (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/samplemethod/delete
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	取样方式
id	long	否	否	取样方式id,id和code必填其中一项，同时填入以id为准 示例：1482575732426145803
code	string	否	否	取样方式编码,id和code必填其中一项，同时填入以id为准 示例：hm删除验证
orgId	string	否	否	使用组织id，传入使用组织id或使用组织编码皆可，只有管理组织可以进行删除操作，单组织时不填，多组织必填，单组织租户下传值不生效，后台自动赋值为当前租户组织 示例：1437879802912047112

## 3. 请求示例

Url: /yonbip/imcs/samplemethod/delete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1482575732426145803,
			"code": "hm删除验证",
			"orgId": "1437879802912047112"
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
data	object	否	接口返回数据
count	long	否	数量 示例：2
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：1
messages	string	是	操作失败提示信息 示例：["new固定浮动数【勿动】取样方式 已被如下实体/属性引用: 检验项目表体(QMSDFM.inspectionPlan.inspectionItemB)/取样方式id(samplingMethod),检验信息子表(QMSQIT.LLCheckApply.LLCheckInformation)/取样方式ID(sampleMethod),检验申请(QMSQIT.LLCheckApply.LLCheckApply)/取样方式ID(sampMethod)"]
failInfos	object	是	操作失败信息列表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			"new固定浮动数【勿动】取样方式 已被如下实体/属性引用: 检验项目表体(QMSDFM.inspectionPlan.inspectionItemB)/取样方式id(samplingMethod),检验信息子表(QMSQIT.LLCheckApply.LLCheckInformation)/取样方式ID(sampleMethod),检验申请(QMSQIT.LLCheckApply.LLCheckApply)/取样方式ID(sampMethod)"
		],
		"failInfos": [
			{
				"code": "new固定浮动数【勿动】",
				"message": "取样方式 已被如下实体/属性引用: 检验项目表体(QMSDFM.inspectionPlan.inspectionItemB)/取样方式id(samplingMethod),检验信息子表(QMSQIT.LLCheckApply.LLCheckInformation)/取样方式ID(sampleMethod),检验申请(QMSQIT.LLCheckApply.LLCheckApply)/取样方式ID(sampMethod)"
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
999	ID和CODE不能同时为空	

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

