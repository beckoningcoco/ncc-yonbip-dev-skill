# |<<

**业务对象明细 (bda_bizobj_b / uap.vo.bda.adpm.bo.entity.BizObjBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1167.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bizobj_b | 业务对象明细主键 | pk_bizobj_b | char(20) | √ | 主键 (UFID) |
| 2 | subtable | 表名 | subtable | varchar(50) |  | 字符串 (String) |
| 3 | pk_subtable | 主键 | pk_subtable | varchar(50) |  | 字符串 (String) |
| 4 | reftable | 引用表 | reftable | varchar(50) |  | 字符串 (String) |
| 5 | refcolumn | 引用列 | refcolumn | varchar(50) |  | 字符串 (String) |
| 6 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |