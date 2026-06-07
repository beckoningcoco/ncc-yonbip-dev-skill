---
title: "合并报表-报表数据中心查询某个应用模型的某个表单的固定维和参数维"
apiId: "1892966918468403203"
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

# 合并报表-报表数据中心查询某个应用模型的某个表单的固定维和参数维

>  请求方式	POST | Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/tbb/form/querysheetaction
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
pk_obj	string	否	是	表单主键 示例：1670460700349169678
pk_cube	string	否	是	应用模型主键 示例：1670412072729444389
flag	string	否	是	是否返回表单信息，默认传BBSJZX，非BBSJZX的话会返回表单预览信息 示例：BBSJZX 默认值：BBSJZX
sysParamJson	object	否	是	sysParamJson
appcode	string	否	是	调用接口节点编码，默认* 示例：* 默认值：*

## 3. 请求示例

Url: /yonbip/qyjx/tbb/form/querysheetaction?access_token=访问令牌
Body: {
	"pk_obj": "1670460700349169678",
	"pk_cube": "1670412072729444389",
	"flag": "BBSJZX",
	"sysParamJson": {
		"appcode": "*"
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
data	object	否	返回数据
fullPath	string	否	当前查询表单全路径 示例：表单目录>01个别报表
dim	object	是	参数维信息
refactorVersion	string	否	表单版本接口 示例：2
fixdim	object	是	固定维信息
info	object	否	当前表单相关信息

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"fullPath": "表单目录>01个别报表",
		"dim": [
			{
				"pk_obj": "TB_DIMLEV_BP_YEAR_00",
				"objname": "年（期间）",
				"objcode": "YEARS",
				"shortcode": "",
				"pk_dimHier": "1670412072729444388",
				"initialvalue": {
					"value": "2023",
					"selshowcode": "2023",
					"display": "2023年"
				},
				"paramSetup": "0"
			}
		],
		"refactorVersion": "2",
		"fixdim": [
			{
				"pk_obj": "TBPTZ41000000000DWS6",
				"objname": "版本",
				"objcode": "VERSION",
				"shortcode": "Ver",
				"pk_dimHier": "TBPTZ41000000000DWS5",
				"initialvalue": {
					"value": "v0",
					"selshowcode": "v0",
					"display": "默认版本"
				}
			}
		],
		"info": {
			"pk_cube": "1670412072729444389",
			"pk_workbook": {
				"refname": "01个别报表",
				"refpk": "1670414709839364100"
			},
			"enablestate": true,
			"creator": "",
			"modifier": "",
			"isSheetWithRuleFetch": false,
			"hiderFixDim": false,
			"modifiedtime": "2023-11-28 10:45:29",
			"isSheetWithRule": true,
			"objname": "资产负债表",
			"creationtime": "2023-03-01 18:40:19",
			"pk_obj": "1670460700349169678",
			"ts": "2023-06-25 14:05:56"
		}
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
返回参数 refactorVersion
更新
返回参数 (11)
删除
返回参数 success

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

