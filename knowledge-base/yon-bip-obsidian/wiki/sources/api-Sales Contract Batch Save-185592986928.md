---
title: "销售合同批量保存"
apiId: "1855929869288865793"
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

# 销售合同批量保存

>  请求方式	POST | Hybrid Cloud Integration (SD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/crm/openapi/imi/imiSaleContract/save
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
pk_ct_sale	string	否	否	销售合同
pk_org	long	否	否	销售组织
vbillcode	string	否	否	合同编码
ctname	string	否	否	合同名称
ctrantypeid	string	否	否	合同类型
vtrantypecode	string	否	否	合同类型编码
version	string	否	否	版本号
subscribedate	string	否	否	合同签订日期
valdate	string	否	否	计划生效日期
invallidate	string	否	否	计划终止日期
pk_customer	long	否	否	客户
personnelid	long	否	否	业务员
depid	long	否	否	部门
deliaddr	string	否	否	交货地点
corigcurrencyid	long	否	否	币种
ccurrencyid	long	否	否	本位币
nexchangerate	BigDecimal	否	否	折本汇率
ngroupexchgrate	BigDecimal	否	否	集团本位币汇率
nglobalexchgrate	BigDecimal	否	否	全局本位币汇率
cprojectid	long	否	否	项目
pk_payterm	string	否	否	收款协议
fstatusflag	short	否	否	合同状态
ninvctlstyle	string	否	否	物料控制方式
norigpshamount	BigDecimal	否	否	累计收款总额
ntotalgpamount	BigDecimal	否	否	累计本币收款总额
ntotalastnum	BigDecimal	否	否	总数量
ntotalorigmny	BigDecimal	否	否	价税合计
pk_group	string	否	否	集团
cbilltypecode	string	否	否	单据类型
cbilltypecodename	string	否	否	单据类型名称
modifystatus	short	否	否	变更状态
actualvalidate	string	否	否	合同生效日期
pk_origct	string	否	否	原始主键
actualinvalidate	string	否	否	实际终止日期
dbilldate	string	否	否	单据日期
billmaker	string	否	否	制单人
dmakedate	string	否	否	制单日期
approver	string	否	否	审核人
taudittime	string	否	否	审核日期
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
ts	DateTime	否	否	ts
dr	short	否	否	dr
detail	object	是	否	合同明细

## 3. 请求示例

Url: /yonbip/crm/openapi/imi/imiSaleContract/save?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_ct_sale": "",
			"pk_org": 0,
			"vbillcode": "",
			"ctname": "",
			"ctrantypeid": "",
			"vtrantypecode": "",
			"version": "",
			"subscribedate": "",
			"valdate": "",
			"invallidate": "",
			"pk_customer": 0,
			"personnelid": 0,
			"depid": 0,
			"deliaddr": "",
			"corigcurrencyid": 0,
			"ccurrencyid": 0,
			"nexchangerate": 0,
			"ngroupexchgrate": 0,
			"nglobalexchgrate": 0,
			"cprojectid": 0,
			"pk_payterm": "",
			"fstatusflag": 0,
			"ninvctlstyle": "",
			"norigpshamount": 0,
			"ntotalgpamount": 0,
			"ntotalastnum": 0,
			"ntotalorigmny": 0,
			"pk_group": "",
			"cbilltypecode": "",
			"cbilltypecodename": "",
			"modifystatus": 0,
			"actualvalidate": "",
			"pk_origct": "",
			"actualinvalidate": "",
			"dbilldate": "",
			"billmaker": "",
			"dmakedate": "",
			"approver": "",
			"taudittime": "",
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
			"dr": 0,
			"detail": [
				{
					"pk_ct_sale_b": "",
					"crowno": "",
					"pk_marbasclass": 0,
					"pk_material": 0,
					"castunitid": 0,
					"cunitid": 0,
					"cqtunitid": 0,
					"vchangerate": "",
					"nastnum": 0,
					"nnum": 0,
					"nqtorigprice": 0,
					"nqtorigtaxprice": 0,
					"norigmny": 0,
					"ntaxrate": 0,
					"ntax": 0,
					"ftaxtypeflag": "",
					"norigtaxmny": 0,
					"noritotalgpmny": 0,
					"pk_financeorg": 0,
					"vmemo": "",
					"norigprice": 0,
					"norigtaxprice": 0,
					"ngprice": 0,
					"ngtaxprice": 0,
					"nqtunitnum": 0,
					"vqtunitrate": "",
					"nqtprice": 0,
					"nqttaxprice": 0,
					"nmny": 0,
					"ntaxmny": 0,
					"ctaxcodeid": 0,
					"ncaltaxmny": 0,
					"ngroupmny": 0,
					"ngrouptaxmny": 0,
					"nglobalmny": 0,
					"nglobaltaxmny": 0,
					"nordnum": 0,
					"nordsum": 0,
					"ntotalgpmny": 0,
					"cqualitylevelid": "",
					"cproductorid": "",
					"cbvendor": 0,
					"cbprojectid": 0,
					"ctranspmodeid": 0,
					"cdevareaid": "",
					"pk_arrvstoorg": "",
					"pk_receiveaddress": "",
					"cdevaddrid": "",
					"delivdate": "",
					"pk_org": 0,
					"pk_group": "",
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
					"brand": 0,
					"ts": "",
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

