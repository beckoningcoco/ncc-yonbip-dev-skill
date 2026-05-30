# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12770.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_resisoper | pk_resisoper | pk_resisoper | char(20) | √ |
| 2 | begintime | begintime | begintime | char(19) |
| 3 | endtime | endtime | endtime | char(19) |
| 4 | ip | ip | ip | varchar2(50) |
| 5 | operid | operid | operid | varchar2(50) |
| 6 | opertype | opertype | opertype | number(38, 0) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | resid | resid | resid | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |