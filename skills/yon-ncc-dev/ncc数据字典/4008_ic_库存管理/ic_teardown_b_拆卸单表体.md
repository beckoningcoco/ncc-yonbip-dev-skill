# |<<

**拆卸单表体 (ic_teardown_b / nc.vo.ic.m4m.entity.TeardownBillBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2986.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cspecialbid | 拆卸单表体主键 | cspecialbid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | fbillrowflag | 行状态 | fbillrowflag | varchar(50) |  | 组装行类型 (assembly_rowflag) |  | 0=套件; |