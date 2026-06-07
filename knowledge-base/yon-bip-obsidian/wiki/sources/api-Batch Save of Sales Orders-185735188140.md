---
title: "销售订单批量保存"
apiId: "1857351881407856645"
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

# 销售订单批量保存

>  请求方式	POST | Hybrid Cloud Integration (SD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/crm/openapi/imi/imiSaleOrder/save
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
csaleorderid	string	否	否	销售订单主实体
pk_org	long	否	否	销售组织ID
ctrantypeid	string	否	否	订单类型
vtrantypecode	string	否	否	订单类型编码
pk_group	string	否	否	集团
vbillcode	string	否	否	单据号
cbiztypeid	string	否	否	业务流程
dbilldate	string	否	否	单据日期
ccustomerid	long	否	否	客户ID
cchanneltypeid	string	否	否	销售渠道类型
cemployeeid	long	否	否	销售业务员ID
cdeptvid	long	否	否	销售部门ID
cinvoicecustid	long	否	否	开票客户ID
chreceivecustid	long	否	否	收货客户ID
chreceiveaddid	string	否	否	收货地址
cpaytermid	string	否	否	收款协议ID
ndiscountrate	BigDecimal	否	否	整单折扣
corigcurrencyid	long	否	否	币种ID
ctransporttypeid	long	否	否	运输方式ID
ntotalnum	BigDecimal	否	否	总数量
ntotalorigmny	BigDecimal	否	否	价税合计
npreceiverate	BigDecimal	否	否	订单收款比例
nlrgtotalorigmny	BigDecimal	否	否	赠品价税合计
npreceivequota	BigDecimal	否	否	订单收款限额
bpreceiveflag	string	否	否	收款限额控制预收
npreceivemny	BigDecimal	否	否	实际预收款金额
nreceivedmny	BigDecimal	否	否	实际收款金额
nthisreceivemny	BigDecimal	否	否	本次收款金额
ntotalmny	BigDecimal	否	否	冲抵前金额
ntotalorigsubmny	BigDecimal	否	否	费用冲抵金额
boffsetflag	string	否	否	是否冲抵
ntotalweight	BigDecimal	否	否	总重量
ntotalvolume	BigDecimal	否	否	总体积
ntotalpiece	BigDecimal	否	否	总件数
vrevisereason	string	否	否	修订理由
bcostsettleflag	string	否	否	成本结算关闭
barsettleflag	string	否	否	收入结算关闭标记
bsettleflag	string	否	否	结算关闭标记
boutendflag	string	否	否	出库关闭
binvoicendflag	string	否	否	开票关闭
bsendendflag	string	否	否	发货关闭
fstatusflag	string	否	否	单据状态
cbalancetypeid	string	否	否	结算方式
creviserid	string	否	否	修订人
iversion	int	否	否	修订版本号
trevisetime	string	否	否	修订日期
vnote	string	否	否	备注
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
items	object	是	否	销售订单子表

## 3. 请求示例

Url: /yonbip/crm/openapi/imi/imiSaleOrder/save?access_token=访问令牌
Body: {
	"data": [
		{
			"csaleorderid": "",
			"pk_org": 0,
			"ctrantypeid": "",
			"vtrantypecode": "",
			"pk_group": "",
			"vbillcode": "",
			"cbiztypeid": "",
			"dbilldate": "",
			"ccustomerid": 0,
			"cchanneltypeid": "",
			"cemployeeid": 0,
			"cdeptvid": 0,
			"cinvoicecustid": 0,
			"chreceivecustid": 0,
			"chreceiveaddid": "",
			"cpaytermid": "",
			"ndiscountrate": 0,
			"corigcurrencyid": 0,
			"ctransporttypeid": 0,
			"ntotalnum": 0,
			"ntotalorigmny": 0,
			"npreceiverate": 0,
			"nlrgtotalorigmny": 0,
			"npreceivequota": 0,
			"bpreceiveflag": "",
			"npreceivemny": 0,
			"nreceivedmny": 0,
			"nthisreceivemny": 0,
			"ntotalmny": 0,
			"ntotalorigsubmny": 0,
			"boffsetflag": "",
			"ntotalweight": 0,
			"ntotalvolume": 0,
			"ntotalpiece": 0,
			"vrevisereason": "",
			"bcostsettleflag": "",
			"barsettleflag": "",
			"bsettleflag": "",
			"boutendflag": "",
			"binvoicendflag": "",
			"bsendendflag": "",
			"fstatusflag": "",
			"cbalancetypeid": "",
			"creviserid": "",
			"iversion": 0,
			"trevisetime": "",
			"vnote": "",
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
					"csaleorderid": "",
					"csaleorderbid": "",
					"crowno": "",
					"cctmanageid": "",
					"pk_org": 0,
					"pk_group": "",
					"cmaterialvid": 0,
					"cmaterialvid_materialspec": "",
					"cmaterialvid_materialtype": "",
					"cprodlineid": 0,
					"cunitid": 0,
					"nnum": 0,
					"castunitid": 0,
					"vchangerate": "",
					"nastnum": 0,
					"cqtunitid": 0,
					"vqtunitrate": "",
					"nqtunitnum": 0,
					"ndiscountrate": 0,
					"nitemdiscountrate": 0,
					"nexchangerate": 0,
					"ntaxrate": 0,
					"nqtorigprice": 0,
					"nqtorignetprice": 0,
					"nqtorigtaxprice": 0,
					"nqtorigtaxnetprc": 0,
					"norigmny": 0,
					"norigdiscount": 0,
					"norigtaxmny": 0,
					"naccprice": 0,
					"norigtaxprice": 0,
					"norigprice": 0,
					"norigtaxnetprice": 0,
					"norignetprice": 0,
					"vbatchcode": "",
					"blargessflag": "",
					"creceiveaddrid": "",
					"vrownote": "",
					"dbilldate": "",
					"creceiveareaid": "",
					"ccurrencyid": 0,
					"ctaxcodeid": 0,
					"ftaxtypeflag": "",
					"ntax": 0,
					"ncaltaxmny": 0,
					"nbforigsubmny": 0,
					"nqttaxprice": 0,
					"nqtprice": 0,
					"nqttaxnetprice": 0,
					"nqtnetprice": 0,
					"ntaxprice": 0,
					"nprice": 0,
					"ntaxnetprice": 0,
					"nnetprice": 0,
					"nmny": 0,
					"ntaxmny": 0,
					"ndiscount": 0,
					"ngroupexchgrate": 0,
					"ngroupmny": 0,
					"ngrouptaxmny": 0,
					"nglobalexchgrate": 0,
					"nglobalmny": 0,
					"nglobaltaxmny": 0,
					"blaborflag": "",
					"bdiscountflag": "",
					"dsenddate": "",
					"dreceivedate": "",
					"creceivecustid": 0,
					"csendstockorgvid": 0,
					"creceiveadddocid": "",
					"csendstordocid": 0,
					"ctrafficorgvid": 0,
					"csettleorgvid": 0,
					"fretexchange": 0,
					"cexchangesrcretid": "",
					"cretreasonid": "",
					"vreturnmode": "",
					"cretpolicyid": "",
					"vctcode": "",
					"cctmanagebid": "",
					"cqualitylevelid": "",
					"cmaterialvid_name": "",
					"cproductorid": "",
					"cbvendor": 0,
					"cbprojectid": 0,
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
					"ntotalsendnum": 0,
					"ntotaloutnum": 0,
					"ntotalinvoicenum": 0,
					"ntotalnotoutnum": 0,
					"ntotalsignnum": 0,
					"ntranslossnum": 0,
					"ntotalestarnum": 0,
					"ntotalarnum": 0,
					"ntotalcostnum": 0,
					"ntotalrushnum": 0,
					"ntotalreturnnum": 0,
					"ntotalestarmny": 0,
					"ntotalarmny": 0,
					"ntotalpaymny": 0,
					"norigsubmny": 0,
					"bbsendendflag": "",
					"bboutendflag": "",
					"bbinvoicendflag": "",
					"bbcostsettleflag": "",
					"bbarsettleflag": "",
					"bbsettleflag": "",
					"vclosereason": "",
					"barrangedflag": "",
					"narrangescornum": 0,
					"narrangepoappnum": 0,
					"narrangetoornum": 0,
					"narrangetoappnum": 0,
					"narrangemonum": 0,
					"narrangeponum": 0,
					"ntotalplonum": 0,
					"vbrevisereason": "",
					"frowstatus": 0,
					"ts": "",
					"srcts": "",
					"srcbts": "",
					"cmarbascalssid": 0,
					"cbrandid": 0,
					"dr": 0
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

