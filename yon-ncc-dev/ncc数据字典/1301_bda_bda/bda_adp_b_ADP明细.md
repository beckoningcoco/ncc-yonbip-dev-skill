# |<<

**ADP明细 (bda_adp_b / uap.vo.bda.adpm.adp.entity.AdpBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1165.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adp_b | 明细主键 | pk_adp_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_bizobj | 业务对象 | pk_bizobj | varchar(20) |  | 业务对象 (bda_bizobj) |
| 4 | pk_bizobj_b | 业务对象明细 | pk_bizobj_b | varchar(20) |  | 业务对象明细 (bda_bizobj_b) |
| 5 | sourcetable | 源表 | sourcetable | varchar(50) |  | 字符串 (String) |
| 6 | tablefix | 归档表 | tablefix | varchar(50) |  | 字符串 (String) |
| 7 | adptablestatus | Adp发布结果 | adptablestatus | int |  | Adp发布结果 (AdpTableStatus) |  | 0=已有; |