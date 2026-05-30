# |<<

**个税申报表设置主表 (wa_taxsetbase / nc.vo.hrwa.taxset.TaxsetbaseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6367.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_taxsetbase | 个人所得税设置主键 | pk_wa_taxsetbase | char(20) | √ | 主键 (UFID) |
| 2 | code | 方案编码 | code | varchar(200) |  | 字符串 (String) |
| 3 | name | 方案名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | type | 所得税类型 | type | varchar(50) |  | 所得税类型 (typeenum) |  | 0=居民综合所得申报; |