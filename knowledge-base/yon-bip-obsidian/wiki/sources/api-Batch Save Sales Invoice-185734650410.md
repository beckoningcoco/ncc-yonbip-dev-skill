---
title: "销售发票批量保存"
apiId: "1857346504108802056"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Hybrid Cloud Integration"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Hybrid Cloud Integration]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售发票批量保存

>  请求方式	POST | Hybrid Cloud Integration (SD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/crm/openapi/imi/imiSaleInvoice/save
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
data	object	是	是	数据节点
csaleinvoiceid	string	否	否	发票主实体
pk_group	string	否	否	集团
pk_org	long	否	否	开票组织ID
ctrantypeid	string	否	否	发票类型
vtrantypecode	string	否	否	发票类型编码
cbalancetypeid	long	否	否	结算方式ID
vbillcode	string	否	否	发票号
dbilldate	string	否	否	开票日期
cinvoicecustid	long	否	否	客户ID
vprintcustname	string	否	否	客户打印名称
cinvoicecustid_tel1	string	否	否	客户电话
cinvoicecustid_taxpayerid	string	否	否	客户税号
ccustbankid	string	否	否	客户开户银行
ccustbankaccid	string	否	否	客户银行账号
ccust_address_detailinfo	string	否	否	客户地址
cpaytermid	string	否	否	收款协议ID
vcreditnum	string	否	否	信用证号
vgoldtaxcode	string	否	否	金税票号
corigcurrencyid	long	否	否	币种ID
nexchangerate	BigDecimal	否	否	折本汇率
ccurrencyid	long	否	否	本位币ID
ngroupexchgrate	BigDecimal	否	否	集团本位币汇率
nglobalexchgrate	BigDecimal	否	否	全局本位币汇率
nhvoicedisrate	BigDecimal	否	否	发票折扣
ntotalastnum	BigDecimal	否	否	总数量
ntotalmny	BigDecimal	否	否	发票总金额
ntotalorigsubmny	BigDecimal	否	否	冲抵金额
ntotalorigmny	BigDecimal	否	否	价税合计
bsubunitflag	string	否	否	冲抵标记
fopposeflag	string	否	否	对冲标记
vopposesrccode	string	否	否	对冲来源发票号
copposesrcid	string	否	否	对冲来源主表
vnote	string	否	否	备注
fstatusflag	string	否	否	单据状态
vdef1	string	否	否	自定义项1
vdef2	string	否	否	自定义项2
vdef3	string	否	否	自定义项3
vdef4	string	否	否	自定义项4
vdef5	string	否	否	自定义项5
vdef6	string	否	否	自定义项6
vdef7	string	否	否	自定义项7
vdef8	string	否	否	自定义项8
vdef9	string	否	否	自定义项9
vdef10	string	否	否	自定义项10
vdef11	string	否	否	自定义项11
vdef12	string	否	否	自定义项12
vdef13	string	否	否	自定义项13
vdef14	string	否	否	自定义项14
vdef15	string	否	否	自定义项15
vdef16	string	否	否	自定义项16
vdef17	string	否	否	自定义项17
vdef18	string	否	否	自定义项18
vdef19	string	否	否	自定义项19
vdef20	string	否	否	自定义项20
ts	string	否	否	ts
billmaker	string	否	否	制单人
dmakedate	string	否	否	制单日期
approver	string	否	否	审核人
taudittime	string	否	否	审核日期
dr	short	否	否	dr
items	object	是	否	销售发票子表

## 3. 请求示例

Url: /yonbip/crm/openapi/imi/imiSaleInvoice/save?access_token=访问令牌
Body: {
	"data": [
		{
			"csaleinvoiceid": "",
			"pk_group": "",
			"pk_org": 0,
			"ctrantypeid": "",
			"vtrantypecode": "",
			"cbalancetypeid": 0,
			"vbillcode": "",
			"dbilldate": "",
			"cinvoicecustid": 0,
			"vprintcustname": "",
			"cinvoicecustid_tel1": "",
			"cinvoicecustid_taxpayerid": "",
			"ccustbankid": "",
			"ccustbankaccid": "",
			"ccust_address_detailinfo": "",
			"cpaytermid": "",
			"vcreditnum": "",
			"vgoldtaxcode": "",
			"corigcurrencyid": 0,
			"nexchangerate": 0,
			"ccurrencyid": 0,
			"ngroupexchgrate": 0,
			"nglobalexchgrate": 0,
			"nhvoicedisrate": 0,
			"ntotalastnum": 0,
			"ntotalmny": 0,
			"ntotalorigsubmny": 0,
			"ntotalorigmny": 0,
			"bsubunitflag": "",
			"fopposeflag": "",
			"vopposesrccode": "",
			"copposesrcid": "",
			"vnote": "",
			"fstatusflag": "",
			"vdef1": "",
			"vdef2": "",
			"vdef3": "",
			"vdef4": "",
			"vdef5": "",
			"vdef6": "",
			"vdef7": "",
			"vdef8": "",
			"vdef9": "",
			"vdef10": "",
			"vdef11": "",
			"vdef12": "",
			"vdef13": "",
			"vdef14": "",
			"vdef15": "",
			"vdef16": "",
			"vdef17": "",
			"vdef18": "",
			"vdef19": "",
			"vdef20": "",
			"ts": "",
			"billmaker": "",
			"dmakedate": "",
			"approver": "",
			"taudittime": "",
			"dr": 0,
			"items": [
				{
					"pk_group": "",
					"pk_org": 0,
					"csaleinvoicebid": "",
					"crowno": "",
					"cmarbascalssid": 0,
					"cmaterialvid": 0,
					"cmaterialvid_name": "",
					"cmaterialvid_materialspec": "",
					"cmaterialvid_materialtype": "",
					"castunitid": 0,
					"nastnum": 0,
					"cunitid": 0,
					"dbilldate": "",
					"nnum": 0,
					"vchangerate": "",
					"nqtorigtaxprice": 0,
					"ntaxrate": 0,
					"nqtorigprice": 0,
					"nqtorigtaxnetprc": 0,
					"nqtorignetprice": 0,
					"ntax": 0,
					"norigmny": 0,
					"norigtaxmny": 0,
					"norigdiscount": 0,
					"ndiscountrate": 0,
					"nitemdiscountrate": 0,
					"ninvoicedisrate": 0,
					"cproductorid": "",
					"cvendorid": 0,
					"cprojectid": 0,
					"nbforigsubmny": 0,
					"norigsubmny": 0,
					"blargessflag": "",
					"cordercustid": 0,
					"creceivecustid": 0,
					"cemployeeid": 0,
					"cdeptvid": 0,
					"cchanneltypeid": "",
					"csaleorgvid": 0,
					"cqtunitid": 0,
					"vqtunitrate": "",
					"nqtunitnum": 0,
					"csendstockorgvid": 0,
					"csendstordocid": 0,
					"ctaxcodeid": 0,
					"ftaxtypeflag": "",
					"norigtaxprice": 0,
					"norigprice": 0,
					"norigtaxnetprice": 0,
					"norignetprice": 0,
					"ncaltaxmny": 0,
					"bdiscountflag": "",
					"blaborflag": "",
					"vbatchcode": "",
					"ntaxprice": 0,
					"nprice": 0,
					"ntaxnetprice": 0,
					"nnetprice": 0,
					"nqttaxprice": 0,
					"nqtprice": 0,
					"nqttaxnetprice": 0,
					"nqtnetprice": 0,
					"nmny": 0,
					"ntaxmny": 0,
					"ndiscount": 0,
					"ngroupmny": 0,
					"ngrouptaxmny": 0,
					"nglobalmny": 0,
					"nglobaltaxmny": 0,
					"carorgid": 0,
					"creceiveaddrid": "",
					"ctransporttypeid": 0,
					"cprodlineid": 0,
					"ccostsubjid": "",
					"cctmanageid": "",
					"nshouldoutnum": 0,
					"ntotaloutnum": 0,
					"ntotalincomenum": 0,
					"ntotalincomemny": 0,
					"ntotalcostnum": 0,
					"ntotalpaymny": 0,
					"vfree1": "",
					"vfree2": "",
					"vfree3": "",
					"vfree4": "",
					"vfree5": "",
					"vfree6": "",
					"vfree7": "",
					"vfree8": "",
					"vfree9": "",
					"vfree10": "",
					"vbdef1": "",
					"vbdef2": "",
					"vbdef3": "",
					"vbdef4": "",
					"vbdef5": "",
					"vbdef6": "",
					"vbdef7": "",
					"vbdef8": "",
					"vbdef9": "",
					"vbdef10": "",
					"vbdef11": "",
					"vbdef12": "",
					"vbdef13": "",
					"vbdef14": "",
					"vbdef15": "",
					"vbdef16": "",
					"vbdef17": "",
					"vbdef18": "",
					"vbdef19": "",
					"vbdef20": "",
					"ts": "",
					"vrownote": "",
					"dr": 0,
					"csaleinvoiceid": ""
				}
			]
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
code	long	否	状态码
message	string	否	状态信息
data	object	否	返回数据
count	int	否	总条数
sucessCount	int	否	成功条数
failCount	int	否	失败条数
messages	object	是	错误信息
infos	object	是	成功信息

## 5. 正确返回示例

{
	"code": 0,
	"message": "",
	"data": {
		"count": 0,
		"sucessCount": 0,
		"failCount": 0,
		"messages": [
			{
				"sourceUnique": "",
				"message": ""
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "",
					"targetUnique": ""
				},
				"asyncKey": "",
				"url": ""
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
999	响应结果错误	响应结果错误

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

