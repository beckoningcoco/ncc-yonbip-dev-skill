---
title: "项目类型详情查询"
apiId: "2461386074548600839"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "PLM Project Management"
domain: "PLMPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, PLM Project Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目类型详情查询

>  请求方式	POST | PLM Project Management (PLMPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/rdpmOpenapi/projectCgr/v1/detail
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
id	string	否	是	ID 示例：2226817689824264194

## 3. 请求示例

Url: /yonbip/RDC/rdpmOpenapi/projectCgr/v1/detail?access_token=访问令牌
Body: {
	"id": "2226817689824264194"
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
		否	
		否	
id	string	否	ID 示例：2226817689824264194
name	string	否	名称 示例：项目类型1111
code	string	否	编码 示例：PROCGR-00000001
level	string	否	层级 示例：1
sort	string	否	排序号 示例：1
path	string	否	路径 示例：2226817689824264194|
state	string	否	状态 示例：1
parentId	string	否	上级ID 示例：2367137441215676423
parentName	string	否	上级名称 示例：root
ownedorgId	string	否	所属组织ID 示例：2220177129213001738
ownedorgName	string	否	所属组织名称 示例：智石开
prjLibTplId	string	否	项目库模板ID 示例：2226815971828957190
prjLibTplName	string	否	项目库模板名称 示例：一般项目库
proLifecycleAttrId	string	否	生命周期状态ID 示例：2220176141365280853
proLifecycleAttrIdName	string	否	生命周期状态名称 示例：编制中
proLifecycleAttrpoolId	string	否	生命周期状态池ID 示例：2220175591609466885
proLifecycleAttrpoolIdName	string	否	生命周期状态吃名称 示例：编制中
proLifecycleId	string	否	生命周期模板ID 示例：2220176141365280852
proLifecycleIdName	string	否	生命周期模板名称 示例：项目-默认模板
proLifecycleUseId	string	否	生命周期模板使用ID 示例：2329463431064715272
proLifecycleUseIdName	string	否	生命周期模板使用名称 示例：333
prjCategoryDefineLinkList	object	是	自定义项
prjCgrAuthList	object	是	新增授权
prjCgrAuthDetailList	object	是	列表可见性授权
prjCgrWaringList	object	是	预警配置
shareOrgList	object	是	共享组织

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2226817689824264194",
		"name": "项目类型1111",
		"code": "PROCGR-00000001",
		"level": "1",
		"sort": "1",
		"path": "2226817689824264194|",
		"state": "1",
		"parentId": "2367137441215676423",
		"parentName": "root",
		"ownedorgId": "2220177129213001738",
		"ownedorgName": "智石开",
		"prjLibTplId": "2226815971828957190",
		"prjLibTplName": "一般项目库",
		"proLifecycleAttrId": "2220176141365280853",
		"proLifecycleAttrIdName": "编制中",
		"proLifecycleAttrpoolId": "2220175591609466885",
		"proLifecycleAttrpoolIdName": "编制中",
		"proLifecycleId": "2220176141365280852",
		"proLifecycleIdName": "项目-默认模板",
		"proLifecycleUseId": "2329463431064715272",
		"proLifecycleUseIdName": "333",
		"prjCategoryDefineLinkList": [
			{
				"id": "1111",
				"name": "自定义特征001",
				"code": "cutom001",
				"definecode": "cutom001"
			}
		],
		"prjCgrAuthList": [
			{
				"id": "",
				"empId": "",
				"empIdName": "",
				"userId": "",
				"roleId": "",
				"roleIdName": ""
			}
		],
		"prjCgrAuthDetailList": [
			{
				"id": "",
				"name": "",
				"prjCgrAuthDetailDeptList": [
					{
						"id": "",
						"deptId": "",
						"deptCode": "",
						"deptName": ""
					}
				],
				"prjCgrAuthDetailOrgList": [
					{
						"id": "",
						"orgId": "",
						"orgName": ""
					}
				],
				"prjCgrAuthDetailSetList": [
					{
						"id": "",
						"name": "",
						"code": "",
						"type": "1:员工;2:部门;3:角色;4:项目角色",
						"authId": ""
					}
				]
			}
		],
		"prjCgrWaringList": [
			{
				"id": "",
				"waringType": "",
				"warningRole": "",
				"warningStrategy": "",
				"waringStandard": "",
				"warningValue": "",
				"warningValueBig": "",
				"userRefList": [
					{
						"id": "",
						"userRefName": "",
						"userRefEmpId": "",
						"userRefEmpIdUserId": ""
					}
				],
				"roleRefList": [
					{
						"id": "",
						"roleRefRoleId": "",
						"roleRefName": ""
					}
				]
			}
		],
		"shareOrgList": [
			{
				"id": "",
				"containChildren": "",
				"shareOrgId": "",
				"shareOrgName": "",
				"shareOrgCode": ""
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

