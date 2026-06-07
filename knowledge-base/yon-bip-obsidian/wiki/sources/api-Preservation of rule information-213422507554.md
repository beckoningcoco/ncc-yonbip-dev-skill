---
title: "保存规则信息"
apiId: "2134225075547144200"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "HR Business Rule"
domain: "HRCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, HR Business Rule]
platform_version: "BIP"
source_type: community-api-docs
---

# 保存规则信息

>  请求方式	POST | HR Business Rule (HRCS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/bizrule/openApi/bizruleSave
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	规则列表
code	string	否	否	编码 示例：code1245
modifier	string	否	否	modifier 示例：99ea7655-00a2-4bda-b23c-19ade37ea574
oid	string	否	否	组id 示例：1893862195712753666
dr	number
小数位数:0,最大长度:10	否	否	dr 示例：0
modifyTime	string	否	否	modifyTime 示例：2024-11-13 20:48:27
enable	string	否	否	是否启用 示例：1
ruleType	string	否	否	规则类型 示例：1
isNewest	number
小数位数:0,最大长度:10	否	否	是否最新 示例：1
startTime	string	否	否	开始时间 示例：2023-12-31 00:00:00
id	string	否	否	id 示例：1893862195712753666
pubts	string	否	否	pubts 示例：2024-11-14 15:38:24
tenant	string	否	否	租户id 示例：0000L6YQ8AVLFUZPXD0000
creator	string	否	否	creator 示例：99ea7655-00a2-4bda-b23c-19ade37ea574
enablets	string	否	否	enablets 示例：2024-11-13 20:49:15
visibleLayerId	string	否	否	分层id 示例：1580534255485190147
ytenant	string	否	否	租户id 示例：0000L6YQ8AVLFUZPXD0000
categoryCode	string	否	否	分类编码 示例：TEST_CASE_ONE
createTime	string	否	否	createTime 示例：2023-12-27 18:56:17
visibleLayer	string	否	否	visibleLayer 示例：5
isEdit	number
小数位数:0,最大长度:10	否	否	是否编辑 示例：1
distributionSite	string	否	否	站点id 示例：123
name	object	否	否	名称
endTime	string	否	否	结束时间 示例：9999-12-31 00:00:00
categoryId	string	否	否	分类id 示例：1806007823729950729
isSys	number
小数位数:0,最大长度:10	否	否	是否系统预制 示例：0
desc	object	否	否	描述
content	object	否	否	规则内容
_convert_content	string	否	否	_convert_content 示例：ok

## 3. 请求示例

Url: /yonbip/hrcloud/bizrule/openApi/bizruleSave?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "code1245",
			"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"oid": "1893862195712753666",
			"dr": 0,
			"modifyTime": "2024-11-13 20:48:27",
			"enable": "1",
			"ruleType": "1",
			"isNewest": 1,
			"startTime": "2023-12-31 00:00:00",
			"id": "1893862195712753666",
			"pubts": "2024-11-14 15:38:24",
			"tenant": "0000L6YQ8AVLFUZPXD0000",
			"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"enablets": "2024-11-13 20:49:15",
			"visibleLayerId": "1580534255485190147",
			"ytenant": "0000L6YQ8AVLFUZPXD0000",
			"categoryCode": "TEST_CASE_ONE",
			"createTime": "2023-12-27 18:56:17",
			"visibleLayer": "5",
			"isEdit": 1,
			"distributionSite": "123",
			"name": {
				"zh_CN": "刘少9002"
			},
			"endTime": "9999-12-31 00:00:00",
			"categoryId": "1806007823729950729",
			"isSys": 0,
			"desc": {},
			"content": {
				"ytenant": "0000L6YQ8AVLFUZPXD0000",
				"enable": "0",
				"id": "1893862195712753666",
				"pubts": "2024-11-14 15:32:12",
				"content": "{\"version\":\"1.0\",\"lang\":\"ZH-CN\",\"type\":\"RULE\",\"meta\":{\"readInputParams\":[],\"readLocalVars\":[]},\"returnDataType\":{\"dataType\":null,\"dataTypeDetail\":null},\"inputs\":[],\"localVars\":[],\"condition\":{\"alwaysTrue\":false,\"ifBlock\":{\"then\":[{\"actionType\":\"ReturnValue\",\"dataType\":{\"primitive\":true,\"name\":\"String\"},\"value\":{\"tokenType\":\"Constant\",\"value\":\"6\",\"dataType\":{\"primitive\":true,\"name\":\"String\"}}}],\"when\":{\"op\":\"logic\",\"code\":\"and\",\"children\":[{\"op\":\"relation\",\"code\":\"eq\",\"leafHeight\":{\"left\":203,\"right\":47},\"left\":{\"tokenType\":\"ValueFunctionInvoke\",\"value\":{\"functionName\":\"dateDiff\",\"paramValues\":[{\"tokenType\":\"Constant\",\"value\":\"2024-11-07\",\"dataType\":{\"primitive\":true,\"name\":\"Date\"}},{\"tokenType\":\"Constant\",\"value\":\"2024-11-07\",\"dataType\":{\"primitive\":true,\"name\":\"Date\"}},{\"tokenType\":\"Constant\",\"value\":\"1\",\"dataType\":{\"primitive\":true,\"name\":\"String\"},\"dataTypeDetail\":{\"id\":null,\"enumInfo\":{\"options\":[{\"label\":\"年\",\"value\":\"1\"},{\"label\":\"月\",\"value\":\"2\"},{\"label\":\"周\",\"value\":\"3\"},{\"label\":\"日\",\"value\":\"4\"}]}},\"refcode\":\"Enum@Function@System@DatetimeUnit\"},{\"tokenType\":\"Constant\",\"value\":\"1\",\"dataType\":{\"primitive\":true,\"name\":\"String\"},\"dataTypeDetail\":{\"id\":null,\"enumInfo\":{\"options\":[{\"label\":\"向上取整\",\"value\":\"1\"},{\"label\":\"向下取整\",\"value\":\"2\"}]}},\"refcode\":\"Enum@Function@System@RoundMode\"}]},\"dataType\":{\"primitive\":true,\"name\":\"Integer\"}},\"right\":{\"tokenType\":\"Constant\",\"value\":\"3\",\"dataType\":{\"primitive\":true,\"name\":\"Integer\"}}}]}},\"elifBlocks\":[],\"elseBlock\":{\"then\":[{\"actionType\":\"ReturnValue\",\"dataType\":{\"primitive\":true,\"name\":\"String\"},\"value\":{\"tokenType\":\"Constant\",\"value\":\"1214\",\"dataType\":{\"primitive\":true,\"name\":\"String\"}}}]}}}",
				"dr": 0,
				"tenant": "0000L6YQ8AVLFUZPXD0000"
			},
			"_convert_content": "ok"
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
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	number
小数位数:0,最大长度:10	否	编码 示例：200
message	string	否	提示信息 示例：操作成功
traceId	string	否	traceId 示例：968dc34e3ac32db1
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"traceId": "968dc34e3ac32db1",
	"uploadable": "0"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
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

