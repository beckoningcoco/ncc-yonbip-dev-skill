---
title: "增值税发票查验并缓存发票信息v2V2"
apiId: "2070414703480274948"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 增值税发票查验并缓存发票信息v2V2

>  请求方式	POST | Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/tax/invoiceclient-web/api/reimburseCollection/ncc/verify_and_save/v2
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
orgCode	string	否	否	税务组织编码，要求组织的组织类型必须是税务组织，纳税人识别号和税务组织编码至少传入一项，二者都传的时候税务组织编码优先，建议只传税务组织编码 示例：org111
nsrsbh	string	否	否	纳税人识别号（纳税人识别号和税务组织编码至少传入一项） 示例：11123123123123
submitter	string	否	是	查验人 示例：汪小涵
taxRateExchange	number
小数位数:0,最大长度:1	否	否	指定查验结果的税率格式，取值范围：1小数格式税率 0百分比格式税率，默认0 示例：1 默认值：0
invoices	object	是	否	票面信息
fplx	string	否	否	增值税票种的细分类型。查验数电火车票，fplx传51且必填；查验数电机票，fplx传35且必填；查验其他增值税票种，非必填，可以传空值 示例：35
fpDm	string	否	否	发票代码，查验非数电增值税发票，必填；查验数电发票，传null或空字符串 示例：1100154320
fpHm	string	否	是	发票号码 示例：25045336
kprq	string	否	是	开票日期，格式yyyyMMdd 示例：20161010
hjje	BigDecimal	否	否	合计金额，查验非数电增值税发票，此参数必填；查验数电发票，此参数可选非必填，但是传了值就要传对，否则查验不通过提示查验不一致； 示例：100
jshj	BigDecimal	否	否	价税合计，数电发票必填，非数电发票可选。传了值就要传对，否则提示查验不一致 示例：106
jym	string	否	否	校验码，有校验码的发票，必填 示例：10221376566424011310
imageId	string	否	否	OCR识别返回的imageId 示例：1877273287024467968

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/reimburseCollection/ncc/verify_and_save/v2?access_token=访问令牌
Body: {
	"orgCode": "org111",
	"nsrsbh": "11123123123123",
	"submitter": "汪小涵",
	"taxRateExchange": 1,
	"invoices": [
		{
			"fplx": "35",
			"fpDm": "1100154320",
			"fpHm": "25045336",
			"kprq": "20161010",
			"hjje": 100,
			"jshj": 106,
			"jym": "10221376566424011310",
			"imageId": "1877273287024467968"
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
code	string	否	状态码 示例：200
message	string	否	信息 示例：操作成功
data	string	否	响应信息
message	string	否	提示信息 示例：操作成功
data	object	是	数据
code	string	否	状态码 示例：3001
msg	string	否	提示信息 示例：查验成功发票一致
fpDm	string	否	发票代码 示例：051002000711
fpHm	string	否	发票号码 示例：99695079
saveToken	string	否	保存Token 示例：f3cf2d0f-bd59-431e-b0bf-40bfc20e8671
invoice	object	否	票面信息
invoiceExt	object	否	发票扩展信息
billStatus	string	否	发票状态 示例：0:正常;3:红冲;7:部分红冲;8:全额红冲

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"code": "3001",
			"msg": "查验成功发票一致",
			"fpDm": "051002000711",
			"fpHm": "99695079",
			"saveToken": "f3cf2d0f-bd59-431e-b0bf-40bfc20e8671",
			"invoice": {
				"bz": "备注",
				"fhr": "zz",
				"fpDm": "051002000711",
				"fpHm": "99695079",
				"fpMw": "zz",
				"fplx": "4",
				"fpjz": "1",
				"zfbz": "N",
				"gmfDzdh": "北京 11xxx",
				"gmfMc": "购买方名称",
				"gmfNsrsbh": "11xxx",
				"gmfYhzh": "中国工商银行11xxx",
				"hjje": 1419273.96,
				"hjse": 241276.57,
				"jqbh": "667125664181",
				"jshj": 1660550.53,
				"jym": "12832657404833031030",
				"kpr": "ll",
				"kprq": "20171026",
				"skr": "ll",
				"xsfDzdh": "浙江 11111",
				"xsfMc": "浙江",
				"xsfNsrsbh": "12345",
				"xsfYhzh": "工商银行40002993",
				"submitter": "提交人",
				"hasExist": false,
				"items": [
					{
						"dw": "千瓦时",
						"ggxh": "ll",
						"se": 241276.57,
						"sl": 17,
						"xmdj": 0.755811788209566,
						"xmje": 1419273.96,
						"xmmc": "电力",
						"xmsl": 1877814,
						"xmjshj": 123123
					}
				],
				"tspzs": [
					{
						"dzkph": "162952A086042697370692024",
						"rq": "20240426",
						"cfsj1": "14:55",
						"cccc": "G1072",
						"cfz": "济南东",
						"ddz": "北京南",
						"xb1": "二等座",
						"xw": "04车13B号",
						"xm": "张三",
						"zjhm": "340223******121119",
						"taxRate": "小数税率：0.09；百分比税率：9"
					}
				]
			}
		}
	],
	"invoiceExt": {
		"billStatus": "0:正常;3:红冲;7:部分红冲;8:全额红冲"
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
9999	未知错误	根据提示信息处理
0002	当天查验同一张发票最多5次，已超过5次	税局查验接口的限制，同一张发票一天查验次数不超过5次
0006	发票存在，票面信息不一致，请检查输入参数是否正确	一般是传入的合计金额、价税合计与票面不一致
0009	所查发票不存在	所查发票不存在
1006	尊敬的客户您好：当前发票查验功能受网络影响受限，请稍后再试！如超过2小时仍不可用，请提交问题至工单系统。（您也可访问国家税务总局全国增值税发票查验平台，确认发票查验系统是否可用。网址：https://inv-veri.chinatax.gov.cn）	税局查验接口不稳定导致，通常等待半天到1天便可自动恢复
1001	发票代码有误！不是受支持的增值税发票、区块链发票	入参不合法的错误码均是1001

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-06-03	
新增
返回参数 invoiceExt
新增
返回参数 billStatus
删除
返回参数 billStatus
修改billStatus字段
	2	2026-04-21	
新增
返回参数 billStatus
更新
返回参数 (4)
	3	2025-09-29	
更新
请求说明
更新
请求参数 orgCode
更新
请求参数 nsrsbh

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

