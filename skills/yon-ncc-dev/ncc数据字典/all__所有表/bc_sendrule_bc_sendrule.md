# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6693.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule | pk_rule | pk_rule | char(20) | √ |
| 2 | bretrantype | bretrantype | bretrantype | varchar2(20) |  |  | '~' |
| 3 | bsingle | bsingle | bsingle | char(1) |
| 4 | cbilltypename | cbilltypename | cbilltypename | varchar2(50) |
| 5 | ftype | ftype | ftype | number(38, 0) |
| 6 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |  |  | '~' |
| 7 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(50) |
| 8 | vbbvometa | vbbvometa | vbbvometa | varchar2(50) |
| 9 | vbcsicode | vbcsicode | vbcsicode | varchar2(50) |
| 10 | vbvometa | vbvometa | vbvometa | varchar2(50) |
| 11 | vhvometa | vhvometa | vhvometa | varchar2(50) |
| 12 | vimplclass | vimplclass | vimplclass | varchar2(99) |
| 13 | vsermark | vsermark | vsermark | varchar2(50) |
| 14 | vsystype | vsystype | vsystype | number(38, 0) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |