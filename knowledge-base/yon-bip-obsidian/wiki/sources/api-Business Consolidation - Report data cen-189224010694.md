---
title: "合并报表-报表数据中心左侧表单树查询，包含表单目录和表单信息"
apiId: "1892240106940006400"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Consolidation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 合并报表-报表数据中心左侧表单树查询，包含表单目录和表单信息

>  请求方式	POST | Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/tbb/form/querytabletree
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
enablestate	boolean	否	是	是否包含已停用 （true：显示，false：不显示） 示例：false 默认值：false
flag	string	否	是	显示样式，左侧树默认为3 示例：3 默认值：3
pk_cube	string	否	是	应用模型主键 示例：1670412072729444389
sysParamJson	object	否	是	sysParamJson
appcode	string	否	是	调用接口节点编码，默认BCS13002 示例：BCS13002 默认值：*

## 3. 请求示例

Url: /yonbip/qyjx/tbb/form/querytabletree?access_token=访问令牌
Body: {
	"enablestate": false,
	"flag": "3",
	"pk_cube": "1670412072729444389",
	"sysParamJson": {
		"appcode": "BCS13002"
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
code	string	否	响应码 示例：200
data	object	否	数据
rows	object	是	数据行

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"rows": [
			{
				"refpk": "root",
				"refcode": "root",
				"isleaf": false,
				"children": [
					{
						"enablestate": true,
						"children": [
							{
								"enablestate": true,
								"children": [
									""
								],
								"pid": "1670414709839364100",
								"refpk": "1800834097602887681",
								"refcode": "",
								"isleaf": false,
								"refname": "222",
								"iconBox": {
									"delIcon": false,
									"addIcon": false,
									"editIcon": false
								},
								"type": "类型"
							}
						],
						"pid": "root",
						"refpk": "2370080077948911619",
						"refcode": "33",
						"isleaf": false,
						"type": "workbook",
						"refname": "222",
						"bookType": "1",
						"iconBox": {
							"delIcon": false,
							"addIcon": false,
							"editIcon": false
						}
					}
				],
				"refname": "表单目录",
				"iconBox": {
					"delIcon": false,
					"addIcon": false,
					"editIcon": false
				}
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-20	
更新
请求说明
新增
返回参数 (16)
更新
返回参数 code

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

