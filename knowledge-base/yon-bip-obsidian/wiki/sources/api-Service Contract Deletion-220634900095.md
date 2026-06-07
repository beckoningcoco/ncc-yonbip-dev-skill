---
title: "服务合同保存"
apiId: "2206349000953561092"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Service Contract"
domain: "EQP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Service Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 服务合同保存

>  请求方式	POST | Service Contract (EQP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pes/servicecontract
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	服务合同参数对象
orgId	string	否	是	服务合同组织id或code 示例：2091050432280395786
executiveOrgId	string	否	否	服务合同执行组织id或code 示例：2091050432280395786
code	string	否	否	编码,新增时必填，更新时不必填 示例：SC202502050004
name	string	否	否	名称,新增时必填，更新时不必填 示例：1231313
contypeId	string	否	是	合同类型主键 示例：2108077984734248964
customerId	string	否	是	客户主键 示例：2123889692089253888
projectId	string	否	否	项目主键 示例：2132685527403986950
linkman	string	否	否	联系人主键 示例：2164589644008128521
phone	string	否	否	联系电话 示例：13681547440
dateSign	date
格式:yyyy-MM-dd	否	是	签订日期 示例：2025-02-05
dateEffect	date
格式:yyyy-MM-dd	否	是	生效日期 示例：2025-02-22
dateExpire	date
格式:yyyy-MM-dd	否	是	到期日期 示例：2025-02-28
contractAmount	number
小数位数:2,最大长度:10	否	否	合同金额 示例：6
tcId	string	否	否	币种主键 示例：2091009862023512106
isEffective	string	否	是	终止 示例：0
memo	string	否	否	描述 示例：财务室备注
creator	string	否	否	创建人 示例：李东伟
createTime	string	否	否	创建时间 示例：2025-02-21 14:00:38
id	string	否	否	主表数据行主键，更新时需要传入;
_status	string	否	是	状态：状态，支持Insert新增，支持Update更新 示例：Insert
smsContractsDetailList	object	是	否	服务合同数据对象

## 3. 请求示例

Url: /yonbip/pes/servicecontract?access_token=访问令牌
Body: {
	"data": {
		"orgId": "2091050432280395786",
		"executiveOrgId": "2091050432280395786",
		"code": "SC202502050004",
		"name": "1231313",
		"contypeId": "2108077984734248964",
		"customerId": "2123889692089253888",
		"projectId": "2132685527403986950",
		"linkman": "2164589644008128521",
		"phone": "13681547440",
		"dateSign": "2025-02-05",
		"dateEffect": "2025-02-22",
		"dateExpire": "2025-02-28",
		"contractAmount": 6,
		"tcId": "2091009862023512106",
		"isEffective": "0",
		"memo": "财务室备注",
		"creator": "李东伟",
		"createTime": "2025-02-21 14:00:38",
		"id": "",
		"_status": "Insert",
		"smsContractsDetailList": [
			{
				"id": "23536435756874624352345",
				"equId": "2097693587045089288",
				"num": 1,
				"serviceLevel": "2180222036480622596",
				"maintenanceLevel": "2180221744401874950",
				"unit": "2097686431623806981",
				"dateEffect": "2025-02-04",
				"dateExpire": "2025-02-28",
				"memo": "333",
				"_status": "Insert"
			}
		]
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
code	number
小数位数:0,最大长度:10	否	状态码（200：成功，其他：失败） 示例：200
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
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
orgId	string	否	组织主键 示例：2091050432280395786
orgIdName	string	否	组织名称 示例：超级版-业务单元01
executiveOrgId	string	否	执行组织主键 示例：2091050432280395786
executiveOrgIdName	string	否	执行组织名称 示例：超级版-业务单元01
code	string	否	编码 示例：SC202502050004
name	string	否	名称 示例：1231313
contypeId	string	否	合同类型主键 示例：2108077984734248964
contypeIdName	string	否	合同类型名称 示例：合同类型01
customerId	string	否	客户主键 示例：2123889692089253888
customerIdName	string	否	客户名称 示例：茅台
projectId	string	否	项目主键 示例：2132685527403986950
projectIdName	string	否	项目名称 示例：项目111301
linkman	string	否	联系人主键 示例：2164589644008128521
linkmanName	string	否	联系人名称 示例：王512953
phone	string	否	联系电话 示例：13681547440
dateSign	string	否	签订日期 示例：2025-02-05 00:00:00
dateEffect	string	否	生效日期 示例：2025-02-22 00:00:00
dateExpire	string	否	到期日期 示例：2025-02-28 00:00:00
contractAmount	number
小数位数:2,最大长度:10	否	合同金额 示例：6
tcId	string	否	币种主键 示例：2091009862023512106
tcIdName	string	否	币种名称 示例：人民币
isEffective	number
小数位数:0,最大长度:10	否	终止 示例：0
memo	string	否	备注 示例：财务室备注
creator	string	否	创建人 示例：李东伟
createTime	string	否	创建时间 示例：2025-02-21 14:04:46
smsContractsDetailList	object	是	服务合同数据子表对象
ytenant	string	否	租户主键 示例：0000M1788137EN9KPL0000

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"orgId": "2091050432280395786",
		"orgIdName": "超级版-业务单元01",
		"executiveOrgId": "2091050432280395786",
		"executiveOrgIdName": "超级版-业务单元01",
		"code": "SC202502050004",
		"name": "1231313",
		"contypeId": "2108077984734248964",
		"contypeIdName": "合同类型01",
		"customerId": "2123889692089253888",
		"customerIdName": "茅台",
		"projectId": "2132685527403986950",
		"projectIdName": "项目111301",
		"linkman": "2164589644008128521",
		"linkmanName": "王512953",
		"phone": "13681547440",
		"dateSign": "2025-02-05 00:00:00",
		"dateEffect": "2025-02-22 00:00:00",
		"dateExpire": "2025-02-28 00:00:00",
		"contractAmount": 6,
		"tcId": "2091009862023512106",
		"tcIdName": "人民币",
		"isEffective": 0,
		"memo": "财务室备注",
		"creator": "李东伟",
		"createTime": "2025-02-21 14:04:46",
		"smsContractsDetailList": [
			{
				"equId": "2097693587045089288",
				"equIdName": "qs0927002测试",
				"num": 1,
				"serviceLevel": "2180222036480622596",
				"serviceLevelName": "测试0121",
				"maintenanceLevel": "2180221744401874950",
				"maintenanceLevelName": "测试12",
				"unit": "2097686431623806981",
				"unitName": "千克",
				"dateEffect": "2025-02-04 00:00:00",
				"dateExpire": "2025-02-28 00:00:00",
				"memo": "333",
				"smsContractsId": "2206907836515483656",
				"pubts": "2025-02-21 14:04:46",
				"id": "2206907836515483657"
			}
		],
		"ytenant": "0000M1788137EN9KPL0000"
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-05	
新增
请求参数 userDefineCharacter
新增
请求参数 userDefineCharacter
新增
返回参数 userDefineCharacter
新增
返回参数 userDefineCharacter

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

