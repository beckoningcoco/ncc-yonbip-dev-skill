---
title: "会计要素表批量保存"
apiId: "2318850412237029379"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounting Element Table"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounting Element Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 会计要素表批量保存

>  请求方式	POST | Accounting Element Table (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/FCC/accelementlist/bill/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
billnum	string	否	是	单据编码 示例：fiepub_accelementlist 默认值：fiepub_accelementlist
data	object	否	是	会计要素表主实体
id	string	否	否	id 示例：2236521910638739457
code	string	否	是	编码 示例：777779
name	object	否	是	名称
accstandardname	object	否	是	对应的会计准则名称
accProperty	object	是	否	会计要素列表
_status	string	否	否	会计要素表操作状态，Insert:新增,Update:更新 示例：Update
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
key	string	否	否	来源系统的唯一主键字段名称 示例：objid 默认值：objid

## 3. 请求示例

Url: /yonbip/FCC/accelementlist/bill/save?access_token=访问令牌
Body: {
	"billnum": "fiepub_accelementlist",
	"data": {
		"id": "2236521910638739457",
		"code": "777779",
		"name": {
			"zh_CN": "zj"
		},
		"accstandardname": {
			"zh_CN": "zjj",
			"en_US": "",
			"zh_TW": ""
		},
		"accProperty": [
			{
				"code": "2222",
				"accpropertyattribute": "0",
				"name": {
					"zh_CN": "2222",
					"en_US": "",
					"zh_TW": ""
				},
				"id": "2236521910638739458",
				"balanceformulaposition": "0",
				"direction": "Debit",
				"_status": "Update"
			}
		],
		"_status": "Update",
		"resubmitCheckKey": "fiepub_accelementlist_edit_9bff279c-e14c-46d5-bbcc-3af2527e11bb"
	},
	"key": "objid"
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
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	响应实体
id	string	否	会计要素表Id 示例：2236521910638739457
code	string	否	会计要素表编码 示例：777779
name	object	否	会计要素表名称
accstandardname	object	否	对应的会计准则名称
accProperty	object	是	会计要素集合
_status	string	否	会计要素表操作状态 示例：Update
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
objid	string	否	来源系统的唯一主键值

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2236521910638739457",
		"code": "777779",
		"name": {
			"zh_CN": "zj"
		},
		"accstandardname": {
			"zh_CN": "zjj"
		},
		"accProperty": [
			{
				"code": "2222",
				"accpropertyattribute": "0",
				"name": {
					"zh_CN": "2222"
				},
				"id": "2236521910638739458",
				"balanceformulaposition": "0",
				"direction": "Debit",
				"_status": "Update",
				"accelement": "2236521910638739457"
			}
		],
		"_status": "Update",
		"resubmitCheckKey": "fiepub_accelementlist_edit_9bff279c-e14c-46d5-bbcc-3af2527e11bb"
	},
	"objid": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	会计要素表已经被引用，[001]不可以修改。	被引用后不允许修改

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

