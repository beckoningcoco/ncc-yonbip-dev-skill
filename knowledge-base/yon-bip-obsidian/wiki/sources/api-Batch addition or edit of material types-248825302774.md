---
title: "物料类型批量新增编辑"
apiId: "2488253027740286976"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "PLM Material Management"
domain: "PLMPDM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, PLM Material Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料类型批量新增编辑

>  请求方式	POST | PLM Material Management (PLMPDM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/materialClassify/api/v1/batchSave
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
billnum	string	否	是	单据号/业务类型标识(UUID格式) 示例：0f805bd9-674e-4756-b6b8-3139a29f2163 默认值：0f805bd9-674e-4756-b6b8-3139a29f2163
data	object	是	是	请求数据对象
code	string	否	是	物料分类编码 示例：CL-00000073
lct_id	string	否	是	生命周期模板ID 示例：1980667075538452570
cOwnOrgId	string	否	是	所属组织ID 示例：1980670408412626952
cOwnOrgId_name	string	否	是	所属组织名称 示例：test001
name	string	否	是	物料分类名称 示例：test0305002
codeSchemaId_name	string	否	否	编码方案名称 示例：物料编码test
cCreateOrgId	string	否	是	创建组织ID 示例：1980670408412626952
codeSchemaId	string	否	否	编码方案ID 示例：1981159218661031938
cCreateOrgId_name	string	否	否	创建组织名称 示例：test001
lct_id_name	string	否	否	生命周期模板名称 示例：研发物料类型-默认模板使用
cState	string	否	是	状态(0-启用) 示例：0 默认值：0
parent_name	string	否	否	父节点名称 示例：root 默认值：root
bCodeByClassify	string	否	是	是否按分类编码(false-否) 示例：false 默认值：false
classifyIdentifier	string	否	是	分类标识 示例：test0305002
tRemark	string	否	否	备注 示例：测试数据
tenant	string	否	是	租户 示例：bzot2m5x
sort	string	否	否	排序号 示例：0 默认值：0
path	string	否	否	路径 示例：| 默认值：|
level	number
小数位数:0,最大长度:10	否	否	层级 示例：1 默认值：1
isEnd	string	否	否	是否末级(true-是) 示例：true 默认值：true
dr	string	否	否	删除标志(0-未删除) 示例：0 默认值：0
supportDisplaySet	string	否	是	是否支持显示设置(0-否) 示例：0 默认值：0
cgrRoleAuthList	object	是	否	角色授权列表
defineList	object	是	否	定义特性列表
defaultValueList	object	是	否	默认值列表
_status	string	否	是	操作状态(Insert-新增) 示例：Insert
id	string	否	否	ID

## 3. 请求示例

Url: /yonbip/RDC/materialClassify/api/v1/batchSave?access_token=访问令牌
Body: {
	"billnum": "0f805bd9-674e-4756-b6b8-3139a29f2163",
	"data": [
		{
			"code": "CL-00000073",
			"lct_id": "1980667075538452570",
			"cOwnOrgId": "1980670408412626952",
			"cOwnOrgId_name": "test001",
			"name": "test0305002",
			"codeSchemaId_name": "物料编码test",
			"cCreateOrgId": "1980670408412626952",
			"codeSchemaId": "1981159218661031938",
			"cCreateOrgId_name": "test001",
			"lct_id_name": "研发物料类型-默认模板使用",
			"cState": "0",
			"parent_name": "root",
			"bCodeByClassify": "false",
			"classifyIdentifier": "test0305002",
			"tRemark": "测试数据",
			"tenant": "bzot2m5x",
			"sort": "0",
			"path": "|",
			"level": 1,
			"isEnd": "true",
			"dr": "0",
			"supportDisplaySet": "0",
			"cgrRoleAuthList": [
				{
					"roleId_orgId_name": "企业账号级",
					"roleId_orgId": "",
					"hasDefaultInit": true,
					"_id": "rowId_70",
					"_tableDisplayOutlineAll": true,
					"roleId_code": "PLM_002",
					"roleId": "2a6ba89f-58dd-492d-b716-b023675ab401",
					"_isColError": false,
					"_colErrorField": "",
					"_status": "Insert",
					"ttt_id": "rowId_70",
					"id": ""
				}
			],
			"defineList": [
				{
					"hasDefaultInit": true,
					"_id": "rowId_51",
					"_tableDisplayOutlineAll": false,
					"name": "测试特征",
					"cDefine": "devpartDefineCharacter__test0424001",
					"_isColError": false,
					"_colErrorField": "",
					"_status": "Insert",
					"ttt_id": "rowId_51",
					"id": ""
				}
			],
			"defaultValueList": [
				{
					"hasDefaultInit": true,
					"_id": "rowId_19",
					"_tableDisplayOutlineAll": false,
					"filedCode_name": "单位",
					"filedCode": "unit",
					"_isColError": false,
					"_colErrorField": "",
					"filedValue_name": "kg",
					"filedValue": "1981178314063085575",
					"_status": "Insert",
					"ttt_id": "rowId_19",
					"id": ""
				}
			],
			"_status": "Insert",
			"id": ""
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
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	接口返回信息 示例：删除成功
data	object	否	业务数据对象
success	boolean	否	成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "删除成功",
	"data": {},
	"success": true
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

