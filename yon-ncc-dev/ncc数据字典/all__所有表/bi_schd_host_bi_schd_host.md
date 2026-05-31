# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7327.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | hostid | hostid | hostid | varchar2(30) | √ |
| 2 | activestatus | activestatus | activestatus | number(38, 0) |
| 3 | activetime | activetime | activetime | number(30, 0) |
| 4 | currloadweight | currloadweight | currloadweight | number(38, 0) |
| 5 | freememory | freememory | freememory | number(20, 8) |
| 6 | ip | ip | ip | varchar2(64) |
| 7 | loadweight | loadweight | loadweight | number(38, 0) |
| 8 | masterstatus | masterstatus | masterstatus | number(38, 0) |
| 9 | memorystatus | memorystatus | memorystatus | varchar2(100) |
| 10 | openstatus | openstatus | openstatus | number(38, 0) |
| 11 | port | port | port | varchar2(10) |
| 12 | servername | servername | servername | varchar2(100) |
| 13 | thrdnum | thrdnum | thrdnum | number(38, 0) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |