# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9077.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_flowdetail | pk_flowdetail | pk_flowdetail | char(20) | √ |
| 2 | cgeneralbid | cgeneralbid | cgeneralbid | varchar2(20) | √ |
| 3 | cgeneralhid | cgeneralhid | cgeneralhid | varchar2(20) | √ |
| 4 | cgenerallid | cgenerallid | cgenerallid | varchar2(20) | √ |
| 5 | clocationid | clocationid | clocationid | varchar2(20) |  |  | '~' |
| 6 | corpoid | corpoid | corpoid | varchar2(20) |  |  | '~' |
| 7 | corpvid | corpvid | corpvid | varchar2(20) |  |  | '~' |
| 8 | dtransdate | dtransdate | dtransdate | char(19) |
| 9 | ninassistnum | ninassistnum | ninassistnum | number(28, 8) |
| 10 | ningrossnum | ningrossnum | ningrossnum | number(28, 8) |
| 11 | ninnum | ninnum | ninnum | number(28, 8) |
| 12 | noutassistnum | noutassistnum | noutassistnum | number(28, 8) |
| 13 | noutgrossnum | noutgrossnum | noutgrossnum | number(28, 8) |
| 14 | noutnum | noutnum | noutnum | number(28, 8) |
| 15 | nretastnum | nretastnum | nretastnum | number(28, 8) |
| 16 | nretgrossnum | nretgrossnum | nretgrossnum | number(28, 8) |
| 17 | nretnum | nretnum | nretnum | number(28, 8) |
| 18 | pk_flow | pk_flow | pk_flow | char(20) | √ |
| 19 | pk_group | pk_group | pk_group | char(20) | √ |
| 20 | pk_serialcode | pk_serialcode | pk_serialcode | varchar2(20) |
| 21 | vbarcode | vbarcode | vbarcode | varchar2(128) |
| 22 | vbarcodesub | vbarcodesub | vbarcodesub | varchar2(100) |
| 23 | vboxbarcode | vboxbarcode | vboxbarcode | varchar2(100) |
| 24 | vsncode | vsncode | vsncode | varchar2(128) |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |