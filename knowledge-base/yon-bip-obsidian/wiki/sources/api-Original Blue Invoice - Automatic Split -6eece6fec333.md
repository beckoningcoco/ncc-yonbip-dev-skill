---
title: "原开蓝票-自动拆分(废弃-可使用【开蓝票-自动拆分】)"
apiId: "6eece6fec3334d2e91e6d1448d07709b"
apiPath: "请求方式	POST"
method: "ContentType	application/x-www-form-urlencoded"
category: "Invoicing"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing]
platform_version: "BIP"
source_type: community-api-docs
---

# 原开蓝票-自动拆分(废弃-可使用【开蓝票-自动拆分】)

>  请求方式	POST | Invoicing (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/tax/invoiceclient-web/api/invoiceApply/insertWithSplit
请求方式	POST
ContentType	application/x-www-form-urlencoded
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
requestdatas	string	否	是	开蓝票自动拆分请求参数； 示例：请求参数详情见开放平台接口信息补充描述-销项发票管理-开蓝票-自动拆分：https://fapiao.yonyoucloud.com/apidoc/api/%E9%94%80%E9%A1%B9-%E5%BC%80%E7%A5%A8%E7%94%B3%E8%AF%B7.html#%E5%BC%80%E8%93%9D%E7%A5%A8-%E8%87%AA%E5%8A%A8%E6%8B%86%E5%88%86
email	string	否	否	邮件推送配置 示例：[ { "fpqqlsh":"12522222", "address": "x1@yonyou.com,x2@yonyou.com" } ]
sms	string	否	否	短信推送配置（可选） 示例：[{ "fpqqlsh":"12522222", "address": "13511111111,13511111112" }]
url	string	否	否	回调服务配置；返回结果详情见开放平台接口信息补充描述-销项发票管理-常规回调数据样例：https://fapiao.yonyoucloud.com/apidoc/appendix/ 示例：[{ "fpqqlsh":"12522222", "url": "http://url.com/msg" }]
autoAudit	string	否	否	是否自动审核（可选）：true:自动审核，即不需要人工在发票平台确认开票，直接进行开票 false:不自动审核，即需要人工确认 如果不传，代表true 示例：true
nc6x-ubl	string	否	否	ncc友企联回调参数；返回结果详情见开放平台接口信息补充描述-销项发票管理-NCC友企联回调数据样例：https://fapiao.yonyoucloud.com/apidoc/appendix/ 示例：[{ "fpqqlsh":"12522222", "method":"queryUserPermAppPksOrCodes", "intf":"nccloud.pubitf.baseapp.apprbac.IAppAndOrgPermQueryPubService" }]
delurl	string	否	否	退回地址信息 示例：[{ "fpqqlsh":"12522222", "url": "http://url.com/msg" }]

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/invoiceApply/insertWithSplit?access_token=访问令牌

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
code	string	否	返回处理状态值 示例：200
message	string	否	信息 示例：操作成功
message	string	否	返回处理信息 示例：success
data	string	否	响应信息
data	object	否	返回拆分后的数据；根据实际情况返回参数，部分参数可能不显示
bmbBbh	string	否	编码表编号 示例：13.0
bz	string	否	备注 示例：BZSHY
corpId	string	否	租户id 示例：9bf8bdc0-0647-4863-8c04-4c24c3487827
fhr	string	否	复核人 示例：fhr
fpjz	string	否	发票介质：0-电子发票;1-纸质发票。 示例：0
fplx	string	否	发票类型：1：增值税电子普通发票；2：增值税电子专用发票；3：增值税普通发票；4：增值税专用发票 ；5：机动车销售统一发票；8：增值税电子普通发票（成品油）；10：成品油普通发票；11：成品油专用发票；15：二手车销售统一发票；31：数电专用发票；32：数电普通发票；33：数电纸质发票(增值税专用发票)；34：数电纸质发票(普通发票)； 示例：1
fpqqlsh	string	否	发票请求流水号 示例：shy100000000000006
fpzt	string	否	发票状态：0-正常，1-失控，2-作废，3-红冲，4-异常 示例：0
gmfDzdh	string	否	购买方地址电话 示例：address
gmfMc	string	否	购买方名称 示例：shy00004
gmfNsrsbh	string	否	购买方纳税人识别号 示例：214356654322666
gmfYhzh	string	否	购买方银行账号 示例：213456543233523
hjje	BigDecimal	否	合计金额 示例：30000
hjse	BigDecimal	否	合计税额 示例：5100
id	string	否	id 示例：957786
jshj	BigDecimal	否	价税合计 示例：35100
kplx	string	否	开票类型：0蓝票，1红票 示例：0
kpr	string	否	开票人 示例：kpr
lylx	string	否	来源类型：1-手工开具，2-接口传入，3-本地文件导入 4-二维码扫描 9 微信小程序 示例：1
orgId	string	否	组织id 示例：37
orgcode	string	否	开票点编码；在开票点档案中查看 示例：HX002
skr	string	否	收款人 示例：skr
splitInvoice	boolean	否	拆分标志 示例：true
xsfDzdh	string	否	销售方地址电话 示例：XSFDZDH
xsfYhzh	string	否	销售方银行账号 示例：xsfyhzh
zdrq	string	否	制单日期；yyyy-MM-dd 示例：2024-02-02
zsfs	string	否	征税方式：0-普通征税 2-差额征税 示例：0
items	object	是	子表信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"bmbBbh": "13.0",
		"bz": "BZSHY",
		"corpId": "9bf8bdc0-0647-4863-8c04-4c24c3487827",
		"fhr": "fhr",
		"fpjz": "0",
		"fplx": "1",
		"fpqqlsh": "shy100000000000006",
		"fpzt": "0",
		"gmfDzdh": "address",
		"gmfMc": "shy00004",
		"gmfNsrsbh": "214356654322666",
		"gmfYhzh": "213456543233523",
		"hjje": 30000,
		"hjse": 5100,
		"id": "957786",
		"jshj": 35100,
		"kplx": "0",
		"kpr": "kpr",
		"lylx": "1",
		"orgId": "37",
		"orgcode": "HX002",
		"skr": "skr",
		"splitInvoice": true,
		"xsfDzdh": "XSFDZDH",
		"xsfYhzh": "xsfyhzh",
		"zdrq": "2024-02-02",
		"zsfs": "0",
		"items": [
			{
				"dw": "dw111",
				"fphxz": "0",
				"ggxh": "GGXH",
				"hh": "1",
				"hid": "957786",
				"id": "1330772",
				"kce": 0,
				"se": 5100,
				"sl": 0.17,
				"spbm": "1060301010100000000",
				"xmdj": 15000,
				"xmhsdj": 17550,
				"xmje": 30000,
				"xmjshj": 35100,
				"xmmc": "jyz",
				"xmsl": 2,
				"zkhhh": "111"
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
9999	未知错误	未知错误
1002	数据不存在	数据不存在
1001	数据不合法，传入参数	数据不合法，传入参数

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-03	
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

