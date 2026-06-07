---
title: "根据表单模型id查询表单模型"
apiId: "ac305dbad08d44c8a121b0c7405eca85"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Approval"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Approval]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据表单模型id查询表单模型

>  请求方式	POST | Approval (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/openapi/iform/queryForm
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
pkBo	string	否	是	表单模型id 示例：5d6e2bf3470f4590a37bd5d3bb300548
appSource	string	否	否	新老租户区分（老租户传null,新租户传"approve"或不传）

## 3. 请求示例

Url: /yonbip/uspace/openapi/iform/queryForm?access_token=访问令牌
Body: {
	"pkBo": "5d6e2bf3470f4590a37bd5d3bb300548",
	"appSource": ""
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
code	long	否	返回状态 示例：200
message	string	否	返回信息描述
data	object	否	返回数据对象
pk_bo	string	否	表单模型id
boAgg	object	否	表单模型及表单实例数据结构
boSubAgg	string	否	子表控件信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "",
	"data": {
		"pk_bo": "",
		"boAgg": {
			"bo": {
				"pk_bo": "5d6e2bf3470f4590a37bd5d3bb300548",
				"bo_code": "1640227255579",
				"bo_name": "签章流程环节测试",
				"bo_name2": "签章流程环节测试",
				"descripsion": "签章流程环节测试",
				"pk_botype": "d7836340afb04da8b51bd8f57b088623",
				"pk_metadata": "",
				"bo_tablename": "iform_ddok9sw4_approve_qzlchjcs",
				"pk_parent": "",
				"pk_org": "",
				"hide": "0",
				"showlist": false,
				"fulltablename": "",
				"sysext": "",
				"sysext2": "\"{\\\"fieldId\\\":\\\"202112271838579BPIg4R1ay\\\",\\\"title\\\":\\\"盖章人\\\",\\\"componentKey\\\":\\\"Signer\\\",\\\"invisible\\\":false,\\\"editable\\\":\\\"\\\",\\\"isReadonly\\\":false,\\\"textAlign\\\":\\\"\\\",\\\"inLeft\\\":false,\\\"flexibleTitle\\\":false,\\\"crux\\\":false,\\\"hideTitle\\\":false,\\\"hideTopTitle\\\":false,\\\"required\\\":false,\\\"mainTableField\\\":\\\"\\\",\\\"visible\\\":true,\\\"isOperationRule\\\":false,\\\"showOperValueInGird\\\":true,\\\"rowCount\\\":true,\\\"rowCountUnique\\\":false,\\\"isTotal\\\":false,\\\"average\\\":false,\\\"maxInGird\\\":false,\\\"minInGird\\\":false,\\\"size\\\":\\\"large\\\",\\\"borderColor\\\":\\\"\\\",\\\"titleBold\\\":false,\\\"titleUnderline\\\":false,\\\"titleFontColor\\\":\\\"\\\",\\\"titleFontFamily\\\":\\\"\\\",\\\"titleFontSize\\\":\\\"\\\",\\\"tips\\\":\\\"\\\",\\\"margin\\\":\\\"10px 20px 10px 20px\\\",\\\"defaultValue\\\":\\\"[{\\\\\\\"userId\\\\\\\":\\\\\\\"d2769a9a-e1e5-4775-b1da-907e666b46b3\\\\\\\",\\\\\\\"userName\\\\\\\":\\\\\\\"李雄丰\\\\\\\",\\\\\\\"type\\\\\\\":\\\\\\\"0\\\\\\\",\\\\\\\"companyId\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"sourceId\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"sourceType\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"companyName\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"mainstayType\\\\\\\":\\\\\\\"\\\\\\\"}]\\\"}\"",
				"sysext3": "fbc59a5c-6399-11ec-90ae-32f297b4c0d4",
				"sysext4": "",
				"sysext5": "",
				"busiext": "d2769a9a-e1e5-4775-b1da-907e666b46b3",
				"busiext2": "2021-12-28 09:52:23",
				"busiext3": "",
				"enable": true,
				"icon": "icon-1",
				"create_time": "2021-12-23 02:40:55",
				"uts": "2021-12-28 09:52:23",
				"modify_user": "d2769a9a-e1e5-4775-b1da-907e666b46b3",
				"layoutdetail": "",
				"source_pk": "",
				"source_version": 0,
				"ispublishedrefer": "0",
				"copy_printcode": "",
				"create_user": "d2769a9a-e1e5-4775-b1da-907e666b46b3",
				"tenantid": "ddok9sw4_approve",
				"datamap": {
					"pk_botype": "d7836340afb04da8b51bd8f57b088623",
					"copy_printcode": "",
					"bo_name": "签章流程环节测试",
					"sysext": "",
					"icon": "icon-1",
					"bo_code": "1640227255579",
					"sysext5": "",
					"sysext4": "",
					"pk_bo": "5d6e2bf3470f4590a37bd5d3bb300548",
					"ispublishedrefer": "0",
					"ytenant_id": "ddok9sw4",
					"sysext3": "fbc59a5c-6399-11ec-90ae-32f297b4c0d4",
					"sysext2": "",
					"enable": "1",
					"bo_tablename": "iform_ddok9sw4_approve_qzlchjcs",
					"busiext": "d2769a9a-e1e5-4775-b1da-907e666b46b3",
					"tenantid": "ddok9sw4_approve",
					"layoutdetail": "",
					"busiext2": "2021-12-28 09:52:23",
					"busiext3": "",
					"source_pk": ""
				},
				"enableVersion": "15"
			},
			"boas": [
				{
					"pk_attribute": "039f49a3dc3343b1aad43e0cfd40cffd",
					"code": "status",
					"name": "单据状态",
					"descripsion": "",
					"required": false,
					"islist": false,
					"isdeleted": false,
					"type": "TEXT",
					"pk_metadata_attr": "",
					"sqltype": "VARCHAR",
					"columncode": "status",
					"columnlength": 200,
					"precise": "",
					"tableid": "",
					"fieldtype": "",
					"ishidden": false,
					"orderid": 0,
					"options": "",
					"readonly": false,
					"defaultvalue": "",
					"length": "200",
					"pk_bo": "5d6e2bf3470f4590a37bd5d3bb300548",
					"isvisible": false,
					"sysext": "",
					"sysext2": "",
					"tenantid": "ddok9sw4_approve",
					"sqltype_style": "",
					"datamap": {
						"sqltype": "VARCHAR",
						"ishidden": 0,
						"code": "status",
						"columncode": "status",
						"pk_metadata_attr": "",
						"orderid": 0,
						"columnlength": 200,
						"sysext": "",
						"length": "200",
						"type": "TEXT",
						"pk_bo": "5d6e2bf3470f4590a37bd5d3bb300548",
						"isdeleted": 0,
						"required": 0,
						"pk_attribute": "039f49a3dc3343b1aad43e0cfd40cffd",
						"ytenant_id": "ddok9sw4",
						"readonly": 0,
						"sysext2": "",
						"name": "单据状态",
						"tenantid": "ddok9sw4_approve",
						"islist": 0
					},
					"queryWithDeletedAttr": false,
					"ytenant_id": "ddok9sw4"
				}
			]
		},
		"boSubAgg": ""
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
310036	非法token(无效的token)	重新获取正确的token

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

