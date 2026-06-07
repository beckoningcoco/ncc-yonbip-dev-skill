---
title: "销售合同详情查询（YonBIP_BIPPremium）"
apiId: "2076941361545740292"
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

# 销售合同详情查询（YonBIP_BIPPremium）

>  请求方式	POST | Hybrid Cloud Integration (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bippremium/api/uapbd/salecontract/getQueryById
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
id	string	否	否	销售合同ID
pk_org	string	否	否	销售组织
pk_customer	string	否	否	客户
customer_code	string	否	否	客户编码
cmaterialvid	string	否	否	商品
cmaterialvcode	string	否	否	商品编码
depid	string	否	否	部门
personnelid	string	否	否	业务员
ccurrencyid	string	否	否	币种
pk_marbasclass	string	否	否	物料分类
pk_material	string	否	否	物料
castunitid	string	否	否	单位
ctaxcodeid	string	否	否	税码
pk_financeorg	string	否	否	财务组织
pk_balatype	string	否	否	结算方式
pk_payterm	string	否	否	收款协议
vbillcode	string	否	否	合同编码
subscribedate	string	否	否	合同签订日期
dmakedate	string	否	否	制单日期
cunitid	string	否	否	主单位
isSum	number
小数位数:0,最大长度:20	否	否	是否查明细
pageIndex	number
小数位数:0,最大长度:20	否	否	页码
pageSize	number
小数位数:0,最大长度:20	否	否	页大小
totalCount	number
小数位数:0,最大长度:38	否	否	总条数

## 3. 请求示例

Url: /yonbip/crm/bippremium/api/uapbd/salecontract/getQueryById?access_token=访问令牌
Body: [{
	"id": "",
	"pk_org": "",
	"pk_customer": "",
	"customer_code": "",
	"cmaterialvid": "",
	"cmaterialvcode": "",
	"depid": "",
	"personnelid": "",
	"ccurrencyid": "",
	"pk_marbasclass": "",
	"pk_material": "",
	"castunitid": "",
	"ctaxcodeid": "",
	"pk_financeorg": "",
	"pk_balatype": "",
	"pk_payterm": "",
	"vbillcode": "",
	"subscribedate": "",
	"dmakedate": "",
	"cunitid": "",
	"isSum": 0,
	"pageIndex": 0,
	"pageSize": 0,
	"totalCount": 0
}]

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
pk_org	string	否	销售组织
vbillcode	string	否	合同编码
ctname	string	否	合同名称
ctrantypeid	string	否	合同类型
vtrantypecode	string	否	合同类型编码
version	number
小数位数:8,最大长度:64	否	版本号
subscribedate	string	否	合同签订日期
valdate	string	否	计划生效日期
invallidate	string	否	计划终止日期
pk_customer	string	否	客户
personnelid	string	否	人员
depid	string	否	部门
deliaddr	string	否	交货地点
corigcurrencyid	string	否	币种
ccurrencyid	string	否	本位币
nexchangerate	number
小数位数:8,最大长度:64	否	折本汇率
ngroupexchgrate	number
小数位数:8,最大长度:64	否	集团本位币汇率
nglobalexchgrate	number
小数位数:8,最大长度:64	否	全局本位币汇率
cprojectid	string	否	项目
pk_payterm	string	否	收款协议
fstatusflag	number
小数位数:0,最大长度:64	否	合同状态
ninvctlstyle	string	否	物料控制方式
norigpshamount	number
小数位数:8,最大长度:64	否	累计收款总额
ntotalgpamount	number
小数位数:8,最大长度:64	否	累计本币收款总额
ntotalastnum	number
小数位数:8,最大长度:64	否	总数量
ntotalorigmny	number
小数位数:8,最大长度:64	否	价税合计
pk_ct_sale	string	否	销售合同
pk_group	string	否	集团
cbilltypecode	string	否	单据类型
cbilltypecodename	string	否	单据类型名称
modifystatus	number
小数位数:0,最大长度:64	否	变更状态
actualvalidate	string	否	实际生效日期
pk_origct	string	否	原始主键
actualinvalidate	string	否	实际终止日期
dbilldate	string	否	单据日期
billmaker	string	否	制单人
dmakedate	string	否	制单日期
approver	string	否	审核人
taudittime	string	否	审核日期
ts	string	否	ts
dr	number
小数位数:0,最大长度:64	否	dr
vdef1	string	否	自定义项1
vdef2	string	否	自定义项2
vdef3	string	否	自定义项3
vdef4	string	否	自定义项4
vdef5	string	否	自定义项5
vdef6	string	否	自定义项6
vdef7	string	否	自定义项7
vdef8	string	否	自定义项8
vdef9	string	否	自定义项9
vdef10	string	否	自定义项10
vdef11	string	否	自定义项11
vdef12	string	否	自定义项12
vdef13	string	否	自定义项13
vdef14	string	否	自定义项14
vdef15	string	否	自定义项15
vdef16	string	否	自定义项16
vdef17	string	否	自定义项17
vdef18	string	否	自定义项18
vdef19	string	否	自定义项19
vdef20	string	否	自定义项20
saleContractInfo	object	是	合同基本
crowno	string	否	行号
pk_marbasclass	string	否	物料分类
pk_material	string	否	物料
castunitid	string	否	单位
nastnum	number
小数位数:8,最大长度:64	否	数量
materialspec	string	否	规格
materialtype	string	否	型号
vchangerate	string	否	换算率
cunitid	string	否	主单位
nnum	number
小数位数:8,最大长度:64	否	主数量
nqtorigprice	number
小数位数:8,最大长度:64	否	无税单价
nqtorigtaxprice	number
小数位数:8,最大长度:64	否	含税单价
norigmny	number
小数位数:8,最大长度:64	否	无税金额
ntaxrate	number
小数位数:8,最大长度:64	否	税率
ntax	number
小数位数:8,最大长度:64	否	税额
ftaxtypeflag	string	否	扣税类别
norigtaxmny	number
小数位数:8,最大长度:64	否	价税合计
noritotalgpmny	number
小数位数:8,最大长度:64	否	累计收款金额
pk_financeorg	string	否	财务组织
vmemo	string	否	备注
norigprice	number
小数位数:8,最大长度:64	否	主无税单价
norigtaxprice	number
小数位数:8,最大长度:64	否	主含税单价
ngprice	number
小数位数:8,最大长度:64	否	主本币无税单价
ngtaxprice	number
小数位数:8,最大长度:64	否	主本币含税单价
cqtunitid	string	否	报价单位
nqtunitnum	number
小数位数:8,最大长度:64	否	报价数量
vqtunitrate	string	否	报价换算率
nqtprice	number
小数位数:8,最大长度:64	否	本币无税单价
nqttaxprice	number
小数位数:8,最大长度:64	否	本币含税单价
nmny	number
小数位数:8,最大长度:64	否	本币无税金额
ntaxmny	number
小数位数:8,最大长度:64	否	本币价税合计
ctaxcodeid	string	否	税码
ncaltaxmny	number
小数位数:8,最大长度:64	否	计税金额
ngroupmny	number
小数位数:8,最大长度:64	否	集团本币无税金额
ngrouptaxmny	number
小数位数:8,最大长度:64	否	集团本币价税合计
nglobalmny	number
小数位数:8,最大长度:64	否	全局本币无税金额
nglobaltaxmny	number
小数位数:8,最大长度:64	否	全局本币价税合计
nordnum	number
小数位数:8,最大长度:64	否	累计订单主数量
nordsum	number
小数位数:8,最大长度:64	否	累计订单价税合计
ntotalgpmny	number
小数位数:8,最大长度:64	否	累计本币收款金额
cqualitylevelid	string	否	质量等级
cproductorid	string	否	生产厂商
cbvendor	string	否	供应商
cbprojectid	string	否	项目
ctranspmodeid	string	否	运输方式
cdevareaid	string	否	收货地区
pk_arrvstoorg	string	否	收货单位
pk_receiveaddress	string	否	收货地址
cdevaddrid	string	否	收货地点
delivdate	string	否	计划收发货日期
ts	string	否	ts
dr	number
小数位数:0,最大长度:64	否	dr
pk_ct_sale_b	string	否	合同基本主键
pk_org	string	否	销售组织
pk_group	string	否	集团
pk_ct_sale	string	否	销售合同主键
vbdef1	string	否	自定义项1
vbdef2	string	否	自定义项2
vbdef3	string	否	自定义项3
vbdef4	string	否	自定义项4
vbdef5	string	否	自定义项5
vbdef6	string	否	自定义项6
vbdef7	string	否	自定义项7
vbdef8	string	否	自定义项8
vbdef9	string	否	自定义项9
vbdef10	string	否	自定义项10
vbdef11	string	否	自定义项11
vbdef12	string	否	自定义项12
vbdef13	string	否	自定义项13
vbdef14	string	否	自定义项14
vbdef15	string	否	自定义项15
vbdef16	string	否	自定义项16
vbdef17	string	否	自定义项17
vbdef18	string	否	自定义项18
vbdef19	string	否	自定义项19
vbdef20	string	否	自定义项20
vfree1	string	否	自由辅助属性1
vfree2	string	否	自由辅助属性2
vfree3	string	否	自由辅助属性3
vfree4	string	否	自由辅助属性4
vfree5	string	否	自由辅助属性5
vfree6	string	否	自由辅助属性6
vfree7	string	否	自由辅助属性7
vfree8	string	否	自由辅助属性8
vfree9	string	否	自由辅助属性9
vfree10	string	否	自由辅助属性10
pk_brand	string	否	品牌

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pk_org": "",
		"vbillcode": "",
		"ctname": "",
		"ctrantypeid": "",
		"vtrantypecode": "",
		"version": 0,
		"subscribedate": "",
		"valdate": "",
		"invallidate": "",
		"pk_customer": "",
		"personnelid": "",
		"depid": "",
		"deliaddr": "",
		"corigcurrencyid": "",
		"ccurrencyid": "",
		"nexchangerate": 0,
		"ngroupexchgrate": 0,
		"nglobalexchgrate": 0,
		"cprojectid": "",
		"pk_payterm": "",
		"fstatusflag": 0,
		"ninvctlstyle": "",
		"norigpshamount": 0,
		"ntotalgpamount": 0,
		"ntotalastnum": 0,
		"ntotalorigmny": 0,
		"pk_ct_sale": "",
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
		"ts": "",
		"dr": 0,
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
		"saleContractInfo": [
			{
				"crowno": "",
				"pk_marbasclass": "",
				"pk_material": "",
				"castunitid": "",
				"nastnum": 0,
				"materialspec": "",
				"materialtype": "",
				"vchangerate": "",
				"cunitid": "",
				"nnum": 0,
				"nqtorigprice": 0,
				"nqtorigtaxprice": 0,
				"norigmny": 0,
				"ntaxrate": 0,
				"ntax": 0,
				"ftaxtypeflag": "",
				"norigtaxmny": 0,
				"noritotalgpmny": 0,
				"pk_financeorg": "",
				"vmemo": "",
				"norigprice": 0,
				"norigtaxprice": 0,
				"ngprice": 0,
				"ngtaxprice": 0,
				"cqtunitid": "",
				"nqtunitnum": 0,
				"vqtunitrate": "",
				"nqtprice": 0,
				"nqttaxprice": 0,
				"nmny": 0,
				"ntaxmny": 0,
				"ctaxcodeid": "",
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
				"cbvendor": "",
				"cbprojectid": "",
				"ctranspmodeid": "",
				"cdevareaid": "",
				"pk_arrvstoorg": "",
				"pk_receiveaddress": "",
				"cdevaddrid": "",
				"delivdate": "",
				"ts": "",
				"dr": 0,
				"pk_ct_sale_b": "",
				"pk_org": "",
				"pk_group": "",
				"pk_ct_sale": "",
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
				"pk_brand": ""
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
暂时没有数据哦~

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

