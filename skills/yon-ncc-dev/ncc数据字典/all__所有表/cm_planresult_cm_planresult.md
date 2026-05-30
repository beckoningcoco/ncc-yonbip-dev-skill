# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7639.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cplanresultid | cplanresultid | cplanresultid | char(20) | √ |
| 2 | ccostcenterid | ccostcenterid | ccostcenterid | varchar2(20) |  |  | '~' |
| 3 | cfactoryid | cfactoryid | cfactoryid | varchar2(20) |  |  | '~' |
| 4 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 5 | cperoid | cperoid | cperoid | varchar2(20) |  |  | '~' |
| 6 | cusedmaterialid | cusedmaterialid | cusedmaterialid | varchar2(20) |  |  | '~' |
| 7 | diffcost | diffcost | diffcost | number(28, 8) |
| 8 | factcost | factcost | factcost | number(28, 8) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |