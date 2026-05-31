# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11607.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_permission_data | pk_permission_data | pk_permission_data | char(20) | √ |
| 2 | operationid | operationid | operationid | varchar2(20) |  |  | '~' |
| 3 | orgid | orgid | orgid | varchar2(20) |  |  | '~' |
| 4 | permissionruleid | permissionruleid | permissionruleid | varchar2(20) |  |  | '~' |
| 5 | resourceid | resourceid | resourceid | varchar2(20) |  |  | '~' |
| 6 | roleid | roleid | roleid | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |