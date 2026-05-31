# |<<

**内部领用办理表 (cfbm_innerback / nc.vo.cfbm.innerback.InnerBackVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1406.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innerback | 主键 | pk_innerback | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | pk_billtypeid | 单据类型主键 | pk_billtypeid | char(20) |  | 主键 (UFID) |
| 4 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 7 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 8 | trusttype | 托管类型 | trusttype | varchar(50) |  | 托管类型 (TrustTypeEnum) |  | keep=保管托管; |