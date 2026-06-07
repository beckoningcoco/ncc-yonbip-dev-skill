---
title: "预算系统注册的模型保存"
apiId: "52c9bd894e124cfe8e846c2db431fbeb"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Budget Execution Control"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Budget Execution Control]
platform_version: "BIP"
source_type: community-api-docs
---

# 预算系统注册的模型保存

>  请求方式	POST | Budget Execution Control (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/yonbip-fi-sepmbcdc/open/openSave
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	数据仓库
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
sysCode	string	否	是	系统编码 示例：EBDG
sysName	string	否	是	系统名称（简体中文） 示例：费用预算
sysName2	string	否	否	系统名称 （英文） 示例：openSys
sysName3	string	否	否	系统名称（繁体中文） 示例：openSys
sysType	string	否	否	系统标识用来区分计划预算：0，费用预算（bip领域预算系统）：1，其他三方预算系统：2； 若为空则默认为1； （特殊处理-如果系统编码为BP则默认为计划预算。） 示例：1
cubeCode	string	否	是	模型编码 示例：wxy0802
cubeName	string	否	是	模型名称（简体中文） 示例：wxy0802
cubeName2	string	否	否	模型名称（英文） 示例：wxy0802
cubeName3	string	否	否	模型名称（繁体中文） 示例：wxy0802
fields	object	是	否	字段信息（如填写字段信息，则需要填写模型编码和名称）

## 3. 请求示例

Url: /yonbip/qyjx/yonbip-fi-sepmbcdc/open/openSave?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"sysCode": "EBDG",
			"sysName": "费用预算",
			"sysName2": "openSys",
			"sysName3": "openSys",
			"sysType": "1",
			"cubeCode": "wxy0802",
			"cubeName": "wxy0802",
			"cubeName2": "wxy0802",
			"cubeName3": "wxy0802",
			"fields": [
				{
					"fieldCode": "cfinaceorg",
					"fieldName": "费用承担组织",
					"fieldName2": "Cost bearing organization",
					"fieldName3": "費用承擔組織",
					"isActiveDim": "0",
					"mappingFixedValue": "",
					"isQueryCondition": 0,
					"metadata": "ucf-org-center&bd.adminOrg.AdminOrgVO",
					"fixedUrl": "BUDGET",
					"refUrl": {
						"url": "tbb/dimMember/refQuery",
						"type": "budget",
						"refType": "grid",
						"isTreeLazyLoad": false,
						"param": {
							"refCode": "ucf-org-center.bd_admindepttreeviewref",
							"domainKey": "ucf-org-center"
						}
					}
				}
			]
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
message	string	否	接口信息（成功 : 无 失败 : 提示信息）
code	int	否	响应码
data	string	否	返回数据

## 5. 正确返回示例

{
	"message": "",
	"code": 0,
	"data": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
500	所有系统编码都不能为空	所有系统编码都不能为空

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-04-27	
更新
请求参数 (7)
接口描述及功能说明细化

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

