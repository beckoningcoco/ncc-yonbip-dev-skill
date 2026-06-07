---
title: "合同涉税信息-编辑非框架合同信息及契税税源信息（废弃）"
apiId: "2029719098093993986"
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

# 合同涉税信息-编辑非框架合同信息及契税税源信息（废弃）

>  请求方式	POST | Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/contract/edit-contract-deed
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
code	string	否	是	合同编号 示例：hecode
name	string	否	是	合同名称 示例：合同名称
diworkProjectCode	string	否	否	项目编码 示例：AD1
sisNonTaxContract	string	否	是	是否不征税合同 示例：Y
isContainsTax	string	否	是	含税金额计税 示例：Y
signDate	string	否	是	合同签订日期 示例：2023-01-01
validDate	string	否	否	合同生效日期 示例：2023-01-01
terminationDate	string	否	否	合同终止日期 示例：2023-01-01
paymentType	string	否	否	收支类型 示例：1
contractTypeCode	string	否	否	合同类型编码 示例：0011
contractLegalCode	string	否	否	合同法律类别 示例：112233
billTypeCode	string	否	否	单据类型编码 示例：0011
transTypeCode	string	否	否	交易类型编码 示例：0011
stampTaxItem	string	否	是	印花税税目 示例：05_024
stampSubItem	string	否	是	印花税子目 示例：05_024_02
relativeName	string	否	否	合同相对方名称 示例：相对方的名称
relativeNsrsbh	string	否	否	合同相对方税号 示例：123214
amount	number
小数位数:0,最大长度:15	否	否	合同金额（含税） 示例：98
amountExcludingTax	number
小数位数:0,最大长度:15	否	否	合同金额（不含税） 示例：100
contractOriginId	string	否	否	合同来源的id 示例：12345678910
orgCode	string	否	是	组织编码 示例：hehehe
houseAccountCode	string	否	否	房产税源编码 示例：FCSY123
landCode	string	否	否	土地税源编码 示例：TDSY123
realEstateUnitCode	string	否	否	不动产单元号（只能输入字母和数） 示例：FW
eleRegulatoryNumber	string	否	否	电子监管号（只能输入字母和数） 示例：FW
realEstateNumber	string	否	否	不动产权证书号（只能输入字母和数） 示例：FW
hillockNumber	string	否	否	丘号 示例：FW
serviceNumber	string	否	否	业务编号 示例：FW
province	string	否	是	省 示例：北京市
city	string	否	是	市 示例：市辖区
area	string	否	是	区 示例：海淀区
town	string	否	是	城镇地区 示例：万寿路街道
houseLocation	string	否	是	详细地址 示例：详细地址1234
taxOffice	string	否	否	主管税务机关 示例：国家税务总局福建福安经济开发区税务局
ownershipTransferArea	number
小数位数:2,最大长度:15	否	是	权属转移面积 示例：12
registrationDate	string	否	否	权属登记日期(yyyy-MM-dd) 示例：2024-01-01
taxOwnershipTransferObject	string	否	是	权属转移对象,枚举,{CLFFZF:存量房-非住房,GYTD:国有土地,ZLFZF:增量房-住房,JTTD:集体土地,ZLFFZF:增量房-非住房,CLFZF:存量房-住房} 示例：ZLFZF
ownershipTransferMode	string	否	是	权属转移方式,枚举,{CS:出售(包括作价投资入股、偿还债务等应交付经济利益的方式),HH:互换,MM:买卖(包括作价投资入股、偿还债务等应交付经济利益的方式),CR:出让,ZY:赠与(包括以奖励、划转、继承等没有价格的方式)}, 示例：HH
transferOwnershipUse	string	否	是	权属转移用途,枚举,{ZZYD:住宅用地,FZZYD:非住宅用地,FJZYF:非居住用房,JZYF:居住用房} 示例：FJZYF
houseType	string	否	否	房屋类型,枚举,{0:住宅,1:商业用房,2:办公用房,3:工业用房,4:仓储用房,5:车库,6:其他} 示例：1
commonOwnership	string	否	是	共有方式,枚举,{GTSY:共同共有,DDSY:单独所有,AFGY:按份共有} 示例：GTSY
invoiceTaxRate	string	否	否	购房发票增值税税率,枚举,{5:5%,9:9%} 示例：5
taxPeriodStart	string	否	是	税款所属期起(yyyy-MM-dd) 示例：2024-06-02
deedCollectionItem	string	否	否	征收品目 示例：税目
subItem	string	否	否	征收子目 示例：子目
otherCost	number
小数位数:2,最大长度:15	否	否	城市基础设施配套费等其他款项 示例：1
evaluationPrice	number
小数位数:2,最大长度:15	否	否	评估价格 示例：1
transactionPrice	number
小数位数:2,最大长度:15	否	是	成交价格 示例：1
taxBasis	number
小数位数:2,最大长度:15	否	是	计税依据 示例：1
taxExemptionName	string	否	否	减免税政策名称 示例：子目
taxSavings	number
小数位数:2,最大长度:15	否	否	减免税额 示例：12
JointOwnerInformationList	object	是	否	共有人信息
currentTaxpayer	string	否	是	是否是当前纳税人,枚举,{Y:是,N:否} 示例：Y
gmfnsrsbh	string	否	是	纳税人识别号 示例：5237030122
gmfmc	string	否	是	纳税人名称
gmfCertificateType	string	否	是	证件类型,枚举,{HZ:护照,SFZ:居民身份证,YYZZ:营业执照,SWDJZ:税务登记证,ZZJGDMZ:组织机构代码证,QTDWZJ:其他单位证件} 示例：YYZZ
gmfNationality	string	否	是	国籍 示例：中华人民共和国
proportion	number
小数位数:2,最大长度:5	否	是	所占份额 示例：50
houseCode	string	否	否	房屋套次,枚举,{0:家庭唯一住房,1:家庭唯二住房,2:其他} 示例：0
maritalStatus	string	否	否	婚姻状况,枚举,{0:未婚,1:已婚,2:初婚,3:再婚,4:复婚,5:丧偶,6:离婚,7:未说明的婚姻状况} 示例：7
phone	string	否	是	联系电话 示例：11111111111

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/contract/edit-contract-deed?access_token=访问令牌
Body: {
	"code": "hecode",
	"name": "合同名称",
	"diworkProjectCode": "AD1",
	"sisNonTaxContract": "Y",
	"isContainsTax": "Y",
	"signDate": "2023-01-01",
	"validDate": "2023-01-01",
	"terminationDate": "2023-01-01",
	"paymentType": "1",
	"contractTypeCode": "0011",
	"contractLegalCode": "112233",
	"billTypeCode": "0011",
	"transTypeCode": "0011",
	"stampTaxItem": "05_024",
	"stampSubItem": "05_024_02",
	"relativeName": "相对方的名称",
	"relativeNsrsbh": "123214",
	"amount": 98,
	"amountExcludingTax": 100,
	"contractOriginId": "12345678910",
	"orgCode": "hehehe",
	"houseAccountCode": "FCSY123",
	"landCode": "TDSY123",
	"realEstateUnitCode": "FW",
	"eleRegulatoryNumber": "FW",
	"realEstateNumber": "FW",
	"hillockNumber": "FW",
	"serviceNumber": "FW",
	"province": "北京市",
	"city": "市辖区",
	"area": "海淀区",
	"town": "万寿路街道",
	"houseLocation": "详细地址1234",
	"taxOffice": "国家税务总局福建福安经济开发区税务局",
	"ownershipTransferArea": 12,
	"registrationDate": "2024-01-01",
	"taxOwnershipTransferObject": "ZLFZF",
	"ownershipTransferMode": "HH",
	"transferOwnershipUse": "FJZYF",
	"houseType": "1",
	"commonOwnership": "GTSY",
	"invoiceTaxRate": "5",
	"taxPeriodStart": "2024-06-02",
	"deedCollectionItem": "税目",
	"subItem": "子目",
	"otherCost": 1,
	"evaluationPrice": 1,
	"transactionPrice": 1,
	"taxBasis": 1,
	"taxExemptionName": "子目",
	"taxSavings": 12,
	"JointOwnerInformationList": [
		{
			"currentTaxpayer": "Y",
			"gmfnsrsbh": "5237030122",
			"gmfmc": "",
			"gmfCertificateType": "YYZZ",
			"gmfNationality": "中华人民共和国",
			"proportion": 50,
			"houseCode": "0",
			"maritalStatus": "7",
			"phone": "11111111111"
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
message	string	否	提示信息 示例：新增成功
datas	object	否	返回数据
contractCode	string	否	合同编码 示例：restfulToolkitX
isSuccess	boolean	否	是否保存成功 示例：true
errMsg	string	否	错误提示 示例：错误信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "新增成功",
	"datas": {
		"contractCode": "restfulToolkitX",
		"isSuccess": true,
		"errMsg": "错误信息"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
9999	未知错误	系统异常信息
1001	参数为空	参数为空或者单次导入大于1000条合同
8002	错误提示	提示生成印花税台账中不符合的字段报错信息

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-26	
更新
请求说明
更新
请求参数 (5)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

