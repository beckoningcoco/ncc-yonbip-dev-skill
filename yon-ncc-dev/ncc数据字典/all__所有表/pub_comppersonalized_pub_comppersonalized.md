# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10912.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_comppersonalized | pk_comppersonalized | pk_comppersonalized | char(20) | √ |
| 2 | compalias | compalias | compalias | varchar2(50) |
| 3 | displayableruleresult | displayableruleresult | displayableruleresult | clob |
| 4 | iscard | iscard | iscard | char(1) |
| 5 | isenable | isenable | isenable | char(1) |
| 6 | islist | islist | islist | char(1) |
| 7 | pk_besidcomp | pk_besidcomp | pk_besidcomp | varchar2(20) |  |  | '~' |
| 8 | pk_besidepagecomp | pk_besidepagecomp | pk_besidepagecomp | varchar2(20) |  |  | '~' |
| 9 | priority | priority | priority | number(38, 0) |
| 10 | rule_script | rule_script | rule_script | clob |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |