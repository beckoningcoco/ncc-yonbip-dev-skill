# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11050.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workitemconfig | pk_workitemconfig | pk_workitemconfig | char(20) | √ |
| 2 | isdefault | isdefault | isdefault | char(1) |  |  | 'Y' |
| 3 | ismp | ismp | ismp | char(1) |
| 4 | item | item | item | varchar2(128) |
| 5 | itemindex | itemindex | itemindex | number(38, 0) |
| 6 | itemtype | itemtype | itemtype | number(38, 0) |
| 7 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 8 | resourceid | resourceid | resourceid | varchar2(30) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |