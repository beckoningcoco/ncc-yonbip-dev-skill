# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8543.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcileunit | pk_reconcileunit | pk_reconcileunit | char(20) | √ |
| 2 | code | code | code | varchar2(40) |
| 3 | memo | memo | memo | char(100) |
| 4 | pk_doctype | pk_doctype | pk_doctype | char(20) |
| 5 | recpriv | recpriv | recpriv | number(38, 0) |
| 6 | useflag | useflag | useflag | char(1) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |