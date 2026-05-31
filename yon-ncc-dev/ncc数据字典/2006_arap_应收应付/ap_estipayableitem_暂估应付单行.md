# |<<

**暂估应付单行 (ap_estipayableitem / nc.vo.arap.estipayable.EstiPayableBillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/129.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_estipayableitem | 暂估应付单行标识 | pk_estipayableitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 3 | pk_fiorg | 废弃财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org | 应付财务组织 | pk_org | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 5 | sett_org | 结算财务组织 | sett_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_fiorg_v | 废弃财务组织版本 | pk_fiorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | pk_pcorg_v | 利润中心版本 | pk_pcorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 8 | sett_org_v | 结算财务组织版本 | sett_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | pk_org_v | 应付财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | pu_deptid | 业务部门 | pu_deptid | varchar(20) |  | 组织_部门 (dept) |
| 11 | pu_org_v | 业务组织版本 | pu_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 12 | pu_deptid_v | 业务部门版本 | pu_deptid_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 13 | pu_psndoc | 业务人员 | pu_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | pu_org | 业务组织 | pu_org | varchar(20) |  | 组织 (org) |
| 15 | material | 物料 | material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 16 | supplier | 供应商 | supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 17 | postunit | 报价计量单位 | postunit | varchar(20) |  | 计量单位 (measdoc) |
| 18 | postpricenotax | 报价单位无税单价 | postpricenotax | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | postquantity | 报价单位数量 | postquantity | decimal(20, 8) |  | 数值 (UFDouble) |
| 20 | postprice | 报价单位含税单价 | postprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | checkdirection | 票据方向 | checkdirection | varchar(10) |  | 字符串 (String) |
| 22 | coordflag | 单据协同状态 | coordflag | int |  | 单据协同标志 (coordflag) |  | 0=非确认; |