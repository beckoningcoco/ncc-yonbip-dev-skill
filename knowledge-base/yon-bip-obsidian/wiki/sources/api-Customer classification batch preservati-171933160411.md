---
title: "客户分类批量保存-特征erpCode"
apiId: "1719331604113391621"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户分类批量保存-特征erpCode

>  请求方式	POST | Customer Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/custcategory/newbatchsave
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
erpCode	string	否	是	外部编码 示例：erp123
code	string	否	否	编码，新增时必填 示例：code123
name	object	否	否	名称
simplifiedName	string	否	否	简体，新增时必填 示例：简体
englishName	string	否	否	英文 示例：英文
traditionalName	string	否	否	繁体 示例：繁体
parentCode	string	否	否	上级分类编码 示例：pcode123
orgCode	string	否	否	管理组织编码，更新时不可修改，默认为global00 示例：org123
order	int	否	否	排序号 示例：1
isEnabled	boolean	否	否	启用状态 true：启用 false：停用 默认：true 示例：true
comment	object	否	否	备注
simplifiedName	string	否	否	简体 示例：简体
englishName	string	否	否	英文 示例：英文
traditionalName	string	否	否	繁体 示例：繁体

## 3. 请求示例

Url: /yonbip/digitalModel/custcategory/newbatchsave?access_token=访问令牌
Body: [{
	"erpCode": "erp123",
	"code": "code123",
	"name": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"parentCode": "pcode123",
	"orgCode": "org123",
	"order": 1,
	"isEnabled": true,
	"comment": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	}
}]

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
code	string	否	返回码，调用成功时返回200 示例："200"
message	string	否	提示信息 示例：处理成功
data	object	否	返回结果
count	int	否	总数 示例：2
successCount	int	否	成功数量 示例：1
failCount	int	否	失败数量 示例：1
successInfos	object	是	成功信息
failInfos	object	是	错误信息

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "处理成功",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"successInfos": [
			{
				"erpCode": "123",
				"message": "保存成功！"
			}
		],
		"failInfos": [
			{
				"erpCode": "456",
				"message": "名称必输！"
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
999	服务端逻辑异常	服务端逻辑异常

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

