---
title: "物料申请单列表查询-特征V2"
apiId: "1697644647804305410"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料申请单列表查询-特征V2

>  请求方式	POST | Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/productapply/listbypage
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
fields	string	是	是	查询返回字段，参数详见示例，参数描述见返回值 示例：["id","applyCode","applyType","productCode","verifyState","status","effectType","effectStatus","effectTime","productUpdateStatus","failInfo","createDate","applyReason","bizOperator","bizOperatorCode","bizOperatorName","applyDepartment"]
applyCode	string	否	否	申请单编码，精确匹配。 示例：6666
status	int	否	否	单据状态，0：未审核、1：已审核、2：已关闭、3：审核中、4：锁定。精确匹配。 示例：1
productCode	string	否	否	物料编码，精确匹配。 示例：code12
timestamp	string	否	否	时间戳，返回大于等于此时间戳的数据。 示例：2022-08-11 19:39:46
auditTime	string	否	否	审核时间，精确匹配。 示例：2022-08-11 19:39:46
auditDate	string	否	否	审核日期，返回大于等于此时间的数据。 示例：2022-08-11
createDate	string	否	否	创建日期，返回大于等于此时间的数据。 示例：2022-08-11
pageIndex	long	否	否	页码，不传默认为1。 示例：1 默认值：1
pageSize	long	否	否	每页数量，不传默认为500，最大不超过5000。 示例：1 默认值：100

## 3. 请求示例

Url: /yonbip/digitalModel/productapply/listbypage?access_token=访问令牌
Body: {
	"fields": [
		"id",
		"applyCode",
		"applyType",
		"productCode",
		"verifyState",
		"status",
		"effectType",
		"effectStatus",
		"effectTime",
		"productUpdateStatus",
		"failInfo",
		"createDate",
		"applyReason",
		"bizOperator",
		"bizOperatorCode",
		"bizOperatorName",
		"applyDepartment"
	],
	"applyCode": "6666",
	"status": 1,
	"productCode": "code12",
	"timestamp": "2022-08-11 19:39:46",
	"auditTime": "2022-08-11 19:39:46",
	"auditDate": "2022-08-11",
	"createDate": "2022-08-11",
	"pageIndex": 1,
	"pageSize": 1
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用完成时的返回信息 示例：操作成功
data	object	是	调用完成时的返回数据
id	number
小数位数:0,最大长度:20	否	物料申请单ID 示例：1481825710760263700
applyCode	string	否	申请编码 示例：20220620001
applyType	string	否	申请类型，0：新增、1：变更。 示例：20220620001
productCode	string	否	物料编码 示例：YRM2000001
verifyState	string	否	审批状态，0：开立、1：审批中、2：审批完成、3：流程终止、4：驳回。 示例：YRM2332-1-YRM2000001
status	number
小数位数:0,最大长度:2	否	单据状态，0：未审核、1：已审核、2：已关闭、3：审核中、4：锁定。 示例：2
effectType	string	否	生效类型，0：立即处理、1：定时处理。 示例：0
effectStatus	string	否	生效状态，0：未处理、1：处理中、2：成功、3：失败。 示例：2
effectTime	string	否	计划生效时间 示例：2021-07-17 01:39:00
productUpdateStatus	number
小数位数:0,最大长度:2	否	物料生效状态，0：成功、1：失败。 示例：1
productUpdateTime	string	否	物料生效时间 示例：2021-07-17 01:39:00
failInfo	string	否	失败原因 示例：物料编码为空
createDate	string	否	创建日期 示例：createDate
applyReason	string	否	申请原因 示例：工程需要
bizOperator	string	否	申请业务员id 示例：666666
bizOperatorCode	string	否	业务员编码 示例：666666
bizOperatorName	string	否	业务员名称 示例：小王
applyOrg	string	否	申请组织id 示例：666666
applyDepartment	string	否	申请部门id 示例：1481825410114125800
applyDepartmentCode	string	否	申请部门编码 示例：1481825410114125800
applyDepartmentName	string	否	申请部门名称 示例：简称
auditor	string	否	审批人名称 示例：张总
auditTime	string	否	审批时间 示例：2021-07-17 01:39:00
auditDate	string	否	审核日期 示例：2021-07-17 00:00:00
creator	string	否	创建人名称 示例：小王
createTime	string	否	创建时间 示例：2021-07-17 01:39:00
wfControlled	string	否	是否审批流控制，1：是、0：否。 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": 1481825710760263700,
			"applyCode": "20220620001",
			"applyType": "20220620001",
			"productCode": "YRM2000001",
			"verifyState": "YRM2332-1-YRM2000001",
			"status": 2,
			"effectType": "0",
			"effectStatus": "2",
			"effectTime": "2021-07-17 01:39:00",
			"productUpdateStatus": 1,
			"productUpdateTime": "2021-07-17 01:39:00",
			"failInfo": "物料编码为空",
			"createDate": "createDate",
			"applyReason": "工程需要",
			"bizOperator": "666666",
			"bizOperatorCode": "666666",
			"bizOperatorName": "小王",
			"applyOrg": "666666",
			"applyDepartment": "1481825410114125800",
			"applyDepartmentCode": "1481825410114125800",
			"applyDepartmentName": "简称",
			"auditor": "张总",
			"auditTime": "2021-07-17 01:39:00",
			"auditDate": "2021-07-17 00:00:00",
			"creator": "小王",
			"createTime": "2021-07-17 01:39:00",
			"wfControlled": "1"
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
118001	根据条件查询结果为空	根据条件查询结果为空
118000	入参不能为空	入参不能为空
999	业务异常	业务异常

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-03	
新增
返回参数 (27)
更新
返回参数 data
删除
返回参数 (34)
修改API名称

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

