# |<<

**费用结转单 (er_costshare / nc.vo.erm.costshare.CostShareVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1883.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costshare | 主键 | pk_costshare | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 所属财务组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | billno | 单据编号 | billno | varchar(50) |  | 字符串 (String) |
| 6 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 字符串 (String) |
| 7 | pk_tradetype | 交易类型编码 | pk_tradetype | varchar(50) |  | 字符串 (String) |
| 8 | src_type | 来源方式 | src_type | int |  | 来源方式 (costshare_srctype) |  | 0=自制; |