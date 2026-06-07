---
title: "申请红字信息表(购方销方)"
apiId: "4220660111b341678bfc930c21cd1540"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Red Letter Application Form"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Red Letter Application Form]
platform_version: "BIP"
source_type: community-api-docs
---

# 申请红字信息表(购方销方)

>  请求方式	POST | Red Letter Application Form (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/tax/invoiceclient-web/api/redinfo-apply/insertWithRedApply
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
orgCode	string	否	是	开票点编码；在开票点档案中查询 示例：0008test
reqMemo	string	否	是	信息表申请类型：购买方申请已抵扣：1100000000；购买方申请未抵扣：1010000000；销售方申请：0000000100 示例：1100000000
yfpHm	string	否	否	原发票号码：未折扣代码号码必填 示例：121212121
yfpDm	string	否	否	原发票代码：未抵扣代码号码必填 示例：511121513132
gmfMc	string	否	是	购买方名称 示例：用友金融信息技术股份有限公司123
gmfNsrsbh	string	否	是	购买方纳税人识别号 示例：111222333456333
xsfMc	string	否	是	销售方名称 示例：测试333
xsfNsrsbh	string	否	是	销售方纳税人识别号 示例：91110000600001760K
cpyMemo	string	否	否	红字申请表成品油涉及类型：1：涉及销售数量变更，2：涉及销售金额变更 示例：1
kprq	string	否	否	开票日期：格式为yyyy-MM-dd 示例：2023-02-01
hjje	BigDecimal	否	是	合计金额 示例：-99.01
hjse	BigDecimal	否	是	合计税额 示例：-0.99
jshj	BigDecimal	否	是	价税合计 示例：-100
kpr	string	否	否	开票人：当开票点档案未设置开票人时必传 示例：张三
items	object	是	否	明细项目信息
xmmc	string	否	是	带上简码的项目名称 示例：*运输服务*橡皮
ysxmmc	string	否	否	不带简码的项目名称 示例：橡皮
xmje	BigDecimal	否	是	项目金额 示例：-99.01
se	BigDecimal	否	是	税额 示例：-0.99
xmjshj	BigDecimal	否	是	项目价税合计 示例：-100
ggxh	string	否	否	规格型号 示例：支
dw	string	否	否	单位 示例：一二三
xmdj	BigDecimal	否	否	项目单价 示例：23.0041942911
xmsl	BigDecimal	否	否	项目数量 示例：-4.3039977296
sl	BigDecimal	否	是	税率 示例：0.01
spbm	string	否	是	商品编码 示例：3213124314324322
urls	string	是	否	回调的url；回调返回参数见：https://fapiao.yonyoucloud.com/apidoc/appendix/下的开放平台接口信息补充描述 示例：[{ "fpqqlsh":"12345678901234567890", "url": "http://url.com/msg" }]
reqBillNo	string	否	是	红字信息表申请表流水号 示例：84132123132

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/redinfo-apply/insertWithRedApply?access_token=访问令牌
Body: {
	"orgCode": "0008test",
	"reqMemo": "1100000000",
	"yfpHm": "121212121",
	"yfpDm": "511121513132",
	"gmfMc": "用友金融信息技术股份有限公司123",
	"gmfNsrsbh": "111222333456333",
	"xsfMc": "测试333",
	"xsfNsrsbh": "91110000600001760K",
	"cpyMemo": "1",
	"kprq": "2023-02-01",
	"hjje": -99.01,
	"hjse": -0.99,
	"jshj": -100,
	"kpr": "张三",
	"items": [
		{
			"xmmc": "*运输服务*橡皮",
			"ysxmmc": "橡皮",
			"xmje": -99.01,
			"se": -0.99,
			"xmjshj": -100,
			"ggxh": "支",
			"dw": "一二三",
			"xmdj": 23.0041942911,
			"xmsl": -4.3039977296,
			"sl": 0.01,
			"spbm": "3213124314324322"
		}
	],
	"urls": [
		{
			"fpqqlsh": "12345678901234567890",
			"url": "http://url.com/msg"
		}
	],
	"reqBillNo": "84132123132"
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
message	string	否	操作信息 示例：操作成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
9999	红字信息申请流水号为3211ss232123重复，请检查	请确认数据正确性

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

