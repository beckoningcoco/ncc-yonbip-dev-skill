---
title: "资产报废保存"
apiId: "1502659935778373636"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Scrap"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Scrap]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产报废保存

>  请求方式	POST | Asset Scrap (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/aumscrapcard/save
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
data	object	是	否	资产报废对象
_status	string	否	是	状态（仅支持Insert） 示例：Insert
bill_type	string	否	是	单据类型 示例：4A19
pk_org	string	否	是	资产组织id或者编码 示例：2643459051312128
transi_type	string	否	是	单据类型编码 示例：4A19-01
bill_code	string	否	否	单据编号（设置手工编号时必填） 示例：ZCBF202207180001
pk_recorder	string	否	否	经办人id或者编码 示例：2643557892002048
bill_date	string	否	是	报废日期 示例：2022-08-31
bodyvos	object	是	否	资产报废子表数据集合
integratedAssetFlag	boolean	否	否	混合云插件标记 示例：false 默认值：false

## 3. 请求示例

Url: /yonbip/am/aumscrapcard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"_status": "Insert",
			"bill_type": "4A19",
			"pk_org": "2643459051312128",
			"transi_type": "4A19-01",
			"bill_code": "ZCBF202207180001",
			"pk_recorder": "2643557892002048",
			"bill_date": "2022-08-31",
			"bodyvos": [
				{
					"_status": "",
					"stock_out_flag": false,
					"stock_in_flag": false,
					"close_flag": false,
					"pk_equip__equip_code": "20220226000004",
					"confirm_flag": true,
					"pk_location_after": "2002964733089546246",
					"pk_location_before": "2002964733089546246",
					"pk_addreducestyle": "2616869105554258"
				}
			],
			"integratedAssetFlag": false
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
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	string	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
count	long	否	总数 示例：1
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
messages	object	是	返回详细信息
infos	object	是	数据详细信息
failInfos	object	是	错误信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"bill_type": "4A19",
				"pk_org": "1504027126944235523",
				"transi_type": "4A19-01",
				"bill_code": "ZCBF202207260009",
				"bill_status": 0,
				"pk_recorder": "1504069346497921030",
				"bill_date": "2022-07-26 00:00:00",
				"bodyvos": [
					{
						"stock_out_flag": false,
						"stock_in_flag": false,
						"close_flag": false,
						"pk_equip__equip_code": "EAM-202207200034",
						"confirm_flag": true,
						"pk_location_after": "1533847127848386562",
						"pk_location_before": "1533847127848386562",
						"pk_addreducestyle": 1503202184013021200,
						"id": "1508621496417779717",
						"main_id": "1508621496417779716",
						"pk_org": "1504027126944235523",
						"tenant": "0000L5RISDMC3LVUA40000",
						"ytenant": "0000L5RISDMC3LVUA40000"
					}
				],
				"id": "1508621496417779716",
				"sysid": "AUM",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creator__name": "默认用户",
				"creationtime": "2022-07-26 17:10:57",
				"billmaker": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"billmaker__name": "默认用户",
				"billmaketime": "2022-07-26 17:10:57",
				"pk_transitype": "1503202158218052624",
				"isWfControlled": false,
				"tenant": "0000L5RISDMC3LVUA40000",
				"ytenant": "0000L5RISDMC3LVUA40000",
				"pubts": "2022-07-26 17:10:58"
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
999	报错具体提示信息，例如：服务端逻辑异常	查看日志找对应异常服务定位产生原因

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

