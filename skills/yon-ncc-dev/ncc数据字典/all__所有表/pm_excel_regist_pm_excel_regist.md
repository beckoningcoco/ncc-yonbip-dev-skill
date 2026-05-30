# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10602.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_excel_regist | pk_excel_regist | pk_excel_regist | varchar2(32) | √ |
| 2 | appcode | appcode | appcode | varchar2(20) | √ |
| 3 | bill_type | bill_type | bill_type | varchar2(20) | √ |
| 4 | button_name | button_name | button_name | varchar2(30) |
| 5 | module_name | module_name | module_name | varchar2(10) | √ |
| 6 | pagecode | pagecode | pagecode | varchar2(20) | √ |
| 7 | rightdata | rightdata | rightdata | varchar2(4000) |
| 8 | dr | dr | dr | number(10, 0) | √ |  | 0 |
| 9 | ts | ts | ts | char(20) | √ |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |