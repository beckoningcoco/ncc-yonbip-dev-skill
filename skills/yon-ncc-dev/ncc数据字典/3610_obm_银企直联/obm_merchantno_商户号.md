# |<<

**商户号 (obm_merchantno / nc.vo.obm.merchantno.MerchantNoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3923.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_merchantno | 商户号主键 | pk_merchantno | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | merchantno | 商户号 | merchantno | varchar(50) |  | 字符串 (String) |
| 5 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 6 | code | code | code | varchar(50) |  | 字符串 (String) |
| 7 | name | name | name | varchar(50) |  | 字符串 (String) |
| 8 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 9 | maketime | 制单时间 | maketime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | enablestate | 启用状态 | enablestate | varchar(50) |  | 启用状态 (enum) |  | 1=未启用; |