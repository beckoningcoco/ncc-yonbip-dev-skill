---
title: "自定义项设置详情查询"
apiId: "1ccbc71dcaac4d20bf7abba958d82c72"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Characteristic"
domain: "BMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Characteristic]
platform_version: "BIP"
source_type: community-api-docs
---

# 自定义项设置详情查询

>  请求方式	GET | Characteristic (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/attrext/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	业务数据ID

## 3. 请求示例

Url: /yonbip/digitalModel/attrext/detail?access_token=访问令牌&id=

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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
creator_userName	string	否	创建人用户名
creationtime	string	否	创建时间
modifiedtime	string	否	修改时间
appranges	object	是	应用范围
showitem	muti_lang	否	名称
docname	string	否	参照档案名称
type	string	否	类型, String:文本、Double:数值、Integer:整型、Date:日期、Time:时间、DateTime:日期时间、Archive:自定义枚举、BaseArchive:基本档案、CustArchive:自定义档案、
id	int	否	ID
isEnabled	boolean	否	是否启用, true:是、false:否、
isInput	boolean	否	是否必输, true:是、false:否、
maxinputlen	int	否	长度
refDocId	string	否	引用档案
ref_name	string	否	引用档案
decimaldigits	int	否	精度
creator	string	否	创建人
createTime	string	否	创建时间
checkPro	string	否	是否关联
modifier	string	否	修改人
pubts	string	否	时间戳,格式为:yyyy-MM-dd HH:mm:ss
modifyTime	string	否	修改时间
attrextSub	object	是	自定义项子表[pc.userdefnew.AttrExtdefine]
attrextShow	object	是	自定义项预览[pc.userdefnew.AppRange]

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"creator_userName": "",
		"creationtime": "",
		"modifiedtime": "",
		"appranges": [
			{}
		],
		"showitem": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"docname": "",
		"type": "",
		"id": 0,
		"isEnabled": true,
		"isInput": true,
		"maxinputlen": 0,
		"refDocId": "",
		"ref_name": "",
		"decimaldigits": 0,
		"creator": "",
		"createTime": "",
		"checkPro": "",
		"modifier": "",
		"pubts": "",
		"modifyTime": "",
		"attrextSub": [
			{
				"id": "",
				"defineId": "",
				"userdefid": "",
				"code": "",
				"name": "",
				"pubts": ""
			}
		],
		"attrextShow": [
			{
				"id": "",
				"attrextid": "",
				"billid": "",
				"entityuri": "",
				"systemCode": ""
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

