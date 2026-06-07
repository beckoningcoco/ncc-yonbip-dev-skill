---
title: "根据企业名称获取核实基本信息"
apiId: "2267037283977789450"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Enterprise Portrait"
domain: "YYZDX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Enterprise Portrait]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据企业名称获取核实基本信息

>  请求方式	GET | Enterprise Portrait (YYZDX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/aipaas/intellid/api/data/getBaseInfoByName/{funcCode}
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
companyName	string	query	是	企业全称（必须全称）    示例: 用友网络科技股份有限公司
funcCode	string	path	是	用量编码，例如：ent_crm_find_custom（找客户)，ent_info_view （R5-企业详情）ent_detail_four_in_one （R6-企业详情）    示例: ent_info_view    默认值: ent_info_view

## 3. 请求示例

Url: /yonbip/aipaas/intellid/api/data/getBaseInfoByName/ent_info_view?access_token=访问令牌&companyName=%E7%94%A8%E5%8F%8B%E7%BD%91%E7%BB%9C%E7%A7%91%E6%8A%80%E8%82%A1%E4%BB%BD%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8

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
code	number
小数位数:0,最大长度:10	否	code 示例：200
data	object	否	data
id	number
小数位数:0,最大长度:10	否	旧id(不要使用） 示例：0
companyId	string	否	企业id(唯一) 示例：453f39c3ff19200a35dca3736951f6dc
name	string	否	企业名称 示例：用友网络科技股份有限公司
base	string	否	省份简称编码 示例：bj
legalPersonId	number
小数位数:0,最大长度:10	否	法人id(不要使用） 示例：0
legalPersonName	string	否	法人名称 示例：王文京
type	number
小数位数:0,最大长度:10	否	法人类型 1 人 2 公司 示例：1
typeName	string	否	法人类型显示值（空）
regNumber	string	否	注册号 示例：110000005119254
companyType	string	否	公司类型代码 示例：0
companyOrgType	string	否	公司类型 示例：其他股份有限公司(上市)
regLocation	string	否	注册地址 示例：北京市海淀区北清路68号
estiblishTime	string	否	成立日期 示例：1995-01-18
fromTime	string	否	营业期限开始日期 示例：1999-12-06
toTime	string	否	营业期限终止日期
businessScope	string	否	经营范围 示例：电子计算机软件、硬件及外部设备的技术开...
regInstitute	string	否	登记机关 示例：北京市海淀区市场监督管理局
approvedTime	string	否	核准日期 示例：2023-03-29
regStatus	string	否	企业状态 示例：存续
regStatusNorm	string	否	企业状态规范后的值 示例：存续
regCapital	string	否	注册资金 示例：343632.3835万人民币
actualCapital	string	否	实收注册资金 示例：288727.3835万人民币
orgNumber	string	否	组织机构代码 示例：60000176-0
orgApprovedInstitute	string	否	orgApprovedInstitute
listCode	string	否	上市代码 示例：600588
property1	string	否	统一社会信用代码 示例：91110000600001760P
property2	string	否	property2
property3	string	否	英文名 示例：Yonyou Network Technology Co., Ltd.
property4	string	否	纳税人识别号 示例：91110000600001760P
industry	string	否	赋值优先级：二级行业 > 一级行业 示例：软件服务
industry2	string	否	非上市企业：二级行业 上市企业：上市显示行业 示例：软件服务
industry1	string	否	一级行业 示例：信息传输、软件和信息技术服务业
industry3	string	否	三级行业 示例：软件开发
industry4	string	否	四级行业 示例：其他软件开发
historyNames	string	否	历史名城 示例：北京用友软件股份有限公司,用友软件股份有限公司
bondNum	string	否	股票号 示例：600588
bondName	string	否	股票名 示例：用友网络
socialStaffNum	string	否	参保人数 示例：6719
staffNumRange	string	否	人员规模 示例：24949
creditCode	string	否	统一社会信用代码 示例：91110000600001760P
contactTel	string	否	联系方式 示例：86396688
contactMobile	string	否	联系方式（contactTelk不一定一样） 示例：86396688
contactEmail	string	否	邮箱 示例：yonyou@yonyou.com
specialCorp	number
小数位数:0,最大长度:10	否	0 一般企业（默认） 事业单位 1 基金会 2 社会组织 3 事务所 4 中国开头的机构，或登记机关是国家的大学等 5 示例：0
baseName	string	否	省份名称 示例：北京市
businessTerm	string	否	营业期限 示例：1999-12-06 至 无固定期限
stockType	string	否	股票类型 示例：上交所主板A股
website	string	否	公司网址 示例：http://www.yonyou.com
introduction	string	否	公司简介 示例：用友网络科技股份有限公司创立于1988年,一直...
stockStatus	string	否	股票上市状态 示例：上市
dishonestTag	string	否	失信被执行人标签
specialType	string	否	特殊企业类型 示例：1
riskMonitor	object	否	风险监控
sameNameCompanys	object	是	同名企业
lng	string	否	经度 示例：116.250339
lat	string	否	纬度 示例：40.078041
cityName	string	否	城市名称 示例：北京市
provinceName	string	否	省份名称 示例：北京市
areaName	string	否	区域名称 示例：海淀区
logo	string	否	logo（暂无）
smeType	string	否	smeType
labels	string	否	labels标签
morePhone	string	否	morePhone
allLabelIds	string	是	allLabelIds标签 示例：["26","27","25"]
industryCode	string	否	行业编码 示例：I
cancelDate	string	否	注销日期
revokeDate	string	否	吊销日期
regionCode	string	否	行政区划编码 示例：11
registerCurrencyName	string	否	币种人民币， 美元， 欧元，港币，其他： 示例：人民币
registerCurrencyNum	string	否	注册资本数字-不转化币种 示例：3436323835.000
actualControl	string	否	疑似实际控制人（不返回，需要申请） 示例：王文京
actualControlPercent	string	否	控制比例 示例：37.3964%
annualRevenue	string	否	年营收 示例：852500万
taxType	string	否	纳税人资质 示例：一般纳税人
enterpriseRefType	string	否	企业映射类型：民营企业，地方政府，地方国企，中央企业，中央部委，其他 示例：民营企业
enterpriseScale	string	否	企业规模：小型企业，中型企业，大型企业 示例：大型企业
message	string	否	message 示例：执行成功

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"id": 0,
		"companyId": "453f39c3ff19200a35dca3736951f6dc",
		"name": "用友网络科技股份有限公司",
		"base": "bj",
		"legalPersonId": 0,
		"legalPersonName": "王文京",
		"type": 1,
		"typeName": "",
		"regNumber": "110000005119254",
		"companyType": "0",
		"companyOrgType": "其他股份有限公司(上市)",
		"regLocation": "北京市海淀区北清路68号",
		"estiblishTime": "1995-01-18",
		"fromTime": "1999-12-06",
		"toTime": "",
		"businessScope": "电子计算机软件、硬件及外部设备的技术开...",
		"regInstitute": "北京市海淀区市场监督管理局",
		"approvedTime": "2023-03-29",
		"regStatus": "存续",
		"regStatusNorm": "存续",
		"regCapital": "343632.3835万人民币",
		"actualCapital": "288727.3835万人民币",
		"orgNumber": "60000176-0",
		"orgApprovedInstitute": "",
		"listCode": "600588",
		"property1": "91110000600001760P",
		"property2": "",
		"property3": "Yonyou Network Technology Co., Ltd.",
		"property4": "91110000600001760P",
		"industry": "软件服务",
		"industry2": "软件服务",
		"industry1": "信息传输、软件和信息技术服务业",
		"industry3": "软件开发",
		"industry4": "其他软件开发",
		"historyNames": "北京用友软件股份有限公司,用友软件股份有限公司",
		"bondNum": "600588",
		"bondName": "用友网络",
		"socialStaffNum": "6719",
		"staffNumRange": "24949",
		"creditCode": "91110000600001760P",
		"contactTel": "86396688",
		"contactMobile": "86396688",
		"contactEmail": "yonyou@yonyou.com",
		"specialCorp": 0,
		"baseName": "北京市",
		"businessTerm": "1999-12-06 至 无固定期限",
		"stockType": "上交所主板A股",
		"website": "http://www.yonyou.com",
		"introduction": "用友网络科技股份有限公司创立于1988年,一直...",
		"stockStatus": "上市",
		"dishonestTag": "",
		"specialType": "1",
		"riskMonitor": {},
		"sameNameCompanys": [
			{}
		],
		"lng": "116.250339",
		"lat": "40.078041",
		"cityName": "北京市",
		"provinceName": "北京市",
		"areaName": "海淀区",
		"logo": "",
		"smeType": "",
		"labels": "",
		"morePhone": "",
		"allLabelIds": [
			"26",
			"27",
			"25"
		],
		"industryCode": "I",
		"cancelDate": "",
		"revokeDate": "",
		"regionCode": "11",
		"registerCurrencyName": "人民币",
		"registerCurrencyNum": "3436323835.000",
		"actualControl": "王文京",
		"actualControlPercent": "37.3964%",
		"annualRevenue": "852500万",
		"taxType": "一般纳税人",
		"enterpriseRefType": "民营企业",
		"enterpriseScale": "大型企业"
	},
	"message": "执行成功"
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

