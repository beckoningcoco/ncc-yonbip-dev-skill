# |<<

**VMI汇总表体 (ic_vmi_outdetail / nc.vo.ic.m50.entity.VmiSumBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3006.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cvmibid | VMI汇总表体主键 | cvmibid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | cdptid | 用料部门 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 8 | ccostobject | 成本对象 | ccostobject | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | vproductbatch | 生产订单 | vproductbatch | varchar(30) |  | 字符串 (String) |
| 10 | cwp | 工序 | cwp | varchar(181) |  | 字符串 (String) |
| 11 | nnum | 消耗主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nassistnum | 消耗数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 14 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |