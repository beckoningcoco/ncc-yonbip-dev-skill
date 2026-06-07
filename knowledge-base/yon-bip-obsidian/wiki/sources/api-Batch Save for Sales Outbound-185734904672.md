---
title: "销售出库批量保存"
apiId: "1857349046729441286"
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

# 销售出库批量保存

>  请求方式	POST | Hybrid Cloud Integration (SD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/crm/openapi/imi/imiSaleOut/save
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
pk_group	string	否	否	集团
corpoid	long	否	否	公司
pk_org	long	否	否	库存组织
cgeneralhid	string	否	否	出库单表头主键
vbillcode	string	否	否	单据号
dbilldate	string	否	否	单据日期
cwarehouseid	long	否	否	仓库
cbiztype	string	否	否	业务流程
ctrantypeid	string	否	否	出入库类型
vtrantypecode	string	否	否	出入库类型编码
csaleorgoid	long	否	否	销售组织
cwhsmanagerid	long	否	否	库管员
cbizid	long	否	否	业务员
cdptid	long	否	否	部门
ccustomerid	long	否	否	订单客户
ntotalnum	BigDecimal	否	否	总数量
ntotalweight	BigDecimal	否	否	总重量
ntotalvolume	BigDecimal	否	否	总体积
ntotalpiece	BigDecimal	否	否	总件数
pk_measware	string	否	否	计量器具
ctrancustid	long	否	否	承运商
cdilivertypeid	long	否	否	运输方式
vdiliveraddress	string	否	否	运输地址
freplenishflag	string	否	否	销售退货
boutretflag	string	否	否	销售退回
fbillflag	int	否	否	单据状态
vdef1	string	否	否	表头自定义项1
vdef2	string	否	否	表头自定义项2
vdef3	string	否	否	表头自定义项3
vdef4	string	否	否	表头自定义项4
vdef5	string	否	否	表头自定义项5
vdef6	string	否	否	表头自定义项6
vdef7	string	否	否	表头自定义项7
vdef8	string	否	否	表头自定义项8
vdef9	string	否	否	表头自定义项9
vdef10	string	否	否	表头自定义项10
vdef11	string	否	否	表头自定义项11
vdef12	string	否	否	表头自定义项12
vdef13	string	否	否	表头自定义项13
vdef14	string	否	否	表头自定义项14
vdef15	string	否	否	表头自定义项15
vdef16	string	否	否	表头自定义项16
vdef17	string	否	否	表头自定义项17
vdef18	string	否	否	表头自定义项18
vdef19	string	否	否	表头自定义项19
vdef20	string	否	否	表头自定义项20
vnote	string	否	否	备注
ts	string	否	否	ts
billmaker	string	否	否	制单人
dmakedate	string	否	否	制单日期
approver	string	否	否	签字人
taudittime	string	否	否	签字日期
icSaleOutB	object	是	否	销售出库单表体
dr	short	否	否	dr

## 3. 请求示例

Url: /yonbip/crm/openapi/imi/imiSaleOut/save?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_group": "",
			"corpoid": 0,
			"pk_org": 0,
			"cgeneralhid": "",
			"vbillcode": "",
			"dbilldate": "",
			"cwarehouseid": 0,
			"cbiztype": "",
			"ctrantypeid": "",
			"vtrantypecode": "",
			"csaleorgoid": 0,
			"cwhsmanagerid": 0,
			"cbizid": 0,
			"cdptid": 0,
			"ccustomerid": 0,
			"ntotalnum": 0,
			"ntotalweight": 0,
			"ntotalvolume": 0,
			"ntotalpiece": 0,
			"pk_measware": "",
			"ctrancustid": 0,
			"cdilivertypeid": 0,
			"vdiliveraddress": "",
			"freplenishflag": "",
			"boutretflag": "",
			"fbillflag": 0,
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
			"vnote": "",
			"ts": "",
			"billmaker": "",
			"dmakedate": "",
			"approver": "",
			"taudittime": "",
			"icSaleOutB": [
				{
					"crowno": "",
					"pk_group": "",
					"cgeneralbid": "",
					"cgeneralhid": "",
					"cmaterialvid": 0,
					"cmaterialname": "",
					"corpoid": 0,
					"materialspec": "",
					"materialtype": "",
					"pk_org": 0,
					"cbodywarehouseid": 0,
					"cunitid": 0,
					"castunitid": 0,
					"vchangerate": "",
					"vbatchcode": "",
					"nshouldassistnum": 0,
					"nshouldnum": 0,
					"nassistnum": 0,
					"nnum": 0,
					"ncostprice": 0,
					"ncostmny": 0,
					"dbizdate": "",
					"flargess": true,
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
					"cstateid": "",
					"cproductorid": "",
					"cqualitylevelid": "",
					"cvendorid": 0,
					"cprojectid": 0,
					"dproducedate": "",
					"dvalidate": "",
					"vqtunitrate": "",
					"vserialcode": "",
					"casscustid": 0,
					"nweight": 0,
					"nvolume": 0,
					"npiece": 0,
					"creceiveareaid": "",
					"creceivepointid": "",
					"vreceiveaddress": "",
					"corigcurrencyid": 0,
					"ctaxcodeid": 0,
					"ntaxrate": 0,
					"norigprice": 0,
					"norigtaxprice": 0,
					"norignetprice": 0,
					"norigtaxnetprice": 0,
					"nprice": 0,
					"ntaxprice": 0,
					"nnetprice": 0,
					"ntaxnetprice": 0,
					"cqtunitid": 0,
					"nqtunitnum": 0,
					"nqtorigprice": 0,
					"nqtorigtaxprice": 0,
					"nqtorignetprice": 0,
					"nqtorigtaxnetprice": 0,
					"nqtprice": 0,
					"nqttaxprice": 0,
					"nqtnetprice": 0,
					"nqttaxnetprice": 0,
					"norigmny": 0,
					"norigtaxmny": 0,
					"nmny": 0,
					"ntaxmny": 0,
					"ntax": 0,
					"ngroupexchgrate": 0,
					"ngrouptaxmny": 0,
					"nglobalexchgrate": 0,
					"ngroupmny": 0,
					"nglobalmny": 0,
					"nglobaltaxmny": 0,
					"nplannedprice": 0,
					"nplannedmny": 0,
					"cinvoicecustid": 0,
					"fbillrowflag": 0,
					"bonroadflag": "",
					"vvehiclecode": "",
					"vtransfercode": "",
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
					"ngrossnum": 0,
					"pk_returnreason": "",
					"ccurrencyid": 0,
					"nchangestdrate": 0,
					"naccumwastnum": 0,
					"btranendflag": 0,
					"ntotaltrannum": 0,
					"nsignnum": 0,
					"nrushnum": 0,
					"naccumoutbacknum": 0,
					"naccumoutsignnum": 0,
					"ncorrespondnum": 0,
					"ncorrespondastnum": 0,
					"ncorrespondgrsnum": 0,
					"ntarenum": 0,
					"ninvoicenum": 0,
					"cbodytranstypecode": "",
					"csourcematerialoid": 0,
					"badvfeeflag": true,
					"bcloseordflag": 0,
					"ts": "",
					"nreplenishednum": 0,
					"ncaltaxmny": 0,
					"ftaxtypeflag": "",
					"pk_marbasclass": 0,
					"brand": 0,
					"dr": 0,
					"cprodlineid": 0
				}
			],
			"dr": 0
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

