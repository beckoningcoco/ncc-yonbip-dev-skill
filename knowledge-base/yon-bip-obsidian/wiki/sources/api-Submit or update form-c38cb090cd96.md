---
title: "提交或更新表单"
apiId: "c38cb090cd964b4f8f46c749154912c2"
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

# 提交或更新表单

>  请求方式	POST | Approval (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/openapi/iform/signature/submit
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
iformUserId	string	否	是	提交用户id 示例：d2769a9a-e1e5-4775-b1da-907e666b46b3
pkBo	string	否	是	表单模型id 示例：f2e284951b274213b8e7269163b48b76
pkBoins	string	否	否	单据记录id（传入已经存在的pkBoins则进行更新数据，新增时无需传入） 示例：e89d349b8c6b4b39873b879162724bba
addData2ES	boolean	否	是	是否同步es默认请传true(会影响表单管理能否看到数据) 示例：true 默认值：true
startProcess	boolean	否	是	是否发起流程，默认请传true 示例：true
checkData	boolean	否	否	是否进行校验，默认传false,为true时会校验必填项等) 示例：false
supplyCallback	boolean	否	否	是否回调 示例：true
singatureInfo	object	否	否	签章控件参数（使用了电子合同盖章功能才需要传入）
signerUsers	object	是	否	签署人对象集合
fileDataDtos	object	是	否	签章附件参数（集合对象）
formData	object	是	否	表单普通控件参数对象
pkAttribute	string	否	否	设计器控件id 示例：273266b051b64c4fb39bf5351a409129
code	string	否	否	设计器编码 示例：20211227140013rDDLJB6eS8
columnCode	string	否	是	对应模型字段名称 示例：csms_1640584904418931
type	string	否	否	数据类型 示例：Text
sqlType	string	否	否	数据库字段接收类型 示例：VARCHAR
value	string	否	是	真实值(选项，用户，部门等控件传入引用对象的id) 示例：API接口提交描述
showValue	string	否	否	显示值（传入与真实值对应的展示名称，如选项内容） 示例：API接口提交描述
subFormMap	object	否	否	子表数据(数据结构和主表封装的类似，需要传入子表的对象键pk_sub_bo子表的模型id，如果修改子表需要传入pkBoins键，值传入子表数据pk内容，新增无需传入)
1d44c2d6421447f994af66c7cbe73078	object	是	否	子表的对象（map结构的键-子表模型id子表的pkBo,取子表模型的pk_sub_bo）
appSource	string	否	否	新老租户区分（老租户传null,新租户传"approve"或不传）
startProcesskey	string	否	否	发起流程定义key(如果传tempSave参数可以指定发起表单为草稿态,如果不传则正常运行态) 示例：tempSave

## 3. 请求示例

Url: /yonbip/uspace/openapi/iform/signature/submit?access_token=访问令牌
Body: {
	"iformUserId": "d2769a9a-e1e5-4775-b1da-907e666b46b3",
	"pkBo": "f2e284951b274213b8e7269163b48b76",
	"pkBoins": "e89d349b8c6b4b39873b879162724bba",
	"addData2ES": true,
	"startProcess": true,
	"checkData": false,
	"supplyCallback": true,
	"singatureInfo": {
		"signerUsers": [
			{
				"userId": "d2769a9a-e1e5-4775-b1da-907e666b46b3",
				"userName": "李雄丰",
				"type": 0,
				"companyId": "",
				"sourceId": "",
				"sourceType": "",
				"companyName": "",
				"mainstayType": ""
			}
		],
		"fileDataDtos": [
			{
				"author": "李雄丰",
				"authorDept": "",
				"authorDeptId": "2026315703718144",
				"fid": "",
				"fileKey": "1ceb1449664e47b78416138d5df0d851",
				"filename": "交易控股友报账.pdf",
				"filesize": 231076,
				"name": "交易控股友报账.pdf",
				"signType": "0",
				"size": 231076,
				"src": "",
				"type": "application/pdf",
				"url": "https://bip-daily.yonyoucloud.com/yonbip-ec-iform/filesystem/file/proxy/503e148d98034a9fa2175d9b597b2d34/6638781609caac53900b4c9e.pdf",
				"userId": "d2769a9a-e1e5-4775-b1da-907e666b46b3"
			}
		]
	},
	"formData": [
		{
			"pkAttribute": "273266b051b64c4fb39bf5351a409129",
			"code": "20211227140013rDDLJB6eS8",
			"columnCode": "csms_1640584904418931",
			"type": "Text",
			"sqlType": "VARCHAR",
			"value": "API接口提交描述",
			"showValue": "API接口提交描述"
		}
	],
	"subFormMap": {
		"1d44c2d6421447f994af66c7cbe73078": [
			{
				"pkBoins": "22657a102cca458eb1e46881b350035f",
				"formData": [
					{
						"columnCode": "zbwb_1714978163266447",
						"type": "Text",
						"value": "我是子表的文本字段内容12",
						"showValue": "我是子表的文本字段内容12"
					}
				]
			}
		]
	},
	"appSource": "",
	"startProcesskey": "tempSave"
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
code	long	否	返回状态码（200成功，其它异常） 示例：200
message	string	否	返回信息描述
data	object	否	返回数据对象信息
pkBoins	string	否	表单实例id 示例：36c59b39688d11eca4c95275e8749160

## 5. 正确返回示例

{
	"code": 200,
	"message": "",
	"data": {
		"pkBoins": "36c59b39688d11eca4c95275e8749160"
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
310036	非法token(请求token无效)	重新获取正确token

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

