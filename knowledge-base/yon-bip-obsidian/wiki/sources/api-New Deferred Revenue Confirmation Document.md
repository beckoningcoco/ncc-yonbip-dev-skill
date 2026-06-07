---
title: "递延收入确认单新增"
apiId: "1914585928422129665"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Deferred Revenue Recognition Document"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Deferred Revenue Recognition Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 递延收入确认单新增

> `ContentType	application/json` 请求方式	POST | 分类: Deferred Revenue Recognition Document (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/fiervn/rvnDeferRevenueBill/add

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 入参 |
| accountEntity_code | string | 否 | 否 | 会计主体编码(编码和id必输其一，同时输入id优先) 示例：XMHS-RMB |
| accountEntity | string | 否 | 否 | 会计主体(编码和id必输其一，同时输入id优先) 示例：187100245480145 |
| accBook_code | string | 否 | 否 | 账簿编码(编码和id必输其一，同时输入id优先) 示例：XMHS-RMB |
| accBook | string | 否 | 否 | 账簿(编码和id必输其一，同时输入id优先) 示例：187100245480145 |
| busType | string | 否 | 否 | 交易类型id(id和编码必输其一,同时输入,id优先) 示例：1570290767175352322 |
| busType_code | string | 否 | 否 | 交易类型编码(id和编码必输其一,同时输入,id优先) 示例：revenuebill |
| billDate | Date | 否 | 是 | 单据日期 示例：2023-09-20 |
| code | string | 否 | 否 | 单据编号(手动输入时必填) 示例：RRE20230918001351 |
| exchangeRateType | string | 否 | 否 | 汇率类型id |
| exchangeRateType_code | string | 否 | 否 | 汇率类型编码 |
| exchangeRateDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 汇率日期 示例：2024-01-30 |
| exchRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 汇率折算方式 示例：1:×,2:÷ |
| exchangeRate | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 汇率 示例：1.0 |
| extSrcSystems | string | 否 | 是 | 来源单据系统(外) 示例：外系统 |
| extSrcBillcode | string | 否 | 是 | 来源单据编码(外) 示例：REC01231110000452 |
| _status | string | 否 | 是 | 接口状态(Insert-新增） 示例：Insert 默认值：Insert |
| rvnDeferRevenueBillBodyList | object | 是 | 是 | 递延收入确认单子表 |

## 3. 请求示例

Url: /yonbip/EFI/fiervn/rvnDeferRevenueBill/add?access_token=访问令牌
Body: {
	"data": {
		"accountEntity_code": "XMHS-RMB",
		"accountEntity": "187100245480145",
		"accBook_code": "XMHS-RMB",
		"accBook": "187100245480145",
		"busType": "1570290767175352322",
		"busType_code": "revenuebill",
		"billDate": "2023-09-20",
		"code": "RRE20230918001351",
		"exchangeRateType": "",
		"exchangeRateType_code": "",
		"exchangeRateDate": "2024-01-30",
		"exchRateOps": NaN,
		"exchangeRate": 1,
		"extSrcSystems": "外系统",
		"extSrcBillcode": "REC01231110000452",
		"_status": "Insert",
		"rvnDeferRevenueBillBodyList": [
			{
				"conBillNo": "RECONRECON20230918007053",
				"conBaseinfoRowNo": 1,
				"expenseItem": "1587803487610077193",
				"expenseItemCode": "pols",
				"dept": "1525653687361339397",
				"deptCode": "bu1",
				"staff": "1563528487077150729",
				"staffCode": "00000001",
				"costCenter": "1580525167313420290",
				"costCenterCode": "010101001",
				"proCenter": "1525652227072458756",
				"proCenterCode": "pkm00",
				"oppProCenter": "1525652227072458756",
				"oppProCenterCode": "pkm00",
				"quantity": 7,
				"unit": "1528655706284097538",
				"unitCode": "HUR",
				"oriTaxIncludedAmount": 100,
				"accExchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"accExchangeRateTypeCode": "01",
				"exchangeRateDate": "2023-09-19",
				"exchRateOps": NaN,
				"accExchangeRate": 1,
				"extSrcSystems": "外系统",
				"extSrcBillNo": "REC01231110000452",
				"extSrcBilltypeCode": "rcl_contract",
				"extSrcTranstypeCode": "rcl_businessct",
				"extSrcBillId": "1867133222768869377",
				"extSrcBillRowId": "1867133222768869384",
				"extOriBilltypeCode": "rcl_contract",
				"extOriTranstypeCode": "rcl_businessct",
				"extOriBillNo": "REC01231110000452",
				"extOriBillId": "186713322276886937",
				"extOriBillRowId": "1867133222768869384",
				"_status": "Insert"
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 操作码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| total | long | 否 | 总条数 示例：1 |
| data | object | 否 | 返回值 |
| id | string | 否 | 主键 示例：1921211894732423169 |
| accountEntity | string | 否 | 会计主体 示例：1783771334923255818 |
| bustype | string | 否 | 交易类型 示例：1878783699409436673 |
| deferredConfirmPeriod | string | 否 | 递延收入确认期间 示例：1783771773010444298 |
| billDate | string | 否 | 单据日期 示例：2024-02-02 |
| code | string | 否 | 单据编码 示例：RDRE20240202000129 |
| verifyState | number |
| 小数位数:0,最大长度:1 | 否 | 单据状态 示例：0 |
| billType | string | 否 | 单据类型 示例：1878772953401262080 |
| customer | string | 否 | 客户 示例：1786923308336807937 |
| oriCurrency | string | 否 | 币种 示例：1783169601426161704 |
| oriTaxExcludedAmount | number |
| 小数位数:2,最大长度:10 | 否 | 无税金额 示例：100 |
| exchangeRateType | string | 否 | 汇率类型 示例：1783169601426164193 |
| exchangeRateDate | string | 否 | 汇率日期 示例：2024-02-03 |
| exchangeRate | number |
| 小数位数:2,最大长度:10 | 否 | 汇率 示例：1 |
| businessType | string | 否 | 业务类型 示例：1 |
| accTaxExcludedAmount | number |
| 小数位数:2,最大长度:10 | 否 | 本币无税金额 示例：100 |
| orgLocalCurrency | string | 否 | 组织币 示例：1783169601426161704 |
| orgConvertParam | string | 否 | 组织币折算参数 示例：1 |
| orgTaxExcludedAmount | number |
| 小数位数:2,最大长度:10 | 否 | 组织币无税金额 示例：100 |
| grpLocalCurrency | string | 否 | 集团币 示例：1783169601426161704 |
| grpConvertParam | string | 否 | 集团币折算参数 示例：3 |
| grpTaxExcludedAmount | number |
| 小数位数:2,最大长度:10 | 否 | 集团币无税金额 示例：100 |
| glbLocalCurrency | string | 否 | 全局币 示例：1783169601426161704 |
| glbConvertParam | string | 否 | 全局币折算参数 示例：1 |
| glbTaxExcludedAmount | number |
| 小数位数:2,最大长度:10 | 否 | 全局币无税金额 示例：100 |
| accConvertParam | string | 否 | 本币折算参数 示例：1 |
| conConvertParam | string | 否 | 合同币折算参数 示例：1 |
| conTaxExcludedAmount | number |
| 小数位数:2,最大长度:10 | 否 | 合同币无税金额 示例：100 |
| srcBillSystem | string | 否 | 来源单据系统 示例：1590898535657111552 |
| srcBillNo | string | 否 | 来源单据号 示例：RECON20240111002433 |
| srcBillType | string | 否 | 来源单据类型 示例：1570189715179044871 |
| srcTransType | string | 否 | 来源交易类型 示例：1783169601426164801 |
| srcBillId | string | 否 | 来源单据ID 示例：1905032306244976642 |
| extSrcSystems | string | 否 | 来源单据系统(外) 示例：extSrcSystems |
| dr | number |
| 小数位数:0,最大长度:1 | 否 | 删除标记 示例：0 |
| ytenantId | string | 否 | 租户 示例：0000LKQJBKJJE1K6PT0000 |
| pubts | string | 否 | 时间戳 示例：2024-02-02 15:21:42 |
| creator | string | 否 | 创建人 示例：00001951-7ca3-47ac-a462-d5a66e3e6724 |
| createTime | string | 否 | 创建时间 示例：2024-02-02 15:21:41 |
| isOpenApi | boolean | 否 | 是否openApi传入 示例：true |
| rvnDeferRevenueBillBodyList | object | 是 | 递延收入确认单子表 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"total": 1,
	"data": {
		"id": "1921211894732423169",
		"accountEntity": "1783771334923255818",
		"bustype": "1878783699409436673",
		"deferredConfirmPeriod": "1783771773010444298",
		"billDate": "2024-02-02",
		"code": "RDRE20240202000129",
		"verifyState": 0,
		"billType": "1878772953401262080",
		"customer": "1786923308336807937",
		"oriCurrency": "1783169601426161704",
		"oriTaxExcludedAmount": 100,
		"exchangeRateType": "1783169601426164193",
		"exchangeRateDate": "2024-02-03",
		"exchangeRate": 1,
		"businessType": "1",
		"accTaxExcludedAmount": 100,
		"orgLocalCurrency": "1783169601426161704",
		"orgConvertParam": "1",
		"orgTaxExcludedAmount": 100,
		"grpLocalCurrency": "1783169601426161704",
		"grpConvertParam": "3",
		"grpTaxExcludedAmount": 100,
		"glbLocalCurrency": "1783169601426161704",
		"glbConvertParam": "1",
		"glbTaxExcludedAmount": 100,
		"accConvertParam": "1",
		"conConvertParam": "1",
		"conTaxExcludedAmount": 100,
		"srcBillSystem": "1590898535657111552",
		"srcBillNo": "RECON20240111002433",
		"srcBillType": "1570189715179044871",
		"srcTransType": "1783169601426164801",
		"srcBillId": "1905032306244976642",
		"extSrcSystems": "extSrcSystems",
		"dr": 0,
		"ytenantId": "0000LKQJBKJJE1K6PT0000",
		"pubts": "2024-02-02 15:21:42",
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"createTime": "2024-02-02 15:21:41",
		"isOpenApi": true,
		"rvnDeferRevenueBillBodyList": [
			{
				"id": "1921211894732423170",
				"conBillNo": "RECON20240111002433",
				"conBillId": "1905032306244976642",
				"conBaseinfoRowNo": 1,
				"conBaseinfoRowId": "1905032306244976651",
				"project": "1903247206167085058",
				"expenseItem": "1838147897233768455",
				"customer": "1786923308336807937",
				"dept": "1786927440100065287",
				"staff": "1786929914005946375",
				"costCenter": "1838070020886757382",
				"proCenter": "1836602817106149385",
				"oriCurrency": "1783169601426161704",
				"quantity": 10,
				"unit": "1786925515947900929",
				"oriTaxIncludedPrice": 10,
				"oriTaxExcludedPrice": 10,
				"accTaxIncludedPrice": 10,
				"accTaxExcludedPrice": 10,
				"taxRate": "1788325073998839813",
				"taxRateNumber": 0,
				"caculateRule": "1884714035715510017",
				"accTaxIncludedAmount": 100,
				"accTaxExcludedAmount": 100,
				"accTaxAmount": 0,
				"oriTaxIncludedAmount": 100,
				"oriTaxExcludedAmount": 100,
				"oriTaxAmount": 0,
				"accExchangeRateType": "1783169601426164193",
				"exchangeRateDate": "2024-02-03",
				"accExchangeRate": 1,
				"redSumTaxIncludedAmount": 0,
				"redSumTaxExcludedAmount": 0,
				"redSumTaxAmount": 0,
				"recoilTaxIncludedAmount": 100,
				"recoilTaxExcludedAmount": 100,
				"recoilTaxAmount": 0,
				"orgExchangeRateType": "1783169601426164193",
				"orgExchangeRate": 1,
				"orgTaxIncludedAmount": 100,
				"orgTaxExcludedAmount": 100,
				"orgTaxAmount": 0,
				"grpExchangeRateType": "0000LKQJBKJJE1K6PT0000",
				"grpExchangeRate": 1,
				"grpTaxIncludedAmount": 100,
				"grpTaxExcludedAmount": 100,
				"grpTaxAmount": 0,
				"glbExchangeRateType": "0000LKQJBKJJE1K6PT0000",
				"glbExchangeRate": 1,
				"glbTaxIncludedAmount": 100,
				"glbTaxExcludedAmount": 100,
				"glbTaxAmount": 0,
				"conCurrency": "1783169601426161704",
				"conExchangeRateType": "0000LKQJBKJJE1K6PT0000",
				"conExchangeRate": 1,
				"conTaxIncludedAmount": 100,
				"conTaxExcludedAmount": 100,
				"conTaxAmount": 0,
				"postStatus": "1",
				"confirmStatus": "0",
				"createType": "2",
				"rvnDeferRevenueBill_id": "1921211894732423169",
				"srcBillId": "1905032306244976642",
				"srcBillRowId": "1905032306244976651",
				"srcBillNo": "RECON20240111002433",
				"srcBillType": "1570189715179044871",
				"extSrcBillId": "extSrcBillId",
				"extSrcTranstypeCode": "extSrcTranstypeCode",
				"extSrcBilltypeCode": "extSrcBilltypeCode",
				"extSrcSystems": "extSrcSystems",
				"pubts": "2024-02-02 15:21:41",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"createTime": "2024-02-02 15:21:41",
				"dr": 0,
				"metaFullName": "RVN.RVN.rvnDeferRevenueBillBody",
				"ytenantId": "0000LKQJBKJJE1K6PT0000"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	保存错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-24

更新

请求说明

新增

请求参数 (4)

更新

请求参数 (6)

2	2025-09-10

新增

请求参数 exchRateOps

新增

请求参数 exchRateOps


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

