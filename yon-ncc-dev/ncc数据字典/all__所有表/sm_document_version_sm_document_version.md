# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11546.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | pk_version | pk_version | varchar2(50) | √ |
| 2 | createtime | createtime | createtime | char(19) |
| 3 | filelength | filelength | filelength | number(28, 8) |
| 4 | filename | filename | filename | varchar2(100) |
| 5 | pk_file | pk_file | pk_file | varchar2(50) |
| 6 | realpath | realpath | realpath | varchar2(500) |
| 7 | versionno | versionno | versionno | number(38, 0) |
| 8 | creator | creator | creator | varchar2(36) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |