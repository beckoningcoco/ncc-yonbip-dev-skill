# |<<

**退货条件 (so_returncndtn / nc.vo.so.mreturncondition.entity.ReturnConditionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5430.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_returncndtn | 退货条件主键 | pk_returncndtn | char(20) | √ | 主键 (UFID) |
| 2 | vconditioncode | 退货条件编码 | vconditioncode | varchar(40) |  | 字符串 (String) |
| 3 | vconditionname | 退货条件名称 | vconditionname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | vexpressname | 退货条件表达式名称 | vexpressname | varchar(50) |  | 字符串 (String) |
| 5 | vexpressdetail | 退货条件说明 | vexpressdetail | varchar(181) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 8 | vexpresscode | 退货条件表达式编码 | vexpresscode | varchar(50) |  | 字符串 (String) |