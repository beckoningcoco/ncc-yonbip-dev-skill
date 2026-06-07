---
title: "OCR发票识别"
apiId: "1499550851905617924"
apiPath: "请求方式	POST"
method: "ContentType	application/x-www-form-urlencoded"
category: "YonGPT Service Platform"
domain: "YYZDX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, YonGPT Service Platform]
platform_version: "BIP"
source_type: community-api-docs
---

# OCR发票识别

>  请求方式	POST | YonGPT Service Platform (YYZDX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/aipaas/mixture/ocr/recognise
请求方式	POST
ContentType	application/x-www-form-urlencoded
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
domain	string	否	是	领域编码 默认值：OpenApi
identifyType	string	否	是	识别类型 默认值：0
imageData	string	否	是	发票文件base64
ticketType	number
小数位数:0,最大长度:10	否	否	票据类型

## 3. 请求示例

Url: /yonbip/aipaas/mixture/ocr/recognise?access_token=访问令牌

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
code	long	否	code 示例：0
data	object	否	data
extra	string	否	extra
id	string	否	id 示例：9aef5bb79ac04de89111510a75246b34
identify_results	object	是	identify_results
identify_type	string	否	identify_type
message	string	否	message
open_cache	string	否	open_cache
service_type	string	否	service_type 示例：GLORITY_INVOICE_IDENTIFY
ticket_handler_types	string	否	ticket_handler_types
time_cost	string	否	time_cost 示例：4871
msg	string	否	msg 示例：success

## 5. 正确返回示例

{
	"code": 0,
	"data": {
		"extra": "",
		"id": "9aef5bb79ac04de89111510a75246b34",
		"identify_results": [
			{
				"bill_type": "invoice",
				"coordinate": {
					"degree": 0,
					"endX": 0,
					"endY": 0,
					"sourceHeight": 0,
					"sourceWidth": 0,
					"startX": 0,
					"startY": 0
				},
				"desc": "增值税电子普通发票",
				"details": {
					"fplx": "1",
					"code": "033002100811",
					"number": "49011343",
					"code_confirm": "033002100811",
					"number_confirm": "",
					"date": "2022年03月11日",
					"pretax_amount": "300.00",
					"total": "318.00",
					"total_cn": "叁佰壹拾捌圆整",
					"tax": "18.00",
					"check_code": "02941275426420845590",
					"machine_code": "499948928191",
					"seller": "西藏绿茶餐饮管理有限公司杭州滨江分公司",
					"seller_tax_id": "91330108MA28WLKXG",
					"seller_addr_tel": "杭州市滨江区江汉路1515号江南天街商业中心1幢501-7室0571-87982977",
					"seller_bank_account": "杭州联合银行吴山支行201000179135405",
					"buyer": "佛山市艾碧斯健康护理实业有限公司",
					"buyer_tax_id": "91440605NA53U2CK80",
					"buyer_bank_account": "",
					"buyer_addr_tel": "佛山市南海区桂城街道宝石东路23号(生产车间)A2(住所申报)",
					"company_seal": "1",
					"tax_seal": "",
					"seal_flag": "",
					"seal_seller_name": "",
					"seal_seller_tax_id": "",
					"overlap": "",
					"form_type": "",
					"form_name": "",
					"kind": "餐饮",
					"ciphertext": "0351/094-/02679*215+0<>3>648,>0411>6*7264146+60-4>6<7--</,85>8748/-1//8+*348*>4-1142+8,>4-*72/888018450194189*56<3<",
					"travel_tax": "",
					"receiptor": "毛元庭",
					"reviewer": "毛元庭",
					"issuer": "张晓倩",
					"province": "浙江省",
					"city": "",
					"title": "浙江增值税电子普通发票",
					"remark": "",
					"electronic_mark": "1",
					"agent_mark": "",
					"acquisition_mark": "",
					"service_name": "餐饮服务",
					"company_seal_mark": "1",
					"transit_mark": "",
					"vehicle_mark": "0",
					"oil_mark": "",
					"stamp_info": "国家税务总局长春市税务局代开(15),91330108MA28WMLKXG",
					"producer_stamp": "国家税务总局",
					"block_chain": "",
					"zfbz": "",
					"return_red_flag": "",
					"item_names": "*餐饮服务*餐饮服务",
					"commodity_name": "[\"*餐饮服务*餐饮服务\"]",
					"currency_code": "CNY",
					"items": [
						{
							"name": "*餐饮服务*餐饮服务",
							"unit": "",
							"specification": "",
							"quantity": "1",
							"price": "300",
							"total": "300.00",
							"tax_rate": "6%",
							"tax": "18.00"
						}
					],
					"extra": {}
				},
				"extra": {
					"barcode": "",
					"check_code_candidates": [
						""
					],
					"check_code_last_six": [
						""
					],
					"number_order_error": [
						""
					],
					"qrcode": "[\"01,10,033002100811,49011343,300,20220311,02941275426420845590,6C61,\"]"
				},
				"identify_type": 1,
				"imageId": "6cf4b444f1f341e8ad94951e88920129",
				"image_size": NaN,
				"info": "",
				"orientation": "0",
				"page": 0,
				"region": NaN,
				"signature_dto": "",
				"type": "10102",
				"verify_flag": "",
				"verify_message": ""
			}
		],
		"identify_type": "",
		"message": "",
		"open_cache": "",
		"service_type": "GLORITY_INVOICE_IDENTIFY",
		"ticket_handler_types": "",
		"time_cost": "4871"
	},
	"msg": "success"
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
50000	imageBase64不能为空	
50006	参数【domain】不能为空	
50008	当前上传文件真实类型不在【pdf,png,jpg,jpeg,ofd】类型范围内	
50010	当前上传文件的base64大小需在1KB至8MB之间	
50003	识别参数imageUrl、imageFile、imageBase64不能同时为空	
50011	提示:[当前上传为非法的URL或URL需跳转登录操作，请输入外网可访问的图片URL]	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-19	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

