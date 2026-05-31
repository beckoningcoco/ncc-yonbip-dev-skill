# |<<

**班次 (emm_classes / nc.vo.emm.classes.ClassesVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1799.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_classes | 班次主键 | pk_classes | char(20) | √ | 主键 (UFID) |
| 2 | classcode | 班次编码 | classcode | varchar(50) |  | 字符串 (String) |
| 3 | classname | 班次名称 | classname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | starttime | 开始时间 | starttime | char(8) |  | 时间 (UFTime) |
| 5 | endtime | 结束时间 | endtime | char(8) |  | 时间 (UFTime) |
| 6 | enablestate | 应用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |