# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8417.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_extable | pk_extable | pk_extable | char(20) | √ |
| 2 | createtime | createtime | createtime | char(19) |
| 3 | dimvalue | dimvalue | dimvalue | varchar2(60) |
| 4 | extable_pk_pre | extable_pk_pre | extable_pk_pre | char(4) |
| 5 | isolddata | isolddata | isolddata | char(1) |  |  | 'N' |
| 6 | sourcetable | sourcetable | sourcetable | varchar2(60) |
| 7 | splittable | splittable | splittable | varchar2(60) |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |