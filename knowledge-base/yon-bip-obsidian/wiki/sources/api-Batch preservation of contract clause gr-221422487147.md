---
title: "合同条款分组批量保存"
apiId: "2214224871478525954"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同条款分组批量保存

>  请求方式	POST | E-signature Configuration (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/rest/category/integration/batchSave
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	分组ID 示例：2172830121212129827
outerSysId	string	否	否	外部系统来源ID 示例：2172831111334554129827
parentId	string	否	否	父级ID，即上级条款分组的主键或者外部系统来源主键 示例：217283014523423429827
categoryName	string	否	是	分组名称，长度限制30 示例：名称1
orgId	string	否	否	组织ID 示例：2172830147643545429827
orgCode	string	否	否	组织编码，与组织ID必传一个 示例：orgCode1
dr	string	否	否	删除标记（1 已删除 0 未删除） 示例：0 默认值：0
categoryName2	string	否	否	分组名称2 示例：名称2
categoryName3	string	否	否	分组名称3 示例：名称3
categoryName4	string	否	否	分组名称4 示例：名称4
categoryName5	string	否	否	分组名称5 示例：名称5
categoryName6	string	否	否	分组名称6 示例：名称6

## 3. 请求示例

Url: /yonbip/digitalModel/rest/category/integration/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "2172830121212129827",
			"outerSysId": "2172831111334554129827",
			"parentId": "217283014523423429827",
			"categoryName": "名称1",
			"orgId": "2172830147643545429827",
			"orgCode": "orgCode1",
			"dr": "0",
			"categoryName2": "名称2",
			"categoryName3": "名称3",
			"categoryName4": "名称4",
			"categoryName5": "名称5",
			"categoryName6": "名称6"
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
code	string	否	接口状态 示例：200
message	string	否	接口信息 示例：操作成功
data	object	否	接口数据
count	number
小数位数:0,最大长度:10	否	请求中数据量 示例：10
successCount	number
小数位数:0,最大长度:10	否	成功数量 示例：9
failCount	number
小数位数:0,最大长度:10	否	失败数量 示例：1
infos	object	是	成功数据
messages	object	是	错误信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 10,
		"successCount": 9,
		"failCount": 1,
		"infos": [
			{
				"id": "197542811111111119013",
				"parentId": "197542810000000009013",
				"outerSysId": "1975428123211239013",
				"categoryNum": "197542812111111239013",
				"categoryName": "名称1",
				"orgId": "197542815555555239013",
				"sourceUnique": "1975428123211239013",
				"orgCode": "orgCode1",
				"type": "2",
				"yTenantId": "qyxxxxxx",
				"targetUnique": "197542811111111119013",
				"ts": "2024-12-12 12:12:12",
				"dr": 0,
				"categoryName2": "名称2",
				"categoryName3": "名称3",
				"categoryName4": "名称4",
				"categoryName5": "名称5",
				"categoryName6": "名称6"
			}
		],
		"messages": [
			{
				"sourceUnique": "197542812321111111111",
				"message": "错误信息"
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
500	未知异常	未知异常，请联系管理员
10000	服务内部异常	服务内部错误，请联系管理员

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

