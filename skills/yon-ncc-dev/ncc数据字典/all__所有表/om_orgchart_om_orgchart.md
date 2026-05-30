# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10116.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_om_orgchart | pk_om_orgchart | pk_om_orgchart | char(20) | √ |
| 2 | code | code | code | varchar2(128) | √ |
| 3 | createdate | createdate | createdate | char(19) | √ |
| 4 | name | name | name | varchar2(128) | √ |
| 5 | orgchartobj | orgchartobj | orgchartobj | blob |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | remark | remark | remark | varchar2(512) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |