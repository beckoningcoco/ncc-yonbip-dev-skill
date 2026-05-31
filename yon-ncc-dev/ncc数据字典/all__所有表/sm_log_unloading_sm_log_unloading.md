# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11575.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_unloading | pk_unloading | pk_unloading | char(20) | √ |
| 2 | ip | ip | ip | varchar2(50) |
| 3 | operationdate | operationdate | operationdate | char(19) |
| 4 | operationfilename | operationfilename | operationfilename | varchar2(300) |
| 5 | operationresult | operationresult | operationresult | varchar2(50) |
| 6 | operationtime | operationtime | operationtime | char(8) |
| 7 | operationtype | operationtype | operationtype | varchar2(50) |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |
| 9 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 10 | pk_user | pk_user | pk_user | varchar2(20) |
| 11 | unloadingtimepoint | unloadingtimepoint | unloadingtimepoint | char(19) |
| 12 | usertype | usertype | usertype | number(38, 0) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |