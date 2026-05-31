# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6716.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accelements | pk_accelements | pk_accelements | char(20) | √ |
| 2 | accelementstype | accelementstype | accelementstype | char(1) | √ |
| 3 | ansyid | ansyid | ansyid | varchar2(20) |
| 4 | pk_cost | pk_cost | pk_cost | varchar2(20) |  |  | '~' |
| 5 | pk_factor | pk_factor | pk_factor | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 10 | productioncost | productioncost | productioncost | char(1) |  |  | 'N' |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |