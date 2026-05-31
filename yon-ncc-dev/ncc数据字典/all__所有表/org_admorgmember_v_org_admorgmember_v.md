# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10151.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_smid | pk_smid | pk_smid | char(20) | √ |
| 2 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | char(20) | √ |
| 5 | pk_orgvid | pk_orgvid | pk_orgvid | char(20) | √ |
| 6 | pk_svid | pk_svid | pk_svid | char(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |