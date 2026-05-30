# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11598.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_message_user | pk_message_user | pk_message_user | char(20) | √ |
| 2 | destination | destination | destination | varchar2(20) |
| 3 | isdelete | isdelete | isdelete | char(1) |
| 4 | isread | isread | isread | char(1) |
| 5 | message_type | message_type | message_type | char(20) | √ |
| 6 | pk_message | pk_message | pk_message | char(20) | √ |
| 7 | pk_user | pk_user | pk_user | char(20) | √ |
| 8 | resendtimes | resendtimes | resendtimes | number(38, 0) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |