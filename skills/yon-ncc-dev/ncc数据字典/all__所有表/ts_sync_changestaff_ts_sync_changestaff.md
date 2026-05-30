# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12315.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | optype | optype | optype | number(38, 0) |
| 3 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(36) |
| 4 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(36) |
| 5 | tenantid | tenantid | tenantid | varchar2(36) | √ |
| 6 | ts | ts | ts | varchar2(24) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |