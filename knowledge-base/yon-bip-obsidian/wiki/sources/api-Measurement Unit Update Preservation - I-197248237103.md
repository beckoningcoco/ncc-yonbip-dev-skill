---
title: "计量单位更新保存-幂等"
apiId: "1972482371037429762"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "UoM"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, UoM]
platform_version: "BIP"
source_type: community-api-docs
---

# 计量单位更新保存-幂等

>  请求方式	POST | UoM (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/unit/idempotent/update
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	number
小数位数:0,最大长度:22	否	否	id 示例：123456
code	string	否	否	编码 示例：code
name	object	否	否	名称
unitGroupCode	string	否	否	计量单位分组编码 示例：code01
precision	number
小数位数:0,最大长度:1	否	否	精度 示例：2
truncationType	number
小数位数:0,最大长度:1	否	否	舍位方式：0：入位；1：舍位；4：四舍五入 示例：0
baseUnit	boolean	否	否	是否基本单位 true：是；false：否 示例：false
convertCoefficient	number
小数位数:6,最大长度:14	否	否	换算系数 示例：1
stopStatus	boolean	否	否	启用状态 true：停用 false：启用 默认：false 示例：true

## 3. 请求示例

Url: /yonbip/digitalModel/unit/idempotent/update?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 123456,
		"code": "code",
		"name": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"unitGroupCode": "code01",
		"precision": 2,
		"truncationType": 0,
		"baseUnit": false,
		"convertCoefficient": 1,
		"stopStatus": true
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
code	string	否	错误码，成功时为200 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	返回信息
id	number
小数位数:0,最大长度:36	否	id 示例：123456

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 123456
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。

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

