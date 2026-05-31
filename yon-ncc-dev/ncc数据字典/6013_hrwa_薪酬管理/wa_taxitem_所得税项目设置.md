# |<<

**所得税项目设置 (wa_taxitem / nc.vo.wa.psntax.TaxItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6363.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_taxitem | 主键 | pk_wa_taxitem | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 所属组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 5 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | datatype | 数据来源类型 | datatype | int |  | 数据来源方式 (sourcetypeenum) |  | 0=系统变量; |