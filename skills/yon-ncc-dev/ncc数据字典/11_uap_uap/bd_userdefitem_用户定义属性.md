# |<<

**用户定义属性 (bd_userdefitem / nc.vo.bd.userdefrule.UserdefitemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1151.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_userdefitem | 主键 | pk_userdefitem | char(20) | √ | 主键 (UFID) |
| 2 | propindex | 属性序号 | propindex | int |  | 整数 (Integer) |
| 3 | showname | 显示名称 | showname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | classid | 数据类型 | classid | varchar(36) |  | 实体 (entity) |
| 5 | inputlength | 输入长度 | inputlength | int |  | 整数 (Integer) |  | [1 , 101] |
| 6 | digits | 精度 | digits | int |  | 整数 (Integer) |  | [0 , 8] |
| 7 | bodydisptype | 表体显示方式 | bodydisptype | int |  | 表体显示方式 (bodydisptype) |  | 0=显示编码列; |