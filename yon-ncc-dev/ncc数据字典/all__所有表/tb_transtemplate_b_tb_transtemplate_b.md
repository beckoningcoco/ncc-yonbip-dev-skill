# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12126.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | creatertime | creatertime | creatertime | char(19) |
| 3 | create_group | create_group | create_group | varchar2(20) |
| 4 | parentbilltype | parentbilltype | parentbilltype | varchar2(100) |
| 5 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 6 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) | √ |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |
| 9 | pk_taskdef | pk_taskdef | pk_taskdef | varchar2(20) |
| 10 | pk_template | pk_template | pk_template | varchar2(20) |
| 11 | templatename | templatename | templatename | varchar2(100) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |