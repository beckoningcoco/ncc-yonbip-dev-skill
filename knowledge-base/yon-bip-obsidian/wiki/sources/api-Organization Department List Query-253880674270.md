---
title: "组织部门列表查询"
apiId: "2538806742703669251"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee Management - Self-Service"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Management - Self-Service]
platform_version: "BIP"
source_type: community-api-docs
---

# 组织部门列表查询

>  请求方式	POST | Employee Management - Self-Service (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/orgadmin/authorizedList
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
isOrgPermission	boolean	否	否	是否使用主组织权限。true：主组织权限+数据权限（默认）；false：数据权限 示例：true 默认值：true
code	string	否	否	按编码查询
name	string	否	否	按名称查询
principalId	string	否	否	按负责人id查询
principalName	string	否	否	按负责人名称查询
parentId	string	否	否	父级组织部门id，按父节点查询需要配合level使用（和childId只能二选一，同时传返回错误）
level	number
小数位数:0,最大长度:2	否	否	显示层级，默认1级，建议最多查3级，会严重影响性能
deptLevelId	string	否	否	按照部门级别查询
deptLevelName	string	否	否	按照部门级别名称查询

## 3. 请求示例

Url: /yonbip/HCC/orgadmin/authorizedList?access_token=访问令牌
Body: {
	"isOrgPermission": true,
	"code": "",
	"name": "",
	"principalId": "",
	"principalName": "",
	"parentId": "",
	"level": 0,
	"deptLevelId": "",
	"deptLevelName": ""
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
code	string	否	编码
message	string	否	说明 示例：操作成功
data	object	是	返回数据
id	string	否	组织部门id
code	string	否	组织部门编码
bizunit	string	否	组织部门类型 0：部门 1：组织 2：部门型组织
name	string	否	组织部门名称
shortName	string	否	组织部门简称
principalId	string	否	负责人ID
principalCode	string	否	负责人编码
principalName	string	否	负责人名称
hrbpId	string	否	HRBP ID
hrbpCode	string	否	HRBP编码
hrbpName	string	否	HRBP名称
branchleaderId	string	否	分管领导ID
branchleaderCode	string	否	分管领导编码
branchleaderName	string	否	分管领导名称
parentId	string	否	上级ID
parentCode	string	否	上级编码
parentName	string	否	上级名称
deptLevelId	string	否	部门级别ID
deptLevelCode	string	否	部门级别编码
deptLevelName	string	否	部门级别名称
deptRankId	string	否	部门层级ID
deptRankCode	string	否	部门层级编码
deptRankName	string	否	部门层级名称
depttypeId	string	否	部门性质ID
deptTypeCode	string	否	部门性质编码
deptTypeName	string	否	部门性质名称
managepositionId	string	否	负责岗ID
managepositionCode	string	否	负责岗编码
managepositionName	string	否	负责岗名称
deptLevel1	string	否	一级部门名称
deptLevel2	string	否	二级部门名称
deptLevel3	string	否	三级部门名称
deptLevel4	string	否	四级部门名称
deptLevel5	string	否	五级部门名称
deptLevel6	string	否	六级部门名称
deptLevel7	string	否	七级部门名称
deptLevel8	string	否	八级部门名称
child	object	是	下级部门列表

## 5. 正确返回示例

{
	"code": "",
	"message": "操作成功",
	"data": [
		{
			"id": "",
			"code": "",
			"bizunit": "",
			"name": "",
			"shortName": "",
			"principalId": "",
			"principalCode": "",
			"principalName": "",
			"hrbpId": "",
			"hrbpCode": "",
			"hrbpName": "",
			"branchleaderId": "",
			"branchleaderCode": "",
			"branchleaderName": "",
			"parentId": "",
			"parentCode": "",
			"parentName": "",
			"deptLevelId": "",
			"deptLevelCode": "",
			"deptLevelName": "",
			"deptRankId": "",
			"deptRankCode": "",
			"deptRankName": "",
			"depttypeId": "",
			"deptTypeCode": "",
			"deptTypeName": "",
			"managepositionId": "",
			"managepositionCode": "",
			"managepositionName": "",
			"deptLevel1": "",
			"deptLevel2": "",
			"deptLevel3": "",
			"deptLevel4": "",
			"deptLevel5": "",
			"deptLevel6": "",
			"deptLevel7": "",
			"deptLevel8": "",
			"child": [
				{}
			]
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	请联系开发人员	

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

