# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11419.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstdcostlevelid | cstdcostlevelid | cstdcostlevelid | char(20) | √ |
| 2 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 3 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 4 | icalcstatus | icalcstatus | icalcstatus | number(38, 0) |  |  | 1 |
| 5 | ncostlevel | ncostlevel | ncostlevel | number(38, 0) |
| 6 | pk_costtype | pk_costtype | pk_costtype | varchar2(20) |  |  | '~' |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |