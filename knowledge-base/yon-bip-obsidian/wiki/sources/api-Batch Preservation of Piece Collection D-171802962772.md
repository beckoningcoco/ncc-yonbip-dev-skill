---
title: "计件采集数据批量保存"
apiId: "1718029627728330758"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Piecework data collection"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Piecework data collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 计件采集数据批量保存

>  请求方式	POST | Piecework data collection (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/sfc/pieceworkcollect/batchsave
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
data	object	是	是	计件采集数据数组
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
orgId	string	否	否	组织ID。组织编码和组织ID不能同时为空。同时传值时以组织ID为准 示例：1545661354501734405
orgCode	string	否	否	组织编码。组织编码和组织ID不能同时为空。同时传值时以组织ID为准 示例：ZZY-01
deviceId	string	否	否	设备ID。设备编码和设备ID不能同时为空。同时传值时以设备ID为准 示例：1545661354501735540
deviceCode	string	否	否	设备编码。设备编码和设备ID不能同时为空。同时传值时以设备ID为准 示例：JGSB-01
attrCode	string	否	否	属性标识码 示例：001
attrName	string	否	否	属性名称 示例：计数器01
startTime	DateTime	否	是	采集开始时间。格式:YYYY-MM-DD HH:MI:SS 示例：2022-04-18 00:00:00
endTime	DateTime	否	是	采集结束时间。格式:YYYY-MM-DD HH:MI:SS 示例：2022-04-18 00:00:00
collectTime	DateTime	否	否	采集时间。格式:YYYY-MM-DD HH:MI:SS 示例：2022-04-18 00:00:00
unit	string	否	否	计量单位 示例：千克
collectQty	BigDecimal	否	是	采集数量 示例：50

## 3. 请求示例

Url: /yonbip/mfg/sfc/pieceworkcollect/batchsave?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"orgId": "1545661354501734405",
			"orgCode": "ZZY-01",
			"deviceId": "1545661354501735540",
			"deviceCode": "JGSB-01",
			"attrCode": "001",
			"attrName": "计数器01",
			"startTime": "2022-04-18 00:00:00",
			"endTime": "2022-04-18 00:00:00",
			"collectTime": "2022-04-18 00:00:00",
			"unit": "千克",
			"collectQty": 50
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
code	string	否	服务端状态码 示例：200
message	string	否	服务端信息 示例：操作成功
data	object	否	服务端处理结果数据
count	long	否	保存的数据条数 示例：1
sucessCount	long	否	保存成功的条数 示例：0
failCount	long	否	保存失败的条数 示例：1
messages	string	是	保存结果描述信息 示例：["工厂:1未找到","设备id:1未找到"]
infos	object	是	保存成功的数据
failInfos	object	是	失败信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 0,
		"failCount": 1,
		"messages": [
			"工厂:1未找到",
			"设备id:1未找到"
		],
		"infos": [
			{
				"id": 1738830489362890752,
				"orgId": "1551681292353929221",
				"orgName": "制造云工厂",
				"orgCode": "ZZY-01",
				"deviceId": "1551681292353929221",
				"deviceCode": "ZZY-01",
				"deviceName": "设备-A",
				"attrCode": "1",
				"attrName": "1",
				"startTime": "2023-05-02 16:15:59",
				"endTime": "2023-05-03 16:16:02",
				"collectTime": "2023-05-05 16:16:05",
				"unit": "个",
				"collectQty": 11,
				"sourceType": 0,
				"createType": 0,
				"creatorId": 1544937850083999750,
				"creator": "默认用户",
				"createTime": "2023-06-01 21:35:11",
				"createDate": "2023-06-01 21:35:11",
				"pubts": "2023-06-01 21:35:11",
				"ytenant": "0000L7ZVO03M1H3ONE0000"
			}
		],
		"failInfos": [
			{}
		]
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
0	未传入优惠券档案id	coupon_id值填写有误
999	异常错误	

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

