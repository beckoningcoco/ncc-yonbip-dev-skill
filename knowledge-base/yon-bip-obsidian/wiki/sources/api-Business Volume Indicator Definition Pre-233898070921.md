---
title: "业务量指标定义保存"
apiId: "2338980709215502340"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Volume Indicator Definition"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Volume Indicator Definition]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务量指标定义保存

>  请求方式	POST | Business Volume Indicator Definition (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/FCC/yonbip-fi-epub/businessvolumeindex/bill/save
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
billnum	string	否	否	单据编码 示例：fiepub_businessvolumeindexcard 默认值：fiepub_businessvolumeindexcard
data	object	否	否	请求数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	否	编码 示例：ctest
name	object	否	否	名称
indicatorType	string	否	否	指标类别 示例：fixed
sumPeriod	string	否	否	汇总周期
indexCategory	string	否	否	指标类型
indicatorStatus	string	否	否	指标状态 示例：2
indicatorUnit	string	否	否	指标单位id 示例：1525645209096421378
businessVolumeDimension	object	是	否	指标维度集合
_status	string	否	否	操作状态,Insert:新增，Update:更新 示例：Insert

## 3. 请求示例

Url: /yonbip/FCC/yonbip-fi-epub/businessvolumeindex/bill/save?access_token=访问令牌
Body: {
	"billnum": "fiepub_businessvolumeindexcard",
	"data": {
		"resubmitCheckKey": "",
		"code": "ctest",
		"name": {
			"zh_CN": "测试指标定义",
			"en_US": "",
			"zh_TW": ""
		},
		"indicatorType": "fixed",
		"sumPeriod": "",
		"indexCategory": "",
		"indicatorStatus": "2",
		"indicatorUnit": "1525645209096421378",
		"businessVolumeDimension": [
			{
				"volumeDimension": "UID:P_FIEPUB-BE_180673D405480219",
				"sortNumber": 1,
				"refCode": "bd_allaccbodyref",
				"uri": "accBody",
				"required": "true",
				"id": "1820152213",
				"_status": "Insert"
			}
		],
		"_status": "Insert"
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
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	响应数据
code	string	否	编码 示例：ctest
name	object	否	名称
indicatorType	string	否	指标类别 示例：fixed
indicatorStatus	string	否	指标状态，0：启用，1：停用，2：未启用 示例：2
indicatorUnit	string	否	指标单位ID 示例：1525645209096421378
indicatorUnit_name	string	否	指标单位名称 示例：小时
createTime	string	否	创建时间 示例：2025-08-18 12:32:27
bsystem	boolean	否	是否系统预置 示例：false
businessVolumeDimension	object	是	指标维度集合
id	string	否	指标定义ID 示例：2338966570185785350
dimensionStatus	boolean	否	指标状态 示例：false
creatorId	string	否	创建人ID 示例：1525641755939569667
creator	string	否	创建人名称 示例：u8c_vip管理员
createDate	string	否	创建日期 示例：2025-08-18 12:32:27
ytenant	string	否	租户ID 示例：0000L6YQ8AVLFUZPXD0000
creatorId_name	string	否	创建人名称 示例：u8c_vip管理员

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "ctest",
		"name": {
			"zh_CN": "测试指标定义"
		},
		"indicatorType": "fixed",
		"indicatorStatus": "2",
		"indicatorUnit": "1525645209096421378",
		"indicatorUnit_name": "小时",
		"createTime": "2025-08-18 12:32:27",
		"bsystem": false,
		"businessVolumeDimension": [
			{
				"volumeDimension": "UID:P_FIEPUB-BE_180673D405480219",
				"sortNumber": 1,
				"volumeDimension_name": "会计主体",
				"refCode": "bd_allaccbodyref",
				"uri": "accBody",
				"required": true,
				"id": "2338966570185785351",
				"businessVolumeIndex": "2338966570185785350",
				"uniqueFlag": "accBody",
				"pubts": "2025-08-18 12:32:28",
				"ytenant": "0000L6YQ8AVLFUZPXD0000"
			}
		],
		"id": "2338966570185785350",
		"dimensionStatus": false,
		"creatorId": "1525641755939569667",
		"creator": "u8c_vip管理员",
		"createDate": "2025-08-18 12:32:27",
		"ytenant": "0000L6YQ8AVLFUZPXD0000",
		"creatorId_name": "u8c_vip管理员"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
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

