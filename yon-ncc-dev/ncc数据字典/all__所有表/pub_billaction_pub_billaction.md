# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10893.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billaction | pk_billaction | pk_billaction | char(20) | √ |
| 2 | actionnote | actionnote | actionnote | varchar2(80) |
| 3 | actionnote2 | actionnote2 | actionnote2 | varchar2(80) |
| 4 | actionnote3 | actionnote3 | actionnote3 | varchar2(80) |
| 5 | actionnote4 | actionnote4 | actionnote4 | varchar2(80) |
| 6 | actionnote5 | actionnote5 | actionnote5 | varchar2(80) |
| 7 | actionnote6 | actionnote6 | actionnote6 | varchar2(80) |
| 8 | actionstyle | actionstyle | actionstyle | varchar2(20) |
| 9 | actionstyleremark | actionstyleremark | actionstyleremark | varchar2(30) |
| 10 | actiontype | actiontype | actiontype | varchar2(40) | √ |
| 11 | action_type | action_type | action_type | number(38, 0) |
| 12 | constrictflag | constrictflag | constrictflag | char(1) | √ |
| 13 | controlflag | controlflag | controlflag | char(1) | √ |
| 14 | finishflag | finishflag | finishflag | char(1) | √ |
| 15 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 16 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 17 | pushflag | pushflag | pushflag | char(1) |
| 18 | showhint | showhint | showhint | varchar2(256) |
| 19 | showhint2 | showhint2 | showhint2 | varchar2(256) |
| 20 | showhint3 | showhint3 | showhint3 | varchar2(256) |
| 21 | showhint4 | showhint4 | showhint4 | varchar2(256) |
| 22 | showhint5 | showhint5 | showhint5 | varchar2(256) |
| 23 | showhint6 | showhint6 | showhint6 | varchar2(256) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |