---
title: "环保税税源信息-编辑"
apiId: "2250574803183861763"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Related Data Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Related Data Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 环保税税源信息-编辑

>  请求方式	POST | Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxoth/api/ept/base/b/edit
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
taxSourceNo	string	否	否	局端税源编号 示例：TS000001
polluPerNo	string	否	否	排污许可证编号 示例：PPN8888888888
ventNo	string	否	否	排放口编号 示例：VNO999999 默认值：无
ventName	string	否	否	排放口名称或噪声源名称 示例：VNAME排污口
productMarkLocated	string	否	否	生产经营所在街乡，按期必填 示例：北京市海淀区北清路108号
ventLongitudeDegree	number
小数位数:0,最大长度:3	否	否	排放口地理坐标-经度-度，按期录入排放口编号的情况下必填 示例：11
ventLongitudeBranch	number
小数位数:0,最大长度:2	否	否	排放口地理坐标-经度-分，按期录入排放口编号的情况下必填 示例：12
ventLongitudeSecond	number
小数位数:2,最大长度:4	否	否	排放口地理坐标-经度-秒，按期录入排放口编号的情况下必填 示例：3
ventLatitudeDegree	number
小数位数:0,最大长度:2	否	否	排放口地理坐标-纬度-度，按期录入排放口编号的情况下必填 示例：13
ventLatitudeBranch	number
小数位数:0,最大长度:2	否	否	排放口地理坐标-纬度-分，按期录入排放口编号的情况下必填 示例：23
ventLatitudeSecond	number
小数位数:2,最大长度:4	否	否	排放口地理坐标-纬度-秒，按期录入排放口编号的情况下必填 示例：4
startTime	date
格式:yyyy-MM-dd	否	否	税源有效期起，按期必填 示例：2023-01-01
endTime	date
格式:yyyy-MM-dd	否	否	税源有效期止，按期必填 示例：2099-12-31
firstTypeCode	string	否	是	污染物类别编码（第一类编码） 示例：A
secondTypeCode	string	否	否	水污染物种类编码（第二类编码）
pollutantsCode	string	否	否	污染物编码 示例：101211101
taxSubheadingCode	string	否	否	征收子目编码 示例：HB04300383100101
unitTax	number
小数位数:8,最大长度:21	否	否	单位税额 示例：1.25
disAmnReckon	string	否	否	污染物排放量计算方法（1-自动监测；2-监测机构监测；3-物料衡算；4-排污系数；5-抽样测算），按期大气和水必填 示例：1
standard	string	否	否	执行标准，针对大气和水污染物 示例：GB 16297-1996
standardValue	number
小数位数:8,最大长度:21	否	否	标准浓度值（毫克/升或毫克/标立方米），针对大气和水污染物 示例：3
taxBaseUnit	string	否	否	大气/水污染物-计税基数单位
pollutantUnit	string	否	否	大气/水污染物-污染物单位（t-吨，kg-千克，g-克，mg-毫克） 示例：kg
pollutionCoefficient	number
小数位数:8,最大长度:21	否	否	大气/水污染物-产污系数 示例：4.89
dischargeCoefficient	number
小数位数:8,最大长度:21	否	否	大气/水污染物-排污系数 示例：5.66
storage	string	否	否	贮存情况，针对固体污染物 示例：贮存100
disposal	string	否	否	处置情况，针对固体污染物 示例：处置90
comprehensiveUse	string	否	否	综合利用情况，针对固体污染物 示例：1
noiseSourceLocation	string	否	否	噪声源位置，针对噪声污染物 示例：西南噪声位置
ribbonType	string	否	否	功能区类型(0:0类、1:1类、2:2类、3:3类、4:4a类、5:4b类)，针对噪声污染物 示例：4
bdayNightProduct	string	否	否	是否昼夜产生(Y:是、N:否)，针对噪声污染物 示例：Y
standardLimitNight	number
小数位数:2,最大长度:8	否	否	标准限值-昼间（6时至22时），针对噪声污染物 示例：3.77
standardLimitDay	number
小数位数:2,最大长度:8	否	否	标准限值-夜间（22时至次日6时），针对噪声污染物 示例：6.56
busiId	string	否	是	税源明细来源ID 示例：2252984657815273480
busiCode	string	否	否	税源明细来源编号 示例：0952abcf1bfb53eda535a7de22d419b2

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/ept/base/b/edit?access_token=访问令牌
Body: [{
	"taxSourceNo": "TS000001",
	"polluPerNo": "PPN8888888888",
	"ventNo": "VNO999999",
	"ventName": "VNAME排污口",
	"productMarkLocated": "北京市海淀区北清路108号",
	"ventLongitudeDegree": 11,
	"ventLongitudeBranch": 12,
	"ventLongitudeSecond": 3,
	"ventLatitudeDegree": 13,
	"ventLatitudeBranch": 23,
	"ventLatitudeSecond": 4,
	"startTime": "2023-01-01",
	"endTime": "2099-12-31",
	"firstTypeCode": "A",
	"secondTypeCode": "",
	"pollutantsCode": "101211101",
	"taxSubheadingCode": "HB04300383100101",
	"unitTax": 1.25,
	"disAmnReckon": "1",
	"standard": "GB 16297-1996",
	"standardValue": 3,
	"taxBaseUnit": "",
	"pollutantUnit": "kg",
	"pollutionCoefficient": 4.89,
	"dischargeCoefficient": 5.66,
	"storage": "贮存100",
	"disposal": "处置90",
	"comprehensiveUse": "1",
	"noiseSourceLocation": "西南噪声位置",
	"ribbonType": "4",
	"bdayNightProduct": "Y",
	"standardLimitNight": 3.77,
	"standardLimitDay": 6.56,
	"busiId": "2252984657815273480",
	"busiCode": "0952abcf1bfb53eda535a7de22d419b2"
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
code	string	否	状态码 示例：200
message	string	否	提示信息 示例：操作成功

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
9999	系统异常	错误提示信息

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-15	
更新
请求说明
更新
请求参数 ventLongitudeDegree
更新
请求参数 ventLatitudeDegree
更新
请求参数 dischargeCoefficient
	2	2025-09-30	
新增
请求参数 (4)
更新
请求参数 taxSourceNo
	3	2025-09-03	
新增
请求参数 (4)
更新
请求参数 taxSourceNo
	4	2025-05-23	
更新
请求参数 disAmnReckon
更新
请求参数 ribbonType
	5	2025-05-22	
更新
请求参数 taxSourceNo
	6	2025-05-12	
更新
请求参数 startTime
更新
请求参数 endTime

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

