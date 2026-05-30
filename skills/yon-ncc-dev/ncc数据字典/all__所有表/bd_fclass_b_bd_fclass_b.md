# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6924.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfeatureclsbid | cfeatureclsbid | cfeatureclsbid | char(20) | √ |
| 2 | brequired | brequired | brequired | char(1) |
| 3 | cchildfclsid | cchildfclsid | cchildfclsid | varchar2(20) |  |  | '~' |
| 4 | cfeatureclsid | cfeatureclsid | cfeatureclsid | char(20) | √ |
| 5 | cfeatureid | cfeatureid | cfeatureid | varchar2(20) |  |  | '~' |
| 6 | fenable | fenable | fenable | number(38, 0) |  |  | 0 |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | vrowno | vrowno | vrowno | varchar2(20) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |