# |<<

**班次类别 (bd_shifttype / nc.vo.bd.shift.ShiftTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/966.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_shifttype | 主键 | pk_shifttype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | code | 编码 | code | varchar(80) | √ | 字符串 (String) |
| 5 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | iscapadjust | 生产班次 | iscapadjust | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |