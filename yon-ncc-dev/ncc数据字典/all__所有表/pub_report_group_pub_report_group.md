# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10983.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | pk_group | pk_group | char(20) | √ |
| 2 | groupid | groupid | groupid | number(38, 0) | √ |
| 3 | groupname | groupname | groupname | varchar2(30) |
| 4 | grouptype | grouptype | grouptype | char(1) |
| 5 | item1 | item1 | item1 | varchar2(40) |
| 6 | item2 | item2 | item2 | varchar2(40) |
| 7 | pk_templet | pk_templet | pk_templet | char(20) | √ |
| 8 | resid_group | resid_group | resid_group | varchar2(30) |
| 9 | resid_item1 | resid_item1 | resid_item1 | varchar2(30) |
| 10 | resid_item2 | resid_item2 | resid_item2 | varchar2(30) |
| 11 | toplevelflag | toplevelflag | toplevelflag | char(1) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |