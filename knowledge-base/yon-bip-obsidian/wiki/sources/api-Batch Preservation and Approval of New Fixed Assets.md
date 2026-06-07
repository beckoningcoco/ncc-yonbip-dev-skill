---
title: "固定资产新增批量保存并审核"
apiId: "1956980889168117763"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "New FA"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, New FA]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产新增批量保存并审核

> `ContentType	application/json` 请求方式	POST | 分类: New FA (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/AdditionBill/batchsaveandaudit

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
| sourceId | string | 否 | 是 | 来源单据id 示例：11 |
| accentity | string | 否 | 否 | 会计主体id,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：1570771133501800457 |
| accentity_code | string | 否 | 否 | 会计主体编码,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：101801 |
| code | string | 否 | 否 | 新增单编码,非自动编码时必填 示例：XZ006229 |
| assetCode | string | 否 | 否 | 固定资产编码(手工编码方式时必输) 示例：231010013147 |
| name | object | 否 | 是 | 固定资产名称 |
| zh_CN | string | 否 | 否 | 固定资产名称简体中文 示例：123接口 |
| assetCategoryId | string | 否 | 否 | 固定资产类别id 示例：1592518485629468678 |
| assetCategoryCode | string | 否 | 否 | 固定资产类别编码，固定资产类别id和固定资产类别编码不能同时为空，id和编码同时存在，以id为准 示例：000009 |
| addWayId | string | 否 | 否 | 增加方式id，增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准 示例：1570224925311500297 |
| addWayCode | string | 否 | 否 | 增加方式编码，增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准 示例：123 |
| usageStateId | string | 否 | 否 | 使用状态id，使用状态id和使用状态编码不能同时为空，id和编码同时存在，以id为准 示例：1570224925311500309 |
| usageStateCode | string | 否 | 否 | 使用状态编码，使用状态id和使用状态编码不能同时为空，id和编码同时存在，以id为准 示例：123 |
| beginTime | string | 否 | 是 | 开始使用日期，格式yyyy-MM-dd 示例：2022-01-01 |
| quantity | number |
| 小数位数:0,最大长度:21 | 否 | 否 | 数量 示例：1 |
| oriCurrtypeId | string | 否 | 否 | 原币币种id，币种id和币种编码不能同时为空，id和编码同时存在，以id为准 示例：1570225148659236885 |
| oriCurrtypeId_code | string | 否 | 否 | 原币币种编码，币种id和币种编码不能同时为空，id和编码同时存在，以id为准 示例：CNY |
| fcOriValue | number |
| 小数位数:8,最大长度:21 | 否 | 是 | 原币原值 示例：123 |
| tagno | string | 否 | 否 | 标签号 示例：123345353 |
| specification | object | 否 | 否 | 固定资产规格 |
| zh_CN | string | 否 | 否 | 固定资产规格简体中文 示例：规格1 |
| assetModel | object | 否 | 否 | 固定资产型号 |
| zh_CN | string | 否 | 否 | 固定资产型号简体中文 示例：型号1 |
| assetSubcategoryId | string | 否 | 否 | 固定资产子类别id，与固定资产子类别id和固定资产子类别编码同时存在，以id为准 示例：233444555 |
| assetSubcategoryId_code | string | 否 | 否 | 固定资产子类别编码，与固定资产子类别id和固定资产子类别编码同时存在，以id为准 示例：子类别1 |
| userId | string | 否 | 否 | 使用人id，如果使用人id和使用人编码同时存在，以id为准 示例：9334 |
| userCode | string | 否 | 否 | 使用人编码，如果使用人id和使用人编码同时存在，以id为准 示例：user01 |
| mgmtDeptId | string | 否 | 否 | 管理部门id，如果管理部门编码和管理部门id同时存在，以id为准 示例：33334 |
| mgmtDeptId_code | string | 否 | 否 | 管理部门编码，如果管理部门编码和管理部门id同时存在，以id为准 示例：dept01 |
| mgmtCostCenterId | string | 否 | 否 | 管理成本中心id，如果管理成本中心编码和管理成本中心id同时存在，以id为准 示例：3334 |
| mgmtCostCenterId_code | string | 否 | 否 | 管理成本中心编码，如果管理成本中心编码和管理成本中心id同时存在，以id为准 示例：cost01 |
| profitCenterId | string | 否 | 否 | 管理利润中心id，如果管理利润中心编码与管理利润中心id同时存在，以id为准 示例：1345 |
| profitCenterId_code | string | 否 | 否 | 管理利润中心编码，如果管理利润中心编码与管理利润中心id同时存在，以id为准 示例：profit01 |
| custodian | string | 否 | 否 | 保管人id，如果保管人编码和保管人id同时存在，以id为准 示例：1245 |
| custodianCode | string | 否 | 否 | 保管人编码，如果保管人编码和保管人id同时存在，以id为准 示例：user01 |
| location | object | 否 | 否 | 存放地点 |
| zh_CN | string | 否 | 否 | 存放地点简体中文 示例：A仓库 |
| placeId | string | 否 | 否 | 位置id，如果位置id与位置编码同时存在，以id为准 示例：1113 |
| placeCode | string | 否 | 否 | 位置编码，如果位置id与位置编码同时存在，以id为准 示例：B车站 |
| vendorId | string | 否 | 否 | 供应商id，如果供应商id与供应商编码同时存在，以id为准 示例：1573832740679712776 |
| vendorCode | string | 否 | 否 | 供应商编码，如果供应商id与供应商编码同时存在，以id为准 示例：0001000012 |
| impairmentunitId | string | 否 | 否 | 减值单元id，如果减值单元id和减值单元编码同时存在，以id为准 示例：155028243 |
| impairmentUnitCode | string | 否 | 否 | 减值单元编码，如果减值单元id和减值单元编码同时存在，以id为准 示例：15502 |
| assignments | object | 是 | 是 | 分配信息 |
| proportion | string | 否 | 是 | 分摊比例，受系统参数控制显示百分比或小数 示例：1 |
| projectId | string | 否 | 否 | 项目id，受系统参数控制是否必填，如果控制必填了，项目编码与项目id不能同时为空，若同时存在，以id为准 示例：1267659679875 |
| projectCode | string | 否 | 否 | 项目编码，受系统参数控制是否必填，如果控制必填了，项目编码与项目id不能同时为空，若同时存在，以id为准 示例：project123 |
| productId | string | 否 | 否 | 产品id，受系统参数控制是否必填，如果控制必填了，产品编码与产品id不能同时为空，若同时存在，以id为准 示例：23344 |
| productCode | string | 否 | 否 | 产品编码，受系统参数控制是否必填，如果控制必填了，产品编码与产品id不能同时为空，若同时存在，以id为准 示例：dp01 |
| deptId | string | 否 | 否 | 使用部门id，受系统参数控制是否必填，如果控制必填了，使用部门编码与使用部门id不能同时为空，若同时存在，以id为准 示例：1572389124972216323 |
| deptCode | string | 否 | 否 | 使用部门编码，受系统参数控制是否必填，如果控制必填了，使用部门编码与使用部门id不能同时为空，若同时存在，以id为准 示例：2001 |
| costCenterId | string | 否 | 否 | 使用成本中心id，受系统参数控制是否必填，如果控制必填了，使用成本中心编码与使用成本中心id不能同时为空，若同时存在，以id为准 示例：1572359206221119495 |
| costCenterCode | string | 否 | 否 | 使用成本中心编码，受系统参数控制是否必填，如果控制必填了，使用成本中心编码与使用成本中心id不能同时为空，若同时存在，以id为准 示例：01 |
| profitCenterId | string | 否 | 否 | 使用利润中心id，受系统参数控制是否必填，如果控制必填了，使用利润中心编码与使用利润中心id不能同时为空，若同时存在，以id为准 示例：3345 |
| profitCenterCode | string | 否 | 否 | 使用利润中心编码，受系统参数控制是否必填，如果控制必填了，使用利润中心编码与使用利润中心id不能同时为空，若同时存在，以id为准 示例：profit03 |
| remarks | object | 否 | 否 | 备注 |
| bodies | object | 是 | 是 | 核算信息 |
| assetCategoryId | string | 否 | 否 | 固定资产类别id，固定资产类别id与固定资产类别编码不能同时为空，id和编码同时存在，以id为准 示例：1592518485629468678 |
| assetCategoryCode | string | 否 | 否 | 固定资产类别编码，固定资产类别id与固定资产类别编码不能同时为空，id和编码同时存在，以id为准 示例：fa01 |
| accumImpAmount | number |
| 小数位数:8,最大长度:21 | 否 | 是 | 累计减值 示例：0 |
| orgCurYearImpAmount | number |
| 小数位数:8,最大长度:21 | 否 | 是 | 本年减值 示例：0 |
| deprAmount | number |
| 小数位数:8,最大长度:21 | 否 | 是 | 累计折旧 示例：0 |
| yearDeprAmount | number |
| 小数位数:8,最大长度:21 | 否 | 是 | 本年折旧 示例：0 |
| oriValue | number |
| 小数位数:8,最大长度:21 | 否 | 是 | 本币原值 示例：123 |
| exchangeRateType | string | 否 | 否 | 本币汇率类型id，汇率类型id和汇率类型编码不能同时为空，id和编码同时存在，以id为准 示例：0000L9CK4GCI07UZVW0000 |
| exchangeRateType_code | string | 否 | 否 | 本币汇率类型编码，汇率类型id和汇率类型编码不能同时为空，id和编码同时存在，以id为准 示例：01 |
| exchangeRate | number |
| 小数位数:8,最大长度:21 | 否 | 是 | 本币汇率 示例：0.3 |
| createAssetDate | string | 否 | 是 | 建卡日期 示例：2022-01-01 |
| totalWorkload | number |
| 小数位数:8,最大长度:21 | 否 | 是 | 工作总量 示例：0 |
| existingWorkload | number |
| 小数位数:8,最大长度:21 | 否 | 是 | 累计工作量 示例：0 |
| monthWorkload | number |
| 小数位数:8,最大长度:21 | 否 | 是 | 当期工作量 示例：0 |
| accbookCurrtypeId | string | 否 | 否 | 本币币种id，本币币种id和本币币种编码不能同时为空，如果id和编码同时存在，以id为准 示例：1570225148659236885 |
| accbookCurrtypeCode | string | 否 | 否 | 本币币种编码，本币币种id和本币币种编码不能同时为空，如果id和编码同时存在，以id为准 示例：CNY |
| fcOriValue | number |
| 小数位数:8,最大长度:21 | 否 | 是 | 原币原值 示例：123 |
| oriCurrtypeId | string | 否 | 否 | 原币币种id，原币币种id与原币币种编码不能同时为空，如果id和编码同时存在，以id为准 示例：1570225148659236885 |
| oriCurrtypeId_code | string | 否 | 否 | 原币币种编码，原币币种id与原币币种编码不能同时为空，如果id和编码同时存在，以id为准 示例：CNY |
| assetBookCategoryId | string | 否 | 否 | 账簿级类别id，账簿级类别id和账簿级类别编码同时存在，以id为准 示例：1592518494219403268 |
| assetBookCategoryCode | string | 否 | 否 | 账簿级类别编码，账簿级类别id和账簿级类别编码同时存在，以id为准 示例：000009 |
| accbook | string | 否 | 否 | 账簿id，账簿id和账簿编码同时存在，以id为准 示例：1570776287434768392 |
| accbook_code | string | 否 | 否 | 账簿编码，账簿id和账簿编码同时存在，以id为准 示例：0101 |
| deprMethodId | string | 否 | 否 | 折旧方法id 示例：1570224933901434932 |
| lifeMonth | number |
| 小数位数:0,最大长度:21 | 否 | 否 | 使用月限 示例：2 |
| lifeYear | number |
| 小数位数:0,最大长度:21 | 否 | 否 | 使用年限 示例：2 |
| scrapValueType | string | 否 | 否 | 残值类型，枚举，0:百分比 1:金额 示例：0 |
| scrapValueRate | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 净残值率 示例：2 |
| scrapValue | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 净残值 示例：2.46 |
| amortiAdjustDate | string | 否 | 否 | 生效日期 格式yyyy-MM-DD 示例：2024-03-08 |
| extractedPeriod | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 已计提期数 示例：0 |
| taxItemId | string | 否 | 否 | 税目id 示例：1113 |
| taxRate | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 税率 示例：0 |
| addedTaxAmount | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 税额 示例：0 |
| exchangeRateOps | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 本币汇率折算方式，1为乘法，2为除法 示例：1 |
| isDepr | boolean | 否 | 否 | 是否折旧，枚举，true是 false否 示例：true |
| isMonthdepr | boolean | 否 | 否 | 建卡当期计提，枚举，true是 false否 示例：false |
| accbookStartDate | string | 否 | 否 | 启用日期，格式yyyy-MM-dd 示例：2022-01-01 |
| workloadUnit | object | 否 | 否 | 工作量单位 |
| deprConvention | string | 否 | 否 | 折旧惯例id，无值时系统默认按账簿和固定资产类别取值固定资产账簿级类别维护的值 示例：1570224951081304065 |
| disposalConvention | string | 否 | 否 | 处置惯例id，无值时系统默认按账簿和固定资产类别取值固定资产账簿级类别维护的值 示例：1570224951081304066 |
| subjects | object | 是 | 否 | 科目分配 |
| taxItemCode | string | 否 | 否 | 税目编码 示例：TE |
| devices | object | 是 | 否 | 附属设备 |
| code | string | 否 | 否 | 设备编码 示例：test01 |
| name | object | 否 | 否 | 设备名称 |
| model | object | 否 | 否 | 规格型号 |
| measuringUnitId | string | 否 | 否 | 计量单位id，计量编码与计量Id同时存在，以id为准 示例：2234 |
| measuringUnitId_code | string | 否 | 否 | 计量单位编码，计量编码与计量Id同时存在，以id为准 示例：unit01 |
| quantity | number |
| 小数位数:0,最大长度:21 | 否 | 否 | 数量 示例：1000 |
| value | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 价值 示例：100 |
| useDate | string | 否 | 否 | 使用日期，格式yyyy-mm-dd 示例：2024-03-28 |
| usageState | object | 否 | 否 | 使用情况 |
| changeDate | string | 否 | 否 | 变动日期，格式yyyy-mm-dd 示例：2024-04-06 |
| remarks | object | 否 | 否 | 备注 |
| costrecords | object | 是 | 否 | 费用记录 |
| occurDate | string | 否 | 否 | 发生日期，格式yyyy-mm-dd 示例：2023-01-04 |
| balanceProject | object | 否 | 否 | 收支项目 |
| digest | object | 否 | 否 | 摘要 |
| amount | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 金额 示例：33000 |
| remarks | object | 否 | 否 | 备注 |
| sources | object | 是 | 否 | 来源信息 |
| blnLease | boolean | 否 | 否 | 是否使用权资产, true是, false否 示例：false |
| leases | object | 是 | 否 | 使用权资产信息, 是否使用权资产为是时不能为空 |
| contractNo | string | 否 | 否 | 合同号 示例：XS202408132493 |
| contractName | string | 否 | 否 | 合同名称 示例：销售合同 |
| lessorId | string | 否 | 否 | 出租方id 示例：102039984935676 |
| lessorId_code | string | 否 | 否 | 出租方编码, 与id同时存在以id为准 示例：001 |
| handleDeptId | string | 否 | 否 | 经办部门id 示例：102345049587485 |
| handleDeptId_code | string | 否 | 否 | 经办部门编码,与id同时存在时以id为准 示例：001 |
| handler | string | 否 | 否 | 经办人id 示例：102345049587485 |
| handler_code | string | 否 | 否 | 经办人编码,与id同时存在时以id为准 示例：001 |
| contractDate | string | 否 | 否 | 合同签订日期, 格式yyyy-MM-dd 示例：2024-03-03 |
| leaseStartDate | string | 否 | 否 | 起租日期,格式yyyy-MM-dd, 是否使用权资产为是时不能为空 示例：2024-03-03 |
| leaseEndDate | string | 否 | 否 | 止租日期,格式yyyy-MM-dd, 是否使用权资产为是时不能为空 示例：2024-03-03 |
| startCountDate | string | 否 | 否 | 起算日期,格式yyyy-MM-dd, 是否使用权资产为是时不能为空 示例：2024-03-03 |
| discountYearRate | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 年折现率, 是否使用权资产为是时不能为空 示例：1 |
| leaseIncentiveAmount | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 租赁激励金额, 是否使用权资产为是时不能为空 示例：0 |
| preRestoreCost | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 预计还原成本, 是否使用权资产为是时不能为空 示例：0 |
| initDirectCost | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 初始直接费用, 是否使用权资产为是时不能为空 示例：0 |
| taxItemId | string | 否 | 否 | 税目id 示例：10023938466838 |
| taxItemId_code | string | 否 | 否 | 税目编码,与id同时存在以id为准 示例：001 |
| taxRate | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 税率 示例：1 |
| blnTaxDeductible | boolean | 否 | 否 | 税额可抵扣 示例：false |
| blnRenewalOption | boolean | 否 | 否 | 执行续租选择权, true-是, false-否 示例：false |
| renewalEndDate | string | 否 | 否 | 续租截止期,格式yyyy-MM-dd, 执行续租选择权为是时不能为空 示例：2024-09-22 |
| blnPurchaseOption | boolean | 否 | 否 | 执行购买选择权,true-是, false-否 示例：false |
| purchasePrice | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 购买价格,执行续租选择权为是时不能为空 示例：230000 |
| interestAlgorithmType | string | 否 | 否 | 折现算法，使用权资产必填，枚举,{1:(期初租赁负债-租赁负债支付)*折现率,2:期初租赁负债*折现率} |
| discountRateType | string | 否 | 否 | 年折现率计算方式枚举,{1:(1+年折现率)^(1/365)-1,2:年折现率/365,3:(1+年折现率)^(1/12)-1,4:年折现率/12},必填 |
| paymentrules | object | 是 | 否 | 付款规则, 是否使用权资产为是时不能为空 |
| leasePayment | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 含税金额, 是否使用权资产为是时不能为空 示例：200 |
| taxAmount | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 税额 示例：0 |
| paymentFrequency | string | 否 | 否 | 付款频率,1-每一月,2-每二月,3-每季度,4-每半年,5-每年,6-一次性, 是否使用权资产为是时不能为空 示例：1 |
| startDate | string | 否 | 否 | 受益开始日期, 格式yyyy-MM-dd, 是否使用权资产为是时不能为空 示例：2024-04-01 |
| endDate | string | 否 | 否 | 受益结束日期, 格式yyyy-MM-dd, 是否使用权资产为是时不能为空 示例：2025-04-01 |
| delayDays | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 第几天支付, 是否使用权资产为是时不能为空 示例：1 |
| paymentDateRef | string | 否 | 否 | 付款日期计算参照, 1-受益开始日期,2-受益结束日期, 是否使用权资产为是时不能为空 示例：1 |
| paymentplans | object | 是 | 否 | 付款计划 |
| rentType | string | 否 | 否 | 租金类型枚举,{1:租金,2:购买价款} |
| startDate | string | 否 | 否 | 受益开始日期，日期,长度10 |
| endDate | string | 否 | 否 | 受益结束日期，日期,长度10 |
| paymentDate | string | 否 | 否 | 计划付款日期，日期,长度10 |
| leasePayment | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 含税金额 |
| taxAmount | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 税额 |
| outTaxAmount | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 不含税金额 |
| discountDays | string | 否 | 否 | 折现期数 |
| discountFactor | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 折现系数 |
| oriLeaseLiability | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 租赁负债原值 |
| leaseLiability | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 租赁负债现值 |
| blnDiscount | boolean | 否 | 否 | 是否参与折现 |
| interestdetails | object | 是 | 否 | 利息明细 |
| startDate | string | 否 | 否 | 起算日期，日期,长度10 |
| endDate | string | 否 | 否 | 止算日期，日期,长度10 |
| beginningLeaseLiability | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 期初租赁负债 |
| beginningUnconFinanceCost | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 期初未确认融资费用 |
| leasePayment | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 租赁付款金额 |
| interest | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 计提利息 |
| accumIntAccrued | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 累计计提利息 |
| endingLeaseLiability | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 期末租赁负债 |
| endingUnconFinanceCost | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 期末未确认融资费用 |

## 3. 请求示例

Url: /yonbip/EFI/AdditionBill/batchsaveandaudit?access_token=访问令牌
Body: [{
	"sourceId": "11",
	"accentity": "1570771133501800457",
	"accentity_code": "101801",
	"code": "XZ006229",
	"assetCode": "231010013147",
	"name": {
		"zh_CN": "123接口"
	},
	"assetCategoryId": "1592518485629468678",
	"assetCategoryCode": "000009",
	"addWayId": "1570224925311500297",
	"addWayCode": "123",
	"usageStateId": "1570224925311500309",
	"usageStateCode": "123",
	"beginTime": "2022-01-01",
	"quantity": 1,
	"oriCurrtypeId": "1570225148659236885",
	"oriCurrtypeId_code": "CNY",
	"fcOriValue": 123,
	"tagno": "123345353",
	"specification": {
		"zh_CN": "规格1"
	},
	"assetModel": {
		"zh_CN": "型号1"
	},
	"assetSubcategoryId": "233444555",
	"assetSubcategoryId_code": "子类别1",
	"userId": "9334",
	"userCode": "user01",
	"mgmtDeptId": "33334",
	"mgmtDeptId_code": "dept01",
	"mgmtCostCenterId": "3334",
	"mgmtCostCenterId_code": "cost01",
	"profitCenterId": "1345",
	"profitCenterId_code": "profit01",
	"custodian": "1245",
	"custodianCode": "user01",
	"location": {
		"zh_CN": "A仓库"
	},
	"placeId": "1113",
	"placeCode": "B车站",
	"vendorId": "1573832740679712776",
	"vendorCode": "0001000012",
	"impairmentunitId": "155028243",
	"impairmentUnitCode": "15502",
	"assignments": [
		{
			"proportion": "1",
			"projectId": "1267659679875",
			"projectCode": "project123",
			"productId": "23344",
			"productCode": "dp01",
			"deptId": "1572389124972216323",
			"deptCode": "2001",
			"costCenterId": "1572359206221119495",
			"costCenterCode": "01",
			"profitCenterId": "3345",
			"profitCenterCode": "profit03",
			"remarks": {
				"zh_CN": "分配信息备注"
			}
		}
	],
	"bodies": [
		{
			"assetCategoryId": "1592518485629468678",
			"assetCategoryCode": "fa01",
			"accumImpAmount": 0,
			"orgCurYearImpAmount": 0,
			"deprAmount": 0,
			"yearDeprAmount": 0,
			"oriValue": 123,
			"exchangeRateType": "0000L9CK4GCI07UZVW0000",
			"exchangeRateType_code": "01",
			"exchangeRate": 0.3,
			"createAssetDate": "2022-01-01",
			"totalWorkload": 0,
			"existingWorkload": 0,
			"monthWorkload": 0,
			"accbookCurrtypeId": "1570225148659236885",
			"accbookCurrtypeCode": "CNY",
			"fcOriValue": 123,
			"oriCurrtypeId": "1570225148659236885",
			"oriCurrtypeId_code": "CNY",
			"assetBookCategoryId": "1592518494219403268",
			"assetBookCategoryCode": "000009",
			"accbook": "1570776287434768392",
			"accbook_code": "0101",
			"deprMethodId": "1570224933901434932",
			"lifeMonth": 2,
			"lifeYear": 2,
			"scrapValueType": "0",
			"scrapValueRate": 2,
			"scrapValue": 2.46,
			"amortiAdjustDate": "2024-03-08",
			"extractedPeriod": 0,
			"taxItemId": "1113",
			"taxRate": 0,
			"addedTaxAmount": 0,
			"exchangeRateOps": 1,
			"isDepr": true,
			"isMonthdepr": false,
			"accbookStartDate": "2022-01-01",
			"workloadUnit": {
				"zh_CN": "千克"
			},
			"deprConvention": "1570224951081304065",
			"disposalConvention": "1570224951081304066",
			"subjects": [
				{
					"subjectId": "1564985907040223235",
					"subjectCode": "1001"
				}
			],
			"taxItemCode": "TE"
		}
	],
	"devices": [
		{
			"code": "test01",
			"name": {
				"zh_CN": "烤肉机"
			},
			"model": {
				"zh_CN": "附属设备规格"
			},
			"measuringUnitId": "2234",
			"measuringUnitId_code": "unit01",
			"quantity": 1000,
			"value": 100,
			"useDate": "2024-03-28",
			"usageState": {
				"zh_CN": "废弃"
			},
			"changeDate": "2024-04-06",
			"remarks": {
				"zh_CN": "附属设备备注"
			}
		}
	],
	"costrecords": [
		{
			"occurDate": "2023-01-04",
			"balanceProject": {
				"zh_CN": "收支1"
			},
			"digest": {
				"zh_CN": "摘要1"
			},
			"amount": 33000,
			"remarks": {
				"zh_CN": "费用记录备注"
			}
		}
	],
	"sources": [
		{}
	],
	"blnLease": false,
	"leases": [
		{
			"contractNo": "XS202408132493",
			"contractName": "销售合同",
			"lessorId": "102039984935676",
			"lessorId_code": "001",
			"handleDeptId": "102345049587485",
			"handleDeptId_code": "001",
			"handler": "102345049587485",
			"handler_code": "001",
			"contractDate": "2024-03-03",
			"leaseStartDate": "2024-03-03",
			"leaseEndDate": "2024-03-03",
			"startCountDate": "2024-03-03",
			"discountYearRate": 1,
			"leaseIncentiveAmount": 0,
			"preRestoreCost": 0,
			"initDirectCost": 0,
			"taxItemId": "10023938466838",
			"taxItemId_code": "001",
			"taxRate": 1,
			"blnTaxDeductible": false,
			"blnRenewalOption": false,
			"renewalEndDate": "2024-09-22",
			"blnPurchaseOption": false,
			"purchasePrice": 230000,
			"interestAlgorithmType": "",
			"discountRateType": ""
		}
	],
	"paymentrules": [
		{
			"leasePayment": 200,
			"taxAmount": 0,
			"paymentFrequency": "1",
			"startDate": "2024-04-01",
			"endDate": "2025-04-01",
			"delayDays": 1,
			"paymentDateRef": "1"
		}
	],
	"paymentplans": [
		{
			"rentType": "",
			"startDate": "",
			"endDate": "",
			"paymentDate": "",
			"leasePayment": 0,
			"taxAmount": 0,
			"outTaxAmount": 0,
			"discountDays": "",
			"discountFactor": 0,
			"oriLeaseLiability": 0,
			"leaseLiability": 0,
			"blnDiscount": true
		}
	],
	"interestdetails": [
		{
			"startDate": "",
			"endDate": "",
			"beginningLeaseLiability": 0,
			"beginningUnconFinanceCost": 0,
			"leasePayment": 0,
			"interest": 0,
			"accumIntAccrued": 0,
			"endingLeaseLiability": 0,
			"endingUnconFinanceCost": 0
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回生成固定资产新增信息 |
| success | object | 是 | 生成成功的数据 |
| failed | object | 是 | 生成失败的数据 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"success": [
			{
				"id": "1956863017997565954",
				"code": "XZ0001",
				"sourceId": "1234567809",
				"assetCode": "mm00202303000094"
			}
		],
		"failed": [
			{
				"sourceId": "123",
				"message": "请检查期间方案是否定义！"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	获取属性失败, 属性名:specification, 属性值:{}	补充固定资产规格specification参数


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-21

删除

请求参数 oriBillId

去除入参oriBillId【业务幂等id】

2	2025-12-10

新增

请求参数 oriBillId

添加入参oriBillId【业务幂等id】

3	2025-10-12

更新

请求说明

新增

请求参数 (26)

4	2025-06-26

更新

请求参数 (4)

删除

请求参数 amortiAdjustMark


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

