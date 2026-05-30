# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11416.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstdactcostid | cstdactcostid | cstdactcostid | char(20) | √ |
| 2 | cactivityid | cactivityid | cactivityid | varchar2(20) |  |  | '~' |
| 3 | ccostcenterid | ccostcenterid | ccostcenterid | char(20) |
| 4 | ccosttypeid | ccosttypeid | ccosttypeid | varchar2(20) |  |  | '~' |
| 5 | cmeasureid | cmeasureid | cmeasureid | varchar2(20) |
| 6 | nnumber | nnumber | nnumber | number(20, 8) |
| 7 | nprice | nprice | nprice | number(20, 8) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 11 | totalcost | totalcost | totalcost | number(20, 8) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | char(20) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | char(20) |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |