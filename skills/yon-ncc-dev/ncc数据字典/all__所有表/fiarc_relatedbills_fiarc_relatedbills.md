# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8259.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relatedbills | pk_relatedbills | pk_relatedbills | char(20) | √ |
| 2 | pk_archivedcommonset | pk_archivedcommonset | pk_archivedcommonset | char(20) | √ |
| 3 | pk_billtemplate | pk_billtemplate | pk_billtemplate | varchar2(50) |
| 4 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 5 | pk_system | pk_system | pk_system | varchar2(50) |
| 6 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |