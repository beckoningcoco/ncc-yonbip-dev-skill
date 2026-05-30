# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11623.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_res_operation | pk_res_operation | pk_res_operation | char(20) | √ |
| 2 | comp | comp | comp | varchar2(50) |
| 3 | isformaintain | isformaintain | isformaintain | char(1) |
| 4 | isforspecial | isforspecial | isforspecial | char(1) |
| 5 | iskeyoperation | iskeyoperation | iskeyoperation | char(1) |
| 6 | operationcode | operationcode | operationcode | varchar2(200) |
| 7 | operationname | operationname | operationname | varchar2(200) |
| 8 | operationtype | operationtype | operationtype | number(38, 0) | √ |
| 9 | ownmodule | ownmodule | ownmodule | varchar2(20) |  |  | '~' |
| 10 | resid | resid | resid | varchar2(50) |
| 11 | resourceid | resourceid | resourceid | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |