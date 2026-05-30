# |<<

**条码类型 (bcbd_bartype / nc.vo.bcbd.bartype.BarTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/262.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bartype | 条码类型主键 | pk_bartype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 编号 | code | varchar(50) | √ | 字符串 (String) |
| 5 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | pk_appobj | 条码对象 | pk_appobj | varchar(20) | √ | 条码应用对象 (barappobject) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 1 | 1=未启用; |