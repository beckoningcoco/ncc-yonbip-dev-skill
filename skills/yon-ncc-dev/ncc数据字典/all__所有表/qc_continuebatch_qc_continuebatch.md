# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11104.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_continuebatch | pk_continuebatch | pk_continuebatch | char(20) | √ |
| 2 | bhasbody | bhasbody | bhasbody | char(1) |
| 3 | bsealflag | bsealflag | bsealflag | char(1) |
| 4 | fcontinuetype | fcontinuetype | fcontinuetype | number(38, 0) |
| 5 | fnextstrictlv | fnextstrictlv | fnextstrictlv | number(38, 0) |
| 6 | ntransferpoint | ntransferpoint | ntransferpoint | number(28, 8) |
| 7 | pk_adjustrule | pk_adjustrule | pk_adjustrule | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |  |  | '~' |
| 10 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_stockorg | pk_stockorg | pk_stockorg | varchar2(20) |  |  | '~' |
| 13 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 14 | vadjustreasom | vadjustreasom | vadjustreasom | varchar2(181) |
| 15 | vcontinuecode | vcontinuecode | vcontinuecode | varchar2(50) |
| 16 | vcontinuename | vcontinuename | vcontinuename | varchar2(300) |
| 17 | vcontinuename2 | vcontinuename2 | vcontinuename2 | varchar2(300) |
| 18 | vcontinuename3 | vcontinuename3 | vcontinuename3 | varchar2(300) |
| 19 | vcontinuename4 | vcontinuename4 | vcontinuename4 | varchar2(300) |
| 20 | vcontinuename5 | vcontinuename5 | vcontinuename5 | varchar2(300) |
| 21 | vcontinuename6 | vcontinuename6 | vcontinuename6 | varchar2(300) |
| 22 | vinnercode | vinnercode | vinnercode | varchar2(200) |
| 23 | creationtime | creationtime | creationtime | char(19) |
| 24 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 27 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |