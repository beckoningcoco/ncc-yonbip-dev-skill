# |<<

**库存签字月发生 (ic_month_recordsign / nc.vo.ic.mobalance.entity.MonthRecordSignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2931.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 2 | pk_org | 库存组织最新版本 | pk_org | char(20) | √ | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 库存组织 | pk_org_v | char(20) | √ | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | cbilltypecode | 库存单据类型编码 | cbilltypecode | varchar(20) | √ | 单据类型 (BilltypeVO) |
| 5 | vtrantypecode | 出入库类型 | vtrantypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | cdptid | 部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 7 | cdptvid | 部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 8 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | cwastewarehouseid | 废品库 | cwastewarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 10 | cliabilityoid | 结算利润中心最新版本 | cliabilityoid | varchar(20) |  | 利润中心 (profitcenter) |
| 11 | cliabilityvid | 结算利润中心 | cliabilityvid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 12 | fbillflag | 单据状态 | fbillflag | int | √ | 库存单据状态 (ICBillFlag) |  | 1=删除; |