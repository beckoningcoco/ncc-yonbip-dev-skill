# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6927.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cskubid | cskubid | cskubid | char(20) | √ |
| 2 | cfeatureid | cfeatureid | cfeatureid | varchar2(20) |
| 3 | cskuid | cskuid | cskuid | char(20) | √ |
| 4 | elemtype | elemtype | elemtype | number(38, 0) |
| 5 | elemvalue | elemvalue | elemvalue | varchar2(50) |
| 6 | ncodesize | ncodesize | ncodesize | number(38, 0) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | vrowno | vrowno | vrowno | varchar2(20) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |