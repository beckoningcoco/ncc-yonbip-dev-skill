# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12818.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | pk_id | pk_id | char(20) | √ |
| 2 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 3 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 4 | typelevel | typelevel | typelevel | char(50) |
| 5 | url | url | url | varchar2(50) |
| 6 | urlcn | urlcn | urlcn | varchar2(50) |
| 7 | urlcntitle | urlcntitle | urlcntitle | varchar2(50) |
| 8 | ywbm | ywbm | ywbm | varchar2(50) |
| 9 | ywmc | ywmc | ywmc | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |