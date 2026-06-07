---
title: "备件清单保存"
apiId: "1607364718705508360"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "List of Spare Parts"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, List of Spare Parts]
platform_version: "BIP"
source_type: community-api-docs
---

# 备件清单保存

>  请求方式	POST | List of Spare Parts (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/sppsparepartcard/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	备件清单参数对象
pk_org	string	否	是	维修组织id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：1515942036254490632
bill_code	string	否	否	备件码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输，最大传参长度：200 示例：BJ202212060001
bill_status	int	否	否	单据状态（0：开立） 示例：0 默认值：0
pk_material	string	否	是	物料id或编码，数据范围：id（长整型数据范围），编码（字符串类型，最大255位） 示例：1524105351752318984
batchno	string	否	否	批次号，最大传参长度：200 示例：批次号信息
serial_num	string	否	否	序列号，最大传参长度：80 示例：序列号信息
pk_provider	string	否	否	供应商id或编码，数据范围：id（长整型数据范围），编码（字符串类型，最大255位） 示例：1524008036280041480
facturer_name	string	否	否	生产厂商，最大传参长度：255 示例：生产厂商信息
brand	string	否	否	品牌，最大传参长度：255 示例：品牌信息
produce_place	string	否	否	产地，最大传参长度：255 示例：产地信息
factory_number	string	否	否	出厂编号，最大传参长度：255 示例：出厂编号信息
service_life	int	否	否	使用寿命，数据范围：1-2147483647 示例：365
life_unit	string	否	否	寿命单位(1:小时,2:天,3:月,4:季度,5:年) 示例：2
status	string	否	是	状态(1:在库,3:上机,5:报废) 示例：1
status_date	DateTime	否	是	业务日期（格式：yyyy-MM-dd HH:mm:ss） 示例：2022-12-06 10:07:42
technical_state	string	否	否	技术状况，最大传参长度：255 示例：技术状况信息
pk_equip	string	否	否	资产卡片id或编码（状态为上机时填写，其他状态无需填写，状态为上机时资产和位置不能同时为空），最大传参长度：id（最大36位），编码（最大50位） 示例：1654803603152437251
pk_location	string	否	否	位置id或编码（状态为上机时填写，其他状态无需填写，状态为上机时资产和位置不能同时为空），最大传参长度：id（最大36位），编码（最大50位） 示例：1524200777313681416
up_part	string	否	否	上机部位（可参考资产卡片资产部位中的名称传值，状态为上机时必填，其他状态无需填写），最大传参长度：200 示例：上机部位名称1
storage_location	string	否	否	存放地点id或编码（状态为在库或者报废时必填，其他状态无需填写），最大传参长度：id（最大36位），编码（最大50位） 示例：1518441415161413640
sp_attribute	string	否	是	备件属性(1:新件,2:待修件,3:修复件,4报废件，注意：状态为在库时可选择新件、待修件、修复件；状态为上机时可选择新件、修复件；状态为报废时可选择报废件) 示例：1
src_bill_type	string	否	否	来源单据类型（新增保存无需填写，只有工单默认传4B36） 示例：4B36
memo	string	否	否	备注，最大传参长度：200 示例：备注信息

## 3. 请求示例

Url: /yonbip/am/sppsparepartcard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_org": "1515942036254490632",
			"bill_code": "BJ202212060001",
			"bill_status": 0,
			"pk_material": "1524105351752318984",
			"batchno": "批次号信息",
			"serial_num": "序列号信息",
			"pk_provider": "1524008036280041480",
			"facturer_name": "生产厂商信息",
			"brand": "品牌信息",
			"produce_place": "产地信息",
			"factory_number": "出厂编号信息",
			"service_life": 365,
			"life_unit": "2",
			"status": "1",
			"status_date": "2022-12-06 10:07:42",
			"technical_state": "技术状况信息",
			"pk_equip": "1654803603152437251",
			"pk_location": "1524200777313681416",
			"up_part": "上机部位名称1",
			"storage_location": "1518441415161413640",
			"sp_attribute": "1",
			"src_bill_type": "4B36",
			"memo": "备注信息"
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
failInfos	object	是	错误详细信息
messages	object	是	返回详细信息
infos	object	是	数据详细信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"failInfos": [
			{}
		],
		"messages": [
			{}
		],
		"infos": [
			{
				"id": "1607154170807713801",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creator__name": "YonSuite默认用户",
				"creationtime": "2022-12-06 11:29:30",
				"pk_org": "1515942036254490632",
				"bill_code": "BJ202212060002",
				"bill_status": 0,
				"bill_type": "4B81",
				"transi_type": "4B81-01",
				"pk_material": 1524105351752318984,
				"batchno": "批次号信息",
				"serial_num": "序列号信息",
				"pk_provider": 1524008036280041480,
				"facturer_name": "生产厂商信息",
				"brand": "品牌信息",
				"produce_place": "产地信息",
				"factory_number": "出厂编号信息",
				"service_life": 365,
				"life_unit": 2,
				"status": 1,
				"status_date": "2022-12-06 10:07:42",
				"technical_state": "技术状况信息",
				"pk_equip": "1654803603152437251",
				"pk_location": "1524200777313681416",
				"up_part": "上机部位名称1",
				"storage_location": "1518441415161413640",
				"sp_attribute": "1",
				"memo": "备注信息"
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
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
0	未传入优惠券档案id	coupon_id值填写有误
999	输入的长度不能超过40位	请检查传入数据的正确性

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

