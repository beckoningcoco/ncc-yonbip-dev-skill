---
title: "库详情查询"
apiId: "2377784604872933376"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "PLM Modeling Service"
domain: "PLMMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, PLM Modeling Service]
platform_version: "BIP"
source_type: community-api-docs
---

# 库详情查询

>  请求方式	POST | PLM Modeling Service (PLMMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/baseOpenApi/depot/v1/detail
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
id	string	否	是	ID 示例：2367137501356752906

## 3. 请求示例

Url: /yonbip/RDC/baseOpenApi/depot/v1/detail?access_token=访问令牌
Body: {
	"id": "2367137501356752906"
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
code	number
小数位数:0,最大长度:10	否	接口返回状态 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回数据
id	string	否	ID 示例：2367137501356752906
name	string	否	名称 示例：00000020[ly0925]
code	string	否	编码 示例：depot-000317
depotTypeId	string	否	库类型ID 示例：1980667032588779616
depotTypeName	string	否	库类型名称 示例：项目库
depotAdminId	string	否	库管理员ID 示例：1981140234900340744
depotAdminName	string	否	库管理员名称 示例：黎一
ownedProjectId	string	否	所属项目ID 示例：2367137441215676423
ownedProjectName	string	否	所属项目名称 示例：ly0925
depotAuthOrgList	object	是	组织权限列表
depotAuthUserList	object	是	用户权限列表
depotAuthRoleList	object	是	角色权限列表
depotAuthPrjRoleList	object	是	项目角色权限列表
depotAuthPrjMemberList	object	是	项目成员权限列表
catalogueAdminList	object	是	库目录管理员列表

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2367137501356752906",
		"name": "00000020[ly0925]",
		"code": "depot-000317",
		"depotTypeId": "1980667032588779616",
		"depotTypeName": "项目库",
		"depotAdminId": "1981140234900340744",
		"depotAdminName": "黎一",
		"ownedProjectId": "2367137441215676423",
		"ownedProjectName": "ly0925",
		"depotAuthOrgList": [
			{
				"id": "2369455100066791432",
				"depotId": "2367137501356752906",
				"orgId": "1980670605981122561",
				"orgName": "测试部门"
			}
		],
		"depotAuthUserList": [
			{
				"id": "2367137501356752910",
				"depotId": "2367137501356752906",
				"userId": "1993141309828235265",
				"userName": "黎三"
			}
		],
		"depotAuthRoleList": [
			{
				"id": "2369455100066791434",
				"depotId": "2367137501356752906",
				"roleId": "6e3f0dff-4bda-4b91-bb77-561a7cc77d31",
				"roleName": "PLM_007"
			}
		],
		"depotAuthPrjRoleList": [
			{
				"id": "2369455100066791433",
				"depotId": "2367137501356752906",
				"prjRoleId": "2367974934068592643",
				"prjRoleName": "ly组织的角色"
			}
		],
		"depotAuthPrjMemberList": [
			{
				"id": "2367137501356752909",
				"depotId": "2367137501356752906",
				"prjMemberId": "2367137441215676426",
				"prjMemberName": "txh"
			}
		],
		"catalogueAdminList": [
			{
				"id": "2369455100066791435",
				"depotId": "2367137501356752906",
				"catalogueId": "2367137535716491276",
				"catalogueIdPath": "2367137535716491276|",
				"userId": "1980670880874233864",
				"userName": "ycc"
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-28	
更新
返回参数 (6)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

