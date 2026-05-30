# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6866.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datarepair | pk_datarepair | pk_datarepair | char(20) | √ |
| 2 | canrepeat | canrepeat | canrepeat | char(1) |
| 3 | description | description | description | varchar2(200) |
| 4 | executetime | executetime | executetime | char(19) |
| 5 | implclass | implclass | implclass | varchar2(200) | √ |
| 6 | isexecuted | isexecuted | isexecuted | char(1) |
| 7 | pk_user | pk_user | pk_user | char(20) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |