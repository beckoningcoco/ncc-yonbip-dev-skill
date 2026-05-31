# |<<

**开票确认主表 (po_comparebill / nccloud.vo.pu.comparebill.entity.CompareBillHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4590.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_comparebill | 确认订单主键 | pk_comparebill | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | vbillcode | 确认单号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | dstartdate | 开始日期 | dstartdate | char(19) |  | 日期 (UFDate) |
| 7 | denddate | 结束日期 | denddate | char(19) |  | 日期 (UFDate) |
| 8 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 9 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 10 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 11 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 12 | nchangestdrate | 折本汇率 | nchangestdrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | ntotalinnum | 入库主数量 | ntotalinnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ntotalinastnum | 入库数量 | ntotalinastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | ntotalnum | 确认开票主数量 | ntotalnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | ntotalastnum | 确认开票数量 | ntotalastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ncollectnum | 累计收票主数量 | ncollectnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ntotalmny | 确认价税合计 | ntotalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | cpurorgoid | 采购组织最新版本 | cpurorgoid | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 20 | cpurorgvid | 采购组织 | cpurorgvid | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 21 | cemployeeid | 采购员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 22 | pk_dept | 采购部门最新版本 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 23 | pk_dept_v | 采购部门 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 24 | vmemo | 备注 | vmemo | varchar(50) |  | 字符串 (String) |
| 25 | forderstatus | 单据状态 | forderstatus | varchar(50) |  | 单据状态 (comparebillstatus) |  | 0=待发送; |