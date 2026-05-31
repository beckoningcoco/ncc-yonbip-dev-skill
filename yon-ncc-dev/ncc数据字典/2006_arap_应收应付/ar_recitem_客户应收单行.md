# |<<

**客户应收单行 (ar_recitem / nc.vo.arap.receivable.ReceivableBillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/139.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recitem | 应收单行标识 | pk_recitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 应收财务组织 | pk_org | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | pk_fiorg | 废弃财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | sett_org | 结算财务组织 | sett_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_pcorg_v | 利润中心版本 | pk_pcorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 7 | pk_org_v | 应收财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 8 | pk_fiorg_v | 废弃财务组织版本 | pk_fiorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | sett_org_v | 结算财务组织版本 | sett_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | so_org_v | 业务组织版本 | so_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 11 | so_deptid | 业务部门 | so_deptid | varchar(20) |  | 组织_部门 (dept) |
| 12 | so_deptid_v | 业务部门版本 | so_deptid_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 13 | so_psndoc | 业务人员 | so_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | so_ordertype | 销售订单类型 | so_ordertype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 15 | so_transtype | 销售渠道类型 | so_transtype | varchar(20) |  | 渠道类型 (channeltype) |
| 16 | so_org | 业务组织 | so_org | varchar(20) |  | 组织 (org) |
| 17 | material | 物料 | material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 18 | customer | 客户 | customer | varchar(20) |  | 客户基本信息 (customer) |
| 19 | postunit | 报价计量单位 | postunit | varchar(20) |  | 计量单位 (measdoc) |
| 20 | postpricenotax | 报价单位无税单价 | postpricenotax | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | postquantity | 报价单位数量 | postquantity | decimal(20, 8) |  | 数值 (UFDouble) |
| 22 | postprice | 报价单位含税单价 | postprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | coordflag | 单据协同状态 | coordflag | int |  | 单据协同标志 (coordflag) |  | 0=非确认; |