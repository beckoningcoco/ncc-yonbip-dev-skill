# |<<

**税率 (txm_taxrate / nc.vo.txm.taxpub.TaxrateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5837.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxrate | 税率ID | pk_taxrate | char(20) | √ | 主键 (UFID) |
| 2 | pk_taxkind | 税种 | pk_taxkind | char(0) | √ | 税种 (taxkind) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 税务组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | taxdigit | 精度 | taxdigit | int |  | 整数 (Integer) |
| 6 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | startdate | 启用日期 | startdate | char(19) |  | 日期 (UFDate) |
| 8 | enddate | 截至日期 | enddate | char(19) |  | 日期 (UFDate) |
| 9 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |